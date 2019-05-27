package com.example.edittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    private Button mbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //mbtn.setOnClickListener();
        mbtn = (Button) findViewById(R.id.btn_1);

        //2.设置监听器
//        mbtn.setOnClickListener(new View.OnClickListener()
//        {
//            @Override
//            public void onClick(View v)
//            {
//                Toast.makeText(MainActivity.this, "恭喜你已经完成注册！", Toast.LENGTH_SHORT).show();
//            }
//        });

    }


    public void myclick(View v)
    {
        Toast.makeText(MainActivity.this, "恭喜你已经完成注册！", Toast.LENGTH_SHORT).show();
    }

//    class father implements View.OnClickListener
//    {
//        @Override
//        public void onClick(View v)
//        {
//            Toast.makeText(MainActivity.this, "恭喜你已经完成注册！", Toast.LENGTH_SHORT).show();
//        }
//    }


}
