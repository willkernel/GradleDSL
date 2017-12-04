package com.willkernel.app.gradledsl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.willkernel.app.gradledsl.paid.SecondActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void jump2Next(View view){
        startActivity(new Intent(this,SecondActivity.class));
    }
}
