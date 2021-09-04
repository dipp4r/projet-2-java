/**
 *Read all the symptoms in the file and save it in a list.
 * @author el hadji sarr
*/
package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.List;

public class SymptomReader {
    /**
     * Read symptoms from a file.
     * @param filename file which contains the list of the symptoms.
     * @return the list of symptoms.
     */
    public List<String> reader(String filename){
        ReadSymptomDataFromFile Symps=new ReadSymptomDataFromFile(filename);
        List<String> MySymps=new ArrayList<String>();
        MySymps=Symps.getSymptoms();
        return MySymps;
    }
}

