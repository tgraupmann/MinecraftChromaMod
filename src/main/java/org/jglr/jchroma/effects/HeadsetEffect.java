package org.jglr.jchroma.effects;

import com.sun.jna.Structure;

/**
 * Represents a headset effect
 */
public abstract class HeadsetEffect {

    public abstract HeadsetEffectType getType();

    /**
     * Creates the required parameters for ChromaSDK in order to use the effect
     * @return
     *          A new structure containing the required data for ChromaSDK
     */
    public abstract Structure createParameter();
}
