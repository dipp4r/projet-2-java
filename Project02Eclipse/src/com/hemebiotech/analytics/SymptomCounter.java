/**
 * Count the number of occurence of each symptom in the list.
 * @param mySymps list which contains all the symptoms.
 */
package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SymptomCounter {
    public Map<String,Integer>counter(List<String> mySymps){
        Map<String,Integer> analytics=new HashMap<String,Integer>();
        for(String symptom:mySymps){
            if(analytics.containsKey(symptom)){
                int symptomcount=analytics.get(symptom);
                symptomcount++;
                analytics.put(symptom,symptomcount);
            }else{
                analytics.put(symptom,1);
            }
        }
        return analytics;
    }
}
