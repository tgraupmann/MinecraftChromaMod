# Minecraft Chroma Mod

This Mod is built with [MinecraftForge](https://minecraftforge.net) and displays `Chroma RGB` effects for various game events.

[JChromaSDK.java](https://github.com/tgraupmann/MinecraftChromaMod/blob/master/src/main/java/com/razer/java/JChromaSDK.java) exposes the C++ `CChromaEditor` library functions for `Java`.

`JChromaSDK` is able to play Razer Chroma animations from the [Project Resources](https://github.com/tgraupmann/MinecraftChromaMod/tree/master/src/main/resources/Animations).


## Table of Contents

* [See Also](#see-also)
* [Videos](#videos)
* [Quick Setup](#quick-setup)

## See Also

**Docs:**

- [Chroma Animation Guide](http://chroma.razer.com/ChromaGuide/) - Visual examples of the Chroma Animation API methods

**Apps:**

- [ChromaClientForDiscord](https://github.com/tgraupmann/ChromaDiscordApp) - Add Chroma lighting to the Discord App events

- [ChromaClientForMixer](https://github.com/tgraupmann/ChromaClientForMixer) - Add Chroma lighting to the Mixer streaming experience

- [ChromaClientForTwitch](https://github.com/tgraupmann/ChromaTwitchExtension) - Add Chroma lighting to the Twitch streaming experience

**Plugins:**

- [CChromaEditor](https://github.com/RazerOfficial/CChromaEditor) - C++ native MFC library for playing and editing Chroma animations

- [GameMakerChromaExtension](https://github.com/RazerOfficial/GameMakerChromaExtension) - GameMaker extension to control lighting for Razer Chroma

- [HTML5ChromaSDK](https://github.com/RazerOfficial/HTML5ChromaSDK) - JavaScript library for playing Chroma animations

- [UE4_XDK_SampleApp](https://github.com/razerofficial/UE4_XDK_SampleApp) - UE4 Chroma samples and runtime module with Blueprint library for the ChromaSDK

- [UnityNativeChromaSDK](https://github.com/RazerOfficial/UnityNativeChromaSDK) - Unity native library for the ChromaSDK


## Videos ##

**Intro Video**

<a target="_blank" href="https://youtu.be/0Y731q8HrPs"><img src="https://img.youtube.com/vi/0Y731q8HrPs/0.jpg"></a>


**More Chroma Effects**

<a target="_blank" href="https://youtu.be/7Ey3PRJa72Y"><img src="https://img.youtube.com/vi/7Ey3PRJa72Y/0.jpg"></a>

**Weather**

<a target="_blank" href="https://youtu.be/kFtd75cmfeo"><img src="https://img.youtube.com/vi/kFtd75cmfeo/0.jpg"></a>


## Quick Setup

* Install [JDK 1.8 or better](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)

* Set the `JAVA_HOME` environment variable to the path of the 64-bit version of the JDK. Gradle will report out of memory with the 32-bit JDK version which can be fixed in the `gradle.properties` file if you have to.

* Install the latest MinecraftForge server and client using the [Windows Installer for 1.14](https://files.minecraftforge.net/maven/net/minecraftforge/forge/index_1.14.4.html)


**Upgrade Gradle to 5.6.1 or better**

```
gradlew wrapper --gradle-version=5.6.1﻿
```


**Check the Gradle Version**

```
gradlew -v
```


**Generate Eclipse Project**

```
gradlew eclipse
```


**Start the mod**

```
gradlew runClient
```

## Support

Contact `Tim Graupmann#0611` on Discord for mod support.
