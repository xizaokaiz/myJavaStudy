package other_object;

/*
Runtime����
���ಢû���ṩ���캯����
˵��������new������ô��ֱ���뵽�����еķ������Ǿ�̬�ģ�
���ָ����л��зǾ�̬������˵������϶����ṩ�˷�����ȡ�������
���Ҹ÷���ʱ��̬�ģ�������ֵ�����Ǳ������͡�

������ص���Կ�������ʹ���˵������ģʽ��ɡ�

�÷���ʱstatic Runtime getRuntime();
 */

public class RuntimeDemo 
{

	public static void main(String[] args) throws Exception
	{
		Runtime r = Runtime.getRuntime();
		//����һ������
		Process p = r.exec("notepad.exe SystemDemo.java");
		
//		Thread.sleep(4000);
//		
//		//ɱ������
//		p.destroy();
	}

}
