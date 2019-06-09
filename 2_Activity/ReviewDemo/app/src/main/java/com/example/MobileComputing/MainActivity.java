package com.example.MobileComputing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    private Button mBtn_login;
    private Button mBtn_register;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //1. 定位按钮，获取按钮实例
        mBtn_login = findViewById(R.id.btn_login);
        mBtn_register = findViewById(R.id.btn_register);

        //2. 为登陆按钮设置点击监听事件
        mBtn_login.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(MainActivity.this, "您已点击登陆按钮！", Toast.LENGTH_SHORT).show();
            }
        });

        //3. 为注册按钮设置点击监听事件
        mBtn_register.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(MainActivity.this, "您已点击注册按钮，开始页面跳转！", Toast.LENGTH_SHORT).show();

                //页面跳转
                Intent myintent = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(myintent);

            }
        });
    }

}
