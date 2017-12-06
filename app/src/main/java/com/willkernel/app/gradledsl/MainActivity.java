package com.willkernel.app.gradledsl;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

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
        TextView jokeText = findViewById(R.id.textView);
        final SharedPreferences prefs =
                PreferenceManager.getDefaultSharedPreferences(this);
//        设置flavor 造成 androidlib 导入bug,具体情况具体解决
//        new JokeFinder().getJoke(jokeText,
//                prefs.getString("first", "Xavier"),
//                prefs.getString("last", "Ducrohet"));
    }

    public void jump2Next(View view) {
        startActivity(new Intent(this, SecondActivity.class));
    }
}
