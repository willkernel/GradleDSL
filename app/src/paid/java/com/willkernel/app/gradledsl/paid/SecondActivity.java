package com.willkernel.app.gradledsl.paid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.willkernel.app.gradledsl.Constants;
import com.willkernel.app.gradledsl.R;

/**
 * not in classpath
 * fix it by choose paid build variant
 */
public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView textView = findViewById(R.id.textView);
        textView.setText(Constants.GLOBAL_VAR);
    }
}
