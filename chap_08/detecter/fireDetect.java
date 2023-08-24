package chap_08.detecter;

public class fireDetect implements detectable{
    @Override
    public void detect() {
        System.out.println("일반 성능으로 화재 감지");
    }
}
