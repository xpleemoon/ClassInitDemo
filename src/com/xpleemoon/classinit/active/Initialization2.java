package com.xpleemoon.classinit.active;

/**
 * Created by xplee on 16/7/27.
 */
public class Initialization2 {
    public static void main(String[] args) {
        try {
            // 对类进行反射调用的时候，如果类没有进行过初始化，则需要先触发其初始化
            Class.forName("com.xpleemoon.classinit.SuperClass");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
