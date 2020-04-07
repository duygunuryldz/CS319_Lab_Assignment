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

        Player player1 = new Player("Tom");
        Player player2 = new Player("John");
        Player player3 = new Player("James");
        Player player4 = new Player("Henry");

        Die die = new Die();

        for( int i = 0; i < 5; i++) {
            player1.addScore(die.rollDie());
            player2.addScore(die.rollDie());
            player3.addScore(die.rollDie());
            player4.addScore(die.rollDie());
        }

        System.out.println("-------------------");
        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);
        System.out.println(player4);

    }
}
