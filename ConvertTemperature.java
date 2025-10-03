//Tracy Do
//CIS35A 11Y, 62Z
//Assignment -1
//Due 10/03/2025
//Submitted 10/01/2025

import java.util.Scanner;

public class Part_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//variables for quantities
        int qtydegC, qtydegF;
       
        //variables for conversion
        float convtoF, convtoC;

        //create Scanner object to convert user input
        Scanner s1 = new Scanner(System.in);

        //prompt 1
        System.out.print("Enter a temperature in Centigrade: ");
        qtydegC = s1.nextInt();
        
        //calculate C to F conversion
        convtoF = 32.0f + qtydegC * (180.0f/100.0f);
        
        //output 1
        System.out.printf("%d°C is equivalent to %d°F%n", qtydegC, (int) convtoF);

        //prompt 2
        System.out.print("Enter a temperature in Fahrenheit: ");
        qtydegF = s1.nextInt();
        
        //calculate F to C conversion
        convtoC = (qtydegF - 32.0f) * (100.0f/180.0f);
        
        //output 2
        System.out.printf("%d°F is equivalent to %d°C%n", qtydegF, (int) convtoC);

        s1.close();
	}

}