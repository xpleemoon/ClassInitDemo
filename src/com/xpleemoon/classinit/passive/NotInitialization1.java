package com.xpleemoon.classinit.passive;

import com.xpleemoon.classinit.SubClass;

/**
 * Created by xplee on 16/7/26.
 */
public class NotInitialization1 {
    public static void main(String[] args) {
        // 子类引用父类的静态字段，不会导致子类初始化
        System.out.println(SubClass.value);
    }
}
