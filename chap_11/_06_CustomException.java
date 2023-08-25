package chap_11;

public class _06_CustomException{
    public static void main(String[] args) {
        int age = 17; // 만 17세
        try {
            if (age < 19) {
//                System.out.println("구매 불가");
                throw new AgeLessThan19Exception("구매 불가");
            } else {
                System.out.println("구매 가능");
            }
        } catch (AgeLessThan19Exception e) {
            System.out.println("다음에 와");
        } catch (Exception e) {
            System.out.println("모든 예외 처리");
        }
    }
}


class AgeLessThan19Exception extends Exception {
    public AgeLessThan19Exception(String message) {
        super(message);
    }
}
