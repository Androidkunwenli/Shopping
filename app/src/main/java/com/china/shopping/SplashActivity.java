package com.china.shopping;

import com.china.shopping.view.activity.BaseActivity;

/**
 * splash界面的作用  判断版本号  初始化数据
 */
public class SplashActivity extends BaseActivity {
    /**
     * 返回一个布局,用于初始化布局
     *
     * @return
     */
    @Override
    public int initLayoutId() {
        return R.layout.activity_splash;
    }
}
