静态加载Fragment效果图



<img src="https://github.com/tsingke/AndroidCodes/blob/master/3_Fragment/Fragment_Static/%E9%9D%99%E6%80%81%E5%8A%A0%E8%BD%BDfragment.png" width=200 height=364/>


实现方法： 在activity布局文件里通过\<fragment  android: name="包.fragment类名" \/\> 方式引入

```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical">

    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:gravity="center"
        android:text="主页面Activity"
        android:textColor="#C62828"
        android:textSize="20sp" />

    <!--放置2个Fragment-->
    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:orientation="horizontal">

        <fragment
            android:id="@+id/fragment_1"
            android:name="com.example.staticfragment.AFragment"
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1" />

        <fragment
            android:id="@+id/fragment_2"
            android:name="com.example.staticfragment.BFragment"
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1" />
    </LinearLayout>

</LinearLayout>

```
