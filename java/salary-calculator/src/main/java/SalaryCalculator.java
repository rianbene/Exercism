public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        boolean expr = daysSkipped >= 5;
        double value = expr ? 0.85 : 1.00;
        return value;
    }

    public int bonusMultiplier(int productsSold) {
        boolean expr = productsSold >= 20;
        int value = expr ? 13 : 10;
        return value;
    }

    public double bonusForProductsSold(int productsSold) {
        return productsSold * bonusMultiplier(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double salary = 1000 * salaryMultiplier(daysSkipped) + bonusForProductsSold(productsSold);
        boolean expr = salary > 2000;
        double value = expr ? 2000 : salary;
        return value;
    } 
}
