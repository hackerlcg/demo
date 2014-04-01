package com.example.applicationdemo;

import android.app.Application;

public class MyApplication extends Application{
	
	/**
	 * app log tag
	 */
	public static String LOGTAG="MyApplication";
	
	/**
	 * Singleton pattern
	 */
	private static MyApplication instance;
	
	private static String userName;
	
	public static MyApplication getInstance(){
		return instance;
	}

	@Override
	public void onCreate() {
		super.onCreate();
		instance=this;
	}

	public static String getUserName() {
		return userName;
	}

	public static void setUserName(String userName) {
		MyApplication.userName = userName;
	}

	
	
}
