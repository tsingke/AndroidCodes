# AndroidCodes


移动计算-`Android编程`课堂演示代码
---
**文件说明**： `Fragment` 动态创建方法    

* **Fragment加载方法** :在Activity里加载Fragment

a. 主页面Activity 效果图

<img src="https://github.com/tsingke/AndroidCodes/blob/master/3_Fragment/Fragment_2/main.png" width=200 height=363.2 /> 


b.  三个 Fragment 页面效果图（分别点击登陆按钮、注册按钮、反馈按钮）

<img src="https://github.com/tsingke/AndroidCodes/blob/master/3_Fragment/Fragment_2/log.png" width=200 height=363.2 /> <img src="https://github.com/tsingke/AndroidCodes/blob/master/3_Fragment/Fragment_2/reg.png" width=200 height=363.2 /> <img src="https://github.com/tsingke/AndroidCodes/blob/master/3_Fragment/Fragment_2/feedback.png" width=200 height=363.2 /> 

---
核心源码

```java

package com.example.fragmentDemo;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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
                    ft.commit();
                    break;
                case R.id.mbtn_2:
                    BFragment bFragment = new BFragment();
                    ft.add(R.id.ll_1, bFragment);
                    ft.commit();
                    break;
                case R.id.mbtn_3:
                    CFragment cFragment = new CFragment();
                    ft.add(R.id.ll_1, cFragment);
                    ft.commit();
                    break;
            }
        }
    }

}
```

MainActivity的布局文件

```xml
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical">

    <!--这个帧布局用来显示各个Fragment页面-->
    <FrameLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:background="@drawable/bg_greenblue"
        android:orientation="vertical"
        android:id="@+id/ll_1">

        <ImageView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:src="@drawable/android"
            android:layout_gravity="center"
            />
        <TextView
            android:id="@+id/tv_1"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="Activit中显示Fragment页面(演示)"
            android:textSize="20sp"
            android:textColor="#fff"
            android:textStyle="bold"
            android:gravity="center"
            android:background="#D81B60"
            />
    </FrameLayout>
<!--放置 fragment 的三个导航栏-->
    <TableLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_alignParentBottom="true"
        >
        <TableRow>

            <Button
                android:id="@+id/mbtn_1"
                android:layout_width="0dp"
                android:layout_height="wrap_content"
                android:text="登陆"
                android:background="#AED581"
                android:textSize="20sp"
                android:layout_alignParentBottom="true"
                android:layout_weight="1"
                />

            <Button
                android:id="@+id/mbtn_2"
                android:layout_width="0dp"
                android:layout_height="wrap_content"
                android:text="注册"
                android:background="#FFB74D"
                android:textSize="20sp"
                android:layout_alignParentBottom="true"
                android:layout_toRightOf="@id/mbtn_1"
                android:layout_weight="1"
                />

            <Button
                android:id="@+id/mbtn_3"
                android:layout_width="0dp"
                android:layout_height="wrap_content"
                android:text="反馈"
                android:background="#4FC3F7"
                android:textSize="20sp"
                android:layout_alignParentBottom="true"
                android:layout_toRightOf="@id/mbtn_3"
                android:layout_weight="1"
                />
        </TableRow>
    </TableLayout>
</RelativeLayout>
```


