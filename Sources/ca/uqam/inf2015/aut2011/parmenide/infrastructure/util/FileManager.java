/*
 * Copyright (C) 2011, UQAM
 * 
 * $Revision: 1.0.0.0 $
 */
package ca.uqam.inf2015.aut2011.parmenide.infrastructure.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Gerer la sortie et l entree d un fichier
 * 
 * @author Frederic Thibodeau
 * @author Roosvelt Lamour
 * @version 1.0
 */
public class FileManager {
    
    /*
     * Lire un fichier
     * 
     * @param filePath fichier a lire 
     * @return Contenu du fichier
     * @throws IOException Exception de lecture du fichier 
     */
    public static String Read(String filePath) throws IOException{

        StringBuffer outputTextBuffer = new StringBuffer();
        FileReader fReader = null;
        BufferedReader buffer = null;
        try {
            fReader = new FileReader(filePath);
            buffer = new BufferedReader(fReader);
            do {
                String line = buffer.readLine(); 
                if ( line != null)
                    outputTextBuffer.append(line);
            } while(buffer.ready());
        } catch(IOException ioex) {
            throw ioex;
        } finally {
            try {
                buffer.close();
                fReader.close();
            } catch(Exception ex) {
                
            }
            buffer = null;
            fReader = null;
        }
        return outputTextBuffer.toString();        
    }
    
    /*
     * Ecrire un fichier
     * 
     * @param json contenu a ecrire
     * @param filePath fichier a ecrire 
     * @throws IOException Exception d ecriture du fichier 
     */
    public static void Write(String jsonContent, String filePath) throws IOException{
        
        FileWriter fWriter = null;
        BufferedWriter buffer = null;
        
        try {        
            fWriter = new FileWriter(filePath);
            buffer = new BufferedWriter(fWriter);
            buffer.write(jsonContent);
            
        } catch(IOException ioex) {
            throw ioex;
        } finally {
            try {
                buffer.close();
                fWriter.close();
            } catch(Exception ex) {
                
            }
            buffer = null;
            fWriter = null;
        }
    } 
    
    /*
     * 
     */
    public static String getFileExtension(String fileName) {
        String extension = "";
        if(fileName == null)
            return extension;
        if(fileName.length()==0)
            return extension;
        int pointIndex = fileName.lastIndexOf(".");
        if (pointIndex >= 0)
            extension = (fileName.substring(pointIndex+1, fileName.length())).trim();
        return extension;
    }
    
    /*
     * 
     */
    public static String getFileNameWithoutExt(String fileName) {
        String name = "";
        if(fileName == null)
            return name;
        if(fileName.length()==0)
            return name;
        int pointIndex = fileName.lastIndexOf(".");
        if (pointIndex >= 0)
            name = (fileName.substring(0,pointIndex)).trim();
        return name;
    }
    
    /*
     * 
     */
    public static boolean isValidFile(String fileName) {
        File sFile = new File(fileName);
        if(sFile != null && sFile.exists() && sFile.isFile())
            return true;
        return false;
    }  
    
    /*
     * 
     */
    public static boolean isValidPath(String pathName) {
        File sFile = new File(pathName);
        if(sFile != null && sFile.exists() && sFile.isDirectory())
            return true;
        return false;
    }    
}
