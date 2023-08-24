package chap_10;

public class _01_AnonymousClass1 {
    public static void main(String[] args) {

        Coffee c1 = new Coffee();
        c1.order("아메리카노");

        System.out.println("--------------------");
        Coffee c2 = new Coffee();
        c2.order("라떼");

        System.out.println("--------------------");

        // 익명 클래스
        Coffee specialCoffee = new Coffee() {
            @Override
            public void order(String coffee) {
                super.order(coffee);
                System.out.println("서비스 더 줄게");
            }

            @Override
            public void returnTray() {
                System.out.println("내가 치울게");
            }
        };


        specialCoffee.order("바닐라라떼");
        specialCoffee.returnTray();
    }
}

class Coffee {
    public void order(String coffee) {
        System.out.println("주문한 " + coffee + " 나옴");
    }

    public void returnTray() {
        System.out.println("커피 반납 완료");
    }
}
