import level1.computerscience.Functions;

public class Application {
    public static void main(String[] args) {
        Functions functions = new Functions();

        functions.minutesToQuarterPrint(5);
        System.out.println(functions.calculate(10, 3, '%'));

        double triangleAreaA = functions.getTriangleArea(20, 20);
        double triangleAreaB = functions.getTriangleArea(20, 20);
        functions.compareTriangle(triangleAreaA, triangleAreaB);
    }
}
