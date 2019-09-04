package org.jglr.jchroma.effects;

import com.sun.jna.Structure;
import org.jglr.jchroma.utils.ColorRef;
import org.jglr.jchroma.utils.KeyboardKeys;

import java.util.Collections;
import java.util.List;

/**
 * Custom effect, individually sets each color for each key
 */
public class CustomKeyboardEffect extends KeyboardEffect implements ChromaEffect2D {
    public static final int ROW_COUNT = 6;
    public static final int COLUMN_COUNT = 22;
    private final CustomStructure struct;

    /**
     * Creates a custom keyboard effect with colors filled with <code>ColorRef.NULL</code>. One should rewrite the value of the array instead of using ColorRef::setRed (or equivalent)
     */
    public CustomKeyboardEffect() {
        this(createEmptyArray());
    }

    private static ColorRef[][] createEmptyArray() {
        ColorRef[][] arr = new ColorRef[ROW_COUNT][COLUMN_COUNT];
        for (int i = 0; i < ROW_COUNT; i++) {
            for (int j = 0; j < COLUMN_COUNT; j++) {
                arr[i][j] = ColorRef.NULL;
            }
        }
        return arr;
    }

    /**
     * Creates a custom keyboard effect with already assigned colors
     * @param colors
     *      The colors to assign to each key (in row/column order)
     */
    public CustomKeyboardEffect(ColorRef[][] colors) {
        super();
        if(colors.length != ROW_COUNT) {
            throw new IllegalStateException("Colors array must be a "+ ROW_COUNT +"x"+COLUMN_COUNT+" (row, column) 2D ColorRef array");
        }
        for (int i = 0; i < ROW_COUNT; i++) {
            ColorRef[] row = colors[i];
            if(row == null || row.length != COLUMN_COUNT)
                throw new IllegalStateException("Colors array must be a "+ ROW_COUNT +"x"+COLUMN_COUNT+" (row, column) 2D ColorRef array");
        }

        struct = new CustomStructure();

        setColors(colors);
    }

    @Override
    public KeyboardEffectType getType() {
        return KeyboardEffectType.CUSTOM;
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
    public void setColors(ColorRef[][] colors) {
        for (int j = 0; j < COLUMN_COUNT; j++) {
            for (int i = 0; i < ROW_COUNT; i++) {
                setColor(i, j, colors[i][j]);
            }
        }
    }

    /**
     * Sets a single key color
     * @param row
     *          The key row
     * @param column
     *          The key column
     * @param color
     *          The color to assign
     */
    public void setColor(int row, int column, ColorRef color) {
        struct.colors[column+row*COLUMN_COUNT] = color.getValue();
    }

    public void setKeyColor(int key, ColorRef color) {
        setColor(KeyboardKeys.getRow(key), KeyboardKeys.getColumn(key), color);
    }

    public void fill(ColorRef color) {
        for (int j = 0; j < COLUMN_COUNT; j++) {
            for (int i = 0; i < ROW_COUNT; i++) {
                setColor(i, j, color);
            }
        }
    }

    public CustomKeyboardEffect combine(CustomKeyboardEffect other) {
        return new CombinedCustomKeyboardEffect(this, other);
    }

    public ColorRef getColor(int row, int column) {
        return ColorRef.fromBGR(struct.colors[column+row*COLUMN_COUNT]);
    }

    public static class CustomStructure extends Structure implements Structure.ByReference {

        public int[] colors = new int[ROW_COUNT*COLUMN_COUNT];

        @Override
        protected List<String> getFieldOrder() {
            return Collections.singletonList("colors");
        }
    }
}
