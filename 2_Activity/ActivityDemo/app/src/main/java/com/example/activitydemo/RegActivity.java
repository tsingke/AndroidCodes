package com.example.activitydemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class RegActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);

        //定位按钮并为其设置监听器
        findViewById(R.id.b_btn_1).setOnClickListener(new onClick());
        findViewById(R.id.b_btn_2).setOnClickListener(new onClick());
    }

    private class onClick implements View.OnClickListener
    {
        Intent intent=null;
        @Override
        public void onClick(View v)
        {
            switch (v.getId())
            {
                case R.id.b_btn_1:
                    intent = new Intent(RegActivity.this, MainActivity.class);
                    startActivity(intent);

                    Toast.makeText(RegActivity.this, "跳转成功", Toast.LENGTH_SHORT).show();

                    break;

                case R.id.b_btn_2:
                    intent = new Intent(RegActivity.this, LoginActivity.class);
                    startActivity(intent);
                    Toast.makeText(RegActivity.this, "跳转成功", Toast.LENGTH_SHORT).show();

                    break;
            }
        }
    }
}
