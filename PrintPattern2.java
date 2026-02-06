import java.util.Scanner;
public class PrintPattern2{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = -1;

        while(size < 1 || size > 5){
            System.out.print("enter the size: ");
            size = in.nextInt(); 

            if(size < 1){
                System.out.println("too small!");
            }else if(size > 5){
                System.out.println("too big!");
            }
        }


        for (int row = 0; row < size; row++) {
        // Inner loop to print each of the columns of a particular row
            for (int col = 1; col <= size; col++) {
                System.out.print(((row)+ col));
            }
            
            for (int col = size ; col > 0; col--) {
                System.out.print(((row) + col ));
            }
        System.out.println("");
        }

        for (int row = size -1; row >= 0; row--) {
        // Inner loop to print each of the columns of a particular row
            for (int col = 1; col <= size; col++) {
                System.out.print(((row)+ col));
            }
            
            for (int col = size ; col > 0; col--) {
                System.out.print(((row) + col ));
            }
        System.out.println("");
        }


    }
 }