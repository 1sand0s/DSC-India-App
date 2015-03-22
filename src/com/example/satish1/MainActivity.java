package com.example.satish1;


import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.os.Build;

public class MainActivity extends ActionBarActivity {
    
   
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    TextView tex=(TextView)findViewById(R.id.textView33);
    Typeface f=Typeface.createFromAsset(getAssets(),"fonts/TRON.TTF");
    tex.setTypeface(f);
     Button Contacts=(Button) findViewById(R.id.button3);
        Contacts.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
            	
                startActivity(new Intent(MainActivity.this, Contact1.class));
            }
        });
        Button productsp=(Button)findViewById(R.id.button2);
        productsp.setOnClickListener(new OnClickListener()
        {
        	public void onClick(View v)
        	{
        		startActivity(new Intent(MainActivity.this,products.class));
        	}
        });




    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
     getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
   if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
