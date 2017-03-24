package com.example.littlepangpang.surveyapplication;

/**
 * Created by Little PangPang on 2017/3/10.
 */
import android.content.Intent;
import android.graphics.Color;
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
import java.util.ArrayList;
import android.widget.AdapterView.OnItemClickListener;
import java.lang.reflect.Array;
import  android.R.color;
public class minorActivity3 extends AppCompatActivity {
    private ListView Lview=null;
    private Button btn = null;
    private ArrayList stringList=new ArrayList();
    private TextView Tview=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minor3);
        Tview=(TextView)findViewById(R.id.textviewminor3);
        MainActivity.stringList[MainActivity.I]=Tview.getText().toString();
        MainActivity.I++;
        Lview=(ListView) findViewById(R.id.listviewminor3);
        btn = (Button) findViewById(R.id.btnminor3);
        stringList.add("");
        stringList.add("design");
        stringList.add("technics");
        stringList.add("stability");
        stringList.add("functions");
        ArrayAdapter<ArrayList> adapter = new ArrayAdapter<ArrayList>(this, android.R.layout.simple_list_item_1, stringList);
        Lview.setAdapter(adapter);
        Lview.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,     int position, long id)  {
              if(stringList.get(position).equals("design"))
              {
                  MainActivity.stringList[MainActivity.I]="design";
                  MainActivity.I++;
              }
                else if(stringList.get(position).equals("technics"))
              {
                  MainActivity.stringList[MainActivity.I]="technics";
                  MainActivity.I++;
              }
              else if(stringList.get(position).equals("stability"))
              {
                  MainActivity.stringList[MainActivity.I]="stability";
                  MainActivity.I++;
              }
              else if(stringList.get(position).equals("functions"))
              {
                  MainActivity.stringList[MainActivity.I]="functions";
                  MainActivity.I++;
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
        startActivity(new Intent(this, minorActivity4.class));


    }
}
