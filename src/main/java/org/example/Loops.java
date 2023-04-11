package org.example;

public class Loops {

    public static void main(String[] args){

        // 반복문
        //1.for
        // for(초기화된 변수; 조건식 ; 증감식){}

//        for(int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }


        //2. while
        //

        int b = 10;
//
//        while(b > 0) {
//            System.out.println(b);
//            b--;
//        }

        // 평가하지않고 값을 찍고 돌면서 평가 시작
        do {
            System.out.println(b);
            b--;
        } while (b > 0);
    }

}
