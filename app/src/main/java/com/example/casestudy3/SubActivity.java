package com.example.casestudy3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        EditText et_hoten= findViewById(R.id.et_hoten);
        EditText et_namsinh= findViewById(R.id.et_namsinh);
        Button bt_submit= findViewById(R.id.button_submit);
        bt_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent();
                intent.putExtra("ht",et_hoten.getText().toString());
                intent.putExtra("ns",et_namsinh.getText().toString());
                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }
}