package level1.computerscience;

public class Functions {
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
}
