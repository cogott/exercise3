import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class sumEvenNumbers {

    public static void main(String[] args) {

        int evenSum = 0;
        for(int i=1;i<=100;i++){
            if(i%2==0){
                evenSum = evenSum + i;
        }
            System.out.println("The total of  even Numbers is " + evenSum);
        }
    }
}

