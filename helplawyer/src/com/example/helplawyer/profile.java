package com.example.helplawyer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class profile extends Activity{
	TextView textName;
	TextView textSurname;
	

    public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.profile);
    textName = (TextView)findViewById(R.id.textName);
    textSurname = (TextView)findViewById(R.id.textSurname);
    Intent intent = getIntent();
    
    String fName = intent.getStringExtra("fname");
    String lName = intent.getStringExtra("lname");
    textName.setText(fName);
    textSurname.setText(lName);
}
}
