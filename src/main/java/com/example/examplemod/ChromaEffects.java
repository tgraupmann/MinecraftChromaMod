package com.example.examplemod;

import com.razer.java.JChromaSDK;

public class ChromaEffects {
    protected static JChromaSDK sChromaAnimationAPI = null;

    protected static String getAnimationPath() {
        String cd = System.getProperty("user.dir");
        //System.out.println("********* getAnimationPath: cd="+cd);
        String path = cd + "\\..\\src\\main\\resources\\Animations\\";
        //System.out.println("********* getAnimationPath: path="+path);
        return path;
    }

    public static void showEffect1()
    {
        String baseLayer = getAnimationPath()+"Blank_Keyboard.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int ground = sChromaAnimationAPI.getRGB(150, 100, 60);
        sChromaAnimationAPI.fillZeroColorAllFramesName(baseLayer, ground);
        sChromaAnimationAPI.setChromaCustomFlagName(baseLayer, true);
        sChromaAnimationAPI.setChromaCustomColorAllFramesName(baseLayer);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    public static void showEffect1ChromaLink()
    {
        String baseLayer = getAnimationPath()+"BlackAndWhiteRainbow_ChromaLink.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int color1 = sChromaAnimationAPI.getRGB(150, 100, 60);
        int color2 = sChromaAnimationAPI.getRGB(0, 0, 0);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    public static void showEffect1Headset()
    {
        String baseLayer = getAnimationPath()+"BlackAndWhiteRainbow_Headset.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int color1 = sChromaAnimationAPI.getRGB(150, 100, 60);
        int color2 = sChromaAnimationAPI.getRGB(0, 0, 0);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    public static void showEffect1Mousepad()
    {
        String baseLayer = getAnimationPath()+"BlackAndWhiteRainbow_Mousepad.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int color1 = sChromaAnimationAPI.getRGB(150, 100, 60);
        int color2 = sChromaAnimationAPI.getRGB(0, 0, 0);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    public static void showEffect1Mouse()
    {
        String baseLayer = getAnimationPath()+"BlackAndWhiteRainbow_Mouse.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int color1 = sChromaAnimationAPI.getRGB(150, 100, 60);
        int color2 = sChromaAnimationAPI.getRGB(0, 0, 0);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    public static void showEffect2()
    {
        String baseLayer = getAnimationPath()+"Blank_Keyboard.chroma";
        String layer2 = getAnimationPath()+"Block4_Keyboard.chroma";
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
    public static void showEffect2ChromaLink()
    {
        String baseLayer = getAnimationPath()+"BlackAndWhiteRainbow_ChromaLink.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int color1 = sChromaAnimationAPI.getRGB(60, 40, 20);
        int color2 = sChromaAnimationAPI.getRGB(170, 102, 15);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    public static void showEffect2Headset()
    {
        String baseLayer = getAnimationPath()+"BlackAndWhiteRainbow_Headset.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int color1 = sChromaAnimationAPI.getRGB(60, 40, 20);
        int color2 = sChromaAnimationAPI.getRGB(170, 102, 15);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    public static void showEffect2Mousepad()
    {
        String baseLayer = getAnimationPath()+"BlackAndWhiteRainbow_Mousepad.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int color1 = sChromaAnimationAPI.getRGB(60, 40, 20);
        int color2 = sChromaAnimationAPI.getRGB(170, 102, 15);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    public static void showEffect2Mouse()
    {
        String baseLayer = getAnimationPath()+"BlackAndWhiteRainbow_Mouse.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int color1 = sChromaAnimationAPI.getRGB(60, 40, 20);
        int color2 = sChromaAnimationAPI.getRGB(170, 102, 15);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    public static void showEffect3()
    {
        String baseLayer = getAnimationPath()+"Blank_Keyboard.chroma";
        String layer2 = getAnimationPath()+"Sword1_Keyboard.chroma";
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
    public static void showEffect3ChromaLink()
    {
        String baseLayer = getAnimationPath()+"BlackAndWhiteRainbow_ChromaLink.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int color1 = sChromaAnimationAPI.getRGB(255, 255, 245);
        int color2 = sChromaAnimationAPI.getRGB(127, 127, 127);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    public static void showEffect3Headset()
    {
        String baseLayer = getAnimationPath()+"BlackAndWhiteRainbow_Headset.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int color1 = sChromaAnimationAPI.getRGB(255, 255, 245);
        int color2 = sChromaAnimationAPI.getRGB(127, 127, 127);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    public static void showEffect3Mousepad()
    {
        String baseLayer = getAnimationPath()+"BlackAndWhiteRainbow_Mousepad.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int color1 = sChromaAnimationAPI.getRGB(255, 255, 245);
        int color2 = sChromaAnimationAPI.getRGB(127, 127, 127);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    public static void showEffect3Mouse()
    {
        String baseLayer = getAnimationPath()+"BlackAndWhiteRainbow_Mouse.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int color1 = sChromaAnimationAPI.getRGB(255, 255, 245);
        int color2 = sChromaAnimationAPI.getRGB(127, 127, 127);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    public static void showEffect4()
    {
        String baseLayer = getAnimationPath()+"Blank_Keyboard.chroma";
        String layer2 = getAnimationPath()+"Block3_Keyboard.chroma";
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
    public static void showEffect4ChromaLink()
    {
        String baseLayer = getAnimationPath()+"BlackAndWhiteRainbow_ChromaLink.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        sChromaAnimationAPI.reverseAllFramesName(baseLayer);
        int color1 = sChromaAnimationAPI.getRGB(255, 0, 0);
        int color2 = sChromaAnimationAPI.getRGB(0, 45, 45);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    public static void showEffect4Headset()
    {
        String baseLayer = getAnimationPath()+"BlackAndWhiteRainbow_Headset.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        sChromaAnimationAPI.reverseAllFramesName(baseLayer);
        int color1 = sChromaAnimationAPI.getRGB(255, 0, 0);
        int color2 = sChromaAnimationAPI.getRGB(0, 45, 45);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    public static void showEffect4Mousepad()
    {
        String baseLayer = getAnimationPath()+"BlackAndWhiteRainbow_Mousepad.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        sChromaAnimationAPI.reverseAllFramesName(baseLayer);
        int color1 = sChromaAnimationAPI.getRGB(255, 0, 0);
        int color2 = sChromaAnimationAPI.getRGB(0, 45, 45);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    public static void showEffect4Mouse()
    {
        String baseLayer = getAnimationPath()+"BlackAndWhiteRainbow_Mouse.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        sChromaAnimationAPI.reverseAllFramesName(baseLayer);
        int color1 = sChromaAnimationAPI.getRGB(255, 0, 0);
        int color2 = sChromaAnimationAPI.getRGB(0, 45, 45);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    public static void showEffect5()
    {
        String baseLayer = getAnimationPath()+"Blank_Keyboard.chroma";
        String layer2 = getAnimationPath()+"Bow1_Keyboard.chroma";
        String layer3 = getAnimationPath()+"Fireball1_Keyboard.chroma";
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
    public static void showEffect5ChromaLink()
    {
        String baseLayer = getAnimationPath()+"Blank_ChromaLink.chroma";
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
    public static void showEffect5Headset()
    {
        String baseLayer = getAnimationPath()+"Blank_Headset.chroma";
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
    public static void showEffect5Mousepad()
    {
        String baseLayer = getAnimationPath()+"Blank_Mousepad.chroma";
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
    public static void showEffect5Mouse()
    {
        String baseLayer = getAnimationPath()+"Blank_Mouse.chroma";
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
    public static void showEffect6()
    {
        String baseLayer = getAnimationPath()+"Blank_Keyboard.chroma";
        String layer2 = getAnimationPath()+"Train1_Keyboard.chroma";
        String layer3 = getAnimationPath()+"Train2_Keyboard.chroma";
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
    public static void showEffect6ChromaLink()
    {
        String baseLayer = getAnimationPath()+"Blank_ChromaLink.chroma";
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
    public static void showEffect6Headset()
    {
        String baseLayer = getAnimationPath()+"Blank_Headset.chroma";
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
    public static void showEffect6Mousepad()
    {
        String baseLayer = getAnimationPath()+"Blank_Mousepad.chroma";
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
    public static void showEffect6Mouse()
    {
        String baseLayer = getAnimationPath()+"Blank_Mouse.chroma";
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
    public static void showEffect7()
    {
        String baseLayer = getAnimationPath()+"Blank_Keyboard.chroma";
        String layer2 = getAnimationPath()+"Block3_Keyboard.chroma";
        String layer3 = getAnimationPath()+"Reticle1_Keyboard.chroma";
        String layer4 = getAnimationPath()+"Reticle2_Keyboard.chroma";
        String layer5 = getAnimationPath()+"Reticle3_Keyboard.chroma";
        String layer6 = getAnimationPath()+"Reticle4_Keyboard.chroma";
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
    public static void showEffect7ChromaLink()
    {
        String baseLayer = getAnimationPath()+"BlackAndWhiteRainbow_ChromaLink.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int color1 = sChromaAnimationAPI.getRGB(0, 45, 45);
        int color2 = sChromaAnimationAPI.getRGB(249, 194, 126);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    public static void showEffect7Headset()
    {
        String baseLayer = getAnimationPath()+"BlackAndWhiteRainbow_Headset.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int color1 = sChromaAnimationAPI.getRGB(0, 45, 45);
        int color2 = sChromaAnimationAPI.getRGB(249, 194, 126);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    public static void showEffect7Mousepad()
    {
        String baseLayer = getAnimationPath()+"BlackAndWhiteRainbow_Mousepad.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int color1 = sChromaAnimationAPI.getRGB(0, 45, 45);
        int color2 = sChromaAnimationAPI.getRGB(249, 194, 126);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    public static void showEffect7Mouse()
    {
        String baseLayer = getAnimationPath()+"BlackAndWhiteRainbow_Mouse.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        int color1 = sChromaAnimationAPI.getRGB(0, 45, 45);
        int color2 = sChromaAnimationAPI.getRGB(249, 194, 126);
        sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
        sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    public static void showEffect8()
    {
        String baseLayer = getAnimationPath()+"Blank_Keyboard.chroma";
        String layer2 = getAnimationPath()+"Block3_Keyboard.chroma";
        String layer3 = getAnimationPath()+"UpParticle1_Keyboard.chroma";
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
    public static void showEffect8ChromaLink()
    {
        String baseLayer = getAnimationPath()+"Blank_ChromaLink.chroma";
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
    public static void showEffect8Headset()
    {
        String baseLayer = getAnimationPath()+"Blank_Headset.chroma";
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
    public static void showEffect8Mousepad()
    {
        String baseLayer = getAnimationPath()+"Blank_Mousepad.chroma";
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
    public static void showEffect8Mouse()
    {
        String baseLayer = getAnimationPath()+"Blank_Mouse.chroma";
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
    public static void showEffect9()
    {
        String baseLayer = getAnimationPath()+"Blank_Keyboard.chroma";
        String layer2 = getAnimationPath()+"Ladder1_Keyboard.chroma";
        String layer3 = getAnimationPath()+"Ladder2_Keyboard.chroma";
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
    public static void showEffect9ChromaLink()
    {
        String baseLayer = getAnimationPath()+"Blank_ChromaLink.chroma";
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
    public static void showEffect9Headset()
    {
        String baseLayer = getAnimationPath()+"Blank_Headset.chroma";
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
    public static void showEffect9Mousepad()
    {
        String baseLayer = getAnimationPath()+"Blank_Mousepad.chroma";
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
    public static void showEffect9Mouse()
    {
        String baseLayer = getAnimationPath()+"Blank_Mouse.chroma";
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
    public static void showEffect10()
    {
        String baseLayer = getAnimationPath()+"Blank_Keyboard.chroma";
        String layer2 = getAnimationPath()+"Heart1_Keyboard.chroma";
        String layer3 = getAnimationPath()+"ReactiveSpace_Keyboard.chroma";
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
    public static void showEffect10ChromaLink()
    {
        String baseLayer = getAnimationPath()+"Blank_ChromaLink.chroma";
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
    public static void showEffect10Headset()
    {
        String baseLayer = getAnimationPath()+"Blank_Headset.chroma";
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
    public static void showEffect10Mousepad()
    {
        String baseLayer = getAnimationPath()+"Blank_Mousepad.chroma";
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
    public static void showEffect10Mouse()
    {
        String baseLayer = getAnimationPath()+"Blank_Mouse.chroma";
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
    public static void showEffect11()
    {
        String baseLayer = getAnimationPath()+"Blank_Keyboard.chroma";
        String layer2 = getAnimationPath()+"Ladder1_Keyboard.chroma";
        String layer3 = getAnimationPath()+"Ladder2_Keyboard.chroma";
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
    public static void showEffect11ChromaLink()
    {
        String baseLayer = getAnimationPath()+"Blank_ChromaLink.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        sChromaAnimationAPI.fillRandomColorsAllFramesName(baseLayer);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    public static void showEffect11Headset()
    {
        String baseLayer = getAnimationPath()+"Blank_Headset.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        sChromaAnimationAPI.fillRandomColorsAllFramesName(baseLayer);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    public static void showEffect11Mousepad()
    {
        String baseLayer = getAnimationPath()+"Blank_Mousepad.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        sChromaAnimationAPI.fillRandomColorsAllFramesName(baseLayer);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    public static void showEffect11Mouse()
    {
        String baseLayer = getAnimationPath()+"Blank_Mouse.chroma";
        sChromaAnimationAPI.closeAnimationName(baseLayer);
        sChromaAnimationAPI.getAnimation(baseLayer);
        sChromaAnimationAPI.fillRandomColorsAllFramesName(baseLayer);
        sChromaAnimationAPI.playAnimationName(baseLayer, true);
    }
    public static void showEffect12()
    {
        String baseLayer = getAnimationPath()+"Blank_Keyboard.chroma";
        String layer2 = getAnimationPath()+"Sword1_Keyboard.chroma";
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
    public static void showEffect12ChromaLink()
    {
        String baseLayer = getAnimationPath()+"Blank_ChromaLink.chroma";
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
    public static void showEffect12Headset()
    {
        String baseLayer = getAnimationPath()+"Blank_Headset.chroma";
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
    public static void showEffect12Mousepad()
    {
        String baseLayer = getAnimationPath()+"Blank_Mousepad.chroma";
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
    public static void showEffect12Mouse()
    {
        String baseLayer = getAnimationPath()+"Blank_Mouse.chroma";
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
    public static void showEffect13()
    {
        String baseLayer = getAnimationPath()+"Blank_Keyboard.chroma";
        String layer2 = getAnimationPath()+"Chest1_Keyboard.chroma";
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
    public static void showEffect13ChromaLink()
    {
        String baseLayer = getAnimationPath()+"Blank_ChromaLink.chroma";
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
    public static void showEffect13Headset()
    {
        String baseLayer = getAnimationPath()+"Blank_Headset.chroma";
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
    public static void showEffect13Mousepad()
    {
        String baseLayer = getAnimationPath()+"Blank_Mousepad.chroma";
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
    public static void showEffect13Mouse()
    {
        String baseLayer = getAnimationPath()+"Blank_Mouse.chroma";
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
    public static void showEffect14()
    {
        String baseLayer = getAnimationPath()+"Blank_Keyboard.chroma";
        String layer2 = getAnimationPath()+"Spiral_Keyboard.chroma";
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
    public static void showEffect14ChromaLink()
    {
        String baseLayer = getAnimationPath()+"Blank_ChromaLink.chroma";
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
    public static void showEffect14Headset()
    {
        String baseLayer = getAnimationPath()+"Blank_Headset.chroma";
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
    public static void showEffect14Mousepad()
    {
        String baseLayer = getAnimationPath()+"Blank_Mousepad.chroma";
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
    public static void showEffect14Mouse()
    {
        String baseLayer = getAnimationPath()+"Blank_Mouse.chroma";
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
    public static void showEffect15()
    {
        String baseLayer = getAnimationPath()+"Blank_Keyboard.chroma";
        String layer2 = getAnimationPath()+"Bird1_Keyboard.chroma";
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
    public static void showEffect15ChromaLink()
    {
        String baseLayer = getAnimationPath()+"Blank_ChromaLink.chroma";
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
    public static void showEffect15Headset()
    {
        String baseLayer = getAnimationPath()+"Blank_Headset.chroma";
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
    public static void showEffect15Mousepad()
    {
        String baseLayer = getAnimationPath()+"Blank_Mousepad.chroma";
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
    public static void showEffect15Mouse()
    {
        String baseLayer = getAnimationPath()+"Blank_Mouse.chroma";
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
    public static void showEffect16()
    {
        String baseLayer = getAnimationPath()+"Blank_Keyboard.chroma";
        String layer2 = getAnimationPath()+"Spiral_Keyboard.chroma";
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
    public static void showEffect16ChromaLink()
    {
        String baseLayer = getAnimationPath()+"Blank_ChromaLink.chroma";
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
    public static void showEffect16Headset()
    {
        String baseLayer = getAnimationPath()+"Blank_Headset.chroma";
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
    public static void showEffect16Mousepad()
    {
        String baseLayer = getAnimationPath()+"Blank_Mousepad.chroma";
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
    public static void showEffect16Mouse()
    {
        String baseLayer = getAnimationPath()+"Blank_Mouse.chroma";
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
    public static void showEffect17()
    {
        String baseLayer = getAnimationPath()+"Blank_Keyboard.chroma";
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
    public static void showEffect17ChromaLink()
    {
        String baseLayer = getAnimationPath()+"Blank_ChromaLink.chroma";
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
    public static void showEffect17Headset()
    {
        String baseLayer = getAnimationPath()+"Blank_Headset.chroma";
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
    public static void showEffect17Mousepad()
    {
        String baseLayer = getAnimationPath()+"Blank_Mousepad.chroma";
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
    public static void showEffect17Mouse()
    {
        String baseLayer = getAnimationPath()+"Blank_Mouse.chroma";
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
    public static void showEffect18()
    {
        String baseLayer = getAnimationPath()+"Blank_Keyboard.chroma";
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
    public static void showEffect18ChromaLink()
    {
        String baseLayer = getAnimationPath()+"Blank_ChromaLink.chroma";
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
    public static void showEffect18Headset()
    {
        String baseLayer = getAnimationPath()+"Blank_Headset.chroma";
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
    public static void showEffect18Mousepad()
    {
        String baseLayer = getAnimationPath()+"Blank_Mousepad.chroma";
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
    public static void showEffect18Mouse()
    {
        String baseLayer = getAnimationPath()+"Blank_Mouse.chroma";
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
    public static void showEffect19()
    {
        String baseLayer = getAnimationPath()+"Blank_Keyboard.chroma";
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
    public static void showEffect19ChromaLink()
    {
        String baseLayer = getAnimationPath()+"Blank_ChromaLink.chroma";
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
    public static void showEffect19Headset()
    {
        String baseLayer = getAnimationPath()+"Blank_Headset.chroma";
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
    public static void showEffect19Mousepad()
    {
        String baseLayer = getAnimationPath()+"Blank_Mousepad.chroma";
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
    public static void showEffect19Mouse()
    {
        String baseLayer = getAnimationPath()+"Blank_Mouse.chroma";
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
    public static void showEffect20()
    {
        String baseLayer = getAnimationPath()+"Blank_Keyboard.chroma";
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
    public static void showEffect20ChromaLink()
    {
        String baseLayer = getAnimationPath()+"Blank_ChromaLink.chroma";
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
    public static void showEffect20Headset()
    {
        String baseLayer = getAnimationPath()+"Blank_Headset.chroma";
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
    public static void showEffect20Mousepad()
    {
        String baseLayer = getAnimationPath()+"Blank_Mousepad.chroma";
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
    public static void showEffect20Mouse()
    {
        String baseLayer = getAnimationPath()+"Blank_Mouse.chroma";
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
    public static void showEffect21()
    {
        String baseLayer = getAnimationPath()+"Blank_Keyboard.chroma";
        String layer2 = getAnimationPath()+"Particle1_Keyboard.chroma";
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
    public static void showEffect21ChromaLink()
    {
        String baseLayer = getAnimationPath()+"Blank_ChromaLink.chroma";
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
    public static void showEffect21Headset()
    {
        String baseLayer = getAnimationPath()+"Blank_Headset.chroma";
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
    public static void showEffect21Mousepad()
    {
        String baseLayer = getAnimationPath()+"Blank_Mousepad.chroma";
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
    public static void showEffect21Mouse()
    {
        String baseLayer = getAnimationPath()+"Blank_Mouse.chroma";
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
    public static void showEffect22()
    {
        String baseLayer = getAnimationPath()+"Blank_Keyboard.chroma";
        String layer2 = getAnimationPath()+"UpParticle3_Keyboard.chroma";
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
    public static void showEffect22ChromaLink()
    {
        String baseLayer = getAnimationPath()+"Blank_ChromaLink.chroma";
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
    public static void showEffect22Headset()
    {
        String baseLayer = getAnimationPath()+"Blank_Headset.chroma";
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
    public static void showEffect22Mousepad()
    {
        String baseLayer = getAnimationPath()+"Blank_Mousepad.chroma";
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
    public static void showEffect22Mouse()
    {
        String baseLayer = getAnimationPath()+"Blank_Mouse.chroma";
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
/*
case 1:
ShowEffect1();
ShowEffect1ChromaLink();
ShowEffect1Headset();
ShowEffect1Mousepad();
ShowEffect1Mouse();
break;
case 2:
ShowEffect2();
ShowEffect2ChromaLink();
ShowEffect2Headset();
ShowEffect2Mousepad();
ShowEffect2Mouse();
break;
case 3:
ShowEffect3();
ShowEffect3ChromaLink();
ShowEffect3Headset();
ShowEffect3Mousepad();
ShowEffect3Mouse();
break;
case 4:
ShowEffect4();
ShowEffect4ChromaLink();
ShowEffect4Headset();
ShowEffect4Mousepad();
ShowEffect4Mouse();
break;
case 5:
ShowEffect5();
ShowEffect5ChromaLink();
ShowEffect5Headset();
ShowEffect5Mousepad();
ShowEffect5Mouse();
break;
case 6:
ShowEffect6();
ShowEffect6ChromaLink();
ShowEffect6Headset();
ShowEffect6Mousepad();
ShowEffect6Mouse();
break;
case 7:
ShowEffect7();
ShowEffect7ChromaLink();
ShowEffect7Headset();
ShowEffect7Mousepad();
ShowEffect7Mouse();
break;
case 8:
ShowEffect8();
ShowEffect8ChromaLink();
ShowEffect8Headset();
ShowEffect8Mousepad();
ShowEffect8Mouse();
break;
case 9:
ShowEffect9();
ShowEffect9ChromaLink();
ShowEffect9Headset();
ShowEffect9Mousepad();
ShowEffect9Mouse();
break;
case 10:
ShowEffect10();
ShowEffect10ChromaLink();
ShowEffect10Headset();
ShowEffect10Mousepad();
ShowEffect10Mouse();
break;
case 11:
ShowEffect11();
ShowEffect11ChromaLink();
ShowEffect11Headset();
ShowEffect11Mousepad();
ShowEffect11Mouse();
break;
case 12:
ShowEffect12();
ShowEffect12ChromaLink();
ShowEffect12Headset();
ShowEffect12Mousepad();
ShowEffect12Mouse();
break;
case 13:
ShowEffect13();
ShowEffect13ChromaLink();
ShowEffect13Headset();
ShowEffect13Mousepad();
ShowEffect13Mouse();
break;
case 14:
ShowEffect14();
ShowEffect14ChromaLink();
ShowEffect14Headset();
ShowEffect14Mousepad();
ShowEffect14Mouse();
break;
case 15:
ShowEffect15();
ShowEffect15ChromaLink();
ShowEffect15Headset();
ShowEffect15Mousepad();
ShowEffect15Mouse();
break;
*/

}
