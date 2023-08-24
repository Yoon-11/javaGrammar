package chap_09;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class _06_HashSet {
    public static void main(String[] args) {
        // Set
        HashSet<String> set = new HashSet<>();

        // 데이터 추가  HashSet은 중복 허용하지 않는다.
        set.add("삼겹살");
        set.add("후추");
        set.add("목살");
        set.add("소고기");
        set.add("삼겹살");
        set.add("상추");
        set.add("삼겹살");

        System.out.println("총 구매 상품 수 : " + set.size());

        // 순회
        for (String s:
                set) {
            System.out.println(s);
        }
        System.out.println("---------------------");

        // 확인
        if (set.contains("삼겹살")) {
            System.out.println("삼겹살 사러 출발");
        }
        System.out.println("----------------");

        // 삭제
        System.out.println("총 구매 상품 수 (삼겹살 구매 전) : " + set.size());
        set.remove("삼겹살");
        System.out.println("총 구매 상품 수 (삼겹살 구매 후) : " + set.size());

        set.clear();

        if (set.isEmpty()) {
            System.out.println("남은 구매 상품 수 : " + set.size());
        }

        System.out.println("----------------");

        // set : 중복 허용 X, 순서 보장 X
        // 만약 순서보장이 필요하다면 LinkedHashSet 이용
        HashSet<Integer> intSet = new HashSet<>();
        intSet.add(1);
        intSet.add(15);
        intSet.add(3);

        for (int i : intSet
             ) {
            System.out.println(i);
        }
    }
}
