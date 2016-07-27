package com.xpleemoon.classinit.active;

import com.xpleemoon.classinit.SuperClass;

/**
 * Created by xplee on 16/7/27.
 */
public class Initialization1 {
    public static void main(String[] args) {
        // 遇到new字节码指令时，如果类没有进行过初始化，则需要先触发类的初始化
        new SuperClass();
    }
}
