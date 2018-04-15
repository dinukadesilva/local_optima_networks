package lons;


/**
 * Write a description of interface Problem here.
 * 
 * @author Jonathan Fieldsend
 * @version (a version number or a date)
 */
public interface BinaryProblem extends Problem<BinarySolution>
{
    static final int[] bitPowers = BinaryProblem.getBitPowers(31);
    static int getIndexOfBitString(boolean[] x) {
        int index = 0;
        for (int i=0; i<x.length; i++) 
            index += x[i] ? BinaryProblem.bitPowers[i] : 0;
        return index;  
    }
    
    static boolean[] getBitStringCorrespondingToIndex(int index, int bitStringLength) {
        boolean[] bitString = new boolean[bitStringLength];
        for (int i=bitStringLength-1; i>=0; i--) {
            if (index>=bitPowers[i]) {
                bitString[i] = true;
                index -= bitPowers[i];
            } else {
                bitString[i] = false;
            }
        }
        return bitString;
    }
    
    static int[] getBitPowers(int power) {
        int[] x = new int[power];
        x[0] = 1;
        for (int i = 1; i <= 30; i++)
            x[i] = x[i-1] * 2;
        return x;
    }
    
    static int getBitPower(int power) {
        int v = 1;
        for (int i = 1; i <= power; i++)
            v *= 2;
        return v;
    }
}