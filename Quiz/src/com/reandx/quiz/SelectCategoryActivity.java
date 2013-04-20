package com.reandx.quiz;

import java.util.ArrayList;
import java.util.Arrays;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SelectCategoryActivity extends Activity{

	private ListView mainListView ;  
	  private ArrayAdapter<String> listAdapter ;  
	    
	  /** Called when the activity is first created. */  
	  @Override  
	  public void onCreate(Bundle savedInstanceState) {  
	    super.onCreate(savedInstanceState);  
	    setContentView(R.layout.select_category);  
	      
	    // Find the ListView resource.   
	    mainListView = (ListView) findViewById( R.id.lstviewCategory );  
	  
	    // Create and populate a List of planet names.  
	    String[] categories = new String[] { "Mercury", "Venus", "Earth", "Mars",  
	                                      "Jupiter", "Saturn", "Uranus", "Neptune"};    
	    ArrayList<String> categoryList = new ArrayList<String>();  
	    categoryList.addAll( Arrays.asList(categories) );  
	      
	    // Create ArrayAdapter using the planet list.  
	    listAdapter = new ArrayAdapter<String>(this, R.layout.simple_row, categoryList);  
	      
	    // Add more planets. If you passed a String[] instead of a List<String>   
	    // into the ArrayAdapter constructor, you must not add more items.   
	    // Otherwise an exception will occur.  
	    listAdapter.add( "Ceres" );  
	    listAdapter.add( "Pluto" );  
	    listAdapter.add( "Haumea" );  
	    listAdapter.add( "Makemake" );  
	    listAdapter.add( "Eris" );  
	      
	    // Set the ArrayAdapter as the ListView's adapter.  
	    mainListView.setAdapter( listAdapter );        
	  }  
}
