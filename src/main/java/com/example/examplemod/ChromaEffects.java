package com.example.examplemod;

import com.razer.java.JChromaSDK;

public class ChromaEffects {
    private static JChromaSDK sChromaAnimationAPI;

    private String getAnimationPath() {
        String cd = System.getProperty("user.dir");
        //System.out.println("********* getAnimationPath: cd="+cd);
        String path = cd + "\\..\\src\\main\\resources\\Animations\\";
        //System.out.println("********* getAnimationPath: path="+path);
        return path;
    }

    void showEffect1()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_Keyboard.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int ground = sChromaAnimationAPI.getRGB(150, 100, 60);
        sChromaAnimationAPI.fillZeroColorAllFramesName(baseLayer, ground);
        sChromaAnimationAPI.setChromaCustomFlagName(baseLayer, true);
        sChromaAnimationAPI.setChromaCustomColorAllFramesName(baseLayer);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect1ChromaLink()
    {
        String baseLayer = getAnimationPath() + "Animations/BlackAndWhiteRainbow_ChromaLink.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int color1 = sChromaAnimationAPI.getRGB(150, 100, 60);
        int color2 = sChromaAnimationAPI.getRGB(0, 0, 0);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect1Headset()
    {
        String baseLayer = getAnimationPath() + "Animations/BlackAndWhiteRainbow_Headset.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int color1 = sChromaAnimationAPI.getRGB(150, 100, 60);
        int color2 = sChromaAnimationAPI.getRGB(0, 0, 0);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect1Mousepad()
    {
        String baseLayer = getAnimationPath() + "Animations/BlackAndWhiteRainbow_Mousepad.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int color1 = sChromaAnimationAPI.getRGB(150, 100, 60);
        int color2 = sChromaAnimationAPI.getRGB(0, 0, 0);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect1Mouse()
    {
        String baseLayer = getAnimationPath() + "Animations/BlackAndWhiteRainbow_Mouse.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int color1 = sChromaAnimationAPI.getRGB(150, 100, 60);
        int color2 = sChromaAnimationAPI.getRGB(0, 0, 0);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect2()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_Keyboard.chroma";
        String layer2 = getAnimationPath() + "Animations/Block4_Keyboard.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.closeAnimationName(layer2);
        sChromaAnimationAPI.getAnimation(baseLayer);
        sChromaAnimationAPI.getAnimation(layer2);
        int frameCount = sChromaAnimationAPI.getFrameCountName(layer2);
        sChromaAnimationAPI.makeBlankFramesName(baseLayer, frameCount, 0.1f, 0);
        sChromaAnimationAPI.copyNonZeroAllKeysAllFramesName(layer2, baseLayer);
        sChromaAnimationAPI.reverseAllFramesName(layer2);
        sChromaAnimationAPI.addNonZeroAllKeysAllFramesName(layer2, baseLayer);
        sChromaAnimationAPI.trimEndFramesName(baseLayer, 9);
        sChromaAnimationAPI.insertDelayName(baseLayer, 8, 10);
        sChromaAnimationAPI.fadeEndFramesName(baseLayer, 5);
        int color1 = sChromaAnimationAPI.getRGB(60, 40, 20);
        int color2 = sChromaAnimationAPI.getRGB(170, 102, 15);
        sChromaAnimationAPI.multiplyNonZeroTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.fillZeroColorAllFramesRGBName(baseLayer, 0, 48, 0);
        sChromaAnimationAPI.setChromaCustomFlagName(baseLayer, true);
        sChromaAnimationAPI.setChromaCustomColorAllFramesName(baseLayer);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect2ChromaLink()
    {
        String baseLayer = getAnimationPath() + "Animations/BlackAndWhiteRainbow_ChromaLink.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int color1 = sChromaAnimationAPI.getRGB(60, 40, 20);
        int color2 = sChromaAnimationAPI.getRGB(170, 102, 15);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect2Headset()
    {
        String baseLayer = getAnimationPath() + "Animations/BlackAndWhiteRainbow_Headset.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int color1 = sChromaAnimationAPI.getRGB(60, 40, 20);
        int color2 = sChromaAnimationAPI.getRGB(170, 102, 15);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect2Mousepad()
    {
        String baseLayer = getAnimationPath() + "Animations/BlackAndWhiteRainbow_Mousepad.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int color1 = sChromaAnimationAPI.getRGB(60, 40, 20);
        int color2 = sChromaAnimationAPI.getRGB(170, 102, 15);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect2Mouse()
    {
        String baseLayer = getAnimationPath() + "Animations/BlackAndWhiteRainbow_Mouse.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int color1 = sChromaAnimationAPI.getRGB(60, 40, 20);
        int color2 = sChromaAnimationAPI.getRGB(170, 102, 15);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect3()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_Keyboard.chroma";
        String layer2 = getAnimationPath() + "Animations/Sword1_Keyboard.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.closeAnimationName(layer2);
        sChromaAnimationAPI.getAnimation(baseLayer);
        sChromaAnimationAPI.getAnimation(layer2);
        sChromaAnimationAPI.reduceFramesName(layer2, 2);
        sChromaAnimationAPI.multiplyIntensityAllFramesRGBName(layer2, 200, 170, 136);
        sChromaAnimationAPI.fillThresholdColorsAllFramesRGBName(layer2, 100, 255, 255, 255);
        int frameId = 17;
        sChromaAnimationAPI.trimEndFramesName(layer2, frameId);
        int delay = 2;
        sChromaAnimationAPI.insertDelayName(layer2, frameId, delay);
        sChromaAnimationAPI.duplicateMirrorFramesName(layer2);
        int frameCount = sChromaAnimationAPI.getFrameCountName(layer2);
        sChromaAnimationAPI.makeBlankFramesName(baseLayer, frameCount, 0.1f, 0);
        sChromaAnimationAPI.fillZeroColorAllFramesRGBName(baseLayer, 32, 32, 32); //background
        sChromaAnimationAPI.copyNonZeroAllKeysAllFramesOffsetName(layer2, baseLayer, 0);
        sChromaAnimationAPI.setChromaCustomFlagName(baseLayer, true);
        sChromaAnimationAPI.setChromaCustomColorAllFramesName(baseLayer);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect3ChromaLink()
    {
        String baseLayer = getAnimationPath() + "Animations/BlackAndWhiteRainbow_ChromaLink.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int color1 = sChromaAnimationAPI.getRGB(255, 255, 245);
        int color2 = sChromaAnimationAPI.getRGB(127, 127, 127);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect3Headset()
    {
        String baseLayer = getAnimationPath() + "Animations/BlackAndWhiteRainbow_Headset.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int color1 = sChromaAnimationAPI.getRGB(255, 255, 245);
        int color2 = sChromaAnimationAPI.getRGB(127, 127, 127);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect3Mousepad()
    {
        String baseLayer = getAnimationPath() + "Animations/BlackAndWhiteRainbow_Mousepad.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int color1 = sChromaAnimationAPI.getRGB(255, 255, 245);
        int color2 = sChromaAnimationAPI.getRGB(127, 127, 127);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect3Mouse()
    {
        String baseLayer = getAnimationPath() + "Animations/BlackAndWhiteRainbow_Mouse.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int color1 = sChromaAnimationAPI.getRGB(255, 255, 245);
        int color2 = sChromaAnimationAPI.getRGB(127, 127, 127);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect4()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_Keyboard.chroma";
        String layer2 = getAnimationPath() + "Animations/Block3_Keyboard.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.closeAnimationName(layer2);
        sChromaAnimationAPI.getAnimation(baseLayer);
        sChromaAnimationAPI.getAnimation(layer2);
        int frameId = 8;
        int delay = 30;
        for (int i = 0; i < delay; ++i) {
            sChromaAnimationAPI.insertFrameName(layer2, frameId, frameId);
        }
        sChromaAnimationAPI.multiplyIntensityAllFramesRGBName(layer2, 284, 206, 144);
        int frameCount = sChromaAnimationAPI.getFrameCountName(layer2);
        sChromaAnimationAPI.makeBlankFramesName(baseLayer, frameCount, 0.1f, 0);
        sChromaAnimationAPI.fillZeroColorAllFramesRGBName(baseLayer, 60, 40, 20);
        sChromaAnimationAPI.copyNonZeroAllKeysAllFramesOffsetName(layer2, baseLayer, 0);
        sChromaAnimationAPI.setChromaCustomFlagName(baseLayer, true);
        sChromaAnimationAPI.setChromaCustomColorAllFramesName(baseLayer);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect4ChromaLink()
    {
        String baseLayer = getAnimationPath() + "Animations/BlackAndWhiteRainbow_ChromaLink.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        sChromaAnimationAPI.reverseAllFramesName(baseLayer);
        int color1 = sChromaAnimationAPI.getRGB(255, 0, 0);
        int color2 = sChromaAnimationAPI.getRGB(0, 45, 45);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect4Headset()
    {
        String baseLayer = getAnimationPath() + "Animations/BlackAndWhiteRainbow_Headset.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        sChromaAnimationAPI.reverseAllFramesName(baseLayer);
        int color1 = sChromaAnimationAPI.getRGB(255, 0, 0);
        int color2 = sChromaAnimationAPI.getRGB(0, 45, 45);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect4Mousepad()
    {
        String baseLayer = getAnimationPath() + "Animations/BlackAndWhiteRainbow_Mousepad.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        sChromaAnimationAPI.reverseAllFramesName(baseLayer);
        int color1 = sChromaAnimationAPI.getRGB(255, 0, 0);
        int color2 = sChromaAnimationAPI.getRGB(0, 45, 45);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect4Mouse()
    {
        String baseLayer = getAnimationPath() + "Animations/BlackAndWhiteRainbow_Mouse.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        sChromaAnimationAPI.reverseAllFramesName(baseLayer);
        int color1 = sChromaAnimationAPI.getRGB(255, 0, 0);
        int color2 = sChromaAnimationAPI.getRGB(0, 45, 45);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect5()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_Keyboard.chroma";
        String layer2 = getAnimationPath() + "Animations/Bow1_Keyboard.chroma";
        String layer3 = getAnimationPath() + "Animations/Fireball1_Keyboard.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.closeAnimationName(layer2);
        sChromaAnimationAPI.closeAnimationName(layer3);
        sChromaAnimationAPI.getAnimation(baseLayer);
        sChromaAnimationAPI.getAnimation(layer2);
        sChromaAnimationAPI.getAnimation(layer3);
        int frameId = 7;
        int delay = 30;
        for (int i = 0; i < delay; ++i) {
            sChromaAnimationAPI.insertFrameName(layer3, frameId, frameId);
        }
        int frameCount = sChromaAnimationAPI.getFrameCountName(layer3);
        sChromaAnimationAPI.makeBlankFramesName(baseLayer, frameCount, 0.1f, 0);
        sChromaAnimationAPI.duplicateFirstFrameName(layer2, frameCount);
        sChromaAnimationAPI.multiplyIntensityAllFramesRGBName(layer2, 140, 120, 200);
        sChromaAnimationAPI.fillThresholdColorsAllFramesRGBName(layer2, 100, 130, 47, 99);
        sChromaAnimationAPI.copyNonZeroAllKeysAllFramesOffsetName(layer2, baseLayer, 0); //bow
        sChromaAnimationAPI.multiplyIntensityAllFramesRGBName(layer3, 160, 120, 90);
        sChromaAnimationAPI.fillThresholdColorsAllFramesName(layer3, 50, 0);
        sChromaAnimationAPI.copyNonZeroAllKeysAllFramesOffsetName(layer3, baseLayer, 0); //arrow
        sChromaAnimationAPI.fillZeroColorAllFramesRGBName(baseLayer, 60, 40, 20); //background
        sChromaAnimationAPI.setChromaCustomFlagName(baseLayer, true);
        sChromaAnimationAPI.setChromaCustomColorAllFramesName(baseLayer);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect5ChromaLink()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_ChromaLink.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int frameCount = 50;
        sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.1f, 255, 255, 255);
        sChromaAnimationAPI.fadeStartFramesName(baseLayer, frameCount / 2);
        sChromaAnimationAPI.fadeEndFramesName(baseLayer, frameCount / 2);
        int color1 = sChromaAnimationAPI.getRGB(34, 102, 34);
        int color2 = sChromaAnimationAPI.getRGB(153, 105, 46);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect5Headset()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_Headset.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int frameCount = 50;
        sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.1f, 255, 255, 255);
        sChromaAnimationAPI.fadeStartFramesName(baseLayer, frameCount / 2);
        sChromaAnimationAPI.fadeEndFramesName(baseLayer, frameCount / 2);
        int color1 = sChromaAnimationAPI.getRGB(34, 102, 34);
        int color2 = sChromaAnimationAPI.getRGB(153, 105, 46);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect5Mousepad()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_Mousepad.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int frameCount = 50;
        sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.1f, 255, 255, 255);
        sChromaAnimationAPI.fadeStartFramesName(baseLayer, frameCount / 2);
        sChromaAnimationAPI.fadeEndFramesName(baseLayer, frameCount / 2);
        int color1 = sChromaAnimationAPI.getRGB(34, 102, 34);
        int color2 = sChromaAnimationAPI.getRGB(153, 105, 46);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect5Mouse()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_Mouse.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int frameCount = 50;
        sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.1f, 255, 255, 255);
        sChromaAnimationAPI.fadeStartFramesName(baseLayer, frameCount / 2);
        sChromaAnimationAPI.fadeEndFramesName(baseLayer, frameCount / 2);
        int color1 = sChromaAnimationAPI.getRGB(34, 102, 34);
        int color2 = sChromaAnimationAPI.getRGB(153, 105, 46);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect6()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_Keyboard.chroma";
        String layer2 = getAnimationPath() + "Animations/Train1_Keyboard.chroma";
        String layer3 = getAnimationPath() + "Animations/Train2_Keyboard.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.closeAnimationName(layer2);
        sChromaAnimationAPI.closeAnimationName(layer3);
        sChromaAnimationAPI.getAnimation(baseLayer);
        sChromaAnimationAPI.getAnimation(layer2);
        sChromaAnimationAPI.getAnimation(layer3);
        int frameCount = sChromaAnimationAPI.getFrameCountName(layer2);
        sChromaAnimationAPI.makeBlankFramesName(baseLayer, frameCount, 0.1f, 0);
        sChromaAnimationAPI.multiplyIntensityAllFramesRGBName(layer2, 162, 129, 81);
        sChromaAnimationAPI.copyNonZeroAllKeysAllFramesOffsetName(layer2, baseLayer, 0);
        sChromaAnimationAPI.multiplyIntensityAllFramesRGBName(layer3, 127, 0, 0);
        sChromaAnimationAPI.addNonZeroAllKeysAllFramesOffsetName(layer3, baseLayer, 7);
        sChromaAnimationAPI.fillZeroColorAllFramesRGBName(baseLayer, 60, 40, 20); //background
        sChromaAnimationAPI.setChromaCustomFlagName(baseLayer, true);
        sChromaAnimationAPI.setChromaCustomColorAllFramesName(baseLayer);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect6ChromaLink()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_ChromaLink.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int frameCount = 50;
        sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.1f, 255, 255, 255);
        sChromaAnimationAPI.fadeStartFramesName(baseLayer, frameCount / 2);
        sChromaAnimationAPI.fadeEndFramesName(baseLayer, frameCount / 2);
        int color1 = sChromaAnimationAPI.getRGB(54, 54, 5);
        int color2 = sChromaAnimationAPI.getRGB(255, 69, 0);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect6Headset()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_Headset.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int frameCount = 50;
        sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.1f, 255, 255, 255);
        sChromaAnimationAPI.fadeStartFramesName(baseLayer, frameCount / 2);
        sChromaAnimationAPI.fadeEndFramesName(baseLayer, frameCount / 2);
        int color1 = sChromaAnimationAPI.getRGB(54, 54, 5);
        int color2 = sChromaAnimationAPI.getRGB(255, 69, 0);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect6Mousepad()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_Mousepad.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int frameCount = 50;
        sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.1f, 255, 255, 255);
        sChromaAnimationAPI.fadeStartFramesName(baseLayer, frameCount / 2);
        sChromaAnimationAPI.fadeEndFramesName(baseLayer, frameCount / 2);
        int color1 = sChromaAnimationAPI.getRGB(54, 54, 5);
        int color2 = sChromaAnimationAPI.getRGB(255, 69, 0);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect6Mouse()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_Mouse.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int frameCount = 50;
        sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.1f, 255, 255, 255);
        sChromaAnimationAPI.fadeStartFramesName(baseLayer, frameCount / 2);
        sChromaAnimationAPI.fadeEndFramesName(baseLayer, frameCount / 2);
        int color1 = sChromaAnimationAPI.getRGB(54, 54, 5);
        int color2 = sChromaAnimationAPI.getRGB(255, 69, 0);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect7()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_Keyboard.chroma";
        String layer2 = getAnimationPath() + "Animations/Block3_Keyboard.chroma";
        String layer3 = getAnimationPath() + "Animations/Reticle1_Keyboard.chroma";
        String layer4 = getAnimationPath() + "Animations/Reticle2_Keyboard.chroma";
        String layer5 = getAnimationPath() + "Animations/Reticle3_Keyboard.chroma";
        String layer6 = getAnimationPath() + "Animations/Reticle4_Keyboard.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.closeAnimationName(layer2);
        sChromaAnimationAPI.closeAnimationName(layer3);
        sChromaAnimationAPI.closeAnimationName(layer4);
        sChromaAnimationAPI.closeAnimationName(layer5);
        sChromaAnimationAPI.closeAnimationName(layer6);
        sChromaAnimationAPI.getAnimation(baseLayer);
        sChromaAnimationAPI.getAnimation(layer2);
        sChromaAnimationAPI.getAnimation(layer3);
        sChromaAnimationAPI.getAnimation(layer4);
        sChromaAnimationAPI.getAnimation(layer5);
        sChromaAnimationAPI.getAnimation(layer6);
        int frameId = 8;
        int delay = 30;
        sChromaAnimationAPI.insertDelayName(layer2, frameId, delay);
        sChromaAnimationAPI.multiplyIntensityAllFramesRGBName(layer2, 284, 206, 144);
        int frameCount = sChromaAnimationAPI.getFrameCountName(layer2);
        sChromaAnimationAPI.makeBlankFramesName(baseLayer, frameCount, 0.1f, 0);
        sChromaAnimationAPI.fillZeroColorAllFramesRGBName(baseLayer, 60, 40, 20);
        sChromaAnimationAPI.copyNonZeroAllKeysAllFramesOffsetName(layer2, baseLayer, 0);
        sChromaAnimationAPI.copyNonZeroAllKeysAllFramesOffsetName(layer3, baseLayer, 0);
        sChromaAnimationAPI.copyNonZeroAllKeysAllFramesOffsetName(layer4, baseLayer, 0);
        sChromaAnimationAPI.copyNonZeroAllKeysAllFramesOffsetName(layer5, baseLayer, 0);
        sChromaAnimationAPI.copyNonZeroAllKeysAllFramesOffsetName(layer6, baseLayer, 0);
        sChromaAnimationAPI.setChromaCustomFlagName(baseLayer, true);
        sChromaAnimationAPI.setChromaCustomColorAllFramesName(baseLayer);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.setChromaCustomFlagName(baseLayer, true);
        sChromaAnimationAPI.setChromaCustomColorAllFramesName(baseLayer);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect7ChromaLink()
    {
        String baseLayer = getAnimationPath() + "Animations/BlackAndWhiteRainbow_ChromaLink.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int color1 = sChromaAnimationAPI.getRGB(0, 45, 45);
        int color2 = sChromaAnimationAPI.getRGB(249, 194, 126);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect7Headset()
    {
        String baseLayer = getAnimationPath() + "Animations/BlackAndWhiteRainbow_Headset.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int color1 = sChromaAnimationAPI.getRGB(0, 45, 45);
        int color2 = sChromaAnimationAPI.getRGB(249, 194, 126);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect7Mousepad()
    {
        String baseLayer = getAnimationPath() + "Animations/BlackAndWhiteRainbow_Mousepad.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int color1 = sChromaAnimationAPI.getRGB(0, 45, 45);
        int color2 = sChromaAnimationAPI.getRGB(249, 194, 126);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect7Mouse()
    {
        String baseLayer = getAnimationPath() + "Animations/BlackAndWhiteRainbow_Mouse.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int color1 = sChromaAnimationAPI.getRGB(0, 45, 45);
        int color2 = sChromaAnimationAPI.getRGB(249, 194, 126);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect8()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_Keyboard.chroma";
        String layer2 = getAnimationPath() + "Animations/Block3_Keyboard.chroma";
        String layer3 = getAnimationPath() + "Animations/UpParticle1_Keyboard.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.closeAnimationName(layer2);
        sChromaAnimationAPI.closeAnimationName(layer3);
        sChromaAnimationAPI.getAnimation(baseLayer);
        sChromaAnimationAPI.getAnimation(layer2);
        sChromaAnimationAPI.getAnimation(layer3);
        int frameId = 8;
        int delay = 30;
        sChromaAnimationAPI.insertDelayName(layer2, frameId, delay);
        sChromaAnimationAPI.multiplyIntensityAllFramesRGBName(layer2, 284, 206, 144);
        int frameCount = sChromaAnimationAPI.getFrameCountName(layer2);
        sChromaAnimationAPI.makeBlankFramesName(baseLayer, frameCount, 0.1f, 0);
        sChromaAnimationAPI.fillZeroColorAllFramesRGBName(baseLayer, 60, 40, 20);
        sChromaAnimationAPI.copyNonZeroAllKeysAllFramesOffsetName(layer2, baseLayer, 0);
        sChromaAnimationAPI.trimEndFramesName(layer3, 25);
        sChromaAnimationAPI.copyNonZeroAllKeysAllFramesOffsetName(layer3, baseLayer, 16);
        sChromaAnimationAPI.setChromaCustomFlagName(baseLayer, true);
        sChromaAnimationAPI.setChromaCustomColorAllFramesName(baseLayer);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.setChromaCustomFlagName(baseLayer, true);
        sChromaAnimationAPI.setChromaCustomColorAllFramesName(baseLayer);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect8ChromaLink()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_ChromaLink.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int frameCount = 8;
        sChromaAnimationAPI.makeBlankFramesName(baseLayer, frameCount, 0.1f, 0);
        sChromaAnimationAPI.fillRandomColorsBlackAndWhiteAllFramesName(baseLayer);
        sChromaAnimationAPI.duplicateFramesName(baseLayer);
        sChromaAnimationAPI.duplicateFramesName(baseLayer);
        int color1 = sChromaAnimationAPI.getRGB(255, 0, 0);
        int color2 = sChromaAnimationAPI.getRGB(64, 0, 0);
        sChromaAnimationAPI.multiplyNonZeroTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect8Headset()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_Headset.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int frameCount = 8;
        sChromaAnimationAPI.makeBlankFramesName(baseLayer, frameCount, 0.1f, 0);
        sChromaAnimationAPI.fillRandomColorsBlackAndWhiteAllFramesName(baseLayer);
        sChromaAnimationAPI.duplicateFramesName(baseLayer);
        sChromaAnimationAPI.duplicateFramesName(baseLayer);
        int color1 = sChromaAnimationAPI.getRGB(255, 0, 0);
        int color2 = sChromaAnimationAPI.getRGB(64, 0, 0);
        sChromaAnimationAPI.multiplyNonZeroTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect8Mousepad()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_Mousepad.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int frameCount = 8;
        sChromaAnimationAPI.makeBlankFramesName(baseLayer, frameCount, 0.1f, 0);
        sChromaAnimationAPI.fillRandomColorsBlackAndWhiteAllFramesName(baseLayer);
        sChromaAnimationAPI.duplicateFramesName(baseLayer);
        sChromaAnimationAPI.duplicateFramesName(baseLayer);
        int color1 = sChromaAnimationAPI.getRGB(255, 0, 0);
        int color2 = sChromaAnimationAPI.getRGB(64, 0, 0);
        sChromaAnimationAPI.multiplyNonZeroTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect8Mouse()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_Mouse.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int frameCount = 8;
        sChromaAnimationAPI.makeBlankFramesName(baseLayer, frameCount, 0.1f, 0);
        sChromaAnimationAPI.fillRandomColorsBlackAndWhiteAllFramesName(baseLayer);
        sChromaAnimationAPI.duplicateFramesName(baseLayer);
        sChromaAnimationAPI.duplicateFramesName(baseLayer);
        int color1 = sChromaAnimationAPI.getRGB(255, 0, 0);
        int color2 = sChromaAnimationAPI.getRGB(64, 0, 0);
        sChromaAnimationAPI.multiplyNonZeroTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect9()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_Keyboard.chroma";
        String layer2 = getAnimationPath() + "Animations/Ladder1_Keyboard.chroma";
        String layer3 = getAnimationPath() + "Animations/Ladder2_Keyboard.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.closeAnimationName(layer2);
        sChromaAnimationAPI.closeAnimationName(layer3);
        sChromaAnimationAPI.getAnimation(baseLayer);
        sChromaAnimationAPI.getAnimation(layer2);
        sChromaAnimationAPI.getAnimation(layer3);
        int frameCount = sChromaAnimationAPI.getFrameCountName(layer2);
        sChromaAnimationAPI.makeBlankFramesName(baseLayer, frameCount, 0.1f, 0);
        sChromaAnimationAPI.multiplyIntensityAllFramesRGBName(layer2, 162, 129, 81);
        sChromaAnimationAPI.copyNonZeroAllKeysAllFramesOffsetName(layer2, baseLayer, 0);
        sChromaAnimationAPI.multiplyIntensityAllFramesRGBName(layer3, 127, 0, 0);
        sChromaAnimationAPI.addNonZeroAllKeysAllFramesOffsetName(layer3, baseLayer, 12);
        sChromaAnimationAPI.fillZeroColorAllFramesRGBName(baseLayer, 60, 40, 20); //background
        sChromaAnimationAPI.setChromaCustomFlagName(baseLayer, true);
        sChromaAnimationAPI.setChromaCustomColorAllFramesName(baseLayer);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.setChromaCustomFlagName(baseLayer, true);
        sChromaAnimationAPI.setChromaCustomColorAllFramesName(baseLayer);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect9ChromaLink()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_ChromaLink.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int frameCount = 50;
        sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.1f, 255, 255, 255);
        sChromaAnimationAPI.fadeStartFramesName(baseLayer, frameCount / 2);
        sChromaAnimationAPI.fadeEndFramesName(baseLayer, frameCount / 2);
        int color1 = sChromaAnimationAPI.getRGB(255, 105, 20);
        int color2 = sChromaAnimationAPI.getRGB(255, 255, 0);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect9Headset()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_Headset.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int frameCount = 50;
        sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.1f, 255, 255, 255);
        sChromaAnimationAPI.fadeStartFramesName(baseLayer, frameCount / 2);
        sChromaAnimationAPI.fadeEndFramesName(baseLayer, frameCount / 2);
        int color1 = sChromaAnimationAPI.getRGB(255, 105, 20);
        int color2 = sChromaAnimationAPI.getRGB(255, 255, 0);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect9Mousepad()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_Mousepad.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int frameCount = 50;
        sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.1f, 255, 255, 255);
        sChromaAnimationAPI.fadeStartFramesName(baseLayer, frameCount / 2);
        sChromaAnimationAPI.fadeEndFramesName(baseLayer, frameCount / 2);
        int color1 = sChromaAnimationAPI.getRGB(255, 105, 20);
        int color2 = sChromaAnimationAPI.getRGB(255, 255, 0);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect9Mouse()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_Mouse.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int frameCount = 50;
        sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.1f, 255, 255, 255);
        sChromaAnimationAPI.fadeStartFramesName(baseLayer, frameCount / 2);
        sChromaAnimationAPI.fadeEndFramesName(baseLayer, frameCount / 2);
        int color1 = sChromaAnimationAPI.getRGB(255, 105, 20);
        int color2 = sChromaAnimationAPI.getRGB(255, 255, 0);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect10()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_Keyboard.chroma";
        String layer2 = getAnimationPath() + "Animations/Heart1_Keyboard.chroma";
        String layer3 = getAnimationPath() + "Animations/ReactiveSpace_Keyboard.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.closeAnimationName(layer2);
        sChromaAnimationAPI.closeAnimationName(layer3);
        sChromaAnimationAPI.getAnimation(baseLayer);
        sChromaAnimationAPI.getAnimation(layer2);
        sChromaAnimationAPI.getAnimation(layer3);
        int frameCount = 50;
        sChromaAnimationAPI.makeBlankFramesName(baseLayer, frameCount, 0.1f, 0);
        sChromaAnimationAPI.duplicateFirstFrameName(layer2, 20);
        sChromaAnimationAPI.multiplyIntensityAllFramesRGBName(layer2, 0, 255, 0);
        sChromaAnimationAPI.copyNonZeroAllKeysAllFramesOffsetName(layer2, baseLayer, 5);
        sChromaAnimationAPI.multiplyIntensityAllFramesRGBName(layer3, 255, 64, 64);
        sChromaAnimationAPI.copyNonZeroAllKeysAllFramesOffsetName(layer3, baseLayer, 10);
        sChromaAnimationAPI.fillZeroColorAllFramesRGBName(baseLayer, 60, 40, 20); //background
        sChromaAnimationAPI.setChromaCustomFlagName(baseLayer, true);
        sChromaAnimationAPI.setChromaCustomColorAllFramesName(baseLayer);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.setChromaCustomFlagName(baseLayer, true);
        sChromaAnimationAPI.setChromaCustomColorAllFramesName(baseLayer);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect10ChromaLink()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_ChromaLink.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int frameCount = 50;
        sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.1f, 255, 255, 255);
        sChromaAnimationAPI.fadeStartFramesName(baseLayer, frameCount / 2);
        sChromaAnimationAPI.fadeEndFramesName(baseLayer, frameCount / 2);
        int color1 = sChromaAnimationAPI.getRGB(124, 164, 124);
        int color2 = sChromaAnimationAPI.getRGB(215, 215, 215);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect10Headset()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_Headset.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int frameCount = 50;
        sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.1f, 255, 255, 255);
        sChromaAnimationAPI.fadeStartFramesName(baseLayer, frameCount / 2);
        sChromaAnimationAPI.fadeEndFramesName(baseLayer, frameCount / 2);
        int color1 = sChromaAnimationAPI.getRGB(124, 164, 124);
        int color2 = sChromaAnimationAPI.getRGB(215, 215, 215);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect10Mousepad()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_Mousepad.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int frameCount = 50;
        sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.1f, 255, 255, 255);
        sChromaAnimationAPI.fadeStartFramesName(baseLayer, frameCount / 2);
        sChromaAnimationAPI.fadeEndFramesName(baseLayer, frameCount / 2);
        int color1 = sChromaAnimationAPI.getRGB(124, 164, 124);
        int color2 = sChromaAnimationAPI.getRGB(215, 215, 215);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect10Mouse()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_Mouse.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int frameCount = 50;
        sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.1f, 255, 255, 255);
        sChromaAnimationAPI.fadeStartFramesName(baseLayer, frameCount / 2);
        sChromaAnimationAPI.fadeEndFramesName(baseLayer, frameCount / 2);
        int color1 = sChromaAnimationAPI.getRGB(124, 164, 124);
        int color2 = sChromaAnimationAPI.getRGB(215, 215, 215);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect11()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_Keyboard.chroma";
        String layer2 = getAnimationPath() + "Animations/Ladder1_Keyboard.chroma";
        String layer3 = getAnimationPath() + "Animations/Ladder2_Keyboard.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.closeAnimationName(layer2);
        sChromaAnimationAPI.closeAnimationName(layer3);
        sChromaAnimationAPI.getAnimation(baseLayer);
        sChromaAnimationAPI.getAnimation(layer2);
        sChromaAnimationAPI.getAnimation(layer3);
        sChromaAnimationAPI.duplicateFramesName(layer2);
        sChromaAnimationAPI.duplicateFramesName(layer2);
        int frameCount = sChromaAnimationAPI.getFrameCountName(layer2);
        sChromaAnimationAPI.makeBlankFramesName(baseLayer, frameCount, 0.1f, 0);
        sChromaAnimationAPI.multiplyIntensityAllFramesRGBName(layer2, 20, 40, 255);
        sChromaAnimationAPI.copyNonZeroAllKeysAllFramesOffsetName(layer2, baseLayer, 0);
        sChromaAnimationAPI.addNonZeroAllKeysAllFramesOffsetName(layer2, baseLayer, 20);
        sChromaAnimationAPI.addNonZeroAllKeysAllFramesOffsetName(layer2, baseLayer, 40);
        sChromaAnimationAPI.reverseAllFramesName(layer2);
        sChromaAnimationAPI.addNonZeroAllKeysAllFramesOffsetName(layer2, baseLayer, 0);
        sChromaAnimationAPI.addNonZeroAllKeysAllFramesOffsetName(layer2, baseLayer, 20);
        sChromaAnimationAPI.addNonZeroAllKeysAllFramesOffsetName(layer2, baseLayer, 40);
        sChromaAnimationAPI.fillZeroColorAllFramesRGBName(baseLayer, 60, 40, 20); //background
        sChromaAnimationAPI.setChromaCustomFlagName(baseLayer, true);
        sChromaAnimationAPI.setChromaCustomColorAllFramesName(baseLayer);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.setChromaCustomFlagName(baseLayer, true);
        sChromaAnimationAPI.setChromaCustomColorAllFramesName(baseLayer);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect11ChromaLink()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_ChromaLink.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        sChromaAnimationAPI.fillRandomColorsAllFramesName(baseLayer);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect11Headset()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_Headset.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        sChromaAnimationAPI.fillRandomColorsAllFramesName(baseLayer);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect11Mousepad()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_Mousepad.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        sChromaAnimationAPI.fillRandomColorsAllFramesName(baseLayer);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect11Mouse()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_Mouse.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        sChromaAnimationAPI.fillRandomColorsAllFramesName(baseLayer);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect12()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_Keyboard.chroma";
        String layer2 = getAnimationPath() + "Animations/Sword1_Keyboard.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.closeAnimationName(layer2);
        sChromaAnimationAPI.getAnimation(baseLayer);
        sChromaAnimationAPI.getAnimation(layer2);
        sChromaAnimationAPI.reduceFramesName(layer2, 2);
        sChromaAnimationAPI.multiplyIntensityAllFramesRGBName(layer2, 255, 127, 127);
        sChromaAnimationAPI.fillThresholdColorsAllFramesRGBName(layer2, 100, 255, 0, 0);
        int frameId = 17;
        sChromaAnimationAPI.trimEndFramesName(layer2, frameId);
        int delay = 2;
        sChromaAnimationAPI.insertDelayName(layer2, frameId, delay);
        sChromaAnimationAPI.duplicateMirrorFramesName(layer2);
        int frameCount = sChromaAnimationAPI.getFrameCountName(layer2);
        sChromaAnimationAPI.makeBlankFramesName(baseLayer, frameCount, 0.1f, 0);
        sChromaAnimationAPI.fillZeroColorAllFramesRGBName(baseLayer, 32, 32, 32); //background
        sChromaAnimationAPI.copyNonZeroAllKeysAllFramesOffsetName(layer2, baseLayer, 0);
        sChromaAnimationAPI.setChromaCustomFlagName(baseLayer, true);
        sChromaAnimationAPI.setChromaCustomColorAllFramesName(baseLayer);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect12ChromaLink()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_ChromaLink.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int frameCount = 50;
        sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.1f, 255, 255, 255);
        sChromaAnimationAPI.fadeStartFramesName(baseLayer, frameCount / 2);
        sChromaAnimationAPI.fadeEndFramesName(baseLayer, frameCount / 2);
        int color1 = sChromaAnimationAPI.getRGB(255, 201, 136);
        int color2 = sChromaAnimationAPI.getRGB(0, 45, 45);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect12Headset()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_Headset.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int frameCount = 50;
        sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.1f, 255, 255, 255);
        sChromaAnimationAPI.fadeStartFramesName(baseLayer, frameCount / 2);
        sChromaAnimationAPI.fadeEndFramesName(baseLayer, frameCount / 2);
        int color1 = sChromaAnimationAPI.getRGB(255, 201, 136);
        int color2 = sChromaAnimationAPI.getRGB(0, 45, 45);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect12Mousepad()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_Mousepad.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int frameCount = 50;
        sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.1f, 255, 255, 255);
        sChromaAnimationAPI.fadeStartFramesName(baseLayer, frameCount / 2);
        sChromaAnimationAPI.fadeEndFramesName(baseLayer, frameCount / 2);
        int color1 = sChromaAnimationAPI.getRGB(255, 201, 136);
        int color2 = sChromaAnimationAPI.getRGB(0, 45, 45);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect12Mouse()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_Mouse.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int frameCount = 50;
        sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.1f, 255, 255, 255);
        sChromaAnimationAPI.fadeStartFramesName(baseLayer, frameCount / 2);
        sChromaAnimationAPI.fadeEndFramesName(baseLayer, frameCount / 2);
        int color1 = sChromaAnimationAPI.getRGB(255, 201, 136);
        int color2 = sChromaAnimationAPI.getRGB(0, 45, 45);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect13()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_Keyboard.chroma";
        String layer2 = getAnimationPath() + "Animations/Chest1_Keyboard.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.closeAnimationName(layer2);
        sChromaAnimationAPI.getAnimation(baseLayer);
        sChromaAnimationAPI.getAnimation(layer2);
        sChromaAnimationAPI.duplicateMirrorFramesName(layer2);
        sChromaAnimationAPI.insertDelayName(layer2, 0, 15);
        sChromaAnimationAPI.multiplyIntensityAllFramesRGBName(layer2, 260, 210, 92);
        sChromaAnimationAPI.fillThresholdColorsAllFramesRGBName(layer2, 100, 170, 102, 15);
        int frameCount = sChromaAnimationAPI.getFrameCountName(layer2);
        sChromaAnimationAPI.makeBlankFramesName(baseLayer, frameCount, 0.1f, 0);
        sChromaAnimationAPI.fillZeroColorAllFramesRGBName(baseLayer, 60, 40, 20);
        sChromaAnimationAPI.copyNonZeroAllKeysAllFramesOffsetName(layer2, baseLayer, 0);
        sChromaAnimationAPI.setChromaCustomFlagName(baseLayer, true);
        sChromaAnimationAPI.setChromaCustomColorAllFramesName(baseLayer);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.setChromaCustomFlagName(baseLayer, true);
        sChromaAnimationAPI.setChromaCustomColorAllFramesName(baseLayer);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect13ChromaLink()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_ChromaLink.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int frameCount = 50;
        sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.1f, 255, 255, 255);
        sChromaAnimationAPI.fadeStartFramesName(baseLayer, frameCount / 2);
        sChromaAnimationAPI.fadeEndFramesName(baseLayer, frameCount / 2);
        int color1 = sChromaAnimationAPI.getRGB(0, 64, 255);
        int color2 = sChromaAnimationAPI.getRGB(64, 64, 64);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect13Headset()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_Headset.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int frameCount = 50;
        sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.1f, 255, 255, 255);
        sChromaAnimationAPI.fadeStartFramesName(baseLayer, frameCount / 2);
        sChromaAnimationAPI.fadeEndFramesName(baseLayer, frameCount / 2);
        int color1 = sChromaAnimationAPI.getRGB(0, 64, 255);
        int color2 = sChromaAnimationAPI.getRGB(64, 64, 64);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect13Mousepad()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_Mousepad.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int frameCount = 50;
        sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.1f, 255, 255, 255);
        sChromaAnimationAPI.fadeStartFramesName(baseLayer, frameCount / 2);
        sChromaAnimationAPI.fadeEndFramesName(baseLayer, frameCount / 2);
        int color1 = sChromaAnimationAPI.getRGB(0, 64, 255);
        int color2 = sChromaAnimationAPI.getRGB(64, 64, 64);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect13Mouse()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_Mouse.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int frameCount = 50;
        sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.1f, 255, 255, 255);
        sChromaAnimationAPI.fadeStartFramesName(baseLayer, frameCount / 2);
        sChromaAnimationAPI.fadeEndFramesName(baseLayer, frameCount / 2);
        int color1 = sChromaAnimationAPI.getRGB(0, 64, 255);
        int color2 = sChromaAnimationAPI.getRGB(64, 64, 64);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect14()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_Keyboard.chroma";
        String layer2 = getAnimationPath() + "Animations/Spiral_Keyboard.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.closeAnimationName(layer2);
        sChromaAnimationAPI.getAnimation(baseLayer);
        sChromaAnimationAPI.getAnimation(layer2);
        sChromaAnimationAPI.multiplyIntensityAllFramesRGBName(layer2, 0, 0, 255);
        int frameCount = sChromaAnimationAPI.getFrameCountName(layer2);
        sChromaAnimationAPI.makeBlankFramesName(baseLayer, frameCount, 0.1f, 0);
        sChromaAnimationAPI.fillZeroColorAllFramesRGBName(baseLayer, 60, 40, 20);
        sChromaAnimationAPI.copyNonZeroAllKeysAllFramesOffsetName(layer2, baseLayer, 0);
        sChromaAnimationAPI.setChromaCustomFlagName(baseLayer, true);
        sChromaAnimationAPI.setChromaCustomColorAllFramesName(baseLayer);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.setChromaCustomFlagName(baseLayer, true);
        sChromaAnimationAPI.setChromaCustomColorAllFramesName(baseLayer);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect14ChromaLink()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_ChromaLink.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int frameCount = 50;
        sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.1f, 255, 255, 255);
        sChromaAnimationAPI.fadeStartFramesName(baseLayer, frameCount / 2);
        sChromaAnimationAPI.fadeEndFramesName(baseLayer, frameCount / 2);
        int color1 = sChromaAnimationAPI.getRGB(181, 101, 82);
        int color2 = sChromaAnimationAPI.getRGB(230, 202, 189);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect14Headset()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_Headset.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int frameCount = 50;
        sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.1f, 255, 255, 255);
        sChromaAnimationAPI.fadeStartFramesName(baseLayer, frameCount / 2);
        sChromaAnimationAPI.fadeEndFramesName(baseLayer, frameCount / 2);
        int color1 = sChromaAnimationAPI.getRGB(181, 101, 82);
        int color2 = sChromaAnimationAPI.getRGB(230, 202, 189);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect14Mousepad()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_Mousepad.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int frameCount = 50;
        sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.1f, 255, 255, 255);
        sChromaAnimationAPI.fadeStartFramesName(baseLayer, frameCount / 2);
        sChromaAnimationAPI.fadeEndFramesName(baseLayer, frameCount / 2);
        int color1 = sChromaAnimationAPI.getRGB(181, 101, 82);
        int color2 = sChromaAnimationAPI.getRGB(230, 202, 189);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect14Mouse()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_Mouse.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int frameCount = 50;
        sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.1f, 255, 255, 255);
        sChromaAnimationAPI.fadeStartFramesName(baseLayer, frameCount / 2);
        sChromaAnimationAPI.fadeEndFramesName(baseLayer, frameCount / 2);
        int color1 = sChromaAnimationAPI.getRGB(181, 101, 82);
        int color2 = sChromaAnimationAPI.getRGB(230, 202, 189);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect15()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_Keyboard.chroma";
        String layer2 = getAnimationPath() + "Animations/Bird1_Keyboard.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.closeAnimationName(layer2);
        sChromaAnimationAPI.getAnimation(baseLayer);
        sChromaAnimationAPI.getAnimation(layer2);
        sChromaAnimationAPI.reduceFramesName(layer2, 2);
        sChromaAnimationAPI.multiplyIntensityAllFramesName(layer2, 0.9f);
        sChromaAnimationAPI.fillThresholdColorsAllFramesRGBName(layer2, 100, 127, 127, 127);
        int frameCount = sChromaAnimationAPI.getFrameCountName(layer2);
        sChromaAnimationAPI.makeBlankFramesName(baseLayer, frameCount, 0.1f, 0);
        sChromaAnimationAPI.fillZeroColorAllFramesRGBName(baseLayer, 60, 40, 20);
        sChromaAnimationAPI.copyNonZeroAllKeysAllFramesOffsetName(layer2, baseLayer, 0);
        sChromaAnimationAPI.setChromaCustomFlagName(baseLayer, true);
        sChromaAnimationAPI.setChromaCustomColorAllFramesName(baseLayer);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.setChromaCustomFlagName(baseLayer, true);
        sChromaAnimationAPI.setChromaCustomColorAllFramesName(baseLayer);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect15ChromaLink()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_ChromaLink.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int frameCount = 50;
        sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.1f, 255, 255, 255);
        sChromaAnimationAPI.fadeStartFramesName(baseLayer, frameCount / 2);
        sChromaAnimationAPI.fadeEndFramesName(baseLayer, frameCount / 2);
        int color1 = sChromaAnimationAPI.getRGB(255, 255, 255);
        int color2 = sChromaAnimationAPI.getRGB(127, 127, 127);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect15Headset()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_Headset.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int frameCount = 50;
        sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.1f, 255, 255, 255);
        sChromaAnimationAPI.fadeStartFramesName(baseLayer, frameCount / 2);
        sChromaAnimationAPI.fadeEndFramesName(baseLayer, frameCount / 2);
        int color1 = sChromaAnimationAPI.getRGB(255, 255, 255);
        int color2 = sChromaAnimationAPI.getRGB(127, 127, 127);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect15Mousepad()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_Mousepad.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int frameCount = 50;
        sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.1f, 255, 255, 255);
        sChromaAnimationAPI.fadeStartFramesName(baseLayer, frameCount / 2);
        sChromaAnimationAPI.fadeEndFramesName(baseLayer, frameCount / 2);
        int color1 = sChromaAnimationAPI.getRGB(255, 255, 255);
        int color2 = sChromaAnimationAPI.getRGB(127, 127, 127);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect15Mouse()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_Mouse.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int frameCount = 50;
        sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.1f, 255, 255, 255);
        sChromaAnimationAPI.fadeStartFramesName(baseLayer, frameCount / 2);
        sChromaAnimationAPI.fadeEndFramesName(baseLayer, frameCount / 2);
        int color1 = sChromaAnimationAPI.getRGB(255, 255, 255);
        int color2 = sChromaAnimationAPI.getRGB(127, 127, 127);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect16()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_Keyboard.chroma";
        String layer2 = getAnimationPath() + "Animations/Spiral_Keyboard.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.closeAnimationName(layer2);
        sChromaAnimationAPI.getAnimation(baseLayer);
        sChromaAnimationAPI.getAnimation(layer2);
        int frameCount = sChromaAnimationAPI.getFrameCountName(layer2);
        sChromaAnimationAPI.makeBlankFramesName(baseLayer, frameCount, 0.1f, 0);
        sChromaAnimationAPI.fillZeroColorAllFramesRGBName(baseLayer, 60, 40, 20);
        sChromaAnimationAPI.multiplyIntensityAllFramesRGBName(layer2, 0, 0, 255);
        sChromaAnimationAPI.copyNonZeroAllKeysAllFramesOffsetName(layer2, baseLayer, 0);
        sChromaAnimationAPI.reverseAllFramesName(layer2);
        sChromaAnimationAPI.fillZeroColorAllFramesRGBName(layer2, 255, 40, 255);
        sChromaAnimationAPI.addNonZeroAllKeysAllFramesOffsetName(layer2, baseLayer, 0);
        sChromaAnimationAPI.setChromaCustomFlagName(baseLayer, true);
        sChromaAnimationAPI.setChromaCustomColorAllFramesName(baseLayer);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.setChromaCustomFlagName(baseLayer, true);
        sChromaAnimationAPI.setChromaCustomColorAllFramesName(baseLayer);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect16ChromaLink()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_ChromaLink.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int frameCount = 50;
        sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.1f, 255, 255, 255);
        sChromaAnimationAPI.fadeStartFramesName(baseLayer, frameCount / 2);
        sChromaAnimationAPI.fadeEndFramesName(baseLayer, frameCount / 2);
        int color1 = sChromaAnimationAPI.getRGB(0, 0, 255);
        int color2 = sChromaAnimationAPI.getRGB(255, 0, 0);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect16Headset()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_Headset.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int frameCount = 50;
        sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.1f, 255, 255, 255);
        sChromaAnimationAPI.fadeStartFramesName(baseLayer, frameCount / 2);
        sChromaAnimationAPI.fadeEndFramesName(baseLayer, frameCount / 2);
        int color1 = sChromaAnimationAPI.getRGB(0, 0, 255);
        int color2 = sChromaAnimationAPI.getRGB(255, 0, 0);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect16Mousepad()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_Mousepad.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int frameCount = 50;
        sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.1f, 255, 255, 255);
        sChromaAnimationAPI.fadeStartFramesName(baseLayer, frameCount / 2);
        sChromaAnimationAPI.fadeEndFramesName(baseLayer, frameCount / 2);
        int color1 = sChromaAnimationAPI.getRGB(0, 0, 255);
        int color2 = sChromaAnimationAPI.getRGB(255, 0, 0);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect16Mouse()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_Mouse.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int frameCount = 50;
        sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.1f, 255, 255, 255);
        sChromaAnimationAPI.fadeStartFramesName(baseLayer, frameCount / 2);
        sChromaAnimationAPI.fadeEndFramesName(baseLayer, frameCount / 2);
        int color1 = sChromaAnimationAPI.getRGB(0, 0, 255);
        int color2 = sChromaAnimationAPI.getRGB(255, 0, 0);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect17()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_Keyboard.chroma";
        String layer2 = "animations/Fish1_Keyboard.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.closeAnimationName(layer2);
        sChromaAnimationAPI.getAnimation(baseLayer);
        sChromaAnimationAPI.getAnimation(layer2);
        int frameCount = sChromaAnimationAPI.getFrameCountName(layer2);
        sChromaAnimationAPI.makeBlankFramesName(baseLayer, frameCount, 0.1f, 0);
        sChromaAnimationAPI.fillZeroColorAllFramesRGBName(baseLayer, 60, 40, 20);
        sChromaAnimationAPI.copyNonZeroAllKeysAllFramesOffsetName(layer2, baseLayer, 0);
        sChromaAnimationAPI.setChromaCustomFlagName(baseLayer, true);
        sChromaAnimationAPI.setChromaCustomColorAllFramesName(baseLayer);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.setChromaCustomFlagName(baseLayer, true);
        sChromaAnimationAPI.setChromaCustomColorAllFramesName(baseLayer);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect17ChromaLink()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_ChromaLink.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int frameCount = 50;
        sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.1f, 255, 255, 255);
        sChromaAnimationAPI.fadeStartFramesName(baseLayer, frameCount / 2);
        sChromaAnimationAPI.fadeEndFramesName(baseLayer, frameCount / 2);
        int color1 = sChromaAnimationAPI.getRGB(255, 0, 0);
        int color2 = sChromaAnimationAPI.getRGB(0, 255, 0);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect17Headset()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_Headset.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int frameCount = 50;
        sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.1f, 255, 255, 255);
        sChromaAnimationAPI.fadeStartFramesName(baseLayer, frameCount / 2);
        sChromaAnimationAPI.fadeEndFramesName(baseLayer, frameCount / 2);
        int color1 = sChromaAnimationAPI.getRGB(255, 0, 0);
        int color2 = sChromaAnimationAPI.getRGB(0, 255, 0);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect17Mousepad()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_Mousepad.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int frameCount = 50;
        sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.1f, 255, 255, 255);
        sChromaAnimationAPI.fadeStartFramesName(baseLayer, frameCount / 2);
        sChromaAnimationAPI.fadeEndFramesName(baseLayer, frameCount / 2);
        int color1 = sChromaAnimationAPI.getRGB(255, 0, 0);
        int color2 = sChromaAnimationAPI.getRGB(0, 255, 0);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect17Mouse()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_Mouse.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int frameCount = 50;
        sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.1f, 255, 255, 255);
        sChromaAnimationAPI.fadeStartFramesName(baseLayer, frameCount / 2);
        sChromaAnimationAPI.fadeEndFramesName(baseLayer, frameCount / 2);
        int color1 = sChromaAnimationAPI.getRGB(255, 0, 0);
        int color2 = sChromaAnimationAPI.getRGB(0, 255, 0);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect18()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_Keyboard.chroma";
        String layer2 = "animations/Fish1_Keyboard.chroma";
        String layer3 = "animations/Rainbow_Keyboard.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.closeAnimationName(layer2);
        sChromaAnimationAPI.closeAnimationName(layer3);
        sChromaAnimationAPI.getAnimation(baseLayer);
        sChromaAnimationAPI.getAnimation(layer2);
        sChromaAnimationAPI.getAnimation(layer3);
        int frameCount = sChromaAnimationAPI.getFrameCountName(layer2);
        sChromaAnimationAPI.makeBlankFramesName(baseLayer, frameCount, 0.1f, 0);
        sChromaAnimationAPI.fillZeroColorAllFramesRGBName(baseLayer, 60, 40, 20);
        sChromaAnimationAPI.copyNonZeroTargetAllKeysAllFramesOffsetName(layer3, layer2, 0);
        sChromaAnimationAPI.copyNonZeroAllKeysAllFramesOffsetName(layer2, baseLayer, 0);
        sChromaAnimationAPI.setChromaCustomFlagName(baseLayer, true);
        sChromaAnimationAPI.setChromaCustomColorAllFramesName(baseLayer);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.setChromaCustomFlagName(baseLayer, true);
        sChromaAnimationAPI.setChromaCustomColorAllFramesName(baseLayer);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect18ChromaLink()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_ChromaLink.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int frameCount = 50;
        sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.1f, 255, 255, 255);
        sChromaAnimationAPI.fadeStartFramesName(baseLayer, frameCount / 2);
        sChromaAnimationAPI.fadeEndFramesName(baseLayer, frameCount / 2);
        int color1 = sChromaAnimationAPI.getRGB(255, 255, 0);
        int color2 = sChromaAnimationAPI.getRGB(0, 255, 255);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect18Headset()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_Headset.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int frameCount = 50;
        sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.1f, 255, 255, 255);
        sChromaAnimationAPI.fadeStartFramesName(baseLayer, frameCount / 2);
        sChromaAnimationAPI.fadeEndFramesName(baseLayer, frameCount / 2);
        int color1 = sChromaAnimationAPI.getRGB(255, 255, 0);
        int color2 = sChromaAnimationAPI.getRGB(0, 255, 255);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect18Mousepad()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_Mousepad.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int frameCount = 50;
        sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.1f, 255, 255, 255);
        sChromaAnimationAPI.fadeStartFramesName(baseLayer, frameCount / 2);
        sChromaAnimationAPI.fadeEndFramesName(baseLayer, frameCount / 2);
        int color1 = sChromaAnimationAPI.getRGB(255, 255, 0);
        int color2 = sChromaAnimationAPI.getRGB(0, 255, 255);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect18Mouse()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_Mouse.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int frameCount = 50;
        sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.1f, 255, 255, 255);
        sChromaAnimationAPI.fadeStartFramesName(baseLayer, frameCount / 2);
        sChromaAnimationAPI.fadeEndFramesName(baseLayer, frameCount / 2);
        int color1 = sChromaAnimationAPI.getRGB(255, 255, 0);
        int color2 = sChromaAnimationAPI.getRGB(0, 255, 255);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect19()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_Keyboard.chroma";
        String layer2 = "animations/Swim1_Keyboard.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.closeAnimationName(layer2);
        sChromaAnimationAPI.getAnimation(baseLayer);
        sChromaAnimationAPI.getAnimation(layer2);
        int frameCount = sChromaAnimationAPI.getFrameCountName(layer2);
        sChromaAnimationAPI.makeBlankFramesName(baseLayer, frameCount, 0.1f, 0);
        sChromaAnimationAPI.fillZeroColorAllFramesRGBName(baseLayer, 60, 40, 20);
        sChromaAnimationAPI.multiplyIntensityAllFramesRGBName(layer2, 200, 200, 127);
        sChromaAnimationAPI.copyNonZeroAllKeysAllFramesOffsetName(layer2, baseLayer, 0);
        sChromaAnimationAPI.setChromaCustomFlagName(baseLayer, true);
        sChromaAnimationAPI.setChromaCustomColorAllFramesName(baseLayer);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.setChromaCustomFlagName(baseLayer, true);
        sChromaAnimationAPI.setChromaCustomColorAllFramesName(baseLayer);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect19ChromaLink()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_ChromaLink.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int frameCount = 50;
        sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.1f, 255, 255, 255);
        sChromaAnimationAPI.fadeStartFramesName(baseLayer, frameCount / 2);
        sChromaAnimationAPI.fadeEndFramesName(baseLayer, frameCount / 2);
        int color1 = sChromaAnimationAPI.getRGB(0, 255, 0);
        int color2 = sChromaAnimationAPI.getRGB(0, 255, 255);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect19Headset()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_Headset.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int frameCount = 50;
        sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.1f, 255, 255, 255);
        sChromaAnimationAPI.fadeStartFramesName(baseLayer, frameCount / 2);
        sChromaAnimationAPI.fadeEndFramesName(baseLayer, frameCount / 2);
        int color1 = sChromaAnimationAPI.getRGB(0, 255, 0);
        int color2 = sChromaAnimationAPI.getRGB(0, 255, 255);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect19Mousepad()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_Mousepad.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int frameCount = 50;
        sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.1f, 255, 255, 255);
        sChromaAnimationAPI.fadeStartFramesName(baseLayer, frameCount / 2);
        sChromaAnimationAPI.fadeEndFramesName(baseLayer, frameCount / 2);
        int color1 = sChromaAnimationAPI.getRGB(0, 255, 0);
        int color2 = sChromaAnimationAPI.getRGB(0, 255, 255);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect19Mouse()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_Mouse.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int frameCount = 50;
        sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.1f, 255, 255, 255);
        sChromaAnimationAPI.fadeStartFramesName(baseLayer, frameCount / 2);
        sChromaAnimationAPI.fadeEndFramesName(baseLayer, frameCount / 2);
        int color1 = sChromaAnimationAPI.getRGB(0, 255, 0);
        int color2 = sChromaAnimationAPI.getRGB(0, 255, 255);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect20()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_Keyboard.chroma";
        String layer2 = "animations/Bubbles1_Keyboard.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.closeAnimationName(layer2);
        sChromaAnimationAPI.getAnimation(baseLayer);
        sChromaAnimationAPI.getAnimation(layer2);
        int frameCount = sChromaAnimationAPI.getFrameCountName(layer2);
        sChromaAnimationAPI.makeBlankFramesName(baseLayer, frameCount, 0.1f, 0);
        sChromaAnimationAPI.fillZeroColorAllFramesRGBName(baseLayer, 60, 40, 20);
        sChromaAnimationAPI.copyNonZeroAllKeysAllFramesOffsetName(layer2, baseLayer, 0);
        sChromaAnimationAPI.setChromaCustomFlagName(baseLayer, true);
        sChromaAnimationAPI.setChromaCustomColorAllFramesName(baseLayer);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.setChromaCustomFlagName(baseLayer, true);
        sChromaAnimationAPI.setChromaCustomColorAllFramesName(baseLayer);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect20ChromaLink()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_ChromaLink.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int frameCount = 50;
        sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.1f, 255, 255, 255);
        sChromaAnimationAPI.fadeStartFramesName(baseLayer, frameCount / 2);
        sChromaAnimationAPI.fadeEndFramesName(baseLayer, frameCount / 2);
        int color1 = sChromaAnimationAPI.getRGB(0, 255, 255);
        int color2 = sChromaAnimationAPI.getRGB(0, 0, 255);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect20Headset()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_Headset.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int frameCount = 50;
        sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.1f, 255, 255, 255);
        sChromaAnimationAPI.fadeStartFramesName(baseLayer, frameCount / 2);
        sChromaAnimationAPI.fadeEndFramesName(baseLayer, frameCount / 2);
        int color1 = sChromaAnimationAPI.getRGB(0, 255, 255);
        int color2 = sChromaAnimationAPI.getRGB(0, 0, 255);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect20Mousepad()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_Mousepad.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int frameCount = 50;
        sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.1f, 255, 255, 255);
        sChromaAnimationAPI.fadeStartFramesName(baseLayer, frameCount / 2);
        sChromaAnimationAPI.fadeEndFramesName(baseLayer, frameCount / 2);
        int color1 = sChromaAnimationAPI.getRGB(0, 255, 255);
        int color2 = sChromaAnimationAPI.getRGB(0, 0, 255);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect20Mouse()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_Mouse.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int frameCount = 50;
        sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.1f, 255, 255, 255);
        sChromaAnimationAPI.fadeStartFramesName(baseLayer, frameCount / 2);
        sChromaAnimationAPI.fadeEndFramesName(baseLayer, frameCount / 2);
        int color1 = sChromaAnimationAPI.getRGB(255, 255, 255);
        int color2 = sChromaAnimationAPI.getRGB(0, 0, 255);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect21()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_Keyboard.chroma";
        String layer2 = getAnimationPath() + "Animations/Particle1_Keyboard.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.closeAnimationName(layer2);
        sChromaAnimationAPI.getAnimation(baseLayer);
        sChromaAnimationAPI.getAnimation(layer2);
        int frameCount = sChromaAnimationAPI.getFrameCountName(layer2);
        sChromaAnimationAPI.makeBlankFramesName(baseLayer, frameCount, 0.1f, 0);
        sChromaAnimationAPI.fillZeroColorAllFramesRGBName(baseLayer, 60, 40, 20);
        sChromaAnimationAPI.multiplyIntensityAllFramesRGBName(layer2, 200, 200, 255);
        sChromaAnimationAPI.copyNonZeroAllKeysAllFramesOffsetName(layer2, baseLayer, 0);
        sChromaAnimationAPI.setChromaCustomFlagName(baseLayer, true);
        sChromaAnimationAPI.setChromaCustomColorAllFramesName(baseLayer);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.setChromaCustomFlagName(baseLayer, true);
        sChromaAnimationAPI.setChromaCustomColorAllFramesName(baseLayer);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect21ChromaLink()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_ChromaLink.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int frameCount = 50;
        sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.1f, 255, 255, 255);
        sChromaAnimationAPI.fadeStartFramesName(baseLayer, frameCount / 2);
        sChromaAnimationAPI.fadeEndFramesName(baseLayer, frameCount / 2);
        int color1 = sChromaAnimationAPI.getRGB(255, 255, 255);
        int color2 = sChromaAnimationAPI.getRGB(0, 255, 255);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect21Headset()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_Headset.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int frameCount = 50;
        sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.1f, 255, 255, 255);
        sChromaAnimationAPI.fadeStartFramesName(baseLayer, frameCount / 2);
        sChromaAnimationAPI.fadeEndFramesName(baseLayer, frameCount / 2);
        int color1 = sChromaAnimationAPI.getRGB(255, 255, 255);
        int color2 = sChromaAnimationAPI.getRGB(0, 255, 255);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect21Mousepad()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_Mousepad.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int frameCount = 50;
        sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.1f, 255, 255, 255);
        sChromaAnimationAPI.fadeStartFramesName(baseLayer, frameCount / 2);
        sChromaAnimationAPI.fadeEndFramesName(baseLayer, frameCount / 2);
        int color1 = sChromaAnimationAPI.getRGB(255, 255, 255);
        int color2 = sChromaAnimationAPI.getRGB(0, 255, 255);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect21Mouse()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_Mouse.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int frameCount = 50;
        sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.1f, 255, 255, 255);
        sChromaAnimationAPI.fadeStartFramesName(baseLayer, frameCount / 2);
        sChromaAnimationAPI.fadeEndFramesName(baseLayer, frameCount / 2);
        int color1 = sChromaAnimationAPI.getRGB(255, 255, 255);
        int color2 = sChromaAnimationAPI.getRGB(0, 255, 255);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect22()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_Keyboard.chroma";
        String layer2 = getAnimationPath() + "Animations/UpParticle3_Keyboard.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.closeAnimationName(layer2);
        sChromaAnimationAPI.getAnimation(baseLayer);
        sChromaAnimationAPI.getAnimation(layer2);
        int frameCount = sChromaAnimationAPI.getFrameCountName(layer2);
        sChromaAnimationAPI.makeBlankFramesName(baseLayer, frameCount, 0.1f, 0);
        sChromaAnimationAPI.fillZeroColorAllFramesRGBName(baseLayer, 60, 40, 20);
        sChromaAnimationAPI.reverseAllFramesName(layer2);
        sChromaAnimationAPI.multiplyIntensityAllFramesRGBName(layer2, 127, 127, 255);
        sChromaAnimationAPI.copyNonZeroAllKeysAllFramesOffsetName(layer2, baseLayer, 0);
        sChromaAnimationAPI.setChromaCustomFlagName(baseLayer, true);
        sChromaAnimationAPI.setChromaCustomColorAllFramesName(baseLayer);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.setChromaCustomFlagName(baseLayer, true);
        sChromaAnimationAPI.setChromaCustomColorAllFramesName(baseLayer);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect22ChromaLink()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_ChromaLink.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int frameCount = 50;
        sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.1f, 255, 255, 255);
        sChromaAnimationAPI.fadeStartFramesName(baseLayer, frameCount / 2);
        sChromaAnimationAPI.fadeEndFramesName(baseLayer, frameCount / 2);
        int color1 = sChromaAnimationAPI.getRGB(0, 255, 255);
        int color2 = sChromaAnimationAPI.getRGB(127, 127, 255);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect22Headset()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_Headset.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int frameCount = 50;
        sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.1f, 255, 255, 255);
        sChromaAnimationAPI.fadeStartFramesName(baseLayer, frameCount / 2);
        sChromaAnimationAPI.fadeEndFramesName(baseLayer, frameCount / 2);
        int color1 = sChromaAnimationAPI.getRGB(0, 255, 255);
        int color2 = sChromaAnimationAPI.getRGB(127, 127, 255);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect22Mousepad()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_Mousepad.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int frameCount = 50;
        sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.1f, 255, 255, 255);
        sChromaAnimationAPI.fadeStartFramesName(baseLayer, frameCount / 2);
        sChromaAnimationAPI.fadeEndFramesName(baseLayer, frameCount / 2);
        int color1 = sChromaAnimationAPI.getRGB(0, 255, 255);
        int color2 = sChromaAnimationAPI.getRGB(127, 127, 255);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    void showEffect22Mouse()
    {
        String baseLayer = getAnimationPath() + "Animations/Blank_Mouse.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int frameCount = 50;
        sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.1f, 255, 255, 255);
        sChromaAnimationAPI.fadeStartFramesName(baseLayer, frameCount / 2);
        sChromaAnimationAPI.fadeEndFramesName(baseLayer, frameCount / 2);
        int color1 = sChromaAnimationAPI.getRGB(0, 255, 255);
        int color2 = sChromaAnimationAPI.getRGB(127, 127, 255);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
}
