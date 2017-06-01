package com.example.denis.mycalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CalcActivity extends MainActivity {

    @BindView(R2.id.text) TextView text;
    @BindView(R2.id.button) Button button;
    @BindView(R2.id.button1) Button button1;
    @BindView(R2.id.button2) Button button2;
    @BindView(R2.id.button3) Button button3;
    @BindView(R2.id.button4) Button button4;
    @BindView(R2.id.button5) Button button5;
    @BindView(R2.id.button6) Button button6;
    @BindView(R2.id.button7) Button button7;
    @BindView(R2.id.button8) Button button8;
    @BindView(R2.id.button9) Button button9;
    @BindView(R2.id.button10) Button button10;
    @BindView(R2.id.button11) Button button11;
    @BindView(R2.id.buttonPlus) Button buttonPlus;
    @BindView(R2.id.buttonMin) Button buttonMin;
    @BindView(R2.id.buttonDelenie) Button buttonDelenie;
    @BindView(R2.id.buttonDot) Button buttonDot;
    @BindView(R2.id.buttonEqual1) Button buttonEqual1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
        ButterKnife.bind(this);

        View.OnClickListener globalClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R2.id.text:

                        break;
                    case R2.id.button:

                        break;
                    case R2.id.button1:
                        //Ваш код для кнопки "1"
                        break;
                    case R2.id.button2:
                        //Ваш код для кнопки "1"
                        break;
                    case R2.id.button3:
                        //Ваш код для кнопки "1"
                        break;
                    case R2.id.button4:
                        //Ваш код для кнопки "1"
                        break;
                    case R2.id.button5:
                        //Ваш код для кнопки "1"
                        break;
                    case R2.id.button6:
                        //Ваш код для кнопки "1"
                        break;
                    case R2.id.button7:
                        //Ваш код для кнопки "1"
                        break;
                    case R2.id.button8:
                        //Ваш код для кнопки "1"
                        break;
                    case R2.id.button9:
                        //Ваш код для кнопки "1"
                        break;
                    case R2.id.button10:
                        //Ваш код для кнопки "1"
                        break;
                    case R2.id.button11:
                        //Ваш код для кнопки "1"
                        break;
                    case R2.id.buttonDelenie:
                        //Ваш код для кнопки "1"
                        break;
                    case R2.id.buttonPlus:
                        //Ваш код для кнопки "1"
                        break;
                    case R2.id.buttonMin:
                        //Ваш код для кнопки "1"
                        break;
                    case R2.id.buttonEqual1:
                        //Ваш код для кнопки "1"
                        break;
                    case R2.id.buttonDot:
                        //Ваш код для кнопки "1"
                        break;
                }
            }
        };
    }
}