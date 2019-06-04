package com.example.fragmentDemo;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    private Button mbtn_1;
    private Button mbtn_2;
    private Button mbtn_3;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        1. 设置鼠标点击事件,实现fragment 布局的动态导入效果
        mbtn_1 = (Button) findViewById(R.id.mbtn_1);
        mbtn_2 = (Button) findViewById(R.id.mbtn_2);
        mbtn_3 = (Button) findViewById(R.id.mbtn_3);

//        2.给每个按钮设置监听器
        mbtn_1.setOnClickListener(new myclicklister());
        mbtn_2.setOnClickListener(new myclicklister());
        mbtn_3.setOnClickListener(new myclicklister());

    }

    private class myclicklister implements View.OnClickListener
    {
        @Override
        public void onClick(View v)
        {
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

            switch (v.getId())
            {
                case R.id.mbtn_1:
                    AFragment aFragment = new AFragment();
                    ft.add(R.id.ll_1, aFragment);
                    ft.addToBackStack(null);

                    ft.commit();
                    Toast.makeText(MainActivity.this, "点击登录", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.mbtn_2:
                    BFragment bFragment = new BFragment();
                    ft.add(R.id.ll_1, bFragment);
                    ft.addToBackStack(null);
                    ft.commit();
                    Toast.makeText(MainActivity.this, "点击注册", Toast.LENGTH_SHORT).show();

                    break;
                case R.id.mbtn_3:
                    CFragment cFragment = new CFragment();
                    ft.add(R.id.ll_1, cFragment);
                    ft.addToBackStack(null);
                    ft.commit();
                    Toast.makeText(MainActivity.this, "点击反馈", Toast.LENGTH_SHORT).show();

                    break;
            }

        }
    }


}
