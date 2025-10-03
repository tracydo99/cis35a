//Tracy Do
//CIS35A 11Y, 62Z
//Assignment -1
//Due 10/03/2025
//Submitted 10/01/2025

import java.util.Scanner;

public class Part_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//variables for quantities
        int qtytv, qtyvcr, qtyremote, qtycd, qtytape;

        //constants
        final float uptv = 400.00f;
        final float upvcr = 220.00f;
        final float upremote = 35.20f;
        final float upcd = 300.00f;
        final float uptape = 150.00f;
        
        //variables for "total price" of each product
        float tptv, tpvcr, tpremote, tpcd, tptape;

        //variables for totals
        float subtotal, tax, gtotal;

        //create Scanner object to read user input
        Scanner s1 = new Scanner(System.in);

        //prompts
        System.out.printf("How many TV's were sold? ");
        qtytv = s1.nextInt();

        System.out.printf("How many VCR's were sold? ");
        qtyvcr = s1.nextInt();

        System.out.printf("How many remote controller's were sold? ");
        qtyremote = s1.nextInt();

        System.out.printf("How many CD's were sold? ");
        qtycd = s1.nextInt();

        System.out.printf("How many Tape Recorder's were sold? ");
        qtytape = s1.nextInt();
        
        //calculate total price for each product (line)
        tptv = uptv * qtytv;
        tpvcr = upvcr * qtyvcr;
        tpremote = upremote * qtyremote;
        tpcd = upcd * qtycd;
        tptape = uptape * qtytape;

        //calculate totals
        subtotal = tptv + tpvcr + tpremote + tpcd + tptape;
        tax = subtotal * 0.0825f;
        gtotal = subtotal + tax;
        
        //output, or the "receipt"
        System.out.printf("\n\t%2s\t%-30s\t%15s\t%15s\n", "QTY", "Description", "Unit Price", "Total Price");

        System.out.printf("\t%2d\t%-30s\t%15.2f\t%15.2f\n", qtytv, "TV", uptv, tptv);
        System.out.printf("\t%2d\t%-30s\t%15.2f\t%15.2f\n", qtyvcr, "VCR", upvcr, tpvcr);
        System.out.printf("\t%2d\t%-30s\t%15.2f\t%15.2f\n", qtyremote, "Remote Controller", upremote, tpremote);
        System.out.printf("\t%2d\t%-30s\t%15.2f\t%15.2f\n", qtycd, "CD Player", upcd, tpcd);
        System.out.printf("\t%2d\t%-30s\t%15.2f\t%15.2f\n", qtytape, "Tape Recorder", uptape, tptape);

        System.out.println("--------------------------------------------------------------------------");
        System.out.printf("\t%-34s\t%15s\t%15.2f\n", "", "SUBTOTAL:", subtotal);
        System.out.printf("\t%-34s\t%15s\t%15.2f\n", "", "TAX:", tax);
        System.out.printf("\t%-34s\t%15s\t%15.2f\n", "", "TOTAL:", gtotal);

        s1.close();
	}

}

//Test Case Set 1 -> 2 1 4 1 2
//How many TV's were sold? 2
//How many VCR's were sold? 1
//How many remote controller's were sold? 4
//How many CD's were sold? 1
//How many Tape Recorder's were sold? 2
//
//	QTY	Description                   	     Unit Price	    Total Price
//	 2	TV                            	         400.00	         800.00
//	 1	VCR                           	         220.00	         220.00
//	 4	Remote Controller             	          35.20	         140.80
//	 1	CD Player                     	         300.00	         300.00
//	 2	Tape Recorder                 	         150.00	         300.00
//--------------------------------------------------------------------------
//	                                  	      SUBTOTAL:	        1760.80
//	                                  	           TAX:	         145.27
//	                                  	         TOTAL:	        1906.07
//
//Test Case Set 2 -> 3 0 2 0 21 
//How many TV's were sold? 3
//How many VCR's were sold? 0
//How many remote controller's were sold? 2
//How many CD's were sold? 0
//How many Tape Recorder's were sold? 21
//
//	QTY	Description                   	     Unit Price	    Total Price
//	 3	TV                            	         400.00	        1200.00
//	 0	VCR                           	         220.00	           0.00
//	 2	Remote Controller             	          35.20	          70.40
//	 0	CD Player                     	         300.00	           0.00
//	21	Tape Recorder                 	         150.00	        3150.00
//--------------------------------------------------------------------------
//	                                  	      SUBTOTAL:	        4420.40
//	                                  	           TAX:	         364.68
//	                                  	         TOTAL:	        4785.08