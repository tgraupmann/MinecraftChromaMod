[Setup]
AppName=Chroma Minecraft Mod
AppVerName=Chroma Minecraft Mod 1.0
AppPublisher=Razer US Ltd.
AppPublisherURL=https://razer.com
AppSupportURL=https://support.razer.com
AppUpdatesURL=https://razer.com
DefaultDirName={userappdata}\.minecraft\mods\MinecraftChromaMod
DefaultGroupName=Razer\MinecraftChromaMod
OutputBaseFilename=SetupMinecraftChromaMod
SetupIconFile=release_icon.ico
UninstallDisplayIcon=release_icon.ico
Compression=lzma
SolidCompression=yes
InfoBeforeFile=LICENSE.txt

[Languages]
Name: "english"; MessagesFile: "compiler:Default.isl"

[Files]
Source: "build\_renameJarInPlace_6\output.jar"; DestDir: "{userappdata}\.minecraft\mods"; DestName: "modid-1.0.jar"; CopyMode: alwaysoverwrite
Source: "run\mods\MinecraftChromaMod\*.dll"; DestDir: "{userappdata}\.minecraft\mods\MinecraftChromaMod"; CopyMode: alwaysoverwrite
Source: "run\mods\MinecraftChromaMod\Animations\*.chroma"; DestDir: "{userappdata}\.minecraft\mods\MinecraftChromaMod\Animations"; CopyMode: alwaysoverwrite
