package com.example.mylang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import java.util.HashMap;

public class LvFinish extends AppCompatActivity {
    Handler h = new Handler();
    SessionManager sm;
    public String mytext[] = {
            "Selamat!\nAnda berhasil melewati level ini!\nBerjuanglah di level selanjutnya",
            "Sayang sekali\nSedikit lagi Anda berhasil\nCoba lagi!",
            "Sayang sekali\nAnda masih harus banyak belajar\nCoba lagi!"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lv_finish);
        sm = new SessionManager(getBaseContext());
        HashMap userdata = sm.getUserDetails();

        TextView txtCongrats = (TextView) findViewById(R.id.txtCongrats);
        txtCongrats.setText(mytext[Integer.parseInt(userdata.get("temp").toString())]);

        h.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent goHome = new Intent(LvFinish.this, Home.class);
                startActivity(goHome);
                finish();
            }
        }, 1000);
    }
}