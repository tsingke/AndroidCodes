package com.example.anonymousinnerbtn;

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
        //1. 定位按钮
        mBtnreg = findViewById(R.id.btn_reg);
        mBtnlog = findViewById(R.id.btn_log);

//        2-1 :为注册按钮设置监听器+设置执行事件(匿名内部类的方式)
        mBtnreg.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(MainActivity.this,"恭喜您已经完成注册!",Toast.LENGTH_SHORT).show();
            }
        });

//        2-2: 为登陆按钮设置监听器+设置执行事件(匿名内部类的方式)
        mBtnlog.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(MainActivity.this,"请您登陆!",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
