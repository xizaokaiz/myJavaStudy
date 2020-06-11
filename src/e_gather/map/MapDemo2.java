package e_gather.map;

/*
map���ϵ����ֱ�����ʽ��
1.Set<k> keySet����map�����еļ�����뵽Set���ϡ���Ϊset�߱���������
	���п��Ե�����ʽȡ�����еļ����ٸ���get��������ȡÿһ������ֵ
	
	Map���ϵ�ȡ��ԭ����map����ת��set���ϣ���ͨ��������ȡ����
2.Set<Map.Entry<k,v>> entrySet:��map�����е�ӳ���ϵ���뵽��set�����У��������ϵ���������;���:Map.Entry
								entrySet()-->��Map�����е�ӳ���ϵȡ���������ϵ����Map.Entry����
								��ô��ϵ����Map.Entry��ȡ���󣬾Ϳ���ͨ��Map.Entry��getKey��getValue������ȡ��ϵ�еļ���ֵ��
								
Map.Entry ��ʵEntryҲ��һ���ӿڣ�����Map�ӿ��е�һ���ڲ��ӿ�
interface Map
{
	public static interface Entry
	{
		public abstract Object getKey();
		public abstract Object getValue();
	}
}

class HashMap Implements Map
{
	class Hahs implements Map.Entry
	{
		public Object getKey(){}
		public Object getValue(){}
	}
}
*/


import java.util.*;

public class MapDemo2 
{

	public static void main(String[] args) 
	{
		Map<String,String> map = new HashMap<String,String>();
		
		map.put("01","zhansan1");
		map.put("02","zhansan2");
		map.put("03","zhansan3");
		map.put("04","zhansan4");
		
		//��Map�����е�ӳ���ϵȡ�������뵽Set�����С�
		Set<Map.Entry<String,String>> entrySet= map.entrySet();
		
		Iterator<Map.Entry<String,String>> it = entrySet.iterator();
		
		while(it.hasNext())
		{
			Map.Entry<String,String> me = it.next();
			String key = me.getKey();
			String value = me.getValue();
			System.out.println(key+":"+value);
			
		}
		
		
		
		//�Ȼ�ȡmap���ϵ����м���Set���ϣ�keySet();
		/*
		Set<String> keySet = map.keySet();
		//����Set���ϣ��Ϳ��Ի�ȡ���������
		Iterator<String> it = keySet.iterator();
		
		while(it.hasNext())
		{
			String key = it.next();
			//���˼�����ͨ��map���ϵ�get������ȡ���Ӧ��ֵ��
			String value = map.get(key);
			System.out.println("key:"+key+",value:"+value);
		}
		*/
		
		/*
		 * foreach����
		for(String str:keySet)
		{
			System.out.println(str+map.get(str));
		}
		*/
		
		
		

	}

}
