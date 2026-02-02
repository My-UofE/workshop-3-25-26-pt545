import java.util.Scanner;
public class PrintPattern1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("enter the size: ");
        int size = in.nextInt(); 

        for (int i = 1; i < size+1;++i){
            for (int j = 0; j < i;++j){
            System.out.print(j+1);

            }
            System.out.println();
        }


    }
 }