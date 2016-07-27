package com.xpleemoon.classinit;

/**
 * Created by xplee on 16/7/26.
 */
public class SuperClass {
    static {
        System.out.println("SuperClass init!");
    }

    /**
     * 类静态字段
     */
    public static int value = 123;
}
