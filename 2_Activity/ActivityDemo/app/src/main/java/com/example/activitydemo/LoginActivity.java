package com.example.activitydemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //定位按钮并为其设置监听器
        findViewById(R.id.a_btn_1).setOnClickListener(new onClick());
        findViewById(R.id.a_btn_2).setOnClickListener(new onClick());

    }

    private class onClick implements View.OnClickListener
    {
        Intent intent=null;
        @Override
        public void onClick(View v)
        {
            switch (v.getId())
            {
                case R.id.a_btn_1:
                    intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);

                    break;

                case R.id.a_btn_2:
                    intent = new Intent(LoginActivity.this, RegActivity.class);
                    startActivity(intent);
                    break;
            }
        }
    }

}
