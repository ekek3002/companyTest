//1.값을 빠궈주는 스왑 함수를 구현하세요
package com.codingtest;

class Swap{
    public int x, y;
    public static void swap(Swap obj){
        int temp;
        /* 정답 :
        temp = obj.x;
        obj.x= obj.y;
        obj.y=temp;
        */
    }
}

public class Call {
    public static void main(String[] args) {
        Swap s = new Swap();
        s.x =1; s.y=2;
        System.out.println("before: x = "+s.x+", y = "+s.y);
        Swap.swap(s);
        System.out.println("after: x = "+s.x+", y = "+s.y);
    }
}
