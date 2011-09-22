/*
 * Copyright (C) 2011, UQAM
 * 
 * $Revision: 1.0.0.0 $
 */
package ca.uqam.inf2015.aut2011.parmenide;

import ca.uqam.inf2015.aut2011.parmenide.infrastructure.log.Logger;
import ca.uqam.inf2015.aut2011.parmenide.infrastructure.util.FileManager;
import ca.uqam.inf2015.aut2011.parmenide.infrastructure.util.LoanFileManager;
import java.io.File;

/**
 * Calculer les modalités de remboursement de prêt.
 * 
 * @author Frederic Thibodeau
 * @author Roosvelt Lamour
 * @version 1.0
 */
public class CalculateRepayLoan {
    
    private String[] arguments;
    private String[] inputFiles;
    
    public CalculateRepayLoan(String[] args){
        arguments = args;
    }
    
    public boolean isValidArgsInputs(){
    
        if(arguments != null && arguments.length == 2){
            
            if(!FileManager.isValidPath(arguments[0]))
                return false;
            
            if(!FileManager.isValidPath(arguments[1])){
                File outputPath = new File(arguments[1]);
                return outputPath.mkdir();
            }
            
            return true;        
        }
        else{
            return false;
        }
    }
    
    public void calculateLoanWithInputs(){
    
        getInputFilesGroup();
        processInputFiles();
    }
    
    private void getInputFilesGroup(){
        
        //inputFiles = FileManager.getInputFiles();
                
    }
    
    private void processInputFiles(){
        
        for (int i = 0; i < inputFiles.length; i++) {
            String inputFile = inputFiles[i];
            
            LoanFileManager loanManager = new LoanFileManager(inputFile);
            loanManager.parseInputFileExtension();
            if(loanManager.isValidLoanExtension()){
                
                loanManager.readInputFile();
                loanManager.deserializeJSonContent();
                loanManager.calculateAmortization();
                loanManager.serializeJSonContent();
                loanManager.writeInputFile();
            }else{
                Logger.Log("Invalid json file "+inputFile);
            }
        }        
   
    }
    
}
