import TerminalIO.*;
public class ErrorTypes {

    public static void main(String[] args) {
        /*
            3 types of Errors:
            1) Syntax: spelling error -> program won't run
            2) Run-Time: programs starts, but then crashes
            3) Logic: Program runs fine, but gives unexpected results
        */
        //Example syntax error
        //  int x = 45.5; -> can't put double into int
        //  int y = 99 -> forgot the ;
        
        //Example logic error
        KeyboardReader k;
        k = new KeyboardReader();
        double wage, hours,pay;
        System.out.println("Enter hourly wage: ");
        wage = k.readDouble();
        hours = k.readDouble("Enter hours worked: ");
        //logic error
        pay = wage + hours;
        System.out.format("Your wrong pay is $%.2f\n", pay);
        //pay the right way
        pay = wage * hours;
        System.out.format("Your correct pay is $%.2f\n", pay);
        //Run-Time error
        int candies,kids,howmany=0,leftover=0;
        System.out.println("\n\n=============================\n\n");
        candies = k.readInt("How many candies are you sharing? ");
        kids = k.readInt("How many kids are getting candy? "); 
        //runtime will happen if i enter 0 at this point
        try{
        howmany = candies / kids; //round down to nearest int
        leftover = candies % kids;
        }
        catch(Exception e){
            System.out.println("Something went wrong, try again");
            System.out.println(e);
        };
        System.out.format("Each kid gets %d candies\n", howmany);
        System.out.format("There are %d candies\n", leftover);
        
    }
    
}
