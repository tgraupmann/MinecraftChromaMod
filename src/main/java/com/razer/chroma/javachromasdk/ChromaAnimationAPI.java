package com.razer.chroma.javachromasdk;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class ChromaAnimationAPI {
	private static final String TAG = "ChromaAnimationAPI";
	private static final int ANIMATION_VERSION = 1;

	public static int getMaxRow(EChromaSDKDevice2DEnum device) {
		switch (device) {
		case DE_Keyboard:
			return 6;
		case DE_Keypad:
			return 4;
		case DE_Mouse:
			return 9;
		}
		return 0;
	}

	public static int getMaxColumn(EChromaSDKDevice2DEnum device) {
		switch (device) {
		case DE_Keyboard:
			return 22;
		case DE_Keypad:
			return 5;
		case DE_Mouse:
			return 7;
		}
		return 0;
	}

	public static int getMaxLeds(EChromaSDKDevice1DEnum device) {
		switch (device) {
		case DE_ChromaLink:
			return 5;
		case DE_Headset:
			return 5;
		case DE_Mousepad:
			return 15;
		}
		return 0;
	}

	public static int getRed(int color) {
		return color & 0xFF;
	}

	public static int getGreen(int color) {
		return (color & 0xFF00) >> 8;
	}

	public static int getBlue(int color) {
		return (color & 0xFF0000) >> 16;
	}

	public static AnimationBase OpenAnimation(InputStream input) {
		AnimationBase result = null;
		DataInputStream dis = null;
		String error = "";
		try {
			if (input == null) {
				return null;
			}
			dis = new DataInputStream(input);

			// version
			int version;
			error = "OpenAnimation: Failed to read version!";
			int read1 = dis.readUnsignedByte();
			int read2 = dis.readUnsignedByte();
			int read3 = dis.readUnsignedByte();
			int read4 = dis.readUnsignedByte();
			version = (read4 << 24) | (read3 << 16) | (read2 << 8) | read1;
			if (version != ANIMATION_VERSION) {
				System.err.println(TAG + " OpenAnimation: Unexpected version!");
				dis.close();
				input.close();
				return null;
			}
			// Log.d(TAG,"OpenAnimation: Version: "+version);

			// deviceType
			error = "OpenAnimation: Failed to read deviceType!";
			int deviceType = dis.readUnsignedByte();
			// Log.d(TAG,"OpenAnimation: DeviceType: "+deviceType);

			// device
			error = "OpenAnimation: Unexpected DeviceType";
			switch (EChromaSDKDeviceTypeEnum.convert(deviceType)) {
			case DE_1D: {
				Animation1D animation1D = new Animation1D();
				// Log.d(TAG, "OpenAnimation: DeviceType: "+animation1D.getDeviceType());

				// device
				error = "OpenAnimation: Failed to read device!";
				int device = dis.readUnsignedByte();
				// Log.d(TAG,"OpenAnimation: Device: "+device);

				error = "OpenAnimation: Unexpected Device";
				animation1D.setDevice(EChromaSDKDevice1DEnum.convert(device));
				// Log.d(TAG,"OpenAnimation: Device: "+animation1D.getDevice());

				// frame count
				error = "OpenAnimation: Failed to read frameCount!";
				read1 = dis.readUnsignedByte();
				read2 = dis.readUnsignedByte();
				read3 = dis.readUnsignedByte();
				read4 = dis.readUnsignedByte();
				int frameCount = (read4 << 24) | (read3 << 16) | (read2 << 8) | read1;

				ArrayList<FChromaSDKColorFrame1D> frames = animation1D.getFrames();
				for (int frameId = 0; frameId < frameCount; ++frameId) {
					FChromaSDKColorFrame1D frame = new FChromaSDKColorFrame1D();
					int maxLeds = ChromaAnimationAPI.getMaxLeds(animation1D.getDevice());

					// duration
					error = "OpenAnimation: Error detected reading duration!";
					read1 = dis.readUnsignedByte();
					read2 = dis.readUnsignedByte();
					read3 = dis.readUnsignedByte();
					read4 = dis.readUnsignedByte();
					float duration = Float.intBitsToFloat(read1 ^ read2 << 8 ^ read3 << 16 ^ read4 << 24);
					frame.setDuration(duration);
					// Log.d(TAG, "OpenAnimation: FrameId: "+frameId+" Duration:
					// "+frame.getDuration());

					// color data
					error = "OpenAnimation: Error detected reading color data!";
					int[] colors = new int[maxLeds];
					for (int led = 0; led < maxLeds; ++led) {
						// color
						int color;
						read1 = dis.readUnsignedByte();
						read2 = dis.readUnsignedByte();
						read3 = dis.readUnsignedByte();
						read4 = dis.readUnsignedByte();
						color = (read4 << 24) | (read3 << 16) | (read2 << 8) | read1;
						colors[led] = color;
					}
					frame.setColors(colors);

					frames.add(frame);
				}

				result = animation1D;
				break;
			}
			case DE_2D: {
				Animation2D animation2D = new Animation2D();
				// Log.d(TAG, "OpenAnimation: DeviceType: "+animation2D.getDeviceType());

				// device
				error = "OpenAnimation: Failed to read device!";
				int device = dis.readUnsignedByte();
				// Log.d(TAG,"OpenAnimation: Device: "+device);

				error = "OpenAnimation: Unexpected Device";
				animation2D.setDevice(EChromaSDKDevice2DEnum.convert(device));
				// Log.d(TAG,"OpenAnimation: Device: "+animation2D.getDevice());

				// frame count
				error = "OpenAnimation: Failed to read frameCount!";
				read1 = dis.readUnsignedByte();
				read2 = dis.readUnsignedByte();
				read3 = dis.readUnsignedByte();
				read4 = dis.readUnsignedByte();
				int frameCount = (read4 << 24) | (read3 << 16) | (read2 << 8) | read1;

				ArrayList<FChromaSDKColorFrame2D> frames = animation2D.getFrames();
				for (int frameId = 0; frameId < frameCount; ++frameId) {
					FChromaSDKColorFrame2D frame = new FChromaSDKColorFrame2D();
					int maxRow = ChromaAnimationAPI.getMaxRow(animation2D.getDevice());
					int maxColumn = ChromaAnimationAPI.getMaxColumn(animation2D.getDevice());

					// duration
					error = "OpenAnimation: Error detected reading duration!";
					read1 = dis.readUnsignedByte();
					read2 = dis.readUnsignedByte();
					read3 = dis.readUnsignedByte();
					read4 = dis.readUnsignedByte();
					float duration = Float.intBitsToFloat(read1 ^ read2 << 8 ^ read3 << 16 ^ read4 << 24);
					frame.setDuration(duration);
					// Log.d(TAG, "OpenAnimation: FrameId: "+frameId+" Duration:
					// "+frame.getDuration());

					// color data
					error = "OpenAnimation: Error detected reading color data!";
					int[][] colors = new int[maxRow][maxColumn];
					for (int r = 0; r < maxRow; ++r) {
						int[] row = new int[maxColumn];
						for (int c = 0; c < maxColumn; ++c) {
							// color
							int color;
							read1 = dis.readUnsignedByte();
							read2 = dis.readUnsignedByte();
							read3 = dis.readUnsignedByte();
							read4 = dis.readUnsignedByte();
							color = (read4 << 24) | (read3 << 16) | (read2 << 8) | read1;
							row[c] = color;
						}
						colors[r] = row;
					}
					frame.setColors(colors);

					frames.add(frame);
				}

				result = animation2D;
				break;
			}
			}
		} catch (IOException e) {
			System.err.println(TAG + ": " + error);
		} finally {
			try {
				if (dis != null) {
					dis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if (input != null) {
					input.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
}
