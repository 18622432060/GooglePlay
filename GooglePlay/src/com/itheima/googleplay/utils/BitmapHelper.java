package com.itheima.googleplay.utils;

import com.lidroid.xutils.BitmapUtils;

/**
 * 单例, 懒汉模式
 * @author liupeng
 */
public class BitmapHelper {

	private static BitmapUtils mBitmapUtils = null;

	public static BitmapUtils getBitmapUtils() {
		if (mBitmapUtils == null) {
			synchronized (BitmapHelper.class) {
				if (mBitmapUtils == null) {
					mBitmapUtils = new BitmapUtils(UIUtils.getContext());
				}
			}
		}
		return mBitmapUtils;
	}
}