package d_string;
/*
4����ȡ�����ַ����������ͬ�Ӵ�����һ�����������̵��Ǹ������г���һ�εݼ����Ӵ���ӡ��
	"abcwerthelloyuiodef"
	"cvhellobnm"
	˼·��
	1�����̵��Ǹ��Ӵ����ճ��ȵݼ��ķ�ʽ��ȡ����
	2����ÿ��ȡ�����Ӵ�ȥ�������ж��Ƿ������
		����������Ѿ��ҵ���
 */
public class StringTest3 
{
	//��ϰ��
	public static String getMaxSubString(String s1,String s2)
	{
		String max = "",min = "";
		max = (s1.length()>s2.length())?s1:s2;//�������㷵��s1�����򷵻�s2
		min = (max==s1)?s2:s1;
		
		sop("max="+max+"...min="+min);
		for(int x=0;x<min.length();x++)
		{
			for(int y=0,z=min.length()-x;z!=min.length()+1;y++,z++)
			{
				String temp = min.substring(y,z);
				
				if(max.contains(temp))//if(s1.indexOf(temp)!=-1
					return temp;
			}
			
		}
		return "";
	}
	public static void main(String[] args) 
	{
		String s1 = "abcwerthelloyuiodef",s2 = "cvhellobnm";
		
		sop(getMaxSubString(s1,s2));

	}
	public static void sop(String str)
	{
		System.out.println(str);
	}


}
