package chap_08.abstractClass.camera;

public abstract class Camera {
    public void takePicture() {
        System.out.println("사진 촬영");
    }

    public void recordVideo() {
        System.out.println("영상 녹화");
    }

    public abstract void showMainFeature(); // 구현해야 하는 메소드
}
