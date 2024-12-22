import java.util.Scanner;

public class Lleno_Q2 {
    public static void main(String[] args) throws Exception {
        Scanner Inp = new Scanner(System.in);

        int[] creaturePower = new int[10];
        int firstValue=0, secondValue=0, low=0, high=0, evenSum=0, oddSum=0;


        System.out.println("Enter 10 power levels of creatures: ");
        for (int i=0; i<10; i++){
            creaturePower[i]= Inp.nextInt();
        }
        Inp.close();

        for (int j=0; j<creaturePower.length-1; j++){ //For Bubble Sort
            for (int i=0; i<creaturePower.length-j-1; i++){
                firstValue = creaturePower[i];
                secondValue = creaturePower[i+1];

                if(creaturePower[i]>creaturePower[i+1]){
                    creaturePower[i] = secondValue;
                    creaturePower[i+1] = firstValue;
                }
            }
        }

        high=creaturePower[9];
        low=creaturePower[0];

         System.out.println("\nBubble Sort (Ascending): ");
        for (int i=0; i<10; i++){
            System.out.print(creaturePower[i]+" ");
        }


        for (int i=0; i<creaturePower.length; i++){
            if(creaturePower[i]%2 == 0){
                evenSum+=creaturePower[i];
            }
            else {
                oddSum+=creaturePower[i];
            }
        }



        for (int j=0; j<creaturePower.length; j++){ //For Selection Sort
            firstValue = j;
            for (int i=j; i<creaturePower.length; i++){
                if(creaturePower[i]>creaturePower[j]){
                    firstValue = i;
                }
            }
            secondValue = creaturePower[j];
            creaturePower[j] = creaturePower[firstValue];
            creaturePower[firstValue] = secondValue;
        }

        System.out.println("\n\nSelection Sort (Descending): ");
        for (int i=0; i<10; i++){
            System.out.print(creaturePower[i]+" ");
        }

        System.out.println("\n\nAnalysis:\nSum of Even Numbers: "+evenSum+"\nSum of Odd Numbers: "+oddSum+"\nMinimum Power Level: "+low+"\nMaximum Power Level: "+high);

    }
}
