package org.jglr.jchroma.effects;

import org.jglr.jchroma.utils.ColorRef;
import org.jglr.jchroma.utils.KeyboardKeys;

public class ProgressKeyboardEffect extends CustomKeyboardEffect {

    private final int[] keys;
    private int currentValue;
    private ColorRef inRangeColor;
    private ColorRef outsideRangeColor;
    private int minimumValue;
    private int maximumValue;
    private int[] modelToView;

    public ProgressKeyboardEffect(int from, int to) {
        this(createFromToArray(from, to));
    }

    private static int[] createFromToArray(int from, int to) {
        int[] result = new int[to-from +1];
        for (int i = 0; i < result.length; i++) {
            result[i] = from + i;
        }
        return result;
    }

    /**
     * Creates a progress effect
     * @param keys
     *      The keys to show the progress on, sorted from lowest value key to highest
     *
     */
    public ProgressKeyboardEffect(int[] keys) {
        super();
        this.keys = keys;
        modelToView = createFromToArray(0, keys.length);
        minimumValue = 0;
        maximumValue = keys.length;
        inRangeColor = new ColorRef(255, 255, 255);
        outsideRangeColor = new ColorRef(0, 0, 0);
        setCurrentValue(maximumValue);
    }

    public ColorRef getOutsideRangeColor() {
        return outsideRangeColor;
    }

    public void setOutsideRangeColor(ColorRef outsideRangeColor) {
        this.outsideRangeColor = outsideRangeColor;
    }

    public ColorRef getInRangeColor() {
        return inRangeColor;
    }

    public void setInRangeColor(ColorRef inRangeColor) {
        this.inRangeColor = inRangeColor;
    }

    public int getMinimumValue() {
        return minimumValue;
    }

    public void setMinimumValue(int minimumValue) {
        this.minimumValue = minimumValue;
        updateModelToView();
    }

    private void updateModelToView() {
        modelToView = new int[maximumValue-minimumValue+1];
        float scale = (float)keys.length / modelToView.length;
        for (int i = 0; i < modelToView.length; i++) {
            modelToView[i] = (int) (scale * i);
        }
    }

    public int getMaximumValue() {
        return maximumValue;
    }

    public void setMaximumValue(int maximumValue) {
        this.maximumValue = maximumValue;
        updateModelToView();
    }

    public int getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(int currentValue) {
        if(currentValue < minimumValue) {
            currentValue = minimumValue;
        }
        if(currentValue > maximumValue) {
            currentValue = maximumValue;
        }
        this.currentValue = currentValue;

        // update the color array
        for (int i = minimumValue; i < maximumValue; i++) {
            int index = modelToView[i-minimumValue];
            int key = keys[index];
            int row = KeyboardKeys.getRow(key);
            int column = KeyboardKeys.getColumn(key);

            if(i <= currentValue)
                setColor(row, column, inRangeColor);
            else
                setColor(row, column, outsideRangeColor);
        }
    }
}
