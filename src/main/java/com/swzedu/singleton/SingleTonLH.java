package com.swzedu.singleton;

/**
 * 懒汉式
 */
public class SingleTonLH {
    private SingleTonLH() {
    }

    //在成员位置创建该类的对象
    // 使用 volatile 关键字，确保对 instance 的写入对所有线程可见
    private static volatile SingleTonLH instance;
    public static SingleTonLH getInstance() {
        if (instance == null) {
            synchronized (SingleTonLH.class){
                // 抢到锁之后需要再判断一次是否为null,因为有可能在抢锁之前，其他线程已经创建了该对象
                if (instance == null) {
                    instance = new SingleTonLH();
                }
            }
        }
        return instance;
    }


}

