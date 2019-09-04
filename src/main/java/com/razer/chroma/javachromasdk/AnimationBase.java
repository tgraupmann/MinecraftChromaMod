package com.razer.chroma.javachromasdk;

import org.jglr.jchroma.JChroma;

public abstract class AnimationBase {
    public abstract EChromaSDKDeviceTypeEnum getDeviceType();
    public abstract int getFrameCount();
    public abstract float getDuration(int frameId);
    public abstract void showFrame(JChroma chroma, int frameId);
}
