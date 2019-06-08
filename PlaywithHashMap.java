package interview.collections;

import java.util.HashMap;
//when you put new value with same key, out method retuns old value
public class PlaywithHashMap {
    HashMap hm = new HashMap<String, String>();


    public static void main(String args[]) {
     /*   System.out.println( hm.put("1","a"));
        System.out.println( hm.put("1","b"));*/
    }

    public void useMyMap() {
        System.out.println(hm.put("1", "a"));
        synchronized (this) {
            this.useMyMap1();
        }
    }

    public void useMyMap1() {
        System.out.println(hm.put("2", "b"));

    }
}