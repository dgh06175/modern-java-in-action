package chap02.printapple;

public class AppleWeightFormat implements AppleFormatter {
    @Override
    public String makeString(Apple a) {
        String result =
                "사과가 "
                + "%d".formatted(a.weight)
                + " 그램으로 ";

        if (a.weight > 150) {
            return result + "무겁습니다";
        }
        return result + "가볍습니다";
    }
}
