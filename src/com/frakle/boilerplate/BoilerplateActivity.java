package com.frakle.boilerplate;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class BoilerplateActivity extends Activity {

	//For Logging Purposes. 
	private static final String TAG = BoilerplateActivity.class.getSimpleName();
	private static final boolean DEBUG = true;
	
	//Basic Menu Items
	private static final int MENU_QUIT = 0;
	private static final int MENU_CREDITS = 1;
	private static final int MENU_PREFERENCES = 2;
	
	private SharedPreferences preferences;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        preferences = PreferenceManager.getDefaultSharedPreferences(this);
        
        setContentView(R.layout.main);
        
        if(DEBUG){
        	Log.v(TAG,"onCreate()'d");
        }
    }
    
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		menu.add(0, MENU_QUIT, 0, "Quit");
		menu.add(0, MENU_CREDITS, 0, "Credits");
		menu.add(0, MENU_PREFERENCES, 0, "Preferences");
		
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
			case MENU_QUIT:
				finish();
				break;
			case MENU_CREDITS:
				showCredits();
				break;
			case MENU_PREFERENCES:
				startActivity(new Intent(this, Preferences.class));
				break;
		}
		return true;
	}
	
    public void showCredits(){
    	Toast.makeText(getApplicationContext(), "Code By: Michael Spellecacy", Toast.LENGTH_LONG).show();
    	Toast.makeText(getApplicationContext(), "Email: mspellecacy@frakle.com", Toast.LENGTH_LONG).show();
    }
    
    
}