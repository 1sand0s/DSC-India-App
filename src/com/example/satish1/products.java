package com.example.satish1;
import android.annotation.TargetApi;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;


@TargetApi(Build.VERSION_CODES.JELLY_BEAN) public class products extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
    setContentView(R.layout.activity_products);
       TextView textw=(TextView)findViewById(R.id.textView26);
       Typeface f=Typeface.createFromAsset(getAssets(),"fonts/TRON.TTF");
       textw.setTypeface(f);
       ImageView term=(ImageView)findViewById(R.id.imageButton2);
       ImageView high=(ImageView)findViewById(R.id.imageButton1);
       ImageView past=(ImageView)findViewById(R.id.imageButton3);
       ImageView cur=(ImageView)findViewById(R.id.imageButton4);
       ImageView vrl=(ImageView)findViewById(R.id.imageButton5);
       ImageView cut=(ImageView)findViewById(R.id.imageButton6);
       Button hom=(Button)findViewById(R.id.button1);
       Button Con=(Button)findViewById(R.id.button3);
       term.setOnTouchListener(new OnTouchListener()
       {
    	  

		public boolean onTouch(View v, MotionEvent event) 
		{
			startActivity(new Intent(products.this,Terminal.class));
			return false;
		}
       });
       high.setOnTouchListener(new OnTouchListener()
       {
    	   public boolean onTouch(View v,MotionEvent e)
    	   {
    		   startActivity(new Intent(products.this,High.class));
    		   return false;
    	   }
       });
       past.setOnTouchListener(new OnTouchListener()
       {
    	   public boolean onTouch(View v,MotionEvent e)
    	   {
    		   startActivity(new Intent(products.this,Pasting.class));
    		   return false;
    	   }
       });
       cur.setOnTouchListener(new OnTouchListener()
       {
    	   public boolean onTouch(View v,MotionEvent e)
    	   {
    		   startActivity(new Intent(products.this,Curing.class));
    		   return false;
    	   }
       });
       vrl.setOnTouchListener(new OnTouchListener()
       {
    	   public boolean onTouch(View v,MotionEvent e)
    	   {
    		   startActivity(new Intent(products.this,Vrla.class));
    		   return false;
    	   }
       });
       cut.setOnTouchListener(new OnTouchListener()
       {
    	   public boolean onTouch(View v,MotionEvent e)
    	   {
    		   startActivity(new Intent(products.this,Cutting.class));
    		   return false;
    	   }
       });
    /*   Button cast=(Button) findViewById(R.id.button6);
       Button ter=(Button)findViewById(R.id.button7);
       Button past=(Button)findViewById(R.id.button8);
       Button cut=(Button)findViewById(R.id.button9);
       View cur=(View)findViewById(R.id.button10);
       Button vr=(Button)findViewById(R.id.button11);*/
       hom.setOnClickListener(new OnClickListener()
       {
    	   public void onClick(View v)
    	   {
    		   startActivity(new Intent(products.this,MainActivity.class));
    	   }
       });
       Con.setOnClickListener(new OnClickListener()
       {
    	   public void onClick(View v)
    	   {
    		   startActivity(new Intent(products.this,Contact1.class));
    	   }
       });
      /* cast.setOnClickListener(new OnClickListener()
       {

		@Override
		public void onClick(View v) 
		{
				startActivity(new Intent(products.this,High.class));
			
		}
    	  
       });
       ter.setOnClickListener(new OnClickListener()
       {
    	   public void onClick(View v)
    	   {
    		  startActivity(new Intent(products.this,Terminal.class)); 	
    	   }
       });
       past.setOnClickListener(new OnClickListener()
       {
    	   public void onClick(View v)
    	   {
    		   	startActivity(new Intent(products.this,Pasting.class));
    	   }
       });
       cut.setOnClickListener(new OnClickListener()
       {
    	   	public void onClick(View v)
    	   	{
    	   		startActivity(new Intent(products.this,Cutting.class));
    	   	}
       });
       cur.setOnClickListener(new OnClickListener()
       {
    	   public void onClick(View v)
    	   {
    		   	startActivity(new Intent(products.this,Curing.class));
    	   }
       });
       vr.setOnClickListener(new OnClickListener()
       {
    	   public void onClick(View v)
    	   {
    		   startActivity(new Intent(products.this,Vrla.class));
    	   }
       });*/
   
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
   getMenuInflater().inflate(R.menu.menu_products, menu);
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
