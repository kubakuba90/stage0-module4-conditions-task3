package school.mjc.stage0.conditions.task3;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {

        if (month == 6){
            System.out.println("30");
        } else if (month == 2) {
            System.out.println("28");
        } else {
            System.out.println("wrong number!");
        }
    }
}
