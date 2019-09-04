package org.jglr.jchroma.effects;

import com.sun.jna.Structure;

import org.jglr.jchroma.utils.ColorRef;

import java.util.Collections;
import java.util.List;

/**
 * Custom effect, individually sets each color for each key
 */
public class CustomHeadset extends MousepadEffect implements ChromaEffect1D {
    public static final int MAX_LEDS = 5;
    private final CustomStructure struct;

    /**
     * Creates a custom mousepad effect with colors filled with <code>ColorRef.NULL</code>. One should rewrite the value of the array instead of using ColorRef::setRed (or equivalent)
     */
    public CustomHeadset() {
        this(createEmptyArray());
    }

    private static ColorRef[] createEmptyArray() {
        ColorRef[] arr = new ColorRef[MAX_LEDS];
        for (int i = 0; i < MAX_LEDS; i++) {
            arr[i] = ColorRef.NULL;
        }
        return arr;
    }

    /**
     * Creates a custom mousepad effect with already assigned colors
     * @param colors
     *      The colors to assign to each key (in row/column order)
     */
    public CustomHeadset(ColorRef[] colors) {
        super();
        if(colors.length != MAX_LEDS) {
            throw new IllegalStateException("Colors array must be a "+ MAX_LEDS +" ColorRef array");
        }

        struct = new CustomStructure();

        setColors(colors);
    }

    @Override
    public MousepadEffectType getType() {
        return MousepadEffectType.CUSTOM;
    }

    @Override
    public Structure createParameter() {
        return struct;
    }

    /**
     * Assign a color to each key
     * @param colors
     *          The colors to assign (row/column)
     */
    public void setColors(ColorRef[] colors) {
        for (int i = 0; i < MAX_LEDS; i++) {
            setColor(i, colors[i]);
        }
    }

    /**
     * Sets a single key color
     * @param led
     *          The led
     * @param color
     *          The color to assign
     */
    public void setColor(int led, ColorRef color) {
        struct.colors[led] = color.getValue();
    }

    public void fill(ColorRef color) {
        for (int i = 0; i < MAX_LEDS; i++) {
            setColor(i, color);
        }
    }

    public ColorRef getColor(int led) {
        return ColorRef.fromBGR(struct.colors[led]);
    }

    public static class CustomStructure extends Structure implements Structure.ByReference {

        public int[] colors = new int[MAX_LEDS];

        @Override
        protected List<String> getFieldOrder() {
            return Collections.singletonList("colors");
        }
    }
}
