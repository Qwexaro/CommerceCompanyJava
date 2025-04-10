import java.util.ArrayList;

public class Sorted {
    public static void main(String[] args) {
        ArrayList<String> letters = new ArrayList<>(){{
            add("Г");
            add("А");
            add("И");
            add("А");
            add("Ж");
            add("А");
        }};

        for (int i = 0; i < letters.size() - 1; i++) {
            for (int j = letters.size() - 1; j >= i + 1; j--) {
                String tmp = letters.get(i);
                if (letters.get(i).compareTo(letters.get(j)) > 0) {
                    letters.set(i, letters.get(j));
                    letters.set(j, tmp);
                }
            }
        }

        System.out.println(letters);
    }
}
