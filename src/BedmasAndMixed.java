
public class BedmasAndMixed {

    public static void main(String[] args) {
        int x = 22, y=x*2; //y=44
        double z = (double)y/7;   //z= 42 R2, 6.2857
        System.out.println("z is now " + z);
        System.out.format("z is now %.2f\n",z);
        //must cast to convert int to double to get correct answer
        int leftovercandy = y % 7; //% = MOD = Remainder of a divide
        System.out.format("I have %d candies leftover for me\n", leftovercandy);
        
        System.out.println("BEDMAS\n======\n");
        int e,f,g;
        e=f=g=5; //all = 5 now
        int ans;
        
        ans = e + f * g; //5 + 25 = 30
        System.out.format("%d + %d * %d = %d\n", e,f,g,ans);
        
        ans = (e + f) * g; //10 * 5 = 50
        System.out.format("(%d + %d) * %d = %d\n", e,f,g,ans);
        
        ans = e + f % g; //5 + 0 =5
        System.out.format("%d + %d %% %d = %d\n", e,f,g,ans);
        
        // use %2 to find even vs. odd
        //it'll be 1 if its odd
        
        ans = (e + f) % g; //10 % 5 =0
        System.out.format("(%d + %d) %% %d = %d\n", e,f,g,ans);
    }
    
}
