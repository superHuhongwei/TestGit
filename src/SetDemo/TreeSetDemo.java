package SetDemo;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> ts=new TreeSet<>();
        ts.add("A");
        ts.add("C");
        ts.add("B");
       /* System.out.println(ts.size());
        System.out.println(ts.remove("B"));
        System.out.println(ts.isEmpty());*/
        for (String s:ts){
            System.out.println(s);
        }
        Iterator<String>it=ts.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
