package chap_09;

import chap_09.coffee.*;
import chap_09.user.User;
import chap_09.user.VipUser;

public class _02_GenericClass {
    public static void main(String[] args) {
        // 제네릭 클래스
        CoffeeByNumber c1 = new CoffeeByNumber(33);
        c1.ready();

        CoffeeByNickname c2 = new CoffeeByNickname("홍길동");
        c2.ready();

        System.out.println("=====================");

        CoffeeByNumber c3 = new CoffeeByNumber(34);
        c3.ready();

        CoffeeByName c4 = new CoffeeByName("김철수");
        c4.ready();

        System.out.println("=====================");


        String c4Name = (String)c4.name;
        System.out.println("주문 고객 이름 : " + c4Name);

        System.out.println("=====================");

        Coffee<Integer> c5 = new Coffee<>(35);
        c5.ready();


        Coffee<String> c6 = new Coffee<>("조세호");
        c6.ready();

        System.out.println("=====================");

        CoffeeByUser<User> c7 = new CoffeeByUser<>(new User("강호동"));
        c7.ready();

        CoffeeByUser<User> c8 = new CoffeeByUser<>(new VipUser("이수근"));
        c8.ready();

        System.out.println("=====================");

        orderCoffee("이진");
        orderCoffee(12);
        orderCoffee(999, "아메리카노");
    }

    public static <T> void orderCoffee(T name) {
        System.out.println("커피 준비 완료 : " + name);
    }

    public static <T, V> void orderCoffee(T name,V coffee) {
        System.out.println(coffee + " 준비 완료 : " + name);
    }
}
