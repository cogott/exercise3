import java.util.Random;

public class minMax {
    public static void main(String[] args) {

        int collectionSize = 10, i = 1;
        int number, min = 1, max = 100;

        System.out.println("The program draws" + collectionSize + "Integer numbers fro 1 to 100 and finds the smallest and greatest of them");
        Random r = new Random();

        while (i< collectionSize){
            number = Math.round((r.nextInt(100)+1));
            System.out.print(number + ",");

            if(number <max) min = number;
            if(number >min) max = number;

            i++;
        }
        System.out.println("");//Space
        System.out.println("The largest number is: " + max);
        System.out.println("The smallest number in the set is: " + min);

    }
}
