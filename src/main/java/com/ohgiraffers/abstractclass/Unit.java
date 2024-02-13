package com.ohgiraffers.abstractclass;

public abstract class Unit {
    int x, y;
    abstract void move(int x, int y);
    // 선언부는 일치하지만 지상과 공중유닛이기에 몸통이 다를 수 있으니 추상메소드로 정의
    void stop() {
        /* 현재 위치에 정지 */
    }

}
