package com.viewpager.tab.activity;

import com.yline.application.BaseApplication;
import com.yline.application.SDKConfig;

import android.os.Message;

public class MainApplication extends BaseApplication
{
    public static final String TAG = "ViewPagerTab";
    
    @Override
    protected void handlerDefault(Message msg)
    {
        
    }
    
    @Override
    protected SDKConfig initConfig()
    {
        SDKConfig appConfig = new SDKConfig();
        appConfig.setLogFilePath("ViewPagerTab"); // 默认开启日志,并写到文件中
        return appConfig;
    }
}
