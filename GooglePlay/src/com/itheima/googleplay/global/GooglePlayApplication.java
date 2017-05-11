package com.itheima.googleplay.global;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.lang.Thread.UncaughtExceptionHandler;

import android.app.Application;
import android.content.Context;
import android.os.Handler;

import com.itheima.googleplay.utils.LogUtils;

/**
 * 自定义application, 进行全局初始化
 * 
 * @author liupeng
 * @date 2016-10-27
 */
@SuppressWarnings("unused")
public class GooglePlayApplication extends Application {

	private static Context context;
	private static Handler handler;
	private static int mainThreadId;

	@Override
	public void onCreate() {
		super.onCreate();
		context = getApplicationContext();
		handler = new Handler();
		mainThreadId = android.os.Process.myTid();
	}

	public static Context getContext() {
		return context;
	}

	public static Handler getHandler() {
		return handler;
	}

	public static int getMainThreadId() {
		return mainThreadId;
	}

	private class MyUncaughtExceptionHandler implements UncaughtExceptionHandler {
		// 系统中由未捕获的异常的时候调用
		// Throwable : Error和Exception的父类
		@Override
		public void uncaughtException(Thread thread, Throwable ex) {
			LogUtils.v("哥捕获异常了......");
			ex.printStackTrace();
			try {
				// 将捕获到异常,保存到SD卡中
				ex.printStackTrace(new PrintStream(new File("/mnt/sdcard/log.txt")));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			// myPid() : 获取当前应用程序的进程id
			// 自己把自己杀死
			android.os.Process.killProcess(android.os.Process.myPid());
		}
	}

}