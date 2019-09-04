package org.jglr.jchroma.effects;

import com.sun.jna.Structure;
import org.jglr.jchroma.utils.ColorRef;

import java.util.Arrays;
import java.util.List;

/**
 * "Breathes" colors: Gradually lights up the device with the first color and gradually changes to the second color.
 */
public class BreathingKeyboardEffect extends KeyboardEffect {

    private BreathingType breathingType;
    private ColorRef firstColor;
    private ColorRef secondColor;

    /**
     * Creates a new breathing effect with the given parameters
     * @param breathingType
     *          The breathing type
     * @param firstColor
     *          The first color to use - ColorRef.NULL is valid is the type is set to Random
     * @param secondColor
     *          The second color to use - ColorRef.NULL is valid is the type is set to Random
     */
    public BreathingKeyboardEffect(BreathingType breathingType, ColorRef firstColor, ColorRef secondColor) {
        this.breathingType = breathingType;
        this.firstColor = firstColor;
        this.secondColor = secondColor;
    }

    public BreathingType getBreathingType() {
        return breathingType;
    }

    public void setType(BreathingType type) {
        this.breathingType = type;
    }

    public ColorRef getFirstColor() {
        return firstColor;
    }

    public void setFirstColor(ColorRef firstColor) {
        this.firstColor = firstColor;
    }

    public ColorRef getSecondColor() {
        return secondColor;
    }

    public void setSecondColor(ColorRef secondColor) {
        this.secondColor = secondColor;
    }

    @Override
    public KeyboardEffectType getType() {
        return KeyboardEffectType.BREATHING;
    }

    @Override
    public Structure createParameter() {
        BreathingStructure struct = new BreathingStructure();
        struct.color1 = firstColor.getValue();
        struct.color2 = firstColor.getValue();
        struct.type = breathingType.ordinal()+1; // +1 as the BREATHING_EFFECT_TYPE::Type enum starts at 1
        return struct;
    }

    public static class BreathingStructure extends Structure implements Structure.ByReference {

        public int color1;
        public int color2;
        public int type;

        @Override
        protected List<String> getFieldOrder() {
            return Arrays.asList("type", "color1", "color2");
        }
    }
}
