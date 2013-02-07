package com.example.helplawyer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

public class class2 extends Activity{
EditText editN;
EditText editS;
EditText editB;
EditText editA;
EditText editP;
Button buttonOk;

        public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.class2);
        editN = (EditText) findViewById(R.id.editName);
        editS = (EditText) findViewById(R.id.editSurname);
        editB = (EditText) findViewById(R.id.editBirthday);
        editA = (EditText) findViewById(R.id.editAddress);
        editP = (EditText) findViewById(R.id.editPhone); 
        buttonOk =(Button)findViewById(R.id.buttonOk);
                
        
        OnTouchListener ocledit = new OnTouchListener(){

			public boolean onTouch(View g, MotionEvent arg1) {
				// TODO Auto-generated method stub
				switch (g.getId()) 
				{
				    case R.id.editName:
				    	editN.setText("");
				            break;
				    case R.id.editSurname:
				    	editS.setText("");
				            break;
				    case R.id.editBirthday:
				    	editB.setText("");
				            break;
				    case R.id.editAddress:
				    	editA.setText("");
				            break;
				    case R.id.editPhone:
				    	editP.setText("");
				            break;
				            
			    }
				return false;
			}
        	
        };
        editN.setOnTouchListener(ocledit);
        editS.setOnTouchListener(ocledit);
        editA.setOnTouchListener(ocledit);
        editB.setOnTouchListener(ocledit);
        editP.setOnTouchListener(ocledit);
        buttonOk.setOnClickListener(ocllistener);
        
    }
        public void ClickUserBDReturn (View v)
        {
        	switch (v.getId()) 
        	{
        	    case R.id.buttonReturnDBUsMain:
        	        Intent intent = new Intent(class2.this, MainActivity.class);
        	        startActivity(intent);
        	        break;
            }
}
        OnClickListener ocllistener = new OnClickListener(){
        public void onClick (View s){
        	Intent intent = new Intent(); 
            intent.putExtra("fname", editN.getText().toString());
            intent.putExtra("lname", editS.getText().toString());
            intent.putExtra("zname", editA.getText().toString());
            intent.putExtra("vname", editP.getText().toString());
            setResult(RESULT_OK, intent);
            finish();
            
            
            
        }

};
}