package com.razer.chroma.javachromasdk;

import org.jglr.jchroma.JChroma;
import org.jglr.jchroma.effects.ChromaEffect2D;
import org.jglr.jchroma.effects.CustomKeyboardEffect;
import org.jglr.jchroma.effects.CustomKeypadEffect;
import org.jglr.jchroma.effects.CustomMouseEffect;
import org.jglr.jchroma.utils.ColorRef;

import java.util.ArrayList;

public class Animation2D extends AnimationBase {
	public EChromaSDKDeviceTypeEnum getDeviceType() {
		return EChromaSDKDeviceTypeEnum.DE_2D;
	}

	public void setDevice(EChromaSDKDevice2DEnum device) {
		mDevice = device;
	}

	public EChromaSDKDevice2DEnum getDevice() {
		return mDevice;
	}

	public ArrayList<FChromaSDKColorFrame2D> getFrames() {
		return mFrames;
	}

	public int getFrameCount() {
		return mFrames.size();
	}

	public float getDuration(int frameId) {
		if (frameId >= 0 && frameId < mFrames.size()) {
			FChromaSDKColorFrame2D frame = mFrames.get(frameId);
			return frame.getDuration();
		}
		return 0.033f;
	}

	public void showFrame(JChroma chroma, int frameId) {
		if (frameId < 0 || frameId >= mFrames.size()) {
			return;
		}

		ChromaEffect2D effect = null;
		switch (getDevice()) {
		case DE_Keyboard:
			effect = new CustomKeyboardEffect();
			break;
		case DE_Keypad:
			effect = new CustomKeypadEffect();
			break;
		case DE_Mouse:
			effect = new CustomMouseEffect();
			break;
		}

		final int maxRow = ChromaAnimationAPI.getMaxRow(getDevice());
		final int maxColumn = ChromaAnimationAPI.getMaxColumn(getDevice());
		FChromaSDKColorFrame2D frame = mFrames.get(frameId);
		int[][] colors = frame.getColors();
		for (int r = 0; r < maxRow; ++r) {
			int[] row = colors[r];
			for (int c = 0; c < maxColumn; ++c) {
				int color = row[c];
				int red = ChromaAnimationAPI.getRed(color);
				int green = ChromaAnimationAPI.getGreen(color);
				int blue = ChromaAnimationAPI.getBlue(color);
				// Log.d(TAG, "red: "+red+" green: "+green+" blue: "+blue);

				ColorRef ref = new ColorRef(red, green, blue);
				if (effect != null) {
					effect.setColor(r, c, ref);
				}
			}
		}

		chroma.createEffect(effect);
	}

	private EChromaSDKDevice2DEnum mDevice = EChromaSDKDevice2DEnum.DE_Keyboard;
	private ArrayList<FChromaSDKColorFrame2D> mFrames = new ArrayList<FChromaSDKColorFrame2D>();
}
