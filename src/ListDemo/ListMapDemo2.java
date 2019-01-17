package ListDemo;

import java.util.*;

public class ListMapDemo2 {
    public static void main(String[] args) {
        Map<String,Object> map=new HashMap<>();
        map.put("排名",1);
        map.put("姓名","张三");
        map.put("年龄",23);
        map.put("性别","男");
        map.put("身高",180);
        map.put("语文成绩",99);
        map.put("数学成绩",100);
        Map<String,Object> mapa=new HashMap<>();
        mapa.put("排名",2);
        mapa.put("姓名","李四");
        mapa.put("年龄",24);
        mapa.put("性别","男");
        mapa.put("身高",175);
        mapa.put("语文成绩",96);
        mapa.put("数学成绩",99);
        Map<String,Object> mapb=new HashMap<>();
        mapb.put("排名",3);
        mapb.put("姓名","王五");
        mapb.put("年龄",22);
        mapb.put("性别","女");
        mapb.put("身高",160);
        mapb.put("语文成绩",95);
        mapb.put("数学成绩",94);
        Map<String,Object> mapc=new HashMap<>();
        mapc.put("排名",4);
        mapc.put("姓名","赵六");
        mapc.put("年龄",21);
        mapc.put("性别","女");
        mapc.put("身高",158);
        mapc.put("语文成绩",76);
        mapc.put("数学成绩",86);
        List<Map<String,Object>> list1=new ArrayList<>();
        list1.add(map);
        list1.add(mapa);
        list1.add(mapb);
        list1.add(mapc);
        Map<String,Object> mapA=new HashMap<>();
        mapA.put("排名",1);
        mapA.put("姓名","科比");
        mapA.put("年龄",24);
        mapA.put("性别","男");
        mapA.put("身高",201);
        mapA.put("语文成绩",77);
        mapA.put("数学成绩",86);
        Map<String,Object> mapB=new HashMap<>();
        mapB.put("排名",2);
        mapB.put("姓名","周啊");
        mapB.put("年龄",26);
        mapB.put("性别","男");
        mapB.put("身高",189);
        mapB.put("语文成绩",97);
        mapB.put("数学成绩",56);
        Map<String,Object> mapC=new HashMap<>();
        mapC.put("排名",3);
        mapC.put("姓名","孙武");
        mapC.put("年龄",24);
        mapC.put("性别","男");
        mapC.put("身高",175);
        mapC.put("语文成绩",45);
        mapC.put("数学成绩",64);
        Map<String,Object> mapD=new HashMap<>();
        mapD.put("排名",4);
        mapD.put("姓名","虎子");
        mapD.put("年龄",23);
        mapD.put("性别","男");
        mapD.put("身高",190);
        mapD.put("语文成绩",56);
        mapD.put("数学成绩",77);
        List<Map<String,Object>> list2=new ArrayList<>();
        list2.add(mapA);
        list2.add(mapB);
        list2.add(mapC);
        list2.add(mapD);
        Map<String,List<Map<String,Object>>> mapList=new HashMap<>();
        mapList.put("一班成绩",list1);
        mapList.put("二班成绩",list2);
        Set<String> set= mapList.keySet();
        System.out.println("-------------------------------");
        System.out.println("   "+"排名  姓名   身高 性别 语文成绩 数学成绩");
        for (String s:set){
            System.out.println(s+"==============================");
            for (Map<String,Object> m: mapList.get(s)) {
                System.out.println("    "+m.get("排名")+"\t "+m.get("姓名")+"   "+m.get("身高")+"   "+m.get("性别")+"    "+m.get("语文成绩")
                +"     "+m.get("数学成绩"));
            }
        }
        System.out.println("-----------------------------------");
    }
}
