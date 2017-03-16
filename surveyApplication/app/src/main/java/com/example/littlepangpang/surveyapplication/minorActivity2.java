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

public class minorActivity2 extends AppCompatActivity {
    private CheckBox checkBox1 = null;
    private CheckBox checkBox2 = null;
    private CheckBox checkBox3 = null;
    private CheckBox checkBox4 = null;

    private TextView Tview=null;
    private Button btn = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minor2);
        /*Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);*
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void OnClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            });*/


        checkBox1 = (CheckBox) findViewById(R.id.checkbox1minor2);
        checkBox2 = (CheckBox) findViewById(R.id.checkbox2minor2);
        checkBox3 = (CheckBox) findViewById(R.id.checkbox3minor2);
        checkBox4 = (CheckBox) findViewById(R.id.checkbox4minor2);
        btn = (Button) findViewById(R.id.btnminor2);



        checkBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {

                if(isChecked){

                    MainActivity.stringList[MainActivity.I]=checkBox1.getText().toString();
                    MainActivity.I++;
                    btn.setText("next");
                }
            }
        });

        checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {

                if(isChecked){

                    MainActivity.stringList[MainActivity.I]=checkBox2.getText().toString();
                    MainActivity.I++;
                    btn.setText("next");
                }
            }
        });

        checkBox3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {

                if(isChecked){
                    MainActivity.stringList[MainActivity.I]=checkBox3.getText().toString();
                    MainActivity.I++;
                    btn.setText("next");
                }
            }
        });

        checkBox4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {

                if(isChecked){
                    MainActivity.stringList[MainActivity.I]=checkBox4.getText().toString();
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
        Tview=(TextView)findViewById(R.id.textviewminor2);
        MainActivity.stringList[MainActivity.I]=Tview.getText().toString();
        MainActivity.I++;

        btn=(Button)findViewById(R.id.btnminor2);
        if(btn.getText()=="next") {
            startActivity(new Intent(this, minorActivity3.class));
        }


    }
}

