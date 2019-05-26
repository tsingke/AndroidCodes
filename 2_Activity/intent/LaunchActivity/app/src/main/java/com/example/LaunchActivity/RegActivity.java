package com.example.LaunchActivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class RegActivity extends AppCompatActivity
{

    private Button mregs;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);


//        1.定位注册按钮
        mregs = (Button) findViewById(R.id.btn_regs);

//         2.设置监听器
         mregs.setOnClickListener(new View.OnClickListener()
         {
             @Override
             public void onClick(View v)
             {
                 Toast.makeText(RegActivity.this, "注册成功,返回登陆！", Toast.LENGTH_LONG).show();

                 Intent intent = new Intent(RegActivity.this, MainActivity.class);

                 startActivity(intent);
             }
         });


    }

}
