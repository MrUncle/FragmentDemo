package com.example.qyoungde.fragmentdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.TabHost;
import android.widget.Toast;

/**
 * Created by QYoungde on 2017/2/10.
 */

public class MyTabActivity1 extends Activity {


    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mytab1);
        // 获取该Activity里面的TabHost组件
        TabHost tabHost = (TabHost) findViewById(R.id.tabhost);
        tabHost.setup();


        // 创建第一个Tab页
        /*TabHost.TabSpec tab1 = tabHost.newTabSpec("tab1")
                .setIndicator("标签页一") // 设置标题
                .setContent(R.id.tab01); //设置内容
        // 添加第一个标签页
        tabHost.addTab(tab1);
        TabHost.TabSpec tab2 = tabHost.newTabSpec("tab2")
                .setIndicator("标签页二")
                .setContent(R.id.tab02);
        // 添加第二个标签页
        tabHost.addTab(tab2);
        TabHost.TabSpec tab3 = tabHost.newTabSpec("tab3")
                .setIndicator("标签页三")
                .setContent(R.id.tab03);
        // 添加第三个标签页
        tabHost.addTab(tab3);*/

        /* 以上创建和添加标签页也可以用如下代码实现 */
        tabHost.addTab(tabHost.newTabSpec("tab1").setIndicator("标签页一").setContent(R.id.tab01));
        tabHost.addTab(tabHost.newTabSpec("tab2").setIndicator("标签页二").setContent(R.id.tab02));
        tabHost.addTab(tabHost.newTabSpec("tab3").setIndicator("标签页三").setContent(R.id.tab03));

        //标签切换事件处理，setOnTabChangedListener
        tabHost.setOnTabChangedListener(new TabHost.OnTabChangeListener(){
            @Override
            // tabId是newTabSpec参数设置的tab页名，并不是layout里面的标识符id
            public void onTabChanged(String tabId) {
                if (tabId.equals("tab1")) {   //第一个标签
                    Toast.makeText(MyTabActivity1.this, "点击标签页一", Toast.LENGTH_SHORT).show();
                }
                if (tabId.equals("tab2")) {   //第二个标签
                    Toast.makeText(MyTabActivity1.this, "点击标签页二", Toast.LENGTH_SHORT).show();
                }
                if (tabId.equals("tab3")) {   //第三个标签
                    Toast.makeText(MyTabActivity1.this, "点击标签页三", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}