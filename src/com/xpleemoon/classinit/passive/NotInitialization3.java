package com.xpleemoon.classinit.passive;

import com.xpleemoon.classinit.ConstantsClass;

/**
 * Created by xplee on 16/7/26.
 */
public class NotInitialization3 {
    public static void main(String[] args) {
        // 常量在编译阶段会存入调用类的常量池中，本质上没有直接引用到定义常量的类，
        // 因此不会触发定义常量的类的初始化
        System.out.println(ConstantsClass.VALUE);
    }
}
