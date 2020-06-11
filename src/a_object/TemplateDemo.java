package a_object;

/*
ģ�巽�����ģʽ

���󣺻�ȡһ�γ������е�ʱ�䡣
ԭ����ȡ����ʼ�ͽ�����ʱ�䲢������ɡ�

��ȡʱ�䣺System.currentTimeMillis();

����������Ż��󣬾Ϳ��Խ���������⡣

���ַ�ʽ��ģ�巽ʽ���ģʽ��

ʲô��ģ�巽����?
�ڶ��幦��ʱ�����ܵ�һ������ȷ���ģ�������һ�����ǲ�ȷ������ȷ���Ĳ�����ʹ�ò�ȷ���Ĳ��֡�
��ô��ʱ�ͽ���ȷ���Ĳ��ֱ�¶��ȥ���ɸ��������ȥ��ɡ�
 */

abstract class GetTime
{
	public final void getTime()
	{
		long start = System.currentTimeMillis();
		runcode();
		long end = System.currentTimeMillis();
		System.out.println("���룺"+(end-start));
	}
	abstract public void runcode();
	
}
class SubTime extends GetTime
{
	public void runcode()
	{
		for(int x=0;x<1000;x++)
		{
			System.out.println(x);
		}
	}
}

public class TemplateDemo 
{

	public static void main(String[] args) 
	{
		SubTime gt = new SubTime();
		gt.getTime();

	}

}
