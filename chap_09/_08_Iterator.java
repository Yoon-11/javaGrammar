package chap_09;

import java.util.*;

public class _08_Iterator {
    public static void main(String[] args) {
        // Iterator
        List<String> list = new ArrayList<>();
        list.add("유재석");
        list.add("알수없음");
        list.add("한소희");
        list.add("알수없음");
        list.add("강호동");
        list.add("조세호");
        list.add("알수없음");
        list.add("설윤");

        for (String s: list) {
            System.out.println(s);
        }
        System.out.println("--------------------");

        Iterator<String> it = list.iterator();
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());

        System.out.println("--------------------");
        it = list.iterator(); // cursor를 처음 위치로 이동
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("--------------------");

        it = list.iterator();
        while (it.hasNext()) {
            String s = it.next();
            if (s.contains("알수없음")) {
                it.remove();
            }
        }

        System.out.println("--------------------");
        it = list.iterator(); // cursor를 처음 위치로 이동
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("--------------------");

        HashSet<String> set = new HashSet<>();
        set.add("한소희");
        set.add("설윤");
        Iterator<String> itSet = set.iterator();
        while (itSet.hasNext()) {
            System.out.println(itSet.next());
        }
        System.out.println("---------------------");

        HashMap<String, Integer> map = new HashMap<>();
        map.put("유재석", 10);
        map.put("박명수", 5);

        //map.iteraor() // 제공 X
        Iterator<String> itMapKey = map.keySet().iterator();
        while (itMapKey.hasNext()) {
            System.out.println(itMapKey.next());
        }
        System.out.println("---------------------");

        Iterator<Integer> itMapValue = map.values().iterator();
        while (itMapValue.hasNext()) {
            System.out.println(itMapValue.next());
        }
        System.out.println("---------------------");

        Iterator<Map.Entry<String, Integer>> ItMap = map.entrySet().iterator();
        while (ItMap.hasNext()) {
            System.out.println(ItMap.next());
        }

    }
}
