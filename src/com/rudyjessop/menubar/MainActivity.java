package com.rudyjessop.menubar;

import com.rudyjessop.menubar.R;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends Activity {
	
	/**
	 * On Selecting action bar icons
	 **/
	public boolean onOptionItemSelected(MenuItem item){
		//Take appropriate action for each action item click
		switch (item.getItemId()){
		case R.id.action_search:
			// search action
			return true;
		case R.id.action_location_found:
			//location found
			LocationFound();
			return true;
		case R.id.action_refresh:
			//refresh
			return true;
		case R.id.action_help:
			//help action
			return true;
		case R.id.action_check_updates:
			//check for updates action
			return true;
		default:
			return super.onOptionsItemSelected(item);
		}
	}
	
	/**
	 * Launching new Activity
	 **/
	private void LocationFound(){
		Intent i = new Intent(MainActivity.this, LocationFound.class);
		startActivity(i);
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.activity_main_actions, menu);
 
        return super.onCreateOptionsMenu(menu);
    }

	
}
