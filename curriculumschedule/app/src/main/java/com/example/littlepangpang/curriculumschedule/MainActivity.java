package com.example.littlepangpang.curriculumschedule;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

import static android.R.attr.button;

public class MainActivity extends AppCompatActivity {
    private final String TAG = "Mainactivity";
    public String [] color={"#EE30A7","#96CDCD","#B03060","#7CFC00","#EE6AA7","#9AFF9A"};
    public int I=0;
    public int btncolor;
    static public Button btnW11=null;
    static public Button btnW12=null;
    static public Button btnW13=null;
    static public Button btnW14=null;
    static public Button btnW15=null;

    static public Button btnW21=null;
    static public Button btnW22=null;
    static public Button btnW23=null;
    static public Button btnW24=null;
    static public Button btnW25=null;

    static public Button btnW31=null;
    static public Button btnW32=null;
    static public Button btnW33=null;
    static public Button btnW34=null;
    static public Button btnW35=null;

    static public Button btnW41=null;
    static public Button btnW42=null;
    static public Button btnW43=null;
    static public Button btnW44=null;
    static public Button btnW45=null;

    static public Button btnW51=null;
    static public Button btnW52=null;
    static public Button btnW53=null;
    static public Button btnW54=null;
    static public Button btnW55=null;

    static public Button btnW61=null;
    static public Button btnW62=null;
    static public Button btnW63=null;
    static public Button btnW64=null;
    static public Button btnW65=null;

    static public Button btnW71=null;
    static public Button btnW72=null;
    static public Button btnW73=null;
    static public Button btnW74=null;
    static public Button btnW75=null;

    static public Button BTN=null;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnW11=(Button)findViewById(R.id.btnW11);
        btnW12=(Button)findViewById(R.id.btnW12);
        btnW13=(Button)findViewById(R.id.btnW13);
        btnW14=(Button)findViewById(R.id.btnW14);
        btnW15=(Button)findViewById(R.id.btnW15);
        btnW21=(Button)findViewById(R.id.btnW21);
        btnW22=(Button)findViewById(R.id.btnW22);
        btnW23=(Button)findViewById(R.id.btnW23);
        btnW24=(Button)findViewById(R.id.btnW24);
        btnW25=(Button)findViewById(R.id.btnW25);
        btnW31=(Button)findViewById(R.id.btnW31);
        btnW32=(Button)findViewById(R.id.btnW32);
        btnW33=(Button)findViewById(R.id.btnW33);
        btnW34=(Button)findViewById(R.id.btnW34);
        btnW35=(Button)findViewById(R.id.btnW35);
        btnW41=(Button)findViewById(R.id.btnW41);
        btnW42=(Button)findViewById(R.id.btnW42);
        btnW43=(Button)findViewById(R.id.btnW43);
        btnW44=(Button)findViewById(R.id.btnW44);
        btnW45=(Button)findViewById(R.id.btnW45);
        btnW51=(Button)findViewById(R.id.btnW51);
        btnW52=(Button)findViewById(R.id.btnW52);
        btnW53=(Button)findViewById(R.id.btnW53);
        btnW54=(Button)findViewById(R.id.btnW54);
        btnW55=(Button)findViewById(R.id.btnW55);
        btnW61=(Button)findViewById(R.id.btnW61);
        btnW62=(Button)findViewById(R.id.btnW62);
        btnW63=(Button)findViewById(R.id.btnW63);
        btnW64=(Button)findViewById(R.id.btnW64);
        btnW65=(Button)findViewById(R.id.btnW65);
        btnW71=(Button)findViewById(R.id.btnW71);
        btnW72=(Button)findViewById(R.id.btnW72);
        btnW73=(Button)findViewById(R.id.btnW73);
        btnW74=(Button)findViewById(R.id.btnW74);
        btnW75=(Button)findViewById(R.id.btnW75);

        SharedPreferences sp = getSharedPreferences("SP", MODE_PRIVATE);
        btnW11.setText(sp.getString(String.valueOf(btnW11.getId()),""));
        btncolor=sp.getInt(String.valueOf(btnW11.getId())+"Color",0xFFFFFF);
        btnW11.setBackgroundColor(btncolor);

        btnW12.setText(sp.getString(String.valueOf(btnW12.getId()),""));
        btncolor=sp.getInt(String.valueOf(btnW12.getId())+"Color",0xFFFFFF);
        btnW12.setBackgroundColor(btncolor);

