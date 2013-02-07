package com.example.helplawyer;


import android.app.TabActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.content.Intent;

public class users extends TabActivity {

   
    public void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
        setContentView(R.layout.users);
 
        TabHost tabHost = getTabHost();
                                                                 //Таб музыки
        TabSpec list = tabHost.newTabSpec("tab1");              //идентификатор нашего таба
        list.setIndicator("Список", getResources().getDrawable(R.drawable.class1_tab));                            //Название таба
        Intent photosIntent = new Intent(this, class1.class);//Класс к которому будем обращаться при переходе
        list.setContent(photosIntent);

      //  TabSpec newuser = tabHost.newTabSpec("tab2");              //идентификатор нашего таба
       // newuser.setIndicator("Добавить", getResources().getDrawable(R.drawable.class2_tab));                            //Название таба
      //  Intent addIntent = new Intent(this, class2.class);//Класс к которому будем обращаться при переходе
      //  newuser.setContent(addIntent);

        TabSpec another = tabHost.newTabSpec("tab3");              //идентификатор нашего таба
        another.setIndicator("Другое",getResources().getDrawable(R.drawable.class3_tab));                            //Название таба
        Intent anotherIntent = new Intent(this, class3.class);//Класс к которому будем обращаться при переходе
        another.setContent(anotherIntent);                                                       //Таб Фильмов
        

                                                                 //Добавляем все наши созданные табы в TabHost
        tabHost.addTab(list);
     //   tabHost.addTab(newuser);
        tabHost.addTab(another);
        
    }
    
    public void ClickUserBDReturn (View v)
    {
    	switch (v.getId()) 
    	{
    	    case R.id.buttonReturnDBUsMain:
    	        Intent intent = new Intent(users.this, MainActivity.class);
    	        startActivity(intent);
    	        break;
        }
    }

   
    
}