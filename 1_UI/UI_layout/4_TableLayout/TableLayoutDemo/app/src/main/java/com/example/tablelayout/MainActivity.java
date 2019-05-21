package com.example.tablelayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{

    private Button mbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //1.定位按钮
        mbtn = (Button) findViewById(R.id.btn_last);
        //2.给按钮设置监听器
        mbtn.setOnClickListener(new View.OnClickListener()
        {
            //设置点击事件（接口的一个具体实现类，但是这个类没有起名字，故称为匿名类）
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);

            }
        });
    }


}
