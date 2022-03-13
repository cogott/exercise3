import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class BMICalculator {

    public static void main(String[] args) throws IOException{
        float heightCuba, weightCuba, bmiCuba;
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        System.out.println("THIS PROGRAM CALCULATES YOUR BMI");
        System.out.println("Enter your height in cm and press Enter: ");
        heightCuba = Float.parseFloat(br.readLine())/100;
        System.out.println("Enter your weight and press Enter");
        weightCuba = Float.parseFloat(br.readLine());

        bmiCuba = (float) (weightCuba/(Math.pow(heightCuba, 2)));
        System.out.printf("Your BMI is: " + "%2.2f, \n", bmiCuba);

        if( bmiCuba<16) {
            System.out.printf("Starvation");
        } else if ((bmiCuba >= 16)&&(bmiCuba <16.99 )){
            System.out.printf("emaciation");
        } else if ((bmiCuba >= 17)&&(bmiCuba <18.49 )){
            System.out.printf("underweight");
        }else if ((bmiCuba >= 18.50)&&(bmiCuba <22.99 )){
            System.out.printf("normal, low range");
        }else if ((bmiCuba >= 23)&&(bmiCuba <24.99 )){
            System.out.printf("normal, high range");
        }else if ((bmiCuba >= 25)&&(bmiCuba <27.49 )){
            System.out.printf("overweight, low");
        }else if ((bmiCuba >= 27.50)&&(bmiCuba <29.99 )){
            System.out.printf("overweight, high range");
        }else if ((bmiCuba >= 30)&&(bmiCuba <34.9 )){
            System.out.printf("1st degree obesity");
        }else if ((bmiCuba >= 35)&&(bmiCuba <39.9 )){
            System.out.printf("2nd Degree obesity");
        }else if ((bmiCuba >= 40)){
            System.out.printf("3rd Degree obesity");
        }


    }
}
