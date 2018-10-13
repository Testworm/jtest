package main;
import main.entity;
import java.util.ArrayList;
import java.util.ListIterator;
import main.compare;

public class mainTest {

    // 遍历对象属性
    public static void main(String []arg){
        entity entity0 = new entity("100020");
        entity entity1 = new entity("100021");
        entity entity2 = new entity("100022");
        entity0.setBirthday("19901024");
        entity0.setAge("30");

        entity1.setAge("40");
        entity1.setBirthday("20182010");

        entity2.setAge("50");
        entity2.setBirthday("20182012");
//        System.out.println(entity0.toString());
//        System.out.println(entity0);
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();

        arrayList0.add(entity0);
        arrayList0.add(entity1);
        arrayList1.add(entity0);
        arrayList1.add(entity2);
        System.out.println(arrayList0.size());
//        ListIterator li = arrayList.listIterator();
//        while (li.hasNext()){
//            System.out.println(li.next());
//        }
//        System.out.println("\n-----------------");

//        for(int i = 0; i<arrayList0.size();i++){
//            System.out.println(arrayList0.get(i));
//            System.out.println(arrayList0.get(i).getClass().toString());
//        }
        compare cm = new compare();
//        cm.bianLi(entity0);
        System.out.println(cm.isListEqual(arrayList0, arrayList1));

    }

}
