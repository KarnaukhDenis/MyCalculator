package com.example.denis.mycalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CalcActivity extends MainActivity {

    @BindView(R2.id.editText) EditText editText;
    @BindView(R2.id.buttonOne) Button buttonOne;
    @BindView(R2.id.buttonTwo) Button buttonTwo;
    @BindView(R2.id.buttonThree) Button buttonThree;
    @BindView(R2.id.buttonFour) Button buttonFour;
    @BindView(R2.id.buttonFive) Button buttonFive;
    @BindView(R2.id.buttonSix) Button buttonSix;
    @BindView(R2.id.buttonSeven) Button buttonSeven;
    @BindView(R2.id.buttonEight) Button buttonEight;
    @BindView(R2.id.buttonNine) Button buttonNine;
    @BindView(R2.id.buttonZero) Button buttonZero;
    @BindView(R2.id.buttonMul) Button buttonMul;
    @BindView(R2.id.buttonDot) Button buttonDot;
    @BindView(R2.id.buttonPlus) Button buttonPlus;
    @BindView(R2.id.buttonMinus) Button buttonMin;
    @BindView(R2.id.buttonDelenie) Button buttonDelenie;
    @BindView(R2.id.buttonC) Button buttonC;
    @BindView(R2.id.buttonEqual) Button buttonEqual;

    enum MathOperation {PLUS, MINUS, DIVIDE, MULTIPLY}
    MathOperation mathOperation;
    Float valueOne;
    Float valueSecond;
    Float[]  resultEdit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
        ButterKnife.bind(this);

        View.OnClickListener globalClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R2.id.editText:

                        break;
                    case R2.id.buttonOne:
                        editText.setText("1");
                        editText.setText(editText.getText()+"1");
                        break;
                    case R2.id.buttonTwo:
                        editText.setText("2");
                        break;
                    case R2.id.buttonThree:
                        editText.setText("3");
                        break;
                    case R2.id.buttonFour:
                        editText.setText("4");
                        break;
                    case R2.id.buttonFive:
                        editText.setText("5");
                        break;
                    case R2.id.buttonSix:
                        editText.setText("6");
                        break;
                    case R2.id.buttonSeven:
                        editText.setText("7");
                        break;
                    case R2.id.buttonEight:
                        editText.setText("8");
                        break;
                    case R2.id.buttonNine:
                        editText.setText("9");
                        break;
                    case R2.id.buttonZero:
                        editText.setText("0");
                        break;
                    case R2.id.buttonMul:
                        //Ваш код для кнопки "*"
                        break;
                    case R2.id.buttonDot:
                        editText.setText(".");
                        break;
                    case R2.id.buttonDelenie:
                        //Ваш код для кнопки "/"
                        break;
                    case R2.id.buttonPlus:

                        break;
                    case R2.id.buttonMinus:
                        //Ваш код для кнопки "-"
                        break;
                    case R2.id.buttonEqual:
                        //Ваш код для кнопки "="
                        break;
                    case R2.id.buttonC:
                        //Ваш код для кнопки "C"
                        break;
                }
            }
        };
        buttonOne.setOnClickListener(globalClickListener);
        buttonTwo.setOnClickListener(globalClickListener);
        buttonThree.setOnClickListener(globalClickListener);
        buttonFour.setOnClickListener(globalClickListener);
        buttonFive.setOnClickListener(globalClickListener);
        buttonSix.setOnClickListener(globalClickListener);
        buttonSeven.setOnClickListener(globalClickListener);
        buttonEight.setOnClickListener(globalClickListener);
        buttonNine.setOnClickListener(globalClickListener);
        buttonDelenie.setOnClickListener(globalClickListener);
        buttonDot.setOnClickListener(globalClickListener);
        buttonPlus.setOnClickListener(globalClickListener);
        buttonMin.setOnClickListener(globalClickListener);
        buttonC.setOnClickListener(globalClickListener);
        buttonEqual.setOnClickListener(globalClickListener);
        buttonMul.setOnClickListener(globalClickListener);
    }
}