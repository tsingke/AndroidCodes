# AndroidCodes


移动计算-`Android编程`课堂演示代码

---

**文件说明**：

`Fragment` :    

* **Fragment加载方法** :直接在布局里加载Fragment(效果图)

<img src="https://github.com/tsingke/AndroidCodes/blob/master/3_Fragment/Fragment_1/fragment_1.png" width=300 height=497.4 /> 


```xml
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical">

    <TextView
        android:id="@+id/tv_1"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:background="#E91E63"
        android:gravity="center"
        android:text="MainActivity主页面"
        android:textColor="#fff"
        android:textSize="20sp"
        android:textStyle="bold" />

    <TextView
        android:id="@+id/tv_note"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_below="@id/tv_1"
        android:layout_marginTop="20dp"
        android:layout_marginBottom="20dp"
        android:gravity="center"

        android:text="布局法添加两个fragment内容"
        android:textSize="20sp" />

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:layout_below="@id/tv_note"
        android:orientation="horizontal">
        <!--加载第一个fragment-->
        <fragment
            android:id="@+id/frag_1"
            android:name="com.example.fragment.FragmentA"
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1" />
        
        <!--加载第二个fragment-->
        <fragment
            android:id="@+id/frag_2"
            android:name="com.example.fragment.FragmentB"
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1" />
    </LinearLayout>
</RelativeLayout>
```
