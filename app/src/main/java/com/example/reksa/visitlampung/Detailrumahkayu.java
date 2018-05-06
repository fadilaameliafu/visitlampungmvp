package com.example.reksa.visitlampung;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Detailrumahkayu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detilrumahkayu);
    }

    public void kemaps(View view) {
        Intent intent = new Intent(Detailrumahkayu.this, MapsActivity.class);
        startActivity(intent);
    }
}