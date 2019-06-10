package com.example.sharedpreferencesdemo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    private Button mBtn_login;

    final String myname = "zhangqingke";
    final String mypwd = "109821";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //定位登陆框和密码框
        final EditText nameET = findViewById(R.id.et_username);
        final EditText pwdET = findViewById(R.id.et_password);

        //定位按钮
        mBtn_login = findViewById(R.id.btn_login);

        //获得sharedPreferences对象(只有这个对象有权限读取后台数据)
        final SharedPreferences sp = getSharedPreferences("data", MODE_PRIVATE);

        /******************功能1：实现自动登陆功能（读取后台数据）******************************/

        //a. 从后台数据库里获取账号和密码
        String readName = sp.getString("et_username", null);
        String readPwd = sp.getString("et_password", null);

        //b.根据或得到key-value数值验证无误后尝试自动登陆
        if (readName!=null && readPwd!=null)
        {
            if (readName.equals(myname) && readPwd.equals(mypwd))
            {
                Toast.makeText(this, "登陆成功,开始跳转！", Toast.LENGTH_SHORT).show();
                //页面跳转
                Intent intent = new Intent(MainActivity.this, ContentActivity.class);
                startActivity(intent);
            }
        }
        else
        {
            /*--------------------:功能2：手动登陆功能（存入用户数据）-----------------------*/
            mBtn_login.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    //1. 获取用户输入的账号和密码
                    String inUsername = nameET.getText().toString();
                    String inPassword = pwdET.getText().toString();

                    //获取edit可编辑对象
                    SharedPreferences.Editor edit = sp.edit();

                    //2. 保存用户正确输入的账号和密码
                    if (inUsername.equals(myname) && inPassword.equals(mypwd))
                    {
                        //添加用户数据到data.xml
                        edit.putString("et_username", inUsername);//保存账号
                        edit.putString("et_password", inPassword);//保存密码
                        edit.commit();

                        //页面跳转
                        Intent intent = new Intent(MainActivity.this, ContentActivity.class);
                        startActivity(intent);
                        Toast.makeText(MainActivity.this, "已完成保存，开始登陆", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this, "账号密码不对，请重新输入！", Toast.LENGTH_SHORT).show();
                    }
                }
            });

        }


    }
}
