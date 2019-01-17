package ListDemo;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<String> vt=new Vector<>();
        vt.add("德莱文");
        vt.add("暴走萝莉");
        vt.set(1,"炸弹人");
        vt.remove(1);
        vt.size();
        for (int i=0;i<vt.size();i++){
            System.out.println(vt.get(i));
        }
        for (String s:vt){
            System.out.println(s);
        }
        Iterator<String> it=vt.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
