package g_IO.�ֽ���;

/*
��ȡ����¼�롣
System.out:��Ӧ���Ǳ�׼����豸������̨��
System.in:��Ӧ�ı�׼�����豸�����̡�

����
 ͨ������¼�����ݡ�
 ��¼��һ�����ݺ󣬾ͽ��������ݽ��д�ӡ��
 ���¼���������over����ôֹͣ¼�롣
 */
import java.io.*;
public class ReadIn 
{

	public static void main(String[] args) throws IOException
	{
		InputStream in = System.in;
		StringBuilder sb = new StringBuilder();
		while(true)
		{
			int ch = in.read();
			if(ch=='\r')
				continue;
			if(ch=='\n')
			{
				String s = sb.toString();
				if("over".equals(s))
					break;
				System.out.println(s.toUpperCase());//ת��Ϊ��д��ĸ
				sb.delete(0,sb.length());//��ջ�����
			}
			else
				sb.append((char)ch);
		}
		
		
		/*
		System.out.println('\r'+0);//��������
		System.out.println('\n'+0);
		*/

	}

}
