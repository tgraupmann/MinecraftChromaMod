package com.razer.java;

import com.sun.jna.Library;
import com.sun.jna.Pointer;
import org.jglr.jchroma.devices.DeviceInfos;
import org.jglr.jchroma.devices.GUIDStruct;

/**
 * Wrapper used by JNA to load Razer Chroma SDK libraries.
 */
interface JChromaLib extends Library {
                
	/*
	Adds a frame to the `Chroma` animation and sets the `duration` (in seconds). 
	The `color` is expected to be an array of the dimensions for the `deviceType/device`. 
	The `length` parameter is the size of the `color` array. For `EChromaSDKDevice1DEnum` 
	the array size should be `MAX LEDS`. For `EChromaSDKDevice2DEnum` the array 
	size should be `MAX ROW` * `MAX COLUMN`. Returns the animation id upon 
	success. Returns -1 upon failure.
	*/
	/// EXPORT_API int PluginAddFrame(int animationId, float duration, int* colors, int length);
	int PluginAddFrame(int animationId, float duration, Pointer colors, int length);
	/*
	Add source color to target where color is not black for all frames, reference 
	source and target by id.
	*/
	/// EXPORT_API void PluginAddNonZeroAllKeysAllFrames(int sourceAnimationId, int targetAnimationId);
	void PluginAddNonZeroAllKeysAllFrames(int sourceAnimationId, int targetAnimationId);
	/*
	Add source color to target where color is not black for all frames, reference 
	source and target by name.
	*/
	/// EXPORT_API void PluginAddNonZeroAllKeysAllFramesName(const char* sourceAnimation, const char* targetAnimation);
	void PluginAddNonZeroAllKeysAllFramesName(String sourceAnimation, String targetAnimation);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginAddNonZeroAllKeysAllFramesNameD(const char* sourceAnimation, const char* targetAnimation);
	double PluginAddNonZeroAllKeysAllFramesNameD(String sourceAnimation, String targetAnimation);
	/*
	Add source color to target where color is not black for all frames starting 
	at offset for the length of the source, reference source and target by 
	id.
	*/
	/// EXPORT_API void PluginAddNonZeroAllKeysAllFramesOffset(int sourceAnimationId, int targetAnimationId, int offset);
	void PluginAddNonZeroAllKeysAllFramesOffset(int sourceAnimationId, int targetAnimationId, int offset);
	/*
	Add source color to target where color is not black for all frames starting 
	at offset for the length of the source, reference source and target by 
	name.
	*/
	/// EXPORT_API void PluginAddNonZeroAllKeysAllFramesOffsetName(const char* sourceAnimation, const char* targetAnimation, int offset);
	void PluginAddNonZeroAllKeysAllFramesOffsetName(String sourceAnimation, String targetAnimation, int offset);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginAddNonZeroAllKeysAllFramesOffsetNameD(const char* sourceAnimation, const char* targetAnimation, double offset);
	double PluginAddNonZeroAllKeysAllFramesOffsetNameD(String sourceAnimation, String targetAnimation, double offset);
	/*
	Add source color to target where color is not black for the source frame 
	and target offset frame, reference source and target by id.
	*/
	/// EXPORT_API void PluginAddNonZeroAllKeysOffset(int sourceAnimationId, int targetAnimationId, int frameId, int offset);
	void PluginAddNonZeroAllKeysOffset(int sourceAnimationId, int targetAnimationId, int frameId, int offset);
	/*
	Add source color to target where color is not black for the source frame 
	and target offset frame, reference source and target by name.
	*/
	/// EXPORT_API void PluginAddNonZeroAllKeysOffsetName(const char* sourceAnimation, const char* targetAnimation, int frameId, int offset);
	void PluginAddNonZeroAllKeysOffsetName(String sourceAnimation, String targetAnimation, int frameId, int offset);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginAddNonZeroAllKeysOffsetNameD(const char* sourceAnimation, const char* targetAnimation, double frameId, double offset);
	double PluginAddNonZeroAllKeysOffsetNameD(String sourceAnimation, String targetAnimation, double frameId, double offset);
	/*
	Add source color to target where the target color is not black for all frames, 
	reference source and target by id.
	*/
	/// EXPORT_API void PluginAddNonZeroTargetAllKeysAllFrames(int sourceAnimationId, int targetAnimationId);
	void PluginAddNonZeroTargetAllKeysAllFrames(int sourceAnimationId, int targetAnimationId);
	/*
	Add source color to target where the target color is not black for all frames, 
	reference source and target by name.
	*/
	/// EXPORT_API void PluginAddNonZeroTargetAllKeysAllFramesName(const char* sourceAnimation, const char* targetAnimation);
	void PluginAddNonZeroTargetAllKeysAllFramesName(String sourceAnimation, String targetAnimation);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginAddNonZeroTargetAllKeysAllFramesNameD(const char* sourceAnimation, const char* targetAnimation);
	double PluginAddNonZeroTargetAllKeysAllFramesNameD(String sourceAnimation, String targetAnimation);
	/*
	Add source color to target where the target color is not black for all frames 
	starting at offset for the length of the source, reference source and target 
	by id.
	*/
	/// EXPORT_API void PluginAddNonZeroTargetAllKeysAllFramesOffset(int sourceAnimationId, int targetAnimationId, int offset);
	void PluginAddNonZeroTargetAllKeysAllFramesOffset(int sourceAnimationId, int targetAnimationId, int offset);
	/*
	Add source color to target where the target color is not black for all frames 
	starting at offset for the length of the source, reference source and target 
	by name.
	*/
	/// EXPORT_API void PluginAddNonZeroTargetAllKeysAllFramesOffsetName(const char* sourceAnimation, const char* targetAnimation, int offset);
	void PluginAddNonZeroTargetAllKeysAllFramesOffsetName(String sourceAnimation, String targetAnimation, int offset);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginAddNonZeroTargetAllKeysAllFramesOffsetNameD(const char* sourceAnimation, const char* targetAnimation, double offset);
	double PluginAddNonZeroTargetAllKeysAllFramesOffsetNameD(String sourceAnimation, String targetAnimation, double offset);
	/*
	Add source color to target where target color is not blank from the source 
	frame to the target offset frame, reference source and target by id.
	*/
	/// EXPORT_API void PluginAddNonZeroTargetAllKeysOffset(int sourceAnimationId, int targetAnimationId, int frameId, int offset);
	void PluginAddNonZeroTargetAllKeysOffset(int sourceAnimationId, int targetAnimationId, int frameId, int offset);
	/*
	Add source color to target where target color is not blank from the source 
	frame to the target offset frame, reference source and target by name.
	*/
	/// EXPORT_API void PluginAddNonZeroTargetAllKeysOffsetName(const char* sourceAnimation, const char* targetAnimation, int frameId, int offset);
	void PluginAddNonZeroTargetAllKeysOffsetName(String sourceAnimation, String targetAnimation, int frameId, int offset);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginAddNonZeroTargetAllKeysOffsetNameD(const char* sourceAnimation, const char* targetAnimation, double frameId, double offset);
	double PluginAddNonZeroTargetAllKeysOffsetNameD(String sourceAnimation, String targetAnimation, double frameId, double offset);
	/*
	Append all source frames to the target animation, reference source and target 
	by id.
	*/
	/// EXPORT_API void PluginAppendAllFrames(int sourceAnimationId, int targetAnimationId);
	void PluginAppendAllFrames(int sourceAnimationId, int targetAnimationId);
	/*
	Append all source frames to the target animation, reference source and target 
	by name.
	*/
	/// EXPORT_API void PluginAppendAllFramesName(const char* sourceAnimation, const char* targetAnimation);
	void PluginAppendAllFramesName(String sourceAnimation, String targetAnimation);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginAppendAllFramesNameD(const char* sourceAnimation, const char* targetAnimation);
	double PluginAppendAllFramesNameD(String sourceAnimation, String targetAnimation);
	/*
	`PluginClearAll` will issue a `CLEAR` effect for all devices.
	*/
	/// EXPORT_API void PluginClearAll();
	void PluginClearAll();
	/*
	`PluginClearAnimationType` will issue a `CLEAR` effect for the given device.
	*/
	/// EXPORT_API void PluginClearAnimationType(int deviceType, int device);
	void PluginClearAnimationType(int deviceType, int device);
	/*
	`PluginCloseAll` closes all open animations so they can be reloaded from 
	disk. The set of animations will be stopped if playing.
	*/
	/// EXPORT_API void PluginCloseAll();
	void PluginCloseAll();
	/*
	Closes the `Chroma` animation to free up resources referenced by id. Returns 
	the animation id upon success. Returns -1 upon failure. This might be used 
	while authoring effects if there was a change necessitating re-opening 
	the animation. The animation id can no longer be used once closed.
	*/
	/// EXPORT_API int PluginCloseAnimation(int animationId);
	int PluginCloseAnimation(int animationId);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginCloseAnimationD(double animationId);
	double PluginCloseAnimationD(double animationId);
	/*
	Closes the `Chroma` animation referenced by name so that the animation can 
	be reloaded from disk.
	*/
	/// EXPORT_API void PluginCloseAnimationName(const char* path);
	void PluginCloseAnimationName(String path);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginCloseAnimationNameD(const char* path);
	double PluginCloseAnimationNameD(String path);
	/*
	`PluginCloseComposite` closes a set of animations so they can be reloaded 
	from disk. The set of animations will be stopped if playing.
	*/
	/// EXPORT_API void PluginCloseComposite(const char* name);
	void PluginCloseComposite(String name);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginCloseCompositeD(const char* name);
	double PluginCloseCompositeD(String name);
	/*
	Copy animation to named target animation in memory. If target animation 
	exists, close first. Source is referenced by id.
	*/
	/// EXPORT_API int PluginCopyAnimation(int sourceAnimationId, const char* targetAnimation);
	int PluginCopyAnimation(int sourceAnimationId, String targetAnimation);
	/*
	Copy animation to named target animation in memory. If target animation 
	exists, close first. Source is referenced by name.
	*/
	/// EXPORT_API void PluginCopyAnimationName(const char* sourceAnimation, const char* targetAnimation);
	void PluginCopyAnimationName(String sourceAnimation, String targetAnimation);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginCopyAnimationNameD(const char* sourceAnimation, const char* targetAnimation);
	double PluginCopyAnimationNameD(String sourceAnimation, String targetAnimation);
	/*
	Copy blue channel to other channels for all frames. Intensity range is 0.0 
	to 1.0. Reference the animation by id.
	*/
	/// EXPORT_API void PluginCopyBlueChannelAllFrames(int animationId, float redIntensity, float greenIntensity);
	void PluginCopyBlueChannelAllFrames(int animationId, float redIntensity, float greenIntensity);
	/*
	Copy blue channel to other channels for all frames. Intensity range is 0.0 
	to 1.0. Reference the animation by name.
	*/
	/// EXPORT_API void PluginCopyBlueChannelAllFramesName(const char* path, float redIntensity, float greenIntensity);
	void PluginCopyBlueChannelAllFramesName(String path, float redIntensity, float greenIntensity);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginCopyBlueChannelAllFramesNameD(const char* path, double redIntensity, double greenIntensity);
	double PluginCopyBlueChannelAllFramesNameD(String path, double redIntensity, double greenIntensity);
	/*
	Copy green channel to other channels for all frames. Intensity range is 
	0.0 to 1.0. Reference the animation by id.
	*/
	/// EXPORT_API void PluginCopyGreenChannelAllFrames(int animationId, float redIntensity, float blueIntensity);
	void PluginCopyGreenChannelAllFrames(int animationId, float redIntensity, float blueIntensity);
	/*
	Copy green channel to other channels for all frames. Intensity range is 
	0.0 to 1.0. Reference the animation by name.
	*/
	/// EXPORT_API void PluginCopyGreenChannelAllFramesName(const char* path, float redIntensity, float blueIntensity);
	void PluginCopyGreenChannelAllFramesName(String path, float redIntensity, float blueIntensity);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginCopyGreenChannelAllFramesNameD(const char* path, double redIntensity, double blueIntensity);
	double PluginCopyGreenChannelAllFramesNameD(String path, double redIntensity, double blueIntensity);
	/*
	Copy animation key color from the source animation to the target animation 
	for the given frame. Reference the source and target by id.
	*/
	/// EXPORT_API void PluginCopyKeyColor(int sourceAnimationId, int targetAnimationId, int frameId, int rzkey);
	void PluginCopyKeyColor(int sourceAnimationId, int targetAnimationId, int frameId, int rzkey);
	/*
	Copy animation key color from the source animation to the target animation 
	for all frames. Reference the source and target by id.
	*/
	/// EXPORT_API void PluginCopyKeyColorAllFrames(int sourceAnimationId, int targetAnimationId, int rzkey);
	void PluginCopyKeyColorAllFrames(int sourceAnimationId, int targetAnimationId, int rzkey);
	/*
	Copy animation key color from the source animation to the target animation 
	for all frames. Reference the source and target by name.
	*/
	/// EXPORT_API void PluginCopyKeyColorAllFramesName(const char* sourceAnimation, const char* targetAnimation, int rzkey);
	void PluginCopyKeyColorAllFramesName(String sourceAnimation, String targetAnimation, int rzkey);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginCopyKeyColorAllFramesNameD(const char* sourceAnimation, const char* targetAnimation, double rzkey);
	double PluginCopyKeyColorAllFramesNameD(String sourceAnimation, String targetAnimation, double rzkey);
	/*
	Copy animation key color from the source animation to the target animation 
	for all frames, starting at the offset for the length of the source animation. 
	Source and target are referenced by id.
	*/
	/// EXPORT_API void PluginCopyKeyColorAllFramesOffset(int sourceAnimationId, int targetAnimationId, int rzkey, int offset);
	void PluginCopyKeyColorAllFramesOffset(int sourceAnimationId, int targetAnimationId, int rzkey, int offset);
	/*
	Copy animation key color from the source animation to the target animation 
	for all frames, starting at the offset for the length of the source animation. 
	Source and target are referenced by name.
	*/
	/// EXPORT_API void PluginCopyKeyColorAllFramesOffsetName(const char* sourceAnimation, const char* targetAnimation, int rzkey, int offset);
	void PluginCopyKeyColorAllFramesOffsetName(String sourceAnimation, String targetAnimation, int rzkey, int offset);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginCopyKeyColorAllFramesOffsetNameD(const char* sourceAnimation, const char* targetAnimation, double rzkey, double offset);
	double PluginCopyKeyColorAllFramesOffsetNameD(String sourceAnimation, String targetAnimation, double rzkey, double offset);
	/*
	Copy animation key color from the source animation to the target animation 
	for the given frame.
	*/
	/// EXPORT_API void PluginCopyKeyColorName(const char* sourceAnimation, const char* targetAnimation, int frameId, int rzkey);
	void PluginCopyKeyColorName(String sourceAnimation, String targetAnimation, int frameId, int rzkey);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginCopyKeyColorNameD(const char* sourceAnimation, const char* targetAnimation, double frameId, double rzkey);
	double PluginCopyKeyColorNameD(String sourceAnimation, String targetAnimation, double frameId, double rzkey);
	/*
	Copy animation color for a set of keys from the source animation to the 
	target animation for the given frame. Reference the source and target by 
	id.
	*/
	/// EXPORT_API void PluginCopyKeysColor(int sourceAnimationId, int targetAnimationId, int frameId, const int* keys, int size);
	void PluginCopyKeysColor(int sourceAnimationId, int targetAnimationId, int frameId, Pointer keys, int size);
	/*
	Copy animation color for a set of keys from the source animation to the 
	target animation for all frames. Reference the source and target by id.
	*/
	/// EXPORT_API void PluginCopyKeysColorAllFrames(int sourceAnimationId, int targetAnimationId, const int* keys, int size);
	void PluginCopyKeysColorAllFrames(int sourceAnimationId, int targetAnimationId, Pointer keys, int size);
	/*
	Copy animation color for a set of keys from the source animation to the 
	target animation for all frames. Reference the source and target by name.
	*/
	/// EXPORT_API void PluginCopyKeysColorAllFramesName(const char* sourceAnimation, const char* targetAnimation, const int* keys, int size);
	void PluginCopyKeysColorAllFramesName(String sourceAnimation, String targetAnimation, Pointer keys, int size);
	/*
	Copy animation color for a set of keys from the source animation to the 
	target animation for the given frame. Reference the source and target by 
	name.
	*/
	/// EXPORT_API void PluginCopyKeysColorName(const char* sourceAnimation, const char* targetAnimation, int frameId, const int* keys, int size);
	void PluginCopyKeysColorName(String sourceAnimation, String targetAnimation, int frameId, Pointer keys, int size);
	/*
	Copy animation color for a set of keys from the source animation to the 
	target animation from the source frame to the target frame. Reference the 
	source and target by id.
	*/
	/// EXPORT_API void PluginCopyKeysColorOffset(int sourceAnimationId, int targetAnimationId, int sourceFrameId, int targetFrameId, const int* keys, int size);
	void PluginCopyKeysColorOffset(int sourceAnimationId, int targetAnimationId, int sourceFrameId, int targetFrameId, Pointer keys, int size);
	/*
	Copy animation color for a set of keys from the source animation to the 
	target animation from the source frame to the target frame. Reference the 
	source and target by name.
	*/
	/// EXPORT_API void PluginCopyKeysColorOffsetName(const char* sourceAnimation, const char* targetAnimation, int sourceFrameId, int targetFrameId, const int* keys, int size);
	void PluginCopyKeysColorOffsetName(String sourceAnimation, String targetAnimation, int sourceFrameId, int targetFrameId, Pointer keys, int size);
	/*
	Copy source animation to target animation for the given frame. Source and 
	target are referenced by id.
	*/
	/// EXPORT_API void PluginCopyNonZeroAllKeys(int sourceAnimationId, int targetAnimationId, int frameId);
	void PluginCopyNonZeroAllKeys(int sourceAnimationId, int targetAnimationId, int frameId);
	/*
	Copy nonzero colors from a source animation to a target animation for all 
	frames. Reference source and target by id.
	*/
	/// EXPORT_API void PluginCopyNonZeroAllKeysAllFrames(int sourceAnimationId, int targetAnimationId);
	void PluginCopyNonZeroAllKeysAllFrames(int sourceAnimationId, int targetAnimationId);
	/*
	Copy nonzero colors from a source animation to a target animation for all 
	frames. Reference source and target by name.
	*/
	/// EXPORT_API void PluginCopyNonZeroAllKeysAllFramesName(const char* sourceAnimation, const char* targetAnimation);
	void PluginCopyNonZeroAllKeysAllFramesName(String sourceAnimation, String targetAnimation);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginCopyNonZeroAllKeysAllFramesNameD(const char* sourceAnimation, const char* targetAnimation);
	double PluginCopyNonZeroAllKeysAllFramesNameD(String sourceAnimation, String targetAnimation);
	/*
	Copy nonzero colors from a source animation to a target animation for all 
	frames starting at the offset for the length of the source animation. The 
	source and target are referenced by id.
	*/
	/// EXPORT_API void PluginCopyNonZeroAllKeysAllFramesOffset(int sourceAnimationId, int targetAnimationId, int offset);
	void PluginCopyNonZeroAllKeysAllFramesOffset(int sourceAnimationId, int targetAnimationId, int offset);
	/*
	Copy nonzero colors from a source animation to a target animation for all 
	frames starting at the offset for the length of the source animation. The 
	source and target are referenced by name.
	*/
	/// EXPORT_API void PluginCopyNonZeroAllKeysAllFramesOffsetName(const char* sourceAnimation, const char* targetAnimation, int offset);
	void PluginCopyNonZeroAllKeysAllFramesOffsetName(String sourceAnimation, String targetAnimation, int offset);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginCopyNonZeroAllKeysAllFramesOffsetNameD(const char* sourceAnimation, const char* targetAnimation, double offset);
	double PluginCopyNonZeroAllKeysAllFramesOffsetNameD(String sourceAnimation, String targetAnimation, double offset);
	/*
	Copy nonzero colors from source animation to target animation for the specified 
	frame. Source and target are referenced by id.
	*/
	/// EXPORT_API void PluginCopyNonZeroAllKeysName(const char* sourceAnimation, const char* targetAnimation, int frameId);
	void PluginCopyNonZeroAllKeysName(String sourceAnimation, String targetAnimation, int frameId);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginCopyNonZeroAllKeysNameD(const char* sourceAnimation, const char* targetAnimation, double frameId);
	double PluginCopyNonZeroAllKeysNameD(String sourceAnimation, String targetAnimation, double frameId);
	/*
	Copy nonzero colors from the source animation to the target animation from 
	the source frame to the target offset frame. Source and target are referenced 
	by id.
	*/
	/// EXPORT_API void PluginCopyNonZeroAllKeysOffset(int sourceAnimationId, int targetAnimationId, int frameId, int offset);
	void PluginCopyNonZeroAllKeysOffset(int sourceAnimationId, int targetAnimationId, int frameId, int offset);
	/*
	Copy nonzero colors from the source animation to the target animation from 
	the source frame to the target offset frame. Source and target are referenced 
	by name.
	*/
	/// EXPORT_API void PluginCopyNonZeroAllKeysOffsetName(const char* sourceAnimation, const char* targetAnimation, int frameId, int offset);
	void PluginCopyNonZeroAllKeysOffsetName(String sourceAnimation, String targetAnimation, int frameId, int offset);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginCopyNonZeroAllKeysOffsetNameD(const char* sourceAnimation, const char* targetAnimation, double frameId, double offset);
	double PluginCopyNonZeroAllKeysOffsetNameD(String sourceAnimation, String targetAnimation, double frameId, double offset);
	/*
	Copy animation key color from the source animation to the target animation 
	for the given frame where color is not zero.
	*/
	/// EXPORT_API void PluginCopyNonZeroKeyColor(int sourceAnimationId, int targetAnimationId, int frameId, int rzkey);
	void PluginCopyNonZeroKeyColor(int sourceAnimationId, int targetAnimationId, int frameId, int rzkey);
	/*
	Copy animation key color from the source animation to the target animation 
	for the given frame where color is not zero.
	*/
	/// EXPORT_API void PluginCopyNonZeroKeyColorName(const char* sourceAnimation, const char* targetAnimation, int frameId, int rzkey);
	void PluginCopyNonZeroKeyColorName(String sourceAnimation, String targetAnimation, int frameId, int rzkey);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginCopyNonZeroKeyColorNameD(const char* sourceAnimation, const char* targetAnimation, double frameId, double rzkey);
	double PluginCopyNonZeroKeyColorNameD(String sourceAnimation, String targetAnimation, double frameId, double rzkey);
	/*
	Copy nonzero colors from the source animation to the target animation where 
	the target color is nonzero for the specified frame. Source and target 
	are referenced by id.
	*/
	/// EXPORT_API void PluginCopyNonZeroTargetAllKeys(int sourceAnimationId, int targetAnimationId, int frameId);
	void PluginCopyNonZeroTargetAllKeys(int sourceAnimationId, int targetAnimationId, int frameId);
	/*
	Copy nonzero colors from the source animation to the target animation where 
	the target color is nonzero for all frames. Source and target are referenced 
	by id.
	*/
	/// EXPORT_API void PluginCopyNonZeroTargetAllKeysAllFrames(int sourceAnimationId, int targetAnimationId);
	void PluginCopyNonZeroTargetAllKeysAllFrames(int sourceAnimationId, int targetAnimationId);
	/*
	Copy nonzero colors from the source animation to the target animation where 
	the target color is nonzero for all frames. Source and target are referenced 
	by name.
	*/
	/// EXPORT_API void PluginCopyNonZeroTargetAllKeysAllFramesName(const char* sourceAnimation, const char* targetAnimation);
	void PluginCopyNonZeroTargetAllKeysAllFramesName(String sourceAnimation, String targetAnimation);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginCopyNonZeroTargetAllKeysAllFramesNameD(const char* sourceAnimation, const char* targetAnimation);
	double PluginCopyNonZeroTargetAllKeysAllFramesNameD(String sourceAnimation, String targetAnimation);
	/*
	Copy nonzero colors from the source animation to the target animation where 
	the target color is nonzero for all frames. Source and target are referenced 
	by name.
	*/
	/// EXPORT_API void PluginCopyNonZeroTargetAllKeysAllFramesOffset(int sourceAnimationId, int targetAnimationId, int offset);
	void PluginCopyNonZeroTargetAllKeysAllFramesOffset(int sourceAnimationId, int targetAnimationId, int offset);
	/*
	Copy nonzero colors from the source animation to the target animation where 
	the target color is nonzero for all frames starting at the target offset 
	for the length of the source animation. Source and target animations are 
	referenced by name.
	*/
	/// EXPORT_API void PluginCopyNonZeroTargetAllKeysAllFramesOffsetName(const char* sourceAnimation, const char* targetAnimation, int offset);
	void PluginCopyNonZeroTargetAllKeysAllFramesOffsetName(String sourceAnimation, String targetAnimation, int offset);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginCopyNonZeroTargetAllKeysAllFramesOffsetNameD(const char* sourceAnimation, const char* targetAnimation, double offset);
	double PluginCopyNonZeroTargetAllKeysAllFramesOffsetNameD(String sourceAnimation, String targetAnimation, double offset);
	/*
	Copy nonzero colors from the source animation to the target animation where 
	the target color is nonzero for the specified frame. The source and target 
	are referenced by name.
	*/
	/// EXPORT_API void PluginCopyNonZeroTargetAllKeysName(const char* sourceAnimation, const char* targetAnimation, int frameId);
	void PluginCopyNonZeroTargetAllKeysName(String sourceAnimation, String targetAnimation, int frameId);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginCopyNonZeroTargetAllKeysNameD(const char* sourceAnimation, const char* targetAnimation, double frameId);
	double PluginCopyNonZeroTargetAllKeysNameD(String sourceAnimation, String targetAnimation, double frameId);
	/*
	Copy nonzero colors from the source animation to the target animation where 
	the target color is nonzero for the specified source frame and target offset 
	frame. The source and target are referenced by id.
	*/
	/// EXPORT_API void PluginCopyNonZeroTargetAllKeysOffset(int sourceAnimationId, int targetAnimationId, int frameId, int offset);
	void PluginCopyNonZeroTargetAllKeysOffset(int sourceAnimationId, int targetAnimationId, int frameId, int offset);
	/*
	Copy nonzero colors from the source animation to the target animation where 
	the target color is nonzero for the specified source frame and target offset 
	frame. The source and target are referenced by name.
	*/
	/// EXPORT_API void PluginCopyNonZeroTargetAllKeysOffsetName(const char* sourceAnimation, const char* targetAnimation, int frameId, int offset);
	void PluginCopyNonZeroTargetAllKeysOffsetName(String sourceAnimation, String targetAnimation, int frameId, int offset);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginCopyNonZeroTargetAllKeysOffsetNameD(const char* sourceAnimation, const char* targetAnimation, double frameId, double offset);
	double PluginCopyNonZeroTargetAllKeysOffsetNameD(String sourceAnimation, String targetAnimation, double frameId, double offset);
	/*
	Copy nonzero colors from the source animation to the target animation where 
	the target color is zero for all frames. Source and target are referenced 
	by id.
	*/
	/// EXPORT_API void PluginCopyNonZeroTargetZeroAllKeysAllFrames(int sourceAnimationId, int targetAnimationId);
	void PluginCopyNonZeroTargetZeroAllKeysAllFrames(int sourceAnimationId, int targetAnimationId);
	/*
	Copy nonzero colors from the source animation to the target animation where 
	the target color is zero for all frames. Source and target are referenced 
	by name.
	*/
	/// EXPORT_API void PluginCopyNonZeroTargetZeroAllKeysAllFramesName(const char* sourceAnimation, const char* targetAnimation);
	void PluginCopyNonZeroTargetZeroAllKeysAllFramesName(String sourceAnimation, String targetAnimation);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginCopyNonZeroTargetZeroAllKeysAllFramesNameD(const char* sourceAnimation, const char* targetAnimation);
	double PluginCopyNonZeroTargetZeroAllKeysAllFramesNameD(String sourceAnimation, String targetAnimation);
	/*
	Copy red channel to other channels for all frames. Intensity range is 0.0 
	to 1.0. Reference the animation by id.
	*/
	/// EXPORT_API void PluginCopyRedChannelAllFrames(int animationId, float greenIntensity, float blueIntensity);
	void PluginCopyRedChannelAllFrames(int animationId, float greenIntensity, float blueIntensity);
	/*
	Copy green channel to other channels for all frames. Intensity range is 
	0.0 to 1.0. Reference the animation by name.
	*/
	/// EXPORT_API void PluginCopyRedChannelAllFramesName(const char* path, float greenIntensity, float blueIntensity);
	void PluginCopyRedChannelAllFramesName(String path, float greenIntensity, float blueIntensity);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginCopyRedChannelAllFramesNameD(const char* path, double greenIntensity, double blueIntensity);
	double PluginCopyRedChannelAllFramesNameD(String path, double greenIntensity, double blueIntensity);
	/*
	Copy zero colors from source animation to target animation for all frames. 
	Source and target are referenced by id.
	*/
	/// EXPORT_API void PluginCopyZeroAllKeysAllFrames(int sourceAnimationId, int targetAnimationId);
	void PluginCopyZeroAllKeysAllFrames(int sourceAnimationId, int targetAnimationId);
	/*
	Copy zero colors from source animation to target animation for all frames. 
	Source and target are referenced by name.
	*/
	/// EXPORT_API void PluginCopyZeroAllKeysAllFramesName(const char* sourceAnimation, const char* targetAnimation);
	void PluginCopyZeroAllKeysAllFramesName(String sourceAnimation, String targetAnimation);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginCopyZeroAllKeysAllFramesNameD(const char* sourceAnimation, const char* targetAnimation);
	double PluginCopyZeroAllKeysAllFramesNameD(String sourceAnimation, String targetAnimation);
	/*
	Copy zero colors from source animation to target animation for all frames 
	starting at the target offset for the length of the source animation. Source 
	and target are referenced by id.
	*/
	/// EXPORT_API void PluginCopyZeroAllKeysAllFramesOffset(int sourceAnimationId, int targetAnimationId, int offset);
	void PluginCopyZeroAllKeysAllFramesOffset(int sourceAnimationId, int targetAnimationId, int offset);
	/*
	Copy zero colors from source animation to target animation for all frames 
	starting at the target offset for the length of the source animation. Source 
	and target are referenced by name.
	*/
	/// EXPORT_API void PluginCopyZeroAllKeysAllFramesOffsetName(const char* sourceAnimation, const char* targetAnimation, int offset);
	void PluginCopyZeroAllKeysAllFramesOffsetName(String sourceAnimation, String targetAnimation, int offset);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginCopyZeroAllKeysAllFramesOffsetNameD(const char* sourceAnimation, const char* targetAnimation, double offset);
	double PluginCopyZeroAllKeysAllFramesOffsetNameD(String sourceAnimation, String targetAnimation, double offset);
	/*
	Copy zero key color from source animation to target animation for the specified 
	frame. Source and target are referenced by id.
	*/
	/// EXPORT_API void PluginCopyZeroKeyColor(int sourceAnimationId, int targetAnimationId, int frameId, int rzkey);
	void PluginCopyZeroKeyColor(int sourceAnimationId, int targetAnimationId, int frameId, int rzkey);
	/*
	Copy zero key color from source animation to target animation for the specified 
	frame. Source and target are referenced by name.
	*/
	/// EXPORT_API void PluginCopyZeroKeyColorName(const char* sourceAnimation, const char* targetAnimation, int frameId, int rzkey);
	void PluginCopyZeroKeyColorName(String sourceAnimation, String targetAnimation, int frameId, int rzkey);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginCopyZeroKeyColorNameD(const char* sourceAnimation, const char* targetAnimation, double frameId, double rzkey);
	double PluginCopyZeroKeyColorNameD(String sourceAnimation, String targetAnimation, double frameId, double rzkey);
	/*
	Copy nonzero color from source animation to target animation where target 
	is zero for all frames. Source and target are referenced by id.
	*/
	/// EXPORT_API void PluginCopyZeroTargetAllKeysAllFrames(int sourceAnimationId, int targetAnimationId);
	void PluginCopyZeroTargetAllKeysAllFrames(int sourceAnimationId, int targetAnimationId);
	/*
	Copy nonzero color from source animation to target animation where target 
	is zero for all frames. Source and target are referenced by name.
	*/
	/// EXPORT_API void PluginCopyZeroTargetAllKeysAllFramesName(const char* sourceAnimation, const char* targetAnimation);
	void PluginCopyZeroTargetAllKeysAllFramesName(String sourceAnimation, String targetAnimation);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginCopyZeroTargetAllKeysAllFramesNameD(const char* sourceAnimation, const char* targetAnimation);
	double PluginCopyZeroTargetAllKeysAllFramesNameD(String sourceAnimation, String targetAnimation);
	/*
	Direct access to low level API.
	*/
	/// EXPORT_API RZRESULT PluginCoreCreateChromaLinkEffect(ChromaSDK::ChromaLink::EFFECT_TYPE Effect, PRZPARAM pParam, RZEFFECTID* pEffectId);
	int PluginCoreCreateChromaLinkEffect(int Effect, Pointer pParam, Pointer pEffectId);
	/*
	Direct access to low level API.
	*/
	/// EXPORT_API RZRESULT PluginCoreCreateEffect(RZDEVICEID DeviceId, ChromaSDK::EFFECT_TYPE Effect, PRZPARAM pParam, RZEFFECTID* pEffectId);
	int PluginCoreCreateEffect(GUIDStruct DeviceId, int Effect, Pointer pParam, Pointer pEffectId);
	/*
	Direct access to low level API.
	*/
	/// EXPORT_API RZRESULT PluginCoreCreateHeadsetEffect(ChromaSDK::Headset::EFFECT_TYPE Effect, PRZPARAM pParam, RZEFFECTID* pEffectId);
	int PluginCoreCreateHeadsetEffect(int Effect, Pointer pParam, Pointer pEffectId);
	/*
	Direct access to low level API.
	*/
	/// EXPORT_API RZRESULT PluginCoreCreateKeyboardEffect(ChromaSDK::Keyboard::EFFECT_TYPE Effect, PRZPARAM pParam, RZEFFECTID* pEffectId);
	int PluginCoreCreateKeyboardEffect(int Effect, Pointer pParam, Pointer pEffectId);
	/*
	Direct access to low level API.
	*/
	/// EXPORT_API RZRESULT PluginCoreCreateKeypadEffect(ChromaSDK::Keypad::EFFECT_TYPE Effect, PRZPARAM pParam, RZEFFECTID* pEffectId);
	int PluginCoreCreateKeypadEffect(int Effect, Pointer pParam, Pointer pEffectId);
	/*
	Direct access to low level API.
	*/
	/// EXPORT_API RZRESULT PluginCoreCreateMouseEffect(ChromaSDK::Mouse::EFFECT_TYPE Effect, PRZPARAM pParam, RZEFFECTID* pEffectId);
	int PluginCoreCreateMouseEffect(int Effect, Pointer pParam, Pointer pEffectId);
	/*
	Direct access to low level API.
	*/
	/// EXPORT_API RZRESULT PluginCoreCreateMousepadEffect(ChromaSDK::Mousepad::EFFECT_TYPE Effect, PRZPARAM pParam, RZEFFECTID* pEffectId);
	int PluginCoreCreateMousepadEffect(int Effect, Pointer pParam, Pointer pEffectId);
	/*
	Direct access to low level API.
	*/
	/// EXPORT_API RZRESULT PluginCoreDeleteEffect(RZEFFECTID EffectId);
	int PluginCoreDeleteEffect(GUIDStruct EffectId);
	/*
	Direct access to low level API.
	*/
	/// EXPORT_API RZRESULT PluginCoreInit();
	int PluginCoreInit();
	/*
	Direct access to low level API.
	*/
	/// EXPORT_API RZRESULT PluginCoreInitSDK(ChromaSDK::APPINFOTYPE* AppInfo);
	int PluginCoreInitSDK(JAppInfoType appInfo);
	/*
	Direct access to low level API.
	*/
	/// EXPORT_API RZRESULT PluginCoreQueryDevice(RZDEVICEID DeviceId, ChromaSDK::DEVICE_INFO_TYPE& DeviceInfo);
	int PluginCoreQueryDevice(GUIDStruct DeviceId, DeviceInfos.DeviceInfosStruct DeviceInfo);
	/*
	Direct access to low level API.
	*/
	/// EXPORT_API RZRESULT PluginCoreSetEffect(RZEFFECTID EffectId);
	int PluginCoreSetEffect(GUIDStruct EffectId);
	/*
	Direct access to low level API.
	*/
	/// EXPORT_API RZRESULT PluginCoreUnInit();
	int PluginCoreUnInit();
	/*
	Creates a `Chroma` animation at the given path. The `deviceType` parameter 
	uses `EChromaSDKDeviceTypeEnum` as an integer. The `device` parameter uses 
	`EChromaSDKDevice1DEnum` or `EChromaSDKDevice2DEnum` as an integer, respective 
	to the `deviceType`. Returns the animation id upon success. Returns -1 
	upon failure. Saves a `Chroma` animation file with the `.chroma` extension 
	at the given path. Returns the animation id upon success. Returns -1 upon 
	failure.
	*/
	/// EXPORT_API int PluginCreateAnimation(const char* path, int deviceType, int device);
	int PluginCreateAnimation(String path, int deviceType, int device);
	/*
	Creates a `Chroma` animation in memory without creating a file. The `deviceType` 
	parameter uses `EChromaSDKDeviceTypeEnum` as an integer. The `device` parameter 
	uses `EChromaSDKDevice1DEnum` or `EChromaSDKDevice2DEnum` as an integer, 
	respective to the `deviceType`. Returns the animation id upon success. 
	Returns -1 upon failure. Returns the animation id upon success. Returns 
	-1 upon failure.
	*/
	/// EXPORT_API int PluginCreateAnimationInMemory(int deviceType, int device);
	int PluginCreateAnimationInMemory(int deviceType, int device);
	/*
	Create a device specific effect.
	*/
	/// EXPORT_API RZRESULT PluginCreateEffect(RZDEVICEID deviceId, ChromaSDK::EFFECT_TYPE effect, int* colors, int size, ChromaSDK::FChromaSDKGuid* effectId);
	int PluginCreateEffect(GUIDStruct deviceId, int effect, Pointer colors, int size, GUIDStruct effectId);
	/*
	Delete an effect given the effect id.
	*/
	/// EXPORT_API RZRESULT PluginDeleteEffect(const ChromaSDK::FChromaSDKGuid& effectId);
	int PluginDeleteEffect(GUIDStruct effectId);
	/*
	Duplicate the first animation frame so that the animation length matches 
	the frame count. Animation is referenced by id.
	*/
	/// EXPORT_API void PluginDuplicateFirstFrame(int animationId, int frameCount);
	void PluginDuplicateFirstFrame(int animationId, int frameCount);
	/*
	Duplicate the first animation frame so that the animation length matches 
	the frame count. Animation is referenced by name.
	*/
	/// EXPORT_API void PluginDuplicateFirstFrameName(const char* path, int frameCount);
	void PluginDuplicateFirstFrameName(String path, int frameCount);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginDuplicateFirstFrameNameD(const char* path, double frameCount);
	double PluginDuplicateFirstFrameNameD(String path, double frameCount);
	/*
	Duplicate all the frames of the animation to double the animation length. 
	Frame 1 becomes frame 1 and 2. Frame 2 becomes frame 3 and 4. And so on. 
	The animation is referenced by id.
	*/
	/// EXPORT_API void PluginDuplicateFrames(int animationId);
	void PluginDuplicateFrames(int animationId);
	/*
	Duplicate all the frames of the animation to double the animation length. 
	Frame 1 becomes frame 1 and 2. Frame 2 becomes frame 3 and 4. And so on. 
	The animation is referenced by name.
	*/
	/// EXPORT_API void PluginDuplicateFramesName(const char* path);
	void PluginDuplicateFramesName(String path);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginDuplicateFramesNameD(const char* path);
	double PluginDuplicateFramesNameD(String path);
	/*
	Duplicate all the animation frames in reverse so that the animation plays 
	forwards and backwards. Animation is referenced by id.
	*/
	/// EXPORT_API void PluginDuplicateMirrorFrames(int animationId);
	void PluginDuplicateMirrorFrames(int animationId);
	/*
	Duplicate all the animation frames in reverse so that the animation plays 
	forwards and backwards. Animation is referenced by name.
	*/
	/// EXPORT_API void PluginDuplicateMirrorFramesName(const char* path);
	void PluginDuplicateMirrorFramesName(String path);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginDuplicateMirrorFramesNameD(const char* path);
	double PluginDuplicateMirrorFramesNameD(String path);
	/*
	Fade the animation to black starting at the fade frame index to the end 
	of the animation. Animation is referenced by id.
	*/
	/// EXPORT_API void PluginFadeEndFrames(int animationId, int fade);
	void PluginFadeEndFrames(int animationId, int fade);
	/*
	Fade the animation to black starting at the fade frame index to the end 
	of the animation. Animation is referenced by name.
	*/
	/// EXPORT_API void PluginFadeEndFramesName(const char* path, int fade);
	void PluginFadeEndFramesName(String path, int fade);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginFadeEndFramesNameD(const char* path, double fade);
	double PluginFadeEndFramesNameD(String path, double fade);
	/*
	Fade the animation from black to full color starting at 0 to the fade frame 
	index. Animation is referenced by id.
	*/
	/// EXPORT_API void PluginFadeStartFrames(int animationId, int fade);
	void PluginFadeStartFrames(int animationId, int fade);
	/*
	Fade the animation from black to full color starting at 0 to the fade frame 
	index. Animation is referenced by name.
	*/
	/// EXPORT_API void PluginFadeStartFramesName(const char* path, int fade);
	void PluginFadeStartFramesName(String path, int fade);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginFadeStartFramesNameD(const char* path, double fade);
	double PluginFadeStartFramesNameD(String path, double fade);
	/*
	Set the RGB value for all colors in the specified frame. Animation is referenced 
	by id.
	*/
	/// EXPORT_API void PluginFillColor(int animationId, int frameId, int color);
	void PluginFillColor(int animationId, int frameId, int color);
	/*
	Set the RGB value for all colors for all frames. Animation is referenced 
	by id.
	*/
	/// EXPORT_API void PluginFillColorAllFrames(int animationId, int color);
	void PluginFillColorAllFrames(int animationId, int color);
	/*
	Set the RGB value for all colors for all frames. Animation is referenced 
	by name.
	*/
	/// EXPORT_API void PluginFillColorAllFramesName(const char* path, int color);
	void PluginFillColorAllFramesName(String path, int color);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginFillColorAllFramesNameD(const char* path, double color);
	double PluginFillColorAllFramesNameD(String path, double color);
	/*
	Set the RGB value for all colors for all frames. Use the range of 0 to 255 
	for red, green, and blue parameters. Animation is referenced by id.
	*/
	/// EXPORT_API void PluginFillColorAllFramesRGB(int animationId, int red, int green, int blue);
	void PluginFillColorAllFramesRGB(int animationId, int red, int green, int blue);
	/*
	Set the RGB value for all colors for all frames. Use the range of 0 to 255 
	for red, green, and blue parameters. Animation is referenced by name.
	*/
	/// EXPORT_API void PluginFillColorAllFramesRGBName(const char* path, int red, int green, int blue);
	void PluginFillColorAllFramesRGBName(String path, int red, int green, int blue);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginFillColorAllFramesRGBNameD(const char* path, double red, double green, double blue);
	double PluginFillColorAllFramesRGBNameD(String path, double red, double green, double blue);
	/*
	Set the RGB value for all colors in the specified frame. Animation is referenced 
	by name.
	*/
	/// EXPORT_API void PluginFillColorName(const char* path, int frameId, int color);
	void PluginFillColorName(String path, int frameId, int color);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginFillColorNameD(const char* path, double frameId, double color);
	double PluginFillColorNameD(String path, double frameId, double color);
	/*
	Set the RGB value for all colors in the specified frame. Animation is referenced 
	by id.
	*/
	/// EXPORT_API void PluginFillColorRGB(int animationId, int frameId, int red, int green, int blue);
	void PluginFillColorRGB(int animationId, int frameId, int red, int green, int blue);
	/*
	Set the RGB value for all colors in the specified frame. Animation is referenced 
	by name.
	*/
	/// EXPORT_API void PluginFillColorRGBName(const char* path, int frameId, int red, int green, int blue);
	void PluginFillColorRGBName(String path, int frameId, int red, int green, int blue);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginFillColorRGBNameD(const char* path, double frameId, double red, double green, double blue);
	double PluginFillColorRGBNameD(String path, double frameId, double red, double green, double blue);
	/*
	This method will only update colors in the animation that are not already 
	set to black. Set the RGB value for a subset of colors in the specified 
	frame. Animation is referenced by id.
	*/
	/// EXPORT_API void PluginFillNonZeroColor(int animationId, int frameId, int color);
	void PluginFillNonZeroColor(int animationId, int frameId, int color);
	/*
	This method will only update colors in the animation that are not already 
	set to black. Set the RGB value for a subset of colors for all frames. 
	Animation is referenced by id.
	*/
	/// EXPORT_API void PluginFillNonZeroColorAllFrames(int animationId, int color);
	void PluginFillNonZeroColorAllFrames(int animationId, int color);
	/*
	This method will only update colors in the animation that are not already 
	set to black. Set the RGB value for a subset of colors for all frames. 
	Animation is referenced by name.
	*/
	/// EXPORT_API void PluginFillNonZeroColorAllFramesName(const char* path, int color);
	void PluginFillNonZeroColorAllFramesName(String path, int color);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginFillNonZeroColorAllFramesNameD(const char* path, double color);
	double PluginFillNonZeroColorAllFramesNameD(String path, double color);
	/*
	This method will only update colors in the animation that are not already 
	set to black. Set the RGB value for a subset of colors for all frames. 
	Use the range of 0 to 255 for red, green, and blue parameters. Animation 
	is referenced by id.
	*/
	/// EXPORT_API void PluginFillNonZeroColorAllFramesRGB(int animationId, int red, int green, int blue);
	void PluginFillNonZeroColorAllFramesRGB(int animationId, int red, int green, int blue);
	/*
	This method will only update colors in the animation that are not already 
	set to black. Set the RGB value for a subset of colors for all frames. 
	Use the range of 0 to 255 for red, green, and blue parameters. Animation 
	is referenced by name.
	*/
	/// EXPORT_API void PluginFillNonZeroColorAllFramesRGBName(const char* path, int red, int green, int blue);
	void PluginFillNonZeroColorAllFramesRGBName(String path, int red, int green, int blue);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginFillNonZeroColorAllFramesRGBNameD(const char* path, double red, double green, double blue);
	double PluginFillNonZeroColorAllFramesRGBNameD(String path, double red, double green, double blue);
	/*
	This method will only update colors in the animation that are not already 
	set to black. Set the RGB value for a subset of colors in the specified 
	frame. Animation is referenced by name.
	*/
	/// EXPORT_API void PluginFillNonZeroColorName(const char* path, int frameId, int color);
	void PluginFillNonZeroColorName(String path, int frameId, int color);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginFillNonZeroColorNameD(const char* path, double frameId, double color);
	double PluginFillNonZeroColorNameD(String path, double frameId, double color);
	/*
	This method will only update colors in the animation that are not already 
	set to black. Set the RGB value for a subset of colors in the specified 
	frame. Use the range of 0 to 255 for red, green, and blue parameters. Animation 
	is referenced by id.
	*/
	/// EXPORT_API void PluginFillNonZeroColorRGB(int animationId, int frameId, int red, int green, int blue);
	void PluginFillNonZeroColorRGB(int animationId, int frameId, int red, int green, int blue);
	/*
	This method will only update colors in the animation that are not already 
	set to black. Set the RGB value for a subset of colors in the specified 
	frame. Use the range of 0 to 255 for red, green, and blue parameters. Animation 
	is referenced by name.
	*/
	/// EXPORT_API void PluginFillNonZeroColorRGBName(const char* path, int frameId, int red, int green, int blue);
	void PluginFillNonZeroColorRGBName(String path, int frameId, int red, int green, int blue);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginFillNonZeroColorRGBNameD(const char* path, double frameId, double red, double green, double blue);
	double PluginFillNonZeroColorRGBNameD(String path, double frameId, double red, double green, double blue);
	/*
	Fill the frame with random RGB values for the given frame. Animation is 
	referenced by id.
	*/
	/// EXPORT_API void PluginFillRandomColors(int animationId, int frameId);
	void PluginFillRandomColors(int animationId, int frameId);
	/*
	Fill the frame with random RGB values for all frames. Animation is referenced 
	by id.
	*/
	/// EXPORT_API void PluginFillRandomColorsAllFrames(int animationId);
	void PluginFillRandomColorsAllFrames(int animationId);
	/*
	Fill the frame with random RGB values for all frames. Animation is referenced 
	by name.
	*/
	/// EXPORT_API void PluginFillRandomColorsAllFramesName(const char* path);
	void PluginFillRandomColorsAllFramesName(String path);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginFillRandomColorsAllFramesNameD(const char* path);
	double PluginFillRandomColorsAllFramesNameD(String path);
	/*
	Fill the frame with random black and white values for the specified frame. 
	Animation is referenced by id.
	*/
	/// EXPORT_API void PluginFillRandomColorsBlackAndWhite(int animationId, int frameId);
	void PluginFillRandomColorsBlackAndWhite(int animationId, int frameId);
	/*
	Fill the frame with random black and white values for all frames. Animation 
	is referenced by id.
	*/
	/// EXPORT_API void PluginFillRandomColorsBlackAndWhiteAllFrames(int animationId);
	void PluginFillRandomColorsBlackAndWhiteAllFrames(int animationId);
	/*
	Fill the frame with random black and white values for all frames. Animation 
	is referenced by name.
	*/
	/// EXPORT_API void PluginFillRandomColorsBlackAndWhiteAllFramesName(const char* path);
	void PluginFillRandomColorsBlackAndWhiteAllFramesName(String path);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginFillRandomColorsBlackAndWhiteAllFramesNameD(const char* path);
	double PluginFillRandomColorsBlackAndWhiteAllFramesNameD(String path);
	/*
	Fill the frame with random black and white values for the specified frame. 
	Animation is referenced by name.
	*/
	/// EXPORT_API void PluginFillRandomColorsBlackAndWhiteName(const char* path, int frameId);
	void PluginFillRandomColorsBlackAndWhiteName(String path, int frameId);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginFillRandomColorsBlackAndWhiteNameD(const char* path, double frameId);
	double PluginFillRandomColorsBlackAndWhiteNameD(String path, double frameId);
	/*
	Fill the frame with random RGB values for the given frame. Animation is 
	referenced by name.
	*/
	/// EXPORT_API void PluginFillRandomColorsName(const char* path, int frameId);
	void PluginFillRandomColorsName(String path, int frameId);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginFillRandomColorsNameD(const char* path, double frameId);
	double PluginFillRandomColorsNameD(String path, double frameId);
	/*
	Fill the specified frame with RGB color where the animation color is less 
	than the RGB threshold. Animation is referenced by id.
	*/
	/// EXPORT_API void PluginFillThresholdColors(int animationId, int frameId, int threshold, int color);
	void PluginFillThresholdColors(int animationId, int frameId, int threshold, int color);
	/*
	Fill all frames with RGB color where the animation color is less than the 
	RGB threshold. Animation is referenced by id.
	*/
	/// EXPORT_API void PluginFillThresholdColorsAllFrames(int animationId, int threshold, int color);
	void PluginFillThresholdColorsAllFrames(int animationId, int threshold, int color);
	/*
	Fill all frames with RGB color where the animation color is less than the 
	RGB threshold. Animation is referenced by name.
	*/
	/// EXPORT_API void PluginFillThresholdColorsAllFramesName(const char* path, int threshold, int color);
	void PluginFillThresholdColorsAllFramesName(String path, int threshold, int color);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginFillThresholdColorsAllFramesNameD(const char* path, double threshold, double color);
	double PluginFillThresholdColorsAllFramesNameD(String path, double threshold, double color);
	/*
	Fill all frames with RGB color where the animation color is less than the 
	threshold. Animation is referenced by id.
	*/
	/// EXPORT_API void PluginFillThresholdColorsAllFramesRGB(int animationId, int threshold, int red, int green, int blue);
	void PluginFillThresholdColorsAllFramesRGB(int animationId, int threshold, int red, int green, int blue);
	/*
	Fill all frames with RGB color where the animation color is less than the 
	threshold. Animation is referenced by name.
	*/
	/// EXPORT_API void PluginFillThresholdColorsAllFramesRGBName(const char* path, int threshold, int red, int green, int blue);
	void PluginFillThresholdColorsAllFramesRGBName(String path, int threshold, int red, int green, int blue);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginFillThresholdColorsAllFramesRGBNameD(const char* path, double threshold, double red, double green, double blue);
	double PluginFillThresholdColorsAllFramesRGBNameD(String path, double threshold, double red, double green, double blue);
	/*
	Fill all frames with the min RGB color where the animation color is less 
	than the min threshold AND with the max RGB color where the animation is 
	more than the max threshold. Animation is referenced by id.
	*/
	/// EXPORT_API void PluginFillThresholdColorsMinMaxAllFramesRGB(int animationId, int minThreshold, int minRed, int minGreen, int minBlue, int maxThreshold, int maxRed, int maxGreen, int maxBlue);
	void PluginFillThresholdColorsMinMaxAllFramesRGB(int animationId, int minThreshold, int minRed, int minGreen, int minBlue, int maxThreshold, int maxRed, int maxGreen, int maxBlue);
	/*
	Fill all frames with the min RGB color where the animation color is less 
	than the min threshold AND with the max RGB color where the animation is 
	more than the max threshold. Animation is referenced by name.
	*/
	/// EXPORT_API void PluginFillThresholdColorsMinMaxAllFramesRGBName(const char* path, int minThreshold, int minRed, int minGreen, int minBlue, int maxThreshold, int maxRed, int maxGreen, int maxBlue);
	void PluginFillThresholdColorsMinMaxAllFramesRGBName(String path, int minThreshold, int minRed, int minGreen, int minBlue, int maxThreshold, int maxRed, int maxGreen, int maxBlue);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginFillThresholdColorsMinMaxAllFramesRGBNameD(const char* path, double minThreshold, double minRed, double minGreen, double minBlue, double maxThreshold, double maxRed, double maxGreen, double maxBlue);
	double PluginFillThresholdColorsMinMaxAllFramesRGBNameD(String path, double minThreshold, double minRed, double minGreen, double minBlue, double maxThreshold, double maxRed, double maxGreen, double maxBlue);
	/*
	Fill the specified frame with the min RGB color where the animation color 
	is less than the min threshold AND with the max RGB color where the animation 
	is more than the max threshold. Animation is referenced by id.
	*/
	/// EXPORT_API void PluginFillThresholdColorsMinMaxRGB(int animationId, int frameId, int minThreshold, int minRed, int minGreen, int minBlue, int maxThreshold, int maxRed, int maxGreen, int maxBlue);
	void PluginFillThresholdColorsMinMaxRGB(int animationId, int frameId, int minThreshold, int minRed, int minGreen, int minBlue, int maxThreshold, int maxRed, int maxGreen, int maxBlue);
	/*
	Fill the specified frame with the min RGB color where the animation color 
	is less than the min threshold AND with the max RGB color where the animation 
	is more than the max threshold. Animation is referenced by name.
	*/
	/// EXPORT_API void PluginFillThresholdColorsMinMaxRGBName(const char* path, int frameId, int minThreshold, int minRed, int minGreen, int minBlue, int maxThreshold, int maxRed, int maxGreen, int maxBlue);
	void PluginFillThresholdColorsMinMaxRGBName(String path, int frameId, int minThreshold, int minRed, int minGreen, int minBlue, int maxThreshold, int maxRed, int maxGreen, int maxBlue);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginFillThresholdColorsMinMaxRGBNameD(const char* path, double frameId, double minThreshold, double minRed, double minGreen, double minBlue, double maxThreshold, double maxRed, double maxGreen, double maxBlue);
	double PluginFillThresholdColorsMinMaxRGBNameD(String path, double frameId, double minThreshold, double minRed, double minGreen, double minBlue, double maxThreshold, double maxRed, double maxGreen, double maxBlue);
	/*
	Fill the specified frame with RGB color where the animation color is less 
	than the RGB threshold. Animation is referenced by name.
	*/
	/// EXPORT_API void PluginFillThresholdColorsName(const char* path, int frameId, int threshold, int color);
	void PluginFillThresholdColorsName(String path, int frameId, int threshold, int color);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginFillThresholdColorsNameD(const char* path, double frameId, double threshold, double color);
	double PluginFillThresholdColorsNameD(String path, double frameId, double threshold, double color);
	/*
	Fill the specified frame with RGB color where the animation color is less 
	than the RGB threshold. Animation is referenced by id.
	*/
	/// EXPORT_API void PluginFillThresholdColorsRGB(int animationId, int frameId, int threshold, int red, int green, int blue);
	void PluginFillThresholdColorsRGB(int animationId, int frameId, int threshold, int red, int green, int blue);
	/*
	Fill the specified frame with RGB color where the animation color is less 
	than the RGB threshold. Animation is referenced by name.
	*/
	/// EXPORT_API void PluginFillThresholdColorsRGBName(const char* path, int frameId, int threshold, int red, int green, int blue);
	void PluginFillThresholdColorsRGBName(String path, int frameId, int threshold, int red, int green, int blue);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginFillThresholdColorsRGBNameD(const char* path, double frameId, double threshold, double red, double green, double blue);
	double PluginFillThresholdColorsRGBNameD(String path, double frameId, double threshold, double red, double green, double blue);
	/*
	Fill all frames with RGB color where the animation color is less than the 
	RGB threshold. Animation is referenced by id.
	*/
	/// EXPORT_API void PluginFillThresholdRGBColorsAllFramesRGB(int animationId, int redThreshold, int greenThreshold, int blueThreshold, int red, int green, int blue);
	void PluginFillThresholdRGBColorsAllFramesRGB(int animationId, int redThreshold, int greenThreshold, int blueThreshold, int red, int green, int blue);
	/*
	Fill all frames with RGB color where the animation color is less than the 
	RGB threshold. Animation is referenced by name.
	*/
	/// EXPORT_API void PluginFillThresholdRGBColorsAllFramesRGBName(const char* path, int redThreshold, int greenThreshold, int blueThreshold, int red, int green, int blue);
	void PluginFillThresholdRGBColorsAllFramesRGBName(String path, int redThreshold, int greenThreshold, int blueThreshold, int red, int green, int blue);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginFillThresholdRGBColorsAllFramesRGBNameD(const char* path, double redThreshold, double greenThreshold, double blueThreshold, double red, double green, double blue);
	double PluginFillThresholdRGBColorsAllFramesRGBNameD(String path, double redThreshold, double greenThreshold, double blueThreshold, double red, double green, double blue);
	/*
	Fill the specified frame with RGB color where the animation color is less 
	than the RGB threshold. Animation is referenced by id.
	*/
	/// EXPORT_API void PluginFillThresholdRGBColorsRGB(int animationId, int frameId, int redThreshold, int greenThreshold, int blueThreshold, int red, int green, int blue);
	void PluginFillThresholdRGBColorsRGB(int animationId, int frameId, int redThreshold, int greenThreshold, int blueThreshold, int red, int green, int blue);
	/*
	Fill the specified frame with RGB color where the animation color is less 
	than the RGB threshold. Animation is referenced by name.
	*/
	/// EXPORT_API void PluginFillThresholdRGBColorsRGBName(const char* path, int frameId, int redThreshold, int greenThreshold, int blueThreshold, int red, int green, int blue);
	void PluginFillThresholdRGBColorsRGBName(String path, int frameId, int redThreshold, int greenThreshold, int blueThreshold, int red, int green, int blue);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginFillThresholdRGBColorsRGBNameD(const char* path, double frameId, double redThreshold, double greenThreshold, double blueThreshold, double red, double green, double blue);
	double PluginFillThresholdRGBColorsRGBNameD(String path, double frameId, double redThreshold, double greenThreshold, double blueThreshold, double red, double green, double blue);
	/*
	Fill the specified frame with RGB color where the animation color is zero. 
	Animation is referenced by id.
	*/
	/// EXPORT_API void PluginFillZeroColor(int animationId, int frameId, int color);
	void PluginFillZeroColor(int animationId, int frameId, int color);
	/*
	Fill all frames with RGB color where the animation color is zero. Animation 
	is referenced by id.
	*/
	/// EXPORT_API void PluginFillZeroColorAllFrames(int animationId, int color);
	void PluginFillZeroColorAllFrames(int animationId, int color);
	/*
	Fill all frames with RGB color where the animation color is zero. Animation 
	is referenced by name.
	*/
	/// EXPORT_API void PluginFillZeroColorAllFramesName(const char* path, int color);
	void PluginFillZeroColorAllFramesName(String path, int color);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginFillZeroColorAllFramesNameD(const char* path, double color);
	double PluginFillZeroColorAllFramesNameD(String path, double color);
	/*
	Fill all frames with RGB color where the animation color is zero. Animation 
	is referenced by id.
	*/
	/// EXPORT_API void PluginFillZeroColorAllFramesRGB(int animationId, int red, int green, int blue);
	void PluginFillZeroColorAllFramesRGB(int animationId, int red, int green, int blue);
	/*
	Fill all frames with RGB color where the animation color is zero. Animation 
	is referenced by name.
	*/
	/// EXPORT_API void PluginFillZeroColorAllFramesRGBName(const char* path, int red, int green, int blue);
	void PluginFillZeroColorAllFramesRGBName(String path, int red, int green, int blue);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginFillZeroColorAllFramesRGBNameD(const char* path, double red, double green, double blue);
	double PluginFillZeroColorAllFramesRGBNameD(String path, double red, double green, double blue);
	/*
	Fill the specified frame with RGB color where the animation color is zero. 
	Animation is referenced by name.
	*/
	/// EXPORT_API void PluginFillZeroColorName(const char* path, int frameId, int color);
	void PluginFillZeroColorName(String path, int frameId, int color);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginFillZeroColorNameD(const char* path, double frameId, double color);
	double PluginFillZeroColorNameD(String path, double frameId, double color);
	/*
	Fill the specified frame with RGB color where the animation color is zero. 
	Animation is referenced by id.
	*/
	/// EXPORT_API void PluginFillZeroColorRGB(int animationId, int frameId, int red, int green, int blue);
	void PluginFillZeroColorRGB(int animationId, int frameId, int red, int green, int blue);
	/*
	Fill the specified frame with RGB color where the animation color is zero. 
	Animation is referenced by name.
	*/
	/// EXPORT_API void PluginFillZeroColorRGBName(const char* path, int frameId, int red, int green, int blue);
	void PluginFillZeroColorRGBName(String path, int frameId, int red, int green, int blue);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginFillZeroColorRGBNameD(const char* path, double frameId, double red, double green, double blue);
	double PluginFillZeroColorRGBNameD(String path, double frameId, double red, double green, double blue);
	/*
	Get the animation color for a frame given the `1D` `led`. The `led` should 
	be greater than or equal to 0 and less than the `MaxLeds`. Animation is 
	referenced by id.
	*/
	/// EXPORT_API int PluginGet1DColor(int animationId, int frameId, int led);
	int PluginGet1DColor(int animationId, int frameId, int led);
	/*
	Get the animation color for a frame given the `1D` `led`. The `led` should 
	be greater than or equal to 0 and less than the `MaxLeds`. Animation is 
	referenced by name.
	*/
	/// EXPORT_API int PluginGet1DColorName(const char* path, int frameId, int led);
	int PluginGet1DColorName(String path, int frameId, int led);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginGet1DColorNameD(const char* path, double frameId, double led);
	double PluginGet1DColorNameD(String path, double frameId, double led);
	/*
	Get the animation color for a frame given the `2D` `row` and `column`. The 
	`row` should be greater than or equal to 0 and less than the `MaxRow`. 
	The `column` should be greater than or equal to 0 and less than the `MaxColumn`. 
	Animation is referenced by id.
	*/
	/// EXPORT_API int PluginGet2DColor(int animationId, int frameId, int row, int column);
	int PluginGet2DColor(int animationId, int frameId, int row, int column);
	/*
	Get the animation color for a frame given the `2D` `row` and `column`. The 
	`row` should be greater than or equal to 0 and less than the `MaxRow`. 
	The `column` should be greater than or equal to 0 and less than the `MaxColumn`. 
	Animation is referenced by name.
	*/
	/// EXPORT_API int PluginGet2DColorName(const char* path, int frameId, int row, int column);
	int PluginGet2DColorName(String path, int frameId, int row, int column);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginGet2DColorNameD(const char* path, double frameId, double row, double column);
	double PluginGet2DColorNameD(String path, double frameId, double row, double column);
	/*
	Get the animation id for the named animation.
	*/
	/// EXPORT_API int PluginGetAnimation(const char* name);
	int PluginGetAnimation(String name);
	/*
	`PluginGetAnimationCount` will return the number of loaded animations.
	*/
	/// EXPORT_API int PluginGetAnimationCount();
	int PluginGetAnimationCount();
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginGetAnimationD(const char* name);
	double PluginGetAnimationD(String name);
	/*
	`PluginGetAnimationId` will return the `animationId` given the `index` of 
	the loaded animation. The `index` is zero-based and less than the number 
	returned by `PluginGetAnimationCount`. Use `PluginGetAnimationName` to 
	get the name of the animation.
	*/
	/// EXPORT_API int PluginGetAnimationId(int index);
	int PluginGetAnimationId(int index);
	/*
	`PluginGetAnimationName` takes an `animationId` and returns the name of 
	the animation of the `.chroma` animation file. If a name is not available 
	then an empty string will be returned.
	*/
	/// EXPORT_API const char* PluginGetAnimationName(int animationId);
	String PluginGetAnimationName(int animationId);
	/*
	Get the current frame of the animation referenced by id.
	*/
	/// EXPORT_API int PluginGetCurrentFrame(int animationId);
	int PluginGetCurrentFrame(int animationId);
	/*
	Get the current frame of the animation referenced by name.
	*/
	/// EXPORT_API int PluginGetCurrentFrameName(const char* path);
	int PluginGetCurrentFrameName(String path);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginGetCurrentFrameNameD(const char* path);
	double PluginGetCurrentFrameNameD(String path);
	/*
	Returns the `EChromaSDKDevice1DEnum` or `EChromaSDKDevice2DEnum` of a `Chroma` 
	animation respective to the `deviceType`, as an integer upon success. Returns 
	-1 upon failure.
	*/
	/// EXPORT_API int PluginGetDevice(int animationId);
	int PluginGetDevice(int animationId);
	/*
	Returns the `EChromaSDKDevice1DEnum` or `EChromaSDKDevice2DEnum` of a `Chroma` 
	animation respective to the `deviceType`, as an integer upon success. Returns 
	-1 upon failure.
	*/
	/// EXPORT_API int PluginGetDeviceName(const char* path);
	int PluginGetDeviceName(String path);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginGetDeviceNameD(const char* path);
	double PluginGetDeviceNameD(String path);
	/*
	Returns the `EChromaSDKDeviceTypeEnum` of a `Chroma` animation as an integer 
	upon success. Returns -1 upon failure.
	*/
	/// EXPORT_API int PluginGetDeviceType(int animationId);
	int PluginGetDeviceType(int animationId);
	/*
	Returns the `EChromaSDKDeviceTypeEnum` of a `Chroma` animation as an integer 
	upon success. Returns -1 upon failure.
	*/
	/// EXPORT_API int PluginGetDeviceTypeName(const char* path);
	int PluginGetDeviceTypeName(String path);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginGetDeviceTypeNameD(const char* path);
	double PluginGetDeviceTypeNameD(String path);
	/*
	Gets the frame colors and duration (in seconds) for a `Chroma` animation. 
	The `color` is expected to be an array of the expected dimensions for the 
	`deviceType/device`. The `length` parameter is the size of the `color` 
	array. For `EChromaSDKDevice1DEnum` the array size should be `MAX LEDS`. 
	For `EChromaSDKDevice2DEnum` the array size should be `MAX ROW` * `MAX 
	COLUMN`. Returns the animation id upon success. Returns -1 upon failure.
	*/
	/// EXPORT_API int PluginGetFrame(int animationId, int frameIndex, float* duration, int* colors, int length);
	int PluginGetFrame(int animationId, int frameIndex, Pointer duration, Pointer colors, int length);
	/*
	Returns the frame count of a `Chroma` animation upon success. Returns -1 
	upon failure.
	*/
	/// EXPORT_API int PluginGetFrameCount(int animationId);
	int PluginGetFrameCount(int animationId);
	/*
	Returns the frame count of a `Chroma` animation upon success. Returns -1 
	upon failure.
	*/
	/// EXPORT_API int PluginGetFrameCountName(const char* path);
	int PluginGetFrameCountName(String path);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginGetFrameCountNameD(const char* path);
	double PluginGetFrameCountNameD(String path);
	/*
	Get the color of an animation key for the given frame referenced by id.
	*/
	/// EXPORT_API int PluginGetKeyColor(int animationId, int frameId, int rzkey);
	int PluginGetKeyColor(int animationId, int frameId, int rzkey);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginGetKeyColorD(const char* path, double frameId, double rzkey);
	double PluginGetKeyColorD(String path, double frameId, double rzkey);
	/*
	Get the color of an animation key for the given frame referenced by name.
	*/
	/// EXPORT_API int PluginGetKeyColorName(const char* path, int frameId, int rzkey);
	int PluginGetKeyColorName(String path, int frameId, int rzkey);
	/*
	Returns `RZRESULT_SUCCESS` if the plugin has been initialized successfully. 
	Returns `RZRESULT_DLL_NOT_FOUND` if core Chroma library is not found. Returns 
	`RZRESULT_DLL_INVALID_SIGNATURE` if core Chroma library has an invalid 
	signature.
	*/
	/// EXPORT_API RZRESULT PluginGetLibraryLoadedState();
	int PluginGetLibraryLoadedState();
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginGetLibraryLoadedStateD();
	double PluginGetLibraryLoadedStateD();
	/*
	Returns the `MAX COLUMN` given the `EChromaSDKDevice2DEnum` device as an 
	integer upon success. Returns -1 upon failure.
	*/
	/// EXPORT_API int PluginGetMaxColumn(int device);
	int PluginGetMaxColumn(int device);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginGetMaxColumnD(double device);
	double PluginGetMaxColumnD(double device);
	/*
	Returns the MAX LEDS given the `EChromaSDKDevice1DEnum` device as an integer 
	upon success. Returns -1 upon failure.
	*/
	/// EXPORT_API int PluginGetMaxLeds(int device);
	int PluginGetMaxLeds(int device);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginGetMaxLedsD(double device);
	double PluginGetMaxLedsD(double device);
	/*
	Returns the `MAX ROW` given the `EChromaSDKDevice2DEnum` device as an integer 
	upon success. Returns -1 upon failure.
	*/
	/// EXPORT_API int PluginGetMaxRow(int device);
	int PluginGetMaxRow(int device);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginGetMaxRowD(double device);
	double PluginGetMaxRowD(double device);
	/*
	`PluginGetPlayingAnimationCount` will return the number of playing animations.
	*/
	/// EXPORT_API int PluginGetPlayingAnimationCount();
	int PluginGetPlayingAnimationCount();
	/*
	`PluginGetPlayingAnimationId` will return the `animationId` given the `index` 
	of the playing animation. The `index` is zero-based and less than the number 
	returned by `PluginGetPlayingAnimationCount`. Use `PluginGetAnimationName` 
	to get the name of the animation.
	*/
	/// EXPORT_API int PluginGetPlayingAnimationId(int index);
	int PluginGetPlayingAnimationId(int index);
	/*
	Get the RGB color given red, green, and blue.
	*/
	/// EXPORT_API int PluginGetRGB(int red, int green, int blue);
	int PluginGetRGB(int red, int green, int blue);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginGetRGBD(double red, double green, double blue);
	double PluginGetRGBD(double red, double green, double blue);
	/*
	Check if the animation has loop enabled referenced by id.
	*/
	/// EXPORT_API bool PluginHasAnimationLoop(int animationId);
	boolean PluginHasAnimationLoop(int animationId);
	/*
	Check if the animation has loop enabled referenced by name.
	*/
	/// EXPORT_API bool PluginHasAnimationLoopName(const char* path);
	boolean PluginHasAnimationLoopName(String path);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginHasAnimationLoopNameD(const char* path);
	double PluginHasAnimationLoopNameD(String path);
	/*
	Initialize the ChromaSDK. Zero indicates  success, otherwise failure. Many 
	API methods auto initialize the ChromaSDK if not already initialized.
	*/
	/// EXPORT_API RZRESULT PluginInit();
	int PluginInit();
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginInitD();
	double PluginInitD();
	/*
	Initialize the ChromaSDK. AppInfo populates the details in Synapse. Zero 
	indicates  success, otherwise failure. Many API methods auto initialize 
	the ChromaSDK if not already initialized.
	*/
	/// EXPORT_API RZRESULT PluginInitSDK(ChromaSDK::APPINFOTYPE* AppInfo);
	int PluginInitSDK(JAppInfoType AppInfo);
	/*
	Insert an animation delay by duplicating the frame by the delay number of 
	times. Animation is referenced by id.
	*/
	/// EXPORT_API void PluginInsertDelay(int animationId, int frameId, int delay);
	void PluginInsertDelay(int animationId, int frameId, int delay);
	/*
	Insert an animation delay by duplicating the frame by the delay number of 
	times. Animation is referenced by name.
	*/
	/// EXPORT_API void PluginInsertDelayName(const char* path, int frameId, int delay);
	void PluginInsertDelayName(String path, int frameId, int delay);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginInsertDelayNameD(const char* path, double frameId, double delay);
	double PluginInsertDelayNameD(String path, double frameId, double delay);
	/*
	Duplicate the source frame index at the target frame index. Animation is 
	referenced by id.
	*/
	/// EXPORT_API void PluginInsertFrame(int animationId, int sourceFrame, int targetFrame);
	void PluginInsertFrame(int animationId, int sourceFrame, int targetFrame);
	/*
	Duplicate the source frame index at the target frame index. Animation is 
	referenced by name.
	*/
	/// EXPORT_API void PluginInsertFrameName(const char* path, int sourceFrame, int targetFrame);
	void PluginInsertFrameName(String path, int sourceFrame, int targetFrame);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginInsertFrameNameD(const char* path, double sourceFrame, double targetFrame);
	double PluginInsertFrameNameD(String path, double sourceFrame, double targetFrame);
	/*
	Invert all the colors at the specified frame. Animation is referenced by 
	id.
	*/
	/// EXPORT_API void PluginInvertColors(int animationId, int frameId);
	void PluginInvertColors(int animationId, int frameId);
	/*
	Invert all the colors for all frames. Animation is referenced by id.
	*/
	/// EXPORT_API void PluginInvertColorsAllFrames(int animationId);
	void PluginInvertColorsAllFrames(int animationId);
	/*
	Invert all the colors for all frames. Animation is referenced by name.
	*/
	/// EXPORT_API void PluginInvertColorsAllFramesName(const char* path);
	void PluginInvertColorsAllFramesName(String path);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginInvertColorsAllFramesNameD(const char* path);
	double PluginInvertColorsAllFramesNameD(String path);
	/*
	Invert all the colors at the specified frame. Animation is referenced by 
	name.
	*/
	/// EXPORT_API void PluginInvertColorsName(const char* path, int frameId);
	void PluginInvertColorsName(String path, int frameId);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginInvertColorsNameD(const char* path, double frameId);
	double PluginInvertColorsNameD(String path, double frameId);
	/*
	Check if the animation is paused referenced by id.
	*/
	/// EXPORT_API bool PluginIsAnimationPaused(int animationId);
	boolean PluginIsAnimationPaused(int animationId);
	/*
	Check if the animation is paused referenced by name.
	*/
	/// EXPORT_API bool PluginIsAnimationPausedName(const char* path);
	boolean PluginIsAnimationPausedName(String path);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginIsAnimationPausedNameD(const char* path);
	double PluginIsAnimationPausedNameD(String path);
	/*
	The editor dialog is a non-blocking modal window, this method returns true 
	if the modal window is open, otherwise false.
	*/
	/// EXPORT_API bool PluginIsDialogOpen();
	boolean PluginIsDialogOpen();
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginIsDialogOpenD();
	double PluginIsDialogOpenD();
	/*
	Returns true if the plugin has been initialized. Returns false if the plugin 
	is uninitialized.
	*/
	/// EXPORT_API bool PluginIsInitialized();
	boolean PluginIsInitialized();
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginIsInitializedD();
	double PluginIsInitializedD();
	/*
	If the method can be invoked the method returns true.
	*/
	/// EXPORT_API bool PluginIsPlatformSupported();
	boolean PluginIsPlatformSupported();
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginIsPlatformSupportedD();
	double PluginIsPlatformSupportedD();
	/*
	`PluginIsPlayingName` automatically handles initializing the `ChromaSDK`. 
	The named `.chroma` animation file will be automatically opened. The method 
	will return whether the animation is playing or not. Animation is referenced 
	by id.
	*/
	/// EXPORT_API bool PluginIsPlaying(int animationId);
	boolean PluginIsPlaying(int animationId);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginIsPlayingD(double animationId);
	double PluginIsPlayingD(double animationId);
	/*
	`PluginIsPlayingName` automatically handles initializing the `ChromaSDK`. 
	The named `.chroma` animation file will be automatically opened. The method 
	will return whether the animation is playing or not. Animation is referenced 
	by name.
	*/
	/// EXPORT_API bool PluginIsPlayingName(const char* path);
	boolean PluginIsPlayingName(String path);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginIsPlayingNameD(const char* path);
	double PluginIsPlayingNameD(String path);
	/*
	`PluginIsPlayingType` automatically handles initializing the `ChromaSDK`. 
	If any animation is playing for the `deviceType` and `device` combination, 
	the method will return true, otherwise false.
	*/
	/// EXPORT_API bool PluginIsPlayingType(int deviceType, int device);
	boolean PluginIsPlayingType(int deviceType, int device);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginIsPlayingTypeD(double deviceType, double device);
	double PluginIsPlayingTypeD(double deviceType, double device);
	/*
	Do a lerp math operation on a float.
	*/
	/// EXPORT_API float PluginLerp(float start, float end, float amt);
	float PluginLerp(float start, float end, float amt);
	/*
	Lerp from one color to another given t in the range 0.0 to 1.0.
	*/
	/// EXPORT_API int PluginLerpColor(int from, int to, float t);
	int PluginLerpColor(int from, int to, float t);
	/*
	Loads `Chroma` effects so that the animation can be played immediately. 
	Returns the animation id upon success. Returns -1 upon failure.
	*/
	/// EXPORT_API int PluginLoadAnimation(int animationId);
	int PluginLoadAnimation(int animationId);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginLoadAnimationD(double animationId);
	double PluginLoadAnimationD(double animationId);
	/*
	Load the named animation.
	*/
	/// EXPORT_API void PluginLoadAnimationName(const char* path);
	void PluginLoadAnimationName(String path);
	/*
	Load a composite set of animations.
	*/
	/// EXPORT_API void PluginLoadComposite(const char* name);
	void PluginLoadComposite(String name);
	/*
	Make a blank animation for the length of the frame count. Frame duration 
	defaults to the duration. The frame color defaults to color. Animation 
	is referenced by id.
	*/
	/// EXPORT_API void PluginMakeBlankFrames(int animationId, int frameCount, float duration, int color);
	void PluginMakeBlankFrames(int animationId, int frameCount, float duration, int color);
	/*
	Make a blank animation for the length of the frame count. Frame duration 
	defaults to the duration. The frame color defaults to color. Animation 
	is referenced by name.
	*/
	/// EXPORT_API void PluginMakeBlankFramesName(const char* path, int frameCount, float duration, int color);
	void PluginMakeBlankFramesName(String path, int frameCount, float duration, int color);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginMakeBlankFramesNameD(const char* path, double frameCount, double duration, double color);
	double PluginMakeBlankFramesNameD(String path, double frameCount, double duration, double color);
	/*
	Make a blank animation for the length of the frame count. Frame duration 
	defaults to the duration. The frame color is random. Animation is referenced 
	by id.
	*/
	/// EXPORT_API void PluginMakeBlankFramesRandom(int animationId, int frameCount, float duration);
	void PluginMakeBlankFramesRandom(int animationId, int frameCount, float duration);
	/*
	Make a blank animation for the length of the frame count. Frame duration 
	defaults to the duration. The frame color is random black and white. Animation 
	is referenced by id.
	*/
	/// EXPORT_API void PluginMakeBlankFramesRandomBlackAndWhite(int animationId, int frameCount, float duration);
	void PluginMakeBlankFramesRandomBlackAndWhite(int animationId, int frameCount, float duration);
	/*
	Make a blank animation for the length of the frame count. Frame duration 
	defaults to the duration. The frame color is random black and white. Animation 
	is referenced by name.
	*/
	/// EXPORT_API void PluginMakeBlankFramesRandomBlackAndWhiteName(const char* path, int frameCount, float duration);
	void PluginMakeBlankFramesRandomBlackAndWhiteName(String path, int frameCount, float duration);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginMakeBlankFramesRandomBlackAndWhiteNameD(const char* path, double frameCount, double duration);
	double PluginMakeBlankFramesRandomBlackAndWhiteNameD(String path, double frameCount, double duration);
	/*
	Make a blank animation for the length of the frame count. Frame duration 
	defaults to the duration. The frame color is random. Animation is referenced 
	by name.
	*/
	/// EXPORT_API void PluginMakeBlankFramesRandomName(const char* path, int frameCount, float duration);
	void PluginMakeBlankFramesRandomName(String path, int frameCount, float duration);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginMakeBlankFramesRandomNameD(const char* path, double frameCount, double duration);
	double PluginMakeBlankFramesRandomNameD(String path, double frameCount, double duration);
	/*
	Make a blank animation for the length of the frame count. Frame duration 
	defaults to the duration. The frame color defaults to color. Animation 
	is referenced by id.
	*/
	/// EXPORT_API void PluginMakeBlankFramesRGB(int animationId, int frameCount, float duration, int red, int green, int blue);
	void PluginMakeBlankFramesRGB(int animationId, int frameCount, float duration, int red, int green, int blue);
	/*
	Make a blank animation for the length of the frame count. Frame duration 
	defaults to the duration. The frame color defaults to color. Animation 
	is referenced by name.
	*/
	/// EXPORT_API void PluginMakeBlankFramesRGBName(const char* path, int frameCount, float duration, int red, int green, int blue);
	void PluginMakeBlankFramesRGBName(String path, int frameCount, float duration, int red, int green, int blue);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginMakeBlankFramesRGBNameD(const char* path, double frameCount, double duration, double red, double green, double blue);
	double PluginMakeBlankFramesRGBNameD(String path, double frameCount, double duration, double red, double green, double blue);
	/*
	Flips the color grid horizontally for all `Chroma` animation frames. Returns 
	the animation id upon success. Returns -1 upon failure.
	*/
	/// EXPORT_API int PluginMirrorHorizontally(int animationId);
	int PluginMirrorHorizontally(int animationId);
	/*
	Flips the color grid vertically for all `Chroma` animation frames. This 
	method has no effect for `EChromaSDKDevice1DEnum` devices. Returns the 
	animation id upon success. Returns -1 upon failure.
	*/
	/// EXPORT_API int PluginMirrorVertically(int animationId);
	int PluginMirrorVertically(int animationId);
	/*
	Multiply the color intensity with the lerp result from color 1 to color 
	2 using the frame index divided by the frame count for the `t` parameter. 
	Animation is referenced in id.
	*/
	/// EXPORT_API void PluginMultiplyColorLerpAllFrames(int animationId, int color1, int color2);
	void PluginMultiplyColorLerpAllFrames(int animationId, int color1, int color2);
	/*
	Multiply the color intensity with the lerp result from color 1 to color 
	2 using the frame index divided by the frame count for the `t` parameter. 
	Animation is referenced in name.
	*/
	/// EXPORT_API void PluginMultiplyColorLerpAllFramesName(const char* path, int color1, int color2);
	void PluginMultiplyColorLerpAllFramesName(String path, int color1, int color2);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginMultiplyColorLerpAllFramesNameD(const char* path, double color1, double color2);
	double PluginMultiplyColorLerpAllFramesNameD(String path, double color1, double color2);
	/*
	Multiply all the colors in the frame by the intensity value. The valid the 
	intensity range is from 0.0 to 255.0. RGB components are multiplied equally. 
	An intensity of 0.5 would half the color value. Black colors in the frame 
	will not be affected by this method.
	*/
	/// EXPORT_API void PluginMultiplyIntensity(int animationId, int frameId, float intensity);
	void PluginMultiplyIntensity(int animationId, int frameId, float intensity);
	/*
	Multiply all the colors for all frames by the intensity value. The valid 
	the intensity range is from 0.0 to 255.0. RGB components are multiplied 
	equally. An intensity of 0.5 would half the color value. Black colors in 
	the frame will not be affected by this method.
	*/
	/// EXPORT_API void PluginMultiplyIntensityAllFrames(int animationId, float intensity);
	void PluginMultiplyIntensityAllFrames(int animationId, float intensity);
	/*
	Multiply all the colors for all frames by the intensity value. The valid 
	the intensity range is from 0.0 to 255.0. RGB components are multiplied 
	equally. An intensity of 0.5 would half the color value. Black colors in 
	the frame will not be affected by this method.
	*/
	/// EXPORT_API void PluginMultiplyIntensityAllFramesName(const char* path, float intensity);
	void PluginMultiplyIntensityAllFramesName(String path, float intensity);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginMultiplyIntensityAllFramesNameD(const char* path, double intensity);
	double PluginMultiplyIntensityAllFramesNameD(String path, double intensity);
	/*
	Multiply all frames by the RBG color intensity. Animation is referenced 
	by id.
	*/
	/// EXPORT_API void PluginMultiplyIntensityAllFramesRGB(int animationId, int red, int green, int blue);
	void PluginMultiplyIntensityAllFramesRGB(int animationId, int red, int green, int blue);
	/*
	Multiply all frames by the RBG color intensity. Animation is referenced 
	by name.
	*/
	/// EXPORT_API void PluginMultiplyIntensityAllFramesRGBName(const char* path, int red, int green, int blue);
	void PluginMultiplyIntensityAllFramesRGBName(String path, int red, int green, int blue);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginMultiplyIntensityAllFramesRGBNameD(const char* path, double red, double green, double blue);
	double PluginMultiplyIntensityAllFramesRGBNameD(String path, double red, double green, double blue);
	/*
	Multiply the specific frame by the RBG color intensity. Animation is referenced 
	by id.
	*/
	/// EXPORT_API void PluginMultiplyIntensityColor(int animationId, int frameId, int color);
	void PluginMultiplyIntensityColor(int animationId, int frameId, int color);
	/*
	Multiply all frames by the RBG color intensity. Animation is referenced 
	by id.
	*/
	/// EXPORT_API void PluginMultiplyIntensityColorAllFrames(int animationId, int color);
	void PluginMultiplyIntensityColorAllFrames(int animationId, int color);
	/*
	Multiply all frames by the RBG color intensity. Animation is referenced 
	by name.
	*/
	/// EXPORT_API void PluginMultiplyIntensityColorAllFramesName(const char* path, int color);
	void PluginMultiplyIntensityColorAllFramesName(String path, int color);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginMultiplyIntensityColorAllFramesNameD(const char* path, double color);
	double PluginMultiplyIntensityColorAllFramesNameD(String path, double color);
	/*
	Multiply the specific frame by the RBG color intensity. Animation is referenced 
	by name.
	*/
	/// EXPORT_API void PluginMultiplyIntensityColorName(const char* path, int frameId, int color);
	void PluginMultiplyIntensityColorName(String path, int frameId, int color);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginMultiplyIntensityColorNameD(const char* path, double frameId, double color);
	double PluginMultiplyIntensityColorNameD(String path, double frameId, double color);
	/*
	Multiply all the colors in the frame by the intensity value. The valid the 
	intensity range is from 0.0 to 255.0. RGB components are multiplied equally. 
	An intensity of 0.5 would half the color value. Black colors in the frame 
	will not be affected by this method.
	*/
	/// EXPORT_API void PluginMultiplyIntensityName(const char* path, int frameId, float intensity);
	void PluginMultiplyIntensityName(String path, int frameId, float intensity);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginMultiplyIntensityNameD(const char* path, double frameId, double intensity);
	double PluginMultiplyIntensityNameD(String path, double frameId, double intensity);
	/*
	Multiply the specific frame by the RBG color intensity. Animation is referenced 
	by id.
	*/
	/// EXPORT_API void PluginMultiplyIntensityRGB(int animationId, int frameId, int red, int green, int blue);
	void PluginMultiplyIntensityRGB(int animationId, int frameId, int red, int green, int blue);
	/*
	Multiply the specific frame by the RBG color intensity. Animation is referenced 
	by name.
	*/
	/// EXPORT_API void PluginMultiplyIntensityRGBName(const char* path, int frameId, int red, int green, int blue);
	void PluginMultiplyIntensityRGBName(String path, int frameId, int red, int green, int blue);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginMultiplyIntensityRGBNameD(const char* path, double frameId, double red, double green, double blue);
	double PluginMultiplyIntensityRGBNameD(String path, double frameId, double red, double green, double blue);
	/*
	Multiply the specific frame by the color lerp result between color 1 and 
	2 using the frame color value as the `t` value. Animation is referenced 
	by id.
	*/
	/// EXPORT_API void PluginMultiplyNonZeroTargetColorLerp(int animationId, int frameId, int color1, int color2);
	void PluginMultiplyNonZeroTargetColorLerp(int animationId, int frameId, int color1, int color2);
	/*
	Multiply all frames by the color lerp result between color 1 and 2 using 
	the frame color value as the `t` value. Animation is referenced by id.
	*/
	/// EXPORT_API void PluginMultiplyNonZeroTargetColorLerpAllFrames(int animationId, int color1, int color2);
	void PluginMultiplyNonZeroTargetColorLerpAllFrames(int animationId, int color1, int color2);
	/*
	Multiply all frames by the color lerp result between color 1 and 2 using 
	the frame color value as the `t` value. Animation is referenced by name.
	*/
	/// EXPORT_API void PluginMultiplyNonZeroTargetColorLerpAllFramesName(const char* path, int color1, int color2);
	void PluginMultiplyNonZeroTargetColorLerpAllFramesName(String path, int color1, int color2);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginMultiplyNonZeroTargetColorLerpAllFramesNameD(const char* path, double color1, double color2);
	double PluginMultiplyNonZeroTargetColorLerpAllFramesNameD(String path, double color1, double color2);
	/*
	Multiply the specific frame by the color lerp result between RGB 1 and 2 
	using the frame color value as the `t` value. Animation is referenced by 
	id.
	*/
	/// EXPORT_API void PluginMultiplyNonZeroTargetColorLerpAllFramesRGB(int animationId, int red1, int green1, int blue1, int red2, int green2, int blue2);
	void PluginMultiplyNonZeroTargetColorLerpAllFramesRGB(int animationId, int red1, int green1, int blue1, int red2, int green2, int blue2);
	/*
	Multiply the specific frame by the color lerp result between RGB 1 and 2 
	using the frame color value as the `t` value. Animation is referenced by 
	name.
	*/
	/// EXPORT_API void PluginMultiplyNonZeroTargetColorLerpAllFramesRGBName(const char* path, int red1, int green1, int blue1, int red2, int green2, int blue2);
	void PluginMultiplyNonZeroTargetColorLerpAllFramesRGBName(String path, int red1, int green1, int blue1, int red2, int green2, int blue2);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginMultiplyNonZeroTargetColorLerpAllFramesRGBNameD(const char* path, double red1, double green1, double blue1, double red2, double green2, double blue2);
	double PluginMultiplyNonZeroTargetColorLerpAllFramesRGBNameD(String path, double red1, double green1, double blue1, double red2, double green2, double blue2);
	/*
	Multiply the specific frame by the color lerp result between color 1 and 
	2 using the frame color value as the `t` value. Animation is referenced 
	by id.
	*/
	/// EXPORT_API void PluginMultiplyTargetColorLerp(int animationId, int frameId, int color1, int color2);
	void PluginMultiplyTargetColorLerp(int animationId, int frameId, int color1, int color2);
	/*
	Multiply all frames by the color lerp result between color 1 and 2 using 
	the frame color value as the `t` value. Animation is referenced by id.
	*/
	/// EXPORT_API void PluginMultiplyTargetColorLerpAllFrames(int animationId, int color1, int color2);
	void PluginMultiplyTargetColorLerpAllFrames(int animationId, int color1, int color2);
	/*
	Multiply all frames by the color lerp result between color 1 and 2 using 
	the frame color value as the `t` value. Animation is referenced by name.
	*/
	/// EXPORT_API void PluginMultiplyTargetColorLerpAllFramesName(const char* path, int color1, int color2);
	void PluginMultiplyTargetColorLerpAllFramesName(String path, int color1, int color2);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginMultiplyTargetColorLerpAllFramesNameD(const char* path, double color1, double color2);
	double PluginMultiplyTargetColorLerpAllFramesNameD(String path, double color1, double color2);
	/*
	Multiply all frames by the color lerp result between RGB 1 and 2 using the 
	frame color value as the `t` value. Animation is referenced by id.
	*/
	/// EXPORT_API void PluginMultiplyTargetColorLerpAllFramesRGB(int animationId, int red1, int green1, int blue1, int red2, int green2, int blue2);
	void PluginMultiplyTargetColorLerpAllFramesRGB(int animationId, int red1, int green1, int blue1, int red2, int green2, int blue2);
	/*
	Multiply all frames by the color lerp result between RGB 1 and 2 using the 
	frame color value as the `t` value. Animation is referenced by name.
	*/
	/// EXPORT_API void PluginMultiplyTargetColorLerpAllFramesRGBName(const char* path, int red1, int green1, int blue1, int red2, int green2, int blue2);
	void PluginMultiplyTargetColorLerpAllFramesRGBName(String path, int red1, int green1, int blue1, int red2, int green2, int blue2);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginMultiplyTargetColorLerpAllFramesRGBNameD(const char* path, double red1, double green1, double blue1, double red2, double green2, double blue2);
	double PluginMultiplyTargetColorLerpAllFramesRGBNameD(String path, double red1, double green1, double blue1, double red2, double green2, double blue2);
	/*
	Offset all colors in the frame using the RGB offset. Use the range of -255 
	to 255 for red, green, and blue parameters. Negative values remove color. 
	Positive values add color.
	*/
	/// EXPORT_API void PluginOffsetColors(int animationId, int frameId, int red, int green, int blue);
	void PluginOffsetColors(int animationId, int frameId, int red, int green, int blue);
	/*
	Offset all colors for all frames using the RGB offset. Use the range of 
	-255 to 255 for red, green, and blue parameters. Negative values remove 
	color. Positive values add color.
	*/
	/// EXPORT_API void PluginOffsetColorsAllFrames(int animationId, int red, int green, int blue);
	void PluginOffsetColorsAllFrames(int animationId, int red, int green, int blue);
	/*
	Offset all colors for all frames using the RGB offset. Use the range of 
	-255 to 255 for red, green, and blue parameters. Negative values remove 
	color. Positive values add color.
	*/
	/// EXPORT_API void PluginOffsetColorsAllFramesName(const char* path, int red, int green, int blue);
	void PluginOffsetColorsAllFramesName(String path, int red, int green, int blue);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginOffsetColorsAllFramesNameD(const char* path, double red, double green, double blue);
	double PluginOffsetColorsAllFramesNameD(String path, double red, double green, double blue);
	/*
	Offset all colors in the frame using the RGB offset. Use the range of -255 
	to 255 for red, green, and blue parameters. Negative values remove color. 
	Positive values add color.
	*/
	/// EXPORT_API void PluginOffsetColorsName(const char* path, int frameId, int red, int green, int blue);
	void PluginOffsetColorsName(String path, int frameId, int red, int green, int blue);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginOffsetColorsNameD(const char* path, double frameId, double red, double green, double blue);
	double PluginOffsetColorsNameD(String path, double frameId, double red, double green, double blue);
	/*
	This method will only update colors in the animation that are not already 
	set to black. Offset a subset of colors in the frame using the RGB offset. 
	Use the range of -255 to 255 for red, green, and blue parameters. Negative 
	values remove color. Positive values add color.
	*/
	/// EXPORT_API void PluginOffsetNonZeroColors(int animationId, int frameId, int red, int green, int blue);
	void PluginOffsetNonZeroColors(int animationId, int frameId, int red, int green, int blue);
	/*
	This method will only update colors in the animation that are not already 
	set to black. Offset a subset of colors for all frames using the RGB offset. 
	Use the range of -255 to 255 for red, green, and blue parameters. Negative 
	values remove color. Positive values add color.
	*/
	/// EXPORT_API void PluginOffsetNonZeroColorsAllFrames(int animationId, int red, int green, int blue);
	void PluginOffsetNonZeroColorsAllFrames(int animationId, int red, int green, int blue);
	/*
	This method will only update colors in the animation that are not already 
	set to black. Offset a subset of colors for all frames using the RGB offset. 
	Use the range of -255 to 255 for red, green, and blue parameters. Negative 
	values remove color. Positive values add color.
	*/
	/// EXPORT_API void PluginOffsetNonZeroColorsAllFramesName(const char* path, int red, int green, int blue);
	void PluginOffsetNonZeroColorsAllFramesName(String path, int red, int green, int blue);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginOffsetNonZeroColorsAllFramesNameD(const char* path, double red, double green, double blue);
	double PluginOffsetNonZeroColorsAllFramesNameD(String path, double red, double green, double blue);
	/*
	This method will only update colors in the animation that are not already 
	set to black. Offset a subset of colors in the frame using the RGB offset. 
	Use the range of -255 to 255 for red, green, and blue parameters. Negative 
	values remove color. Positive values add color.
	*/
	/// EXPORT_API void PluginOffsetNonZeroColorsName(const char* path, int frameId, int red, int green, int blue);
	void PluginOffsetNonZeroColorsName(String path, int frameId, int red, int green, int blue);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginOffsetNonZeroColorsNameD(const char* path, double frameId, double red, double green, double blue);
	double PluginOffsetNonZeroColorsNameD(String path, double frameId, double red, double green, double blue);
	/*
	Opens a `Chroma` animation file so that it can be played. Returns an animation 
	id >= 0 upon success. Returns -1 if there was a failure. The animation 
	id is used in most of the API methods.
	*/
	/// EXPORT_API int PluginOpenAnimation(const char* path);
	int PluginOpenAnimation(String path);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginOpenAnimationD(const char* path);
	double PluginOpenAnimationD(String path);
	/*
	Opens a `Chroma` animation data from memory so that it can be played. `Data` 
	is a pointer to byte array of the loaded animation in memory. `Name` will 
	be assigned to the animation when loaded. Returns an animation id >= 0 
	upon success. Returns -1 if there was a failure. The animation id is used 
	in most of the API methods.
	*/
	/// EXPORT_API int PluginOpenAnimationFromMemory(const byte* data, const char* name);
	int PluginOpenAnimationFromMemory(Pointer data, String name);
	/*
	Opens a `Chroma` animation file with the `.chroma` extension. Returns zero 
	upon success. Returns -1 if there was a failure.
	*/
	/// EXPORT_API int PluginOpenEditorDialog(const char* path);
	int PluginOpenEditorDialog(String path);
	/*
	Open the named animation in the editor dialog and play the animation at 
	start.
	*/
	/// EXPORT_API int PluginOpenEditorDialogAndPlay(const char* path);
	int PluginOpenEditorDialogAndPlay(String path);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginOpenEditorDialogAndPlayD(const char* path);
	double PluginOpenEditorDialogAndPlayD(String path);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginOpenEditorDialogD(const char* path);
	double PluginOpenEditorDialogD(String path);
	/*
	Sets the `duration` for all grames in the `Chroma` animation to the `duration` 
	parameter. Returns the animation id upon success. Returns -1 upon failure.
	*/
	/// EXPORT_API int PluginOverrideFrameDuration(int animationId, float duration);
	int PluginOverrideFrameDuration(int animationId, float duration);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginOverrideFrameDurationD(double animationId, double duration);
	double PluginOverrideFrameDurationD(double animationId, double duration);
	/*
	Override the duration of all frames with the `duration` value. Animation 
	is referenced by name.
	*/
	/// EXPORT_API void PluginOverrideFrameDurationName(const char* path, float duration);
	void PluginOverrideFrameDurationName(String path, float duration);
	/*
	Pause the current animation referenced by id.
	*/
	/// EXPORT_API void PluginPauseAnimation(int animationId);
	void PluginPauseAnimation(int animationId);
	/*
	Pause the current animation referenced by name.
	*/
	/// EXPORT_API void PluginPauseAnimationName(const char* path);
	void PluginPauseAnimationName(String path);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginPauseAnimationNameD(const char* path);
	double PluginPauseAnimationNameD(String path);
	/*
	Plays the `Chroma` animation. This will load the animation, if not loaded 
	previously. Returns the animation id upon success. Returns -1 upon failure.
	*/
	/// EXPORT_API int PluginPlayAnimation(int animationId);
	int PluginPlayAnimation(int animationId);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginPlayAnimationD(double animationId);
	double PluginPlayAnimationD(double animationId);
	/*
	`PluginPlayAnimationFrame` automatically handles initializing the `ChromaSDK`. 
	The method will play the animation given the `animationId` with looping 
	`on` or `off` starting at the `frameId`.
	*/
	/// EXPORT_API void PluginPlayAnimationFrame(int animationId, int frameId, bool loop);
	void PluginPlayAnimationFrame(int animationId, int frameId, boolean loop);
	/*
	`PluginPlayAnimationFrameName` automatically handles initializing the `ChromaSDK`. 
	The named `.chroma` animation file will be automatically opened. The animation 
	will play with looping `on` or `off` starting at the `frameId`.
	*/
	/// EXPORT_API void PluginPlayAnimationFrameName(const char* path, int frameId, bool loop);
	void PluginPlayAnimationFrameName(String path, int frameId, boolean loop);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginPlayAnimationFrameNameD(const char* path, double frameId, double loop);
	double PluginPlayAnimationFrameNameD(String path, double frameId, double loop);
	/*
	`PluginPlayAnimationLoop` automatically handles initializing the `ChromaSDK`. 
	The method will play the animation given the `animationId` with looping 
	`on` or `off`.
	*/
	/// EXPORT_API void PluginPlayAnimationLoop(int animationId, bool loop);
	void PluginPlayAnimationLoop(int animationId, boolean loop);
	/*
	`PluginPlayAnimationName` automatically handles initializing the `ChromaSDK`. 
	The named `.chroma` animation file will be automatically opened. The animation 
	will play with looping `on` or `off`.
	*/
	/// EXPORT_API void PluginPlayAnimationName(const char* path, bool loop);
	void PluginPlayAnimationName(String path, boolean loop);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginPlayAnimationNameD(const char* path, double loop);
	double PluginPlayAnimationNameD(String path, double loop);
	/*
	`PluginPlayComposite` automatically handles initializing the `ChromaSDK`. 
	The named animation files for the `.chroma` set will be automatically opened. 
	The set of animations will play with looping `on` or `off`.
	*/
	/// EXPORT_API void PluginPlayComposite(const char* name, bool loop);
	void PluginPlayComposite(String name, boolean loop);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginPlayCompositeD(const char* name, double loop);
	double PluginPlayCompositeD(String name, double loop);
	/*
	Displays the `Chroma` animation frame on `Chroma` hardware given the `frameIndex`. 
	Returns the animation id upon success. Returns -1 upon failure.
	*/
	/// EXPORT_API int PluginPreviewFrame(int animationId, int frameIndex);
	int PluginPreviewFrame(int animationId, int frameIndex);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginPreviewFrameD(double animationId, double frameIndex);
	double PluginPreviewFrameD(double animationId, double frameIndex);
	/*
	Displays the `Chroma` animation frame on `Chroma` hardware given the `frameIndex`. 
	Animaton is referenced by name.
	*/
	/// EXPORT_API void PluginPreviewFrameName(const char* path, int frameIndex);
	void PluginPreviewFrameName(String path, int frameIndex);
	/*
	Reduce the frames of the animation by removing every nth element. Animation 
	is referenced by id.
	*/
	/// EXPORT_API void PluginReduceFrames(int animationId, int n);
	void PluginReduceFrames(int animationId, int n);
	/*
	Reduce the frames of the animation by removing every nth element. Animation 
	is referenced by name.
	*/
	/// EXPORT_API void PluginReduceFramesName(const char* path, int n);
	void PluginReduceFramesName(String path, int n);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginReduceFramesNameD(const char* path, double n);
	double PluginReduceFramesNameD(String path, double n);
	/*
	Resets the `Chroma` animation to 1 blank frame. Returns the animation id 
	upon success. Returns -1 upon failure.
	*/
	/// EXPORT_API int PluginResetAnimation(int animationId);
	int PluginResetAnimation(int animationId);
	/*
	Resume the animation with loop `ON` or `OFF` referenced by id.
	*/
	/// EXPORT_API void PluginResumeAnimation(int animationId, bool loop);
	void PluginResumeAnimation(int animationId, boolean loop);
	/*
	Resume the animation with loop `ON` or `OFF` referenced by name.
	*/
	/// EXPORT_API void PluginResumeAnimationName(const char* path, bool loop);
	void PluginResumeAnimationName(String path, boolean loop);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginResumeAnimationNameD(const char* path, double loop);
	double PluginResumeAnimationNameD(String path, double loop);
	/*
	Reverse the animation frame order of the `Chroma` animation. Returns the 
	animation id upon success. Returns -1 upon failure. Animation is referenced 
	by id.
	*/
	/// EXPORT_API int PluginReverse(int animationId);
	int PluginReverse(int animationId);
	/*
	Reverse the animation frame order of the `Chroma` animation. Animation is 
	referenced by id.
	*/
	/// EXPORT_API void PluginReverseAllFrames(int animationId);
	void PluginReverseAllFrames(int animationId);
	/*
	Reverse the animation frame order of the `Chroma` animation. Animation is 
	referenced by name.
	*/
	/// EXPORT_API void PluginReverseAllFramesName(const char* path);
	void PluginReverseAllFramesName(String path);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginReverseAllFramesNameD(const char* path);
	double PluginReverseAllFramesNameD(String path);
	/*
	Save the animation referenced by id to the path specified.
	*/
	/// EXPORT_API int PluginSaveAnimation(int animationId, const char* path);
	int PluginSaveAnimation(int animationId, String path);
	/*
	Save the named animation to the target path specified.
	*/
	/// EXPORT_API int PluginSaveAnimationName(const char* sourceAnimation, const char* targetAnimation);
	int PluginSaveAnimationName(String sourceAnimation, String targetAnimation);
	/*
	Set the animation color for a frame given the `1D` `led`. The `led` should 
	be greater than or equal to 0 and less than the `MaxLeds`. The animation 
	is referenced by id.
	*/
	/// EXPORT_API void PluginSet1DColor(int animationId, int frameId, int led, int color);
	void PluginSet1DColor(int animationId, int frameId, int led, int color);
	/*
	Set the animation color for a frame given the `1D` `led`. The `led` should 
	be greater than or equal to 0 and less than the `MaxLeds`. The animation 
	is referenced by name.
	*/
	/// EXPORT_API void PluginSet1DColorName(const char* path, int frameId, int led, int color);
	void PluginSet1DColorName(String path, int frameId, int led, int color);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginSet1DColorNameD(const char* path, double frameId, double led, double color);
	double PluginSet1DColorNameD(String path, double frameId, double led, double color);
	/*
	Set the animation color for a frame given the `2D` `row` and `column`. The 
	`row` should be greater than or equal to 0 and less than the `MaxRow`. 
	The `column` should be greater than or equal to 0 and less than the `MaxColumn`. 
	The animation is referenced by id.
	*/
	/// EXPORT_API void PluginSet2DColor(int animationId, int frameId, int row, int column, int color);
	void PluginSet2DColor(int animationId, int frameId, int row, int column, int color);
	/*
	Set the animation color for a frame given the `2D` `row` and `column`. The 
	`row` should be greater than or equal to 0 and less than the `MaxRow`. 
	The `column` should be greater than or equal to 0 and less than the `MaxColumn`. 
	The animation is referenced by name.
	*/
	/// EXPORT_API void PluginSet2DColorName(const char* path, int frameId, int row, int column, int color);
	void PluginSet2DColorName(String path, int frameId, int row, int column, int color);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginSet2DColorNameD(const char* path, double frameId, double rowColumnIndex, double color);
	double PluginSet2DColorNameD(String path, double frameId, double rowColumnIndex, double color);
	/*
	When custom color is set, the custom key mode will be used. The animation 
	is referenced by id.
	*/
	/// EXPORT_API void PluginSetChromaCustomColorAllFrames(int animationId);
	void PluginSetChromaCustomColorAllFrames(int animationId);
	/*
	When custom color is set, the custom key mode will be used. The animation 
	is referenced by name.
	*/
	/// EXPORT_API void PluginSetChromaCustomColorAllFramesName(const char* path);
	void PluginSetChromaCustomColorAllFramesName(String path);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginSetChromaCustomColorAllFramesNameD(const char* path);
	double PluginSetChromaCustomColorAllFramesNameD(String path);
	/*
	Set the Chroma custom key color flag on all frames. `True` changes the layout 
	from grid to key. `True` changes the layout from key to grid. Animation 
	is referenced by id.
	*/
	/// EXPORT_API void PluginSetChromaCustomFlag(int animationId, bool flag);
	void PluginSetChromaCustomFlag(int animationId, boolean flag);
	/*
	Set the Chroma custom key color flag on all frames. `True` changes the layout 
	from grid to key. `True` changes the layout from key to grid. Animation 
	is referenced by name.
	*/
	/// EXPORT_API void PluginSetChromaCustomFlagName(const char* path, bool flag);
	void PluginSetChromaCustomFlagName(String path, boolean flag);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginSetChromaCustomFlagNameD(const char* path, double flag);
	double PluginSetChromaCustomFlagNameD(String path, double flag);
	/*
	Set the current frame of the animation referenced by id.
	*/
	/// EXPORT_API void PluginSetCurrentFrame(int animationId, int frameId);
	void PluginSetCurrentFrame(int animationId, int frameId);
	/*
	Set the current frame of the animation referenced by name.
	*/
	/// EXPORT_API void PluginSetCurrentFrameName(const char* path, int frameId);
	void PluginSetCurrentFrameName(String path, int frameId);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginSetCurrentFrameNameD(const char* path, double frameId);
	double PluginSetCurrentFrameNameD(String path, double frameId);
	/*
	Changes the `deviceType` and `device` of a `Chroma` animation. If the device 
	is changed, the `Chroma` animation will be reset with 1 blank frame. Returns 
	the animation id upon success. Returns -1 upon failure.
	*/
	/// EXPORT_API int PluginSetDevice(int animationId, int deviceType, int device);
	int PluginSetDevice(int animationId, int deviceType, int device);
	/*
	SetEffect will display the referenced effect id.
	*/
	/// EXPORT_API RZRESULT PluginSetEffect(const ChromaSDK::FChromaSDKGuid& effectId);
	int PluginSetEffect(GUIDStruct effectId);
	/*
	When the idle animation is used, the named animation will play when no other 
	animations are playing. Reference the animation by id.
	*/
	/// EXPORT_API void PluginSetIdleAnimation(int animationId);
	void PluginSetIdleAnimation(int animationId);
	/*
	When the idle animation is used, the named animation will play when no other 
	animations are playing. Reference the animation by name.
	*/
	/// EXPORT_API void PluginSetIdleAnimationName(const char* path);
	void PluginSetIdleAnimationName(String path);
	/*
	Set animation key to a static color for the given frame.
	*/
	/// EXPORT_API void PluginSetKeyColor(int animationId, int frameId, int rzkey, int color);
	void PluginSetKeyColor(int animationId, int frameId, int rzkey, int color);
	/*
	Set the key to the specified key color for all frames. Animation is referenced 
	by id.
	*/
	/// EXPORT_API void PluginSetKeyColorAllFrames(int animationId, int rzkey, int color);
	void PluginSetKeyColorAllFrames(int animationId, int rzkey, int color);
	/*
	Set the key to the specified key color for all frames. Animation is referenced 
	by name.
	*/
	/// EXPORT_API void PluginSetKeyColorAllFramesName(const char* path, int rzkey, int color);
	void PluginSetKeyColorAllFramesName(String path, int rzkey, int color);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginSetKeyColorAllFramesNameD(const char* path, double rzkey, double color);
	double PluginSetKeyColorAllFramesNameD(String path, double rzkey, double color);
	/*
	Set the key to the specified key color for all frames. Animation is referenced 
	by id.
	*/
	/// EXPORT_API void PluginSetKeyColorAllFramesRGB(int animationId, int rzkey, int red, int green, int blue);
	void PluginSetKeyColorAllFramesRGB(int animationId, int rzkey, int red, int green, int blue);
	/*
	Set the key to the specified key color for all frames. Animation is referenced 
	by name.
	*/
	/// EXPORT_API void PluginSetKeyColorAllFramesRGBName(const char* path, int rzkey, int red, int green, int blue);
	void PluginSetKeyColorAllFramesRGBName(String path, int rzkey, int red, int green, int blue);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginSetKeyColorAllFramesRGBNameD(const char* path, double rzkey, double red, double green, double blue);
	double PluginSetKeyColorAllFramesRGBNameD(String path, double rzkey, double red, double green, double blue);
	/*
	Set animation key to a static color for the given frame.
	*/
	/// EXPORT_API void PluginSetKeyColorName(const char* path, int frameId, int rzkey, int color);
	void PluginSetKeyColorName(String path, int frameId, int rzkey, int color);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginSetKeyColorNameD(const char* path, double frameId, double rzkey, double color);
	double PluginSetKeyColorNameD(String path, double frameId, double rzkey, double color);
	/*
	Set the key to the specified key color for the specified frame. Animation 
	is referenced by id.
	*/
	/// EXPORT_API void PluginSetKeyColorRGB(int animationId, int frameId, int rzkey, int red, int green, int blue);
	void PluginSetKeyColorRGB(int animationId, int frameId, int rzkey, int red, int green, int blue);
	/*
	Set the key to the specified key color for the specified frame. Animation 
	is referenced by name.
	*/
	/// EXPORT_API void PluginSetKeyColorRGBName(const char* path, int frameId, int rzkey, int red, int green, int blue);
	void PluginSetKeyColorRGBName(String path, int frameId, int rzkey, int red, int green, int blue);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginSetKeyColorRGBNameD(const char* path, double frameId, double rzkey, double red, double green, double blue);
	double PluginSetKeyColorRGBNameD(String path, double frameId, double rzkey, double red, double green, double blue);
	/*
	Set animation key to a static color for the given frame if the existing 
	color is not already black.
	*/
	/// EXPORT_API void PluginSetKeyNonZeroColor(int animationId, int frameId, int rzkey, int color);
	void PluginSetKeyNonZeroColor(int animationId, int frameId, int rzkey, int color);
	/*
	Set animation key to a static color for the given frame if the existing 
	color is not already black.
	*/
	/// EXPORT_API void PluginSetKeyNonZeroColorName(const char* path, int frameId, int rzkey, int color);
	void PluginSetKeyNonZeroColorName(String path, int frameId, int rzkey, int color);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginSetKeyNonZeroColorNameD(const char* path, double frameId, double rzkey, double color);
	double PluginSetKeyNonZeroColorNameD(String path, double frameId, double rzkey, double color);
	/*
	Set the key to the specified key color for the specified frame where color 
	is not black. Animation is referenced by id.
	*/
	/// EXPORT_API void PluginSetKeyNonZeroColorRGB(int animationId, int frameId, int rzkey, int red, int green, int blue);
	void PluginSetKeyNonZeroColorRGB(int animationId, int frameId, int rzkey, int red, int green, int blue);
	/*
	Set the key to the specified key color for the specified frame where color 
	is not black. Animation is referenced by name.
	*/
	/// EXPORT_API void PluginSetKeyNonZeroColorRGBName(const char* path, int frameId, int rzkey, int red, int green, int blue);
	void PluginSetKeyNonZeroColorRGBName(String path, int frameId, int rzkey, int red, int green, int blue);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginSetKeyNonZeroColorRGBNameD(const char* path, double frameId, double rzkey, double red, double green, double blue);
	double PluginSetKeyNonZeroColorRGBNameD(String path, double frameId, double rzkey, double red, double green, double blue);
	/*
	Set an array of animation keys to a static color for the given frame. Animation 
	is referenced by id.
	*/
	/// EXPORT_API void PluginSetKeysColor(int animationId, int frameId, const int* rzkeys, int keyCount, int color);
	void PluginSetKeysColor(int animationId, int frameId, Pointer rzkeys, int keyCount, int color);
	/*
	Set an array of animation keys to a static color for all frames. Animation 
	is referenced by id.
	*/
	/// EXPORT_API void PluginSetKeysColorAllFrames(int animationId, const int* rzkeys, int keyCount, int color);
	void PluginSetKeysColorAllFrames(int animationId, Pointer rzkeys, int keyCount, int color);
	/*
	Set an array of animation keys to a static color for all frames. Animation 
	is referenced by name.
	*/
	/// EXPORT_API void PluginSetKeysColorAllFramesName(const char* path, const int* rzkeys, int keyCount, int color);
	void PluginSetKeysColorAllFramesName(String path, Pointer rzkeys, int keyCount, int color);
	/*
	Set an array of animation keys to a static color for all frames. Animation 
	is referenced by id.
	*/
	/// EXPORT_API void PluginSetKeysColorAllFramesRGB(int animationId, const int* rzkeys, int keyCount, int red, int green, int blue);
	void PluginSetKeysColorAllFramesRGB(int animationId, Pointer rzkeys, int keyCount, int red, int green, int blue);
	/*
	Set an array of animation keys to a static color for all frames. Animation 
	is referenced by name.
	*/
	/// EXPORT_API void PluginSetKeysColorAllFramesRGBName(const char* path, const int* rzkeys, int keyCount, int red, int green, int blue);
	void PluginSetKeysColorAllFramesRGBName(String path, Pointer rzkeys, int keyCount, int red, int green, int blue);
	/*
	Set an array of animation keys to a static color for the given frame.
	*/
	/// EXPORT_API void PluginSetKeysColorName(const char* path, int frameId, const int* rzkeys, int keyCount, int color);
	void PluginSetKeysColorName(String path, int frameId, Pointer rzkeys, int keyCount, int color);
	/*
	Set an array of animation keys to a static color for the given frame. Animation 
	is referenced by id.
	*/
	/// EXPORT_API void PluginSetKeysColorRGB(int animationId, int frameId, const int* rzkeys, int keyCount, int red, int green, int blue);
	void PluginSetKeysColorRGB(int animationId, int frameId, Pointer rzkeys, int keyCount, int red, int green, int blue);
	/*
	Set an array of animation keys to a static color for the given frame. Animation 
	is referenced by name.
	*/
	/// EXPORT_API void PluginSetKeysColorRGBName(const char* path, int frameId, const int* rzkeys, int keyCount, int red, int green, int blue);
	void PluginSetKeysColorRGBName(String path, int frameId, Pointer rzkeys, int keyCount, int red, int green, int blue);
	/*
	Set an array of animation keys to a static color for the given frame if 
	the existing color is not already black.
	*/
	/// EXPORT_API void PluginSetKeysNonZeroColor(int animationId, int frameId, const int* rzkeys, int keyCount, int color);
	void PluginSetKeysNonZeroColor(int animationId, int frameId, Pointer rzkeys, int keyCount, int color);
	/*
	Set an array of animation keys to a static color for the given frame where 
	the color is not black. Animation is referenced by id.
	*/
	/// EXPORT_API void PluginSetKeysNonZeroColorAllFrames(int animationId, const int* rzkeys, int keyCount, int color);
	void PluginSetKeysNonZeroColorAllFrames(int animationId, Pointer rzkeys, int keyCount, int color);
	/*
	Set an array of animation keys to a static color for all frames if the existing 
	color is not already black. Reference animation by name.
	*/
	/// EXPORT_API void PluginSetKeysNonZeroColorAllFramesName(const char* path, const int* rzkeys, int keyCount, int color);
	void PluginSetKeysNonZeroColorAllFramesName(String path, Pointer rzkeys, int keyCount, int color);
	/*
	Set an array of animation keys to a static color for the given frame if 
	the existing color is not already black. Reference animation by name.
	*/
	/// EXPORT_API void PluginSetKeysNonZeroColorName(const char* path, int frameId, const int* rzkeys, int keyCount, int color);
	void PluginSetKeysNonZeroColorName(String path, int frameId, Pointer rzkeys, int keyCount, int color);
	/*
	Set an array of animation keys to a static color for the given frame where 
	the color is not black. Animation is referenced by id.
	*/
	/// EXPORT_API void PluginSetKeysNonZeroColorRGB(int animationId, int frameId, const int* rzkeys, int keyCount, int red, int green, int blue);
	void PluginSetKeysNonZeroColorRGB(int animationId, int frameId, Pointer rzkeys, int keyCount, int red, int green, int blue);
	/*
	Set an array of animation keys to a static color for the given frame where 
	the color is not black. Animation is referenced by name.
	*/
	/// EXPORT_API void PluginSetKeysNonZeroColorRGBName(const char* path, int frameId, const int* rzkeys, int keyCount, int red, int green, int blue);
	void PluginSetKeysNonZeroColorRGBName(String path, int frameId, Pointer rzkeys, int keyCount, int red, int green, int blue);
	/*
	Set an array of animation keys to a static color for the given frame where 
	the color is black. Animation is referenced by id.
	*/
	/// EXPORT_API void PluginSetKeysZeroColor(int animationId, int frameId, const int* rzkeys, int keyCount, int color);
	void PluginSetKeysZeroColor(int animationId, int frameId, Pointer rzkeys, int keyCount, int color);
	/*
	Set an array of animation keys to a static color for all frames where the 
	color is black. Animation is referenced by id.
	*/
	/// EXPORT_API void PluginSetKeysZeroColorAllFrames(int animationId, const int* rzkeys, int keyCount, int color);
	void PluginSetKeysZeroColorAllFrames(int animationId, Pointer rzkeys, int keyCount, int color);
	/*
	Set an array of animation keys to a static color for all frames where the 
	color is black. Animation is referenced by name.
	*/
	/// EXPORT_API void PluginSetKeysZeroColorAllFramesName(const char* path, const int* rzkeys, int keyCount, int color);
	void PluginSetKeysZeroColorAllFramesName(String path, Pointer rzkeys, int keyCount, int color);
	/*
	Set an array of animation keys to a static color for all frames where the 
	color is black. Animation is referenced by id.
	*/
	/// EXPORT_API void PluginSetKeysZeroColorAllFramesRGB(int animationId, const int* rzkeys, int keyCount, int red, int green, int blue);
	void PluginSetKeysZeroColorAllFramesRGB(int animationId, Pointer rzkeys, int keyCount, int red, int green, int blue);
	/*
	Set an array of animation keys to a static color for all frames where the 
	color is black. Animation is referenced by name.
	*/
	/// EXPORT_API void PluginSetKeysZeroColorAllFramesRGBName(const char* path, const int* rzkeys, int keyCount, int red, int green, int blue);
	void PluginSetKeysZeroColorAllFramesRGBName(String path, Pointer rzkeys, int keyCount, int red, int green, int blue);
	/*
	Set an array of animation keys to a static color for the given frame where 
	the color is black. Animation is referenced by name.
	*/
	/// EXPORT_API void PluginSetKeysZeroColorName(const char* path, int frameId, const int* rzkeys, int keyCount, int color);
	void PluginSetKeysZeroColorName(String path, int frameId, Pointer rzkeys, int keyCount, int color);
	/*
	Set an array of animation keys to a static color for the given frame where 
	the color is black. Animation is referenced by id.
	*/
	/// EXPORT_API void PluginSetKeysZeroColorRGB(int animationId, int frameId, const int* rzkeys, int keyCount, int red, int green, int blue);
	void PluginSetKeysZeroColorRGB(int animationId, int frameId, Pointer rzkeys, int keyCount, int red, int green, int blue);
	/*
	Set an array of animation keys to a static color for the given frame where 
	the color is black. Animation is referenced by name.
	*/
	/// EXPORT_API void PluginSetKeysZeroColorRGBName(const char* path, int frameId, const int* rzkeys, int keyCount, int red, int green, int blue);
	void PluginSetKeysZeroColorRGBName(String path, int frameId, Pointer rzkeys, int keyCount, int red, int green, int blue);
	/*
	Set animation key to a static color for the given frame where the color 
	is black. Animation is referenced by id.
	*/
	/// EXPORT_API void PluginSetKeyZeroColor(int animationId, int frameId, int rzkey, int color);
	void PluginSetKeyZeroColor(int animationId, int frameId, int rzkey, int color);
	/*
	Set animation key to a static color for the given frame where the color 
	is black. Animation is referenced by name.
	*/
	/// EXPORT_API void PluginSetKeyZeroColorName(const char* path, int frameId, int rzkey, int color);
	void PluginSetKeyZeroColorName(String path, int frameId, int rzkey, int color);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginSetKeyZeroColorNameD(const char* path, double frameId, double rzkey, double color);
	double PluginSetKeyZeroColorNameD(String path, double frameId, double rzkey, double color);
	/*
	Set animation key to a static color for the given frame where the color 
	is black. Animation is referenced by id.
	*/
	/// EXPORT_API void PluginSetKeyZeroColorRGB(int animationId, int frameId, int rzkey, int red, int green, int blue);
	void PluginSetKeyZeroColorRGB(int animationId, int frameId, int rzkey, int red, int green, int blue);
	/*
	Set animation key to a static color for the given frame where the color 
	is black. Animation is referenced by name.
	*/
	/// EXPORT_API void PluginSetKeyZeroColorRGBName(const char* path, int frameId, int rzkey, int red, int green, int blue);
	void PluginSetKeyZeroColorRGBName(String path, int frameId, int rzkey, int red, int green, int blue);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginSetKeyZeroColorRGBNameD(const char* path, double frameId, double rzkey, double red, double green, double blue);
	double PluginSetKeyZeroColorRGBNameD(String path, double frameId, double rzkey, double red, double green, double blue);
	/*
	Invokes the setup for a debug logging callback so that `stdout` is redirected 
	to the callback. This is used by `Unity` so that debug messages can appear 
	in the console window.
	*/
	/// EXPORT_API void PluginSetLogDelegate(DebugLogPtr fp);
	void PluginSetLogDelegate(Pointer fp);
	/*
	`PluginStaticColor` sets the target device to the static color.
	*/
	/// EXPORT_API void PluginStaticColor(int deviceType, int device, int color);
	void PluginStaticColor(int deviceType, int device, int color);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginStaticColorD(double deviceType, double device, double color);
	double PluginStaticColorD(double deviceType, double device, double color);
	/*
	`PluginStopAll` will automatically stop all animations that are playing.
	*/
	/// EXPORT_API void PluginStopAll();
	void PluginStopAll();
	/*
	Stops animation playback if in progress. Returns the animation id upon success. 
	Returns -1 upon failure.
	*/
	/// EXPORT_API int PluginStopAnimation(int animationId);
	int PluginStopAnimation(int animationId);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginStopAnimationD(double animationId);
	double PluginStopAnimationD(double animationId);
	/*
	`PluginStopAnimationName` automatically handles initializing the `ChromaSDK`. 
	The named `.chroma` animation file will be automatically opened. The animation 
	will stop if playing.
	*/
	/// EXPORT_API void PluginStopAnimationName(const char* path);
	void PluginStopAnimationName(String path);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginStopAnimationNameD(const char* path);
	double PluginStopAnimationNameD(String path);
	/*
	`PluginStopAnimationType` automatically handles initializing the `ChromaSDK`. 
	If any animation is playing for the `deviceType` and `device` combination, 
	it will be stopped.
	*/
	/// EXPORT_API void PluginStopAnimationType(int deviceType, int device);
	void PluginStopAnimationType(int deviceType, int device);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginStopAnimationTypeD(double deviceType, double device);
	double PluginStopAnimationTypeD(double deviceType, double device);
	/*
	`PluginStopComposite` automatically handles initializing the `ChromaSDK`. 
	The named animation files for the `.chroma` set will be automatically opened. 
	The set of animations will be stopped if playing.
	*/
	/// EXPORT_API void PluginStopComposite(const char* name);
	void PluginStopComposite(String name);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginStopCompositeD(const char* name);
	double PluginStopCompositeD(String name);
	/*
	Subtract the source color from the target color for all frames where the 
	target color is not black. Source and target are referenced by id.
	*/
	/// EXPORT_API void PluginSubtractNonZeroAllKeysAllFrames(int sourceAnimationId, int targetAnimationId);
	void PluginSubtractNonZeroAllKeysAllFrames(int sourceAnimationId, int targetAnimationId);
	/*
	Subtract the source color from the target color for all frames where the 
	target color is not black. Source and target are referenced by name.
	*/
	/// EXPORT_API void PluginSubtractNonZeroAllKeysAllFramesName(const char* sourceAnimation, const char* targetAnimation);
	void PluginSubtractNonZeroAllKeysAllFramesName(String sourceAnimation, String targetAnimation);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginSubtractNonZeroAllKeysAllFramesNameD(const char* sourceAnimation, const char* targetAnimation);
	double PluginSubtractNonZeroAllKeysAllFramesNameD(String sourceAnimation, String targetAnimation);
	/*
	Subtract the source color from the target color for all frames where the 
	target color is not black starting at offset for the length of the source. 
	Source and target are referenced by id.
	*/
	/// EXPORT_API void PluginSubtractNonZeroAllKeysAllFramesOffset(int sourceAnimationId, int targetAnimationId, int offset);
	void PluginSubtractNonZeroAllKeysAllFramesOffset(int sourceAnimationId, int targetAnimationId, int offset);
	/*
	Subtract the source color from the target color for all frames where the 
	target color is not black starting at offset for the length of the source. 
	Source and target are referenced by name.
	*/
	/// EXPORT_API void PluginSubtractNonZeroAllKeysAllFramesOffsetName(const char* sourceAnimation, const char* targetAnimation, int offset);
	void PluginSubtractNonZeroAllKeysAllFramesOffsetName(String sourceAnimation, String targetAnimation, int offset);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginSubtractNonZeroAllKeysAllFramesOffsetNameD(const char* sourceAnimation, const char* targetAnimation, double offset);
	double PluginSubtractNonZeroAllKeysAllFramesOffsetNameD(String sourceAnimation, String targetAnimation, double offset);
	/*
	Subtract the source color from the target where color is not black for the 
	source frame and target offset frame, reference source and target by id.
	*/
	/// EXPORT_API void PluginSubtractNonZeroAllKeysOffset(int sourceAnimationId, int targetAnimationId, int frameId, int offset);
	void PluginSubtractNonZeroAllKeysOffset(int sourceAnimationId, int targetAnimationId, int frameId, int offset);
	/*
	Subtract the source color from the target where color is not black for the 
	source frame and target offset frame, reference source and target by name.
	*/
	/// EXPORT_API void PluginSubtractNonZeroAllKeysOffsetName(const char* sourceAnimation, const char* targetAnimation, int frameId, int offset);
	void PluginSubtractNonZeroAllKeysOffsetName(String sourceAnimation, String targetAnimation, int frameId, int offset);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginSubtractNonZeroAllKeysOffsetNameD(const char* sourceAnimation, const char* targetAnimation, double frameId, double offset);
	double PluginSubtractNonZeroAllKeysOffsetNameD(String sourceAnimation, String targetAnimation, double frameId, double offset);
	/*
	Subtract the source color from the target color where the target color is 
	not black for all frames. Reference source and target by id.
	*/
	/// EXPORT_API void PluginSubtractNonZeroTargetAllKeysAllFrames(int sourceAnimationId, int targetAnimationId);
	void PluginSubtractNonZeroTargetAllKeysAllFrames(int sourceAnimationId, int targetAnimationId);
	/*
	Subtract the source color from the target color where the target color is 
	not black for all frames. Reference source and target by name.
	*/
	/// EXPORT_API void PluginSubtractNonZeroTargetAllKeysAllFramesName(const char* sourceAnimation, const char* targetAnimation);
	void PluginSubtractNonZeroTargetAllKeysAllFramesName(String sourceAnimation, String targetAnimation);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginSubtractNonZeroTargetAllKeysAllFramesNameD(const char* sourceAnimation, const char* targetAnimation);
	double PluginSubtractNonZeroTargetAllKeysAllFramesNameD(String sourceAnimation, String targetAnimation);
	/*
	Subtract the source color from the target color where the target color is 
	not black for all frames starting at the target offset for the length of 
	the source. Reference source and target by id.
	*/
	/// EXPORT_API void PluginSubtractNonZeroTargetAllKeysAllFramesOffset(int sourceAnimationId, int targetAnimationId, int offset);
	void PluginSubtractNonZeroTargetAllKeysAllFramesOffset(int sourceAnimationId, int targetAnimationId, int offset);
	/*
	Subtract the source color from the target color where the target color is 
	not black for all frames starting at the target offset for the length of 
	the source. Reference source and target by name.
	*/
	/// EXPORT_API void PluginSubtractNonZeroTargetAllKeysAllFramesOffsetName(const char* sourceAnimation, const char* targetAnimation, int offset);
	void PluginSubtractNonZeroTargetAllKeysAllFramesOffsetName(String sourceAnimation, String targetAnimation, int offset);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginSubtractNonZeroTargetAllKeysAllFramesOffsetNameD(const char* sourceAnimation, const char* targetAnimation, double offset);
	double PluginSubtractNonZeroTargetAllKeysAllFramesOffsetNameD(String sourceAnimation, String targetAnimation, double offset);
	/*
	Subtract the source color from the target color where the target color is 
	not black from the source frame to the target offset frame. Reference source 
	and target by id.
	*/
	/// EXPORT_API void PluginSubtractNonZeroTargetAllKeysOffset(int sourceAnimationId, int targetAnimationId, int frameId, int offset);
	void PluginSubtractNonZeroTargetAllKeysOffset(int sourceAnimationId, int targetAnimationId, int frameId, int offset);
	/*
	Subtract the source color from the target color where the target color is 
	not black from the source frame to the target offset frame. Reference source 
	and target by name.
	*/
	/// EXPORT_API void PluginSubtractNonZeroTargetAllKeysOffsetName(const char* sourceAnimation, const char* targetAnimation, int frameId, int offset);
	void PluginSubtractNonZeroTargetAllKeysOffsetName(String sourceAnimation, String targetAnimation, int frameId, int offset);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginSubtractNonZeroTargetAllKeysOffsetNameD(const char* sourceAnimation, const char* targetAnimation, double frameId, double offset);
	double PluginSubtractNonZeroTargetAllKeysOffsetNameD(String sourceAnimation, String targetAnimation, double frameId, double offset);
	/*
	Trim the end of the animation. The length of the animation will be the lastFrameId 
	+ 1. Reference the animation by id.
	*/
	/// EXPORT_API void PluginTrimEndFrames(int animationId, int lastFrameId);
	void PluginTrimEndFrames(int animationId, int lastFrameId);
	/*
	Trim the end of the animation. The length of the animation will be the lastFrameId 
	+ 1. Reference the animation by name.
	*/
	/// EXPORT_API void PluginTrimEndFramesName(const char* path, int lastFrameId);
	void PluginTrimEndFramesName(String path, int lastFrameId);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginTrimEndFramesNameD(const char* path, double lastFrameId);
	double PluginTrimEndFramesNameD(String path, double lastFrameId);
	/*
	Remove the frame from the animation. Reference animation by id.
	*/
	/// EXPORT_API void PluginTrimFrame(int animationId, int frameId);
	void PluginTrimFrame(int animationId, int frameId);
	/*
	Remove the frame from the animation. Reference animation by name.
	*/
	/// EXPORT_API void PluginTrimFrameName(const char* path, int frameId);
	void PluginTrimFrameName(String path, int frameId);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginTrimFrameNameD(const char* path, double frameId);
	double PluginTrimFrameNameD(String path, double frameId);
	/*
	Trim the start of the animation starting at frame 0 for the number of frames. 
	Reference the animation by id.
	*/
	/// EXPORT_API void PluginTrimStartFrames(int animationId, int numberOfFrames);
	void PluginTrimStartFrames(int animationId, int numberOfFrames);
	/*
	Trim the start of the animation starting at frame 0 for the number of frames. 
	Reference the animation by name.
	*/
	/// EXPORT_API void PluginTrimStartFramesName(const char* path, int numberOfFrames);
	void PluginTrimStartFramesName(String path, int numberOfFrames);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginTrimStartFramesNameD(const char* path, double numberOfFrames);
	double PluginTrimStartFramesNameD(String path, double numberOfFrames);
	/*
	Uninitializes the `ChromaSDK`. Returns 0 upon success. Returns -1 upon failure.
	*/
	/// EXPORT_API RZRESULT PluginUninit();
	int PluginUninit();
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginUninitD();
	double PluginUninitD();
	/*
	Unloads `Chroma` effects to free up resources. Returns the animation id 
	upon success. Returns -1 upon failure. Reference the animation by id.
	*/
	/// EXPORT_API int PluginUnloadAnimation(int animationId);
	int PluginUnloadAnimation(int animationId);
	/*
	D suffix for limited data types.
	*/
	/// EXPORT_API double PluginUnloadAnimationD(double animationId);
	double PluginUnloadAnimationD(double animationId);
	/*
	Unload the animation effects. Reference the animation by name.
	*/
	/// EXPORT_API void PluginUnloadAnimationName(const char* path);
	void PluginUnloadAnimationName(String path);
	/*
	Unload the the composite set of animation effects. Reference the animation 
	by name.
	*/
	/// EXPORT_API void PluginUnloadComposite(const char* name);
	void PluginUnloadComposite(String name);
	/*
	Updates the `frameIndex` of the `Chroma` animation and sets the `duration` 
	(in seconds). The `color` is expected to be an array of the dimensions 
	for the `deviceType/device`. The `length` parameter is the size of the 
	`color` array. For `EChromaSDKDevice1DEnum` the array size should be `MAX 
	LEDS`. For `EChromaSDKDevice2DEnum` the array size should be `MAX ROW` 
	* `MAX COLUMN`. Returns the animation id upon success. Returns -1 upon 
	failure.
	*/
	/// EXPORT_API int PluginUpdateFrame(int animationId, int frameIndex, float duration, int* colors, int length);
	int PluginUpdateFrame(int animationId, int frameIndex, float duration, Pointer colors, int length);
	/*
	Updates the `frameIndex` of the `Chroma` animation and sets the `duration` 
	(in seconds). The `color` is expected to be an array of the dimensions 
	for the `deviceType/device`. The `length` parameter is the size of the 
	`color` array. For `EChromaSDKDevice1DEnum` the array size should be `MAX 
	LEDS`. For `EChromaSDKDevice2DEnum` the array size should be `MAX ROW` 
	* `MAX COLUMN`. Returns the animation id upon success. Returns -1 upon 
	failure.
	*/
	/// EXPORT_API int PluginUpdateFrameName(const char* path, int frameIndex, float duration, int* colors, int length);
	int PluginUpdateFrameName(String path, int frameIndex, float duration, Pointer colors, int length);
	/*
	When the idle animation flag is true, when no other animations are playing, 
	the idle animation will be used. The idle animation will not be affected 
	by the API calls to PluginIsPlaying, PluginStopAnimationType, PluginGetPlayingAnimationId, 
	and PluginGetPlayingAnimationCount. Then the idle animation flag is false, 
	the idle animation is disabled. `Device` uses `EChromaSDKDeviceEnum` enums.
	*/
	/// EXPORT_API void PluginUseIdleAnimation(int device, bool flag);
	void PluginUseIdleAnimation(int device, boolean flag);
	/*
	Set idle animation flag for all devices.
	*/
	/// EXPORT_API void PluginUseIdleAnimations(bool flag);
	void PluginUseIdleAnimations(boolean flag);
	/*
	Set preloading animation flag, which is set to true by default. Reference 
	animation by id.
	*/
	/// EXPORT_API void PluginUsePreloading(int animationId, bool flag);
	void PluginUsePreloading(int animationId, boolean flag);
	/*
	Set preloading animation flag, which is set to true by default. Reference 
	animation by name.
	*/
	/// EXPORT_API void PluginUsePreloadingName(const char* path, bool flag);
	void PluginUsePreloadingName(String path, boolean flag);

}
