package g_IO.�ֽ���;

/*
 * �ַ���-->�ֽ���          �ֽ���-->�ַ���
�ַ�����
FileReader
FIleWriter

BufferedReader
BufferedWriter
�ֽ�����
FileInputStream
FileOutputStream

BufferedInputStream
BufferedOutputStream
--------------------------------------------------------------
ͨ���ղŵļ���¼��һ�����ݲ���ӡ���д��������ʵ���Ƕ�һ�����ݵ�ԭ��
Ҳ����readLine������
�ܲ���ֱ��ʹ��readLine��������ɼ���¼���һ�����ݵĶ�ȡ�أ�

readLine������BufferedReader���еķ�����
������¼���read�������ֽ���InputStream�ķ�����
��ô�ܲ��ܽ��Խ���ת���ַ�������ʹ���ַ����������е�readLine�����أ�
 */
import java.io.*;
public class TransStreamDemo 
{

	public static void main(String[] args) throws IOException
	{
		/*
		//��ȡ����¼�����
		InputStream in = System.in;
		//���ֽ�������ת���ַ�������ʹ��ת������InputStreamReader��
		InputStreamReader isr = new InputStreamReader(in);
		//Ϊ�����Ч�ʣ����ַ������л����������ĸ�Ч������BufferedReader��
		BufferedReader bufr = new BufferedReader(isr);
		*/
		//����¼�볣��д��
		BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
		/*
		String line = null;
		while((line=bufr.readLine())!=null)
		{
			if("over".equals(line))
				break;
			System.out.println(line.toUpperCase());
		}
		bufr.close();
		*/
		
		OutputStream out = System.out;
		BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(System.out));
		String line = null;
		while((line=bufr.readLine())!=null)
		{
			if("over".equals(line))
				break;
			bufw.write(line.toUpperCase());
			bufw.newLine();
			bufw.flush();
		}
		bufw.close();
		bufr.close();
		
		
	}

}
