
package com.hemebiotech.analytics;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;



public class AnalyticsCounter {

	public static void main(String args[]) throws Exception, FileNotFoundException {

		SymptomReader reader=new SymptomReader();
		List <String> mySymps=new ArrayList<String>();
		mySymps=reader.reader("symptoms.txt");
		SymptomCounter counter=new SymptomCounter();
		Map<String,Integer> analytics=counter.counter(mySymps);
		Order maporder=new Order();
		analytics=maporder.order(analytics);
		SaveIntoFile sif=new SaveIntoFile();
		sif.saveIntoFile("resultout.txt",analytics);

	}
}
