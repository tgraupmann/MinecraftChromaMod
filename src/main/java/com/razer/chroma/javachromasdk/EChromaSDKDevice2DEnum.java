package com.razer.chroma.javachromasdk;

public enum EChromaSDKDevice2DEnum {
    DE_Keyboard,
    DE_Keypad,
    DE_Mouse;
    public static EChromaSDKDevice2DEnum convert(int value) {
        return EChromaSDKDevice2DEnum.values()[value];
    }
}
