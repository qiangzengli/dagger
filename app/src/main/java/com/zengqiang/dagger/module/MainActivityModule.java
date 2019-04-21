package com.zengqiang.dagger.module;

import com.zengqiang.dagger.MainActivity;
import com.zengqiang.dagger.bean.Student;

import dagger.Module;
import dagger.Provides;

/**
 * @Author lizengqiang
 * @Date 2019/4/17
 * @Time 16:25
 * @Description
 */
@Module
public class MainActivityModule {
    private MainActivity mainActivity;

    public MainActivityModule(MainActivity activity) {
        this.mainActivity = activity;
    }

    @Provides
    Student provideStudent(){
        return new Student();
    }
}
