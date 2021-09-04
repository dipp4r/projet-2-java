package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;

public class ModifSymptoms  {

    public void addSymptom(String symptom) throws IOException {
        FileWriter writer=new FileWriter("symptoms.txt");
        writer.write(symptom);
        writer.close();
    }
    public void removeSymptom(String symptom){

    }
}
