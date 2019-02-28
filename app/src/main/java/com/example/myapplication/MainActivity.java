package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mTextView;
    private Button mButton0;
    private Button mButton1;
    private Button mButton2;
    private Button mButton3;
    private Button mButton4;
    private Button mButton5;
    private Button mButton6;
    private Button mButton7;
    private Button mButton8;
    private Button mButton9;
    private Button mButtonPlus;
    private Button mButtonMinus;
    private Button mButtonEqual;
    private Button mButtonMult;
    private Button mButtonDiv;
    private Button mButtonDelete;

    String Text = "0";
    float Value1 = 0;
    float Value2 = 0;
    int Click = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton0 = (Button) findViewById(R.id.ZeroButton);
        mButton1 = (Button) findViewById(R.id.OneButton);
        mButton2 = (Button) findViewById(R.id.TwoButton);
        mButton3 = (Button) findViewById(R.id.ThreeButton);
        mButton4 = (Button) findViewById(R.id.FourButton);
        mButton5 = (Button) findViewById(R.id.FiveButton);
        mButton6 = (Button) findViewById(R.id.SixButton);
        mButton7 = (Button) findViewById(R.id.SevenButton);
        mButton8 = (Button) findViewById(R.id.EightButton);
        mButton9 = (Button) findViewById(R.id.NineButton);
        mButtonPlus = (Button) findViewById(R.id.PlusButton);
        mButtonMinus = (Button) findViewById(R.id.MinusButton);
        mButtonEqual = (Button) findViewById(R.id.EqualButton);
        mButtonMult = (Button) findViewById(R.id.MultButton);
        mButtonDiv = (Button) findViewById(R.id.DivisionButton);
        mButtonDelete = (Button) findViewById(R.id.DeleteButton);
        mTextView = (TextView) findViewById(R.id.TextView);

        mTextView.setText(Text);

        mButton0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!Text.equals("0")) {
                    mTextView.setText(Text += "0");
                }
            }
        });
        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!Text.equals("0")) {
                    mTextView.setText(Text += "1");
                }
                else {
                    mTextView.setText(Text = "1");
                }
            }
        });
        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!Text.equals("0")) {
                    mTextView.setText(Text += "2");;
                }
                else {
                    mTextView.setText(Text = "2");
                }
            }
        });
        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!Text.equals("0")) {
                    mTextView.setText(Text += "3");
                }
                else {
                    mTextView.setText(Text = "3");
                }
            }
        });
        mButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!Text.equals("0")) {
                    mTextView.setText(Text += "4");
                }
                else {
                    mTextView.setText(Text = "4");
                }
            }
        });
        mButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!Text.equals("0")) {
                    mTextView.setText(Text += "5");
                }
                else {
                    mTextView.setText(Text = "5");
                }
            }
        });
        mButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!Text.equals("0")) {
                    mTextView.setText(Text += "6");
                }
                else {
                    mTextView.setText(Text = "6");
                }
            }
        });
        mButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!Text.equals("0")) {
                    mTextView.setText(Text += "7");
                }
                else {
                    mTextView.setText(Text = "7");
                }
            }
        });
        mButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!Text.equals("0")) {
                    mTextView.setText(Text += "8");
                }
                else {
                    mTextView.setText(Text = "8");
                }
            }
        });
        mButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!Text.equals("0")) {
                    mTextView.setText(Text += "9");
                }
                else {
                    mTextView.setText(Text = "9");
                }
            }
        });
        mButtonDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTextView.setText(Text = "0");
                Click = 0;
            }
        });
        mButtonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Value1 = Integer.parseInt(Text);
                mTextView.setText(Text = "0");
                Click = 4;


            }
        });
        mButtonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Value1 = Integer.parseInt(Text);
                mTextView.setText(Text = "0");
                Click = 1;

            }
        });
        mButtonMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Value1 = Integer.parseInt(Text);
                mTextView.setText(Text = "0");
                Click = 2;

            }
        });
        mButtonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Value1 = Integer.parseInt(Text);
                mTextView.setText(Text = "0");
                Click = 3;

            }
        });
        mButtonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Value2 = Integer.parseInt(Text);
                switch (Click){
                    case (4):
                        Text = String.valueOf(Value1 + Value2);
                        mTextView.setText(Text);
                        Click = 0;
                        break;
                    case (1):
                        Text = String.valueOf(Value1 - Value2);
                        mTextView.setText(Text);
                        Click = 0;
                        break;
                    case (2):
                        Text = String.valueOf(Value1 * Value2);
                        mTextView.setText(Text);
                        Click = 0;
                        break;
                    case (3):
                        if (Value2 == 0) {
                            mTextView.setText("IMPOSSIBLE!");
                        }
                        else {
                            Text = String.valueOf(Value1 / Value2);
                            mTextView.setText(Text);
                        }
                        Click = 0;
                        break;
                        default:
                            mTextView.setText(Text=String.valueOf(Value1));

                }

            }
        });
    }

}
