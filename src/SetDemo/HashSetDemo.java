package SetDemo;

import java.util.*;
/*
* Set集合
* 无序*/

public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> hs=new HashSet<>();
        hs.add("AB");
        hs.add("CD");
        hs.add("EF");
        System.out.println(hs);
        hs.add("ab");
        System.out.println(hs.remove("CD"));//移除
        System.out.println(hs.contains("EF"));//查找
        for (String s:hs){
            System.out.println(s);
        }
        Iterator<String> it=hs.iterator();
        while (it.hasNext()){
            it.next();
        }
        Map<String,Object> map=new HashMap<>();
        map.put("A",23);
        map.put("B",24);
        map.put("C",25);
        //for each遍历   map.keySet
        Set<String>set=map.keySet();
        for (String str:set) {
            System.out.println(str+" "+map.get(str));
        }
        //迭代器遍历
        Set<String>set1=map.keySet();
        Iterator<String>iterator=set1.iterator();
        while (iterator.hasNext()){
            String key=iterator.next();
            Integer value= (Integer) map.get(key);
            System.out.println(key+" "+value);
        }
    }
}
