/*
 * Copyright (C) 2011, UQAM
 * 
 * $Revision: 1.0.0.0 $
 */
package ca.uqam.inf2015.aut2011.parmenide.infrastructure.json;

import ca.uqam.inf2015.aut2011.parmenide.infrastructure.log.Logger;
import ca.uqam.inf2015.aut2011.parmenide.infrastructure.models.Loan;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;

/**
 * Gerer la serialization des objets json
 * 
 * @author Frederic Thibodeau
 * @author Roosvelt Lamour
 * @version 1.0
 */
public class JsonParser {

    /*
     * Serialize an object
     */
    public String serialize(Loan pret){
    
        Gson gson = new GsonBuilder().serializeNulls().create();
        Type listType = new TypeToken<List<Loan>>(){}.getType();

        String json = gson.toJson(pret,listType);
        Logger.Log("Serialize "+json);
        
        return json;
    }
    
    /*
     * Deserialize a string
     */
    public Loan deserialize(String jsonContent){
    
        Logger.Log("Deserialize "+jsonContent);
        Gson gson = new GsonBuilder().serializeNulls().create();
        Type listType = new TypeToken<List<Loan>>(){}.getType();
        Loan pret = gson.fromJson(jsonContent, listType);

        return pret;
    }
    
}
