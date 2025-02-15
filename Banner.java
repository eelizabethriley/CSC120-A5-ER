/*
 * Banner class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */

 /* A class Banner that can display an ascii banner with a message.*/
public class Banner {
    
    /* Message to print on Banner */
    private String message;

    /* Constructor */
    public Banner(String m) {
        this.message = m;
    }

    /*Print a decorative banner, resized to fit the message
     * 
     */
    public void display() {
        System.out.println("    " + "#".repeat(message.length()+2));
        System.out.print("  ###");
        System.out.print("-".repeat(message.length()));
        System.out.println("###");
        System.out.println(" ##  " + this.message + "  ##");
        System.out.println("  ###" + "-".repeat(message.length()) + "###");
        System.out.println("    " + "#".repeat(message.length()+2));
    }

    /* main method (for testing) */
    public static void main(String[] args) {
        Banner myBanner = new Banner("Hello world");
        myBanner.display();
    }
}
