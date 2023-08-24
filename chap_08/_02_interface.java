package chap_08;

import chap_08.abstractClass.camera.FactoryCam;
import chap_08.abstractClass.reporter.NormalReporter;
import chap_08.abstractClass.reporter.VideoReporter;
import chap_08.detecter.advancedFireDetect;
import chap_08.detecter.detectable;
import chap_08.detecter.fireDetect;

public class _02_interface {
    public static void main(String[] args) {
        // Interface
        // 다중 상속 가능

        NormalReporter normalReporter = new NormalReporter();
        normalReporter.report();

        VideoReporter videoReporter = new VideoReporter();
        videoReporter.report();

        System.out.println("---------------------------");

        detectable fireDetect = new fireDetect();
        fireDetect.detect();

        detectable advancedFireDetect = new advancedFireDetect();
        advancedFireDetect.detect();

        System.out.println("---------------------------");

        FactoryCam factoryCam = new FactoryCam();
        factoryCam.setDetector(fireDetect);
        factoryCam.setReporter(normalReporter);
        factoryCam.detect();
        factoryCam.report();

    }
}
