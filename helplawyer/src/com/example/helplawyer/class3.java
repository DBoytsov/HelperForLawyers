package com.example.helplawyer;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class class3 extends Activity{

        public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView textview = new TextView(this);
        textview.setText("Еще одна полезная таба");
        setContentView(textview);
    }
}