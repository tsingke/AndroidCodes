package com.example.LaunchActivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    private Button mBtnreg;
    private Button mBtnlog;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //1. 定位注册和登陆按钮（获得他们的实例）
        mBtnlog = findViewById(R.id.btn_log);
        mBtnreg = findViewById(R.id.btn_reg);

//        2-1: 为登陆按钮设置监听器+设置执行事件(匿名内部类的方式)
        mBtnlog.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(MainActivity.this, "登陆成功!", Toast.LENGTH_SHORT).show();

            }
        });


        //        2-2 :为注册按钮设置监听器+设置执行事件(匿名内部类的方式)
        mBtnreg.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(MainActivity.this, "开始注册!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, RegActivity.class);
                startActivity(intent);
            }
        });
    }
}
