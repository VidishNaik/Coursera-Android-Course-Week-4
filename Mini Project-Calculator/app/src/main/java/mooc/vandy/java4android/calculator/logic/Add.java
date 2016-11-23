package mooc.vandy.java4android.calculator.logic;

import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Perform the Add operation.
 */
public class Add extends Operations {
    // TODO -- start your code here

    private ActivityInterface mOut;
    private int n1, n2;

    public Add(int n1, int n2, ActivityInterface mOut) //Constructor
    {
        // Initialize values
        this.n1 = n1;
        this.n2 = n2;
        this.mOut = mOut;
    }

    public void perform() {
        print("" + (n1 + n2), mOut); //Call print function in Operation.java to print output
    }
}
