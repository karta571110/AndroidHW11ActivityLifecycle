package com.example.androidhw11activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button AtoB = (Button) findViewById(R.id.AtoB);

        AtoB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Bpage.class);
                startActivity(intent);
                finish();                                                                    //觸發onDestroy
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MainActivity", "MainActivity的onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("MainActivity", "MainActivity的onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MainActivity", "MainActivity的onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MainActivity", "MainActivity的onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MainActivity", "MainActivity的onStop");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MainActivity","MainActivity的onDestroy");
    }
}
