/*
 * Scarecrow class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */

class Scarecrow {

    /* Parts of the Scarecrow
     * Implement each class
     */
    private Pumpkin head; 
    private Shirt body;
    private Pants legs;
    private Boot leftFoot;
    private Boot rightFoot;
    private String message;
    private Banner sign;


    /* Constructor
     * Initialize remaining parts
     */
    public Scarecrow(Pumpkin h, Shirt b, Pants l, Boot lF, Boot rF) {
        head = h;
        body = b;
        legs = l;
        leftFoot = lF;
        rightFoot = rF;
        message = "Fall is here!";
        sign = new Banner(message); 
    }

    /* Displays the Scarecrow 
     * Call the .display() method of each part... 
     *       ...in the right order!
    */
    public void display() {
        sign.display();
        head.display();
        body.display();
        legs.display();
        leftFoot.display();
        rightFoot.display();
    
    }

    /* Main method (for testing) */
    public static void main(String[] args) {
        // Don't forget to update the line below if you modify the constructor
        Scarecrow myScarecrow = new Scarecrow(new Pumpkin(), new Shirt(), new Pants(), new Boot("left"), new Boot("right"));
        // If a message was passed in on the command line, extract and store it
        // In Step 4, you'll pass this value along to your Banner constructor
        if (args.length > 0) {
            myScarecrow.message = args[0];
            myScarecrow.sign = new Banner(myScarecrow.message);
        }

        myScarecrow.display();
    }

}
