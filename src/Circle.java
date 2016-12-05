import java.text.DecimalFormat;

public class Circle {
    private double radius;
    private static int numberOfCirclesProduced = 0;

    public Circle(double radius) {
        this.radius = radius;
        numberOfCirclesProduced++;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public static int getNumberOfCirclesProduced() {
        return numberOfCirclesProduced;
    }

    public String getFormattedCircumference() {
        return formatNumber(getCircumference());
    }

    public String getFormattedArea() {
        return formatNumber(getArea());
    }

    private String formatNumber(double number) {
        DecimalFormat formatter = new DecimalFormat("#.###");
        return formatter.format(number);
    }

}