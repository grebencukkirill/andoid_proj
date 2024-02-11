package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView title_main = findViewById(R.id.title_text);
        title_main.setText("My Project");

        Button main_btn = findViewById(R.id.myBtn);
        main_btn.setText("Stop");
        main_btn.setEnabled(false);

        CheckBox checkBox = findViewById(R.id.ckBox);
        checkBox.setChecked(true);


        TextView title_text = findViewById(R.id.title_text_2);
        Button btnOK = findViewById(R.id.btnOK);
        Button btnCancel = findViewById(R.id.btnCancel);

        View.OnClickListener btnListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                title_text.setText("Нажата кнопка ОК");
            }
        };

        View.OnClickListener btnListenerCancel = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                title_text.setText("Нажата кнопка Cancel");
            }
        };

        btnOK.setOnClickListener(btnListener);
        btnCancel.setOnClickListener(btnListenerCancel);
    }
}