package com.aim.duty.duty_base.util;

import java.util.Random;

import com.aim.duty.duty_base.entity.base.GameObject;
import com.google.protobuf.ByteString;

public class Util {

	public static Random rand = new Random();

	public static int rand(int value) {
		if (value <= 0)
			return 0;
		return rand.nextInt(value);
	}

	public static long getTime1() {
		return System.currentTimeMillis();
	}

	public static int getTime2() {
		return (int) (System.currentTimeMillis() / 1000);
	}

}
