package org.jglr.jchroma.effects;

import com.sun.jna.Structure;

/**
 * Represents a mousepad effect
 */
public abstract class MousepadEffect {

    public abstract MousepadEffectType getType();

    /**
     * Creates the required parameters for ChromaSDK in order to use the effect
     * @return
     *          A new structure containing the required data for ChromaSDK
     */
    public abstract Structure createParameter();
}
