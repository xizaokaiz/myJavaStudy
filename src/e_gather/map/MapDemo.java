package e_gather.map;

/*
Map�����ص㣺�ü��ϴ洢��ֵ�ԣ�һ��һ������棬����Ҫ��֤����Ψһ�ԡ�
	1.���
		put(K key, V value)
		putAll(Map<? extends K,? extends V> m) 
	2.ɾ��
		clear()
		remove(Object key)
	3.�ж�
		containsKey(Object key)
		containsValue(Object value)
		isEmpty() 
	4.��ȡ
		get(Object key) 
		size()
		values()
		
		entrySet()
		keySet()
		
Map
	|--Hashtable:�ײ��ǹ�ϣ�����ݽṹ�������Դ���null��nullֵ���ü������߳�ͬ���ġ�jdk1.0��Ч�ʵ͡�
	|--HashMap:�ײ��ǹ�ϣ�����ݽṹ������ʹ��null��nullֵ���ü������̲߳�ͬ���ġ�jdk1.2��Ч�ʸߡ�
	|--TreeMap:�ײ��Ƕ��������ݽṹ���������ڸ�Map�����еļ����������̲߳�ͬ����
	
��Set����
��ʵSet�ײ����ʹ����Map��ϡ�
 */
import java.util.*;
public class MapDemo 
{

	public static void main(String[] args) 
	{
		Map<String,String> map = new HashMap<String,String>();
		
		//���Ԫ�أ�������������ͬ����ֵ����ô����ӵ�ֵ�Ḳ��ԭ�м���Ӧ��ֵ
		//��put�����᷵�ر����ǵ�ֵ��
		map.put("01","zhansan1");
		map.put("02","zhansan2");
		map.put("03","zhansan3");
		
		System.out.println("containKey:"+map.containsKey("02"));
		//System.out.println("remove:"+map.remove("02"));
		
		System.out.println("get:"+map.get("02"));
		
		map.put("04",null);
		System.out.println("get:"+map.get("04"));
		//����ͨ��get�����ķ���ֵ���ж�һ�����Ƿ���ڣ�ͨ������null���жϡ�
		
		//��ȡmap���������е�ֵ��
		Collection<String> coll = map.values();
		System.out.println(coll);
		System.out.println(map);
	}

}
