package com.ohgiraffers.abstractmethod;

public class AudioPlayer extends Player {

    @Override
    void play(int pos) {
        System.out.println(pos + "위치부터 play합니다.");
    }

    @Override
    void stop() {
        System.out.println("재생을 멈춥니다.");
    }
}
