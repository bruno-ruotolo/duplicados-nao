import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> firstArray = new ArrayList<>();
        firstArray.add("Maca");
        firstArray.add("Uva");
        firstArray.add("Pera");
        firstArray.add("Melancia");
        firstArray.add("Jaca");

        List<String> secondArray = new ArrayList<>();
        secondArray.add("Melao");
        secondArray.add("Uva");
        secondArray.add("Jabuticaba");
        secondArray.add("Melancia");
        secondArray.add("Banana");

        for (int i = 0; i < firstArray.size(); i++) {
            if (firstArray.contains(secondArray.get(i)))
                System.out.println(secondArray.get(i));
        }
    }
}
