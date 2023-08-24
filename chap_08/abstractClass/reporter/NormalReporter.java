package chap_08.abstractClass.reporter;

public class NormalReporter implements Reportable{
    @Override
    public void report() {
        System.out.println("일반 화재 신고 진행");
    }
}
