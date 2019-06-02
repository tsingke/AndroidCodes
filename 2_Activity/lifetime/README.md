# AndroidCodes


移动计算-`Android编程`课堂演示代码

---

**文件说明**：

`lifetime` :    activity生命周期代码示例 


<img src="https://github.com/tsingke/AndroidCodes/blob/master/2_Activity/lifetime/lifecycle.png" width=700 height=370 /> 


生命周期演示核心java 源码

```java

package com.example.lifecycle;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import static android.content.ContentValues.TAG;

public class MainActivity extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate: 方法被执行");
    }

    @Override
    protected void onStart()
    {
        super.onStart();
        Log.i(TAG, "onStart: 方法被调用");
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        Log.i(TAG, "onResume: 方法被调用");
    }

    //---------------------------------------------------

    @Override
    protected void onRestart()
    {
        super.onRestart();
        Log.i(TAG, "onRestart: 方法被执行");
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        Log.i(TAG, "onPause: 方法被执行");
    }

    @Override
    protected void onStop()
    {
        super.onStop();
        Log.i(TAG, "onStop: 方法被调用");

    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Log.i(TAG, "onDestroy: 方法被调用");
    }
}


```
