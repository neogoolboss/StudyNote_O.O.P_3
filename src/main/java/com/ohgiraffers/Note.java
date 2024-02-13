package com.ohgiraffers;

public class Note {

    public static void main(String[] args) {

        /* 추상클래스(abstract class)
        *   - 미완성 설계도. 미완성 메서드를 갖고 있는 클래스
        *
        *   abstract class Player {                 // 추상클래스(미완성 클래스)
        *       abstract void play(int pos);        // 추상메서드(몸통 { }이 없는 미완성 메서드)
        *       abstract void stop();               // 추상메서드
        *   }
        *
        *   - 다른 클래스 작성에 도움을 주기 위한 것. 인스턴스 생성 불가
        *   Player p = new Player();    // 에러❌ 추상 클래스의 인스턴스 생성 불가
        *
        *   - 상속을 통해 추상 메서드를 완성해야 인스턴스 생성 가능
        *   class AudioPlayer extends Player {
        *       void play(int pos) {
        *           내용 생략                           // 추상메서드 구현
        *       }
        *       void stop() {
        *           내용 생략                           // 추상메서드 구현
        *       }
        *   AudioPlayer ap = new AudioPlayer();
        *   Player p = new AudioPlayer();
        *
        *   - 미완성 메서드. 구현부(몸통 { })가 없는 메서드
        *   ✅ 주석을 통해 어떤 기능을 수행할 목적으로 작성하였는지 설명한다.
        *       abstract 리턴타입 메서드이름();
        *
        *   - 꼭 필요하지만 자손마다 다르게 구현될 것으로 예상되는 경우 사용
        *   abstract class Player { ✅ 추상클래스
        *       abstract void play(int pos);                    // 추상메서드
        *       abstract void stop();                           // 추상메서드
        *   }
        *
        *   class AudioPlayer extends Player { ✅ 완전한 클래스
        *       void play(int pos) { 내용 생략 }                  // 추상메서드 구현
        *       void stop() { 내용 생략 }                         // 추상메서드 구현
        *   }
        *
        *   abstract class AbstractPlayer extends Player { ✅ 1개만 구현해서 미완성
        *       void play(int pos) { 내용 생략 }                  // 추상메서드 구현
        *   }
        * */

        /* 추상클래스의 작성
        *   - 여러 클래스에 공통적으로 사용될 수 있는 추상클래스를 바로 작성하거나
        *     기존클래스의 공통 부분을 뽑아서 추상클래스를 만든다.
        *      ✅ abstractclass 패키지 참조.
        *
        *   - 추상화 <- -> 구체화
        *   - 추상화된 코드는 구체화된 코드보다 유연하다. 변경에 유리
        *   GregorianCalendar cal = new GregorianCalendar(); // 구체적
        *   Calendar cal = Calendar.getInstance(); // 추상적
        * */

        /* 인터페이스(interface)
        *   - ✨추상 메서드의 집합✨ (결론, 핵심)
        *   - 구현된 것이 전혀 없는 설계도. 껍데기(모든 멤버가 public)
        *
        *   interface 인터페이스 이름 {
        *       public static final 타입 상수이름 = 값;            <-- 상수
        *       public abstract 메서드이름(매개변수 목록);          <-- 추상메서드
        *
        *   interface PlayingCard {
        *       public static final int SPADE = 4;
        *       final int DIAMOND = 3;              // public static final int DIAMOND = 3;
        *       static int HEART = 2;               // public static final int HEART = 2;
        *       int CLOVER = 1;                     // public static final int CLOVER = 1;
        *
        *       public abstract String getCardNumber();
        *       String getCardKind();               // public abstract String getCardKind();
        *   }
        *
        *   - 인터페이스의 조상은 인터페이스만 가능(Object가 최고 조상 아님)
        *   - 다중 상속이 가능.(추상메서드는 충돌해도 문제 없음)
        *
        *   interface Fightable extends Movable, Attackable() { }
        *
        *   interface Movable {
        *       void move(int x, int y)         지정된 위치(x, y)로 이동하는 기능의 메서드
        *   }
        *
        *   interface Attackable {
        *       void attack(Unit u);            지정된 대상(u)을 공격하는 기능의 메서드
        *   }
        * */

        /* 인터페이스의 구현
        *   - 인터페이스에 정의된 추상 메서드를 완성하는 것
        *
        *   class 클래스이름 implements 인터페이스이름 {
        *        // 인터페이스에 정의된 추상메서드를 모두 구현해야 한다.
        *   }
        *
        *   interface Fightable {
        *       void move(int x, int y);
        *       void attack(Unit u);
        *   }
        *
        *   class Fighter implements Fightable {
        *       public void move(int x, int y) {
        *               내용 생략
        *       }
        *       public void attack(Unit u) {
        *               내용 생략
        *       }
        *
        *   - 일부만 구현하는 경우, 클래스 앞에 abstract를 붙여야 함.
        *   abstract class Fighter implements Fightable {
        *       public void move(int x, int y) {
        *               내용 생략
        *       }
        *   }
        * */

        /* 인터페이스의 구현
        *   Q. 인터페이스란?
        *   A. 추상메서드의 집합
        *      (상수, static메서드, 디폴트메서드)
        *
        *   Q. 인터페이스의 구현이란?
        *   A. 인터페이스의 추상메서드 몸통{} 만들기(미완성 설계도 완성하기)
        *
        *   Q. 추상클래스와 인터페이스의 공통점은?
        *   A. 추상메서드를 가지고 있다.
        *
        *   Q. 추상클래스와 인터페이스의 차이점은?
        *   A. 인터페이스는 iv(인스턴스 변수)를 가질 수 없다.
        * */

    }

}
