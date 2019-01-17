package ListDemo;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Map<String,Object> map1= new HashMap<>();
        map1.put("姓名","张三");
        map1.put("班级排名",1);
        map1.put("学校排名",62);
        Map<String,Object> map2=new HashMap<>();
        map2.put("姓名","李四");
        map2.put("班级排名",2);
        map2.put("学校排名",73);
        Map<String,Object> map3=new HashMap<>();
        map3.put("姓名","王五");
        map3.put("班级排名",3);
        map3.put("学校排名",78);
        List<Map<String, Object>> list=new ArrayList<>();
        list.add(map1);
        list.add(map2);
        list.add(map3);
        for (int i=0;i<list.size()-(list.size()-1);i++){
            System.out.print(list+"\n");
        }
    }
}
