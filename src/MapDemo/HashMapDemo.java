package MapDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String,Object> map=new HashMap<>();
        map.put("name","张三");
        map.put("age",23);
        map.put("sex",'男');
        System.out.println(map);
        Map<String,Integer>map1=new HashMap<>();
        map1.put("李四",23);
        map1.put("玉皇大帝",1000);
        map1.clear();//删除
        map.putAll(map1);
        System.out.println(map);//将map1中的成员映射到map中
        System.out.println(map.size());//获取容器大小
        System.out.println(map.isEmpty());//判断是否为空
        System.out.println(map.containsKey("name"));//判断是否包含某个Key
        System.out.println(map.containsValue(23));//判断是否包含某个Value
        String name=map.get("name").toString();
        System.out.println(name);//通过key访问map中的元素
        String sex=map.get("sex").toString();
        System.out.println(sex);
        map.put("name","李四");//如果Map中新增数据 key相同 会覆盖掉之前key对应的数据
    }
}
