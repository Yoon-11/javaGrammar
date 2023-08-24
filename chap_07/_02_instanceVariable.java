package chap_07;

public class _02_instanceVariable {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.color = "red";
        b1.resolution = "1234";
        b1.price = 2000;
        b1.modelName = "sol";

        System.out.println(b1.color + b1.modelName + b1.resolution + b1.price);
    }
}
