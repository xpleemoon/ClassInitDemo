package com.xpleemoon.classinit.active;

import com.xpleemoon.classinit.SubClass;

/**
 * Created by xplee on 16/7/27.
 */
public class Initialization3 {
    public static void main(String[] args) {
        // 当初始化一个类的时候，如果发现其父类还没有进行过初始化，则需要触发其父类的初始化
        new SubClass();
    }
}
