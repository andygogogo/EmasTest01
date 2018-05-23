package com.emas.test052301;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.hello).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClassName(MainActivity.this, "com.test.bundle0523.DsLoginActivity");
                startActivity(intent);
            }
        });


        findViewById(R.id.weex).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClassName(MainActivity.this, "com.taobao.weex.activity.WeexActivity");
                startActivity(intent);
            }
        });

        Toast.makeText(this, BuildConfig.VERSION_NAME, Toast.LENGTH_SHORT).show();
    }
}
