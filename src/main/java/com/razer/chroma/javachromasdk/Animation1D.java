package com.razer.chroma.javachromasdk;

import org.jglr.jchroma.JChroma;
import org.jglr.jchroma.effects.ChromaEffect1D;
import org.jglr.jchroma.effects.CustomChromaLinkEffect;
import org.jglr.jchroma.effects.CustomHeadsetEffect;
import org.jglr.jchroma.effects.CustomMousepadEffect;
import org.jglr.jchroma.utils.ColorRef;

import java.util.ArrayList;

public class Animation1D extends AnimationBase {
	public EChromaSDKDeviceTypeEnum getDeviceType() {
		return EChromaSDKDeviceTypeEnum.DE_1D;
	}

	public void setDevice(EChromaSDKDevice1DEnum device) {
		mDevice = device;
	}

	public EChromaSDKDevice1DEnum getDevice() {
		return mDevice;
	}

	public ArrayList<FChromaSDKColorFrame1D> getFrames() {
		return mFrames;
	}

	public int getFrameCount() {
		return mFrames.size();
	}

	public float getDuration(int frameId) {
		if (frameId >= 0 && frameId < mFrames.size()) {
			FChromaSDKColorFrame1D frame = mFrames.get(frameId);
			return frame.getDuration();
		}
		return 0.033f;
	}

	public void showFrame(JChroma chroma, int frameId) {
		if (frameId < 0 || frameId >= mFrames.size()) {
			return;
		}

		ChromaEffect1D effect = null;
		switch (getDevice()) {
		case DE_ChromaLink:
			effect = new CustomChromaLinkEffect();
			break;
		case DE_Headset:
			effect = new CustomHeadsetEffect();
			break;
		case DE_Mousepad:
			effect = new CustomMousepadEffect();
			break;
		}

		final int maxLeds = ChromaAnimationAPI.getMaxLeds(getDevice());
		FChromaSDKColorFrame1D frame = mFrames.get(frameId);
		int[] colors = frame.getColors();
		for (int led = 0; led < maxLeds; ++led) {
			int color = colors[led];
			int red = ChromaAnimationAPI.getRed(color);
			int green = ChromaAnimationAPI.getGreen(color);
			int blue = ChromaAnimationAPI.getBlue(color);
			// Log.d(TAG, "red: "+red+" green: "+green+" blue: "+blue);

			ColorRef ref = new ColorRef(red, green, blue);
			if (effect != null) {
				effect.setColor(led, ref);
			}
		}

		chroma.createEffect(effect);
	}

	private EChromaSDKDevice1DEnum mDevice = EChromaSDKDevice1DEnum.DE_ChromaLink;
	private ArrayList<FChromaSDKColorFrame1D> mFrames = new ArrayList<FChromaSDKColorFrame1D>();
}
