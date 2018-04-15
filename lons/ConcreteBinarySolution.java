package lons;


/**
 * Write a description of class ConcreteBinarySolution here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ConcreteBinarySolution extends BinarySolution
{
    private boolean[] design;
    private int index = -1;
    Neighbourhood<BinarySolution> neighbourhood;
    private ConcreteBinarySolution(boolean[] design) {
        this.design = design;
    }
    
    @Override
    public int getNumberOfElements(){
        return design.length;
    }
    
    @Override
    public boolean[] getDesignVector() {
        return design;
    }
    
    @Override
    public boolean getDesignVariable(int index) {
        return design[index];
    }
    
    @Override
    public int getIndex() {
        if (index==-1) {
            index = BinaryProblem.getIndexOfBitString(design);
        }   
        return index;
    }
    
    public static BinarySolution constructBinarySolution(boolean[] design) {
        return new ConcreteBinarySolution(design);
    }
    
}