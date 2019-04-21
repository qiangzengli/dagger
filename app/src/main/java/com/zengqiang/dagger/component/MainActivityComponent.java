package com.zengqiang.dagger.component;

import com.zengqiang.dagger.MainActivity;
import com.zengqiang.dagger.module.MainActivityModule;

import dagger.Component;

/**
 * @Author lizengqiang
 * @Date 2019/4/17
 * @Time 16:25
 * @Description
 */
@Component(modules = MainActivityModule.class)
public interface MainActivityComponent {
    void inject(MainActivity mainActivity);
}
