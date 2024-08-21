package com.swzedu.singleton;

/**
 * 懒汉式
 */
public class SingleTonLH {
    private SingleTonLH() {
    }

    //在成员位置创建该类的对象
    private static SingleTonLH instance;

    public synchronized static SingleTonLH getInstance() {
        if (instance == null) {
            return new SingleTonLH();
        }
        return instance;
    }

}

