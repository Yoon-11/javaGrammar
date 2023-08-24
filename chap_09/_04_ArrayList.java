package chap_09;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class _04_ArrayList {
    public static void main(String[] args) {
        // 컬렉션 프레임워크(List, Set, Map)
        ArrayList<String> List = new ArrayList<>();

        // 데이터 추가
        List.add("유재석"); List.add("조세호"); List.add("강호동"); List.add("조세호");


        // 데이터 조회(인덱스)
        System.out.println(List.get(0));
        System.out.println(List.get(1));
        System.out.println(List.get(2));

        System.out.println("===================");

        // 데이터 삭제
        System.out.println("신청 학생 수 : " + List.size());
        List.remove("조세호");
        System.out.println("삭제 후, 신청 학생 수 : " + List.size());
        System.out.println(List.get(1));

        System.out.println("===================");

        System.out.println("남은 학생 수(제외 전) : " + List.size());
        List.remove(List.size() - 1);
        System.out.println("남은 학생 수 (제외 후) : " + List.size());

        System.out.println("===================");

        System.out.println(List);

        // 순회
        for (String s:
             List) {
            System.out.println(s);
        }

        System.out.println("===================");

        // 변경
        System.out.println("변경 전 : " + List.get(0));
        List.set(0, "변경됨");
        System.out.println("변경 후 : " + List.get(0));

        // 확인
        System.out.println(List.indexOf("강호동"));

        System.out.println("===================");

        // 리스트에 포함된 데이터가 있는지 확인
        if (List.contains("김종국")) {
            System.out.println("데이터 존재");
        }else {
            System.out.println("데이터 없음");
        }

        System.out.println("===================");

        // 전체 삭제
        List.clear();
        if (List.isEmpty()) {
            System.out.println("List 비어있음 ," + " 사이즈 = " + List.size());
        }

        System.out.println("===================");

        List.add("유재석"); List.add("조세호"); List.add("강호동"); List.add("한소희");

        // 정렬
        Collections.sort(List);

        for (String s:List) {
            System.out.println(s);
        }
        System.out.println(List);

    }
}
