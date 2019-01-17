package MapDemo;

import java.util.*;

public class HashMapDemo1 {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("李四",23);
        map.put("张三",45);
        map.put("赵武",64);
        System.out.println(map.get("张三"));
        map.put(null,20);
        //遍历map的方式
        /*
        * 使用keySet
		*需要分别获取key和value，没有面向对象的思想
		* Set<K> keySet() 返回所有的key对象的Set集合
        * */
        Set<String>ks=map.keySet();
        Iterator<String> it=ks.iterator();
        while (it.hasNext()){
            String key  =it.next();
            Integer value=map.get(key);
            System.out.println("key="+key+"value"+value);
        }
        //第二种
        /*
        * 通过value获取所有值，不能获取到Key对象
        * Collection<V>value*/
        Collection<Integer> vs=map.values();
        Iterator<Integer> it1=vs.iterator();
        while (it1.hasNext()){
            Integer value=it1.next();
            System.out.println("value="+value);
        }
        //第三种 重点 使用  中心思想 面向对象
        // 把Map.Entry看做一个打包好的对象
        /*
        * 使用Map中的entrySet()方法获取存放Map.Entry<k,v>对象的集合
        * Set<Map.Entry<k,v>>entrySet()
        * 将该对象存入Set集合*/
        Set<Map.Entry<String,Integer>>entrySet=map.entrySet();
        //获取集合
        Iterator<Map.Entry<String,Integer>>iterator=entrySet.iterator();
        //迭代器迭代
        while (iterator.hasNext()){
            //Map.Entry<String,Integer> me=iterator.next();
            //返回的是封装了key和value对象的Map.Entry对象
            /*String key=me.getKey();
            Integer value=me.getValue();
            //获取key和value值
            System.out.println("key="+key+"value"+value);*/
            System.out.println(iterator.next());

        }
    }
}
