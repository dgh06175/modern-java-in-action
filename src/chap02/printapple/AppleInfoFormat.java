package chap02.printapple;

public class AppleInfoFormat implements AppleFormatter {
    @Override
    public String makeString(Apple a) {
        return "%d".formatted(a.weight)
                + " 그램인 "
                + "%s".formatted(a.color)
                + " 사과.";
    }
}
