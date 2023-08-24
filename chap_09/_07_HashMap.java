package chap_09;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class _07_HashMap {
    public static void main(String[] args) {
        // Map (key, value)
        // 만약 순서보장이 필요하다면 LinkedHashMap 이용
        HashMap<String, Integer> map = new HashMap<>();

        // Data add
        map.put("한소희", 10);
        map.put("유재석", 5);
        map.put("김종국", 7);
        map.put("서장훈", 7);

        System.out.println("총 고객 수 :" + map.size());
        System.out.println("--------------------");

        // 조회
        System.out.println("유재석님의 포인트 : " + map.get("유재석"));
        System.out.println("한소희님의 포인트 : " + map.get("한소희"));
        System.out.println("--------------------");

        // 확인
        if (map.containsKey("서장훈")) {
            int point = map.get("서장훈");
            map.put("서장훈", ++point);
            System.out.println("서장훈님의 누적 포인트 : " + map.get("서장훈"));
        } else {
            map.put("서장훈", 1);
            System.out.println("서장훈 신규 등록");
        }
        System.out.println("--------------------");

        // delete
        map.remove("유재석");
        System.out.println(map.get("유재석"));

        // 전체 삭제
        map.clear();

        if (map.isEmpty()) {
            System.out.println("남은 고객 수 : " + map.size());
        }
        System.out.println("--------------------");

        map.put("한소희", 10);
        map.put("유재석", 5);
        map.put("김종국", 7);
        map.put("서장훈", 7);

        // key 확인
        for (String key : map.keySet()) {
            System.out.println(key);
        }

        System.out.println("--------------------");

        // value 확인
        for (int value : map.values()) {
            System.out.println(value);
        }
        System.out.println("--------------------");

        //key, value 같이 확인
        for (String key : map.keySet()) {
            System.out.println("고객 이름 : " + key + "\t포인트 : " + map.get(key));
        }

        System.out.println("--------------------");

        // map : 중복 X, 순서 X
        map.put("김종국", 10);
        map.put("김종국", 30);
        map.put("김종국", 50);

        for (String key : map.keySet()) {
            System.out.println("고객 이름 : " + key + "\t포인트 : " + map.get(key));
        }

        System.out.println("--------------------");
    }
}
