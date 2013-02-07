package com.example.myexample;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import android.os.AsyncTask;
import android.os.Bundle;
import android.app.Activity;
import android.app.ProgressDialog;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends Activity {
MyTask mt;
  TextView tvInfo;
  String URL="http://en.wikipedia.org/";
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    tvInfo = (TextView) findViewById(R.id.tvInfo);
  }

  public void onclick(View v) {
    mt = new MyTask();
    mt.execute(URL);
  }

  class MyTask extends AsyncTask<String, Void, String> {
      //String title=null;
    //  String what1=null;
      
    @Override
    protected void onPreExecute() {
      super.onPreExecute();
      tvInfo.setText("Please wait...");
    }

    protected String doInBackground(String... params) {
      // TimeUnit.SECONDS.sleep(2);
    	 //Document doc=null;
    	 String what1=null;
    	String url=params[0];
      // Document doc=null;
      
    try {
       Document doc = Jsoup.connect(url).get();
        what1=doc.title();
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    
   
    return what1;
    }

    protected void onPostExecute(String result) {
      super.onPostExecute(result);
      tvInfo.setText(result);
    }
  }
}