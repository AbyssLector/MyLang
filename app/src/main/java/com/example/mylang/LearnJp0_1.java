package com.example.mylang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class LearnJp0_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_jp01);
        ImageView btnNext = (ImageView) findViewById(R.id.btnNext);
        btnNext.setOnClickListener(op);
    }
    View.OnClickListener op = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.btnNext:next();break;
            }
        }
    };
    void next(){
        Intent move = new Intent(getBaseContext(), LearnJp0_2.class);
        startActivityForResult(move, 0);
    }
}