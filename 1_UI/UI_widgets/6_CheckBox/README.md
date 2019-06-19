移动计算-android开发

### 复选框控件 `CheckBox`

<img src="https://github.com/tsingke/AndroidCodes/blob/master/1_UI/UI_widgets/6_CheckBox/CheckBox.png" width=200 height=400 />


布局文件

```xml

<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:padding="20dp">

    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:background="#D32F2F"
        android:gravity="center"
        android:text="CheckBox控件演示效果"
        android:textColor="#FFF"
        android:textSize="20sp" />

    <!--第一个问题-->
    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:gravity="center"
        android:text="请选择您的爱好:"
        android:layout_marginTop="10dp"
        android:textSize="15sp"
        android:textColor="#00796B" />

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginTop="5dp"
        android:orientation="horizontal">

        <CheckBox
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="运动" />

        <CheckBox
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="音乐" />

        <CheckBox
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="电影" />

        <CheckBox
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="旅游" />

        <CheckBox
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="爬山" />
    </LinearLayout>

    <!--第二个问题-->
    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="vertical">

        <TextView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginTop="10dp"
            android:text="请勾选位于美国的世界一流高校？"
            android:textColor="#00796B"
            android:textSize="15sp" />

        <CheckBox
            android:id="@+id/id_checkbox_1"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="哈佛大学" />

        <CheckBox
            android:id="@+id/id_checkbox_2"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="牛津大学" />

        <CheckBox
            android:id="@+id/id_checkbox_3"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="麻省理工学院" />

        <CheckBox
            android:id="@+id/id_checkbox_4"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="加州大学" />

        <CheckBox
            android:id="@+id/id_checkbox_5"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="清华大学" />

        <CheckBox
            android:id="@+id/id_checkbox_6"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="北京大学" />

        <CheckBox
            android:id="@+id/id_checkbox_7"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="剑桥大学" />

        <CheckBox
            android:id="@+id/id_checkbox_8"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="斯坦福大学" />

        <!--<view-->
            <!--android:layout_width="match_parent"-->
            <!--android:layout_height="1dp" />-->
    </LinearLayout>

    <Button
        android:id="@+id/btn_submit"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginTop="30dp"
        android:text="提 交 调 查 问 卷"
        />


</LinearLayout>

```