        btnW13.setText(sp.getString(String.valueOf(btnW13.getId()),""));
        btncolor=sp.getInt(String.valueOf(btnW13.getId())+"Color",0xFFFFFF);
        btnW13.setBackgroundColor(btncolor);

        btnW14.setText(sp.getString(String.valueOf(btnW14.getId()),""));
        btncolor=sp.getInt(String.valueOf(btnW14.getId())+"Color",0xFFFFFF);
        btnW14.setBackgroundColor(btncolor);

        btnW15.setText(sp.getString(String.valueOf(btnW15.getId()),""));
        btncolor=sp.getInt(String.valueOf(btnW15.getId())+"Color",0xFFFFFF);
        btnW15.setBackgroundColor(btncolor);

        btnW21.setText(sp.getString(String.valueOf(btnW21.getId()),""));
        btncolor=sp.getInt(String.valueOf(btnW21.getId())+"Color",0xFFFFFF);
        btnW21.setBackgroundColor(btncolor);

        btnW22.setText(sp.getString(String.valueOf(btnW22.getId()),""));
        btncolor=sp.getInt(String.valueOf(btnW22.getId())+"Color",0xFFFFFF);
        btnW22.setBackgroundColor(btncolor);

        btnW23.setText(sp.getString(String.valueOf(btnW23.getId()),""));
        btncolor=sp.getInt(String.valueOf(btnW23.getId())+"Color",0xFFFFFF);
        btnW23.setBackgroundColor(btncolor);

        btnW24.setText(sp.getString(String.valueOf(btnW24.getId()),""));
        btncolor=sp.getInt(String.valueOf(btnW24.getId())+"Color",0xFFFFFF);
        btnW24.setBackgroundColor(btncolor);

        btnW25.setText(sp.getString(String.valueOf(btnW25.getId()),""));
        btncolor=sp.getInt(String.valueOf(btnW25.getId())+"Color",0xFFFFFF);
        btnW25.setBackgroundColor(btncolor);

        btnW31.setText(sp.getString(String.valueOf(btnW31.getId()),""));
        btncolor=sp.getInt(String.valueOf(btnW31.getId())+"Color",0xFFFFFF);
        btnW31.setBackgroundColor(btncolor);

        btnW32.setText(sp.getString(String.valueOf(btnW32.getId()),""));
        btncolor=sp.getInt(String.valueOf(btnW32.getId())+"Color",0xFFFFFF);
        btnW32.setBackgroundColor(btncolor);

        btnW33.setText(sp.getString(String.valueOf(btnW33.getId()),""));
        btncolor=sp.getInt(String.valueOf(btnW33.getId())+"Color",0xFFFFFF);
        btnW33.setBackgroundColor(btncolor);

        btnW34.setText(sp.getString(String.valueOf(btnW34.getId()),""));
        btncolor=sp.getInt(String.valueOf(btnW34.getId())+"Color",0xFFFFFF);
        btnW34.setBackgroundColor(btncolor);

        btnW35.setText(sp.getString(String.valueOf(btnW35.getId()),""));
        btncolor=sp.getInt(String.valueOf(btnW35.getId())+"Color",0xFFFFFF);
        btnW35.setBackgroundColor(btncolor);

        btnW41.setText(sp.getString(String.valueOf(btnW41.getId()),""));
        btncolor=sp.getInt(String.valueOf(btnW41.getId())+"Color",0xFFFFFF);
        btnW41.setBackgroundColor(btncolor);

        btnW42.setText(sp.getString(String.valueOf(btnW42.getId()),""));
        btncolor=sp.getInt(String.valueOf(btnW42.getId())+"Color",0xFFFFFF);
        btnW42.setBackgroundColor(btncolor);

        btnW43.setText(sp.getString(String.valueOf(btnW43.getId()),""));
        btncolor=sp.getInt(String.valueOf(btnW43.getId())+"Color",0xFFFFFF);
        btnW43.setBackgroundColor(btncolor);

        btnW44.setText(sp.getString(String.valueOf(btnW44.getId()),""));
        btncolor=sp.getInt(String.valueOf(btnW44.getId())+"Color",0xFFFFFF);
        btnW44.setBackgroundColor(btncolor);

        btnW45.setText(sp.getString(String.valueOf(btnW45.getId()),""));
        btncolor=sp.getInt(String.valueOf(btnW45.getId())+"Color",0xFFFFFF);
        btnW45.setBackgroundColor(btncolor);

