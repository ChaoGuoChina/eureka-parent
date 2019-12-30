package com.forezp.eurekaclientone.test;

public class Test {
    public static final int NUM=15000;
    public static int doubleValue(int i){
//这个空循环用于后面演示JIT代码优化过程
        for(int j=0;j<100000;j++);
        return i*2;
    }
    public static long calcSum(){
        long sum=0;
        for(int i=1;i<=100;i++){
            sum+=doubleValue(i);
        }
        return sum;
    }
    public static void main(String[]args){
        for(int i=0;i<NUM;i++){
            calcSum();
        }
    }
//    public static void main(String[] args) {
//        Integer a=1;
//        Integer b=2;
//        Integer c=3;
//        Integer d=3;
//        Integer e=321;
//        Integer f=321;
//        Long g=3L;
//        System.out.println(c==d);
//        System.out.println(e==f);
//        System.out.println(c==(a+b));
//        System.out.println(c.equals(a+b));
//        System.out.println(g==(a+b));
//        System.out.println(g.equals(a+b));
//    }
}
