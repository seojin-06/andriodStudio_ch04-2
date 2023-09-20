package com.cookandroid.project4_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView text1, text2;
    CheckBox chkAgree;
    RadioGroup Rgroup1;
    RadioButton Rbtn, Sbtn, Tbtn;
    Button btn1, btn2;
    ImageView imgPet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("안드로이드 버전 고르기");

        text1 = (TextView) findViewById(R.id.text1);
        chkAgree = (CheckBox) findViewById(R.id.chkAgree);

        text2 = (TextView) findViewById(R.id.text2);
        Rgroup1 = (RadioGroup) findViewById(R.id.Rgroup1);
        Rbtn = (RadioButton) findViewById(R.id.Rbtn);
        Sbtn = (RadioButton) findViewById(R.id.Sbtn);
        Tbtn= (RadioButton) findViewById(R.id.Tbtn);

        imgPet = (ImageView) findViewById(R.id.imgPet);

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);

        chkAgree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (chkAgree.isChecked() == true) {
                    text2.setVisibility(View.VISIBLE);
                    Rgroup1.setVisibility(View.VISIBLE);
                    btn1.setVisibility(View.VISIBLE);
                    btn2.setVisibility(View.VISIBLE);
                    imgPet.setVisibility(View.VISIBLE);
                } else {
                    text2.setVisibility(View.INVISIBLE);
                    Rgroup1.setVisibility(View.INVISIBLE);
                    btn1.setVisibility(View.INVISIBLE);
                    btn2.setVisibility(View.INVISIBLE);
                    imgPet.setVisibility(View.INVISIBLE);
                }
            }
        });

        Rbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgPet.setImageResource(R.drawable.a11);
            }
        });

        Rgroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                int checkedRadioButtonId = Rgroup1.getCheckedRadioButtonId();
                if (checkedRadioButtonId == R.id.Rbtn) {
                    imgPet.setImageResource(R.drawable.a11);
                } else if (checkedRadioButtonId == R.id.Sbtn) {
                    imgPet.setImageResource(R.drawable.a12);
                } else if (checkedRadioButtonId == R.id.Tbtn) {
                    imgPet.setImageResource(R.drawable.a13);
                }
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chkAgree.setChecked(false);
                Rbtn.setChecked(false);
                Sbtn.setChecked(false);
                Tbtn.setChecked(false);
                imgPet.setImageResource(0);
            }
        });
    }
}