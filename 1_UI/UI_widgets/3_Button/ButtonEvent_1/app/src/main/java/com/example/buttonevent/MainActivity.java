package com.example.buttonevent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mBtnreg = (Button) findViewById(R.id.btn_reg);
        Button mBtnlog =(Button) findViewById(R.id.btn_log);

    }

    //布局中设置android:onClick="Click",然后在主活动中实现这个监听事件
    public void Click(View v)
    {
        switch (v.getId())
        {
            case R.id.btn_reg:
                Toast.makeText(MainActivity.this, "恭喜,已经完成注册!", Toast.LENGTH_SHORT).show();break;
            case R.id.btn_log:
                Toast.makeText(MainActivity.this,"请您登陆!",Toast.LENGTH_SHORT).show();break;
        }
    }
}
