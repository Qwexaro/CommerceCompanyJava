import java.util.ArrayList;
import java.util.Collection;

public class Company {
    private double incomeCompany;

    private Collection<Employee> employees;
    private ArrayList<Double> salariesEmployees;

    public Company() {
        incomeCompany = 0;
        employees = new ArrayList<>();
        salariesEmployees = new ArrayList<>();
    }

    public double getIncomeCompany() {
        return incomeCompany;
    }
}
