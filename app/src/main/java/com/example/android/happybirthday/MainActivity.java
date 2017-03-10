package com.example.android.happybirthday;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    //private RelativeLayout relativeLayout;

    private LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //获得控件对象

        linearLayout = (LinearLayout)findViewById(R.id.linearLayout);



        //利用循环添加5个按钮

        for(int i = 0; i < 5; i ++){
            //创建一个Button对象
            Button btn = new Button(this);
            //设置对象的id
            btn.setId(i);
            if(i == 0){
                btn.setText("热门电影");
            }else if(i == 1){
                btn.setText("热门电影1");
            }else if(i == 2){
                btn.setText("热门电影2");
            }else if(i == 3){
                btn.setText("热门电影3");
            }else if(i == 4){
                btn.setText("热门电影4");
            }

//            btn.setOnClickListener(new View.OnClickListener() {
//               public void onClick(View v) {
//                   Toast toast = Toast.makeText(MainActivity.this, "这是一个普通的Toast!", Toast.LENGTH_SHORT);
//                   toast.show();
//               }
//            });

            btn.setOnClickListener(new btnListener(btn));

            linearLayout.addView(btn);

        }




//       Button clickButton = (Button) findViewById(R.id.button1);
//
//       clickButton.setOnClickListener(new View.OnClickListener() {
//               public void onClick(View v) {
//                   Toast toast = Toast.makeText(MainActivity.this, "这是一个普通的Toast!", Toast.LENGTH_SHORT);
//                   toast.show();
//               }
//
//       });

    }

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
            btn.setText("Welcome!");//改变按钮的名字
        }
    }
}
