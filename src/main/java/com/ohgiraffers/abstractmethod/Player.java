package com.ohgiraffers.abstractmethod;

public abstract class Player {
//    boolean pause;                  // 일시정지 상태를 저장하기 위한 변수
//    int currentPos;                 // 현재 Play되고 있는 위치를 저장하기 위한 변수

//    Player() {                      // 추상클래스도 생성자가 있어야 한다.
//        pause = false;
//        currentPos = 0;
//    }

    /* 지정된 위치(pos)에서 재생을 시작하는 기능이 수행하도록 작성되어야 한다. */

    abstract void play(int pos);                        // 추상메서드

    /* 재생을 즉시 멈추는 기능을 수행하도록 작성되어야 한다. */
    abstract void stop();                               // 추상메서드

//    void play() {
//        play(currentPos);                               // 추상메서드를 사용할 수 있다.
//    }
    /* ✨메서드는 선언부만 알면 호출가능하므로 추상메서드도 호출 가능✨*/
    /* 인스턴스 메서드지만 객체 생성 후에 사용 가능하므로 상속을 통해 자손객체를 생성 후에 호출 가능 */








}
