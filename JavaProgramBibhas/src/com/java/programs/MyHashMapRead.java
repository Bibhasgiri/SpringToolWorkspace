package com.java.programs;

import java.util.HashMap;
import java.util.Set;

public class MyHashMapRead {
public static void main(String[] args) {
	HashMap<String,String> h=new HashMap<String, String>();
	h.put("first", "FIRST INSERTED");
    h.put("second", "SECOND INSERTED");
    h.put("third","THIRD INSERTED");
    
    System.out.println(h);
    
    Set<String> keys=h.keySet();
   for(String key:keys) {
	   System.out.println("Value of "+key+"is:"+h.get(key));
   }
    
}
}
