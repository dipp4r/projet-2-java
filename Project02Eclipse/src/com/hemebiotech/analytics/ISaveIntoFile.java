package com.hemebiotech.analytics;

import java.util.Map;

public interface ISaveIntoFile {
    void saveIntoFile(String filename, Map<String,Integer> analytics );
}
