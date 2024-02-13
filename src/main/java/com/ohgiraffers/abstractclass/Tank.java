package com.ohgiraffers.abstractclass;

public class Tank extends Unit {
    @Override
    void move(int x, int y) {
        System.out.println("Tank[x = " + x + ", y = " + y + "]");

    }
    void changeMode() {
        /* 공격모드 전환 */
    }

}
