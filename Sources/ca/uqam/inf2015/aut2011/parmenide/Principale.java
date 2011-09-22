/*
 * Copyright (C) 2011, UQAM
 * 
 * $Revision: 1.0.0.0 $
 */
package ca.uqam.inf2015.aut2011.parmenide;

import ca.uqam.inf2015.aut2011.parmenide.infrastructure.log.Logger;

/**
 * Classe principale d entree du projet
 * 
 * @author Frederic Thibodeau
 * @author Roosvelt Lamour
 * @version 1.0
 */
public class Principale {

    private static CalculateRepayLoan calculateRepayLoan;
    
    /**
     * 
     * L entree principale du program
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            calculateRepayLoan = new CalculateRepayLoan(args);
            validateInputs();
            calculateLoanWithInputs();            
        
        }catch(Exception ex){
            Logger.Log(ex.getMessage());            
        }
        
        Logger.Log("Process Done"); 
    }
    
    private static void validateInputs() throws Exception {
        if(!calculateRepayLoan.isValidArgsInputs()){
            throw new Exception("Bad arguments passed");
        }
    }
    
    private static void calculateLoanWithInputs(){
        calculateRepayLoan.calculateLoanWithInputs();
    }
   
}