import java.util.ArrayList;
import java.util.List;
public class JoinArray {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Lion");
        list1.add("Tiger");
        list1.add("Leopard");
        System.out.println("ArrayList 1: " + list1);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Sheep");
        list2.add("Goat");
        list2.add("Cow");
        System.out.println("ArrayList 2: " + list2);

        ArrayList<String> joinedList = new ArrayList<>(list1);
        joinedList.addAll(list2);

        System.out.println("Joined ArrayList: " + joinedList);
    }
}
