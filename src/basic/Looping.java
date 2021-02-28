package basic;

import java.util.Iterator;

public class Looping {
    public static void main(String[] args) {
//        // perulangan tanpa henti
//        for(;;) {
//            System.out.println("for");
//        }

        Integer counter;
        // perulangan for
        for (counter = 1; counter <= 5; counter++) {
            System.out.println("Looping for ke-" + counter);
        }


        // perulangan while
        while(counter <= 10) {
            System.out.println("Looping while ke-" + counter);
            counter++;
        }

        // perulangan do while
        do {
            System.out.println("Looping do while ke-" + counter);
            counter++;
        } while (counter <= 15);

        // perulangan while
        while(counter <= 20) {
            if (counter == 18) {
                System.out.println("Looping kita stop di " + counter);
            }
            if (counter == 17) {
                System.out.println("Looping " + counter + " kita skip");
                counter++;
                continue;
            }
            System.out.println("Looping while ke-" + counter);
            counter++;
        }

        Integer[] arr = {
                10, 20, 50
        };
        // foreach
        for(var data : arr) {
            System.out.println("Nilai foreach " + data);
        }
    }
}
