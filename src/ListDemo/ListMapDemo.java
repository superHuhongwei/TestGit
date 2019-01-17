package ListDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListMapDemo {
    public static void main(String[] args) {
        Map<String,Object> map=new HashMap<>();
        map.put("排名",1);
        map.put("姓名","张三");
        map.put("年龄",33);
        map.put("性别","男");
        map.put("身高",180);
        map.put("语文成绩",99);
        map.put("数学成绩",100);
        Map<String,Object> map1=new HashMap<>();
        map1.put("排名",2);
        map1.put("姓名","李四");
        map1.put("年龄",24);
        map1.put("性别","男");
        map1.put("身高",175);
        map1.put("语文成绩",96);
        map1.put("数学成绩",99);
        Map<String,Object> map2=new HashMap<>();
        map2.put("排名",3);
        map2.put("姓名","王五");
        map2.put("年龄",22);
        map2.put("性别","女");
        map2.put("身高",160);
        map2.put("语文成绩",95);
        map2.put("数学成绩",94);
        Map<String,Object> map3=new HashMap<>();
        map3.put("排名",4);
        map3.put("姓名","赵六");
        map3.put("年龄",21);
        map3.put("性别","女");
        map3.put("身高",158);
        map3.put("语文成绩",76);
        map3.put("数学成绩",86);
        List<Map<String,Object>> list=new ArrayList<>();
        list.add(map);
        list.add(map1);
        list.add(map2);
        list.add(map3);
        for (Map<String,Object> m:list){
            System.out.println(m);
        }
    }
}
