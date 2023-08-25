package chap_11;

public class _04_Finally {
    public static void main(String[] args) {
        try {
            System.out.println("문 열기");
            throw new Exception("잠김");
        } catch (Exception e) {
            System.out.println("문제 발생 : " + e.getMessage());
        }finally {
            System.out.println("문 닫아");
        }

        // try + catch
        // try + catch + finally
        // try + finally

        System.out.println("===============");

        try {
            System.out.println(3/0);
        }finally {
            System.out.println("프로그램 종료");
        }




    }
}
