package chap_08.abstractClass;

import chap_08.abstractClass.camera.FactoryCam;
import chap_08.abstractClass.camera.SpeedCam;

public class _01_abstractClass {
    public static void main(String[] args) {
        // 데이터 추상화
        // 추상 클래스 : 완성되지 않은 클래스

//        Camera camera = new Camera(); 추상 클래스이기 때문에 객체 생성 x
        FactoryCam factoryCam = new FactoryCam();
        factoryCam.showMainFeature();

        SpeedCam speedCam = new SpeedCam();
        speedCam.showMainFeature();
    }
}
