package com.capensis.chapter03package.javapackage;

/**
 * @author capensis
 */
public class TestTiger {
    public static void main(String[] args) {
        //使用xm的Tiger
        com.capensis.chapter03package.javapackage.xm.Tiger tiger01 = new com.capensis.chapter03package.javapackage.xm.Tiger();
        //使用xh的Tiger
        com.capensis.chapter03package.javapackage.xh.Tiger tiger02 = new com.capensis.chapter03package.javapackage.xh.Tiger();

        System.out.println("tiger01=" + tiger01 + "tiger02=" + tiger02);
    }
}
