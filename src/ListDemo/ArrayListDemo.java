package ListDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();

        //String[]stararr=new String[5];
        //stararr[0]="张三";数组中添加元素方式
/*
* ArrayList底层以数组的形式存在的*/
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("lululu");
        System.out.println(list);
        list.add("E");
        list.add("F");
        System.out.println(list);
        System.out.println(list.get(1));//index  访问 打印B
        System.out.println(list.size());//list长度大小
        list.remove(3);//移除  后面补全移除的位置
        System.out.println(list);
        list.set(0,"a");//替换
        System.out.println(list);
        //遍历list
        //第一种 增强for循环
        for (String s:list){
            System.out.print(s+"\t");
        }
        //迭代器进行迭代
        Iterator<String> iterator=list.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+"\t");
        }
        //for循环 以size长度
        for (int i=0;i<list.size();i++){
            String str=list.get(i);
            System.out.print(str+"\t");
        }
    }

}
