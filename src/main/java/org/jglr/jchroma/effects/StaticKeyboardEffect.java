package org.jglr.jchroma.effects;

import com.sun.jna.Structure;
import org.jglr.jchroma.utils.ColorRef;

import java.util.Collections;
import java.util.List;

public class StaticKeyboardEffect extends KeyboardEffect {
    private ColorRef color;

    public StaticKeyboardEffect(ColorRef color) {
        super();
        this.color = color;
    }

    public ColorRef getColor() {
        return color;
    }

    public void setColor(ColorRef color) {
        this.color = color;
    }

    @Override
    public KeyboardEffectType getType() {
        return KeyboardEffectType.STATIC;
    }

    @Override
    public Structure createParameter() {
        return new StaticEffectStructure(color.getValue());
    }

    /**
     * The structure containing the required parameters for the static effect to work
     */
    public static class StaticEffectStructure extends Structure implements Structure.ByReference {

        public int color;

        public StaticEffectStructure(int color) {
            this.color = color;
        }

        @Override
        protected List<String> getFieldOrder() {
            return Collections.singletonList("color");
        }
    }

}
