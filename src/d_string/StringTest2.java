package d_string;
/*
3����ȡһ���ַ�������һ���ַ������ֵĴ�����
	"abkkcdkkefkkskk"
	˼·��
	1���������������
	2����ȡkk��һ�γ��ֵ�λ�á�
	3���ӵ�һ�γ���λ�ú�ʣ����ַ����м�����ȡkk���ֵ�λ�á�
		ÿ��ȡһ�ξͼ���һ�Ρ�
	4������ȡ����ʱ��������ɡ�


*/

public class StringTest2 
{
	//��ϰ��,��ʽһ��
	public static int getSubCount(String str,String key)
	{
		int count = 0;
		int index = 0;
		
		while((index=str.indexOf(key))!=-1)
		{
			sop("str="+str);
			str = str.substring(index+key.length());
			
			count++;
		}
		return count;
	}
	
	//��ϰ������ʽ��
	public static int getSubCount_2(String str,String key)
	{
		int count = 0;
		int index = 0;
		while((index=str.indexOf(key,index))!=-1)
		{
			sop("index="+index);
			index = index+key.length();
			
			count++;
		}
		return count;
	}
	
	
	public static void main(String[] args) 
	{
		String str = "kkabkkcdkkefkks";
		
		//sop("count=="+str.split("kk").length);//������ʹ��
		
		sop("count="+getSubCount_2(str,"kk"));

	}
	
	public static void sop(String str)
	{
		System.out.println(str);
	}

}
