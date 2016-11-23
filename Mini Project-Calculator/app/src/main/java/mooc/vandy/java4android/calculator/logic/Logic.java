package mooc.vandy.java4android.calculator.logic;

import mooc.vandy.java4android.calculator.logic.Add;
import mooc.vandy.java4android.calculator.logic.Divide;
import mooc.vandy.java4android.calculator.logic.Multiply;
import mooc.vandy.java4android.calculator.logic.Subtract;
import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Performs an operation selected by the user.
 */
public class Logic 
       implements LogicInterface {
    /**
     * Reference to the Activity output.
     */
    protected ActivityInterface mOut;

    /**
     * Initilializing final static variables ADD,SUBTRACT,MULTIPLY,DIVIDE
     */
    private final static int ADD = 1;
    private final static int SUBTRACT = 2;
    private final static int MULTIPLY = 3;
    private final static int DIVIDE = 4;
    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out){
        mOut = out;
    }

    /**
     * Perform the @a operation on @a argumentOne and @a argumentTwo.
     */
    public void process(int argumentOne,
                        int argumentTwo,
                        int operation){
        // TODO -- start your code here
        switch (operation)
        {
            case ADD:
                Add addition = new Add(argumentOne,argumentTwo,mOut); // Create new Add Object
                addition.perform(); // Perform Addition
                break;
            case SUBTRACT:
                Subtract subtraction = new Subtract(argumentOne,argumentTwo,mOut); // Create new Subtract Object
                subtraction.perform(); //Perform Subtraction
                break;
            case MULTIPLY:
                Multiply multiplication = new Multiply(argumentOne,argumentTwo,mOut); // Create new Multiply Object
                multiplication.perform(); //Perform Multiplication
                break;
            case DIVIDE:
                Divide division = new Divide(argumentOne,argumentTwo,mOut); // Create new Divide Object
                division.perform(); //Perform Division
                break;
        }

    }
}
