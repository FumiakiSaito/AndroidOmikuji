package io.fumiaki.myomikujiapp;

import android.graphics.Color;
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

        String[] results = {
                "大吉",
                "吉",
                "凶"
        };

        // 乱数の生成
        Random randomGenerator = new Random();

        // 結果個数取得
        int resultsCount = results.length;
        int num = randomGenerator.nextInt(resultsCount);

        String result = Integer.toString(num);

        /*
        Color.RED
        Color.BLACK
        Color.rgb(255, 0, 0)
        Color.argb(127, 255, 0, 0)
        Color.parseColor("#ff0000")
         */

        if (num == 0) {
            tv.setTextColor(Color.RED);
        } else {
            tv.setTextColor(Color.BLACK);
        }

        tv.setText(results[num]);
    }
}
