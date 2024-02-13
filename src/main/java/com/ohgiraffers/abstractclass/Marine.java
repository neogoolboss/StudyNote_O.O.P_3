package com.ohgiraffers.abstractclass;

public class Marine extends Unit {
    @Override
    void move(int x, int y) {
        System.out.println("Marine[x = " + x + ", y = " + y + "]");
    }

    void stimPack() {
        /* 스팀팩을 사용한다. */
    }
}
