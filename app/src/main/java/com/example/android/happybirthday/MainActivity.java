package com.example.android.happybirthday;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //根据ID获取button
        Button clickButton = (Button) findViewById(R.id.button);
        clickButton.setOnClickListener(new btnListener(clickButton));

        //根据ID获取button
        Button clickButton2 = (Button) findViewById(R.id.button2);
        clickButton2.setOnClickListener(new btnListener(clickButton2));

        //根据ID获取button
        Button clickButton3 = (Button) findViewById(R.id.button3);
        clickButton3.setOnClickListener(new btnListener(clickButton3));

        //根据ID获取button
        Button clickButton4 = (Button) findViewById(R.id.button4);
        clickButton4.setOnClickListener(new btnListener(clickButton4));

        //根据ID获取button
        Button clickButton5 = (Button) findViewById(R.id.button5);
        clickButton5.setOnClickListener(new btnListener(clickButton5));

    }
    // 下面的监听器类我参照了该网页的代码 ：http://www.cnblogs.com/shanhaiyang/archive/2011/07/18/2109398.html
    class btnListener implements OnClickListener
    {
        //定义一个 Button 类型的变量
        private Button btn;

        /*
         * 一个构造方法, 将Button对象做为参数
         */
        private btnListener(Button btn)
        {
            this.btn = btn;//将引用变量传递给实体变量
        }
        public void onClick(View v)
        {
            Toast toast = Toast.makeText(MainActivity.this, "启动应用："+btn.getText(), Toast.LENGTH_SHORT);
            toast.show();
        }
    }


}
