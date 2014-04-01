package com.example.applicationdemo.activity;

import com.example.applicationdemo.MyApplication;
import com.example.applictiondemo.R;
import com.example.applictiondemo.R.layout;
import com.example.applictiondemo.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends Activity {
	
	private MyApplication mApplication;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mApplication=(MyApplication)getApplication();
		mApplication.setUserName("xxx");
		Log.i(mApplication.LOGTAG, mApplication.getUserName());
		mApplication.setUserName("zzz");
		Intent intent =new Intent(this,OtherActivity.class);
		startActivity(intent);
		
	}

}
