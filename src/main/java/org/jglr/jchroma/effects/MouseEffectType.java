package org.jglr.jchroma.effects;

/**
 * Enum containing the different available types
 */
public enum MouseEffectType {
    NONE,            //!< No effect.
    BLINKING,            //!< Blinking effect (This effect has deprecated and should not be used).
    BREATHING,           //!< Breathing effect (This effect has deprecated and should not be used).
    CUSTOM,              //!< Custom effect (old definition to maintain backward compatibility).
    REACTIVE,            //!< Reactive effect (This effect has deprecated and should not be used).
    SPECTRUMCYCLING,     //!< Spectrum cycling effect (This effect has deprecated and should not be used).
    STATIC,              //!< Static effect.
    WAVE,                //!< Wave effect (This effect has deprecated and should not be used).
    CUSTOM2,             //!< Custom effects using a virtual grid.
    INVALID
}
