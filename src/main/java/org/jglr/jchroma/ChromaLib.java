package org.jglr.jchroma;

import com.sun.jna.Library;
import com.sun.jna.Pointer;
import org.jglr.jchroma.devices.DeviceInfos;
import org.jglr.jchroma.devices.GUIDStruct;

/**
 * Wrapper used by JNA to load Razer Chroma SDK libraries.
 */
interface ChromaLib extends Library {

    int Init();
    int UnInit();
    int CreateChromaLinkEffect(int type, Pointer param, Pointer effectID);
    int CreateHeadsetEffect(int type, Pointer param, Pointer effectID);
    int CreateKeyboardEffect(int type, Pointer param, Pointer effectID);
    int CreateKeypadEffect(int type, Pointer param, Pointer effectID);
    int CreateMouseEffect(int type, Pointer param, Pointer effectID);
    int CreateMousepadEffect(int type, Pointer param, Pointer effectID);
    int QueryDevice(GUIDStruct struct, DeviceInfos.DeviceInfosStruct infos);

}
