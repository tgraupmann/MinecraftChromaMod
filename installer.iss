[Setup]
AppName=Chroma Minecraft Mod
AppVerName=Chroma Minecraft Mod 1.1
AppPublisher=Razer US Ltd.
AppPublisherURL=https://razer.com
AppSupportURL=https://support.razer.com
AppUpdatesURL=https://razer.com
DefaultDirName={userappdata}\.minecraft\mods\MinecraftChromaMod
DefaultGroupName=Razer\MinecraftChromaMod
OutputBaseFilename=SetupMinecraftChromaMod-forge-1.17.1-37.0.27-mdk
SetupIconFile=release_icon.ico
UninstallDisplayIcon=release_icon.ico
Compression=lzma
SolidCompression=yes
InfoBeforeFile=LICENSE.txt

[Languages]
Name: "english"; MessagesFile: "compiler:Default.isl"

[Files]
Source: "build\libs\modid-1.0.jar"; DestDir: "{userappdata}\.minecraft\mods"; CopyMode: alwaysoverwrite
Source: "run\mods\MinecraftChromaMod\*.dll"; DestDir: "{userappdata}\.minecraft\mods\MinecraftChromaMod"; CopyMode: alwaysoverwrite
Source: "run\mods\MinecraftChromaMod\Animations\*.chroma"; DestDir: "{userappdata}\.minecraft\mods\MinecraftChromaMod\Animations"; CopyMode: alwaysoverwrite
