# UI设计+Activity综合巩固实例

<img src="https://github.com/tsingke/AndroidCodes/blob/master/2_Activity/ReviewDemo/login.png" width=200  height=362.6 />  <img src="https://github.com/tsingke/AndroidCodes/blob/master/2_Activity/ReviewDemo/register.png" width=200  height=362.4  />


**java代码**

```java
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


```
----

**布局代码**

```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical">

    <ImageView
        android:layout_width="120dp"
        android:layout_height="120dp"
        android:layout_gravity="center"
        android:layout_marginTop="40dp"
        android:src="@drawable/logo" />

    <!--表格布局 放置登陆信息-->
    <TableLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_gravity="center"
        android:layout_marginTop="50dp">
        <!--第一行:姓名栏-->
        <TableRow>
            <!--第1列-->
            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_column="0"
                android:text="学号:"
                android:inputType="numberDecimal"
                android:textSize="20sp"
                android:textStyle="bold"
                android:gravity="right" />
            <!--第2列-->
            <EditText
                android:layout_width="240dp"
                android:layout_height="50dp"
                android:layout_column="1"
                android:gravity="center"
                android:hint="请输入学号" />
        </TableRow>

        <!--第二行:密码栏-->
        <TableRow>
            <!--第1列-->
            <TextView
                android:layout_width="120dp"
                android:layout_height="wrap_content"
                android:layout_column="0"
                android:text="密码:"
                android:textSize="20sp"
                android:textStyle="bold"
                android:gravity="right"
                />
            <!--第2列-->
            <EditText
                android:layout_width="240dp"
                android:layout_height="50dp"
                android:layout_column="1"
                android:hint="请输入密码"
                android:inputType="textPassword"
                android:gravity="center"/>
        </TableRow>
    </TableLayout>

    <!--线性布局：放置2个复选按钮-->
    <LinearLayout
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="center"
        android:layout_marginTop="15dp">
        <!--复选框1-->
        <CheckBox
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="记住密码" />

        <!--复选框2-->
        <CheckBox
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginLeft="30dp"
            android:text="自动登陆" />
    </LinearLayout>

    <!--相对布局：放置登陆按钮-->
    <RelativeLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginTop="50dp">

        <Button
            android:id="@+id/btn_login"
            android:layout_width="130dp"
            android:layout_height="wrap_content"
            android:layout_marginLeft="80dp"
            android:text="登   陆" />

        <Button
            android:id="@+id/btn_register"
            android:layout_width="130dp"
            android:layout_height="wrap_content"
            android:layout_alignBottom="@id/btn_login"
            android:layout_marginLeft="20dp"
            android:layout_toRightOf="@id/btn_login"
            android:text="注   册" />
    </RelativeLayout>

</LinearLayout>

```

