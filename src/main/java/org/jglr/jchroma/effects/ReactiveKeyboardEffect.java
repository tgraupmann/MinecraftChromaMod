package org.jglr.jchroma.effects;

import com.sun.jna.Structure;
import org.jglr.jchroma.utils.ColorRef;

import java.util.Arrays;
import java.util.List;

/**
 * Represents the reactive effect: Each key will be lit up for a small duration after being pressed
 */
public class ReactiveKeyboardEffect extends KeyboardEffect {
    private final EffectDuration duration;
    private final ColorRef color;

    public ReactiveKeyboardEffect(EffectDuration duration, ColorRef color) {
        super();
        this.duration = duration;
        this.color = color;
    }

    @Override
    public KeyboardEffectType getType() {
        return KeyboardEffectType.REACTIVE;
    }

    @Override
    public Structure createParameter() {
        ReactiveStructure struct = new ReactiveStructure();
        struct.duration = duration.ordinal();
        struct.color = color.getValue();
        return struct;
    }

    public static class ReactiveStructure extends Structure implements Structure.ByReference {

        public int duration;
        public int color;

        @Override
        protected List<String> getFieldOrder() {
            return Arrays.asList("duration", "color");
        }
    }
}
