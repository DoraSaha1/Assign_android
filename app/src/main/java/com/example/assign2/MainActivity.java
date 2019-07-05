package com.example.assign2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView iv;
    ImageButton ib;
    RadioButton rb1,rb2;
    CheckBox cb;
    Switch sw;
    Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv=findViewById(R.id.imageView);
        ib=findViewById(R.id.imageButton2);
        rb1=findViewById(R.id.radioButton);
        rb2=findViewById(R.id.radioButton2);
        sw=findViewById(R.id.switch1);
        bt=findViewById(R.id.button);
        cb=findViewById(R.id.checkBox2);
    }
    public void refresh(View view)
    {
        if(sw.isChecked())
        {
            iv.setVisibility(view.VISIBLE);
        }
        else if(!sw.isChecked())
        {
            iv.setVisibility(view.INVISIBLE);
        }
        if(cb.isChecked())
        {
            ib.setVisibility(view.VISIBLE);
        }
        else if(!cb.isChecked())
        {
            ib.setVisibility(view.INVISIBLE);
        }
        if(cb.isChecked())
        {
            if(rb1.isChecked())
            {
                ib.setClickable(false);
            }
            else if(rb2.isChecked())
            {
                ib.setClickable(true);
            }
        }

    }
}
