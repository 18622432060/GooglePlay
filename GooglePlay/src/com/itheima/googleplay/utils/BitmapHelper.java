package com.itheima.googleplay.utils;

import com.lidroid.xutils.BitmapUtils;

/**
 * @author liupeng
 */
public class BitmapHelper {

	private static BitmapUtils mBitmapUtils = null;

	// 单例, 懒汉模式
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
