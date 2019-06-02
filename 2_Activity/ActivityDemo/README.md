# AndroidCodes

`Activity` :    activity的创建与属性配置 


<img src="https://github.com/tsingke/AndroidCodes/blob/master/2_Activity/ActivityDemo/home.png" width=200 height=364 />  <img src="https://github.com/tsingke/AndroidCodes/blob/master/2_Activity/ActivityDemo/log.png" width=200 height=364 />   <img src="https://github.com/tsingke/AndroidCodes/blob/master/2_Activity/ActivityDemo/reg.png" width=200 height=364 /> 

页面跳转 java 核心实现源码

```java
package com.example.activitydemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //定位按钮并为其设置监听器
        findViewById(R.id.m_btn_1).setOnClickListener(new onClick());
        findViewById(R.id.m_btn_2).setOnClickListener(new onClick());

    }

    private class onClick implements View.OnClickListener
    {
        Intent intent=null;
        @Override
        public void onClick(View v)
        {
            switch (v.getId())
            {
                case R.id.m_btn_1:
                    intent = new Intent(MainActivity.this, LoginActivity.class);
                    startActivity(intent);

                    Toast.makeText(MainActivity.this, "跳转成功", Toast.LENGTH_SHORT).show();

                    break;

                case R.id.m_btn_2:
                    intent = new Intent(MainActivity.this, RegActivity.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity.this, "跳转成功", Toast.LENGTH_SHORT).show();

                    break;
            }
        }
    }
}


```




