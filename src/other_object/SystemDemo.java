package other_object;

/*
System:���еķ��������Զ��Ǿ�̬�ġ�
out:��׼�����Ĭ���ǿ���̨��
in:��׼���룬Ĭ���Ǽ��̡�

����ϵͳһЩ��Ϣ, 
��ȡϵͳ������Ϣ��Properties getProperties()
 */
import java.util.*;
public class SystemDemo 
{

	public static void main(String[] args) 
	{
		//��ΪProperties��Hashtable�����࣬Ҳ����Map���ϵ�һ���������
		//��ô����ͨ��map�ķ���ȡ���ü����е�Ԫ�ء�
		//�ü����д洢�Ķ����ַ�����û�з��Ͷ��塣
		Properties prop = System.getProperties();
		
		
		
		//�����ϵͳ���Զ���һЩ������Ϣ�أ�
		System.setProperty("mykey","myvalue");
		
		//��ȡָ��������Ϣ
		String value = System.getProperty("os.name");
		System.out.println("value="+value);
		
		//�ɲ�������jvm����ʱ����̬����һЩ������Ϣ�أ�
		//-D<name>=<value>
		String v = System.getProperty("haha");
		System.out.println("v="+v);
		
		//��ȡ����������Ϣ
		/*
		for(Object obj:prop.keySet())
		{
			String value = (String)prop.get(obj);
			System.out.println(obj+"::"+value);
		}
		*/
		
	}

}
