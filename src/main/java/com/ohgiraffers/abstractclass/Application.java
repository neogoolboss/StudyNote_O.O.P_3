package com.ohgiraffers.abstractclass;

public class Application {

    public static void main(String[] args) {

        Unit[] group = {new Marine(), new Tank(), new Dropship()};
//        Unit[] group = new Unit[3];
//        group[0] = new Marine();
//        group[1] = new Tank();
//        group[2] = new Dropship();

        System.out.println("----- 배열에서 메서드 개별 호출 -----");
        group[0].move(100, 300);
        group[1].move(200, 200);
        group[2].move(300, 100);


        System.out.println("----- 배열에서 반복문 메서드 호출 -----");

        for (int i = 0; i < group.length; i++) {
            group[i].move(100, 200);
        }

    }

}
