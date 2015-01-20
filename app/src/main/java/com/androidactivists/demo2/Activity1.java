package com.androidactivists.demo2;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.content.Intent;
import android.widget.Toast;


public class Activity1 extends ActionBarActivity {

    private EditText inputView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen1);
        inputView= (EditText) findViewById(R.id.inputView);
        inputView.setGravity(Gravity.CENTER);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_activity1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_send) {

            String input=inputView.getText().toString();
            if(input.length()==0){

                Toast.makeText(this,"Dude, you gotta enter something first!!",Toast.LENGTH_SHORT).show();
            }

            else if(input.length()!=0){

                Intent intent = new Intent(this,Activity2.class);
                intent.putExtra("KEY",input);
                startActivity(intent);
            }

        }

        return super.onOptionsItemSelected(item);
    }
}
