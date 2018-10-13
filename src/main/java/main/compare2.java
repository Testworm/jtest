
import java.lang.reflect.Field;
import java.util.ArrayList;

public class compare2 {
    public void bianLi(Object obj){
        Field[] fields = obj.getClass().getDeclaredFields();
        for(int i = 0 , len = fields.length; i < len; i++) {
            // ����ÿ�����ԣ���ȡ������
            String varName = fields[i].getName();
            try {
                // ��ȡԭ���ķ��ʿ���Ȩ��
                boolean accessFlag = fields[i].isAccessible();
                // �޸ķ��ʿ���Ȩ��
                fields[i].setAccessible(true);
                // ��ȡ�ڶ���f������fields[i]��Ӧ�Ķ����еı���
                Object o;
                try {
                    o = fields[i].get(obj);
                    System.err.println("����Ķ����а���һ�����µı�����" + varName + " = " + o);
                } catch (IllegalAccessException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                // �ָ����ʿ���Ȩ��
                fields[i].setAccessible(accessFlag);
            } catch (IllegalArgumentException ex) {
                ex.printStackTrace();
            }
        }
    }

    public boolean isListEqual(ArrayList l0, ArrayList l1){
        if (l0 == l1)
            return true;
        if (l0 == null && l1 == null)
            return true;
        if (l0 == null || l1 == null)
            return false;
        if (l0.size() != l1.size())
            return false;
        for (Object o : l0) {
            if (!l1.contains(o))
                return false;
        }
        for (Object o : l1) {
            if (!l0.contains(o))
                return false;
        }
        return true;
    }
}
