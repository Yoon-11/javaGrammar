package chap_08.abstractClass.camera;

import chap_08.abstractClass.reporter.Reportable;
import chap_08.detecter.detectable;

public class FactoryCam extends Camera implements detectable, Reportable {
    private detectable detector;
    private Reportable reporter;

    public void setDetector(detectable detector) {
        this.detector = detector;
    }

    public void setReporter(Reportable reporter) {
        this.reporter = reporter;
    }

    @Override
    public void showMainFeature() {
        System.out.println("화재감지");
    }


    @Override
    public void detect() {
        detector.detect();
    }

    @Override
    public void report() {
        reporter.report();
    }
}
