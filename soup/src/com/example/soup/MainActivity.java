package com.example.soup;



import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	EditText edit;
	Button ok;
	TextView textone;
	String dd,zz;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit = (EditText)findViewById(R.id.editText1);
        ok = (Button)findViewById(R.id.buttonAdd);
        textone = (TextView)findViewById(R.id.textView1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    public void onClick(View v) throws IOException {
    	edit.getText().toString();
    	dd="http://www.consultant.ru/search/?q=";
    	textone.setText(dd+edit.getText().toString());
    	zz = textone.getText().toString();
    	
    	//Document doc = Jsoup.connect(zz).get();
    	//Element link = doc.select("a").first();

    	//String text = doc.body().text(); // "An example link"
    	//String linkHref = link.attr("href"); // "http://example.com/"
    	//String linkText = link.text(); // "example""

    	//String linkOuterH = link.outerHtml(); 
    	    // "<a href="http://example.com"><b>example</b></a>"
    	//String linkInnerH = link.html(); // "<b>example</b>"
	  }
    
}
