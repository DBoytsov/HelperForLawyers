package com.example.helplawyer;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class documents extends Activity {

   
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.documents);
    }
    
    public void ClickUserBDReturn (View v)
    {
    	switch (v.getId()) 
    	{
    	    case R.id.buttonReturnDBUsMain:
    	        Intent intent = new Intent(documents.this, MainActivity.class);
    	        startActivity(intent);
    	        break;
        }
    }

   
    
}