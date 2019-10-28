package com.example.androidhw11activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Bpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bpage);
        Button BtoA = (Button) findViewById(R.id.BtoA);
        BtoA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Bpage.this, MainActivity.class);
                finish();                                                                   //觸發onDestroy
                startActivity(intent);
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Bpage", "Bpage的onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Bpage", "Bpage的onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Bpage", "Bpage的onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Bpage", "Bpage的onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Bpage", "Bpage的onStop");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Bpage", "Bpage的onDestroy");
    }
}


