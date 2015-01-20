package com.androidactivists.demo2;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class Activity2 extends ActionBarActivity {

    private TextView outputView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);
        outputView= (TextView) findViewById(R.id.outputView);

        Intent intent=getIntent();
        String message = intent.getStringExtra("KEY");
        outputView.setText("String passed: "+message);
        outputView.setGravity(Gravity.CENTER);

    }


}
