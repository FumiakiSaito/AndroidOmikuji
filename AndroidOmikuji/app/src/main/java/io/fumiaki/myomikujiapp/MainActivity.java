package io.fumiaki.myomikujiapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void getOmikuji(View view) {
        // テキスト取得
        TextView tv = (TextView) findViewById(R.id.myTextView);

        // 乱数の生成
        Random randomGenerator = new Random();
        int num = randomGenerator.nextInt(3); // 0-2

        String result = Integer.toString(num);
        tv.setText(result);
    }
}
