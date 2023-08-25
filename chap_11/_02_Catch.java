package chap_11;

public class _02_Catch {
    public static void main(String[] args) {
        try {
//            System.out.println(3 / 0);

//            int[] arr = new int[3];
//            arr[5] = 100;

//            Object obj = "test";
//            System.out.println((int)obj);

//            String s = null;
//            System.out.println(s.toLowerCase());

        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("잘못 계산함");
        } catch (ClassCastException e) {
            System.out.println("잘못된 형변환");
        } catch (Exception e) {
            System.out.println("그 외의 모든 처리");
            e.printStackTrace();
        }
        System.out.println("정상 종료");
    }
}
