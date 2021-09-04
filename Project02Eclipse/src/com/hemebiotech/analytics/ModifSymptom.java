package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;

public class ModifSymptom {
    void addSymptom(String filename,String symptom) throws IOException {
        FileWriter writer = new FileWriter (filename);
        writer.write(symptom);
    }
}
