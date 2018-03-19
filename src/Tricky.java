/*
  	ISYS 320
  	Name(s): Clayton Bruce
  	Date: 3/18/2018
*/

// 1. Your predicted output 
// First to come out will be "this is message 1"
// Then it will say "this  is message2"
// Third it will repeat message1
// Last it will say "Done with message 2"
public class Tricky {
    public static void main(String[] args) {
        message1();
        message2();
        System.out.println("Done with main.");
    }
    
    public static void message1() {
        System.out.println("This is message1.");
    }
    
    public static void message2() {
        System.out.println("This is message2.");
        message1();
        System.out.println("Done with message 2.");
    }
}

//3. Were you correct? Explain any differences
//I was indeed correct.


