package com.willkernel.app.gradledsl;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * 其他flavor 的 SecondActivity的包名要一致
 * 但是applicationId "com.willkernel.app.gradledsl.free" 要不一样
 * 并注册SecondActivity在main/AndroidManifest
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void jump2Next(View view) {
        startActivity(new Intent(this, SecondActivity.class));
    }
}
