package com.ohgiraffers.abstractclass;

public class Dropship extends Unit {

    @Override
    void move(int x, int y) {
        System.out.println("Dropship[x = " + x + ", y = " + y + "]");

    }

    void load() {
        /* 선택된 대상을 태운다. */
    }
    void unload() {
        /* 선택된 대상을 내린다. */
    }
}
