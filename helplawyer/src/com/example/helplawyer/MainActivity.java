package com.example.helplawyer;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.content.Intent;

public class MainActivity extends Activity {

    
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    public void ClickUserBD (View v)
    {
    	switch (v.getId()) 
    	{
    	    case R.id.imageButton1:
    	        Intent intent = new Intent(MainActivity.this, users.class);
    	        startActivity(intent);
    	        break;
    	    case R.id.imageButton2:
    	    	Intent intent2 = new Intent(MainActivity.this, documents.class);
    	        startActivity(intent2);
    	        break;
    	    case R.id.imageButton3:
    	    	Intent intent3 = new Intent(MainActivity.this, AndroidXMLParsingActivity.class);
    	        startActivity(intent3);
    	        break;
        }
    }
    
    
}