        btnW51.setText(sp.getString(String.valueOf(btnW51.getId()),""));
        btncolor=sp.getInt(String.valueOf(btnW51.getId())+"Color",0xFFFFFF);
        btnW51.setBackgroundColor(btncolor);

        btnW52.setText(sp.getString(String.valueOf(btnW52.getId()),""));
        btncolor=sp.getInt(String.valueOf(btnW52.getId())+"Color",0xFFFFFF);
        btnW52.setBackgroundColor(btncolor);

        btnW53.setText(sp.getString(String.valueOf(btnW53.getId()),""));
        btncolor=sp.getInt(String.valueOf(btnW53.getId())+"Color",0xFFFFFF);
        btnW53.setBackgroundColor(btncolor);

        btnW54.setText(sp.getString(String.valueOf(btnW54.getId()),""));
        btncolor=sp.getInt(String.valueOf(btnW54.getId())+"Color",0xFFFFFF);
        btnW54.setBackgroundColor(btncolor);

        btnW55.setText(sp.getString(String.valueOf(btnW55.getId()),""));
        btncolor=sp.getInt(String.valueOf(btnW55.getId())+"Color",0xFFFFFF);
        btnW55.setBackgroundColor(btncolor);

        btnW61.setText(sp.getString(String.valueOf(btnW61.getId()),""));
        btncolor=sp.getInt(String.valueOf(btnW61.getId())+"Color",0xFFFFFF);
        btnW61.setBackgroundColor(btncolor);

        btnW62.setText(sp.getString(String.valueOf(btnW62.getId()),""));
        btncolor=sp.getInt(String.valueOf(btnW62.getId())+"Color",0xFFFFFF);
        btnW62.setBackgroundColor(btncolor);

        btnW63.setText(sp.getString(String.valueOf(btnW63.getId()),""));
        btncolor=sp.getInt(String.valueOf(btnW63.getId())+"Color",0xFFFFFF);
        btnW63.setBackgroundColor(btncolor);

        btnW64.setText(sp.getString(String.valueOf(btnW64.getId()),""));
        btncolor=sp.getInt(String.valueOf(btnW64.getId())+"Color",0xFFFFFF);
        btnW64.setBackgroundColor(btncolor);

        btnW65.setText(sp.getString(String.valueOf(btnW65.getId()),""));
        btncolor=sp.getInt(String.valueOf(btnW65.getId())+"Color",0xFFFFFF);
        btnW65.setBackgroundColor(btncolor);

        btnW71.setText(sp.getString(String.valueOf(btnW71.getId()),""));
        btncolor=sp.getInt(String.valueOf(btnW71.getId())+"Color",0xFFFFFF);
        btnW71.setBackgroundColor(btncolor);

        btnW72.setText(sp.getString(String.valueOf(btnW72.getId()),""));
        btncolor=sp.getInt(String.valueOf(btnW72.getId())+"Color",0xFFFFFF);
        btnW72.setBackgroundColor(btncolor);

        btnW73.setText(sp.getString(String.valueOf(btnW73.getId()),""));
        btncolor=sp.getInt(String.valueOf(btnW73.getId())+"Color",0xFFFFFF);
        btnW73.setBackgroundColor(btncolor);

        btnW74.setText(sp.getString(String.valueOf(btnW74.getId()),""));
        btncolor=sp.getInt(String.valueOf(btnW74.getId())+"Color",0xFFFFFF);
        btnW74.setBackgroundColor(btncolor);

