package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onplus(View view){
        //get editText
        EditText et1 = (EditText)findViewById(R.id.eText1);
        EditText et2 = (EditText)findViewById(R.id.eText2);
        //stringに
        String str1 = et1.getText().toString();
        String str2 = et2.getText().toString();
        //intに変換
        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);

        //plus
        int ans = num1+num2;
        ((TextView)findViewById(R.id.textAnswer)).setText("" + ans);
    }
    public void onminus(View view){
        //get editText
        EditText et1 = (EditText)findViewById(R.id.eText1);
        EditText et2 = (EditText)findViewById(R.id.eText2);
        //stringに
        String str1 = et1.getText().toString();
        String str2 = et2.getText().toString();
        //intに変換
        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);

        //minus
        int ans = num1-num2;
        ((TextView)findViewById(R.id.textAnswer)).setText("" + ans);
    }
    public void ontimes(View view){
        //get editText
        EditText et1 = (EditText)findViewById(R.id.eText1);
        EditText et2 = (EditText)findViewById(R.id.eText2);
        //stringに
        String str1 = et1.getText().toString();
        String str2 = et2.getText().toString();
        //intに変換
        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);

        //times
        int ans = num1*num2;
        ((TextView)findViewById(R.id.textAnswer)).setText("" + ans);
    }
    public void ondivided(View view){
        //get editText
        EditText et1 = (EditText)findViewById(R.id.eText1);
        EditText et2 = (EditText)findViewById(R.id.eText2);
        //stringに
        String str1 = et1.getText().toString();
        String str2 = et2.getText().toString();
        //doubleに変換
        double num1 = Double.parseDouble(str1);
        double num2 = Double.parseDouble(str2);

        //divide
        double ans = num1/num2;
        ((TextView)findViewById(R.id.textAnswer)).setText("" + ans);
    }
    public void onclear(View view){
        //get editText
        ((EditText)findViewById(R.id.eText1)).getText().clear();
        ((EditText)findViewById(R.id.eText2)).getText().clear();
        ((TextView)findViewById(R.id.textAnswer)).setText("Answer");

    }

}