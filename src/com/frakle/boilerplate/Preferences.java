package com.frakle.boilerplate;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceManager;


public class Preferences extends PreferenceActivity {
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(this);
		
		addPreferencesFromResource(R.xml.preferences);
		
	}
}
