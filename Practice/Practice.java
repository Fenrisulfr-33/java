package Practice;

import java.util.ArrayList;

public class Practice {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Alisaie");
        list.add("Urianger");
        list.add("Minfilia");
        list.add("Yda");
        list.add("Thancred");
        list.add("Y'shtola");

        System.out.println("For Loop");
        for(int i = 0; i < list.size(); i++){
            String name = list.get(i);
            System.out.println(name);
        }
        System.out.printf("End loop with a size of %d\n", list.size());
        list.remove(2);
        System.out.printf("\n\nStarting for:each loop with a size of %d\n", list.size());
        for(String name2 : list){
            System.out.println(name2);
        }


    }

}
