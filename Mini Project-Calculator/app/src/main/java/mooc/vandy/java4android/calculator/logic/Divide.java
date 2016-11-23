package mooc.vandy.java4android.calculator.logic;

import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Perform the Divide operation.
 */
public class Divide {
    // TODO -- start your code here

    ActivityInterface mOut;
    private int n1,n2;

    public Divide(int n1,int n2, ActivityInterface mOut)
    {
        this.n1 = n1;
        this.n2 = n2;
        this.mOut = mOut;
    }

    public void div()
    {
        if(n2 == 0)
            print("Cannot Divide by 0");
        else
            print(""+n1/n2+" R:"+n1%n2);
    }

    private void print(String n)
    {
        mOut.print(n);
    }
}
