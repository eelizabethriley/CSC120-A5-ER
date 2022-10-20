/*
 * Banner class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */
public class Banner {
    
    /* Message to print on Banner */
    private String message;
    private int mLength = 2;

    /* Constructor */
    public Banner(String m) {
        this.message = m;
    }

    /*
     * TODO: Modify this method to print a decorative banner, resized to fit the message
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
