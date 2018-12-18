
public class VariableReview {

    
    public static void main(String[] args) {
        //8 primative data types
        //primitive data type -> can only do 1 thing: hold a piece of data
        
        //whole numbers
        byte b = 127;                   //1 byte (8 bits -> 11111111 = 127)-> binary
        short s = 12345;                //2 bytes
        int a = 1234567890;             //4 bytes
        long l = 123456789012345678L;   //8 bytes
        
        //deciamls
        float f = 45.78F;    //4 bytes
        double d = 45.78;    //8 bytes
        
        //other
        char c = 't';
        boolean isfun = false;
        
        //strings - hold a string of characters / numbers
        //strings are NOT primitive, they have abilities (METHODS)
        String str = "I went to school today";
        //str can DO many things, example
        //Method fact 1: All methods have a return type, except for void
        //2 - Methods may or may NOT require incoming parameters
        //3 - Some methods have more than one version you can use
        
        int len = str.length(); 
        //length of str, returns an int, requires NO parameters
        System.out.println("The length of " + str + " is " + len);
        
        char lett = str.charAt(7);
        //returns the 8th letter as a char type, requires 1 parameter (location)
        System.out.println("The 8th letter is " + lett);
        
        String str1 = str.substring(0, 4); //1st 3 letters
        String str2 = str.substring(5); //gives from 6 to the end
        
        System.out.println("Letters 0 to 3 are: " + str1);
        System.out.println("From 6 to the end is: " + str2);
        
        //escape code: \n (new line) \t (tab)
        //Can use \ to print special characters like " or \
        String x,y,z;
        x = "First\t\t\tLast\t\tEmail\nJoe";
        System.out.println(x);
        y = "C:\\Users\\Documents";
        System.out.println(y);
        z = "I was like \"no way!\"";
        System.out.println(z);
        
        
        
    }
    
}
