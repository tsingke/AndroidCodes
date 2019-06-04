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