        btnW75.setText(sp.getString(String.valueOf(btnW75.getId()),""));
        btncolor=sp.getInt(String.valueOf(btnW75.getId())+"Color",0xFFFFFF);
        btnW75.setBackgroundColor(btncolor);



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
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (resultCode) {
            case RESULT_OK:
                Bundle b = data.getExtras();
                String str = b.getString("text");
                if (str.length() == 0)
                {
                    MainActivity.BTN.setText(str);
                    MainActivity.BTN.setBackgroundColor(Color.parseColor("#00000000"));
                }
                else {
                    MainActivity.BTN.setText(str);
                    MainActivity.BTN.setBackgroundColor(Color.parseColor(color[I]));
                    I++;
                    if (I == 5)
                        I = 0;
                }
                 SharedPreferences sp = getSharedPreferences("SP", MODE_PRIVATE);
                 SharedPreferences.Editor editor = sp.edit();
                 int  BTNID;
                 int  BTNCOLOR;
                 String BTNTEXT;
                 String ID,IDColor;
                 BTNID=MainActivity.BTN.getId();
                 BTNTEXT=MainActivity.BTN.getText().toString();

                 ID=String.valueOf(BTNID);


                 Drawable background = MainActivity.BTN.getBackground();
                 ColorDrawable colorDrawable = (ColorDrawable) background;
                 BTNCOLOR= colorDrawable.getColor();

                 editor.putInt(ID, BTNID);
                 editor.putString(ID, BTNTEXT);
                 editor.putInt(String.valueOf(BTNID)+"Color",BTNCOLOR);
                 editor.commit();
                break;
            default:
                break;
        }


    }




    public void button_clickW11(View view) {
        MainActivity.BTN = (Button) findViewById(R.id.btnW11);
        Intent intent = new Intent();
        intent.setClass(this, minorActivity.class);
        startActivityForResult(intent, 0);
    }
    public void button_clickW12(View view) {
        MainActivity.BTN = (Button) findViewById(R.id.btnW12);
        Intent intent = new Intent();
        intent.setClass(this, minorActivity.class);
        startActivityForResult(intent, 0);
    }
    public void button_clickW13(View view) {
        MainActivity.BTN = (Button) findViewById(R.id.btnW13);
        Intent intent = new Intent();
        intent.setClass(this, minorActivity.class);
        startActivityForResult(intent, 0);
    }
    public void button_clickW14(View view) {
        MainActivity.BTN = (Button) findViewById(R.id.btnW14);
        Intent intent = new Intent();
        intent.setClass(this, minorActivity.class);
        startActivityForResult(intent, 0);
    }
    public void button_clickW15(View view) {
        MainActivity.BTN = (Button) findViewById(R.id.btnW15);
        Intent intent = new Intent();
        intent.setClass(this, minorActivity.class);
        startActivityForResult(intent, 0);
    }

    public void button_clickW21(View view) {
        MainActivity.BTN = (Button) findViewById(R.id.btnW21);
        Intent intent = new Intent();
        intent.setClass(this, minorActivity.class);
        startActivityForResult(intent, 0);
    }
    public void button_clickW22(View view) {
        MainActivity.BTN = (Button) findViewById(R.id.btnW22);
        Intent intent = new Intent();
        intent.setClass(this, minorActivity.class);
        startActivityForResult(intent, 0);
    }
    public void button_clickW23(View view) {
        MainActivity.BTN = (Button) findViewById(R.id.btnW23);
        Intent intent = new Intent();
        intent.setClass(this, minorActivity.class);
        startActivityForResult(intent, 0);
    }
    public void button_clickW24(View view) {
        MainActivity.BTN = (Button) findViewById(R.id.btnW24);
        Intent intent = new Intent();
        intent.setClass(this, minorActivity.class);
        startActivityForResult(intent, 0);
    }
    public void button_clickW25(View view) {
        MainActivity.BTN = (Button) findViewById(R.id.btnW25);
        Intent intent = new Intent();
        intent.setClass(this, minorActivity.class);
        startActivityForResult(intent, 0);
    }

    public void button_clickW31(View view) {
        MainActivity.BTN = (Button) findViewById(R.id.btnW31);
        Intent intent = new Intent();
        intent.setClass(this, minorActivity.class);
        startActivityForResult(intent, 0);
    }
    public void button_clickW32(View view) {
        MainActivity.BTN = (Button) findViewById(R.id.btnW32);
        Intent intent = new Intent();
        intent.setClass(this, minorActivity.class);
        startActivityForResult(intent, 0);
    }
    public void button_clickW33(View view) {
        MainActivity.BTN = (Button) findViewById(R.id.btnW33);
        Intent intent = new Intent();
        intent.setClass(this, minorActivity.class);
        startActivityForResult(intent, 0);
    }
    public void button_clickW34(View view) {
        MainActivity.BTN = (Button) findViewById(R.id.btnW34);
        Intent intent = new Intent();
        intent.setClass(this, minorActivity.class);
        startActivityForResult(intent, 0);
    }
    public void button_clickW35(View view) {
        MainActivity.BTN = (Button) findViewById(R.id.btnW35);
        Intent intent = new Intent();
        intent.setClass(this, minorActivity.class);
        startActivityForResult(intent, 0);
    }

    public void button_clickW41(View view) {
        MainActivity.BTN = (Button) findViewById(R.id.btnW41);
        Intent intent = new Intent();
        intent.setClass(this, minorActivity.class);
        startActivityForResult(intent, 0);
    }
    public void button_clickW42(View view) {
        MainActivity.BTN = (Button) findViewById(R.id.btnW42);
        Intent intent = new Intent();
        intent.setClass(this, minorActivity.class);
        startActivityForResult(intent, 0);
    }
    public void button_clickW43(View view) {
        MainActivity.BTN = (Button) findViewById(R.id.btnW43);
        Intent intent = new Intent();
        intent.setClass(this, minorActivity.class);
        startActivityForResult(intent, 0);
    }
    public void button_clickW44(View view) {
        MainActivity.BTN = (Button) findViewById(R.id.btnW44);
        Intent intent = new Intent();
        intent.setClass(this, minorActivity.class);
        startActivityForResult(intent, 0);
    }
    public void button_clickW45(View view) {
        MainActivity.BTN = (Button) findViewById(R.id.btnW45);
        Intent intent = new Intent();
        intent.setClass(this, minorActivity.class);
        startActivityForResult(intent, 0);
    }

    public void button_clickW51(View view) {
        MainActivity.BTN = (Button) findViewById(R.id.btnW51);
        Intent intent = new Intent();
        intent.setClass(this, minorActivity.class);
        startActivityForResult(intent, 0);
    }
    public void button_clickW52(View view) {
        MainActivity.BTN = (Button) findViewById(R.id.btnW52);
        Intent intent = new Intent();
        intent.setClass(this, minorActivity.class);
        startActivityForResult(intent, 0);
    }
    public void button_clickW53(View view) {
        MainActivity.BTN = (Button) findViewById(R.id.btnW53);
        Intent intent = new Intent();
        intent.setClass(this, minorActivity.class);
        startActivityForResult(intent, 0);
    }
    public void button_clickW54(View view) {
        MainActivity.BTN = (Button) findViewById(R.id.btnW54);
        Intent intent = new Intent();
        intent.setClass(this, minorActivity.class);
        startActivityForResult(intent, 0);
    }
    public void button_clickW55(View view) {
        MainActivity.BTN = (Button) findViewById(R.id.btnW55);
        Intent intent = new Intent();
        intent.setClass(this, minorActivity.class);
        startActivityForResult(intent, 0);
    }

    public void button_clickW61(View view) {
        MainActivity.BTN = (Button) findViewById(R.id.btnW61);
        Intent intent = new Intent();
        intent.setClass(this, minorActivity.class);
        startActivityForResult(intent, 0);
    }
    public void button_clickW62(View view) {
        MainActivity.BTN = (Button) findViewById(R.id.btnW62);
        Intent intent = new Intent();
        intent.setClass(this, minorActivity.class);
        startActivityForResult(intent, 0);
    }
    public void button_clickW63(View view) {
        MainActivity.BTN = (Button) findViewById(R.id.btnW63);
        Intent intent = new Intent();
        intent.setClass(this, minorActivity.class);
        startActivityForResult(intent, 0);
    }
    public void button_clickW64(View view) {
        MainActivity.BTN = (Button) findViewById(R.id.btnW64);
        Intent intent = new Intent();
        intent.setClass(this, minorActivity.class);
        startActivityForResult(intent, 0);
    }
    public void button_clickW65(View view) {
        MainActivity.BTN = (Button) findViewById(R.id.btnW65);
        Intent intent = new Intent();
        intent.setClass(this, minorActivity.class);
        startActivityForResult(intent, 0);
    }

    public void button_clickW71(View view) {
        MainActivity.BTN = (Button) findViewById(R.id.btnW71);
        Intent intent = new Intent();
        intent.setClass(this, minorActivity.class);
        startActivityForResult(intent, 0);
    }
    public void button_clickW72(View view) {
        MainActivity.BTN = (Button) findViewById(R.id.btnW72);
        Intent intent = new Intent();
        intent.setClass(this, minorActivity.class);
        startActivityForResult(intent, 0);
    }
    public void button_clickW73(View view) {
        MainActivity.BTN = (Button) findViewById(R.id.btnW73);
        Intent intent = new Intent();
        intent.setClass(this, minorActivity.class);
        startActivityForResult(intent, 0);
    }
    public void button_clickW74(View view) {
        MainActivity.BTN = (Button) findViewById(R.id.btnW74);
        Intent intent = new Intent();
        intent.setClass(this, minorActivity.class);
        startActivityForResult(intent, 0);
    }
    public void button_clickW75(View view) {
        MainActivity.BTN = (Button) findViewById(R.id.btnW75);
        Intent intent = new Intent();
        intent.setClass(this, minorActivity.class);
        startActivityForResult(intent, 0);
    }
}
