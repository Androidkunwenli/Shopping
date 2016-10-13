package com.china.shopping.view.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import org.senydevpkg.utils.NetworkUtils;

/**
 * Created by kunwe on 2016/10/13.
 * 初始化 activity  删除测试my
 * activity 的基类
 */

public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(initLayoutId());
    }

    public abstract int initLayoutId();

    /**
     * 判读当前网络是否可用
     *
     * @return
     */
    public boolean isNetEnable() {
        return NetworkUtils.checkNetwork(this);
    }

    /**
     * 初始监听 根据需求实现
     */
    public void initLisenter() {
    }

    /**
     * 根据业务需求，去实现该方法，用于初始化数据， 读取数据库，访问网络
     */
    public void initData() {
    }

    /**
     * 初始化view
     * 1. 如果使用注解工具，不需要重新该方法
     * 2. 如果是findById ,可以重新改方法
     */

    public void initView() {

    }

}
