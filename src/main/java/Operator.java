import java.time.LocalDate;

public class Operator extends Employee {

    public Operator(LocalDate dateStartWork, String name, double fixedSalary) {
        super(dateStartWork, name, fixedSalary);
    }

    @Override
    public double getMonthSalary() {
        return getFixedSalary();
    }
}