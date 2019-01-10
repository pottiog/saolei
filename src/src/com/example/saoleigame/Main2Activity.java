package com.example.saoleigame;

import android.app.Activity;
import android.os.Bundle;

public class Main2Activity extends Activity {


	    @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(new MainView(this));
	    }
	}
