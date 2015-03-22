package com.example.satish1;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.graphics.Matrix;
import android.support.v7.app.ActionBarActivity;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.OnScaleGestureListener;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.RelativeLayout;


@TargetApi(Build.VERSION_CODES.HONEYCOMB) public class Pasting extends ActionBarActivity {
	
    @Override
   
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
     setContentView(R.layout.activity_pasting);
    
       
       

        Button Home=(Button) findViewById(R.id.button6);
        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Pasting.this, MainActivity.class));
            }
        });


        Button Products=(Button) findViewById(R.id.button7);
        Products.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Pasting.this, com.example.satish1.products.class));
            }
        });

        Button Contacts=(Button) findViewById(R.id.button8);
        Contacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Pasting.this, Contact1.class));
            }
        });

    }

   
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_pasting, menu);
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
