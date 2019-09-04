package com.razer.chroma.javachromasdk;

public enum EChromaSDKDeviceTypeEnum {
    DE_1D,
    DE_2D;

    public static EChromaSDKDeviceTypeEnum convert(int value) {
        return EChromaSDKDeviceTypeEnum.values()[value];
    }
}
