/*
 * Copyright (C) 2011, UQAM
 * 
 * $Revision: 1.0.0.0 $
 */
package ca.uqam.inf2015.aut2011.parmenide.infrastructure.util;

import ca.uqam.inf2015.aut2011.parmenide.infrastructure.models.Loan;

/**
 * Contient l information d un fichier entrant
 * 
 * @author Frederic Thibodeau
 * @author Roosvelt Lamour
 * @version 1.0
 */
public class LoanFileManager {
    
    private String inputFileName;
    private String inputFileExtension;
    private String inputJSonContent;
    private String outputJSonContent;
    private Loan loan;
    
    public LoanFileManager(String inputFile){
        this.inputFileName = inputFile;
    }
    
    public boolean isValidLoanExtension(){
        if(inputFileExtension == null || 
           inputFileExtension.trim().equals("") ||
           !inputFileExtension.equals("json"))
            return false;
        return true;
    }
    
    public void parseInputFileExtension(){
        inputFileExtension = FileManager.getFileExtension(inputFileName);
    }
    
    public void readInputFile(){
        //inputJSonContent
    }
    
    public void deserializeJSonContent(){
        //deserialize inputJSonContent
        //get loan object
    }
    
    public void calculateAmortization(){
        //calculate Amortization with loan object
    }
    
    public void serializeJSonContent(){
        //serialize loan object
        //get outputJSonContent
    }
    
    public void writeInputFile(){
        //write outputJSonContent
    }    
}
