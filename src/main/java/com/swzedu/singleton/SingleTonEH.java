package com.swzedu.singleton;

/**
 * 饿汉式
 */
public class SingleTonEH {
    private SingleTonEH(){

    }
    // 静态变量，在类加载时会初始化
    private static SingleTonEH singleTonEH = new SingleTonEH();
    public static SingleTonEH getInstance(){
        return singleTonEH;
    }

}

