package org.jglr.jchroma.devices;

import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

public class DeviceInfos {

    private final DeviceInfosStruct struct;

    public DeviceInfos() {
        struct = new DeviceInfosStruct();
    }

    public boolean isConnected() {
        return struct.isConnected == 1;
    }

    public EnumDeviceType getType() {
        return EnumDeviceType.values()[struct.type];
    }

    public DeviceInfosStruct getUnderlyingStructure() {
        return struct;
    }

    public class DeviceInfosStruct extends Structure implements Structure.ByReference {

        public int type;
        public int isConnected;

        @Override
        protected List<String> getFieldOrder() {
            return Arrays.asList("type", "isConnected");
        }
    }

}
