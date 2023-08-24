package chap_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _05_Stream {
    public static void main(String[] args) {
        // stream

        // Arrays.stream
        int[] scores = {100, 90, 80, 70, 60};
        IntStream scoreStream = Arrays.stream(scores);

        String[] langs = {"python", "java", "javascript", "c", "c++"};
        Stream<String> langStream = Arrays.stream(langs);


        // Collections.stream()
        List<String> langsList = new ArrayList<>();
        langsList = Arrays.asList("python", "java", "javascript", "c", "c++");
//        System.out.println(langsList.size());
        Stream<String> langListStream = langsList.stream();

        // Stream.of()
        Stream<String> langListOfStream = Stream.of("python", "java", "javascript", "c", "c++");

        // 스트림 사용
        // 중간 연산 (Intermediate Operation) : filter, map, sorted, distinct ... ** 계속 사용가능
        // 최종 연산 (Terminal Operation) : count, min, max ... ** 마지막에 한번만 사용가능

        // 90점 이상인 점수만 출력
        Arrays.stream(scores).filter(x -> x>=90).forEach(x -> System.out.println(x));
//        Arrays.stream(scores).filter(x -> x >= 90).forEach(System.out::println);
        System.out.println("----------------------");

        // 90점 이상인 사람의 수
        long count =(int) Arrays.stream(scores).filter(x -> x >= 90).count();
        System.out.println(count);
        System.out.println("----------------------");

        // 90점 이상인 점수들의 합
        int sum = Arrays.stream(scores).filter(x -> x >= 90).sum();
        System.out.println(sum);
        System.out.println("----------------------");

        // 90점 이상인 점수들 정렬
        Arrays.stream(scores).filter(x -> x>= 90).sorted().forEach(System.out::println);
        System.out.println("-------------------");

        // "python", "java", "javascript", "c", "c++"
        // c로 시작하는 언어
        Arrays.stream(langs).filter(x -> x.startsWith("c")).forEach(System.out::println);
        System.out.println("-------------------");

        // java 글자 포함
        Arrays.stream(langs).filter(x -> x.contains("java")).forEach(System.out::println);
        System.out.println("-------------------");

        // 글자 개수 4이하
        langsList.stream().filter(x -> x.length() <= 4).sorted().forEach(System.out::println);
        System.out.println("-------------------");

        // 4글자 이하 중 c 라는 글자 포함
        langsList.stream()
                .filter(x -> x.length() <=4)
                .filter(x -> x.contains("c"))
                .forEach(System.out::println);
        System.out.println("-------------------");

        // 4글자 이하의 언어 중 c 라는 글자를 포함하는 언어가 하나라도 있는지 여부
        boolean anyMatch = langsList.stream().filter(x -> x.length() <= 4).anyMatch(x -> x.contains("c"));
        System.out.println(anyMatch);
        System.out.println("-------------------");

        // 3글자 이하의 언어들은 모두 c 라는 글자를 포함하는지 여부
        boolean allMatch = langsList.stream().filter(x -> x.length() <= 3).allMatch(x -> x.contains("c"));
        System.out.println(allMatch);
        System.out.println("-------------------");

        // 4글자 이하의 언어들 중에서 c 라는 글자를 포함하는 언어 뒤에 문자열을 추가해서 함께 출력
        // map
        langsList.stream()
                .filter(x -> x.length() <= 4)
                .filter(x -> x.contains("c"))
                .map(x -> x + " 어려워요")
                .forEach(System.out::println);
        System.out.println("-------------------");

        // c라는 글자를 포함하는 언어를 대문자로 출력
        langsList.stream()
                .filter(x -> x.contains("c"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
        System.out.println("-------------------");

        // c라는 글자를 포함하는 언어를 대문자로 변경하여 리스트로 저장
        List<String> langListStartsWithC = langsList.stream()
                .filter(x -> x.contains("c"))
                .map(String::toUpperCase)
                        .toList();

        langListStartsWithC.stream().forEach(System.out::println);


    }

}
