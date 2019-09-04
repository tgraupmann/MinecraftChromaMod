package com.razer.chroma.javachromasdk;

public class FChromaSDKColorFrame1D {
    public void setDuration(float duration) {
        mDuration = Math.max(0.033f, duration);
    }
    public float getDuration() {
        return mDuration;
    }
    public void setColors(int[] colors) {
        mColors = colors;
    }
    public int[] getColors() {
        return mColors;
    }
    private float mDuration = 0.033f;
    private int[] mColors = null;
}
