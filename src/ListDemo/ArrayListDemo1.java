package ListDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        List<String> list= new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("赵武");
        System.out.println(list.get(1));
        System.out.println(list.isEmpty());
        System.out.println(list.remove(1));
        System.out.println(list.set(1,"a"));
        for (String str:list){
             System.out.println(str);
        }
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        Iterator<String> it=list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
