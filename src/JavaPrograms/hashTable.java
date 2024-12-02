package JavaPrograms; 

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set; 

public class hashTable {

    public static void main(String[] args) {
    	
        Hashtable<Integer,String> hm = new Hashtable<Integer,String>();
        hm.put(0, "hello");
        hm.put(1, "Bye");
        hm.put(2, "hola");
        hm.put(3, "bola");
        
        System.out.println(hm.get(2));
        hm.remove(42);
        System.out.println(hm.get(42));
        Set es=hm.entrySet();
        
        Iterator it=es.iterator();
        
        while (it.hasNext())
        {
        	Map.Entry mp=(Map.Entry)it.next();
        	System.out.println(mp.getKey());
        	System.out.println(mp.getValue());
        }
    }
} 