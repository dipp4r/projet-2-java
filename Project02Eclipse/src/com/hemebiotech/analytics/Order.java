package com.hemebiotech.analytics;

import java.util.Map;
import java.util.TreeMap;

public class Order {
   public Map<String,Integer> order(Map<String,Integer> analytics){
        return new TreeMap<>(analytics);
    }
}
