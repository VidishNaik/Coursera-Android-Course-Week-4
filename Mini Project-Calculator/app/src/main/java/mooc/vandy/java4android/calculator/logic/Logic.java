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

    private final static int ADD = 1;
    private final static int SUB = 2;
    private final static int MUL = 3;
    private final static int DIV = 4;
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
                Add add = new Add(argumentOne,argumentTwo,mOut);
                add.add();
                break;
            case SUB:
                Subtract sub = new Subtract(argumentOne,argumentTwo,mOut);
                sub.sub();
                break;
            case MUL:
                Multiply mul = new Multiply(argumentOne,argumentTwo,mOut);
                mul.mul();
                break;
            case DIV:
                Divide div = new Divide(argumentOne,argumentTwo,mOut);
                div.div();
                break;
        }

    }
}
