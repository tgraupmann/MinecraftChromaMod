package com.razer.java;

import java.nio.charset.StandardCharsets;
import org.jglr.jchroma.devices.DeviceInfos;
import org.jglr.jchroma.devices.GUIDStruct;
import com.sun.jna.Native;
import com.sun.jna.Pointer;

/**
 * Entry point of the API, allows to create effects for the device and query Razer devices
 */
public class JChromaSDK {

    private static JChromaSDK instance;
    private final JChromaLib wrapper;

    private JChromaSDK() {
        String libName = "CChromaEditorLibrary";
        if (System.getProperty("os.arch").contains("64"))
        {
            libName += "64";
        }
        String cd = System.getProperty("user.dir");
        //System.out.println("********* JChromaSDK: cd="+cd);
        String path = cd + "\\mods\\MinecraftChromaMod";
        //System.out.println("********* JChromaSDK: path="+path);
        String fullPath = path + "\\" + libName;
        //System.out.println("********* JChromaSDK: fullPath="+fullPath);
        wrapper = (JChromaLib)Native.loadLibrary(fullPath, JChromaLib.class);
    }

    /**
     * Returns the <code>JChroma</code> singleton. One must be warned that this method performs
     * lazy initialization and that loading the native files is done at initialization
     * @return
     *          The JChroma singleton
     */
    public static JChromaSDK getInstance()
    {
        if (instance == null)
            instance = new JChromaSDK();
        return instance;
    }
                
    public static class Keyboard {
    	//! Definitions of keys.
    	public enum RZKEY
    	{
    	    RZKEY_ESC(0x0001),                 /*!< Esc (VK_ESCAPE) */
    	    RZKEY_F1(0x0003),                  /*!< F1 (VK_F1) */
    	    RZKEY_F2(0x0004),                  /*!< F2 (VK_F2) */
    	    RZKEY_F3(0x0005),                  /*!< F3 (VK_F3) */
    	    RZKEY_F4(0x0006),                  /*!< F4 (VK_F4) */
    	    RZKEY_F5(0x0007),                  /*!< F5 (VK_F5) */
    	    RZKEY_F6(0x0008),                  /*!< F6 (VK_F6) */
    	    RZKEY_F7(0x0009),                  /*!< F7 (VK_F7) */
    	    RZKEY_F8(0x000A),                  /*!< F8 (VK_F8) */
    	    RZKEY_F9(0x000B),                  /*!< F9 (VK_F9) */
    	    RZKEY_F10(0x000C),                 /*!< F10 (VK_F10) */
    	    RZKEY_F11(0x000D),                 /*!< F11 (VK_F11) */
    	    RZKEY_F12(0x000E),                 /*!< F12 (VK_F12) */
    	    RZKEY_1(0x0102),                   /*!< 1 (VK_1) */
    	    RZKEY_2(0x0103),                   /*!< 2 (VK_2) */
    	    RZKEY_3(0x0104),                   /*!< 3 (VK_3) */
    	    RZKEY_4(0x0105),                   /*!< 4 (VK_4) */
    	    RZKEY_5(0x0106),                   /*!< 5 (VK_5) */
    	    RZKEY_6(0x0107),                   /*!< 6 (VK_6) */
    	    RZKEY_7(0x0108),                   /*!< 7 (VK_7) */
    	    RZKEY_8(0x0109),                   /*!< 8 (VK_8) */
    	    RZKEY_9(0x010A),                   /*!< 9 (VK_9) */
    	    RZKEY_0(0x010B),                   /*!< 0 (VK_0) */
    	    RZKEY_A(0x0302),                   /*!< A (VK_A) */
    	    RZKEY_B(0x0407),                   /*!< B (VK_B) */
    	    RZKEY_C(0x0405),                   /*!< C (VK_C) */
    	    RZKEY_D(0x0304),                   /*!< D (VK_D) */
    	    RZKEY_E(0x0204),                   /*!< E (VK_E) */
    	    RZKEY_F(0x0305),                   /*!< F (VK_F) */
    	    RZKEY_G(0x0306),                   /*!< G (VK_G) */
    	    RZKEY_H(0x0307),                   /*!< H (VK_H) */
    	    RZKEY_I(0x0209),                   /*!< I (VK_I) */
    	    RZKEY_J(0x0308),                   /*!< J (VK_J) */
    	    RZKEY_K(0x0309),                   /*!< K (VK_K) */
    	    RZKEY_L(0x030A),                   /*!< L (VK_L) */
    	    RZKEY_M(0x0409),                   /*!< M (VK_M) */
    	    RZKEY_N(0x0408),                   /*!< N (VK_N) */
    	    RZKEY_O(0x020A),                   /*!< O (VK_O) */
    	    RZKEY_P(0x020B),                   /*!< P (VK_P) */
    	    RZKEY_Q(0x0202),                   /*!< Q (VK_Q) */
    	    RZKEY_R(0x0205),                   /*!< R (VK_R) */
    	    RZKEY_S(0x0303),                   /*!< S (VK_S) */
    	    RZKEY_T(0x0206),                   /*!< T (VK_T) */
    	    RZKEY_U(0x0208),                   /*!< U (VK_U) */
    	    RZKEY_V(0x0406),                   /*!< V (VK_V) */
    	    RZKEY_W(0x0203),                   /*!< W (VK_W) */
    	    RZKEY_X(0x0404),                   /*!< X (VK_X) */
    	    RZKEY_Y(0x0207),                   /*!< Y (VK_Y) */
    	    RZKEY_Z(0x0403),                   /*!< Z (VK_Z) */
    	    RZKEY_NUMLOCK(0x0112),             /*!< Numlock (VK_NUMLOCK) */
    	    RZKEY_NUMPAD0(0x0513),             /*!< Numpad 0 (VK_NUMPAD0) */
    	    RZKEY_NUMPAD1(0x0412),             /*!< Numpad 1 (VK_NUMPAD1) */
    	    RZKEY_NUMPAD2(0x0413),             /*!< Numpad 2 (VK_NUMPAD2) */
    	    RZKEY_NUMPAD3(0x0414),             /*!< Numpad 3 (VK_NUMPAD3) */
    	    RZKEY_NUMPAD4(0x0312),             /*!< Numpad 4 (VK_NUMPAD4) */
    	    RZKEY_NUMPAD5(0x0313),             /*!< Numpad 5 (VK_NUMPAD5) */
    	    RZKEY_NUMPAD6(0x0314),             /*!< Numpad 6 (VK_NUMPAD6) */
    	    RZKEY_NUMPAD7(0x0212),             /*!< Numpad 7 (VK_NUMPAD7) */
    	    RZKEY_NUMPAD8(0x0213),             /*!< Numpad 8 (VK_NUMPAD8) */
    	    RZKEY_NUMPAD9(0x0214),             /*!< Numpad 9 (VK_ NUMPAD9*/
    	    RZKEY_NUMPAD_DIVIDE(0x0113),       /*!< Divide (VK_DIVIDE) */
    	    RZKEY_NUMPAD_MULTIPLY(0x0114),     /*!< Multiply (VK_MULTIPLY) */
    	    RZKEY_NUMPAD_SUBTRACT(0x0115),     /*!< Subtract (VK_SUBTRACT) */
    	    RZKEY_NUMPAD_ADD(0x0215),          /*!< Add (VK_ADD) */
    	    RZKEY_NUMPAD_ENTER(0x0415),        /*!< Enter (VK_RETURN - Extended) */
    	    RZKEY_NUMPAD_DECIMAL(0x0514),      /*!< Decimal (VK_DECIMAL) */
    	    RZKEY_PRINTSCREEN(0x000F),         /*!< Print Screen (VK_PRINT) */
    	    RZKEY_SCROLL(0x0010),              /*!< Scroll Lock (VK_SCROLL) */
    	    RZKEY_PAUSE(0x0011),               /*!< Pause (VK_PAUSE) */
    	    RZKEY_INSERT(0x010F),              /*!< Insert (VK_INSERT) */
    	    RZKEY_HOME(0x0110),                /*!< Home (VK_HOME) */
    	    RZKEY_PAGEUP(0x0111),              /*!< Page Up (VK_PRIOR) */
    	    RZKEY_DELETE(0x020f),              /*!< Delete (VK_DELETE) */
    	    RZKEY_END(0x0210),                 /*!< End (VK_END) */
    	    RZKEY_PAGEDOWN(0x0211),            /*!< Page Down (VK_NEXT) */
    	    RZKEY_UP(0x0410),                  /*!< Up (VK_UP) */
    	    RZKEY_LEFT(0x050F),                /*!< Left (VK_LEFT) */
    	    RZKEY_DOWN(0x0510),                /*!< Down (VK_DOWN) */
    	    RZKEY_RIGHT(0x0511),               /*!< Right (VK_RIGHT) */
    	    RZKEY_TAB(0x0201),                 /*!< Tab (VK_TAB) */
    	    RZKEY_CAPSLOCK(0x0301),            /*!< Caps Lock(VK_CAPITAL) */
    	    RZKEY_BACKSPACE(0x010E),           /*!< Backspace (VK_BACK) */
    	    RZKEY_ENTER(0x030E),               /*!< Enter (VK_RETURN) */
    	    RZKEY_LCTRL(0x0501),               /*!< Left Control(VK_LCONTROL) */
    	    RZKEY_LWIN(0x0502),                /*!< Left Window (VK_LWIN) */
    	    RZKEY_LALT(0x0503),                /*!< Left Alt (VK_LMENU) */
    	    RZKEY_SPACE(0x0507),               /*!< Spacebar (VK_SPACE) */
    	    RZKEY_RALT(0x050B),                /*!< Right Alt (VK_RMENU) */
    	    RZKEY_FN(0x050C),                  /*!< Function key. */
    	    RZKEY_RMENU(0x050D),               /*!< Right Menu (VK_APPS) */
    	    RZKEY_RCTRL(0x050E),               /*!< Right Control (VK_RCONTROL) */
    	    RZKEY_LSHIFT(0x0401),              /*!< Left Shift (VK_LSHIFT) */
    	    RZKEY_RSHIFT(0x040E),              /*!< Right Shift (VK_RSHIFT) */
    	    RZKEY_MACRO1(0x0100),              /*!< Macro Key 1 */
    	    RZKEY_MACRO2(0x0200),              /*!< Macro Key 2 */
    	    RZKEY_MACRO3(0x0300),              /*!< Macro Key 3 */
    	    RZKEY_MACRO4(0x0400),              /*!< Macro Key 4 */
    	    RZKEY_MACRO5(0x0500),              /*!< Macro Key 5 */
    	    RZKEY_OEM_1(0x0101),               /*!< ~ (tilde/??/??) (VK_OEM_3) */
    	    RZKEY_OEM_2(0x010C),               /*!< -- (minus) (VK_OEM_MINUS) */
    	    RZKEY_OEM_3(0x010D),               /*!<((equal) (VK_OEM_PLUS) */
    	    RZKEY_OEM_4(0x020C),               /*!< [ (left sqaure bracket) (VK_OEM_4) */
    	    RZKEY_OEM_5(0x020D),               /*!< ] (right square bracket) (VK_OEM_6) */
    	    RZKEY_OEM_6(0x020E),               /*!< \ (backslash) (VK_OEM_5) */
    	    RZKEY_OEM_7(0x030B),               /*!< ; (semi-colon) (VK_OEM_1) */
    	    RZKEY_OEM_8(0x030C),               /*!< ' (apostrophe) (VK_OEM_7) */
    	    RZKEY_OEM_9(0x040A),               /*!< ), (comma) (VK_OEM_COMMA) */
    	    RZKEY_OEM_10(0x040B),              /*!< . (period) (VK_OEM_PERIOD) */
    	    RZKEY_OEM_11(0x040C),              /*!< / (forward slash) (VK_OEM_2) */
    	    RZKEY_EUR_1(0x030D),               /*!< "#" (VK_OEM_5) */
    	    RZKEY_EUR_2(0x0402),               /*!< \ (VK_OEM_102) */
    	    RZKEY_JPN_1(0x0015),               /*!< ¥ (0xFF) */
    	    RZKEY_JPN_2(0x040D),               /*!< \ (0xC1) */
    	    RZKEY_JPN_3(0x0504),               /*!< ??? (VK_OEM_PA1) */
    	    RZKEY_JPN_4(0x0509),               /*!< ?? (0xFF) */
    	    RZKEY_JPN_5(0x050A),               /*!< ????/???? (0xFF) */
    	    RZKEY_KOR_1(0x0015),               /*!< | (0xFF) */
    	    RZKEY_KOR_2(0x030D),               /*!< (VK_OEM_5) */
    	    RZKEY_KOR_3(0x0402),               /*!< (VK_OEM_102) */
    	    RZKEY_KOR_4(0x040D),               /*!< (0xC1) */
    	    RZKEY_KOR_5(0x0504),               /*!< (VK_OEM_PA1) */
    	    RZKEY_KOR_6(0x0509),               /*!< ?/? (0xFF) */
    	    RZKEY_KOR_7(0x050A),               /*!< (0xFF) */
    	    RZKEY_INVALID(0xFFFF);             /*!< Invalid keys. */
    		
    		private final int id;
    		RZKEY(int id) { this.id = id; }
            public int getValue() { return id; }
    	}
    }
    
    public enum Device
    {
        Invalid(-1),
        ChromaLink(0),
        Headset(1),
        Keyboard(2),
        Keypad(3),
        Mouse(4),
        Mousepad(5),
        MAX(6);
        
        private final int id;
        Device(int id) { this.id = id; }
        public int getValue() { return id; }
    }

    public enum Device1D
    {
        Invalid(-1),
        ChromaLink(0),
        Headset(1),
        Mousepad(2),
        MAX(3);
        
        private final int id;
        Device1D(int id) { this.id = id; }
        public int getValue() { return id; }
    }

    public enum Device2D
    {
        Invalid(-1),
        Keyboard(0),
        Keypad(1),
        Mouse(2),
        MAX(3);
        
