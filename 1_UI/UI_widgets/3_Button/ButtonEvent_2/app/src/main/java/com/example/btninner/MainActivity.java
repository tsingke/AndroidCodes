package com.example.btninner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    private  Button mBtnreg;
    private  Button mBtnlog;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        1.定位要监视的按钮(监听源)
        mBtnreg = (Button) findViewById(R.id.btn_reg);
        mBtnlog = (Button) findViewById(R.id.btn_log);

        //2.为各个按钮注册一种监听器(监听者)
        mBtnreg.setOnClickListener(new mylistener());
        mBtnlog.setOnClickListener(new mylistener());
    }

    //定义一个具体的类,实现包 View 内的抽象接口onClickListener,并实现其内的唯一方法onClic()
    class mylistener implements View.OnClickListener
    {
        @Override
        //监听事件
        public void onClick(View v)
        {
            switch (v.getId())
            {
                case R.id.btn_reg://注册按钮
                    Toast.makeText(MainActivity.this, "恭喜,已经完成注册!", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.btn_log://登陆按钮
                    Toast.makeText(MainActivity.this,"请您登陆!",Toast.LENGTH_SHORT).show();
                    break;
            }
        }
    }
}
