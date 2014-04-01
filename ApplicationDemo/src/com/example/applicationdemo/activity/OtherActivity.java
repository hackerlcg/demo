package com.example.applicationdemo.activity;

import com.example.applicationdemo.MyApplication;
import com.example.applictiondemo.R;
import com.example.applictiondemo.R.layout;
import com.example.applictiondemo.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;

public class OtherActivity extends Activity {
	
	private MyApplication myApplication;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_other);
		myApplication=(MyApplication)getApplication();
		Log.i(myApplication.LOGTAG, myApplication.getUserName());
	}

}
