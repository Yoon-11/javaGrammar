package chap_09.coffee;

public class CoffeeByNickname {
    public String Nickname;

    public CoffeeByNickname(String nickname) {
        Nickname = nickname;
    }

    public void ready() {
        System.out.println("커피 준비 완료 : " + Nickname);
    }
}
