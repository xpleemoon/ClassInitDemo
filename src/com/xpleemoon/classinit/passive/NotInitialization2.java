package com.xpleemoon.classinit.passive;

import com.xpleemoon.classinit.SuperClass;

/**
 * Created by xplee on 16/7/26.
 */
public class NotInitialization2 {
    public static void main(String[] args) {
        // 注意，这里的字节码指令是newarray而非new，那么这段代码的初始化就是类[SuperClass的初始化
        SuperClass[] sca = new SuperClass[10];
    }
}
