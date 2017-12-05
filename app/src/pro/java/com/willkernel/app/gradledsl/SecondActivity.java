package com.willkernel.app.gradledsl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * not in classpath
 * fix it by choose pro build variant
 */
public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
}