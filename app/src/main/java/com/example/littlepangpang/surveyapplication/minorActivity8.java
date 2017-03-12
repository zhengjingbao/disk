package com.example.littlepangpang.surveyapplication;

/**
 * Created by Little PangPang on 2017/3/10.
 */
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.*;

public class minorActivity8 extends AppCompatActivity {
       private RadioGroup genderGroup = null;
    private RadioButton Rbutton1 = null;
    private RadioButton Rbutton2 = null;
    private RadioButton Rbutton3= null;
    private RadioButton Rbutton4 = null;
    private Button btn = null;
    private TextView Tview=null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minor8);
        /*Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);*
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void OnClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            });*/


        genderGroup = (RadioGroup) findViewById(R.id.radiobtngroupminor8);
        Rbutton1 = (RadioButton) findViewById(R.id.radiobtn1minor8);
        Rbutton2 = (RadioButton) findViewById(R.id.radiobtn2minor8);
        Rbutton3 = (RadioButton) findViewById(R.id.radiobtn3minor8);
        Rbutton4 = (RadioButton) findViewById(R.id.radiobtn4minor8);
        btn = (Button) findViewById(R.id.btnminor8);

        //给RadioGroup设置事件监听
        genderGroup=(RadioGroup)findViewById(R.id.radiobtngroupminor8) ;
        genderGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radiogroup, int checkedId) {
                Rbutton1=(RadioButton)findViewById(R.id.radiobtn1minor8);
                if (Rbutton1.isChecked() == true ) {

                    MainActivity.stringList[MainActivity.I] = Rbutton1.getText().toString();
                    MainActivity.I++;
                    btn.setText("next");
                }
                Rbutton2 = (RadioButton) findViewById(R.id.radiobtn2minor8);
                if (Rbutton2.isChecked() == true) {

                    MainActivity.stringList[MainActivity.I] = Rbutton2.getText().toString();
                    MainActivity.I++;
                    btn.setText("next");
                }
                Rbutton3 = (RadioButton) findViewById(R.id.radiobtn3minor8);
                if (Rbutton3.isChecked() == true) {

                    MainActivity.stringList[MainActivity.I] = Rbutton3.getText().toString();
                    MainActivity.I++;
                    btn.setText("next");
                }
                Rbutton4 = (RadioButton) findViewById(R.id.radiobtn4minor8);
                if (Rbutton4.isChecked() == true) {

                    MainActivity.stringList[MainActivity.I] = Rbutton4.getText().toString();
                    MainActivity.I++;
                    btn.setText("next");
                }
            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

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

    public void button_click1(View view) {
        Tview=(TextView)findViewById(R.id.textviewminor8);

        MainActivity.stringList[MainActivity.I]=Tview.getText().toString();
        MainActivity.I++;

        btn=(Button)findViewById(R.id.btnminor8);
        if(btn.getText()=="next") {
            startActivity(new Intent(this, minorActivity9.class));
        }

    }
    }
