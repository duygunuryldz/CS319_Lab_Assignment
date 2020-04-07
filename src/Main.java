import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        list1.add(100);
        list1.add(500);
        list1.add(900);

        list2.add(800);
        list2.add(600);
        list2.add(300);

        list3.add(400);
        list3.add(700);
        list3.add(200);

        ArrayOrganizer arrorg = new ArrayOrganizer();
        ArrayList<Integer> result = new ArrayList<>();
        result = arrorg.concatAndSort(list1, list2, list3);

        System.out.println("Result => " + result);
    }
}
