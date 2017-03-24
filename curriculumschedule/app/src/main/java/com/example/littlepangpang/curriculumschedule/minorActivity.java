package com.example.littlepangpang.curriculumschedule;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

/**
 * Created by Little PangPang on 2017/3/19.
 */

public class minorActivity extends AppCompatActivity {
        public EditText ETextname=null;
        public EditText ETextnumber=null;
        public EditText ETextteaname=null;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_minor);
            ETextname = (EditText) findViewById(R.id.Editname);
            ETextnumber=(EditText)findViewById((R.id.Editroom));
            ETextteaname=(EditText)findViewById(R.id.Editteaname);


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

        public void button_click1(View view)
        {
            Intent intent =new Intent(this,MainActivity.class);
            Bundle bundle = new Bundle();
            String text=null;
            if(ETextname.getText().toString()+ETextnumber.getText().toString()+ETextteaname.getText().toString()!="")
              text=ETextname.getText().toString()+ETextnumber.getText().toString()+ETextteaname.getText().toString();
            bundle.putString("text",ETextname.getText().toString()+ETextnumber.getText().toString()+ETextteaname.getText().toString());
            intent.putExtras(bundle);
            setResult(RESULT_OK, intent);
            finish();

        }

    }



