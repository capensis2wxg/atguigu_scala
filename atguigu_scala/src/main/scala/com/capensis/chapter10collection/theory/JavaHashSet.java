package com.capensis.chapter10collection.theory;

import java.util.HashSet;

@SuppressWarnings("OverwrittenKey")
public class JavaHashSet {
    public static void main(String[] args) {
        //java中的Set的元素 没有顺序，不能重复
        HashSet<String> hs = new HashSet<String>();
        hs.add("jack");
        hs.add("tom");
        hs.add("jack");
        hs.add("jack2");
        System.out.println(hs);

    }
}
