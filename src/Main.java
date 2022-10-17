import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {


        ArrayList<String> users = new ArrayList<>();
        users.add("jin");
        users.add("dio");
        users.add("skay");
        users.add("blum");
        users.add("muza");
        System.out.println("List A " + users);


        ArrayList<String> users2 = new ArrayList<>();
        users2.add("minho");
        users2.add("chan");
        users2.add("riven");
        users2.add("jhope");
        users2.add("suga");
        System.out.println("List B " + users2);

        ArrayList<String> users3 = new ArrayList<>();
        users3.add("jin");
        users3.add("suga");
        users3.add("dio");
        users3.add("jhope");
        users3.add("skay");
        users3.add("riven");
        users3.add("blum");
        users3.add("chan");
        users3.add("muza");
        users3.add("minho");
        System.out.println("List C " + users3);

        System.out.println(users3);
        Collections.sort(users3);
        System.out.println(users3);
        Collections.reverse(users3);
        System.out.println(users3);
        Collections.shuffle(users3);


    }
}