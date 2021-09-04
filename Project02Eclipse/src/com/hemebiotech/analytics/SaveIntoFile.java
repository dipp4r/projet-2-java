package com.hemebiotech.analytics;
/**
 *Write the map ordered alphabetically on a file
 * @param filename file which the symptoms and their occurrence are saved.
 * @param analytics map which contains the symptoms and the number of their occurrences
 */

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

public class SaveIntoFile implements ISaveIntoFile{
    public void saveIntoFile(String filename, Map<String,Integer> analytics ) {

        Set<String> ordSymps=analytics.keySet();

        FileWriter writer = null;
        try {
            writer = new FileWriter(filename);
            for(String keys:ordSymps){
                System.out.println(keys+" : "+analytics.get(keys));
                writer.write(keys+" : "+analytics.get(keys)+"\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Erreur lors de l'écriture dans le fichier");
            e.printStackTrace();
        }

    }
}
