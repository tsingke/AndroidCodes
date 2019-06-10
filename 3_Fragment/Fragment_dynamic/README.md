# AndroidCodes


移动计算-`Android编程`课堂演示代码

---

**文件说明**：

`Fragment` :    

* **Fragment动态加载方法** :直接在activity类代码里加载Fragment(效果图)
<img src="https://github.com/tsingke/AndroidCodes/blob/master/3_Fragment/Fragment_dynamic/fragment.gif" width=300 height=600> 


activity内加载fragment的核心代码（五大步骤）


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
        android:id="@+id/frame_content">

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
    <!--放置 fragment导航栏-->
    <Button
        android:id="@+id/mbtn_1"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="点击按钮显示Fragment"
        android:textColor="#fff"
        android:background="#009688"
        android:textSize="20sp"
        android:textStyle="bold"

        android:layout_alignParentBottom="true"
        />
</RelativeLayout>

```


-----
**在java类实现动态加载fragment的方法**
-----


```java

package com.example.dynamicfragment;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.mbtn_1);

        /*加载fragment的五个核心步骤*/
        btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                // 1.生成fragment对象实例
                LogFragment reg = new LogFragment();

                // 2.获取fragment管理对象
                FragmentManager fm = getSupportFragmentManager();

                //3. 开启fragment事务
                FragmentTransaction ft = fm.beginTransaction();

                //4. 加载fragment到activity指定位置
                ft.add(R.id.frame_content, reg);
                //ft.replace(R.id.frame_content, reg);
                ft.addToBackStack(null);//实现返回栈效果

                //5. 执行加载事务
                ft.commit();


//                设置提示信息
                Toast.makeText(MainActivity.this, "完成Fragment加载！", Toast.LENGTH_SHORT).show();
            }
        });

    }
}

```
