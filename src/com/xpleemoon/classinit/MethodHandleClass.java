package com.xpleemoon.classinit;

/**
 * Created by xplee on 16/7/27.
 */
public class MethodHandleClass {
    static {
        System.out.println("MethodHandleClass init");
    }

    public static void testMethodHandle(String str) {
        System.out.println(str);
    }
}
