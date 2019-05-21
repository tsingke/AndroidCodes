package com.example.inerfaceimtbtn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    private  Button mBtnreg;
    private  Button mBtnlog;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //    1.定位事件源头
        mBtnreg = findViewById(R.id.btn_reg);
        mBtnlog = findViewById(R.id.btn_log);

        //2. 给事件源设置监听器
        mBtnreg.setOnClickListener(MainActivity.this);
        mBtnlog.setOnClickListener(MainActivity.this);
    }

//    本类开始实现接口 onclicklistener(), 由于该抽象接口中只有一个抽象方法,故实现该唯一的方法即可
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.btn_reg:
                Toast.makeText(MainActivity.this, "恭喜您已经完成注册!",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_log:
                Toast.makeText(MainActivity.this, "请阁下登陆系统!",Toast.LENGTH_SHORT).show();
                break;
        }

    }


}
