package chap_11;

public class _03_Throw {
    public static void main(String[] args) {
        int age = 17; // 만 17세
        try {
            if (age < 19) {
//                System.out.println("구매 불가");
                throw new Exception("구매 불가");
            } else {
                System.out.println("구매 가능");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
