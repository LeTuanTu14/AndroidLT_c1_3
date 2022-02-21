package com.example.casestudy3;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    TextView tv_kq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_kq= findViewById(R.id.tv_kq);
        Button bt_nhapthongtin= findViewById(R.id.button_nhapthongtin);
        bt_nhapthongtin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this, SubActivity.class);
                startActivityForResult(intent, 9999);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 9999 && resultCode == RESULT_OK){
            String ht = data.getStringExtra("ht").toString();
            String ns= data.getStringExtra("ns").toString();
            Calendar calendar= Calendar.getInstance();
            int namht= calendar.get(Calendar.YEAR);
            int namsinh= Integer.parseInt(ns);
            String st="";
            st+= "Họ và tên: "+ht;
            st+= "\n Năm sinh: "+ns;
            st+="\n Tuổi: "+(namht-namsinh);
            tv_kq.setText(st);
        }
    }
}