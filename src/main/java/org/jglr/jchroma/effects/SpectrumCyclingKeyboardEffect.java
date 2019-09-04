package org.jglr.jchroma.effects;

import com.sun.jna.Structure;

/**
 * Cycles through the color spectrum of ChromaSDK
 */
public class SpectrumCyclingKeyboardEffect extends KeyboardEffect {
    @Override
    public KeyboardEffectType getType() {
        return KeyboardEffectType.SPECTRUMCYCLING;
    }

    @Override
    public Structure createParameter() {
        return null;
    }
}
