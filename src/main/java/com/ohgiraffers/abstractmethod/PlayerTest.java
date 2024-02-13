package com.ohgiraffers.abstractmethod;

public class PlayerTest {

    public static void main(String[] args) {

//        Player P = new Player(); // 추상 클래스의 객체를 생성
//        AudioPlayer ap = new AudioPlayer();
        Player ap = new AudioPlayer();          // 다형성
        ap.play(100);
        ap.stop();


    }

}
