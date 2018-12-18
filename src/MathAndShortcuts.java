
public class MathAndShortcuts {

    
    public static void main(String[] args) {
        int x = 10;
        //Math class methods
        System.out.println("10 to power of 2 = " + Math.pow(x,2));
        System.out.println("Square root of 10 = " + Math.sqrt(x));
        double y = 8.987; //will produce 9
        //double y = (int)8.987;  //will produce 8
        System.out.println("8.987 rounded off is: " + Math.round(y));
        System.out.println("The bigger number is: " + Math.max(x, y));
            
        //random number
        int roll = (int)(Math.random() *6+1); //1 to 6
        //Math.random() * range + lower limit
        System.out.println("I rolled a " + roll);
        
        //shortcut calculations
        
        int a = 10;
        a+=10; //20 += MEANS increase by
        a-=5; //15
        System.out.println("a is now " + a);
        int b = a;
        b++;
        System.out.println("b is now " + b);
        a*=2; //a is now doubled to 30
        System.out.println("a is now " + a);
        int c = b++;
        //let c = b then  b increases by 1
        System.out.println("c = b++ -> c is now " + c + ", b is now " +b);
        c = ++b; //let c = b AFTER b has already increased -> c and b are now 18
        System.out.println("c = ++b -> c is now " + c + ", b is now " +b);
       
    }
    
}
