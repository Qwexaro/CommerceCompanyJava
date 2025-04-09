import java.time.LocalDate;

public abstract class Employee {
    private String name;
    private final LocalDate dateStartWork;
    private double fixedSalary;

    public Employee(LocalDate dateStartWork, String name, double fixedSalary) {
        this.dateStartWork = dateStartWork;
        this.name = name;
        this.fixedSalary = fixedSalary;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateStartWork() {
        return dateStartWork;
    }

    public double getFixedSalary() {
        return fixedSalary;
    }

    public abstract double getMonthSalary();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dateStartWork=" + dateStartWork +
                ", fixedSalary=" + fixedSalary +
                '}';
    }

}