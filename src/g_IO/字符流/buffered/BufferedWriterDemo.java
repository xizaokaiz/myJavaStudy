package g_IO.�ַ���.buffered;

/*
�������ĳ�����Ϊ��������Ĳ���Ч�ʶ����ֵġ�

�����ڴ���������֮ǰ������Ҫ����������

�û��������ṩ��һ����ƽ̨�Ļ��з�:newLine();
 */
import java.io.*;
public class BufferedWriterDemo 
{

	public static void main(String[] args) throws IOException
	{
		//����һ���ַ�д��������
		FileWriter fw = new FileWriter("D:\\demo.txt");
		
		//Ϊ������ַ�д������Ч�ʣ������˻��弼����
		//ֻҪ����Ҫ�����Ч�ʵ���������Ϊ���������ݸ��������Ĺ��캯�����ɡ�
		BufferedWriter bufw = new BufferedWriter(fw);
		
		for(int x=1;x<5;x++)
		{
			bufw.write("abc"+x);
			bufw.newLine();
			bufw.flush();
		}
			
		
		//��ס��ֻҪ�õ�����������Ҫ�ǵ�ˢ�¡�
		bufw.flush();
		
		//��ʵ�رջ������������ڹرջ������е�������
		bufw.close();
		

	}

}
