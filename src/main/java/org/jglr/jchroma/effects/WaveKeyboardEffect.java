package org.jglr.jchroma.effects;

import com.sun.jna.Structure;

import java.util.Collections;
import java.util.List;

/**
 * Represents the wave keyboard effect: 'a rainbow wave colors the keyboard'. There are two directions for this wave: left or right
 */
public class WaveKeyboardEffect extends KeyboardEffect {
    private WaveDirection direction;

    /**
     * Creates a new effect with the given direction
     * @param direction
     *          The wave direction
     */
    public WaveKeyboardEffect(WaveDirection direction) {
        super();
        this.direction = direction;
    }

    public WaveDirection getDirection() {
        return direction;
    }

    public void setDirection(WaveDirection direction) {
        this.direction = direction;
    }

    @Override
    public KeyboardEffectType getType() {
        return KeyboardEffectType.WAVE;
    }

    @Override
    public Structure createParameter() {
        return new WaveEffectStructure(direction.ordinal());
    }

    /**
     * The structure containing the required parameters for the wave effect to work
     */
    public static class WaveEffectStructure extends Structure implements Structure.ByReference {

        public int direction;

        public WaveEffectStructure(int direction) {
            this.direction = direction;
        }

        @Override
        protected List<String> getFieldOrder() {
            return Collections.singletonList("direction");
        }
    }
}
