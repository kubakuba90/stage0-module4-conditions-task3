package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if (salary == 0 || salary < 0 ) {
            System.out.println("wrong input!");
        } else if (salary > 20_000) {
            double percent = salary * 20 / 100;
            double salaryAfter = salary - percent;
            System.out.println(salaryAfter);
        } else if (salary <= 10_000) {
            double percent = salary * 15 / 100;
            double salaryAfter = salary - percent;
            System.out.println(salaryAfter);
        } else if (salary > 10_000 && salary < 20_000) {
            double percent = salary * 18 / 100;
            double salaryAfter = salary - percent;
            System.out.println(salaryAfter);
        }

    }
}
