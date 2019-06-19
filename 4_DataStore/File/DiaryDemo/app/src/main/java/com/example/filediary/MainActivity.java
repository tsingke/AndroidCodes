package com.example.filediary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity
{

    private Button mbtn_save;
    private Button mbtn_show;
    private Button mbtn_exit;

    private EditText et_content;

    byte[] buffer = null;//定义保存日记信息的字节数组

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //获取按钮和日志框对象实例
        mbtn_save = findViewById(R.id.btn_save);
        mbtn_show = findViewById(R.id.btn_show);
        mbtn_exit = findViewById(R.id.btn_exit);
        et_content = findViewById(R.id.et_content);


        /********功能1：采用文件输出流将日志信息写入到内部文件（点击按钮实现日记数据保存）**********/
        mbtn_save.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //通过FileOutputStream流实现数据的存储

                FileOutputStream fos = null;
                try
                {
                    //1. 打开文件输出流
                    fos = openFileOutput("diary.txt", MODE_PRIVATE);

                    //2. 获取日记信息
                    String content = et_content.getText().toString();

                    //3. 将日记信息按照字节流形式保存到内部文件diary.txt中
                    try
                    {
                        fos.write(content.getBytes());
                        fos.flush();//清除缓存
                    } catch (IOException e)
                    {
                        e.printStackTrace();
                    }

                } catch (FileNotFoundException e)
                {
                    e.printStackTrace();
                } finally
                {
                    //4.关闭文件输出流
                    if (fos != null)
                        try
                        {
                            fos.close();
                            Toast.makeText(MainActivity.this, "日记信息保存成功", Toast.LENGTH_SHORT).show();
                        } catch (IOException e)
                        {
                            e.printStackTrace();
                        }
                }
            }
        });

        /********功能2：采用文件输入流读取文件信息到内存指定位置（点击按钮实现日记数据读取）**********/
        mbtn_show.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                FileInputStream fis = null;

                try
                {
                    //1. 打开文件输入流
                    fis = openFileInput("diary.txt");

                    //2. 新建字节数组，用于存储输入流过来的字节数据
                    buffer = new byte[fis.available()];

                    //3.读取输入流中的数据到内存中的字节数组内
                    fis.read(buffer);

                } catch (FileNotFoundException e)
                {
                    e.printStackTrace();
                } catch (IOException e)
                {
                    e.printStackTrace();
                }
                finally
                {
                    if (fis != null)
                    {
                        try
                        {
                            //4. 关闭文件输入流
                            fis.close();

                            //5. 将读取到的日记数据在页面内显示出来
                            String tempData = new String(buffer);
                            et_content.setText(tempData);

                            Toast.makeText(MainActivity.this, "日记信息读取成功！", Toast.LENGTH_SHORT).show();

                        } catch (IOException e)
                        {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });

        /********功能3：直接退出当前程序（点击按钮直接退出程序）**********/
        mbtn_exit.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(MainActivity.this, "退出当前程序！", Toast.LENGTH_SHORT).show();
                finish();//直接退出程序
            }
        });


    }
}
