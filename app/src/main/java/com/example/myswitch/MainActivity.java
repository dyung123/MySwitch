package com.example.myswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    LinearLayout layout_1;
    ImageView img_view;
    Switch switch1;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout_1 = findViewById(R.id.layout_1);
        img_view = findViewById(R.id.img_view);
        switch1 = findViewById(R.id.switch1);

        findViewById(R.id.switch1).setOnClickListener(this);
        findViewById(R.id.radio_button1).setOnClickListener(this);
        findViewById(R.id.radio_button2).setOnClickListener(this);
        findViewById(R.id.radio_button3).setOnClickListener(this);
        findViewById(R.id.btn_begin).setOnClickListener(this);
        findViewById(R.id.btn_exit).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(img_view.getId()){
            case R.id.switch1:
                if(switch1.isChecked())
                    layout_1.setVisibility(View.VISIBLE);
                else
                    layout_1.setVisibility(View.INVISIBLE);
                break;
            case R.id.radio_button1:
                img_view.setImageResource(R.drawable.an8);
                break;
            case R.id.radio_button2:
                img_view.setImageResource(R.drawable.an8);
                break;
            case R.id.radio_button3:
                img_view.setImageResource(R.drawable.an8);
                break;
            case R.id.btn_begin:
                switch1.setChecked(false);
                layout_1.setVisibility(View.INVISIBLE);
                break;
            case R.id.btn_exit:
                finish();
                break;

        }
    }
}