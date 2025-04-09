import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Employee firstEmployee = new Operator(
                LocalDate.of(2022, 4, 9),
                "Kirill",
                40_000
        );
        System.out.println("Информация о первом сотруднике: " + firstEmployee +
                "\nЗарплата равна: " + firstEmployee.getMonthSalary());
    }
}
