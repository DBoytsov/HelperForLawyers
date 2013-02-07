package com.example.helplawyer;



import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;


public class class1 extends Activity{
	EditText inputContent1, inputContent2;
	Button buttonAdd, buttonDeleteAll;
	ImageButton imageButtonAdd;
	private static final int CM_DELETE_ID = 1;
	

        public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.class1);
     // inputContent1 = (EditText)findViewById(R.id.content1);
      //  inputContent2 = (EditText)findViewById(R.id.content2);
       // buttonAdd = (Button)findViewById(R.id.buttonAdd);
       // buttonDeleteAll = (Button)findViewById(R.id.deleteall);
        imageButtonAdd = (ImageButton)findViewById(R.id.imageButtonAdd);
        
        listContent = (ListView)findViewById(R.id.contentlist);

        mySQLiteAdapter = new SQLiteAdapter(this);
        mySQLiteAdapter.openToWrite();

        cursor = mySQLiteAdapter.queueAll();
        String[] from = new String[]{SQLiteAdapter.KEY_ID, SQLiteAdapter.KEY_CONTENT1, SQLiteAdapter.KEY_CONTENT2,SQLiteAdapter.KEY_CONTENT3,SQLiteAdapter.KEY_CONTENT4};
        int[] to = new int[]{R.id.id, R.id.text1, R.id.text2, R.id.text3,R.id.text4};
        cursorAdapter =
        	new SimpleCursorAdapter(this, R.layout.row, cursor, from, to);
        listContent.setAdapter(cursorAdapter);
        registerForContextMenu(listContent);
        
      //  buttonAdd.setOnClickListener(buttonAddOnClickListener);
     //  buttonDeleteAll.setOnClickListener(buttonDeleteAllOnClickListener);
      //  buttonAdd.setOnClickListener(this);
       
       //Intent intent = getIntent();
	    
	   // String fName = intent.getStringExtra("fname");
	   // String lName = intent.getStringExtra("lname");
		//mySQLiteAdapter.insert(fName, lName);
		//updateList();
		

        
    }
        public void onClick(View v) {
    	    Intent intent = new Intent(this, class2.class);
    	    startActivityForResult(intent, 1);
    	  }
        protected void onActivityResult(int requestCode, int resultCode, Intent data) {
            if (data == null) {return;}
            String fName = data.getStringExtra("fname");
    	    String lName = data.getStringExtra("lname");
    	    String zName = data.getStringExtra("zname");
    	    String vName = data.getStringExtra("vname");
    		mySQLiteAdapter.insert(fName, lName, vName, zName);
    		updateList();
          }
        
       // Button.OnClickListener buttonAddOnClickListener
       // = new Button.OnClickListener(){
  		
    	//	public void onClick(View arg0) {
    			// TODO Auto-generated method stub
    			//String data1 = inputContent1.getText().toString();
    			//String data2 = inputContent2.getText().toString();
    		//	Intent intent = getIntent();
    		    
    		  //  String fName = intent.getStringExtra("fname");
    		  //  String lName = intent.getStringExtra("lname");
    		//mySQLiteAdapter.insert(fName, lName);
    		//	updateList();
    		//}
        	
      //  };
        private SQLiteAdapter mySQLiteAdapter;
    	ListView listContent;
    	
    	SimpleCursorAdapter cursorAdapter;
    	Cursor cursor;
    	//Button.OnClickListener buttonDeleteAllOnClickListener
       // = new Button.OnClickListener(){

    		
    	//	public void onClick(View arg0) {
    			// TODO Auto-generated method stub
    	//		mySQLiteAdapter.deleteAll();
    	//		updateList();
    	//	}
        	
      //  };

    	@Override
    	protected void onDestroy() {
    		// TODO Auto-generated method stub
    		super.onDestroy();
    		mySQLiteAdapter.close();
    	}



    	@SuppressWarnings("deprecation")
		private void updateList(){
    		cursor.requery();
        }
    	public void onCreateContextMenu(ContextMenu menu, View v,
    		      ContextMenuInfo menuInfo) {
    		    super.onCreateContextMenu(menu, v, menuInfo);
    		    menu.add(0, CM_DELETE_ID, 0, R.string.delete_record);
    		  }
    	
    	 public boolean onContextItemSelected(MenuItem item) {
    		    if (item.getItemId() == CM_DELETE_ID) {
    		      // получаем из пункта контекстного меню данные по пункту списка 
    		      AdapterContextMenuInfo acmi = (AdapterContextMenuInfo) item.getMenuInfo();
    		      // извлекаем id записи и удаляем соответствующую запись в БД
    		      mySQLiteAdapter.delRec(acmi.id);
    		      // обновляем курсор
    		      cursor.requery();
    		      return true;
    		    }
    		    return super.onContextItemSelected(item);
    		  }
    	
        public void ClickUserBDReturn (View v)
        {
        	switch (v.getId()) 
        	{
        	    case R.id.buttonReturnDBUsMain:
        	        Intent intent = new Intent(class1.this, MainActivity.class);
        	        startActivity(intent);
        	        break;
            }
}
}