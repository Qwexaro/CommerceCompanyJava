import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Employee firstEmployee = new Operator(
                LocalDate.of(2022, 4, 9),
                "Kirill",
                40_000
        );
    }
}
