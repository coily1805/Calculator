/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author mac
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Integer> theNumbers = new ArrayList<>(Arrays.asList(new Integer[] {1,2,3,4}));
        
        TheCalc myCalculator = new TheCalc(theNumbers);
        myCalculator.printNumbers();
        System.out.println(myCalculator.addNumbers());
        System.out.println(myCalculator.subtractNumbers());
    }
    
}
