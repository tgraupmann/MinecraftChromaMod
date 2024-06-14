# Minecraft Chroma Mod

This Mod is built with [MinecraftForge](https://minecraftforge.net) and displays `Chroma RGB` effects for various game events.

[JChromaSDK.java](https://github.com/tgraupmann/MinecraftChromaMod/blob/master/src/main/java/com/razer/java/JChromaSDK.java) exposes the C++ `CChromaEditor` library functions for `Java`.

`JChromaSDK` is able to play Razer Chroma animations from the [Project Resources](https://github.com/tgraupmann/MinecraftChromaMod/tree/master/src/main/resources/Animations).

# Latest

* [GamingWave](https://github.com/GamingWave) added support for (MinecraftForge 47.1.0 MInecraft: 1.20.1) on a [fork](https://github.com/GamingWave/ChromaMod).

## Table of Contents

* [See Also](#see-also)
* [Quick Start](#quick-start)
* [Chroma Effects](#chroma-effects)
* [Videos](#videos)
* [Setup and Build](#setup-and-build)


## See Also

* [Minecraft Forge Forums](https://forums.minecraftforge.net/)

* [Minecraft Forge Documentation](https://mcforge.readthedocs.io/en/latest/)

**Docs:**

- [Chroma Animation Guide](http://chroma.razer.com/ChromaGuide/) - Visual examples of the Chroma Animation API methods

- [Java SDK - Chroma Animation Sample App](https://github.com/razerofficial/Java_ChromaSampleApp) - Java port of the effects from the [Chroma Animation Guide](http://chroma.razer.com/ChromaGuide/)

**Mods:**

- [MinecraftChromaMod](https://github.com/tgraupmann/MinecraftChromaMod) - Minecraft Chroma RGB Mod

- [RobloxSampleChromaMod](https://github.com/tgraupmann/RobloxSampleChromaMod) - Roblox Sample Chroma RGB Mod

- [Cpp_RustChromaModClient](https://github.com/tgraupmann/Cpp_RustChromaModClient) - Rust Chroma RGB Mod Client


**Editors:**

- [Web Chroma Editor](https://chroma.razer.com/ChromaEditor/) - Create Chroma RGB Animations


## Quick Start ##

* You may need to migrate your account to a Microsoft Account in order to update the launcher to install 1.17.1.

* Use the Minecraft launcher to use the Minecraft Java Edition

![image_22](images/image_22.png)

* Visit the [Releases Section](https://github.com/tgraupmann/MinecraftChromaMod/releases) to run the installers.

* Use the Minecraft Forge Universal Installer for client and server

* Use the mod installer that matches the Minecraft Forge version

* To run a local Minecraft server modify the `%APPDATA%\.minecraft\eula.txt` to accept.

```
eula=true
```

* To run Minecraft as a dedicated server and use Chroma on the clients, install the [server mod](https://github.com/tgraupmann/MinecraftChromaModServer/releases) on the server.

The client mod with Chroma will be allowed because the `modid` matches on server and client.

* To run a dedicated server, run the following in the `command-prompt`.

```
CD %appdata%\.minecraft
CALL java -Xmx4096M -jar libraries\net\minecraft\server\1.17.1\server-1.17.1.jar nogui
```

* Or put a batch file in your `.minecraft` folder to start the server.

**run_minecraft_server.cmd**
```
CALL java -Xmx4096M -jar libraries\net\minecraft\server\1.17.1\server-1.17.1.jar nogui
```

* The server will not be able to run the client mod. So you'll want to uninstall the client mod on the server and install the server mod on the server.

* Connect to Minecraft dedicated servers using port: `25565`.

![image_24](images/image_24.png)


## Chroma Effects ##

* Base Effect

* Main Menu Effect

* In Water Effect

* Place Block Effect

* Craft Item Effect

* Player Damage Effect

* Fire Arrow Effect

* Kill Pig Effect

* Kill Chicken Effect

* Open Chest Effect

* Open Door Effect

* Close Door Effect

* Sword Attack Effect

* Spawn Fish Effect

* Potion Effect

* Raining Effect

* Snowing Effect

* Ladder Effect

* Riding Cart Effect


## Videos ##


**Setup Video**

<a target="_blank" href="https://youtu.be/v279Tv3RpTM"><img src="https://img.youtube.com/vi/v279Tv3RpTM/0.jpg"></a>



**Intro Video**

<a target="_blank" href="https://youtu.be/0Y731q8HrPs"><img src="https://img.youtube.com/vi/0Y731q8HrPs/0.jpg"></a>


**More Chroma Effects**

<a target="_blank" href="https://youtu.be/7Ey3PRJa72Y"><img src="https://img.youtube.com/vi/7Ey3PRJa72Y/0.jpg"></a>

**Weather**

<a target="_blank" href="https://youtu.be/kFtd75cmfeo"><img src="https://img.youtube.com/vi/kFtd75cmfeo/0.jpg"></a>


## Setup and Build ###

This section is only needed to build a new mod installer or to make changes to the mod.

* Install [JDK 16 or better](https://www.oracle.com/java/technologies/downloads/)

* You can also use [OpenJDK](https://adoptium.net/?variant=openjdk16). Use `Latest release jdk-16.2+7` or better.

![image_9](images/image_9.png)

* The installer can set the JAVA_HOME for you.

![image_23](images/image_23.png)

* Set the `JAVA_HOME` environment variable to the path of the 64-bit version of the JDK. Gradle will report out of memory with the 32-bit JDK version which can be fixed in the `gradle.properties` file if you have to.

The path will vary depending on the JAVA version that you install.

```
JAVA_HOME
C:\Program Files\Eclipse Foundation\jdk-16.0.2.7-hotspot\
```

![image_8](images/image_8.png)

* Install the [Eclipse IDE](https://www.eclipse.org/eclipseide/)

* Install the latest MinecraftForge `server` and `client` using the [Windows Installer](http://files.minecraftforge.net/)

**Above: Install the Server and Client**

* Make sure you do both for the Minecraft Forge handshake to work.

* That means double-click `forge-1.17.1-37.0.108-installer.jar` and use the UI to install both.

![image_10](images/image_10.png)

![image_11](images/image_11.png)

**Get the mod**

* Download the Minecraft Forge [MDK](https://files.minecraftforge.net/net/minecraftforge/forge/)

![image_14](images/image_14.png)

* Extract the MDK to a folder like:
```C:\Public\forge-1.17.1-37.0.108-mdk```

![image_15](images/image_15.png)

* Make sure the path isn't too long to avoid compile errors.

**Check that the MDK can build and run**

* Use Start->Run, enter `cmd`, and press `OK`.

```cmd```

![image_12](images/image_12.png)

* CD to the extracted folder Ie.

```
CD "C:\Public\forge-1.17.1-37.0.108-mdk"
```

![image_16](images/image_16.png)

**Generate Eclipse Project**

```
gradlew genEclipseRuns
```

![image_17](images/image_17.png)

**Start the mod (on the command-line)**

```
gradlew runClient
```

![image_18](images/image_18.png)

## Manually Merge Changes

* With a properly setup developer environment that can compile MCF mods, now we need to make sure the Chroma Mod has the latest updates.

* Compare the `MDK` changes with the `MinecraftChromaMod`

* Unfortunately, every minor .x release will have class name and package namespace changes that need manually merged.

![image_20](images/image_20.png)

![image_21](images/image_21.png)

* Likely there will also be minor build changes that can be copied over.

* Use [Winmerge](https://winmerge.org/) or your favorite diff tool to manually merge in those changes.

![image_19](images/image_19.png)

* With all the changes merged, you can continue to build the Chroma mod.

**Now repeat the steps to run the Chroma MOD sample**

* Open a command-prompt and navigate to the project checkout folder for *this* repository. Wherever you cloned - https://github.com/tgraupmann/MinecraftChromaMod

* Use Start->Run, enter `cmd`, and press `OK`.

```cmd```

![image_12](images/image_12.png)

* CD to the checkout folder Ie.

```
CD "C:\Public\MinecraftChromaMod"
```

![image_13](images/image_13.png)

**Generate Eclipse Project**

```
gradlew genEclipseRuns
```

**Launch Eclipse**

**Use the `File->Import` menu item**

![image_1](images/image_1.png)

**Select `Gradle\Existing Gradle Project` and click `Next`**

![image_2](images/image_2.png)

**Browse to the `MinecraftChromaMod` folder and click `Finish`**

![image_3](images/image_3.png)

**If the import is successful, the project shouldn't have any compile errors.**

![image_4](images/image_4.png)

**Use the `Run` toolbar drop down**

![image_5](images/image_5.png)

**Select `Run Configurations...`**

![image_6](images/image_6.png)

**Start the mod (from Eclipse)**

* Select the `Java Application` -&gt; `runClient` and click `Run`

![image_7](images/image_7.png)

**Start the mod (on the command-line)**

```
gradlew runClient
```

**Build the `build\libs\modid-1.0.jar`**

```
gradlew build
```

**Build the installer with InnoSetup**

# Support

Support is available on Discord, you can reach me at `tgraupmann`.
