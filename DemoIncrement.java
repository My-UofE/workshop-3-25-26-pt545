// Add your code below
public class DemoIncrement {
    public static void main(String[] args) {
        // Demonstration of the increment operator
        int a = 3;
        int b = a++ + 5;
        int x = 3;
        int y = ++x + 5;

        int p = 3;
        ++p;
        int q = p + 5; 

        System.out.print("a: " + a);
        // a:4
        System.out.print(", b: " + b);
        // b:8
        System.out.print(", x: " + x);
        // x:4
        System.out.print(", y: " + y);
        // y:9

        System.out.print(", p: " + p);

        System.out.println(", q: " + q);
        
        //System.out.println("a: " + a +", b: "+b +", x: "+ x+", y: " + y);
        // Replace the xxxxx in the following with the correct term
        System.out.println("i++ means post-increment");
        System.out.println("++i means pre-increment");
    }
}
