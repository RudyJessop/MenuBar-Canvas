package com.rudyjessop.menubar;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;

public class LocationFound extends Activity{

	private Bundle savedInstanceState;

	@Override
	protected void onCreate(Bundle saveInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_location_found);
		
		//get action bar
		ActionBar actionBar = getActionBar();
		
		//Enabling up /Back navigation
		actionBar.setDisplayHomeAsUpEnabled(true);
	}
}
