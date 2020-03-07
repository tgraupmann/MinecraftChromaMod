# Minecraft Chroma Mod

This Mod is built with [MinecraftForge](https://minecraftforge.net) and displays `Chroma RGB` effects for various game events.


**Intro Video**

<a target="_blank" href="https://youtu.be/0Y731q8HrPs"><img src="https://img.youtube.com/vi/0Y731q8HrPs/0.jpg"></a>


**More Chroma Effects**

<a target="_blank" href="https://youtu.be/7Ey3PRJa72Y"><img src="https://img.youtube.com/vi/7Ey3PRJa72Y/0.jpg"></a>

**Weather**

<a target="_blank" href="https://youtu.be/kFtd75cmfeo"><img src="https://img.youtube.com/vi/kFtd75cmfeo/0.jpg"></a>


## Quick Setup

* Install [JDK 1.8 or better](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)

* Set the `JAVA_HOME` environment variable to the path of the 64-bit version of the JDK. Gradle will report out of memory with the 32-bit JDK version which can be fixed in the `gradle.properties` file if you have to.

* Install the latest MinecraftForge server and client using the [Windows Installer for 1.12](https://files.minecraftforge.net/maven/net/minecraftforge/forge/index_1.12.2.html)


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
