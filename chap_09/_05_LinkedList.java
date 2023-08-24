package chap_09;

import java.util.Collections;
import java.util.LinkedList;

public class _05_LinkedList {
    public static void main(String[] args) {
        // LinkedList
        LinkedList<String> list = new LinkedList<>();

        // 데이터 추가
        list.add("유재석"); list.add("한소희"); list.add("보니"); list.add("하니");

        // 데이터 조회
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        System.out.println("===================");

        // 데이터 추가
        list.addFirst("불장군");
        for (String s: list) {
            System.out.println(s);
        }

        System.out.println("===================");

        list.addLast("나무");
        for (String s: list) {
            System.out.println(s);
        }

        list.add(3, "스타벅스");
        System.out.println(list);

        // 삭제
        System.out.println("남은 학생 수 (삭제 전) : " + list.size());
        list.remove(list.size() -1);
        System.out.println("남은 학생 수 (삭제 후) : " + list.size());

        System.out.println("===================");

        list.removeFirst(); // 첫번째 삭제
        list.removeLast(); // 마지막 삭제
        System.out.println("첫번째, 마지막 삭제 후 : " + list.size());

        list.clear(); // 전체 삭제
        if (list.isEmpty()) {
            System.out.println("데이터 수 : " + list.size());
        }
        System.out.println("===================");
        list.add("유재석"); list.add("한소희"); list.add("보니"); list.add("하니");

        Collections.sort(list);
        for (String s: list) {
            System.out.println(s);
        }

    }
}
