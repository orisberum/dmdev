package level1.computerscience;

public class Functions {
    public static final double HALF_MULTIPLIER = 0.5;

    public void minutesToQuarterPrint(int minutes) {
        if (minutes >= 0 && minutes < 15) {
            System.out.println("Число " + minutes + " попадает в первую четверть часа");
        } else if (minutes >= 15 && minutes < 30) {
            System.out.println("Число " + minutes + " попадает во вторую четверть часа");
        } else if (minutes >= 30 && minutes < 45) {
            System.out.println("Число " + minutes + " попадает в третью четверть часа");
        } else if (minutes >= 45 && minutes < 60) {
            System.out.println("Число " + minutes + " попадает в третью четверть часа");
        } else {
            System.out.println("Указанное число меньше 0 или больше 60");
        }
    }

    public double calculate(double operand1, double operand2, char operation) {
        return switch (operation) {
            case '+' -> operand1 + operand2;
            case '-' -> operand1 - operand2;
            case '/' -> operand1 / operand2;
            case '*' -> operand1 * operand2;
            case '%' -> operand1 % operand2;
            default -> throw new IllegalArgumentException("В качстве третьего параметра допустимы только следующие символы: ‘+’, ‘-’, ‘*’, ‘/’, ‘%’");
        };
    }

    public void compareTriangle(double triangleAreaA, double triangleAreaB) {
        switch (Double.compare(triangleAreaA, triangleAreaB)) {
            case 1 -> System.out.println("1-й треугольник больше");
            case -1 -> System.out.println("2-й треугольник больше");
            case 0 -> System.out.println("Треугольники равны");
        }
    }

    public double getTriangleArea(int sideA, int sideB) {
        return HALF_MULTIPLIER * sideA * sideB;
    }
}
