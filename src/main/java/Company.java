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

    public void hire(Employee employee) {
        employees.add(employee);
    }

    public void hireAll(Collection<Employee> employees) {
        this.employees.addAll(employees);
    }

    public void fire(Employee employee) {
        employees.remove(employee);
    }

    public void sortedSalariesEmployees() {
        for (int i = 0; i < salariesEmployees.size() - 1; i++) {
            for (int j = salariesEmployees.size() - 1; j >= i + 1; j--) {
                double tmp = salariesEmployees.get(i);
                if (salariesEmployees.get(i) < salariesEmployees.get(j)) {
                    salariesEmployees.set(i, salariesEmployees.get(j));
                    salariesEmployees.set(j, tmp);
                }
            }
        }
    }
}