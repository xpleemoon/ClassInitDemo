package com.xpleemoon.classinit.active;

/**
 * Created by xplee on 16/7/27.
 */
public class Initialization4 {
    static {
        System.out.println("当虚拟机启动时，用户需要指定一个要执行的主类，虚拟机会先初始化这个主类（包含main()方法的一个执行类）");
    }

    public static void main(String[] args) {

    }
}
