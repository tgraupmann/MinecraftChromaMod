package com.razer.chroma.javachromasdk;

public enum EChromaSDKDevice1DEnum {
    DE_ChromaLink,
    DE_Headset,
    DE_Mousepad;
	
    public static EChromaSDKDevice1DEnum convert(int value) {
        return EChromaSDKDevice1DEnum.values()[value];
    }
}
