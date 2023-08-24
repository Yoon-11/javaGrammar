package chap_10;

import chap_10.converter.*;

public class _04_FunctionalInterface {
    public static void main(String[] args) {
        KRWConverter converter = new KRWConverter();
//        converter.convert(2);

//        convertUSD(USD -> System.out.println(USD + "달러 = " + (USD*1400) + " 원"),1);

        Convertable convertable = USD -> System.out.println(USD + "달러 = " + (USD*1400) + " 원");
        convertUSD(convertable, 2);

        // 전달값이 하나도 없다면?
        ConvertableWithNoParams c1 = () -> System.out.println("1달러는 1400원");
        c1.convert();

        // 두줄 이상의 코드가 있다면?
        c1 = () -> {
            int USD = 5;
            int KRW = 1400;
            System.out.println(USD + "달러 = " + (USD*1400) + " 원");
        };
        c1.convert();

        // 전달값이 2개인 경우?
        ConvertableWithTwoParams c2 = (D, W) -> System.out.println(D + "달러 = " + (D*W) + " 원");
        c2.convert(10, 1400);

        // 반환값이 있는 경우?
        ConvertableWithReturn c3 = (D, W)-> { return D*W; };
        int result = c3.convert(20, 1400);
        System.out.println("20 달러 = " + result + "원");
    }

    public static void convertUSD(Convertable converter, int USD) {
        converter.convert(USD);
    }
}


