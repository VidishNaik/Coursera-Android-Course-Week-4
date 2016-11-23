package mooc.vandy.java4android.calculator.logic;

import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Perform the Add operation.
 */
public class Add {
    // TODO -- start your code here

    private ActivityInterface mOut;
    private int n1,n2;

    public Add(int n1, int n2, ActivityInterface mOut)
    {
        this.n1 = n1;
        this.n2 = n2;
        this.mOut = mOut;
    }

    public void add()
    {
        print(n1+n2);
    }

    private void print(int n)
    {
        mOut.print(""+n);
    }
}
