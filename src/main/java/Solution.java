public class Solution {
    
    
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * 
     * Problem 1: Exam Average
     */

    public double average(double t1, double t2, double t3, double t4) {
        
        return (t1+t2+t3+t4)/4;
    }

    public int roundAverage(double average) {

        return (int) (average+0.5);
    }

    public boolean isPassing(int roundedAverage) {
        
        return roundedAverage >= 64;
    }

    /*
    Problem 2: Stock Price 
    */

    public double totalStock(int shares, double price) {

        return shares * price;
    }


    public int roundValueChange(double totalStock) {

        return (int) Math.round(totalStock);
    }

    /*
    Problem 3: Digit Incrementer 
    */
   
    public double adjustDigits(double userDouble) {
        int num = (int) Math.round(userDouble * 100);
        int whole = num / 100; 
        int decimals = num % 100;

        int hundreds = whole / 100;
        int tens = whole / 10 % 10;
        int ones = whole % 10; 
        int adjustedTens = (decimals / 10 + 1) % 10;
        int adjustedOnes = (decimals % 10 + 1) % 10;
        int adjustedWhole = (tens + 1) % 10 * 10 + (ones + 1) % 10;

        if (whole >= 100) {
            adjustedWhole += (hundreds + 1) % 10 * 100;
        }

        return adjustedWhole + (adjustedTens * 10 + adjustedOnes) / 100.0;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
    }

}