        private final int id;
        Device2D(int id) { this.id = id; }
        public int getValue() { return id; }
    }
	/*
	Return the sum of colors
	*/
	/// EXPORT_API int PluginAddColor(const int color1, const int color2);
	public int addColor(final int color1, final int color2)
	{
		return wrapper.PluginAddColor(color1, color2);
	}
	/*
	Adds a frame to the `Chroma` animation and sets the `duration` (in seconds). 
	The `color` is expected to be an array of the dimensions for the `deviceType/device`. 
	The `length` parameter is the size of the `color` array. For `EChromaSDKDevice1DEnum` 
	the array size should be `MAX LEDS`. For `EChromaSDKDevice2DEnum` the array 
	size should be `MAX ROW` times `MAX COLUMN`. Returns the animation id upon 
	success. Returns negative one upon failure.
	*/
	/// EXPORT_API int PluginAddFrame(int animationId, float duration, int* colors, int length);
	public int addFrame(int animationId, float duration, Pointer colors, int length)
	{
		return wrapper.PluginAddFrame(animationId, duration, colors, length);
	}
	/*
	Add source color to target where color is not black for frame id, reference 
	source and target by id.
	*/
	/// EXPORT_API void PluginAddNonZeroAllKeys(int sourceAnimationId, int targetAnimationId, int frameId);
	public void addNonZeroAllKeys(int sourceAnimationId, int targetAnimationId, int frameId)
	{
		wrapper.PluginAddNonZeroAllKeys(sourceAnimationId, targetAnimationId, frameId);
	}
	/*
	Add source color to target where color is not black for all frames, reference 
	source and target by id.
	*/
	/// EXPORT_API void PluginAddNonZeroAllKeysAllFrames(int sourceAnimationId, int targetAnimationId);
	public void addNonZeroAllKeysAllFrames(int sourceAnimationId, int targetAnimationId)
	{
		wrapper.PluginAddNonZeroAllKeysAllFrames(sourceAnimationId, targetAnimationId);
	}
	/*
	Add source color to target where color is not black for all frames, reference 
	source and target by name.
	*/
	/// EXPORT_API void PluginAddNonZeroAllKeysAllFramesName(const char* sourceAnimation, const char* targetAnimation);
	public void addNonZeroAllKeysAllFramesName(String sourceAnimation, String targetAnimation)
	{
		wrapper.PluginAddNonZeroAllKeysAllFramesName(sourceAnimation, targetAnimation);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginAddNonZeroAllKeysAllFramesNameD(const char* sourceAnimation, const char* targetAnimation);
	public double addNonZeroAllKeysAllFramesNameD(String sourceAnimation, String targetAnimation)
	{
		return wrapper.PluginAddNonZeroAllKeysAllFramesNameD(sourceAnimation, targetAnimation);
	}
	/*
	Add source color to target where color is not black for all frames starting 
	at offset for the length of the source, reference source and target by 
	id.
	*/
	/// EXPORT_API void PluginAddNonZeroAllKeysAllFramesOffset(int sourceAnimationId, int targetAnimationId, int offset);
	public void addNonZeroAllKeysAllFramesOffset(int sourceAnimationId, int targetAnimationId, int offset)
	{
		wrapper.PluginAddNonZeroAllKeysAllFramesOffset(sourceAnimationId, targetAnimationId, offset);
	}
	/*
	Add source color to target where color is not black for all frames starting 
	at offset for the length of the source, reference source and target by 
	name.
	*/
	/// EXPORT_API void PluginAddNonZeroAllKeysAllFramesOffsetName(const char* sourceAnimation, const char* targetAnimation, int offset);
	public void addNonZeroAllKeysAllFramesOffsetName(String sourceAnimation, String targetAnimation, int offset)
	{
		wrapper.PluginAddNonZeroAllKeysAllFramesOffsetName(sourceAnimation, targetAnimation, offset);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginAddNonZeroAllKeysAllFramesOffsetNameD(const char* sourceAnimation, const char* targetAnimation, double offset);
	public double addNonZeroAllKeysAllFramesOffsetNameD(String sourceAnimation, String targetAnimation, double offset)
	{
		return wrapper.PluginAddNonZeroAllKeysAllFramesOffsetNameD(sourceAnimation, targetAnimation, offset);
	}
	/*
	Add source color to target where color is not black for frame id, reference 
	source and target by name.
	*/
	/// EXPORT_API void PluginAddNonZeroAllKeysName(const char* sourceAnimation, const char* targetAnimation, int frameId);
	public void addNonZeroAllKeysName(String sourceAnimation, String targetAnimation, int frameId)
	{
		wrapper.PluginAddNonZeroAllKeysName(sourceAnimation, targetAnimation, frameId);
	}
	/*
	Add source color to target where color is not black for the source frame 
	and target offset frame, reference source and target by id.
	*/
	/// EXPORT_API void PluginAddNonZeroAllKeysOffset(int sourceAnimationId, int targetAnimationId, int frameId, int offset);
	public void addNonZeroAllKeysOffset(int sourceAnimationId, int targetAnimationId, int frameId, int offset)
	{
		wrapper.PluginAddNonZeroAllKeysOffset(sourceAnimationId, targetAnimationId, frameId, offset);
	}
	/*
	Add source color to target where color is not black for the source frame 
	and target offset frame, reference source and target by name.
	*/
	/// EXPORT_API void PluginAddNonZeroAllKeysOffsetName(const char* sourceAnimation, const char* targetAnimation, int frameId, int offset);
	public void addNonZeroAllKeysOffsetName(String sourceAnimation, String targetAnimation, int frameId, int offset)
	{
		wrapper.PluginAddNonZeroAllKeysOffsetName(sourceAnimation, targetAnimation, frameId, offset);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginAddNonZeroAllKeysOffsetNameD(const char* sourceAnimation, const char* targetAnimation, double frameId, double offset);
	public double addNonZeroAllKeysOffsetNameD(String sourceAnimation, String targetAnimation, double frameId, double offset)
	{
		return wrapper.PluginAddNonZeroAllKeysOffsetNameD(sourceAnimation, targetAnimation, frameId, offset);
	}
	/*
	Add source color to target where the target color is not black for all frames, 
	reference source and target by id.
	*/
	/// EXPORT_API void PluginAddNonZeroTargetAllKeysAllFrames(int sourceAnimationId, int targetAnimationId);
	public void addNonZeroTargetAllKeysAllFrames(int sourceAnimationId, int targetAnimationId)
	{
		wrapper.PluginAddNonZeroTargetAllKeysAllFrames(sourceAnimationId, targetAnimationId);
	}
	/*
	Add source color to target where the target color is not black for all frames, 
	reference source and target by name.
	*/
	/// EXPORT_API void PluginAddNonZeroTargetAllKeysAllFramesName(const char* sourceAnimation, const char* targetAnimation);
	public void addNonZeroTargetAllKeysAllFramesName(String sourceAnimation, String targetAnimation)
	{
		wrapper.PluginAddNonZeroTargetAllKeysAllFramesName(sourceAnimation, targetAnimation);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginAddNonZeroTargetAllKeysAllFramesNameD(const char* sourceAnimation, const char* targetAnimation);
	public double addNonZeroTargetAllKeysAllFramesNameD(String sourceAnimation, String targetAnimation)
	{
		return wrapper.PluginAddNonZeroTargetAllKeysAllFramesNameD(sourceAnimation, targetAnimation);
	}
	/*
	Add source color to target where the target color is not black for all frames 
	starting at offset for the length of the source, reference source and target 
	by id.
	*/
	/// EXPORT_API void PluginAddNonZeroTargetAllKeysAllFramesOffset(int sourceAnimationId, int targetAnimationId, int offset);
	public void addNonZeroTargetAllKeysAllFramesOffset(int sourceAnimationId, int targetAnimationId, int offset)
	{
		wrapper.PluginAddNonZeroTargetAllKeysAllFramesOffset(sourceAnimationId, targetAnimationId, offset);
	}
	/*
	Add source color to target where the target color is not black for all frames 
	starting at offset for the length of the source, reference source and target 
	by name.
	*/
	/// EXPORT_API void PluginAddNonZeroTargetAllKeysAllFramesOffsetName(const char* sourceAnimation, const char* targetAnimation, int offset);
	public void addNonZeroTargetAllKeysAllFramesOffsetName(String sourceAnimation, String targetAnimation, int offset)
	{
		wrapper.PluginAddNonZeroTargetAllKeysAllFramesOffsetName(sourceAnimation, targetAnimation, offset);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginAddNonZeroTargetAllKeysAllFramesOffsetNameD(const char* sourceAnimation, const char* targetAnimation, double offset);
	public double addNonZeroTargetAllKeysAllFramesOffsetNameD(String sourceAnimation, String targetAnimation, double offset)
	{
		return wrapper.PluginAddNonZeroTargetAllKeysAllFramesOffsetNameD(sourceAnimation, targetAnimation, offset);
	}
	/*
	Add source color to target where target color is not blank from the source 
	frame to the target offset frame, reference source and target by id.
	*/
	/// EXPORT_API void PluginAddNonZeroTargetAllKeysOffset(int sourceAnimationId, int targetAnimationId, int frameId, int offset);
	public void addNonZeroTargetAllKeysOffset(int sourceAnimationId, int targetAnimationId, int frameId, int offset)
	{
		wrapper.PluginAddNonZeroTargetAllKeysOffset(sourceAnimationId, targetAnimationId, frameId, offset);
	}
	/*
	Add source color to target where target color is not blank from the source 
	frame to the target offset frame, reference source and target by name.
	*/
	/// EXPORT_API void PluginAddNonZeroTargetAllKeysOffsetName(const char* sourceAnimation, const char* targetAnimation, int frameId, int offset);
	public void addNonZeroTargetAllKeysOffsetName(String sourceAnimation, String targetAnimation, int frameId, int offset)
	{
		wrapper.PluginAddNonZeroTargetAllKeysOffsetName(sourceAnimation, targetAnimation, frameId, offset);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginAddNonZeroTargetAllKeysOffsetNameD(const char* sourceAnimation, const char* targetAnimation, double frameId, double offset);
	public double addNonZeroTargetAllKeysOffsetNameD(String sourceAnimation, String targetAnimation, double frameId, double offset)
	{
		return wrapper.PluginAddNonZeroTargetAllKeysOffsetNameD(sourceAnimation, targetAnimation, frameId, offset);
	}
	/*
	Append all source frames to the target animation, reference source and target 
	by id.
	*/
	/// EXPORT_API void PluginAppendAllFrames(int sourceAnimationId, int targetAnimationId);
	public void appendAllFrames(int sourceAnimationId, int targetAnimationId)
	{
		wrapper.PluginAppendAllFrames(sourceAnimationId, targetAnimationId);
	}
	/*
	Append all source frames to the target animation, reference source and target 
	by name.
	*/
	/// EXPORT_API void PluginAppendAllFramesName(const char* sourceAnimation, const char* targetAnimation);
	public void appendAllFramesName(String sourceAnimation, String targetAnimation)
	{
		wrapper.PluginAppendAllFramesName(sourceAnimation, targetAnimation);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginAppendAllFramesNameD(const char* sourceAnimation, const char* targetAnimation);
	public double appendAllFramesNameD(String sourceAnimation, String targetAnimation)
	{
		return wrapper.PluginAppendAllFramesNameD(sourceAnimation, targetAnimation);
	}
	/*
	`PluginClearAll` will issue a `CLEAR` effect for all devices.
	*/
	/// EXPORT_API void PluginClearAll();
	public void clearAll()
	{
		wrapper.PluginClearAll();
	}
	/*
	`PluginClearAnimationType` will issue a `CLEAR` effect for the given device.
	*/
	/// EXPORT_API void PluginClearAnimationType(int deviceType, int device);
	public void clearAnimationType(int deviceType, int device)
	{
		wrapper.PluginClearAnimationType(deviceType, device);
	}
	/*
	`PluginCloseAll` closes all open animations so they can be reloaded from 
	disk. The set of animations will be stopped if playing.
	*/
	/// EXPORT_API void PluginCloseAll();
	public void closeAll()
	{
		wrapper.PluginCloseAll();
	}
	/*
	Closes the `Chroma` animation to free up resources referenced by id. Returns 
	the animation id upon success. Returns negative one upon failure. This 
	might be used while authoring effects if there was a change necessitating 
	re-opening the animation. The animation id can no longer be used once closed.
	*/
	/// EXPORT_API int PluginCloseAnimation(int animationId);
	public int closeAnimation(int animationId)
	{
		return wrapper.PluginCloseAnimation(animationId);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginCloseAnimationD(double animationId);
	public double closeAnimationD(double animationId)
	{
		return wrapper.PluginCloseAnimationD(animationId);
	}
	/*
	Closes the `Chroma` animation referenced by name so that the animation can 
	be reloaded from disk.
	*/
	/// EXPORT_API void PluginCloseAnimationName(const char* path);
	public void closeAnimationName(String path)
	{
		wrapper.PluginCloseAnimationName(path);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginCloseAnimationNameD(const char* path);
	public double closeAnimationNameD(String path)
	{
		return wrapper.PluginCloseAnimationNameD(path);
	}
	/*
	`PluginCloseComposite` closes a set of animations so they can be reloaded 
	from disk. The set of animations will be stopped if playing.
	*/
	/// EXPORT_API void PluginCloseComposite(const char* name);
	public void closeComposite(String name)
	{
		wrapper.PluginCloseComposite(name);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginCloseCompositeD(const char* name);
	public double closeCompositeD(String name)
	{
		return wrapper.PluginCloseCompositeD(name);
	}
	/*
	Copy source animation to target animation for the given frame. Source and 
	target are referenced by id.
	*/
	/// EXPORT_API void PluginCopyAllKeys(int sourceAnimationId, int targetAnimationId, int frameId);
	public void copyAllKeys(int sourceAnimationId, int targetAnimationId, int frameId)
	{
		wrapper.PluginCopyAllKeys(sourceAnimationId, targetAnimationId, frameId);
	}
	/*
	Copy source animation to target animation for the given frame. Source and 
	target are referenced by id.
	*/
	/// EXPORT_API void PluginCopyAllKeysName(const char* sourceAnimation, const char* targetAnimation, int frameId);
	public void copyAllKeysName(String sourceAnimation, String targetAnimation, int frameId)
	{
		wrapper.PluginCopyAllKeysName(sourceAnimation, targetAnimation, frameId);
	}
	/*
	Copy animation to named target animation in memory. If target animation 
	exists, close first. Source is referenced by id.
	*/
	/// EXPORT_API int PluginCopyAnimation(int sourceAnimationId, const char* targetAnimation);
	public int copyAnimation(int sourceAnimationId, String targetAnimation)
	{
		return wrapper.PluginCopyAnimation(sourceAnimationId, targetAnimation);
	}
	/*
	Copy animation to named target animation in memory. If target animation 
	exists, close first. Source is referenced by name.
	*/
	/// EXPORT_API void PluginCopyAnimationName(const char* sourceAnimation, const char* targetAnimation);
	public void copyAnimationName(String sourceAnimation, String targetAnimation)
	{
		wrapper.PluginCopyAnimationName(sourceAnimation, targetAnimation);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginCopyAnimationNameD(const char* sourceAnimation, const char* targetAnimation);
	public double copyAnimationNameD(String sourceAnimation, String targetAnimation)
	{
		return wrapper.PluginCopyAnimationNameD(sourceAnimation, targetAnimation);
	}
	/*
	Copy blue channel to other channels for all frames. Intensity range is 0.0 
	to 1.0. Reference the animation by id.
	*/
	/// EXPORT_API void PluginCopyBlueChannelAllFrames(int animationId, float redIntensity, float greenIntensity);
	public void copyBlueChannelAllFrames(int animationId, float redIntensity, float greenIntensity)
	{
		wrapper.PluginCopyBlueChannelAllFrames(animationId, redIntensity, greenIntensity);
	}
	/*
	Copy blue channel to other channels for all frames. Intensity range is 0.0 
	to 1.0. Reference the animation by name.
	*/
	/// EXPORT_API void PluginCopyBlueChannelAllFramesName(const char* path, float redIntensity, float greenIntensity);
	public void copyBlueChannelAllFramesName(String path, float redIntensity, float greenIntensity)
	{
		wrapper.PluginCopyBlueChannelAllFramesName(path, redIntensity, greenIntensity);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginCopyBlueChannelAllFramesNameD(const char* path, double redIntensity, double greenIntensity);
	public double copyBlueChannelAllFramesNameD(String path, double redIntensity, double greenIntensity)
	{
		return wrapper.PluginCopyBlueChannelAllFramesNameD(path, redIntensity, greenIntensity);
	}
	/*
	Copy green channel to other channels for all frames. Intensity range is 
	0.0 to 1.0. Reference the animation by id.
	*/
	/// EXPORT_API void PluginCopyGreenChannelAllFrames(int animationId, float redIntensity, float blueIntensity);
	public void copyGreenChannelAllFrames(int animationId, float redIntensity, float blueIntensity)
	{
		wrapper.PluginCopyGreenChannelAllFrames(animationId, redIntensity, blueIntensity);
	}
	/*
	Copy green channel to other channels for all frames. Intensity range is 
	0.0 to 1.0. Reference the animation by name.
	*/
	/// EXPORT_API void PluginCopyGreenChannelAllFramesName(const char* path, float redIntensity, float blueIntensity);
	public void copyGreenChannelAllFramesName(String path, float redIntensity, float blueIntensity)
	{
		wrapper.PluginCopyGreenChannelAllFramesName(path, redIntensity, blueIntensity);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginCopyGreenChannelAllFramesNameD(const char* path, double redIntensity, double blueIntensity);
	public double copyGreenChannelAllFramesNameD(String path, double redIntensity, double blueIntensity)
	{
		return wrapper.PluginCopyGreenChannelAllFramesNameD(path, redIntensity, blueIntensity);
	}
	/*
	Copy animation key color from the source animation to the target animation 
	for the given frame. Reference the source and target by id.
	*/
	/// EXPORT_API void PluginCopyKeyColor(int sourceAnimationId, int targetAnimationId, int frameId, int rzkey);
	public void copyKeyColor(int sourceAnimationId, int targetAnimationId, int frameId, int rzkey)
	{
		wrapper.PluginCopyKeyColor(sourceAnimationId, targetAnimationId, frameId, rzkey);
	}
	/*
	Copy animation key color from the source animation to the target animation 
	for all frames. Reference the source and target by id.
	*/
	/// EXPORT_API void PluginCopyKeyColorAllFrames(int sourceAnimationId, int targetAnimationId, int rzkey);
	public void copyKeyColorAllFrames(int sourceAnimationId, int targetAnimationId, int rzkey)
	{
		wrapper.PluginCopyKeyColorAllFrames(sourceAnimationId, targetAnimationId, rzkey);
	}
	/*
	Copy animation key color from the source animation to the target animation 
	for all frames. Reference the source and target by name.
	*/
	/// EXPORT_API void PluginCopyKeyColorAllFramesName(const char* sourceAnimation, const char* targetAnimation, int rzkey);
	public void copyKeyColorAllFramesName(String sourceAnimation, String targetAnimation, int rzkey)
	{
		wrapper.PluginCopyKeyColorAllFramesName(sourceAnimation, targetAnimation, rzkey);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginCopyKeyColorAllFramesNameD(const char* sourceAnimation, const char* targetAnimation, double rzkey);
	public double copyKeyColorAllFramesNameD(String sourceAnimation, String targetAnimation, double rzkey)
	{
		return wrapper.PluginCopyKeyColorAllFramesNameD(sourceAnimation, targetAnimation, rzkey);
	}
	/*
	Copy animation key color from the source animation to the target animation 
	for all frames, starting at the offset for the length of the source animation. 
	Source and target are referenced by id.
	*/
	/// EXPORT_API void PluginCopyKeyColorAllFramesOffset(int sourceAnimationId, int targetAnimationId, int rzkey, int offset);
	public void copyKeyColorAllFramesOffset(int sourceAnimationId, int targetAnimationId, int rzkey, int offset)
	{
		wrapper.PluginCopyKeyColorAllFramesOffset(sourceAnimationId, targetAnimationId, rzkey, offset);
	}
	/*
	Copy animation key color from the source animation to the target animation 
	for all frames, starting at the offset for the length of the source animation. 
	Source and target are referenced by name.
	*/
	/// EXPORT_API void PluginCopyKeyColorAllFramesOffsetName(const char* sourceAnimation, const char* targetAnimation, int rzkey, int offset);
	public void copyKeyColorAllFramesOffsetName(String sourceAnimation, String targetAnimation, int rzkey, int offset)
	{
		wrapper.PluginCopyKeyColorAllFramesOffsetName(sourceAnimation, targetAnimation, rzkey, offset);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginCopyKeyColorAllFramesOffsetNameD(const char* sourceAnimation, const char* targetAnimation, double rzkey, double offset);
	public double copyKeyColorAllFramesOffsetNameD(String sourceAnimation, String targetAnimation, double rzkey, double offset)
	{
		return wrapper.PluginCopyKeyColorAllFramesOffsetNameD(sourceAnimation, targetAnimation, rzkey, offset);
	}
	/*
	Copy animation key color from the source animation to the target animation 
	for the given frame.
	*/
	/// EXPORT_API void PluginCopyKeyColorName(const char* sourceAnimation, const char* targetAnimation, int frameId, int rzkey);
	public void copyKeyColorName(String sourceAnimation, String targetAnimation, int frameId, int rzkey)
	{
		wrapper.PluginCopyKeyColorName(sourceAnimation, targetAnimation, frameId, rzkey);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginCopyKeyColorNameD(const char* sourceAnimation, const char* targetAnimation, double frameId, double rzkey);
	public double copyKeyColorNameD(String sourceAnimation, String targetAnimation, double frameId, double rzkey)
	{
		return wrapper.PluginCopyKeyColorNameD(sourceAnimation, targetAnimation, frameId, rzkey);
	}
	/*
	Copy animation color for a set of keys from the source animation to the 
	target animation for the given frame. Reference the source and target by 
	id.
	*/
	/// EXPORT_API void PluginCopyKeysColor(int sourceAnimationId, int targetAnimationId, int frameId, const int* keys, int size);
	public void copyKeysColor(int sourceAnimationId, int targetAnimationId, int frameId, Pointer keys, int size)
	{
		wrapper.PluginCopyKeysColor(sourceAnimationId, targetAnimationId, frameId, keys, size);
	}
	/*
	Copy animation color for a set of keys from the source animation to the 
	target animation for all frames. Reference the source and target by id.
	*/
	/// EXPORT_API void PluginCopyKeysColorAllFrames(int sourceAnimationId, int targetAnimationId, const int* keys, int size);
	public void copyKeysColorAllFrames(int sourceAnimationId, int targetAnimationId, Pointer keys, int size)
	{
		wrapper.PluginCopyKeysColorAllFrames(sourceAnimationId, targetAnimationId, keys, size);
	}
	/*
	Copy animation color for a set of keys from the source animation to the 
	target animation for all frames. Reference the source and target by name.
	*/
	/// EXPORT_API void PluginCopyKeysColorAllFramesName(const char* sourceAnimation, const char* targetAnimation, const int* keys, int size);
	public void copyKeysColorAllFramesName(String sourceAnimation, String targetAnimation, int[] keys, int size)
	{
		wrapper.PluginCopyKeysColorAllFramesName(sourceAnimation, targetAnimation, keys, size);
	}
	/*
	Copy animation color for a set of keys from the source animation to the 
	target animation for the given frame. Reference the source and target by 
	name.
	*/
	/// EXPORT_API void PluginCopyKeysColorName(const char* sourceAnimation, const char* targetAnimation, int frameId, const int* keys, int size);
	public void copyKeysColorName(String sourceAnimation, String targetAnimation, int frameId, Pointer keys, int size)
	{
		wrapper.PluginCopyKeysColorName(sourceAnimation, targetAnimation, frameId, keys, size);
	}
	/*
	Copy animation color for a set of keys from the source animation to the 
	target animation from the source frame to the target frame. Reference the 
	source and target by id.
	*/
	/// EXPORT_API void PluginCopyKeysColorOffset(int sourceAnimationId, int targetAnimationId, int sourceFrameId, int targetFrameId, const int* keys, int size);
	public void copyKeysColorOffset(int sourceAnimationId, int targetAnimationId, int sourceFrameId, int targetFrameId, Pointer keys, int size)
	{
		wrapper.PluginCopyKeysColorOffset(sourceAnimationId, targetAnimationId, sourceFrameId, targetFrameId, keys, size);
	}
	/*
	Copy animation color for a set of keys from the source animation to the 
	target animation from the source frame to the target frame. Reference the 
	source and target by name.
	*/
	/// EXPORT_API void PluginCopyKeysColorOffsetName(const char* sourceAnimation, const char* targetAnimation, int sourceFrameId, int targetFrameId, const int* keys, int size);
	public void copyKeysColorOffsetName(String sourceAnimation, String targetAnimation, int sourceFrameId, int targetFrameId, Pointer keys, int size)
	{
		wrapper.PluginCopyKeysColorOffsetName(sourceAnimation, targetAnimation, sourceFrameId, targetFrameId, keys, size);
	}
	/*
	Copy source animation to target animation for the given frame. Source and 
	target are referenced by id.
	*/
	/// EXPORT_API void PluginCopyNonZeroAllKeys(int sourceAnimationId, int targetAnimationId, int frameId);
	public void copyNonZeroAllKeys(int sourceAnimationId, int targetAnimationId, int frameId)
	{
		wrapper.PluginCopyNonZeroAllKeys(sourceAnimationId, targetAnimationId, frameId);
	}
	/*
	Copy nonzero colors from a source animation to a target animation for all 
	frames. Reference source and target by id.
	*/
	/// EXPORT_API void PluginCopyNonZeroAllKeysAllFrames(int sourceAnimationId, int targetAnimationId);
	public void copyNonZeroAllKeysAllFrames(int sourceAnimationId, int targetAnimationId)
	{
		wrapper.PluginCopyNonZeroAllKeysAllFrames(sourceAnimationId, targetAnimationId);
	}
	/*
	Copy nonzero colors from a source animation to a target animation for all 
	frames. Reference source and target by name.
	*/
	/// EXPORT_API void PluginCopyNonZeroAllKeysAllFramesName(const char* sourceAnimation, const char* targetAnimation);
	public void copyNonZeroAllKeysAllFramesName(String sourceAnimation, String targetAnimation)
	{
		wrapper.PluginCopyNonZeroAllKeysAllFramesName(sourceAnimation, targetAnimation);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginCopyNonZeroAllKeysAllFramesNameD(const char* sourceAnimation, const char* targetAnimation);
	public double copyNonZeroAllKeysAllFramesNameD(String sourceAnimation, String targetAnimation)
	{
		return wrapper.PluginCopyNonZeroAllKeysAllFramesNameD(sourceAnimation, targetAnimation);
	}
	/*
	Copy nonzero colors from a source animation to a target animation for all 
	frames starting at the offset for the length of the source animation. The 
	source and target are referenced by id.
	*/
	/// EXPORT_API void PluginCopyNonZeroAllKeysAllFramesOffset(int sourceAnimationId, int targetAnimationId, int offset);
	public void copyNonZeroAllKeysAllFramesOffset(int sourceAnimationId, int targetAnimationId, int offset)
	{
		wrapper.PluginCopyNonZeroAllKeysAllFramesOffset(sourceAnimationId, targetAnimationId, offset);
	}
	/*
	Copy nonzero colors from a source animation to a target animation for all 
	frames starting at the offset for the length of the source animation. The 
	source and target are referenced by name.
	*/
	/// EXPORT_API void PluginCopyNonZeroAllKeysAllFramesOffsetName(const char* sourceAnimation, const char* targetAnimation, int offset);
	public void copyNonZeroAllKeysAllFramesOffsetName(String sourceAnimation, String targetAnimation, int offset)
	{
		wrapper.PluginCopyNonZeroAllKeysAllFramesOffsetName(sourceAnimation, targetAnimation, offset);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginCopyNonZeroAllKeysAllFramesOffsetNameD(const char* sourceAnimation, const char* targetAnimation, double offset);
	public double copyNonZeroAllKeysAllFramesOffsetNameD(String sourceAnimation, String targetAnimation, double offset)
	{
		return wrapper.PluginCopyNonZeroAllKeysAllFramesOffsetNameD(sourceAnimation, targetAnimation, offset);
	}
	/*
	Copy nonzero colors from source animation to target animation for the specified 
	frame. Source and target are referenced by id.
	*/
	/// EXPORT_API void PluginCopyNonZeroAllKeysName(const char* sourceAnimation, const char* targetAnimation, int frameId);
	public void copyNonZeroAllKeysName(String sourceAnimation, String targetAnimation, int frameId)
	{
		wrapper.PluginCopyNonZeroAllKeysName(sourceAnimation, targetAnimation, frameId);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginCopyNonZeroAllKeysNameD(const char* sourceAnimation, const char* targetAnimation, double frameId);
	public double copyNonZeroAllKeysNameD(String sourceAnimation, String targetAnimation, double frameId)
	{
		return wrapper.PluginCopyNonZeroAllKeysNameD(sourceAnimation, targetAnimation, frameId);
	}
	/*
	Copy nonzero colors from the source animation to the target animation from 
	the source frame to the target offset frame. Source and target are referenced 
	by id.
	*/
	/// EXPORT_API void PluginCopyNonZeroAllKeysOffset(int sourceAnimationId, int targetAnimationId, int frameId, int offset);
	public void copyNonZeroAllKeysOffset(int sourceAnimationId, int targetAnimationId, int frameId, int offset)
	{
		wrapper.PluginCopyNonZeroAllKeysOffset(sourceAnimationId, targetAnimationId, frameId, offset);
	}
	/*
	Copy nonzero colors from the source animation to the target animation from 
	the source frame to the target offset frame. Source and target are referenced 
	by name.
	*/
	/// EXPORT_API void PluginCopyNonZeroAllKeysOffsetName(const char* sourceAnimation, const char* targetAnimation, int frameId, int offset);
	public void copyNonZeroAllKeysOffsetName(String sourceAnimation, String targetAnimation, int frameId, int offset)
	{
		wrapper.PluginCopyNonZeroAllKeysOffsetName(sourceAnimation, targetAnimation, frameId, offset);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginCopyNonZeroAllKeysOffsetNameD(const char* sourceAnimation, const char* targetAnimation, double frameId, double offset);
	public double copyNonZeroAllKeysOffsetNameD(String sourceAnimation, String targetAnimation, double frameId, double offset)
	{
		return wrapper.PluginCopyNonZeroAllKeysOffsetNameD(sourceAnimation, targetAnimation, frameId, offset);
	}
	/*
	Copy animation key color from the source animation to the target animation 
	for the given frame where color is not zero.
	*/
	/// EXPORT_API void PluginCopyNonZeroKeyColor(int sourceAnimationId, int targetAnimationId, int frameId, int rzkey);
	public void copyNonZeroKeyColor(int sourceAnimationId, int targetAnimationId, int frameId, int rzkey)
	{
		wrapper.PluginCopyNonZeroKeyColor(sourceAnimationId, targetAnimationId, frameId, rzkey);
	}
	/*
	Copy animation key color from the source animation to the target animation 
	for the given frame where color is not zero.
	*/
	/// EXPORT_API void PluginCopyNonZeroKeyColorName(const char* sourceAnimation, const char* targetAnimation, int frameId, int rzkey);
	public void copyNonZeroKeyColorName(String sourceAnimation, String targetAnimation, int frameId, int rzkey)
	{
		wrapper.PluginCopyNonZeroKeyColorName(sourceAnimation, targetAnimation, frameId, rzkey);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginCopyNonZeroKeyColorNameD(const char* sourceAnimation, const char* targetAnimation, double frameId, double rzkey);
	public double copyNonZeroKeyColorNameD(String sourceAnimation, String targetAnimation, double frameId, double rzkey)
	{
		return wrapper.PluginCopyNonZeroKeyColorNameD(sourceAnimation, targetAnimation, frameId, rzkey);
	}
	/*
	Copy nonzero colors from the source animation to the target animation where 
	the target color is nonzero for the specified frame. Source and target 
	are referenced by id.
	*/
	/// EXPORT_API void PluginCopyNonZeroTargetAllKeys(int sourceAnimationId, int targetAnimationId, int frameId);
	public void copyNonZeroTargetAllKeys(int sourceAnimationId, int targetAnimationId, int frameId)
	{
		wrapper.PluginCopyNonZeroTargetAllKeys(sourceAnimationId, targetAnimationId, frameId);
	}
	/*
	Copy nonzero colors from the source animation to the target animation where 
	the target color is nonzero for all frames. Source and target are referenced 
	by id.
	*/
	/// EXPORT_API void PluginCopyNonZeroTargetAllKeysAllFrames(int sourceAnimationId, int targetAnimationId);
	public void copyNonZeroTargetAllKeysAllFrames(int sourceAnimationId, int targetAnimationId)
	{
		wrapper.PluginCopyNonZeroTargetAllKeysAllFrames(sourceAnimationId, targetAnimationId);
	}
	/*
	Copy nonzero colors from the source animation to the target animation where 
	the target color is nonzero for all frames. Source and target are referenced 
	by name.
	*/
	/// EXPORT_API void PluginCopyNonZeroTargetAllKeysAllFramesName(const char* sourceAnimation, const char* targetAnimation);
	public void copyNonZeroTargetAllKeysAllFramesName(String sourceAnimation, String targetAnimation)
	{
		wrapper.PluginCopyNonZeroTargetAllKeysAllFramesName(sourceAnimation, targetAnimation);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginCopyNonZeroTargetAllKeysAllFramesNameD(const char* sourceAnimation, const char* targetAnimation);
	public double copyNonZeroTargetAllKeysAllFramesNameD(String sourceAnimation, String targetAnimation)
	{
		return wrapper.PluginCopyNonZeroTargetAllKeysAllFramesNameD(sourceAnimation, targetAnimation);
	}
	/*
	Copy nonzero colors from the source animation to the target animation where 
	the target color is nonzero for all frames. Source and target are referenced 
	by name.
	*/
	/// EXPORT_API void PluginCopyNonZeroTargetAllKeysAllFramesOffset(int sourceAnimationId, int targetAnimationId, int offset);
	public void copyNonZeroTargetAllKeysAllFramesOffset(int sourceAnimationId, int targetAnimationId, int offset)
	{
		wrapper.PluginCopyNonZeroTargetAllKeysAllFramesOffset(sourceAnimationId, targetAnimationId, offset);
	}
	/*
	Copy nonzero colors from the source animation to the target animation where 
	the target color is nonzero for all frames starting at the target offset 
	for the length of the source animation. Source and target animations are 
	referenced by name.
	*/
	/// EXPORT_API void PluginCopyNonZeroTargetAllKeysAllFramesOffsetName(const char* sourceAnimation, const char* targetAnimation, int offset);
	public void copyNonZeroTargetAllKeysAllFramesOffsetName(String sourceAnimation, String targetAnimation, int offset)
	{
		wrapper.PluginCopyNonZeroTargetAllKeysAllFramesOffsetName(sourceAnimation, targetAnimation, offset);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginCopyNonZeroTargetAllKeysAllFramesOffsetNameD(const char* sourceAnimation, const char* targetAnimation, double offset);
	public double copyNonZeroTargetAllKeysAllFramesOffsetNameD(String sourceAnimation, String targetAnimation, double offset)
	{
		return wrapper.PluginCopyNonZeroTargetAllKeysAllFramesOffsetNameD(sourceAnimation, targetAnimation, offset);
	}
	/*
	Copy nonzero colors from the source animation to the target animation where 
	the target color is nonzero for the specified frame. The source and target 
	are referenced by name.
	*/
	/// EXPORT_API void PluginCopyNonZeroTargetAllKeysName(const char* sourceAnimation, const char* targetAnimation, int frameId);
	public void copyNonZeroTargetAllKeysName(String sourceAnimation, String targetAnimation, int frameId)
	{
		wrapper.PluginCopyNonZeroTargetAllKeysName(sourceAnimation, targetAnimation, frameId);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginCopyNonZeroTargetAllKeysNameD(const char* sourceAnimation, const char* targetAnimation, double frameId);
	public double copyNonZeroTargetAllKeysNameD(String sourceAnimation, String targetAnimation, double frameId)
	{
		return wrapper.PluginCopyNonZeroTargetAllKeysNameD(sourceAnimation, targetAnimation, frameId);
	}
	/*
	Copy nonzero colors from the source animation to the target animation where 
	the target color is nonzero for the specified source frame and target offset 
	frame. The source and target are referenced by id.
	*/
	/// EXPORT_API void PluginCopyNonZeroTargetAllKeysOffset(int sourceAnimationId, int targetAnimationId, int frameId, int offset);
	public void copyNonZeroTargetAllKeysOffset(int sourceAnimationId, int targetAnimationId, int frameId, int offset)
	{
		wrapper.PluginCopyNonZeroTargetAllKeysOffset(sourceAnimationId, targetAnimationId, frameId, offset);
	}
	/*
	Copy nonzero colors from the source animation to the target animation where 
	the target color is nonzero for the specified source frame and target offset 
	frame. The source and target are referenced by name.
	*/
	/// EXPORT_API void PluginCopyNonZeroTargetAllKeysOffsetName(const char* sourceAnimation, const char* targetAnimation, int frameId, int offset);
	public void copyNonZeroTargetAllKeysOffsetName(String sourceAnimation, String targetAnimation, int frameId, int offset)
	{
		wrapper.PluginCopyNonZeroTargetAllKeysOffsetName(sourceAnimation, targetAnimation, frameId, offset);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginCopyNonZeroTargetAllKeysOffsetNameD(const char* sourceAnimation, const char* targetAnimation, double frameId, double offset);
	public double copyNonZeroTargetAllKeysOffsetNameD(String sourceAnimation, String targetAnimation, double frameId, double offset)
	{
		return wrapper.PluginCopyNonZeroTargetAllKeysOffsetNameD(sourceAnimation, targetAnimation, frameId, offset);
	}
	/*
	Copy nonzero colors from the source animation to the target animation where 
	the target color is zero for all frames. Source and target are referenced 
	by id.
	*/
	/// EXPORT_API void PluginCopyNonZeroTargetZeroAllKeysAllFrames(int sourceAnimationId, int targetAnimationId);
	public void copyNonZeroTargetZeroAllKeysAllFrames(int sourceAnimationId, int targetAnimationId)
	{
		wrapper.PluginCopyNonZeroTargetZeroAllKeysAllFrames(sourceAnimationId, targetAnimationId);
	}
	/*
	Copy nonzero colors from the source animation to the target animation where 
	the target color is zero for all frames. Source and target are referenced 
	by name.
	*/
	/// EXPORT_API void PluginCopyNonZeroTargetZeroAllKeysAllFramesName(const char* sourceAnimation, const char* targetAnimation);
	public void copyNonZeroTargetZeroAllKeysAllFramesName(String sourceAnimation, String targetAnimation)
	{
		wrapper.PluginCopyNonZeroTargetZeroAllKeysAllFramesName(sourceAnimation, targetAnimation);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginCopyNonZeroTargetZeroAllKeysAllFramesNameD(const char* sourceAnimation, const char* targetAnimation);
	public double copyNonZeroTargetZeroAllKeysAllFramesNameD(String sourceAnimation, String targetAnimation)
	{
		return wrapper.PluginCopyNonZeroTargetZeroAllKeysAllFramesNameD(sourceAnimation, targetAnimation);
	}
	/*
	Copy red channel to other channels for all frames. Intensity range is 0.0 
	to 1.0. Reference the animation by id.
	*/
	/// EXPORT_API void PluginCopyRedChannelAllFrames(int animationId, float greenIntensity, float blueIntensity);
	public void copyRedChannelAllFrames(int animationId, float greenIntensity, float blueIntensity)
	{
		wrapper.PluginCopyRedChannelAllFrames(animationId, greenIntensity, blueIntensity);
	}
	/*
	Copy green channel to other channels for all frames. Intensity range is 
	0.0 to 1.0. Reference the animation by name.
	*/
	/// EXPORT_API void PluginCopyRedChannelAllFramesName(const char* path, float greenIntensity, float blueIntensity);
	public void copyRedChannelAllFramesName(String path, float greenIntensity, float blueIntensity)
	{
		wrapper.PluginCopyRedChannelAllFramesName(path, greenIntensity, blueIntensity);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginCopyRedChannelAllFramesNameD(const char* path, double greenIntensity, double blueIntensity);
	public double copyRedChannelAllFramesNameD(String path, double greenIntensity, double blueIntensity)
	{
		return wrapper.PluginCopyRedChannelAllFramesNameD(path, greenIntensity, blueIntensity);
	}
	/*
	Copy zero colors from source animation to target animation for the frame. 
	Source and target are referenced by id.
	*/
	/// EXPORT_API void PluginCopyZeroAllKeys(int sourceAnimationId, int targetAnimationId, int frameId);
	public void copyZeroAllKeys(int sourceAnimationId, int targetAnimationId, int frameId)
	{
		wrapper.PluginCopyZeroAllKeys(sourceAnimationId, targetAnimationId, frameId);
	}
	/*
	Copy zero colors from source animation to target animation for all frames. 
	Source and target are referenced by id.
	*/
	/// EXPORT_API void PluginCopyZeroAllKeysAllFrames(int sourceAnimationId, int targetAnimationId);
	public void copyZeroAllKeysAllFrames(int sourceAnimationId, int targetAnimationId)
	{
		wrapper.PluginCopyZeroAllKeysAllFrames(sourceAnimationId, targetAnimationId);
	}
	/*
	Copy zero colors from source animation to target animation for all frames. 
	Source and target are referenced by name.
	*/
	/// EXPORT_API void PluginCopyZeroAllKeysAllFramesName(const char* sourceAnimation, const char* targetAnimation);
	public void copyZeroAllKeysAllFramesName(String sourceAnimation, String targetAnimation)
	{
		wrapper.PluginCopyZeroAllKeysAllFramesName(sourceAnimation, targetAnimation);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginCopyZeroAllKeysAllFramesNameD(const char* sourceAnimation, const char* targetAnimation);
	public double copyZeroAllKeysAllFramesNameD(String sourceAnimation, String targetAnimation)
	{
		return wrapper.PluginCopyZeroAllKeysAllFramesNameD(sourceAnimation, targetAnimation);
	}
	/*
	Copy zero colors from source animation to target animation for all frames 
	starting at the target offset for the length of the source animation. Source 
	and target are referenced by id.
	*/
	/// EXPORT_API void PluginCopyZeroAllKeysAllFramesOffset(int sourceAnimationId, int targetAnimationId, int offset);
	public void copyZeroAllKeysAllFramesOffset(int sourceAnimationId, int targetAnimationId, int offset)
	{
		wrapper.PluginCopyZeroAllKeysAllFramesOffset(sourceAnimationId, targetAnimationId, offset);
	}
	/*
	Copy zero colors from source animation to target animation for all frames 
	starting at the target offset for the length of the source animation. Source 
	and target are referenced by name.
	*/
	/// EXPORT_API void PluginCopyZeroAllKeysAllFramesOffsetName(const char* sourceAnimation, const char* targetAnimation, int offset);
	public void copyZeroAllKeysAllFramesOffsetName(String sourceAnimation, String targetAnimation, int offset)
	{
		wrapper.PluginCopyZeroAllKeysAllFramesOffsetName(sourceAnimation, targetAnimation, offset);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginCopyZeroAllKeysAllFramesOffsetNameD(const char* sourceAnimation, const char* targetAnimation, double offset);
	public double copyZeroAllKeysAllFramesOffsetNameD(String sourceAnimation, String targetAnimation, double offset)
	{
		return wrapper.PluginCopyZeroAllKeysAllFramesOffsetNameD(sourceAnimation, targetAnimation, offset);
	}
	/*
	Copy zero colors from source animation to target animation for the frame. 
	Source and target are referenced by name.
	*/
	/// EXPORT_API void PluginCopyZeroAllKeysName(const char* sourceAnimation, const char* targetAnimation, int frameId);
	public void copyZeroAllKeysName(String sourceAnimation, String targetAnimation, int frameId)
	{
		wrapper.PluginCopyZeroAllKeysName(sourceAnimation, targetAnimation, frameId);
	}
	/*
	Copy zero colors from source animation to target animation for the frame 
	id starting at the target offset for the length of the source animation. 
	Source and target are referenced by id.
	*/
	/// EXPORT_API void PluginCopyZeroAllKeysOffset(int sourceAnimationId, int targetAnimationId, int frameId, int offset);
	public void copyZeroAllKeysOffset(int sourceAnimationId, int targetAnimationId, int frameId, int offset)
	{
		wrapper.PluginCopyZeroAllKeysOffset(sourceAnimationId, targetAnimationId, frameId, offset);
	}
	/*
	Copy zero colors from source animation to target animation for the frame 
	id starting at the target offset for the length of the source animation. 
	Source and target are referenced by name.
	*/
	/// EXPORT_API void PluginCopyZeroAllKeysOffsetName(const char* sourceAnimation, const char* targetAnimation, int frameId, int offset);
	public void copyZeroAllKeysOffsetName(String sourceAnimation, String targetAnimation, int frameId, int offset)
	{
		wrapper.PluginCopyZeroAllKeysOffsetName(sourceAnimation, targetAnimation, frameId, offset);
	}
	/*
	Copy zero key color from source animation to target animation for the specified 
	frame. Source and target are referenced by id.
	*/
	/// EXPORT_API void PluginCopyZeroKeyColor(int sourceAnimationId, int targetAnimationId, int frameId, int rzkey);
	public void copyZeroKeyColor(int sourceAnimationId, int targetAnimationId, int frameId, int rzkey)
	{
		wrapper.PluginCopyZeroKeyColor(sourceAnimationId, targetAnimationId, frameId, rzkey);
	}
	/*
	Copy zero key color from source animation to target animation for the specified 
	frame. Source and target are referenced by name.
	*/
	/// EXPORT_API void PluginCopyZeroKeyColorName(const char* sourceAnimation, const char* targetAnimation, int frameId, int rzkey);
	public void copyZeroKeyColorName(String sourceAnimation, String targetAnimation, int frameId, int rzkey)
	{
		wrapper.PluginCopyZeroKeyColorName(sourceAnimation, targetAnimation, frameId, rzkey);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginCopyZeroKeyColorNameD(const char* sourceAnimation, const char* targetAnimation, double frameId, double rzkey);
	public double copyZeroKeyColorNameD(String sourceAnimation, String targetAnimation, double frameId, double rzkey)
	{
		return wrapper.PluginCopyZeroKeyColorNameD(sourceAnimation, targetAnimation, frameId, rzkey);
	}
	/*
	Copy nonzero color from source animation to target animation where target 
	is zero for the frame. Source and target are referenced by id.
	*/
	/// EXPORT_API void PluginCopyZeroTargetAllKeys(int sourceAnimationId, int targetAnimationId, int frameId);
	public void copyZeroTargetAllKeys(int sourceAnimationId, int targetAnimationId, int frameId)
	{
		wrapper.PluginCopyZeroTargetAllKeys(sourceAnimationId, targetAnimationId, frameId);
	}
	/*
	Copy nonzero color from source animation to target animation where target 
	is zero for all frames. Source and target are referenced by id.
	*/
	/// EXPORT_API void PluginCopyZeroTargetAllKeysAllFrames(int sourceAnimationId, int targetAnimationId);
	public void copyZeroTargetAllKeysAllFrames(int sourceAnimationId, int targetAnimationId)
	{
		wrapper.PluginCopyZeroTargetAllKeysAllFrames(sourceAnimationId, targetAnimationId);
	}
	/*
	Copy nonzero color from source animation to target animation where target 
	is zero for all frames. Source and target are referenced by name.
	*/
	/// EXPORT_API void PluginCopyZeroTargetAllKeysAllFramesName(const char* sourceAnimation, const char* targetAnimation);
	public void copyZeroTargetAllKeysAllFramesName(String sourceAnimation, String targetAnimation)
	{
		wrapper.PluginCopyZeroTargetAllKeysAllFramesName(sourceAnimation, targetAnimation);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginCopyZeroTargetAllKeysAllFramesNameD(const char* sourceAnimation, const char* targetAnimation);
	public double copyZeroTargetAllKeysAllFramesNameD(String sourceAnimation, String targetAnimation)
	{
		return wrapper.PluginCopyZeroTargetAllKeysAllFramesNameD(sourceAnimation, targetAnimation);
	}
	/*
	Copy nonzero color from source animation to target animation where target 
	is zero for the frame. Source and target are referenced by name.
	*/
	/// EXPORT_API void PluginCopyZeroTargetAllKeysName(const char* sourceAnimation, const char* targetAnimation, int frameId);
	public void copyZeroTargetAllKeysName(String sourceAnimation, String targetAnimation, int frameId)
	{
		wrapper.PluginCopyZeroTargetAllKeysName(sourceAnimation, targetAnimation, frameId);
	}
	/*
	Direct access to low level API.
	*/
	/// EXPORT_API RZRESULT PluginCoreCreateChromaLinkEffect(ChromaSDK::ChromaLink::EFFECT_TYPE Effect, PRZPARAM pParam, RZEFFECTID* pEffectId);
	public int coreCreateChromaLinkEffect(int Effect, Pointer pParam, Pointer pEffectId)
	{
		return wrapper.PluginCoreCreateChromaLinkEffect(Effect, pParam, pEffectId);
	}
	/*
	Direct access to low level API.
	*/
	/// EXPORT_API RZRESULT PluginCoreCreateEffect(RZDEVICEID DeviceId, ChromaSDK::EFFECT_TYPE Effect, PRZPARAM pParam, RZEFFECTID* pEffectId);
	public int coreCreateEffect(GUIDStruct DeviceId, int Effect, Pointer pParam, Pointer pEffectId)
	{
		return wrapper.PluginCoreCreateEffect(DeviceId, Effect, pParam, pEffectId);
	}
	/*
	Direct access to low level API.
	*/
	/// EXPORT_API RZRESULT PluginCoreCreateHeadsetEffect(ChromaSDK::Headset::EFFECT_TYPE Effect, PRZPARAM pParam, RZEFFECTID* pEffectId);
	public int coreCreateHeadsetEffect(int Effect, Pointer pParam, Pointer pEffectId)
	{
		return wrapper.PluginCoreCreateHeadsetEffect(Effect, pParam, pEffectId);
	}
	/*
	Direct access to low level API.
	*/
	/// EXPORT_API RZRESULT PluginCoreCreateKeyboardEffect(ChromaSDK::Keyboard::EFFECT_TYPE Effect, PRZPARAM pParam, RZEFFECTID* pEffectId);
	public int coreCreateKeyboardEffect(int Effect, Pointer pParam, Pointer pEffectId)
	{
		return wrapper.PluginCoreCreateKeyboardEffect(Effect, pParam, pEffectId);
	}
	/*
	Direct access to low level API.
	*/
	/// EXPORT_API RZRESULT PluginCoreCreateKeypadEffect(ChromaSDK::Keypad::EFFECT_TYPE Effect, PRZPARAM pParam, RZEFFECTID* pEffectId);
	public int coreCreateKeypadEffect(int Effect, Pointer pParam, Pointer pEffectId)
	{
		return wrapper.PluginCoreCreateKeypadEffect(Effect, pParam, pEffectId);
	}
	/*
	Direct access to low level API.
	*/
	/// EXPORT_API RZRESULT PluginCoreCreateMouseEffect(ChromaSDK::Mouse::EFFECT_TYPE Effect, PRZPARAM pParam, RZEFFECTID* pEffectId);
	public int coreCreateMouseEffect(int Effect, Pointer pParam, Pointer pEffectId)
	{
		return wrapper.PluginCoreCreateMouseEffect(Effect, pParam, pEffectId);
	}
	/*
	Direct access to low level API.
	*/
	/// EXPORT_API RZRESULT PluginCoreCreateMousepadEffect(ChromaSDK::Mousepad::EFFECT_TYPE Effect, PRZPARAM pParam, RZEFFECTID* pEffectId);
	public int coreCreateMousepadEffect(int Effect, Pointer pParam, Pointer pEffectId)
	{
		return wrapper.PluginCoreCreateMousepadEffect(Effect, pParam, pEffectId);
	}
	/*
	Direct access to low level API.
	*/
	/// EXPORT_API RZRESULT PluginCoreDeleteEffect(RZEFFECTID EffectId);
	public int coreDeleteEffect(GUIDStruct EffectId)
	{
		return wrapper.PluginCoreDeleteEffect(EffectId);
	}
	/*
	Direct access to low level API.
	*/
	/// EXPORT_API RZRESULT PluginCoreInit();
	public int coreInit()
	{
		return wrapper.PluginCoreInit();
	}
	/*
	Direct access to low level API.
	*/
	/// EXPORT_API RZRESULT PluginCoreInitSDK(ChromaSDK::APPINFOTYPE* AppInfo);
	public int coreInitSDK(JAppInfoType appInfo)
	{
		return wrapper.PluginCoreInitSDK(appInfo);
	}
	/*
	Direct access to low level API.
	*/
	/// EXPORT_API RZRESULT PluginCoreIsActive(BOOL& Active);
	public int coreIsActive(Pointer active)
	{
		return wrapper.PluginCoreIsActive(active);
	}
	/*
	Direct access to low level API.
	*/
	/// EXPORT_API RZRESULT PluginCoreIsConnected(ChromaSDK::DEVICE_INFO_TYPE& DeviceInfo);
	public int coreIsConnected(DeviceInfos.DeviceInfosStruct DeviceInfo)
	{
		return wrapper.PluginCoreIsConnected(DeviceInfo);
	}
	/*
	Direct access to low level API.
	*/
	/// EXPORT_API RZRESULT PluginCoreQueryDevice(RZDEVICEID DeviceId, ChromaSDK::DEVICE_INFO_TYPE& DeviceInfo);
	public int coreQueryDevice(GUIDStruct DeviceId, DeviceInfos.DeviceInfosStruct DeviceInfo)
	{
		return wrapper.PluginCoreQueryDevice(DeviceId, DeviceInfo);
	}
	/*
	Direct access to low level API.
	*/
	/// EXPORT_API RZRESULT PluginCoreSetEffect(RZEFFECTID EffectId);
	public int coreSetEffect(GUIDStruct EffectId)
	{
		return wrapper.PluginCoreSetEffect(EffectId);
	}
	/*
	Direct access to low level API.
	*/
	/// EXPORT_API RZRESULT PluginCoreSetEventName(LPCTSTR Name);
	public int coreSetEventName(String name)
	{
		if (name == null)
		{
			return wrapper.PluginCoreSetEventName(new byte[] { 0, 0 });
		} else {
			byte[] bytes = name.getBytes(StandardCharsets.UTF_16LE);

			// add a null terminator
			byte[] nullTerminatedBytes = new byte[bytes.length + 2];
			System.arraycopy(bytes, 0, nullTerminatedBytes, 0, bytes.length);
			nullTerminatedBytes[bytes.length] = 0;
			nullTerminatedBytes[bytes.length + 1] = 0;
			return wrapper.PluginCoreSetEventName(nullTerminatedBytes);
		}
	}
	/*
	Begin broadcasting Chroma RGB data using the stored stream key as the endpoint. 
	Intended for Cloud Gaming Platforms, restore the streaming key when the 
	game instance is launched to continue streaming. streamId is a null terminated 
	string streamKey is a null terminated string StreamGetStatus() should return 
	the READY status to use this method.
	*/
	/// EXPORT_API bool PluginCoreStreamBroadcast(const char* streamId, const char* streamKey);
	public boolean coreStreamBroadcast(String streamId, String streamKey)
	{
		return wrapper.PluginCoreStreamBroadcast(streamId, streamKey);
	}
	/*
	End broadcasting Chroma RGB data. StreamGetStatus() should return the BROADCASTING 
	status to use this method.
	*/
	/// EXPORT_API bool PluginCoreStreamBroadcastEnd();
	public boolean coreStreamBroadcastEnd()
	{
		return wrapper.PluginCoreStreamBroadcastEnd();
	}
	/*
	shortcode: Pass the address of a preallocated character buffer to get the 
	streaming auth code. The buffer should have a minimum length of 6. length: 
	Length will return as zero if the streaming auth code could not be obtained. 
	If length is greater than zero, it will be the length of the returned streaming 
	auth code. Once you have the shortcode, it should be shown to the user 
	so they can associate the stream with their Razer ID StreamGetStatus() 
	should return the READY status before invoking this method. platform: is 
	the null terminated string that identifies the source of the stream: { 
	GEFORCE_NOW, LUNA, STADIA, GAME_PASS } title: is the null terminated string 
	that identifies the application or game.
	*/
	/// EXPORT_API void PluginCoreStreamGetAuthShortcode(char* shortcode, unsigned char* length, const wchar_t* platform, const wchar_t* title);
	public void coreStreamGetAuthShortcode(Pointer shortcode, Pointer length, String platform, String title)
	{
		wrapper.PluginCoreStreamGetAuthShortcode(shortcode, length, platform, title);
	}
	/*
	focus: Pass the address of a preallocated character buffer to get the stream 
	focus. The buffer should have a length of 48 length: Length will return 
	as zero if the stream focus could not be obtained. If length is greater 
	than zero, it will be the length of the returned stream focus.
	*/
	/// EXPORT_API bool PluginCoreStreamGetFocus(char* focus, unsigned char* length);
	public boolean coreStreamGetFocus(Pointer focus, Pointer length)
	{
		return wrapper.PluginCoreStreamGetFocus(focus, length);
	}
	/*
	Intended for Cloud Gaming Platforms, store the stream id to persist in user 
	preferences to continue streaming if the game is suspended or closed. shortcode: 
	The shortcode is a null terminated string. Use the shortcode that authorized 
	the stream to obtain the stream id. streamId should be a preallocated buffer 
	to get the stream key. The buffer should have a length of 48. length: Length 
	will return zero if the key could not be obtained. If the length is greater 
	than zero, it will be the length of the returned streaming id. Retrieve 
	the stream id after authorizing the shortcode. The authorization window 
	will expire in 5 minutes. Be sure to save the stream key before the window 
	expires. StreamGetStatus() should return the READY status to use this method.
	*/
	/// EXPORT_API void PluginCoreStreamGetId(const char* shortcode, char* streamId, unsigned char* length);
	public void coreStreamGetId(String shortcode, Pointer streamId, Pointer length)
	{
		wrapper.PluginCoreStreamGetId(shortcode, streamId, length);
	}
	/*
	Intended for Cloud Gaming Platforms, store the streaming key to persist 
	in user preferences to continue streaming if the game is suspended or closed. 
	shortcode: The shortcode is a null terminated string. Use the shortcode 
	that authorized the stream to obtain the stream key. If the status is in 
	the BROADCASTING or WATCHING state, passing a NULL shortcode will return 
	the active streamId. streamKey should be a preallocated buffer to get the 
	stream key. The buffer should have a length of 48. length: Length will 
	return zero if the key could not be obtained. If the length is greater 
	than zero, it will be the length of the returned streaming key. Retrieve 
	the stream key after authorizing the shortcode. The authorization window 
	will expire in 5 minutes. Be sure to save the stream key before the window 
	expires. StreamGetStatus() should return the READY status to use this method.
	*/
	/// EXPORT_API void PluginCoreStreamGetKey(const char* shortcode, char* streamKey, unsigned char* length);
	public void coreStreamGetKey(String shortcode, Pointer streamKey, Pointer length)
	{
		wrapper.PluginCoreStreamGetKey(shortcode, streamKey, length);
	}
	/*
	Returns StreamStatus, the current status of the service
	*/
	/// EXPORT_API ChromaSDK::Stream::StreamStatusType PluginCoreStreamGetStatus();
	public int coreStreamGetStatus()
	{
		return wrapper.PluginCoreStreamGetStatus();
	}
	/*
	Convert StreamStatusType to a printable string
	*/
	/// EXPORT_API const char* PluginCoreStreamGetStatusString(ChromaSDK::Stream::StreamStatusType status);
	public String coreStreamGetStatusString(int status)
	{
		return wrapper.PluginCoreStreamGetStatusString(status);
	}
	/*
	This prevents the stream id and stream key from being obtained through the 
	shortcode. This closes the auth window. shortcode is a null terminated 
	string. StreamGetStatus() should return the READY status to use this method. 
	returns success when shortcode has been released
	*/
	/// EXPORT_API bool PluginCoreStreamReleaseShortcode(const char* shortcode);
	public boolean coreStreamReleaseShortcode(String shortcode)
	{
		return wrapper.PluginCoreStreamReleaseShortcode(shortcode);
	}
	/*
	The focus is a null terminated string. Set the focus identifer for the application 
	designated to automatically change the streaming state. Returns true on 
	success.
	*/
	/// EXPORT_API bool PluginCoreStreamSetFocus(const char* focus);
	public boolean coreStreamSetFocus(String focus)
	{
		return wrapper.PluginCoreStreamSetFocus(focus);
	}
	/*
	Returns true if the Chroma streaming is supported. If false is returned, 
	avoid calling stream methods.
	*/
	/// EXPORT_API bool PluginCoreStreamSupportsStreaming();
	public boolean coreStreamSupportsStreaming()
	{
		return wrapper.PluginCoreStreamSupportsStreaming();
	}
	/*
	Begin watching the Chroma RGB data using streamID parameter. streamId is 
	a null terminated string. StreamGetStatus() should return the READY status 
	to use this method.
	*/
	/// EXPORT_API bool PluginCoreStreamWatch(const char* streamId, unsigned long long timestamp);
	public boolean coreStreamWatch(String streamId, long timestamp)
	{
		return wrapper.PluginCoreStreamWatch(streamId, timestamp);
	}
	/*
	End watching Chroma RGB data stream. StreamGetStatus() should return the 
	WATCHING status to use this method.
	*/
	/// EXPORT_API bool PluginCoreStreamWatchEnd();
	public boolean coreStreamWatchEnd()
	{
		return wrapper.PluginCoreStreamWatchEnd();
	}
	/*
	Direct access to low level API.
	*/
	/// EXPORT_API RZRESULT PluginCoreUnInit();
	public int coreUnInit()
	{
		return wrapper.PluginCoreUnInit();
	}
	/*
	Creates a `Chroma` animation at the given path. The `deviceType` parameter 
	uses `EChromaSDKDeviceTypeEnum` as an integer. The `device` parameter uses 
	`EChromaSDKDevice1DEnum` or `EChromaSDKDevice2DEnum` as an integer, respective 
	to the `deviceType`. Returns the animation id upon success. Returns negative 
	one upon failure. Saves a `Chroma` animation file with the `.chroma` extension 
	at the given path. Returns the animation id upon success. Returns negative 
	one upon failure.
	*/
	/// EXPORT_API int PluginCreateAnimation(const char* path, int deviceType, int device);
	public int createAnimation(String path, int deviceType, int device)
	{
		return wrapper.PluginCreateAnimation(path, deviceType, device);
	}
	/*
	Creates a `Chroma` animation in memory without creating a file. The `deviceType` 
	parameter uses `EChromaSDKDeviceTypeEnum` as an integer. The `device` parameter 
	uses `EChromaSDKDevice1DEnum` or `EChromaSDKDevice2DEnum` as an integer, 
	respective to the `deviceType`. Returns the animation id upon success. 
	Returns negative one upon failure. Returns the animation id upon success. 
	Returns negative one upon failure.
	*/
	/// EXPORT_API int PluginCreateAnimationInMemory(int deviceType, int device);
	public int createAnimationInMemory(int deviceType, int device)
	{
		return wrapper.PluginCreateAnimationInMemory(deviceType, device);
	}
	/*
	Create a device specific effect.
	*/
	/// EXPORT_API RZRESULT PluginCreateEffect(RZDEVICEID deviceId, ChromaSDK::EFFECT_TYPE effect, int* colors, int size, ChromaSDK::FChromaSDKGuid* effectId);
	public int createEffect(GUIDStruct deviceId, int effect, Pointer colors, int size, GUIDStruct effectId)
	{
		return wrapper.PluginCreateEffect(deviceId, effect, colors, size, effectId);
	}
	/*
	Delete an effect given the effect id.
	*/
	/// EXPORT_API RZRESULT PluginDeleteEffect(const ChromaSDK::FChromaSDKGuid& effectId);
	public int deleteEffect(GUIDStruct effectId)
	{
		return wrapper.PluginDeleteEffect(effectId);
	}
	/*
	Duplicate the first animation frame so that the animation length matches 
	the frame count. Animation is referenced by id.
	*/
	/// EXPORT_API void PluginDuplicateFirstFrame(int animationId, int frameCount);
	public void duplicateFirstFrame(int animationId, int frameCount)
	{
		wrapper.PluginDuplicateFirstFrame(animationId, frameCount);
	}
	/*
	Duplicate the first animation frame so that the animation length matches 
	the frame count. Animation is referenced by name.
	*/
	/// EXPORT_API void PluginDuplicateFirstFrameName(const char* path, int frameCount);
	public void duplicateFirstFrameName(String path, int frameCount)
	{
		wrapper.PluginDuplicateFirstFrameName(path, frameCount);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginDuplicateFirstFrameNameD(const char* path, double frameCount);
	public double duplicateFirstFrameNameD(String path, double frameCount)
	{
		return wrapper.PluginDuplicateFirstFrameNameD(path, frameCount);
	}
	/*
	Duplicate all the frames of the animation to double the animation length. 
	Frame 1 becomes frame 1 and 2. Frame 2 becomes frame 3 and 4. And so on. 
	The animation is referenced by id.
	*/
	/// EXPORT_API void PluginDuplicateFrames(int animationId);
	public void duplicateFrames(int animationId)
	{
		wrapper.PluginDuplicateFrames(animationId);
	}
	/*
	Duplicate all the frames of the animation to double the animation length. 
	Frame 1 becomes frame 1 and 2. Frame 2 becomes frame 3 and 4. And so on. 
	The animation is referenced by name.
	*/
	/// EXPORT_API void PluginDuplicateFramesName(const char* path);
	public void duplicateFramesName(String path)
	{
		wrapper.PluginDuplicateFramesName(path);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginDuplicateFramesNameD(const char* path);
	public double duplicateFramesNameD(String path)
	{
		return wrapper.PluginDuplicateFramesNameD(path);
	}
	/*
	Duplicate all the animation frames in reverse so that the animation plays 
	forwards and backwards. Animation is referenced by id.
	*/
	/// EXPORT_API void PluginDuplicateMirrorFrames(int animationId);
	public void duplicateMirrorFrames(int animationId)
	{
		wrapper.PluginDuplicateMirrorFrames(animationId);
	}
	/*
	Duplicate all the animation frames in reverse so that the animation plays 
	forwards and backwards. Animation is referenced by name.
	*/
	/// EXPORT_API void PluginDuplicateMirrorFramesName(const char* path);
	public void duplicateMirrorFramesName(String path)
	{
		wrapper.PluginDuplicateMirrorFramesName(path);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginDuplicateMirrorFramesNameD(const char* path);
	public double duplicateMirrorFramesNameD(String path)
	{
		return wrapper.PluginDuplicateMirrorFramesNameD(path);
	}
	/*
	Fade the animation to black starting at the fade frame index to the end 
	of the animation. Animation is referenced by id.
	*/
	/// EXPORT_API void PluginFadeEndFrames(int animationId, int fade);
	public void fadeEndFrames(int animationId, int fade)
	{
		wrapper.PluginFadeEndFrames(animationId, fade);
	}
	/*
	Fade the animation to black starting at the fade frame index to the end 
	of the animation. Animation is referenced by name.
	*/
	/// EXPORT_API void PluginFadeEndFramesName(const char* path, int fade);
	public void fadeEndFramesName(String path, int fade)
	{
		wrapper.PluginFadeEndFramesName(path, fade);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginFadeEndFramesNameD(const char* path, double fade);
	public double fadeEndFramesNameD(String path, double fade)
	{
		return wrapper.PluginFadeEndFramesNameD(path, fade);
	}
	/*
	Fade the animation from black to full color starting at 0 to the fade frame 
	index. Animation is referenced by id.
	*/
	/// EXPORT_API void PluginFadeStartFrames(int animationId, int fade);
	public void fadeStartFrames(int animationId, int fade)
	{
		wrapper.PluginFadeStartFrames(animationId, fade);
	}
	/*
	Fade the animation from black to full color starting at 0 to the fade frame 
	index. Animation is referenced by name.
	*/
	/// EXPORT_API void PluginFadeStartFramesName(const char* path, int fade);
	public void fadeStartFramesName(String path, int fade)
	{
		wrapper.PluginFadeStartFramesName(path, fade);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginFadeStartFramesNameD(const char* path, double fade);
	public double fadeStartFramesNameD(String path, double fade)
	{
		return wrapper.PluginFadeStartFramesNameD(path, fade);
	}
	/*
	Set the RGB value for all colors in the specified frame. Animation is referenced 
	by id.
	*/
	/// EXPORT_API void PluginFillColor(int animationId, int frameId, int color);
	public void fillColor(int animationId, int frameId, int color)
	{
		wrapper.PluginFillColor(animationId, frameId, color);
	}
	/*
	Set the RGB value for all colors for all frames. Animation is referenced 
	by id.
	*/
	/// EXPORT_API void PluginFillColorAllFrames(int animationId, int color);
	public void fillColorAllFrames(int animationId, int color)
	{
		wrapper.PluginFillColorAllFrames(animationId, color);
	}
	/*
	Set the RGB value for all colors for all frames. Animation is referenced 
	by name.
	*/
	/// EXPORT_API void PluginFillColorAllFramesName(const char* path, int color);
	public void fillColorAllFramesName(String path, int color)
	{
		wrapper.PluginFillColorAllFramesName(path, color);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginFillColorAllFramesNameD(const char* path, double color);
	public double fillColorAllFramesNameD(String path, double color)
	{
		return wrapper.PluginFillColorAllFramesNameD(path, color);
	}
	/*
	Set the RGB value for all colors for all frames. Use the range of 0 to 255 
	for red, green, and blue parameters. Animation is referenced by id.
	*/
	/// EXPORT_API void PluginFillColorAllFramesRGB(int animationId, int red, int green, int blue);
	public void fillColorAllFramesRGB(int animationId, int red, int green, int blue)
	{
		wrapper.PluginFillColorAllFramesRGB(animationId, red, green, blue);
	}
	/*
	Set the RGB value for all colors for all frames. Use the range of 0 to 255 
	for red, green, and blue parameters. Animation is referenced by name.
	*/
	/// EXPORT_API void PluginFillColorAllFramesRGBName(const char* path, int red, int green, int blue);
	public void fillColorAllFramesRGBName(String path, int red, int green, int blue)
	{
		wrapper.PluginFillColorAllFramesRGBName(path, red, green, blue);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginFillColorAllFramesRGBNameD(const char* path, double red, double green, double blue);
	public double fillColorAllFramesRGBNameD(String path, double red, double green, double blue)
	{
		return wrapper.PluginFillColorAllFramesRGBNameD(path, red, green, blue);
	}
	/*
	Set the RGB value for all colors in the specified frame. Animation is referenced 
	by name.
	*/
	/// EXPORT_API void PluginFillColorName(const char* path, int frameId, int color);
	public void fillColorName(String path, int frameId, int color)
	{
		wrapper.PluginFillColorName(path, frameId, color);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginFillColorNameD(const char* path, double frameId, double color);
	public double fillColorNameD(String path, double frameId, double color)
	{
		return wrapper.PluginFillColorNameD(path, frameId, color);
	}
	/*
	Set the RGB value for all colors in the specified frame. Animation is referenced 
	by id.
	*/
	/// EXPORT_API void PluginFillColorRGB(int animationId, int frameId, int red, int green, int blue);
	public void fillColorRGB(int animationId, int frameId, int red, int green, int blue)
	{
		wrapper.PluginFillColorRGB(animationId, frameId, red, green, blue);
	}
	/*
	Set the RGB value for all colors in the specified frame. Animation is referenced 
	by name.
	*/
	/// EXPORT_API void PluginFillColorRGBName(const char* path, int frameId, int red, int green, int blue);
	public void fillColorRGBName(String path, int frameId, int red, int green, int blue)
	{
		wrapper.PluginFillColorRGBName(path, frameId, red, green, blue);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginFillColorRGBNameD(const char* path, double frameId, double red, double green, double blue);
	public double fillColorRGBNameD(String path, double frameId, double red, double green, double blue)
	{
		return wrapper.PluginFillColorRGBNameD(path, frameId, red, green, blue);
	}
	/*
	This method will only update colors in the animation that are not already 
	set to black. Set the RGB value for a subset of colors in the specified 
	frame. Animation is referenced by id.
	*/
	/// EXPORT_API void PluginFillNonZeroColor(int animationId, int frameId, int color);
	public void fillNonZeroColor(int animationId, int frameId, int color)
	{
		wrapper.PluginFillNonZeroColor(animationId, frameId, color);
	}
	/*
	This method will only update colors in the animation that are not already 
	set to black. Set the RGB value for a subset of colors for all frames. 
	Animation is referenced by id.
	*/
	/// EXPORT_API void PluginFillNonZeroColorAllFrames(int animationId, int color);
	public void fillNonZeroColorAllFrames(int animationId, int color)
	{
		wrapper.PluginFillNonZeroColorAllFrames(animationId, color);
	}
	/*
	This method will only update colors in the animation that are not already 
	set to black. Set the RGB value for a subset of colors for all frames. 
	Animation is referenced by name.
	*/
	/// EXPORT_API void PluginFillNonZeroColorAllFramesName(const char* path, int color);
	public void fillNonZeroColorAllFramesName(String path, int color)
	{
		wrapper.PluginFillNonZeroColorAllFramesName(path, color);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginFillNonZeroColorAllFramesNameD(const char* path, double color);
	public double fillNonZeroColorAllFramesNameD(String path, double color)
	{
		return wrapper.PluginFillNonZeroColorAllFramesNameD(path, color);
	}
	/*
	This method will only update colors in the animation that are not already 
	set to black. Set the RGB value for a subset of colors for all frames. 
	Use the range of 0 to 255 for red, green, and blue parameters. Animation 
	is referenced by id.
	*/
	/// EXPORT_API void PluginFillNonZeroColorAllFramesRGB(int animationId, int red, int green, int blue);
	public void fillNonZeroColorAllFramesRGB(int animationId, int red, int green, int blue)
	{
		wrapper.PluginFillNonZeroColorAllFramesRGB(animationId, red, green, blue);
	}
	/*
	This method will only update colors in the animation that are not already 
	set to black. Set the RGB value for a subset of colors for all frames. 
	Use the range of 0 to 255 for red, green, and blue parameters. Animation 
	is referenced by name.
	*/
	/// EXPORT_API void PluginFillNonZeroColorAllFramesRGBName(const char* path, int red, int green, int blue);
	public void fillNonZeroColorAllFramesRGBName(String path, int red, int green, int blue)
	{
		wrapper.PluginFillNonZeroColorAllFramesRGBName(path, red, green, blue);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginFillNonZeroColorAllFramesRGBNameD(const char* path, double red, double green, double blue);
	public double fillNonZeroColorAllFramesRGBNameD(String path, double red, double green, double blue)
	{
		return wrapper.PluginFillNonZeroColorAllFramesRGBNameD(path, red, green, blue);
	}
	/*
	This method will only update colors in the animation that are not already 
	set to black. Set the RGB value for a subset of colors in the specified 
	frame. Animation is referenced by name.
	*/
	/// EXPORT_API void PluginFillNonZeroColorName(const char* path, int frameId, int color);
	public void fillNonZeroColorName(String path, int frameId, int color)
	{
		wrapper.PluginFillNonZeroColorName(path, frameId, color);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginFillNonZeroColorNameD(const char* path, double frameId, double color);
	public double fillNonZeroColorNameD(String path, double frameId, double color)
	{
		return wrapper.PluginFillNonZeroColorNameD(path, frameId, color);
	}
	/*
	This method will only update colors in the animation that are not already 
	set to black. Set the RGB value for a subset of colors in the specified 
	frame. Use the range of 0 to 255 for red, green, and blue parameters. Animation 
	is referenced by id.
	*/
	/// EXPORT_API void PluginFillNonZeroColorRGB(int animationId, int frameId, int red, int green, int blue);
	public void fillNonZeroColorRGB(int animationId, int frameId, int red, int green, int blue)
	{
		wrapper.PluginFillNonZeroColorRGB(animationId, frameId, red, green, blue);
	}
	/*
	This method will only update colors in the animation that are not already 
	set to black. Set the RGB value for a subset of colors in the specified 
	frame. Use the range of 0 to 255 for red, green, and blue parameters. Animation 
	is referenced by name.
	*/
	/// EXPORT_API void PluginFillNonZeroColorRGBName(const char* path, int frameId, int red, int green, int blue);
	public void fillNonZeroColorRGBName(String path, int frameId, int red, int green, int blue)
	{
		wrapper.PluginFillNonZeroColorRGBName(path, frameId, red, green, blue);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginFillNonZeroColorRGBNameD(const char* path, double frameId, double red, double green, double blue);
	public double fillNonZeroColorRGBNameD(String path, double frameId, double red, double green, double blue)
	{
		return wrapper.PluginFillNonZeroColorRGBNameD(path, frameId, red, green, blue);
	}
	/*
	Fill the frame with random RGB values for the given frame. Animation is 
	referenced by id.
	*/
	/// EXPORT_API void PluginFillRandomColors(int animationId, int frameId);
	public void fillRandomColors(int animationId, int frameId)
	{
		wrapper.PluginFillRandomColors(animationId, frameId);
	}
	/*
	Fill the frame with random RGB values for all frames. Animation is referenced 
	by id.
	*/
	/// EXPORT_API void PluginFillRandomColorsAllFrames(int animationId);
	public void fillRandomColorsAllFrames(int animationId)
	{
		wrapper.PluginFillRandomColorsAllFrames(animationId);
	}
	/*
	Fill the frame with random RGB values for all frames. Animation is referenced 
	by name.
	*/
	/// EXPORT_API void PluginFillRandomColorsAllFramesName(const char* path);
	public void fillRandomColorsAllFramesName(String path)
	{
		wrapper.PluginFillRandomColorsAllFramesName(path);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginFillRandomColorsAllFramesNameD(const char* path);
	public double fillRandomColorsAllFramesNameD(String path)
	{
		return wrapper.PluginFillRandomColorsAllFramesNameD(path);
	}
	/*
	Fill the frame with random black and white values for the specified frame. 
	Animation is referenced by id.
	*/
	/// EXPORT_API void PluginFillRandomColorsBlackAndWhite(int animationId, int frameId);
	public void fillRandomColorsBlackAndWhite(int animationId, int frameId)
	{
		wrapper.PluginFillRandomColorsBlackAndWhite(animationId, frameId);
	}
	/*
	Fill the frame with random black and white values for all frames. Animation 
	is referenced by id.
	*/
	/// EXPORT_API void PluginFillRandomColorsBlackAndWhiteAllFrames(int animationId);
	public void fillRandomColorsBlackAndWhiteAllFrames(int animationId)
	{
		wrapper.PluginFillRandomColorsBlackAndWhiteAllFrames(animationId);
	}
	/*
	Fill the frame with random black and white values for all frames. Animation 
	is referenced by name.
	*/
	/// EXPORT_API void PluginFillRandomColorsBlackAndWhiteAllFramesName(const char* path);
	public void fillRandomColorsBlackAndWhiteAllFramesName(String path)
	{
		wrapper.PluginFillRandomColorsBlackAndWhiteAllFramesName(path);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginFillRandomColorsBlackAndWhiteAllFramesNameD(const char* path);
	public double fillRandomColorsBlackAndWhiteAllFramesNameD(String path)
	{
		return wrapper.PluginFillRandomColorsBlackAndWhiteAllFramesNameD(path);
	}
	/*
	Fill the frame with random black and white values for the specified frame. 
	Animation is referenced by name.
	*/
	/// EXPORT_API void PluginFillRandomColorsBlackAndWhiteName(const char* path, int frameId);
	public void fillRandomColorsBlackAndWhiteName(String path, int frameId)
	{
		wrapper.PluginFillRandomColorsBlackAndWhiteName(path, frameId);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginFillRandomColorsBlackAndWhiteNameD(const char* path, double frameId);
	public double fillRandomColorsBlackAndWhiteNameD(String path, double frameId)
	{
		return wrapper.PluginFillRandomColorsBlackAndWhiteNameD(path, frameId);
	}
	/*
	Fill the frame with random RGB values for the given frame. Animation is 
	referenced by name.
	*/
	/// EXPORT_API void PluginFillRandomColorsName(const char* path, int frameId);
	public void fillRandomColorsName(String path, int frameId)
	{
		wrapper.PluginFillRandomColorsName(path, frameId);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginFillRandomColorsNameD(const char* path, double frameId);
	public double fillRandomColorsNameD(String path, double frameId)
	{
		return wrapper.PluginFillRandomColorsNameD(path, frameId);
	}
	/*
	Fill the specified frame with RGB color where the animation color is less 
	than the RGB threshold. Animation is referenced by id.
	*/
	/// EXPORT_API void PluginFillThresholdColors(int animationId, int frameId, int threshold, int color);
	public void fillThresholdColors(int animationId, int frameId, int threshold, int color)
	{
		wrapper.PluginFillThresholdColors(animationId, frameId, threshold, color);
	}
	/*
	Fill all frames with RGB color where the animation color is less than the 
	RGB threshold. Animation is referenced by id.
	*/
	/// EXPORT_API void PluginFillThresholdColorsAllFrames(int animationId, int threshold, int color);
	public void fillThresholdColorsAllFrames(int animationId, int threshold, int color)
	{
		wrapper.PluginFillThresholdColorsAllFrames(animationId, threshold, color);
	}
	/*
	Fill all frames with RGB color where the animation color is less than the 
	RGB threshold. Animation is referenced by name.
	*/
	/// EXPORT_API void PluginFillThresholdColorsAllFramesName(const char* path, int threshold, int color);
	public void fillThresholdColorsAllFramesName(String path, int threshold, int color)
	{
		wrapper.PluginFillThresholdColorsAllFramesName(path, threshold, color);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginFillThresholdColorsAllFramesNameD(const char* path, double threshold, double color);
	public double fillThresholdColorsAllFramesNameD(String path, double threshold, double color)
	{
		return wrapper.PluginFillThresholdColorsAllFramesNameD(path, threshold, color);
	}
	/*
	Fill all frames with RGB color where the animation color is less than the 
	threshold. Animation is referenced by id.
	*/
	/// EXPORT_API void PluginFillThresholdColorsAllFramesRGB(int animationId, int threshold, int red, int green, int blue);
	public void fillThresholdColorsAllFramesRGB(int animationId, int threshold, int red, int green, int blue)
	{
		wrapper.PluginFillThresholdColorsAllFramesRGB(animationId, threshold, red, green, blue);
	}
	/*
	Fill all frames with RGB color where the animation color is less than the 
	threshold. Animation is referenced by name.
	*/
	/// EXPORT_API void PluginFillThresholdColorsAllFramesRGBName(const char* path, int threshold, int red, int green, int blue);
	public void fillThresholdColorsAllFramesRGBName(String path, int threshold, int red, int green, int blue)
	{
		wrapper.PluginFillThresholdColorsAllFramesRGBName(path, threshold, red, green, blue);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginFillThresholdColorsAllFramesRGBNameD(const char* path, double threshold, double red, double green, double blue);
	public double fillThresholdColorsAllFramesRGBNameD(String path, double threshold, double red, double green, double blue)
	{
		return wrapper.PluginFillThresholdColorsAllFramesRGBNameD(path, threshold, red, green, blue);
	}
	/*
	Fill all frames with the min RGB color where the animation color is less 
	than the min threshold AND with the max RGB color where the animation is 
	more than the max threshold. Animation is referenced by id.
	*/
	/// EXPORT_API void PluginFillThresholdColorsMinMaxAllFramesRGB(int animationId, int minThreshold, int minRed, int minGreen, int minBlue, int maxThreshold, int maxRed, int maxGreen, int maxBlue);
	public void fillThresholdColorsMinMaxAllFramesRGB(int animationId, int minThreshold, int minRed, int minGreen, int minBlue, int maxThreshold, int maxRed, int maxGreen, int maxBlue)
	{
		wrapper.PluginFillThresholdColorsMinMaxAllFramesRGB(animationId, minThreshold, minRed, minGreen, minBlue, maxThreshold, maxRed, maxGreen, maxBlue);
	}
	/*
	Fill all frames with the min RGB color where the animation color is less 
	than the min threshold AND with the max RGB color where the animation is 
	more than the max threshold. Animation is referenced by name.
	*/
	/// EXPORT_API void PluginFillThresholdColorsMinMaxAllFramesRGBName(const char* path, int minThreshold, int minRed, int minGreen, int minBlue, int maxThreshold, int maxRed, int maxGreen, int maxBlue);
	public void fillThresholdColorsMinMaxAllFramesRGBName(String path, int minThreshold, int minRed, int minGreen, int minBlue, int maxThreshold, int maxRed, int maxGreen, int maxBlue)
	{
		wrapper.PluginFillThresholdColorsMinMaxAllFramesRGBName(path, minThreshold, minRed, minGreen, minBlue, maxThreshold, maxRed, maxGreen, maxBlue);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginFillThresholdColorsMinMaxAllFramesRGBNameD(const char* path, double minThreshold, double minRed, double minGreen, double minBlue, double maxThreshold, double maxRed, double maxGreen, double maxBlue);
	public double fillThresholdColorsMinMaxAllFramesRGBNameD(String path, double minThreshold, double minRed, double minGreen, double minBlue, double maxThreshold, double maxRed, double maxGreen, double maxBlue)
	{
		return wrapper.PluginFillThresholdColorsMinMaxAllFramesRGBNameD(path, minThreshold, minRed, minGreen, minBlue, maxThreshold, maxRed, maxGreen, maxBlue);
	}
	/*
	Fill the specified frame with the min RGB color where the animation color 
	is less than the min threshold AND with the max RGB color where the animation 
	is more than the max threshold. Animation is referenced by id.
	*/
	/// EXPORT_API void PluginFillThresholdColorsMinMaxRGB(int animationId, int frameId, int minThreshold, int minRed, int minGreen, int minBlue, int maxThreshold, int maxRed, int maxGreen, int maxBlue);
	public void fillThresholdColorsMinMaxRGB(int animationId, int frameId, int minThreshold, int minRed, int minGreen, int minBlue, int maxThreshold, int maxRed, int maxGreen, int maxBlue)
	{
		wrapper.PluginFillThresholdColorsMinMaxRGB(animationId, frameId, minThreshold, minRed, minGreen, minBlue, maxThreshold, maxRed, maxGreen, maxBlue);
	}
	/*
	Fill the specified frame with the min RGB color where the animation color 
	is less than the min threshold AND with the max RGB color where the animation 
	is more than the max threshold. Animation is referenced by name.
	*/
	/// EXPORT_API void PluginFillThresholdColorsMinMaxRGBName(const char* path, int frameId, int minThreshold, int minRed, int minGreen, int minBlue, int maxThreshold, int maxRed, int maxGreen, int maxBlue);
	public void fillThresholdColorsMinMaxRGBName(String path, int frameId, int minThreshold, int minRed, int minGreen, int minBlue, int maxThreshold, int maxRed, int maxGreen, int maxBlue)
	{
		wrapper.PluginFillThresholdColorsMinMaxRGBName(path, frameId, minThreshold, minRed, minGreen, minBlue, maxThreshold, maxRed, maxGreen, maxBlue);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginFillThresholdColorsMinMaxRGBNameD(const char* path, double frameId, double minThreshold, double minRed, double minGreen, double minBlue, double maxThreshold, double maxRed, double maxGreen, double maxBlue);
	public double fillThresholdColorsMinMaxRGBNameD(String path, double frameId, double minThreshold, double minRed, double minGreen, double minBlue, double maxThreshold, double maxRed, double maxGreen, double maxBlue)
	{
		return wrapper.PluginFillThresholdColorsMinMaxRGBNameD(path, frameId, minThreshold, minRed, minGreen, minBlue, maxThreshold, maxRed, maxGreen, maxBlue);
	}
	/*
	Fill the specified frame with RGB color where the animation color is less 
	than the RGB threshold. Animation is referenced by name.
	*/
	/// EXPORT_API void PluginFillThresholdColorsName(const char* path, int frameId, int threshold, int color);
	public void fillThresholdColorsName(String path, int frameId, int threshold, int color)
	{
		wrapper.PluginFillThresholdColorsName(path, frameId, threshold, color);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginFillThresholdColorsNameD(const char* path, double frameId, double threshold, double color);
	public double fillThresholdColorsNameD(String path, double frameId, double threshold, double color)
	{
		return wrapper.PluginFillThresholdColorsNameD(path, frameId, threshold, color);
	}
	/*
	Fill the specified frame with RGB color where the animation color is less 
	than the RGB threshold. Animation is referenced by id.
	*/
	/// EXPORT_API void PluginFillThresholdColorsRGB(int animationId, int frameId, int threshold, int red, int green, int blue);
	public void fillThresholdColorsRGB(int animationId, int frameId, int threshold, int red, int green, int blue)
	{
		wrapper.PluginFillThresholdColorsRGB(animationId, frameId, threshold, red, green, blue);
	}
	/*
	Fill the specified frame with RGB color where the animation color is less 
	than the RGB threshold. Animation is referenced by name.
	*/
	/// EXPORT_API void PluginFillThresholdColorsRGBName(const char* path, int frameId, int threshold, int red, int green, int blue);
	public void fillThresholdColorsRGBName(String path, int frameId, int threshold, int red, int green, int blue)
	{
		wrapper.PluginFillThresholdColorsRGBName(path, frameId, threshold, red, green, blue);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginFillThresholdColorsRGBNameD(const char* path, double frameId, double threshold, double red, double green, double blue);
	public double fillThresholdColorsRGBNameD(String path, double frameId, double threshold, double red, double green, double blue)
	{
		return wrapper.PluginFillThresholdColorsRGBNameD(path, frameId, threshold, red, green, blue);
	}
	/*
	Fill all frames with RGB color where the animation color is less than the 
	RGB threshold. Animation is referenced by id.
	*/
	/// EXPORT_API void PluginFillThresholdRGBColorsAllFramesRGB(int animationId, int redThreshold, int greenThreshold, int blueThreshold, int red, int green, int blue);
	public void fillThresholdRGBColorsAllFramesRGB(int animationId, int redThreshold, int greenThreshold, int blueThreshold, int red, int green, int blue)
	{
		wrapper.PluginFillThresholdRGBColorsAllFramesRGB(animationId, redThreshold, greenThreshold, blueThreshold, red, green, blue);
	}
	/*
	Fill all frames with RGB color where the animation color is less than the 
	RGB threshold. Animation is referenced by name.
	*/
	/// EXPORT_API void PluginFillThresholdRGBColorsAllFramesRGBName(const char* path, int redThreshold, int greenThreshold, int blueThreshold, int red, int green, int blue);
	public void fillThresholdRGBColorsAllFramesRGBName(String path, int redThreshold, int greenThreshold, int blueThreshold, int red, int green, int blue)
	{
		wrapper.PluginFillThresholdRGBColorsAllFramesRGBName(path, redThreshold, greenThreshold, blueThreshold, red, green, blue);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginFillThresholdRGBColorsAllFramesRGBNameD(const char* path, double redThreshold, double greenThreshold, double blueThreshold, double red, double green, double blue);
	public double fillThresholdRGBColorsAllFramesRGBNameD(String path, double redThreshold, double greenThreshold, double blueThreshold, double red, double green, double blue)
	{
		return wrapper.PluginFillThresholdRGBColorsAllFramesRGBNameD(path, redThreshold, greenThreshold, blueThreshold, red, green, blue);
	}
	/*
	Fill the specified frame with RGB color where the animation color is less 
	than the RGB threshold. Animation is referenced by id.
	*/
	/// EXPORT_API void PluginFillThresholdRGBColorsRGB(int animationId, int frameId, int redThreshold, int greenThreshold, int blueThreshold, int red, int green, int blue);
	public void fillThresholdRGBColorsRGB(int animationId, int frameId, int redThreshold, int greenThreshold, int blueThreshold, int red, int green, int blue)
	{
		wrapper.PluginFillThresholdRGBColorsRGB(animationId, frameId, redThreshold, greenThreshold, blueThreshold, red, green, blue);
	}
	/*
	Fill the specified frame with RGB color where the animation color is less 
	than the RGB threshold. Animation is referenced by name.
	*/
	/// EXPORT_API void PluginFillThresholdRGBColorsRGBName(const char* path, int frameId, int redThreshold, int greenThreshold, int blueThreshold, int red, int green, int blue);
	public void fillThresholdRGBColorsRGBName(String path, int frameId, int redThreshold, int greenThreshold, int blueThreshold, int red, int green, int blue)
	{
		wrapper.PluginFillThresholdRGBColorsRGBName(path, frameId, redThreshold, greenThreshold, blueThreshold, red, green, blue);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginFillThresholdRGBColorsRGBNameD(const char* path, double frameId, double redThreshold, double greenThreshold, double blueThreshold, double red, double green, double blue);
	public double fillThresholdRGBColorsRGBNameD(String path, double frameId, double redThreshold, double greenThreshold, double blueThreshold, double red, double green, double blue)
	{
		return wrapper.PluginFillThresholdRGBColorsRGBNameD(path, frameId, redThreshold, greenThreshold, blueThreshold, red, green, blue);
	}
	/*
	Fill the specified frame with RGB color where the animation color is zero. 
	Animation is referenced by id.
	*/
	/// EXPORT_API void PluginFillZeroColor(int animationId, int frameId, int color);
	public void fillZeroColor(int animationId, int frameId, int color)
	{
		wrapper.PluginFillZeroColor(animationId, frameId, color);
	}
	/*
	Fill all frames with RGB color where the animation color is zero. Animation 
	is referenced by id.
	*/
	/// EXPORT_API void PluginFillZeroColorAllFrames(int animationId, int color);
	public void fillZeroColorAllFrames(int animationId, int color)
	{
		wrapper.PluginFillZeroColorAllFrames(animationId, color);
	}
	/*
	Fill all frames with RGB color where the animation color is zero. Animation 
	is referenced by name.
	*/
	/// EXPORT_API void PluginFillZeroColorAllFramesName(const char* path, int color);
	public void fillZeroColorAllFramesName(String path, int color)
	{
		wrapper.PluginFillZeroColorAllFramesName(path, color);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginFillZeroColorAllFramesNameD(const char* path, double color);
	public double fillZeroColorAllFramesNameD(String path, double color)
	{
		return wrapper.PluginFillZeroColorAllFramesNameD(path, color);
	}
	/*
	Fill all frames with RGB color where the animation color is zero. Animation 
	is referenced by id.
	*/
	/// EXPORT_API void PluginFillZeroColorAllFramesRGB(int animationId, int red, int green, int blue);
	public void fillZeroColorAllFramesRGB(int animationId, int red, int green, int blue)
	{
		wrapper.PluginFillZeroColorAllFramesRGB(animationId, red, green, blue);
	}
	/*
	Fill all frames with RGB color where the animation color is zero. Animation 
	is referenced by name.
	*/
	/// EXPORT_API void PluginFillZeroColorAllFramesRGBName(const char* path, int red, int green, int blue);
	public void fillZeroColorAllFramesRGBName(String path, int red, int green, int blue)
	{
		wrapper.PluginFillZeroColorAllFramesRGBName(path, red, green, blue);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginFillZeroColorAllFramesRGBNameD(const char* path, double red, double green, double blue);
	public double fillZeroColorAllFramesRGBNameD(String path, double red, double green, double blue)
	{
		return wrapper.PluginFillZeroColorAllFramesRGBNameD(path, red, green, blue);
	}
	/*
	Fill the specified frame with RGB color where the animation color is zero. 
	Animation is referenced by name.
	*/
	/// EXPORT_API void PluginFillZeroColorName(const char* path, int frameId, int color);
	public void fillZeroColorName(String path, int frameId, int color)
	{
		wrapper.PluginFillZeroColorName(path, frameId, color);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginFillZeroColorNameD(const char* path, double frameId, double color);
	public double fillZeroColorNameD(String path, double frameId, double color)
	{
		return wrapper.PluginFillZeroColorNameD(path, frameId, color);
	}
	/*
	Fill the specified frame with RGB color where the animation color is zero. 
	Animation is referenced by id.
	*/
	/// EXPORT_API void PluginFillZeroColorRGB(int animationId, int frameId, int red, int green, int blue);
	public void fillZeroColorRGB(int animationId, int frameId, int red, int green, int blue)
	{
		wrapper.PluginFillZeroColorRGB(animationId, frameId, red, green, blue);
	}
	/*
	Fill the specified frame with RGB color where the animation color is zero. 
	Animation is referenced by name.
	*/
	/// EXPORT_API void PluginFillZeroColorRGBName(const char* path, int frameId, int red, int green, int blue);
	public void fillZeroColorRGBName(String path, int frameId, int red, int green, int blue)
	{
		wrapper.PluginFillZeroColorRGBName(path, frameId, red, green, blue);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginFillZeroColorRGBNameD(const char* path, double frameId, double red, double green, double blue);
	public double fillZeroColorRGBNameD(String path, double frameId, double red, double green, double blue)
	{
		return wrapper.PluginFillZeroColorRGBNameD(path, frameId, red, green, blue);
	}
	/*
	Get the animation color for a frame given the `1D` `led`. The `led` should 
	be greater than or equal to 0 and less than the `MaxLeds`. Animation is 
	referenced by id.
	*/
	/// EXPORT_API int PluginGet1DColor(int animationId, int frameId, int led);
	public int get1DColor(int animationId, int frameId, int led)
	{
		return wrapper.PluginGet1DColor(animationId, frameId, led);
	}
	/*
	Get the animation color for a frame given the `1D` `led`. The `led` should 
	be greater than or equal to 0 and less than the `MaxLeds`. Animation is 
	referenced by name.
	*/
	/// EXPORT_API int PluginGet1DColorName(const char* path, int frameId, int led);
	public int get1DColorName(String path, int frameId, int led)
	{
		return wrapper.PluginGet1DColorName(path, frameId, led);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginGet1DColorNameD(const char* path, double frameId, double led);
	public double get1DColorNameD(String path, double frameId, double led)
	{
		return wrapper.PluginGet1DColorNameD(path, frameId, led);
	}
	/*
	Get the animation color for a frame given the `2D` `row` and `column`. The 
	`row` should be greater than or equal to 0 and less than the `MaxRow`. 
	The `column` should be greater than or equal to 0 and less than the `MaxColumn`. 
	Animation is referenced by id.
	*/
	/// EXPORT_API int PluginGet2DColor(int animationId, int frameId, int row, int column);
	public int get2DColor(int animationId, int frameId, int row, int column)
	{
		return wrapper.PluginGet2DColor(animationId, frameId, row, column);
	}
	/*
	Get the animation color for a frame given the `2D` `row` and `column`. The 
	`row` should be greater than or equal to 0 and less than the `MaxRow`. 
	The `column` should be greater than or equal to 0 and less than the `MaxColumn`. 
	Animation is referenced by name.
	*/
	/// EXPORT_API int PluginGet2DColorName(const char* path, int frameId, int row, int column);
	public int get2DColorName(String path, int frameId, int row, int column)
	{
		return wrapper.PluginGet2DColorName(path, frameId, row, column);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginGet2DColorNameD(const char* path, double frameId, double row, double column);
	public double get2DColorNameD(String path, double frameId, double row, double column)
	{
		return wrapper.PluginGet2DColorNameD(path, frameId, row, column);
	}
	/*
	Get the animation id for the named animation.
	*/
	/// EXPORT_API int PluginGetAnimation(const char* name);
	public int getAnimation(String name)
	{
		return wrapper.PluginGetAnimation(name);
	}
	/*
	`PluginGetAnimationCount` will return the number of loaded animations.
	*/
	/// EXPORT_API int PluginGetAnimationCount();
	public int getAnimationCount()
	{
		return wrapper.PluginGetAnimationCount();
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginGetAnimationD(const char* name);
	public double getAnimationD(String name)
	{
		return wrapper.PluginGetAnimationD(name);
	}
	/*
	`PluginGetAnimationId` will return the `animationId` given the `index` of 
	the loaded animation. The `index` is zero-based and less than the number 
	returned by `PluginGetAnimationCount`. Use `PluginGetAnimationName` to 
	get the name of the animation.
	*/
	/// EXPORT_API int PluginGetAnimationId(int index);
	public int getAnimationId(int index)
	{
		return wrapper.PluginGetAnimationId(index);
	}
	/*
	`PluginGetAnimationName` takes an `animationId` and returns the name of 
	the animation of the `.chroma` animation file. If a name is not available 
	then an empty string will be returned.
	*/
	/// EXPORT_API const char* PluginGetAnimationName(int animationId);
	public String getAnimationName(int animationId)
	{
		return wrapper.PluginGetAnimationName(animationId);
	}
	/*
	Get the current frame of the animation referenced by id.
	*/
	/// EXPORT_API int PluginGetCurrentFrame(int animationId);
	public int getCurrentFrame(int animationId)
	{
		return wrapper.PluginGetCurrentFrame(animationId);
	}
	/*
	Get the current frame of the animation referenced by name.
	*/
	/// EXPORT_API int PluginGetCurrentFrameName(const char* path);
	public int getCurrentFrameName(String path)
	{
		return wrapper.PluginGetCurrentFrameName(path);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginGetCurrentFrameNameD(const char* path);
	public double getCurrentFrameNameD(String path)
	{
		return wrapper.PluginGetCurrentFrameNameD(path);
	}
	/*
	Returns the `EChromaSDKDevice1DEnum` or `EChromaSDKDevice2DEnum` of a `Chroma` 
	animation respective to the `deviceType`, as an integer upon success. Returns 
	negative one upon failure.
	*/
	/// EXPORT_API int PluginGetDevice(int animationId);
	public int getDevice(int animationId)
	{
		return wrapper.PluginGetDevice(animationId);
	}
	/*
	Returns the `EChromaSDKDevice1DEnum` or `EChromaSDKDevice2DEnum` of a `Chroma` 
	animation respective to the `deviceType`, as an integer upon success. Returns 
	negative one upon failure.
	*/
	/// EXPORT_API int PluginGetDeviceName(const char* path);
	public int getDeviceName(String path)
	{
		return wrapper.PluginGetDeviceName(path);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginGetDeviceNameD(const char* path);
	public double getDeviceNameD(String path)
	{
		return wrapper.PluginGetDeviceNameD(path);
	}
	/*
	Returns the `EChromaSDKDeviceTypeEnum` of a `Chroma` animation as an integer 
	upon success. Returns negative one upon failure.
	*/
	/// EXPORT_API int PluginGetDeviceType(int animationId);
	public int getDeviceType(int animationId)
	{
		return wrapper.PluginGetDeviceType(animationId);
	}
	/*
	Returns the `EChromaSDKDeviceTypeEnum` of a `Chroma` animation as an integer 
	upon success. Returns negative one upon failure.
	*/
	/// EXPORT_API int PluginGetDeviceTypeName(const char* path);
	public int getDeviceTypeName(String path)
	{
		return wrapper.PluginGetDeviceTypeName(path);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginGetDeviceTypeNameD(const char* path);
	public double getDeviceTypeNameD(String path)
	{
		return wrapper.PluginGetDeviceTypeNameD(path);
	}
	/*
	Get the frame colors and duration (in seconds) for a `Chroma` animation 
	referenced by id. The `color` is expected to be an array of the expected 
	dimensions for the `deviceType/device`. The `length` parameter is the size 
	of the `color` array. For `EChromaSDKDevice1DEnum` the array size should 
	be `MAX LEDS`. For `EChromaSDKDevice2DEnum` the array size should be `MAX 
	ROW` times `MAX COLUMN`. Keys are populated only for EChromaSDKDevice2DEnum::DE_Keyboard 
	and EChromaSDKDevice2DEnum::DE_KeyboardExtended. Keys will only use the 
	EChromaSDKDevice2DEnum::DE_Keyboard `MAX_ROW` times `MAX_COLUMN` keysLength. 
	Returns the animation id upon success. Returns negative one upon failure.
	*/
	/// EXPORT_API int PluginGetFrame(int animationId, int frameId, float* duration, int* colors, int length, int* keys, int keysLength);
	public int getFrame(int animationId, int frameId, Pointer duration, Pointer colors, int length, Pointer keys, int keysLength)
	{
		return wrapper.PluginGetFrame(animationId, frameId, duration, colors, length, keys, keysLength);
	}
	/*
	Returns the frame count of a `Chroma` animation upon success. Returns negative 
	one upon failure.
	*/
	/// EXPORT_API int PluginGetFrameCount(int animationId);
	public int getFrameCount(int animationId)
	{
		return wrapper.PluginGetFrameCount(animationId);
	}
	/*
	Returns the frame count of a `Chroma` animation upon success. Returns negative 
	one upon failure.
	*/
	/// EXPORT_API int PluginGetFrameCountName(const char* path);
	public int getFrameCountName(String path)
	{
		return wrapper.PluginGetFrameCountName(path);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginGetFrameCountNameD(const char* path);
	public double getFrameCountNameD(String path)
	{
		return wrapper.PluginGetFrameCountNameD(path);
	}
	/*
	Returns the duration of an animation frame in seconds upon success. Returns 
	zero upon failure.
	*/
	/// EXPORT_API float PluginGetFrameDuration(int animationId, int frameId);
	public float getFrameDuration(int animationId, int frameId)
	{
		return wrapper.PluginGetFrameDuration(animationId, frameId);
	}
	/*
	Returns the duration of an animation frame in seconds upon success. Returns 
	zero upon failure.
	*/
	/// EXPORT_API float PluginGetFrameDurationName(const char* path, int frameId);
	public float getFrameDurationName(String path, int frameId)
	{
		return wrapper.PluginGetFrameDurationName(path, frameId);
	}
	/*
	Get the frame colors and duration (in seconds) for a `Chroma` animation 
	referenced by name. The `color` is expected to be an array of the expected 
	dimensions for the `deviceType/device`. The `length` parameter is the size 
	of the `color` array. For `EChromaSDKDevice1DEnum` the array size should 
	be `MAX LEDS`. For `EChromaSDKDevice2DEnum` the array size should be `MAX 
	ROW` times `MAX COLUMN`. Keys are populated only for EChromaSDKDevice2DEnum::DE_Keyboard 
	and EChromaSDKDevice2DEnum::DE_KeyboardExtended. Keys will only use the 
	EChromaSDKDevice2DEnum::DE_Keyboard `MAX_ROW` times `MAX_COLUMN` keysLength. 
	Returns the animation id upon success. Returns negative one upon failure.
	*/
	/// EXPORT_API int PluginGetFrameName(const char* path, int frameId, float* duration, int* colors, int length, int* keys, int keysLength);
	public int getFrameName(String path, int frameId, Pointer duration, Pointer colors, int length, Pointer keys, int keysLength)
	{
		return wrapper.PluginGetFrameName(path, frameId, duration, colors, length, keys, keysLength);
	}
	/*
	Get the color of an animation key for the given frame referenced by id.
	*/
	/// EXPORT_API int PluginGetKeyColor(int animationId, int frameId, int rzkey);
	public int getKeyColor(int animationId, int frameId, int rzkey)
	{
		return wrapper.PluginGetKeyColor(animationId, frameId, rzkey);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginGetKeyColorD(const char* path, double frameId, double rzkey);
	public double getKeyColorD(String path, double frameId, double rzkey)
	{
		return wrapper.PluginGetKeyColorD(path, frameId, rzkey);
	}
	/*
	Get the color of an animation key for the given frame referenced by name.
	*/
	/// EXPORT_API int PluginGetKeyColorName(const char* path, int frameId, int rzkey);
	public int getKeyColorName(String path, int frameId, int rzkey)
	{
		return wrapper.PluginGetKeyColorName(path, frameId, rzkey);
	}
	/*
	Returns `RZRESULT_SUCCESS` if the plugin has been initialized successfully. 
	Returns `RZRESULT_DLL_NOT_FOUND` if core Chroma library is not found. Returns 
	`RZRESULT_DLL_INVALID_SIGNATURE` if core Chroma library has an invalid 
	signature.
	*/
	/// EXPORT_API RZRESULT PluginGetLibraryLoadedState();
	public int getLibraryLoadedState()
	{
		return wrapper.PluginGetLibraryLoadedState();
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginGetLibraryLoadedStateD();
	public double getLibraryLoadedStateD()
	{
		return wrapper.PluginGetLibraryLoadedStateD();
	}
	/*
	Returns the `MAX COLUMN` given the `EChromaSDKDevice2DEnum` device as an 
	integer upon success. Returns negative one upon failure.
	*/
	/// EXPORT_API int PluginGetMaxColumn(int device);
	public int getMaxColumn(int device)
	{
		return wrapper.PluginGetMaxColumn(device);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginGetMaxColumnD(double device);
	public double getMaxColumnD(double device)
	{
		return wrapper.PluginGetMaxColumnD(device);
	}
	/*
	Returns the MAX LEDS given the `EChromaSDKDevice1DEnum` device as an integer 
	upon success. Returns negative one upon failure.
	*/
	/// EXPORT_API int PluginGetMaxLeds(int device);
	public int getMaxLeds(int device)
	{
		return wrapper.PluginGetMaxLeds(device);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginGetMaxLedsD(double device);
	public double getMaxLedsD(double device)
	{
		return wrapper.PluginGetMaxLedsD(device);
	}
	/*
	Returns the `MAX ROW` given the `EChromaSDKDevice2DEnum` device as an integer 
	upon success. Returns negative one upon failure.
	*/
	/// EXPORT_API int PluginGetMaxRow(int device);
	public int getMaxRow(int device)
	{
		return wrapper.PluginGetMaxRow(device);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginGetMaxRowD(double device);
	public double getMaxRowD(double device)
	{
		return wrapper.PluginGetMaxRowD(device);
	}
	/*
	`PluginGetPlayingAnimationCount` will return the number of playing animations.
	*/
	/// EXPORT_API int PluginGetPlayingAnimationCount();
	public int getPlayingAnimationCount()
	{
		return wrapper.PluginGetPlayingAnimationCount();
	}
	/*
	`PluginGetPlayingAnimationId` will return the `animationId` given the `index` 
	of the playing animation. The `index` is zero-based and less than the number 
	returned by `PluginGetPlayingAnimationCount`. Use `PluginGetAnimationName` 
	to get the name of the animation.
	*/
	/// EXPORT_API int PluginGetPlayingAnimationId(int index);
	public int getPlayingAnimationId(int index)
	{
		return wrapper.PluginGetPlayingAnimationId(index);
	}
	/*
	Get the RGB color given red, green, and blue.
	*/
	/// EXPORT_API int PluginGetRGB(int red, int green, int blue);
	public int getRGB(int red, int green, int blue)
	{
		return wrapper.PluginGetRGB(red, green, blue);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginGetRGBD(double red, double green, double blue);
	public double getRGBD(double red, double green, double blue)
	{
		return wrapper.PluginGetRGBD(red, green, blue);
	}
	/*
	Returns the total duration of an animation in seconds upon success. Returns 
	zero upon failure.
	*/
	/// EXPORT_API float PluginGetTotalDuration(int animationId);
	public float getTotalDuration(int animationId)
	{
		return wrapper.PluginGetTotalDuration(animationId);
	}
	/*
	Returns the total duration of an animation in seconds upon success. Returns 
	zero upon failure.
	*/
	/// EXPORT_API float PluginGetTotalDurationName(const char* path);
	public float getTotalDurationName(String path)
	{
		return wrapper.PluginGetTotalDurationName(path);
	}
	/*
	Check if the animation has loop enabled referenced by id.
	*/
	/// EXPORT_API bool PluginHasAnimationLoop(int animationId);
	public boolean hasAnimationLoop(int animationId)
	{
		return wrapper.PluginHasAnimationLoop(animationId);
	}
	/*
	Check if the animation has loop enabled referenced by name.
	*/
	/// EXPORT_API bool PluginHasAnimationLoopName(const char* path);
	public boolean hasAnimationLoopName(String path)
	{
		return wrapper.PluginHasAnimationLoopName(path);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginHasAnimationLoopNameD(const char* path);
	public double hasAnimationLoopNameD(String path)
	{
		return wrapper.PluginHasAnimationLoopNameD(path);
	}
	/*
	Initialize the ChromaSDK. Zero indicates  success, otherwise failure. Many 
	API methods auto initialize the ChromaSDK if not already initialized.
	*/
	/// EXPORT_API RZRESULT PluginInit();
	public int init()
	{
		return wrapper.PluginInit();
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginInitD();
	public double initD()
	{
		return wrapper.PluginInitD();
	}
	/*
	Initialize the ChromaSDK. AppInfo populates the details in Synapse. Zero 
	indicates  success, otherwise failure. Many API methods auto initialize 
	the ChromaSDK if not already initialized.
	*/
	/// EXPORT_API RZRESULT PluginInitSDK(ChromaSDK::APPINFOTYPE* AppInfo);
	public int initSDK(JAppInfoType appInfo)
	{
		return wrapper.PluginInitSDK(appInfo);
	}
	/*
	Insert an animation delay by duplicating the frame by the delay number of 
	times. Animation is referenced by id.
	*/
	/// EXPORT_API void PluginInsertDelay(int animationId, int frameId, int delay);
	public void insertDelay(int animationId, int frameId, int delay)
	{
		wrapper.PluginInsertDelay(animationId, frameId, delay);
	}
	/*
	Insert an animation delay by duplicating the frame by the delay number of 
	times. Animation is referenced by name.
	*/
	/// EXPORT_API void PluginInsertDelayName(const char* path, int frameId, int delay);
	public void insertDelayName(String path, int frameId, int delay)
	{
		wrapper.PluginInsertDelayName(path, frameId, delay);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginInsertDelayNameD(const char* path, double frameId, double delay);
	public double insertDelayNameD(String path, double frameId, double delay)
	{
		return wrapper.PluginInsertDelayNameD(path, frameId, delay);
	}
	/*
	Duplicate the source frame index at the target frame index. Animation is 
	referenced by id.
	*/
	/// EXPORT_API void PluginInsertFrame(int animationId, int sourceFrame, int targetFrame);
	public void insertFrame(int animationId, int sourceFrame, int targetFrame)
	{
		wrapper.PluginInsertFrame(animationId, sourceFrame, targetFrame);
	}
	/*
	Duplicate the source frame index at the target frame index. Animation is 
	referenced by name.
	*/
	/// EXPORT_API void PluginInsertFrameName(const char* path, int sourceFrame, int targetFrame);
	public void insertFrameName(String path, int sourceFrame, int targetFrame)
	{
		wrapper.PluginInsertFrameName(path, sourceFrame, targetFrame);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginInsertFrameNameD(const char* path, double sourceFrame, double targetFrame);
	public double insertFrameNameD(String path, double sourceFrame, double targetFrame)
	{
		return wrapper.PluginInsertFrameNameD(path, sourceFrame, targetFrame);
	}
	/*
	Invert all the colors at the specified frame. Animation is referenced by 
	id.
	*/
	/// EXPORT_API void PluginInvertColors(int animationId, int frameId);
	public void invertColors(int animationId, int frameId)
	{
		wrapper.PluginInvertColors(animationId, frameId);
	}
	/*
	Invert all the colors for all frames. Animation is referenced by id.
	*/
	/// EXPORT_API void PluginInvertColorsAllFrames(int animationId);
	public void invertColorsAllFrames(int animationId)
	{
		wrapper.PluginInvertColorsAllFrames(animationId);
	}
	/*
	Invert all the colors for all frames. Animation is referenced by name.
	*/
	/// EXPORT_API void PluginInvertColorsAllFramesName(const char* path);
	public void invertColorsAllFramesName(String path)
	{
		wrapper.PluginInvertColorsAllFramesName(path);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginInvertColorsAllFramesNameD(const char* path);
	public double invertColorsAllFramesNameD(String path)
	{
		return wrapper.PluginInvertColorsAllFramesNameD(path);
	}
	/*
	Invert all the colors at the specified frame. Animation is referenced by 
	name.
	*/
	/// EXPORT_API void PluginInvertColorsName(const char* path, int frameId);
	public void invertColorsName(String path, int frameId)
	{
		wrapper.PluginInvertColorsName(path, frameId);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginInvertColorsNameD(const char* path, double frameId);
	public double invertColorsNameD(String path, double frameId)
	{
		return wrapper.PluginInvertColorsNameD(path, frameId);
	}
	/*
	Check if the animation is paused referenced by id.
	*/
	/// EXPORT_API bool PluginIsAnimationPaused(int animationId);
	public boolean isAnimationPaused(int animationId)
	{
		return wrapper.PluginIsAnimationPaused(animationId);
	}
	/*
	Check if the animation is paused referenced by name.
	*/
	/// EXPORT_API bool PluginIsAnimationPausedName(const char* path);
	public boolean isAnimationPausedName(String path)
	{
		return wrapper.PluginIsAnimationPausedName(path);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginIsAnimationPausedNameD(const char* path);
	public double isAnimationPausedNameD(String path)
	{
		return wrapper.PluginIsAnimationPausedNameD(path);
	}
	/*
	The editor dialog is a non-blocking modal window, this method returns true 
	if the modal window is open, otherwise false.
	*/
	/// EXPORT_API bool PluginIsDialogOpen();
	public boolean isDialogOpen()
	{
		return wrapper.PluginIsDialogOpen();
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginIsDialogOpenD();
	public double isDialogOpenD()
	{
		return wrapper.PluginIsDialogOpenD();
	}
	/*
	Returns true if the plugin has been initialized. Returns false if the plugin 
	is uninitialized.
	*/
	/// EXPORT_API bool PluginIsInitialized();
	public boolean isInitialized()
	{
		return wrapper.PluginIsInitialized();
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginIsInitializedD();
	public double isInitializedD()
	{
		return wrapper.PluginIsInitializedD();
	}
	/*
	If the method can be invoked the method returns true.
	*/
	/// EXPORT_API bool PluginIsPlatformSupported();
	public boolean isPlatformSupported()
	{
		return wrapper.PluginIsPlatformSupported();
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginIsPlatformSupportedD();
	public double isPlatformSupportedD()
	{
		return wrapper.PluginIsPlatformSupportedD();
	}
	/*
	`PluginIsPlayingName` automatically handles initializing the `ChromaSDK`. 
	The named `.chroma` animation file will be automatically opened. The method 
	will return whether the animation is playing or not. Animation is referenced 
	by id.
	*/
	/// EXPORT_API bool PluginIsPlaying(int animationId);
	public boolean isPlaying(int animationId)
	{
		return wrapper.PluginIsPlaying(animationId);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginIsPlayingD(double animationId);
	public double isPlayingD(double animationId)
	{
		return wrapper.PluginIsPlayingD(animationId);
	}
	/*
	`PluginIsPlayingName` automatically handles initializing the `ChromaSDK`. 
	The named `.chroma` animation file will be automatically opened. The method 
	will return whether the animation is playing or not. Animation is referenced 
	by name.
	*/
	/// EXPORT_API bool PluginIsPlayingName(const char* path);
	public boolean isPlayingName(String path)
	{
		return wrapper.PluginIsPlayingName(path);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginIsPlayingNameD(const char* path);
	public double isPlayingNameD(String path)
	{
		return wrapper.PluginIsPlayingNameD(path);
	}
	/*
	`PluginIsPlayingType` automatically handles initializing the `ChromaSDK`. 
	If any animation is playing for the `deviceType` and `device` combination, 
	the method will return true, otherwise false.
	*/
	/// EXPORT_API bool PluginIsPlayingType(int deviceType, int device);
	public boolean isPlayingType(int deviceType, int device)
	{
		return wrapper.PluginIsPlayingType(deviceType, device);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginIsPlayingTypeD(double deviceType, double device);
	public double isPlayingTypeD(double deviceType, double device)
	{
		return wrapper.PluginIsPlayingTypeD(deviceType, device);
	}
	/*
	Do a lerp math operation on a float.
	*/
	/// EXPORT_API float PluginLerp(float start, float end, float amt);
	public float lerp(float start, float end, float amt)
	{
		return wrapper.PluginLerp(start, end, amt);
	}
	/*
	Lerp from one color to another given t in the range 0.0 to 1.0.
	*/
	/// EXPORT_API int PluginLerpColor(int from, int to, float t);
	public int lerpColor(int from, int to, float t)
	{
		return wrapper.PluginLerpColor(from, to, t);
	}
	/*
	Loads `Chroma` effects so that the animation can be played immediately. 
	Returns the animation id upon success. Returns negative one upon failure.
	*/
	/// EXPORT_API int PluginLoadAnimation(int animationId);
	public int loadAnimation(int animationId)
	{
		return wrapper.PluginLoadAnimation(animationId);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginLoadAnimationD(double animationId);
	public double loadAnimationD(double animationId)
	{
		return wrapper.PluginLoadAnimationD(animationId);
	}
	/*
	Load the named animation.
	*/
	/// EXPORT_API void PluginLoadAnimationName(const char* path);
	public void loadAnimationName(String path)
	{
		wrapper.PluginLoadAnimationName(path);
	}
	/*
	Load a composite set of animations.
	*/
	/// EXPORT_API void PluginLoadComposite(const char* name);
	public void loadComposite(String name)
	{
		wrapper.PluginLoadComposite(name);
	}
	/*
	Make a blank animation for the length of the frame count. Frame duration 
	defaults to the duration. The frame color defaults to color. Animation 
	is referenced by id.
	*/
	/// EXPORT_API void PluginMakeBlankFrames(int animationId, int frameCount, float duration, int color);
	public void makeBlankFrames(int animationId, int frameCount, float duration, int color)
	{
		wrapper.PluginMakeBlankFrames(animationId, frameCount, duration, color);
	}
	/*
	Make a blank animation for the length of the frame count. Frame duration 
	defaults to the duration. The frame color defaults to color. Animation 
	is referenced by name.
	*/
	/// EXPORT_API void PluginMakeBlankFramesName(const char* path, int frameCount, float duration, int color);
	public void makeBlankFramesName(String path, int frameCount, float duration, int color)
	{
		wrapper.PluginMakeBlankFramesName(path, frameCount, duration, color);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginMakeBlankFramesNameD(const char* path, double frameCount, double duration, double color);
	public double makeBlankFramesNameD(String path, double frameCount, double duration, double color)
	{
		return wrapper.PluginMakeBlankFramesNameD(path, frameCount, duration, color);
	}
	/*
	Make a blank animation for the length of the frame count. Frame duration 
	defaults to the duration. The frame color is random. Animation is referenced 
	by id.
	*/
	/// EXPORT_API void PluginMakeBlankFramesRandom(int animationId, int frameCount, float duration);
	public void makeBlankFramesRandom(int animationId, int frameCount, float duration)
	{
		wrapper.PluginMakeBlankFramesRandom(animationId, frameCount, duration);
	}
	/*
	Make a blank animation for the length of the frame count. Frame duration 
	defaults to the duration. The frame color is random black and white. Animation 
	is referenced by id.
	*/
	/// EXPORT_API void PluginMakeBlankFramesRandomBlackAndWhite(int animationId, int frameCount, float duration);
	public void makeBlankFramesRandomBlackAndWhite(int animationId, int frameCount, float duration)
	{
		wrapper.PluginMakeBlankFramesRandomBlackAndWhite(animationId, frameCount, duration);
	}
	/*
	Make a blank animation for the length of the frame count. Frame duration 
	defaults to the duration. The frame color is random black and white. Animation 
	is referenced by name.
	*/
	/// EXPORT_API void PluginMakeBlankFramesRandomBlackAndWhiteName(const char* path, int frameCount, float duration);
	public void makeBlankFramesRandomBlackAndWhiteName(String path, int frameCount, float duration)
	{
		wrapper.PluginMakeBlankFramesRandomBlackAndWhiteName(path, frameCount, duration);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginMakeBlankFramesRandomBlackAndWhiteNameD(const char* path, double frameCount, double duration);
	public double makeBlankFramesRandomBlackAndWhiteNameD(String path, double frameCount, double duration)
	{
		return wrapper.PluginMakeBlankFramesRandomBlackAndWhiteNameD(path, frameCount, duration);
	}
	/*
	Make a blank animation for the length of the frame count. Frame duration 
	defaults to the duration. The frame color is random. Animation is referenced 
	by name.
	*/
	/// EXPORT_API void PluginMakeBlankFramesRandomName(const char* path, int frameCount, float duration);
	public void makeBlankFramesRandomName(String path, int frameCount, float duration)
	{
		wrapper.PluginMakeBlankFramesRandomName(path, frameCount, duration);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginMakeBlankFramesRandomNameD(const char* path, double frameCount, double duration);
	public double makeBlankFramesRandomNameD(String path, double frameCount, double duration)
	{
		return wrapper.PluginMakeBlankFramesRandomNameD(path, frameCount, duration);
	}
	/*
	Make a blank animation for the length of the frame count. Frame duration 
	defaults to the duration. The frame color defaults to color. Animation 
	is referenced by id.
	*/
	/// EXPORT_API void PluginMakeBlankFramesRGB(int animationId, int frameCount, float duration, int red, int green, int blue);
	public void makeBlankFramesRGB(int animationId, int frameCount, float duration, int red, int green, int blue)
	{
		wrapper.PluginMakeBlankFramesRGB(animationId, frameCount, duration, red, green, blue);
	}
	/*
	Make a blank animation for the length of the frame count. Frame duration 
	defaults to the duration. The frame color defaults to color. Animation 
	is referenced by name.
	*/
	/// EXPORT_API void PluginMakeBlankFramesRGBName(const char* path, int frameCount, float duration, int red, int green, int blue);
	public void makeBlankFramesRGBName(String path, int frameCount, float duration, int red, int green, int blue)
	{
		wrapper.PluginMakeBlankFramesRGBName(path, frameCount, duration, red, green, blue);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginMakeBlankFramesRGBNameD(const char* path, double frameCount, double duration, double red, double green, double blue);
	public double makeBlankFramesRGBNameD(String path, double frameCount, double duration, double red, double green, double blue)
	{
		return wrapper.PluginMakeBlankFramesRGBNameD(path, frameCount, duration, red, green, blue);
	}
	/*
	Flips the color grid horizontally for all `Chroma` animation frames. Returns 
	the animation id upon success. Returns negative one upon failure.
	*/
	/// EXPORT_API int PluginMirrorHorizontally(int animationId);
	public int mirrorHorizontally(int animationId)
	{
		return wrapper.PluginMirrorHorizontally(animationId);
	}
	/*
	Flips the color grid vertically for all `Chroma` animation frames. This 
	method has no effect for `EChromaSDKDevice1DEnum` devices. Returns the 
	animation id upon success. Returns negative one upon failure.
	*/
	/// EXPORT_API int PluginMirrorVertically(int animationId);
	public int mirrorVertically(int animationId)
	{
		return wrapper.PluginMirrorVertically(animationId);
	}
	/*
	Multiply the color intensity with the lerp result from color 1 to color 
	2 using the frame index divided by the frame count for the `t` parameter. 
	Animation is referenced in id.
	*/
	/// EXPORT_API void PluginMultiplyColorLerpAllFrames(int animationId, int color1, int color2);
	public void multiplyColorLerpAllFrames(int animationId, int color1, int color2)
	{
		wrapper.PluginMultiplyColorLerpAllFrames(animationId, color1, color2);
	}
	/*
	Multiply the color intensity with the lerp result from color 1 to color 
	2 using the frame index divided by the frame count for the `t` parameter. 
	Animation is referenced in name.
	*/
	/// EXPORT_API void PluginMultiplyColorLerpAllFramesName(const char* path, int color1, int color2);
	public void multiplyColorLerpAllFramesName(String path, int color1, int color2)
	{
		wrapper.PluginMultiplyColorLerpAllFramesName(path, color1, color2);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginMultiplyColorLerpAllFramesNameD(const char* path, double color1, double color2);
	public double multiplyColorLerpAllFramesNameD(String path, double color1, double color2)
	{
		return wrapper.PluginMultiplyColorLerpAllFramesNameD(path, color1, color2);
	}
	/*
	Multiply all the colors in the frame by the intensity value. The valid the 
	intensity range is from 0.0 to 255.0. RGB components are multiplied equally. 
	An intensity of 0.5 would half the color value. Black colors in the frame 
	will not be affected by this method.
	*/
	/// EXPORT_API void PluginMultiplyIntensity(int animationId, int frameId, float intensity);
	public void multiplyIntensity(int animationId, int frameId, float intensity)
	{
		wrapper.PluginMultiplyIntensity(animationId, frameId, intensity);
	}
	/*
	Multiply all the colors for all frames by the intensity value. The valid 
	the intensity range is from 0.0 to 255.0. RGB components are multiplied 
	equally. An intensity of 0.5 would half the color value. Black colors in 
	the frame will not be affected by this method.
	*/
	/// EXPORT_API void PluginMultiplyIntensityAllFrames(int animationId, float intensity);
	public void multiplyIntensityAllFrames(int animationId, float intensity)
	{
		wrapper.PluginMultiplyIntensityAllFrames(animationId, intensity);
	}
	/*
	Multiply all the colors for all frames by the intensity value. The valid 
	the intensity range is from 0.0 to 255.0. RGB components are multiplied 
	equally. An intensity of 0.5 would half the color value. Black colors in 
	the frame will not be affected by this method.
	*/
	/// EXPORT_API void PluginMultiplyIntensityAllFramesName(const char* path, float intensity);
	public void multiplyIntensityAllFramesName(String path, float intensity)
	{
		wrapper.PluginMultiplyIntensityAllFramesName(path, intensity);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginMultiplyIntensityAllFramesNameD(const char* path, double intensity);
	public double multiplyIntensityAllFramesNameD(String path, double intensity)
	{
		return wrapper.PluginMultiplyIntensityAllFramesNameD(path, intensity);
	}
	/*
	Multiply all frames by the RBG color intensity. Animation is referenced 
	by id.
	*/
	/// EXPORT_API void PluginMultiplyIntensityAllFramesRGB(int animationId, int red, int green, int blue);
	public void multiplyIntensityAllFramesRGB(int animationId, int red, int green, int blue)
	{
		wrapper.PluginMultiplyIntensityAllFramesRGB(animationId, red, green, blue);
	}
	/*
	Multiply all frames by the RBG color intensity. Animation is referenced 
	by name.
	*/
	/// EXPORT_API void PluginMultiplyIntensityAllFramesRGBName(const char* path, int red, int green, int blue);
	public void multiplyIntensityAllFramesRGBName(String path, int red, int green, int blue)
	{
		wrapper.PluginMultiplyIntensityAllFramesRGBName(path, red, green, blue);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginMultiplyIntensityAllFramesRGBNameD(const char* path, double red, double green, double blue);
	public double multiplyIntensityAllFramesRGBNameD(String path, double red, double green, double blue)
	{
		return wrapper.PluginMultiplyIntensityAllFramesRGBNameD(path, red, green, blue);
	}
	/*
	Multiply the specific frame by the RBG color intensity. Animation is referenced 
	by id.
	*/
	/// EXPORT_API void PluginMultiplyIntensityColor(int animationId, int frameId, int color);
	public void multiplyIntensityColor(int animationId, int frameId, int color)
	{
		wrapper.PluginMultiplyIntensityColor(animationId, frameId, color);
	}
	/*
	Multiply all frames by the RBG color intensity. Animation is referenced 
	by id.
	*/
	/// EXPORT_API void PluginMultiplyIntensityColorAllFrames(int animationId, int color);
	public void multiplyIntensityColorAllFrames(int animationId, int color)
	{
		wrapper.PluginMultiplyIntensityColorAllFrames(animationId, color);
	}
	/*
	Multiply all frames by the RBG color intensity. Animation is referenced 
	by name.
	*/
	/// EXPORT_API void PluginMultiplyIntensityColorAllFramesName(const char* path, int color);
	public void multiplyIntensityColorAllFramesName(String path, int color)
	{
		wrapper.PluginMultiplyIntensityColorAllFramesName(path, color);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginMultiplyIntensityColorAllFramesNameD(const char* path, double color);
	public double multiplyIntensityColorAllFramesNameD(String path, double color)
	{
		return wrapper.PluginMultiplyIntensityColorAllFramesNameD(path, color);
	}
	/*
	Multiply the specific frame by the RBG color intensity. Animation is referenced 
	by name.
	*/
	/// EXPORT_API void PluginMultiplyIntensityColorName(const char* path, int frameId, int color);
	public void multiplyIntensityColorName(String path, int frameId, int color)
	{
		wrapper.PluginMultiplyIntensityColorName(path, frameId, color);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginMultiplyIntensityColorNameD(const char* path, double frameId, double color);
	public double multiplyIntensityColorNameD(String path, double frameId, double color)
	{
		return wrapper.PluginMultiplyIntensityColorNameD(path, frameId, color);
	}
	/*
	Multiply all the colors in the frame by the intensity value. The valid the 
	intensity range is from 0.0 to 255.0. RGB components are multiplied equally. 
	An intensity of 0.5 would half the color value. Black colors in the frame 
	will not be affected by this method.
	*/
	/// EXPORT_API void PluginMultiplyIntensityName(const char* path, int frameId, float intensity);
	public void multiplyIntensityName(String path, int frameId, float intensity)
	{
		wrapper.PluginMultiplyIntensityName(path, frameId, intensity);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginMultiplyIntensityNameD(const char* path, double frameId, double intensity);
	public double multiplyIntensityNameD(String path, double frameId, double intensity)
	{
		return wrapper.PluginMultiplyIntensityNameD(path, frameId, intensity);
	}
	/*
	Multiply the specific frame by the RBG color intensity. Animation is referenced 
	by id.
	*/
	/// EXPORT_API void PluginMultiplyIntensityRGB(int animationId, int frameId, int red, int green, int blue);
	public void multiplyIntensityRGB(int animationId, int frameId, int red, int green, int blue)
	{
		wrapper.PluginMultiplyIntensityRGB(animationId, frameId, red, green, blue);
	}
	/*
	Multiply the specific frame by the RBG color intensity. Animation is referenced 
	by name.
	*/
	/// EXPORT_API void PluginMultiplyIntensityRGBName(const char* path, int frameId, int red, int green, int blue);
	public void multiplyIntensityRGBName(String path, int frameId, int red, int green, int blue)
	{
		wrapper.PluginMultiplyIntensityRGBName(path, frameId, red, green, blue);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginMultiplyIntensityRGBNameD(const char* path, double frameId, double red, double green, double blue);
	public double multiplyIntensityRGBNameD(String path, double frameId, double red, double green, double blue)
	{
		return wrapper.PluginMultiplyIntensityRGBNameD(path, frameId, red, green, blue);
	}
	/*
	Multiply the specific frame by the color lerp result between color 1 and 
	2 using the frame color value as the `t` value. Animation is referenced 
	by id.
	*/
	/// EXPORT_API void PluginMultiplyNonZeroTargetColorLerp(int animationId, int frameId, int color1, int color2);
	public void multiplyNonZeroTargetColorLerp(int animationId, int frameId, int color1, int color2)
	{
		wrapper.PluginMultiplyNonZeroTargetColorLerp(animationId, frameId, color1, color2);
	}
	/*
	Multiply all frames by the color lerp result between color 1 and 2 using 
	the frame color value as the `t` value. Animation is referenced by id.
	*/
	/// EXPORT_API void PluginMultiplyNonZeroTargetColorLerpAllFrames(int animationId, int color1, int color2);
	public void multiplyNonZeroTargetColorLerpAllFrames(int animationId, int color1, int color2)
	{
		wrapper.PluginMultiplyNonZeroTargetColorLerpAllFrames(animationId, color1, color2);
	}
	/*
	Multiply all frames by the color lerp result between color 1 and 2 using 
	the frame color value as the `t` value. Animation is referenced by name.
	*/
	/// EXPORT_API void PluginMultiplyNonZeroTargetColorLerpAllFramesName(const char* path, int color1, int color2);
	public void multiplyNonZeroTargetColorLerpAllFramesName(String path, int color1, int color2)
	{
		wrapper.PluginMultiplyNonZeroTargetColorLerpAllFramesName(path, color1, color2);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginMultiplyNonZeroTargetColorLerpAllFramesNameD(const char* path, double color1, double color2);
	public double multiplyNonZeroTargetColorLerpAllFramesNameD(String path, double color1, double color2)
	{
		return wrapper.PluginMultiplyNonZeroTargetColorLerpAllFramesNameD(path, color1, color2);
	}
	/*
	Multiply the specific frame by the color lerp result between RGB 1 and 2 
	using the frame color value as the `t` value. Animation is referenced by 
	id.
	*/
	/// EXPORT_API void PluginMultiplyNonZeroTargetColorLerpAllFramesRGB(int animationId, int red1, int green1, int blue1, int red2, int green2, int blue2);
	public void multiplyNonZeroTargetColorLerpAllFramesRGB(int animationId, int red1, int green1, int blue1, int red2, int green2, int blue2)
	{
		wrapper.PluginMultiplyNonZeroTargetColorLerpAllFramesRGB(animationId, red1, green1, blue1, red2, green2, blue2);
	}
	/*
	Multiply the specific frame by the color lerp result between RGB 1 and 2 
	using the frame color value as the `t` value. Animation is referenced by 
	name.
	*/
	/// EXPORT_API void PluginMultiplyNonZeroTargetColorLerpAllFramesRGBName(const char* path, int red1, int green1, int blue1, int red2, int green2, int blue2);
	public void multiplyNonZeroTargetColorLerpAllFramesRGBName(String path, int red1, int green1, int blue1, int red2, int green2, int blue2)
	{
		wrapper.PluginMultiplyNonZeroTargetColorLerpAllFramesRGBName(path, red1, green1, blue1, red2, green2, blue2);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginMultiplyNonZeroTargetColorLerpAllFramesRGBNameD(const char* path, double red1, double green1, double blue1, double red2, double green2, double blue2);
	public double multiplyNonZeroTargetColorLerpAllFramesRGBNameD(String path, double red1, double green1, double blue1, double red2, double green2, double blue2)
	{
		return wrapper.PluginMultiplyNonZeroTargetColorLerpAllFramesRGBNameD(path, red1, green1, blue1, red2, green2, blue2);
	}
	/*
	Multiply the specific frame by the color lerp result between color 1 and 
	2 using the frame color value as the `t` value. Animation is referenced 
	by id.
	*/
	/// EXPORT_API void PluginMultiplyTargetColorLerp(int animationId, int frameId, int color1, int color2);
	public void multiplyTargetColorLerp(int animationId, int frameId, int color1, int color2)
	{
		wrapper.PluginMultiplyTargetColorLerp(animationId, frameId, color1, color2);
	}
	/*
	Multiply all frames by the color lerp result between color 1 and 2 using 
	the frame color value as the `t` value. Animation is referenced by id.
	*/
	/// EXPORT_API void PluginMultiplyTargetColorLerpAllFrames(int animationId, int color1, int color2);
	public void multiplyTargetColorLerpAllFrames(int animationId, int color1, int color2)
	{
		wrapper.PluginMultiplyTargetColorLerpAllFrames(animationId, color1, color2);
	}
	/*
	Multiply all frames by the color lerp result between color 1 and 2 using 
	the frame color value as the `t` value. Animation is referenced by name.
	*/
	/// EXPORT_API void PluginMultiplyTargetColorLerpAllFramesName(const char* path, int color1, int color2);
	public void multiplyTargetColorLerpAllFramesName(String path, int color1, int color2)
	{
		wrapper.PluginMultiplyTargetColorLerpAllFramesName(path, color1, color2);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginMultiplyTargetColorLerpAllFramesNameD(const char* path, double color1, double color2);
	public double multiplyTargetColorLerpAllFramesNameD(String path, double color1, double color2)
	{
		return wrapper.PluginMultiplyTargetColorLerpAllFramesNameD(path, color1, color2);
	}
	/*
	Multiply all frames by the color lerp result between RGB 1 and 2 using the 
	frame color value as the `t` value. Animation is referenced by id.
	*/
	/// EXPORT_API void PluginMultiplyTargetColorLerpAllFramesRGB(int animationId, int red1, int green1, int blue1, int red2, int green2, int blue2);
	public void multiplyTargetColorLerpAllFramesRGB(int animationId, int red1, int green1, int blue1, int red2, int green2, int blue2)
	{
		wrapper.PluginMultiplyTargetColorLerpAllFramesRGB(animationId, red1, green1, blue1, red2, green2, blue2);
	}
	/*
	Multiply all frames by the color lerp result between RGB 1 and 2 using the 
	frame color value as the `t` value. Animation is referenced by name.
	*/
	/// EXPORT_API void PluginMultiplyTargetColorLerpAllFramesRGBName(const char* path, int red1, int green1, int blue1, int red2, int green2, int blue2);
	public void multiplyTargetColorLerpAllFramesRGBName(String path, int red1, int green1, int blue1, int red2, int green2, int blue2)
	{
		wrapper.PluginMultiplyTargetColorLerpAllFramesRGBName(path, red1, green1, blue1, red2, green2, blue2);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginMultiplyTargetColorLerpAllFramesRGBNameD(const char* path, double red1, double green1, double blue1, double red2, double green2, double blue2);
	public double multiplyTargetColorLerpAllFramesRGBNameD(String path, double red1, double green1, double blue1, double red2, double green2, double blue2)
	{
		return wrapper.PluginMultiplyTargetColorLerpAllFramesRGBNameD(path, red1, green1, blue1, red2, green2, blue2);
	}
	/*
	Multiply the specific frame by the color lerp result between color 1 and 
	2 using the frame color value as the `t` value. Animation is referenced 
	by name.
	*/
	/// EXPORT_API void PluginMultiplyTargetColorLerpName(const char* path, int frameId, int color1, int color2);
	public void multiplyTargetColorLerpName(String path, int frameId, int color1, int color2)
	{
		wrapper.PluginMultiplyTargetColorLerpName(path, frameId, color1, color2);
	}
	/*
	Offset all colors in the frame using the RGB offset. Use the range of -255 
	to 255 for red, green, and blue parameters. Negative values remove color. 
	Positive values add color.
	*/
	/// EXPORT_API void PluginOffsetColors(int animationId, int frameId, int red, int green, int blue);
	public void offsetColors(int animationId, int frameId, int red, int green, int blue)
	{
		wrapper.PluginOffsetColors(animationId, frameId, red, green, blue);
	}
	/*
	Offset all colors for all frames using the RGB offset. Use the range of 
	-255 to 255 for red, green, and blue parameters. Negative values remove 
	color. Positive values add color.
	*/
	/// EXPORT_API void PluginOffsetColorsAllFrames(int animationId, int red, int green, int blue);
	public void offsetColorsAllFrames(int animationId, int red, int green, int blue)
	{
		wrapper.PluginOffsetColorsAllFrames(animationId, red, green, blue);
	}
	/*
	Offset all colors for all frames using the RGB offset. Use the range of 
	-255 to 255 for red, green, and blue parameters. Negative values remove 
	color. Positive values add color.
	*/
	/// EXPORT_API void PluginOffsetColorsAllFramesName(const char* path, int red, int green, int blue);
	public void offsetColorsAllFramesName(String path, int red, int green, int blue)
	{
		wrapper.PluginOffsetColorsAllFramesName(path, red, green, blue);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginOffsetColorsAllFramesNameD(const char* path, double red, double green, double blue);
	public double offsetColorsAllFramesNameD(String path, double red, double green, double blue)
	{
		return wrapper.PluginOffsetColorsAllFramesNameD(path, red, green, blue);
	}
	/*
	Offset all colors in the frame using the RGB offset. Use the range of -255 
	to 255 for red, green, and blue parameters. Negative values remove color. 
	Positive values add color.
	*/
	/// EXPORT_API void PluginOffsetColorsName(const char* path, int frameId, int red, int green, int blue);
	public void offsetColorsName(String path, int frameId, int red, int green, int blue)
	{
		wrapper.PluginOffsetColorsName(path, frameId, red, green, blue);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginOffsetColorsNameD(const char* path, double frameId, double red, double green, double blue);
	public double offsetColorsNameD(String path, double frameId, double red, double green, double blue)
	{
		return wrapper.PluginOffsetColorsNameD(path, frameId, red, green, blue);
	}
	/*
	This method will only update colors in the animation that are not already 
	set to black. Offset a subset of colors in the frame using the RGB offset. 
	Use the range of -255 to 255 for red, green, and blue parameters. Negative 
	values remove color. Positive values add color.
	*/
	/// EXPORT_API void PluginOffsetNonZeroColors(int animationId, int frameId, int red, int green, int blue);
	public void offsetNonZeroColors(int animationId, int frameId, int red, int green, int blue)
	{
		wrapper.PluginOffsetNonZeroColors(animationId, frameId, red, green, blue);
	}
	/*
	This method will only update colors in the animation that are not already 
	set to black. Offset a subset of colors for all frames using the RGB offset. 
	Use the range of -255 to 255 for red, green, and blue parameters. Negative 
	values remove color. Positive values add color.
	*/
	/// EXPORT_API void PluginOffsetNonZeroColorsAllFrames(int animationId, int red, int green, int blue);
	public void offsetNonZeroColorsAllFrames(int animationId, int red, int green, int blue)
	{
		wrapper.PluginOffsetNonZeroColorsAllFrames(animationId, red, green, blue);
	}
	/*
	This method will only update colors in the animation that are not already 
	set to black. Offset a subset of colors for all frames using the RGB offset. 
	Use the range of -255 to 255 for red, green, and blue parameters. Negative 
	values remove color. Positive values add color.
	*/
	/// EXPORT_API void PluginOffsetNonZeroColorsAllFramesName(const char* path, int red, int green, int blue);
	public void offsetNonZeroColorsAllFramesName(String path, int red, int green, int blue)
	{
		wrapper.PluginOffsetNonZeroColorsAllFramesName(path, red, green, blue);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginOffsetNonZeroColorsAllFramesNameD(const char* path, double red, double green, double blue);
	public double offsetNonZeroColorsAllFramesNameD(String path, double red, double green, double blue)
	{
		return wrapper.PluginOffsetNonZeroColorsAllFramesNameD(path, red, green, blue);
	}
	/*
	This method will only update colors in the animation that are not already 
	set to black. Offset a subset of colors in the frame using the RGB offset. 
	Use the range of -255 to 255 for red, green, and blue parameters. Negative 
	values remove color. Positive values add color.
	*/
	/// EXPORT_API void PluginOffsetNonZeroColorsName(const char* path, int frameId, int red, int green, int blue);
	public void offsetNonZeroColorsName(String path, int frameId, int red, int green, int blue)
	{
		wrapper.PluginOffsetNonZeroColorsName(path, frameId, red, green, blue);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginOffsetNonZeroColorsNameD(const char* path, double frameId, double red, double green, double blue);
	public double offsetNonZeroColorsNameD(String path, double frameId, double red, double green, double blue)
	{
		return wrapper.PluginOffsetNonZeroColorsNameD(path, frameId, red, green, blue);
	}
	/*
	Opens a `Chroma` animation file so that it can be played. Returns an animation 
	id >= 0 upon success. Returns negative one if there was a failure. The 
	animation id is used in most of the API methods.
	*/
	/// EXPORT_API int PluginOpenAnimation(const char* path);
	public int openAnimation(String path)
	{
		return wrapper.PluginOpenAnimation(path);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginOpenAnimationD(const char* path);
	public double openAnimationD(String path)
	{
		return wrapper.PluginOpenAnimationD(path);
	}
	/*
	Opens a `Chroma` animation data from memory so that it can be played. `Data` 
	is a pointer to BYTE array of the loaded animation in memory. `Name` will 
	be assigned to the animation when loaded. Returns an animation id >= 0 
	upon success. Returns negative one if there was a failure. The animation 
	id is used in most of the API methods.
	*/
	/// EXPORT_API int PluginOpenAnimationFromMemory(const BYTE* data, const char* name);
	public int openAnimationFromMemory(byte[] data, String name)
	{
		return wrapper.PluginOpenAnimationFromMemory(data, name);
	}
	/*
	Opens a `Chroma` animation file with the `.chroma` extension. Returns zero 
	upon success. Returns negative one if there was a failure.
	*/
	/// EXPORT_API int PluginOpenEditorDialog(const char* path);
	public int openEditorDialog(String path)
	{
		return wrapper.PluginOpenEditorDialog(path);
	}
	/*
	Open the named animation in the editor dialog and play the animation at 
	start.
	*/
	/// EXPORT_API int PluginOpenEditorDialogAndPlay(const char* path);
	public int openEditorDialogAndPlay(String path)
	{
		return wrapper.PluginOpenEditorDialogAndPlay(path);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginOpenEditorDialogAndPlayD(const char* path);
	public double openEditorDialogAndPlayD(String path)
	{
		return wrapper.PluginOpenEditorDialogAndPlayD(path);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginOpenEditorDialogD(const char* path);
	public double openEditorDialogD(String path)
	{
		return wrapper.PluginOpenEditorDialogD(path);
	}
	/*
	Sets the `duration` for all grames in the `Chroma` animation to the `duration` 
	parameter. Returns the animation id upon success. Returns negative one 
	upon failure.
	*/
	/// EXPORT_API int PluginOverrideFrameDuration(int animationId, float duration);
	public int overrideFrameDuration(int animationId, float duration)
	{
		return wrapper.PluginOverrideFrameDuration(animationId, duration);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginOverrideFrameDurationD(double animationId, double duration);
	public double overrideFrameDurationD(double animationId, double duration)
	{
		return wrapper.PluginOverrideFrameDurationD(animationId, duration);
	}
	/*
	Override the duration of all frames with the `duration` value. Animation 
	is referenced by name.
	*/
	/// EXPORT_API void PluginOverrideFrameDurationName(const char* path, float duration);
	public void overrideFrameDurationName(String path, float duration)
	{
		wrapper.PluginOverrideFrameDurationName(path, duration);
	}
	/*
	Pause the current animation referenced by id.
	*/
	/// EXPORT_API void PluginPauseAnimation(int animationId);
	public void pauseAnimation(int animationId)
	{
		wrapper.PluginPauseAnimation(animationId);
	}
	/*
	Pause the current animation referenced by name.
	*/
	/// EXPORT_API void PluginPauseAnimationName(const char* path);
	public void pauseAnimationName(String path)
	{
		wrapper.PluginPauseAnimationName(path);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginPauseAnimationNameD(const char* path);
	public double pauseAnimationNameD(String path)
	{
		return wrapper.PluginPauseAnimationNameD(path);
	}
	/*
	Plays the `Chroma` animation. This will load the animation, if not loaded 
	previously. Returns the animation id upon success. Returns negative one 
	upon failure.
	*/
	/// EXPORT_API int PluginPlayAnimation(int animationId);
	public int playAnimation(int animationId)
	{
		return wrapper.PluginPlayAnimation(animationId);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginPlayAnimationD(double animationId);
	public double playAnimationD(double animationId)
	{
		return wrapper.PluginPlayAnimationD(animationId);
	}
	/*
	`PluginPlayAnimationFrame` automatically handles initializing the `ChromaSDK`. 
	The method will play the animation given the `animationId` with looping 
	`on` or `off` starting at the `frameId`.
	*/
	/// EXPORT_API void PluginPlayAnimationFrame(int animationId, int frameId, bool loop);
	public void playAnimationFrame(int animationId, int frameId, boolean loop)
	{
		wrapper.PluginPlayAnimationFrame(animationId, frameId, loop);
	}
	/*
	`PluginPlayAnimationFrameName` automatically handles initializing the `ChromaSDK`. 
	The named `.chroma` animation file will be automatically opened. The animation 
	will play with looping `on` or `off` starting at the `frameId`.
	*/
	/// EXPORT_API void PluginPlayAnimationFrameName(const char* path, int frameId, bool loop);
	public void playAnimationFrameName(String path, int frameId, boolean loop)
	{
		wrapper.PluginPlayAnimationFrameName(path, frameId, loop);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginPlayAnimationFrameNameD(const char* path, double frameId, double loop);
	public double playAnimationFrameNameD(String path, double frameId, double loop)
	{
		return wrapper.PluginPlayAnimationFrameNameD(path, frameId, loop);
	}
	/*
	`PluginPlayAnimationLoop` automatically handles initializing the `ChromaSDK`. 
	The method will play the animation given the `animationId` with looping 
	`on` or `off`.
	*/
	/// EXPORT_API void PluginPlayAnimationLoop(int animationId, bool loop);
	public void playAnimationLoop(int animationId, boolean loop)
	{
		wrapper.PluginPlayAnimationLoop(animationId, loop);
	}
	/*
	`PluginPlayAnimationName` automatically handles initializing the `ChromaSDK`. 
	The named `.chroma` animation file will be automatically opened. The animation 
	will play with looping `on` or `off`.
	*/
	/// EXPORT_API void PluginPlayAnimationName(const char* path, bool loop);
	public void playAnimationName(String path, boolean loop)
	{
		wrapper.PluginPlayAnimationName(path, loop);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginPlayAnimationNameD(const char* path, double loop);
	public double playAnimationNameD(String path, double loop)
	{
		return wrapper.PluginPlayAnimationNameD(path, loop);
	}
	/*
	`PluginPlayComposite` automatically handles initializing the `ChromaSDK`. 
	The named animation files for the `.chroma` set will be automatically opened. 
	The set of animations will play with looping `on` or `off`.
	*/
	/// EXPORT_API void PluginPlayComposite(const char* name, bool loop);
	public void playComposite(String name, boolean loop)
	{
		wrapper.PluginPlayComposite(name, loop);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginPlayCompositeD(const char* name, double loop);
	public double playCompositeD(String name, double loop)
	{
		return wrapper.PluginPlayCompositeD(name, loop);
	}
	/*
	Displays the `Chroma` animation frame on `Chroma` hardware given the `frameId`. 
	Returns the animation id upon success. Returns negative one upon failure.
	*/
	/// EXPORT_API int PluginPreviewFrame(int animationId, int frameId);
	public int previewFrame(int animationId, int frameId)
	{
		return wrapper.PluginPreviewFrame(animationId, frameId);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginPreviewFrameD(double animationId, double frameId);
	public double previewFrameD(double animationId, double frameId)
	{
		return wrapper.PluginPreviewFrameD(animationId, frameId);
	}
	/*
	Displays the `Chroma` animation frame on `Chroma` hardware given the `frameId`. 
	Animaton is referenced by name.
	*/
	/// EXPORT_API void PluginPreviewFrameName(const char* path, int frameId);
	public void previewFrameName(String path, int frameId)
	{
		wrapper.PluginPreviewFrameName(path, frameId);
	}
	/*
	Reduce the frames of the animation by removing every nth element. Animation 
	is referenced by id.
	*/
	/// EXPORT_API void PluginReduceFrames(int animationId, int n);
	public void reduceFrames(int animationId, int n)
	{
		wrapper.PluginReduceFrames(animationId, n);
	}
	/*
	Reduce the frames of the animation by removing every nth element. Animation 
	is referenced by name.
	*/
	/// EXPORT_API void PluginReduceFramesName(const char* path, int n);
	public void reduceFramesName(String path, int n)
	{
		wrapper.PluginReduceFramesName(path, n);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginReduceFramesNameD(const char* path, double n);
	public double reduceFramesNameD(String path, double n)
	{
		return wrapper.PluginReduceFramesNameD(path, n);
	}
	/*
	Resets the `Chroma` animation to 1 blank frame. Returns the animation id 
	upon success. Returns negative one upon failure.
	*/
	/// EXPORT_API int PluginResetAnimation(int animationId);
	public int resetAnimation(int animationId)
	{
		return wrapper.PluginResetAnimation(animationId);
	}
	/*
	Resume the animation with loop `ON` or `OFF` referenced by id.
	*/
	/// EXPORT_API void PluginResumeAnimation(int animationId, bool loop);
	public void resumeAnimation(int animationId, boolean loop)
	{
		wrapper.PluginResumeAnimation(animationId, loop);
	}
	/*
	Resume the animation with loop `ON` or `OFF` referenced by name.
	*/
	/// EXPORT_API void PluginResumeAnimationName(const char* path, bool loop);
	public void resumeAnimationName(String path, boolean loop)
	{
		wrapper.PluginResumeAnimationName(path, loop);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginResumeAnimationNameD(const char* path, double loop);
	public double resumeAnimationNameD(String path, double loop)
	{
		return wrapper.PluginResumeAnimationNameD(path, loop);
	}
	/*
	Reverse the animation frame order of the `Chroma` animation. Returns the 
	animation id upon success. Returns negative one upon failure. Animation 
	is referenced by id.
	*/
	/// EXPORT_API int PluginReverse(int animationId);
	public int reverse(int animationId)
	{
		return wrapper.PluginReverse(animationId);
	}
	/*
	Reverse the animation frame order of the `Chroma` animation. Animation is 
	referenced by id.
	*/
	/// EXPORT_API void PluginReverseAllFrames(int animationId);
	public void reverseAllFrames(int animationId)
	{
		wrapper.PluginReverseAllFrames(animationId);
	}
	/*
	Reverse the animation frame order of the `Chroma` animation. Animation is 
	referenced by name.
	*/
	/// EXPORT_API void PluginReverseAllFramesName(const char* path);
	public void reverseAllFramesName(String path)
	{
		wrapper.PluginReverseAllFramesName(path);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginReverseAllFramesNameD(const char* path);
	public double reverseAllFramesNameD(String path)
	{
		return wrapper.PluginReverseAllFramesNameD(path);
	}
	/*
	Save the animation referenced by id to the path specified.
	*/
	/// EXPORT_API int PluginSaveAnimation(int animationId, const char* path);
	public int saveAnimation(int animationId, String path)
	{
		return wrapper.PluginSaveAnimation(animationId, path);
	}
	/*
	Save the named animation to the target path specified.
	*/
	/// EXPORT_API int PluginSaveAnimationName(const char* sourceAnimation, const char* targetAnimation);
	public int saveAnimationName(String sourceAnimation, String targetAnimation)
	{
		return wrapper.PluginSaveAnimationName(sourceAnimation, targetAnimation);
	}
	/*
	Set the animation color for a frame given the `1D` `led`. The `led` should 
	be greater than or equal to 0 and less than the `MaxLeds`. The animation 
	is referenced by id.
	*/
	/// EXPORT_API void PluginSet1DColor(int animationId, int frameId, int led, int color);
	public void set1DColor(int animationId, int frameId, int led, int color)
	{
		wrapper.PluginSet1DColor(animationId, frameId, led, color);
	}
	/*
	Set the animation color for a frame given the `1D` `led`. The `led` should 
	be greater than or equal to 0 and less than the `MaxLeds`. The animation 
	is referenced by name.
	*/
	/// EXPORT_API void PluginSet1DColorName(const char* path, int frameId, int led, int color);
	public void set1DColorName(String path, int frameId, int led, int color)
	{
		wrapper.PluginSet1DColorName(path, frameId, led, color);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginSet1DColorNameD(const char* path, double frameId, double led, double color);
	public double set1DColorNameD(String path, double frameId, double led, double color)
	{
		return wrapper.PluginSet1DColorNameD(path, frameId, led, color);
	}
	/*
	Set the animation color for a frame given the `2D` `row` and `column`. The 
	`row` should be greater than or equal to 0 and less than the `MaxRow`. 
	The `column` should be greater than or equal to 0 and less than the `MaxColumn`. 
	The animation is referenced by id.
	*/
	/// EXPORT_API void PluginSet2DColor(int animationId, int frameId, int row, int column, int color);
	public void set2DColor(int animationId, int frameId, int row, int column, int color)
	{
		wrapper.PluginSet2DColor(animationId, frameId, row, column, color);
	}
	/*
	Set the animation color for a frame given the `2D` `row` and `column`. The 
	`row` should be greater than or equal to 0 and less than the `MaxRow`. 
	The `column` should be greater than or equal to 0 and less than the `MaxColumn`. 
	The animation is referenced by name.
	*/
	/// EXPORT_API void PluginSet2DColorName(const char* path, int frameId, int row, int column, int color);
	public void set2DColorName(String path, int frameId, int row, int column, int color)
	{
		wrapper.PluginSet2DColorName(path, frameId, row, column, color);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginSet2DColorNameD(const char* path, double frameId, double rowColumnIndex, double color);
	public double set2DColorNameD(String path, double frameId, double rowColumnIndex, double color)
	{
		return wrapper.PluginSet2DColorNameD(path, frameId, rowColumnIndex, color);
	}
	/*
	When custom color is set, the custom key mode will be used. The animation 
	is referenced by id.
	*/
	/// EXPORT_API void PluginSetChromaCustomColorAllFrames(int animationId);
	public void setChromaCustomColorAllFrames(int animationId)
	{
		wrapper.PluginSetChromaCustomColorAllFrames(animationId);
	}
	/*
	When custom color is set, the custom key mode will be used. The animation 
	is referenced by name.
	*/
	/// EXPORT_API void PluginSetChromaCustomColorAllFramesName(const char* path);
	public void setChromaCustomColorAllFramesName(String path)
	{
		wrapper.PluginSetChromaCustomColorAllFramesName(path);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginSetChromaCustomColorAllFramesNameD(const char* path);
	public double setChromaCustomColorAllFramesNameD(String path)
	{
		return wrapper.PluginSetChromaCustomColorAllFramesNameD(path);
	}
	/*
	Set the Chroma custom key color flag on all frames. `True` changes the layout 
	from grid to key. `True` changes the layout from key to grid. Animation 
	is referenced by id.
	*/
	/// EXPORT_API void PluginSetChromaCustomFlag(int animationId, bool flag);
	public void setChromaCustomFlag(int animationId, boolean flag)
	{
		wrapper.PluginSetChromaCustomFlag(animationId, flag);
	}
	/*
	Set the Chroma custom key color flag on all frames. `True` changes the layout 
	from grid to key. `True` changes the layout from key to grid. Animation 
	is referenced by name.
	*/
	/// EXPORT_API void PluginSetChromaCustomFlagName(const char* path, bool flag);
	public void setChromaCustomFlagName(String path, boolean flag)
	{
		wrapper.PluginSetChromaCustomFlagName(path, flag);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginSetChromaCustomFlagNameD(const char* path, double flag);
	public double setChromaCustomFlagNameD(String path, double flag)
	{
		return wrapper.PluginSetChromaCustomFlagNameD(path, flag);
	}
	/*
	Set the current frame of the animation referenced by id.
	*/
	/// EXPORT_API void PluginSetCurrentFrame(int animationId, int frameId);
	public void setCurrentFrame(int animationId, int frameId)
	{
		wrapper.PluginSetCurrentFrame(animationId, frameId);
	}
	/*
	Set the current frame of the animation referenced by name.
	*/
	/// EXPORT_API void PluginSetCurrentFrameName(const char* path, int frameId);
	public void setCurrentFrameName(String path, int frameId)
	{
		wrapper.PluginSetCurrentFrameName(path, frameId);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginSetCurrentFrameNameD(const char* path, double frameId);
	public double setCurrentFrameNameD(String path, double frameId)
	{
		return wrapper.PluginSetCurrentFrameNameD(path, frameId);
	}
	/*
	Set the custom alpha flag on the color array
	*/
	/// EXPORT_API RZRESULT PluginSetCustomColorFlag2D(int device, int* colors);
	public int setCustomColorFlag2D(int device, Pointer colors)
	{
		return wrapper.PluginSetCustomColorFlag2D(device, colors);
	}
	/*
	Changes the `deviceType` and `device` of a `Chroma` animation. If the device 
	is changed, the `Chroma` animation will be reset with 1 blank frame. Returns 
	the animation id upon success. Returns negative one upon failure.
	*/
	/// EXPORT_API int PluginSetDevice(int animationId, int deviceType, int device);
	public int setDevice(int animationId, int deviceType, int device)
	{
		return wrapper.PluginSetDevice(animationId, deviceType, device);
	}
	/*
	SetEffect will display the referenced effect id.
	*/
	/// EXPORT_API RZRESULT PluginSetEffect(const ChromaSDK::FChromaSDKGuid& effectId);
	public int setEffect(GUIDStruct effectId)
	{
		return wrapper.PluginSetEffect(effectId);
	}
	/*
	SetEffectCustom1D will display the referenced colors immediately
	*/
	/// EXPORT_API RZRESULT PluginSetEffectCustom1D(const int device, const int* colors);
	public int setEffectCustom1D(final int device, Pointer colors)
	{
		return wrapper.PluginSetEffectCustom1D(device, colors);
	}
	/*
	SetEffectCustom2D will display the referenced colors immediately.
	*/
	/// EXPORT_API RZRESULT PluginSetEffectCustom2D(const int device, const int* colors);
	public int setEffectCustom2D(final int device, Pointer colors)
	{
		return wrapper.PluginSetEffectCustom2D(device, colors);
	}
	/*
	SetEffectKeyboardCustom2D will display the referenced custom keyboard colors 
	immediately. Colors represent a visual grid layout. Keys represent the 
	hotkeys for any layout.
	*/
	/// EXPORT_API RZRESULT PluginSetEffectKeyboardCustom2D(const int device, const int* colors, const int* keys);
	public int setEffectKeyboardCustom2D(final int device, Pointer colors, Pointer keys)
	{
		return wrapper.PluginSetEffectKeyboardCustom2D(device, colors, keys);
	}
	/*
	When the idle animation is used, the named animation will play when no other 
	animations are playing. Reference the animation by id.
	*/
	/// EXPORT_API void PluginSetIdleAnimation(int animationId);
	public void setIdleAnimation(int animationId)
	{
		wrapper.PluginSetIdleAnimation(animationId);
	}
	/*
	When the idle animation is used, the named animation will play when no other 
	animations are playing. Reference the animation by name.
	*/
	/// EXPORT_API void PluginSetIdleAnimationName(const char* path);
	public void setIdleAnimationName(String path)
	{
		wrapper.PluginSetIdleAnimationName(path);
	}
	/*
	Set animation key to a static color for the given frame.
	*/
	/// EXPORT_API void PluginSetKeyColor(int animationId, int frameId, int rzkey, int color);
	public void setKeyColor(int animationId, int frameId, int rzkey, int color)
	{
		wrapper.PluginSetKeyColor(animationId, frameId, rzkey, color);
	}
	/*
	Set the key to the specified key color for all frames. Animation is referenced 
	by id.
	*/
	/// EXPORT_API void PluginSetKeyColorAllFrames(int animationId, int rzkey, int color);
	public void setKeyColorAllFrames(int animationId, int rzkey, int color)
	{
		wrapper.PluginSetKeyColorAllFrames(animationId, rzkey, color);
	}
	/*
	Set the key to the specified key color for all frames. Animation is referenced 
	by name.
	*/
	/// EXPORT_API void PluginSetKeyColorAllFramesName(const char* path, int rzkey, int color);
	public void setKeyColorAllFramesName(String path, int rzkey, int color)
	{
		wrapper.PluginSetKeyColorAllFramesName(path, rzkey, color);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginSetKeyColorAllFramesNameD(const char* path, double rzkey, double color);
	public double setKeyColorAllFramesNameD(String path, double rzkey, double color)
	{
		return wrapper.PluginSetKeyColorAllFramesNameD(path, rzkey, color);
	}
	/*
	Set the key to the specified key color for all frames. Animation is referenced 
	by id.
	*/
	/// EXPORT_API void PluginSetKeyColorAllFramesRGB(int animationId, int rzkey, int red, int green, int blue);
	public void setKeyColorAllFramesRGB(int animationId, int rzkey, int red, int green, int blue)
	{
		wrapper.PluginSetKeyColorAllFramesRGB(animationId, rzkey, red, green, blue);
	}
	/*
	Set the key to the specified key color for all frames. Animation is referenced 
	by name.
	*/
	/// EXPORT_API void PluginSetKeyColorAllFramesRGBName(const char* path, int rzkey, int red, int green, int blue);
	public void setKeyColorAllFramesRGBName(String path, int rzkey, int red, int green, int blue)
	{
		wrapper.PluginSetKeyColorAllFramesRGBName(path, rzkey, red, green, blue);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginSetKeyColorAllFramesRGBNameD(const char* path, double rzkey, double red, double green, double blue);
	public double setKeyColorAllFramesRGBNameD(String path, double rzkey, double red, double green, double blue)
	{
		return wrapper.PluginSetKeyColorAllFramesRGBNameD(path, rzkey, red, green, blue);
	}
	/*
	Set animation key to a static color for the given frame.
	*/
	/// EXPORT_API void PluginSetKeyColorName(const char* path, int frameId, int rzkey, int color);
	public void setKeyColorName(String path, int frameId, int rzkey, int color)
	{
		wrapper.PluginSetKeyColorName(path, frameId, rzkey, color);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginSetKeyColorNameD(const char* path, double frameId, double rzkey, double color);
	public double setKeyColorNameD(String path, double frameId, double rzkey, double color)
	{
		return wrapper.PluginSetKeyColorNameD(path, frameId, rzkey, color);
	}
	/*
	Set the key to the specified key color for the specified frame. Animation 
	is referenced by id.
	*/
	/// EXPORT_API void PluginSetKeyColorRGB(int animationId, int frameId, int rzkey, int red, int green, int blue);
	public void setKeyColorRGB(int animationId, int frameId, int rzkey, int red, int green, int blue)
	{
		wrapper.PluginSetKeyColorRGB(animationId, frameId, rzkey, red, green, blue);
	}
	/*
	Set the key to the specified key color for the specified frame. Animation 
	is referenced by name.
	*/
	/// EXPORT_API void PluginSetKeyColorRGBName(const char* path, int frameId, int rzkey, int red, int green, int blue);
	public void setKeyColorRGBName(String path, int frameId, int rzkey, int red, int green, int blue)
	{
		wrapper.PluginSetKeyColorRGBName(path, frameId, rzkey, red, green, blue);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginSetKeyColorRGBNameD(const char* path, double frameId, double rzkey, double red, double green, double blue);
	public double setKeyColorRGBNameD(String path, double frameId, double rzkey, double red, double green, double blue)
	{
		return wrapper.PluginSetKeyColorRGBNameD(path, frameId, rzkey, red, green, blue);
	}
	/*
	Set animation key to a static color for the given frame if the existing 
	color is not already black.
	*/
	/// EXPORT_API void PluginSetKeyNonZeroColor(int animationId, int frameId, int rzkey, int color);
	public void setKeyNonZeroColor(int animationId, int frameId, int rzkey, int color)
	{
		wrapper.PluginSetKeyNonZeroColor(animationId, frameId, rzkey, color);
	}
	/*
	Set animation key to a static color for the given frame if the existing 
	color is not already black.
	*/
	/// EXPORT_API void PluginSetKeyNonZeroColorName(const char* path, int frameId, int rzkey, int color);
	public void setKeyNonZeroColorName(String path, int frameId, int rzkey, int color)
	{
		wrapper.PluginSetKeyNonZeroColorName(path, frameId, rzkey, color);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginSetKeyNonZeroColorNameD(const char* path, double frameId, double rzkey, double color);
	public double setKeyNonZeroColorNameD(String path, double frameId, double rzkey, double color)
	{
		return wrapper.PluginSetKeyNonZeroColorNameD(path, frameId, rzkey, color);
	}
	/*
	Set the key to the specified key color for the specified frame where color 
	is not black. Animation is referenced by id.
	*/
	/// EXPORT_API void PluginSetKeyNonZeroColorRGB(int animationId, int frameId, int rzkey, int red, int green, int blue);
	public void setKeyNonZeroColorRGB(int animationId, int frameId, int rzkey, int red, int green, int blue)
	{
		wrapper.PluginSetKeyNonZeroColorRGB(animationId, frameId, rzkey, red, green, blue);
	}
	/*
	Set the key to the specified key color for the specified frame where color 
	is not black. Animation is referenced by name.
	*/
	/// EXPORT_API void PluginSetKeyNonZeroColorRGBName(const char* path, int frameId, int rzkey, int red, int green, int blue);
	public void setKeyNonZeroColorRGBName(String path, int frameId, int rzkey, int red, int green, int blue)
	{
		wrapper.PluginSetKeyNonZeroColorRGBName(path, frameId, rzkey, red, green, blue);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginSetKeyNonZeroColorRGBNameD(const char* path, double frameId, double rzkey, double red, double green, double blue);
	public double setKeyNonZeroColorRGBNameD(String path, double frameId, double rzkey, double red, double green, double blue)
	{
		return wrapper.PluginSetKeyNonZeroColorRGBNameD(path, frameId, rzkey, red, green, blue);
	}
	/*
	Set animation key by row and column to a static color for the given frame.
	*/
	/// EXPORT_API void PluginSetKeyRowColumnColorName(const char* path, int frameId, int row, int column, int color);
	public void setKeyRowColumnColorName(String path, int frameId, int row, int column, int color)
	{
		wrapper.PluginSetKeyRowColumnColorName(path, frameId, row, column, color);
	}
	/*
	Set an array of animation keys to a static color for the given frame. Animation 
	is referenced by id.
	*/
	/// EXPORT_API void PluginSetKeysColor(int animationId, int frameId, const int* rzkeys, int keyCount, int color);
	public void setKeysColor(int animationId, int frameId, Pointer rzkeys, int keyCount, int color)
	{
		wrapper.PluginSetKeysColor(animationId, frameId, rzkeys, keyCount, color);
	}
	/*
	Set an array of animation keys to a static color for all frames. Animation 
	is referenced by id.
	*/
	/// EXPORT_API void PluginSetKeysColorAllFrames(int animationId, const int* rzkeys, int keyCount, int color);
	public void setKeysColorAllFrames(int animationId, Pointer rzkeys, int keyCount, int color)
	{
		wrapper.PluginSetKeysColorAllFrames(animationId, rzkeys, keyCount, color);
	}
	/*
	Set an array of animation keys to a static color for all frames. Animation 
	is referenced by name.
	*/
	/// EXPORT_API void PluginSetKeysColorAllFramesName(const char* path, const int* rzkeys, int keyCount, int color);
	public void setKeysColorAllFramesName(String path, int[] rzkeys, int keyCount, int color)
	{
		wrapper.PluginSetKeysColorAllFramesName(path, rzkeys, keyCount, color);
	}
	/*
	Set an array of animation keys to a static color for all frames. Animation 
	is referenced by id.
	*/
	/// EXPORT_API void PluginSetKeysColorAllFramesRGB(int animationId, const int* rzkeys, int keyCount, int red, int green, int blue);
	public void setKeysColorAllFramesRGB(int animationId, Pointer rzkeys, int keyCount, int red, int green, int blue)
	{
		wrapper.PluginSetKeysColorAllFramesRGB(animationId, rzkeys, keyCount, red, green, blue);
	}
	/*
	Set an array of animation keys to a static color for all frames. Animation 
	is referenced by name.
	*/
	/// EXPORT_API void PluginSetKeysColorAllFramesRGBName(const char* path, const int* rzkeys, int keyCount, int red, int green, int blue);
	public void setKeysColorAllFramesRGBName(String path, int[] rzkeys, int keyCount, int red, int green, int blue)
	{
		wrapper.PluginSetKeysColorAllFramesRGBName(path, rzkeys, keyCount, red, green, blue);
	}
	/*
	Set an array of animation keys to a static color for the given frame.
	*/
	/// EXPORT_API void PluginSetKeysColorName(const char* path, int frameId, const int* rzkeys, int keyCount, int color);
	public void setKeysColorName(String path, int frameId, Pointer rzkeys, int keyCount, int color)
	{
		wrapper.PluginSetKeysColorName(path, frameId, rzkeys, keyCount, color);
	}
	/*
	Set an array of animation keys to a static color for the given frame. Animation 
	is referenced by id.
	*/
	/// EXPORT_API void PluginSetKeysColorRGB(int animationId, int frameId, const int* rzkeys, int keyCount, int red, int green, int blue);
	public void setKeysColorRGB(int animationId, int frameId, Pointer rzkeys, int keyCount, int red, int green, int blue)
	{
		wrapper.PluginSetKeysColorRGB(animationId, frameId, rzkeys, keyCount, red, green, blue);
	}
	/*
	Set an array of animation keys to a static color for the given frame. Animation 
	is referenced by name.
	*/
	/// EXPORT_API void PluginSetKeysColorRGBName(const char* path, int frameId, const int* rzkeys, int keyCount, int red, int green, int blue);
	public void setKeysColorRGBName(String path, int frameId, Pointer rzkeys, int keyCount, int red, int green, int blue)
	{
		wrapper.PluginSetKeysColorRGBName(path, frameId, rzkeys, keyCount, red, green, blue);
	}
	/*
	Set an array of animation keys to a static color for the given frame if 
	the existing color is not already black.
	*/
	/// EXPORT_API void PluginSetKeysNonZeroColor(int animationId, int frameId, const int* rzkeys, int keyCount, int color);
	public void setKeysNonZeroColor(int animationId, int frameId, Pointer rzkeys, int keyCount, int color)
	{
		wrapper.PluginSetKeysNonZeroColor(animationId, frameId, rzkeys, keyCount, color);
	}
	/*
	Set an array of animation keys to a static color for the given frame where 
	the color is not black. Animation is referenced by id.
	*/
	/// EXPORT_API void PluginSetKeysNonZeroColorAllFrames(int animationId, const int* rzkeys, int keyCount, int color);
	public void setKeysNonZeroColorAllFrames(int animationId, Pointer rzkeys, int keyCount, int color)
	{
		wrapper.PluginSetKeysNonZeroColorAllFrames(animationId, rzkeys, keyCount, color);
	}
	/*
	Set an array of animation keys to a static color for all frames if the existing 
	color is not already black. Reference animation by name.
	*/
	/// EXPORT_API void PluginSetKeysNonZeroColorAllFramesName(const char* path, const int* rzkeys, int keyCount, int color);
	public void setKeysNonZeroColorAllFramesName(String path, Pointer rzkeys, int keyCount, int color)
	{
		wrapper.PluginSetKeysNonZeroColorAllFramesName(path, rzkeys, keyCount, color);
	}
	/*
	Set an array of animation keys to a static color for the given frame if 
	the existing color is not already black. Reference animation by name.
	*/
	/// EXPORT_API void PluginSetKeysNonZeroColorName(const char* path, int frameId, const int* rzkeys, int keyCount, int color);
	public void setKeysNonZeroColorName(String path, int frameId, Pointer rzkeys, int keyCount, int color)
	{
		wrapper.PluginSetKeysNonZeroColorName(path, frameId, rzkeys, keyCount, color);
	}
	/*
	Set an array of animation keys to a static color for the given frame where 
	the color is not black. Animation is referenced by id.
	*/
	/// EXPORT_API void PluginSetKeysNonZeroColorRGB(int animationId, int frameId, const int* rzkeys, int keyCount, int red, int green, int blue);
	public void setKeysNonZeroColorRGB(int animationId, int frameId, Pointer rzkeys, int keyCount, int red, int green, int blue)
	{
		wrapper.PluginSetKeysNonZeroColorRGB(animationId, frameId, rzkeys, keyCount, red, green, blue);
	}
	/*
	Set an array of animation keys to a static color for the given frame where 
	the color is not black. Animation is referenced by name.
	*/
	/// EXPORT_API void PluginSetKeysNonZeroColorRGBName(const char* path, int frameId, const int* rzkeys, int keyCount, int red, int green, int blue);
	public void setKeysNonZeroColorRGBName(String path, int frameId, Pointer rzkeys, int keyCount, int red, int green, int blue)
	{
		wrapper.PluginSetKeysNonZeroColorRGBName(path, frameId, rzkeys, keyCount, red, green, blue);
	}
	/*
	Set an array of animation keys to a static color for the given frame where 
	the color is black. Animation is referenced by id.
	*/
	/// EXPORT_API void PluginSetKeysZeroColor(int animationId, int frameId, const int* rzkeys, int keyCount, int color);
	public void setKeysZeroColor(int animationId, int frameId, Pointer rzkeys, int keyCount, int color)
	{
		wrapper.PluginSetKeysZeroColor(animationId, frameId, rzkeys, keyCount, color);
	}
	/*
	Set an array of animation keys to a static color for all frames where the 
	color is black. Animation is referenced by id.
	*/
	/// EXPORT_API void PluginSetKeysZeroColorAllFrames(int animationId, const int* rzkeys, int keyCount, int color);
	public void setKeysZeroColorAllFrames(int animationId, Pointer rzkeys, int keyCount, int color)
	{
		wrapper.PluginSetKeysZeroColorAllFrames(animationId, rzkeys, keyCount, color);
	}
	/*
	Set an array of animation keys to a static color for all frames where the 
	color is black. Animation is referenced by name.
	*/
	/// EXPORT_API void PluginSetKeysZeroColorAllFramesName(const char* path, const int* rzkeys, int keyCount, int color);
	public void setKeysZeroColorAllFramesName(String path, Pointer rzkeys, int keyCount, int color)
	{
		wrapper.PluginSetKeysZeroColorAllFramesName(path, rzkeys, keyCount, color);
	}
	/*
	Set an array of animation keys to a static color for all frames where the 
	color is black. Animation is referenced by id.
	*/
	/// EXPORT_API void PluginSetKeysZeroColorAllFramesRGB(int animationId, const int* rzkeys, int keyCount, int red, int green, int blue);
	public void setKeysZeroColorAllFramesRGB(int animationId, Pointer rzkeys, int keyCount, int red, int green, int blue)
	{
		wrapper.PluginSetKeysZeroColorAllFramesRGB(animationId, rzkeys, keyCount, red, green, blue);
	}
	/*
	Set an array of animation keys to a static color for all frames where the 
	color is black. Animation is referenced by name.
	*/
	/// EXPORT_API void PluginSetKeysZeroColorAllFramesRGBName(const char* path, const int* rzkeys, int keyCount, int red, int green, int blue);
	public void setKeysZeroColorAllFramesRGBName(String path, Pointer rzkeys, int keyCount, int red, int green, int blue)
	{
		wrapper.PluginSetKeysZeroColorAllFramesRGBName(path, rzkeys, keyCount, red, green, blue);
	}
	/*
	Set an array of animation keys to a static color for the given frame where 
	the color is black. Animation is referenced by name.
	*/
	/// EXPORT_API void PluginSetKeysZeroColorName(const char* path, int frameId, const int* rzkeys, int keyCount, int color);
	public void setKeysZeroColorName(String path, int frameId, Pointer rzkeys, int keyCount, int color)
	{
		wrapper.PluginSetKeysZeroColorName(path, frameId, rzkeys, keyCount, color);
	}
	/*
	Set an array of animation keys to a static color for the given frame where 
	the color is black. Animation is referenced by id.
	*/
	/// EXPORT_API void PluginSetKeysZeroColorRGB(int animationId, int frameId, const int* rzkeys, int keyCount, int red, int green, int blue);
	public void setKeysZeroColorRGB(int animationId, int frameId, Pointer rzkeys, int keyCount, int red, int green, int blue)
	{
		wrapper.PluginSetKeysZeroColorRGB(animationId, frameId, rzkeys, keyCount, red, green, blue);
	}
	/*
	Set an array of animation keys to a static color for the given frame where 
	the color is black. Animation is referenced by name.
	*/
	/// EXPORT_API void PluginSetKeysZeroColorRGBName(const char* path, int frameId, const int* rzkeys, int keyCount, int red, int green, int blue);
	public void setKeysZeroColorRGBName(String path, int frameId, Pointer rzkeys, int keyCount, int red, int green, int blue)
	{
		wrapper.PluginSetKeysZeroColorRGBName(path, frameId, rzkeys, keyCount, red, green, blue);
	}
	/*
	Set animation key to a static color for the given frame where the color 
	is black. Animation is referenced by id.
	*/
	/// EXPORT_API void PluginSetKeyZeroColor(int animationId, int frameId, int rzkey, int color);
	public void setKeyZeroColor(int animationId, int frameId, int rzkey, int color)
	{
		wrapper.PluginSetKeyZeroColor(animationId, frameId, rzkey, color);
	}
	/*
	Set animation key to a static color for the given frame where the color 
	is black. Animation is referenced by name.
	*/
	/// EXPORT_API void PluginSetKeyZeroColorName(const char* path, int frameId, int rzkey, int color);
	public void setKeyZeroColorName(String path, int frameId, int rzkey, int color)
	{
		wrapper.PluginSetKeyZeroColorName(path, frameId, rzkey, color);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginSetKeyZeroColorNameD(const char* path, double frameId, double rzkey, double color);
	public double setKeyZeroColorNameD(String path, double frameId, double rzkey, double color)
	{
		return wrapper.PluginSetKeyZeroColorNameD(path, frameId, rzkey, color);
	}
	/*
	Set animation key to a static color for the given frame where the color 
	is black. Animation is referenced by id.
	*/
	/// EXPORT_API void PluginSetKeyZeroColorRGB(int animationId, int frameId, int rzkey, int red, int green, int blue);
	public void setKeyZeroColorRGB(int animationId, int frameId, int rzkey, int red, int green, int blue)
	{
		wrapper.PluginSetKeyZeroColorRGB(animationId, frameId, rzkey, red, green, blue);
	}
	/*
	Set animation key to a static color for the given frame where the color 
	is black. Animation is referenced by name.
	*/
	/// EXPORT_API void PluginSetKeyZeroColorRGBName(const char* path, int frameId, int rzkey, int red, int green, int blue);
	public void setKeyZeroColorRGBName(String path, int frameId, int rzkey, int red, int green, int blue)
	{
		wrapper.PluginSetKeyZeroColorRGBName(path, frameId, rzkey, red, green, blue);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginSetKeyZeroColorRGBNameD(const char* path, double frameId, double rzkey, double red, double green, double blue);
	public double setKeyZeroColorRGBNameD(String path, double frameId, double rzkey, double red, double green, double blue)
	{
		return wrapper.PluginSetKeyZeroColorRGBNameD(path, frameId, rzkey, red, green, blue);
	}
	/*
	Invokes the setup for a debug logging callback so that `stdout` is redirected 
	to the callback. This is used by `Unity` so that debug messages can appear 
	in the console window.
	*/
	/// EXPORT_API void PluginSetLogDelegate(DebugLogPtr fp);
	public void setLogDelegate(Pointer fp)
	{
		wrapper.PluginSetLogDelegate(fp);
	}
	/*
	Sets the target device to the static color.
	*/
	/// EXPORT_API void PluginSetStaticColor(int deviceType, int device, int color);
	public void setStaticColor(int deviceType, int device, int color)
	{
		wrapper.PluginSetStaticColor(deviceType, device, color);
	}
	/*
	Sets all devices to the static color.
	*/
	/// EXPORT_API void PluginSetStaticColorAll(int color);
	public void setStaticColorAll(int color)
	{
		wrapper.PluginSetStaticColorAll(color);
	}
	/*
	Sets the target device to the static color.
	*/
	/// EXPORT_API void PluginStaticColor(int deviceType, int device, int color);
	public void staticColor(int deviceType, int device, int color)
	{
		wrapper.PluginStaticColor(deviceType, device, color);
	}
	/*
	Sets all devices to the static color.
	*/
	/// EXPORT_API void PluginStaticColorAll(int color);
	public void staticColorAll(int color)
	{
		wrapper.PluginStaticColorAll(color);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginStaticColorD(double deviceType, double device, double color);
	public double staticColorD(double deviceType, double device, double color)
	{
		return wrapper.PluginStaticColorD(deviceType, device, color);
	}
	/*
	`PluginStopAll` will automatically stop all animations that are playing.
	*/
	/// EXPORT_API void PluginStopAll();
	public void stopAll()
	{
		wrapper.PluginStopAll();
	}
	/*
	Stops animation playback if in progress. Returns the animation id upon success. 
	Returns negative one upon failure.
	*/
	/// EXPORT_API int PluginStopAnimation(int animationId);
	public int stopAnimation(int animationId)
	{
		return wrapper.PluginStopAnimation(animationId);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginStopAnimationD(double animationId);
	public double stopAnimationD(double animationId)
	{
		return wrapper.PluginStopAnimationD(animationId);
	}
	/*
	`PluginStopAnimationName` automatically handles initializing the `ChromaSDK`. 
	The named `.chroma` animation file will be automatically opened. The animation 
	will stop if playing.
	*/
	/// EXPORT_API void PluginStopAnimationName(const char* path);
	public void stopAnimationName(String path)
	{
		wrapper.PluginStopAnimationName(path);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginStopAnimationNameD(const char* path);
	public double stopAnimationNameD(String path)
	{
		return wrapper.PluginStopAnimationNameD(path);
	}
	/*
	`PluginStopAnimationType` automatically handles initializing the `ChromaSDK`. 
	If any animation is playing for the `deviceType` and `device` combination, 
	it will be stopped.
	*/
	/// EXPORT_API void PluginStopAnimationType(int deviceType, int device);
	public void stopAnimationType(int deviceType, int device)
	{
		wrapper.PluginStopAnimationType(deviceType, device);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginStopAnimationTypeD(double deviceType, double device);
	public double stopAnimationTypeD(double deviceType, double device)
	{
		return wrapper.PluginStopAnimationTypeD(deviceType, device);
	}
	/*
	`PluginStopComposite` automatically handles initializing the `ChromaSDK`. 
	The named animation files for the `.chroma` set will be automatically opened. 
	The set of animations will be stopped if playing.
	*/
	/// EXPORT_API void PluginStopComposite(const char* name);
	public void stopComposite(String name)
	{
		wrapper.PluginStopComposite(name);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginStopCompositeD(const char* name);
	public double stopCompositeD(String name)
	{
		return wrapper.PluginStopCompositeD(name);
	}
	/*
	Return color1 - color2
	*/
	/// EXPORT_API int PluginSubtractColor(const int color1, const int color2);
	public int subtractColor(final int color1, final int color2)
	{
		return wrapper.PluginSubtractColor(color1, color2);
	}
	/*
	Subtract the source color from the target color for the frame where the 
	target color is not black. Source and target are referenced by id.
	*/
	/// EXPORT_API void PluginSubtractNonZeroAllKeys(int sourceAnimationId, int targetAnimationId, int frameId);
	public void subtractNonZeroAllKeys(int sourceAnimationId, int targetAnimationId, int frameId)
	{
		wrapper.PluginSubtractNonZeroAllKeys(sourceAnimationId, targetAnimationId, frameId);
	}
	/*
	Subtract the source color from the target color for all frames where the 
	target color is not black. Source and target are referenced by id.
	*/
	/// EXPORT_API void PluginSubtractNonZeroAllKeysAllFrames(int sourceAnimationId, int targetAnimationId);
	public void subtractNonZeroAllKeysAllFrames(int sourceAnimationId, int targetAnimationId)
	{
		wrapper.PluginSubtractNonZeroAllKeysAllFrames(sourceAnimationId, targetAnimationId);
	}
	/*
	Subtract the source color from the target color for all frames where the 
	target color is not black. Source and target are referenced by name.
	*/
	/// EXPORT_API void PluginSubtractNonZeroAllKeysAllFramesName(const char* sourceAnimation, const char* targetAnimation);
	public void subtractNonZeroAllKeysAllFramesName(String sourceAnimation, String targetAnimation)
	{
		wrapper.PluginSubtractNonZeroAllKeysAllFramesName(sourceAnimation, targetAnimation);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginSubtractNonZeroAllKeysAllFramesNameD(const char* sourceAnimation, const char* targetAnimation);
	public double subtractNonZeroAllKeysAllFramesNameD(String sourceAnimation, String targetAnimation)
	{
		return wrapper.PluginSubtractNonZeroAllKeysAllFramesNameD(sourceAnimation, targetAnimation);
	}
	/*
	Subtract the source color from the target color for all frames where the 
	target color is not black starting at offset for the length of the source. 
	Source and target are referenced by id.
	*/
	/// EXPORT_API void PluginSubtractNonZeroAllKeysAllFramesOffset(int sourceAnimationId, int targetAnimationId, int offset);
	public void subtractNonZeroAllKeysAllFramesOffset(int sourceAnimationId, int targetAnimationId, int offset)
	{
		wrapper.PluginSubtractNonZeroAllKeysAllFramesOffset(sourceAnimationId, targetAnimationId, offset);
	}
	/*
	Subtract the source color from the target color for all frames where the 
	target color is not black starting at offset for the length of the source. 
	Source and target are referenced by name.
	*/
	/// EXPORT_API void PluginSubtractNonZeroAllKeysAllFramesOffsetName(const char* sourceAnimation, const char* targetAnimation, int offset);
	public void subtractNonZeroAllKeysAllFramesOffsetName(String sourceAnimation, String targetAnimation, int offset)
	{
		wrapper.PluginSubtractNonZeroAllKeysAllFramesOffsetName(sourceAnimation, targetAnimation, offset);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginSubtractNonZeroAllKeysAllFramesOffsetNameD(const char* sourceAnimation, const char* targetAnimation, double offset);
	public double subtractNonZeroAllKeysAllFramesOffsetNameD(String sourceAnimation, String targetAnimation, double offset)
	{
		return wrapper.PluginSubtractNonZeroAllKeysAllFramesOffsetNameD(sourceAnimation, targetAnimation, offset);
	}
	/*
	Subtract the source color from the target color for the frame where the 
	target color is not black. Source and target are referenced by name.
	*/
	/// EXPORT_API void PluginSubtractNonZeroAllKeysName(const char* sourceAnimation, const char* targetAnimation, int frameId);
	public void subtractNonZeroAllKeysName(String sourceAnimation, String targetAnimation, int frameId)
	{
		wrapper.PluginSubtractNonZeroAllKeysName(sourceAnimation, targetAnimation, frameId);
	}
	/*
	Subtract the source color from the target where color is not black for the 
	source frame and target offset frame, reference source and target by id.
	*/
	/// EXPORT_API void PluginSubtractNonZeroAllKeysOffset(int sourceAnimationId, int targetAnimationId, int frameId, int offset);
	public void subtractNonZeroAllKeysOffset(int sourceAnimationId, int targetAnimationId, int frameId, int offset)
	{
		wrapper.PluginSubtractNonZeroAllKeysOffset(sourceAnimationId, targetAnimationId, frameId, offset);
	}
	/*
	Subtract the source color from the target where color is not black for the 
	source frame and target offset frame, reference source and target by name.
	*/
	/// EXPORT_API void PluginSubtractNonZeroAllKeysOffsetName(const char* sourceAnimation, const char* targetAnimation, int frameId, int offset);
	public void subtractNonZeroAllKeysOffsetName(String sourceAnimation, String targetAnimation, int frameId, int offset)
	{
		wrapper.PluginSubtractNonZeroAllKeysOffsetName(sourceAnimation, targetAnimation, frameId, offset);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginSubtractNonZeroAllKeysOffsetNameD(const char* sourceAnimation, const char* targetAnimation, double frameId, double offset);
	public double subtractNonZeroAllKeysOffsetNameD(String sourceAnimation, String targetAnimation, double frameId, double offset)
	{
		return wrapper.PluginSubtractNonZeroAllKeysOffsetNameD(sourceAnimation, targetAnimation, frameId, offset);
	}
	/*
	Subtract the source color from the target color where the target color is 
	not black for all frames. Reference source and target by id.
	*/
	/// EXPORT_API void PluginSubtractNonZeroTargetAllKeysAllFrames(int sourceAnimationId, int targetAnimationId);
	public void subtractNonZeroTargetAllKeysAllFrames(int sourceAnimationId, int targetAnimationId)
	{
		wrapper.PluginSubtractNonZeroTargetAllKeysAllFrames(sourceAnimationId, targetAnimationId);
	}
	/*
	Subtract the source color from the target color where the target color is 
	not black for all frames. Reference source and target by name.
	*/
	/// EXPORT_API void PluginSubtractNonZeroTargetAllKeysAllFramesName(const char* sourceAnimation, const char* targetAnimation);
	public void subtractNonZeroTargetAllKeysAllFramesName(String sourceAnimation, String targetAnimation)
	{
		wrapper.PluginSubtractNonZeroTargetAllKeysAllFramesName(sourceAnimation, targetAnimation);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginSubtractNonZeroTargetAllKeysAllFramesNameD(const char* sourceAnimation, const char* targetAnimation);
	public double subtractNonZeroTargetAllKeysAllFramesNameD(String sourceAnimation, String targetAnimation)
	{
		return wrapper.PluginSubtractNonZeroTargetAllKeysAllFramesNameD(sourceAnimation, targetAnimation);
	}
	/*
	Subtract the source color from the target color where the target color is 
	not black for all frames starting at the target offset for the length of 
	the source. Reference source and target by id.
	*/
	/// EXPORT_API void PluginSubtractNonZeroTargetAllKeysAllFramesOffset(int sourceAnimationId, int targetAnimationId, int offset);
	public void subtractNonZeroTargetAllKeysAllFramesOffset(int sourceAnimationId, int targetAnimationId, int offset)
	{
		wrapper.PluginSubtractNonZeroTargetAllKeysAllFramesOffset(sourceAnimationId, targetAnimationId, offset);
	}
	/*
	Subtract the source color from the target color where the target color is 
	not black for all frames starting at the target offset for the length of 
	the source. Reference source and target by name.
	*/
	/// EXPORT_API void PluginSubtractNonZeroTargetAllKeysAllFramesOffsetName(const char* sourceAnimation, const char* targetAnimation, int offset);
	public void subtractNonZeroTargetAllKeysAllFramesOffsetName(String sourceAnimation, String targetAnimation, int offset)
	{
		wrapper.PluginSubtractNonZeroTargetAllKeysAllFramesOffsetName(sourceAnimation, targetAnimation, offset);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginSubtractNonZeroTargetAllKeysAllFramesOffsetNameD(const char* sourceAnimation, const char* targetAnimation, double offset);
	public double subtractNonZeroTargetAllKeysAllFramesOffsetNameD(String sourceAnimation, String targetAnimation, double offset)
	{
		return wrapper.PluginSubtractNonZeroTargetAllKeysAllFramesOffsetNameD(sourceAnimation, targetAnimation, offset);
	}
	/*
	Subtract the source color from the target color where the target color is 
	not black from the source frame to the target offset frame. Reference source 
	and target by id.
	*/
	/// EXPORT_API void PluginSubtractNonZeroTargetAllKeysOffset(int sourceAnimationId, int targetAnimationId, int frameId, int offset);
	public void subtractNonZeroTargetAllKeysOffset(int sourceAnimationId, int targetAnimationId, int frameId, int offset)
	{
		wrapper.PluginSubtractNonZeroTargetAllKeysOffset(sourceAnimationId, targetAnimationId, frameId, offset);
	}
	/*
	Subtract the source color from the target color where the target color is 
	not black from the source frame to the target offset frame. Reference source 
	and target by name.
	*/
	/// EXPORT_API void PluginSubtractNonZeroTargetAllKeysOffsetName(const char* sourceAnimation, const char* targetAnimation, int frameId, int offset);
	public void subtractNonZeroTargetAllKeysOffsetName(String sourceAnimation, String targetAnimation, int frameId, int offset)
	{
		wrapper.PluginSubtractNonZeroTargetAllKeysOffsetName(sourceAnimation, targetAnimation, frameId, offset);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginSubtractNonZeroTargetAllKeysOffsetNameD(const char* sourceAnimation, const char* targetAnimation, double frameId, double offset);
	public double subtractNonZeroTargetAllKeysOffsetNameD(String sourceAnimation, String targetAnimation, double frameId, double offset)
	{
		return wrapper.PluginSubtractNonZeroTargetAllKeysOffsetNameD(sourceAnimation, targetAnimation, frameId, offset);
	}
	/*
	Subtract all frames with the min RGB color where the animation color is 
	less than the min threshold AND with the max RGB color where the animation 
	is more than the max threshold. Animation is referenced by id.
	*/
	/// EXPORT_API void PluginSubtractThresholdColorsMinMaxAllFramesRGB(const int animationId, const int minThreshold, const int minRed, const int minGreen, const int minBlue, const int maxThreshold, const int maxRed, const int maxGreen, const int maxBlue);
	public void subtractThresholdColorsMinMaxAllFramesRGB(final int animationId, final int minThreshold, final int minRed, final int minGreen, final int minBlue, final int maxThreshold, final int maxRed, final int maxGreen, final int maxBlue)
	{
		wrapper.PluginSubtractThresholdColorsMinMaxAllFramesRGB(animationId, minThreshold, minRed, minGreen, minBlue, maxThreshold, maxRed, maxGreen, maxBlue);
	}
	/*
	Subtract all frames with the min RGB color where the animation color is 
	less than the min threshold AND with the max RGB color where the animation 
	is more than the max threshold. Animation is referenced by name.
	*/
	/// EXPORT_API void PluginSubtractThresholdColorsMinMaxAllFramesRGBName(const char* path, const int minThreshold, const int minRed, const int minGreen, const int minBlue, const int maxThreshold, const int maxRed, const int maxGreen, const int maxBlue);
	public void subtractThresholdColorsMinMaxAllFramesRGBName(String path, final int minThreshold, final int minRed, final int minGreen, final int minBlue, final int maxThreshold, final int maxRed, final int maxGreen, final int maxBlue)
	{
		wrapper.PluginSubtractThresholdColorsMinMaxAllFramesRGBName(path, minThreshold, minRed, minGreen, minBlue, maxThreshold, maxRed, maxGreen, maxBlue);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginSubtractThresholdColorsMinMaxAllFramesRGBNameD(const char* path, double minThreshold, double minRed, double minGreen, double minBlue, double maxThreshold, double maxRed, double maxGreen, double maxBlue);
	public double subtractThresholdColorsMinMaxAllFramesRGBNameD(String path, double minThreshold, double minRed, double minGreen, double minBlue, double maxThreshold, double maxRed, double maxGreen, double maxBlue)
	{
		return wrapper.PluginSubtractThresholdColorsMinMaxAllFramesRGBNameD(path, minThreshold, minRed, minGreen, minBlue, maxThreshold, maxRed, maxGreen, maxBlue);
	}
	/*
	Subtract the specified frame with the min RGB color where the animation 
	color is less than the min threshold AND with the max RGB color where the 
	animation is more than the max threshold. Animation is referenced by id.
	*/
	/// EXPORT_API void PluginSubtractThresholdColorsMinMaxRGB(const int animationId, const int frameId, const int minThreshold, const int minRed, const int minGreen, const int minBlue, const int maxThreshold, const int maxRed, const int maxGreen, const int maxBlue);
	public void subtractThresholdColorsMinMaxRGB(final int animationId, final int frameId, final int minThreshold, final int minRed, final int minGreen, final int minBlue, final int maxThreshold, final int maxRed, final int maxGreen, final int maxBlue)
	{
		wrapper.PluginSubtractThresholdColorsMinMaxRGB(animationId, frameId, minThreshold, minRed, minGreen, minBlue, maxThreshold, maxRed, maxGreen, maxBlue);
	}
	/*
	Subtract the specified frame with the min RGB color where the animation 
	color is less than the min threshold AND with the max RGB color where the 
	animation is more than the max threshold. Animation is referenced by name.
	*/
	/// EXPORT_API void PluginSubtractThresholdColorsMinMaxRGBName(const char* path, const int frameId, const int minThreshold, const int minRed, const int minGreen, const int minBlue, const int maxThreshold, const int maxRed, const int maxGreen, const int maxBlue);
	public void subtractThresholdColorsMinMaxRGBName(String path, final int frameId, final int minThreshold, final int minRed, final int minGreen, final int minBlue, final int maxThreshold, final int maxRed, final int maxGreen, final int maxBlue)
	{
		wrapper.PluginSubtractThresholdColorsMinMaxRGBName(path, frameId, minThreshold, minRed, minGreen, minBlue, maxThreshold, maxRed, maxGreen, maxBlue);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginSubtractThresholdColorsMinMaxRGBNameD(const char* path, const int frameId, const int minThreshold, const int minRed, const int minGreen, const int minBlue, const int maxThreshold, const int maxRed, const int maxGreen, const int maxBlue);
	public double subtractThresholdColorsMinMaxRGBNameD(String path, final int frameId, final int minThreshold, final int minRed, final int minGreen, final int minBlue, final int maxThreshold, final int maxRed, final int maxGreen, final int maxBlue)
	{
		return wrapper.PluginSubtractThresholdColorsMinMaxRGBNameD(path, frameId, minThreshold, minRed, minGreen, minBlue, maxThreshold, maxRed, maxGreen, maxBlue);
	}
	/*
	Trim the end of the animation. The length of the animation will be the lastFrameId 
	plus one. Reference the animation by id.
	*/
	/// EXPORT_API void PluginTrimEndFrames(int animationId, int lastFrameId);
	public void trimEndFrames(int animationId, int lastFrameId)
	{
		wrapper.PluginTrimEndFrames(animationId, lastFrameId);
	}
	/*
	Trim the end of the animation. The length of the animation will be the lastFrameId 
	plus one. Reference the animation by name.
	*/
	/// EXPORT_API void PluginTrimEndFramesName(const char* path, int lastFrameId);
	public void trimEndFramesName(String path, int lastFrameId)
	{
		wrapper.PluginTrimEndFramesName(path, lastFrameId);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginTrimEndFramesNameD(const char* path, double lastFrameId);
	public double trimEndFramesNameD(String path, double lastFrameId)
	{
		return wrapper.PluginTrimEndFramesNameD(path, lastFrameId);
	}
	/*
	Remove the frame from the animation. Reference animation by id.
	*/
	/// EXPORT_API void PluginTrimFrame(int animationId, int frameId);
	public void trimFrame(int animationId, int frameId)
	{
		wrapper.PluginTrimFrame(animationId, frameId);
	}
	/*
	Remove the frame from the animation. Reference animation by name.
	*/
	/// EXPORT_API void PluginTrimFrameName(const char* path, int frameId);
	public void trimFrameName(String path, int frameId)
	{
		wrapper.PluginTrimFrameName(path, frameId);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginTrimFrameNameD(const char* path, double frameId);
	public double trimFrameNameD(String path, double frameId)
	{
		return wrapper.PluginTrimFrameNameD(path, frameId);
	}
	/*
	Trim the start of the animation starting at frame 0 for the number of frames. 
	Reference the animation by id.
	*/
	/// EXPORT_API void PluginTrimStartFrames(int animationId, int numberOfFrames);
	public void trimStartFrames(int animationId, int numberOfFrames)
	{
		wrapper.PluginTrimStartFrames(animationId, numberOfFrames);
	}
	/*
	Trim the start of the animation starting at frame 0 for the number of frames. 
	Reference the animation by name.
	*/
	/// EXPORT_API void PluginTrimStartFramesName(const char* path, int numberOfFrames);
	public void trimStartFramesName(String path, int numberOfFrames)
	{
		wrapper.PluginTrimStartFramesName(path, numberOfFrames);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginTrimStartFramesNameD(const char* path, double numberOfFrames);
	public double trimStartFramesNameD(String path, double numberOfFrames)
	{
		return wrapper.PluginTrimStartFramesNameD(path, numberOfFrames);
	}
	/*
	Uninitializes the `ChromaSDK`. Returns 0 upon success. Returns negative 
	one upon failure.
	*/
	/// EXPORT_API RZRESULT PluginUninit();
	public int uninit()
	{
		return wrapper.PluginUninit();
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginUninitD();
	public double uninitD()
	{
		return wrapper.PluginUninitD();
	}
	/*
	Unloads `Chroma` effects to free up resources. Returns the animation id 
	upon success. Returns negative one upon failure. Reference the animation 
	by id.
	*/
	/// EXPORT_API int PluginUnloadAnimation(int animationId);
	public int unloadAnimation(int animationId)
	{
		return wrapper.PluginUnloadAnimation(animationId);
	}
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginUnloadAnimationD(double animationId);
	public double unloadAnimationD(double animationId)
	{
		return wrapper.PluginUnloadAnimationD(animationId);
	}
	/*
	Unload the animation effects. Reference the animation by name.
	*/
	/// EXPORT_API void PluginUnloadAnimationName(const char* path);
	public void unloadAnimationName(String path)
	{
		wrapper.PluginUnloadAnimationName(path);
	}
	/*
	Unload the the composite set of animation effects. Reference the animation 
	by name.
	*/
	/// EXPORT_API void PluginUnloadComposite(const char* name);
	public void unloadComposite(String name)
	{
		wrapper.PluginUnloadComposite(name);
	}
	/*
	Unload the Razer Chroma SDK Library before exiting the application.
	*/
	/// EXPORT_API void PluginUnloadLibrarySDK();
	public void unloadLibrarySDK()
	{
		wrapper.PluginUnloadLibrarySDK();
	}
	/*
	Unload the Razer Chroma Streaming Plugin Library before exiting the application.
	*/
	/// EXPORT_API void PluginUnloadLibraryStreamingPlugin();
	public void unloadLibraryStreamingPlugin()
	{
		wrapper.PluginUnloadLibraryStreamingPlugin();
	}
	/*
	Updates the `frameId` of the `Chroma` animation referenced by id and sets 
	the `duration` (in seconds). The `color` is expected to be an array of 
	the dimensions for the `deviceType/device`. The `length` parameter is the 
	size of the `color` array. For `EChromaSDKDevice1DEnum` the array size 
	should be `MAX LEDS`. For `EChromaSDKDevice2DEnum` the array size should 
	be `MAX ROW` times `MAX COLUMN`. Keys are populated only for EChromaSDKDevice2DEnum::DE_Keyboard 
	and EChromaSDKDevice2DEnum::DE_KeyboardExtended. Keys will only use the 
	EChromaSDKDevice2DEnum::DE_Keyboard `MAX_ROW` times `MAX_COLUMN` keysLength.
	*/
	/// EXPORT_API int PluginUpdateFrame(int animationId, int frameId, float duration, int* colors, int length, int* keys, int keysLength);
	public int updateFrame(int animationId, int frameId, float duration, Pointer colors, int length, Pointer keys, int keysLength)
	{
		return wrapper.PluginUpdateFrame(animationId, frameId, duration, colors, length, keys, keysLength);
	}
	/*
	Update the `frameId` of the `Chroma` animation referenced by name and sets 
	the `duration` (in seconds). The `color` is expected to be an array of 
	the dimensions for the `deviceType/device`. The `length` parameter is the 
	size of the `color` array. For `EChromaSDKDevice1DEnum` the array size 
	should be `MAX LEDS`. For `EChromaSDKDevice2DEnum` the array size should 
	be `MAX ROW` times `MAX COLUMN`. Keys are populated only for EChromaSDKDevice2DEnum::DE_Keyboard 
	and EChromaSDKDevice2DEnum::DE_KeyboardExtended. Keys will only use the 
	EChromaSDKDevice2DEnum::DE_Keyboard `MAX_ROW` times `MAX_COLUMN` keysLength. 
	Returns the animation id upon success. Returns negative one upon failure.
	*/
	/// EXPORT_API int PluginUpdateFrameName(const char* path, int frameId, float duration, int* colors, int length, int* keys, int keysLength);
	public int updateFrameName(String path, int frameId, float duration, Pointer colors, int length, Pointer keys, int keysLength)
	{
		return wrapper.PluginUpdateFrameName(path, frameId, duration, colors, length, keys, keysLength);
	}
	/*
	On by default, `UseForwardChromaEvents` sends the animation name to `CoreSetEventName` 
	automatically when `PlayAnimationName` is called.
	*/
	/// EXPORT_API void PluginUseForwardChromaEvents(bool flag);
	public void useForwardChromaEvents(boolean flag)
	{
		wrapper.PluginUseForwardChromaEvents(flag);
	}
	/*
	When the idle animation flag is true, when no other animations are playing, 
	the idle animation will be used. The idle animation will not be affected 
	by the API calls to PluginIsPlaying, PluginStopAnimationType, PluginGetPlayingAnimationId, 
	and PluginGetPlayingAnimationCount. Then the idle animation flag is false, 
	the idle animation is disabled. `Device` uses `EChromaSDKDeviceEnum` enums.
	*/
	/// EXPORT_API void PluginUseIdleAnimation(int device, bool flag);
	public void useIdleAnimation(int device, boolean flag)
	{
		wrapper.PluginUseIdleAnimation(device, flag);
	}
	/*
	Set idle animation flag for all devices.
	*/
	/// EXPORT_API void PluginUseIdleAnimations(bool flag);
	public void useIdleAnimations(boolean flag)
	{
		wrapper.PluginUseIdleAnimations(flag);
	}
	/*
	Set preloading animation flag, which is set to true by default. Reference 
	animation by id.
	*/
	/// EXPORT_API void PluginUsePreloading(int animationId, bool flag);
	public void usePreloading(int animationId, boolean flag)
	{
		wrapper.PluginUsePreloading(animationId, flag);
	}
	/*
	Set preloading animation flag, which is set to true by default. Reference 
	animation by name.
	*/
	/// EXPORT_API void PluginUsePreloadingName(const char* path, bool flag);
	public void usePreloadingName(String path, boolean flag)
	{
		wrapper.PluginUsePreloadingName(path, flag);
	}

}
