package g_IO;
/*
��ӡ���������ṩ�˴�ӡ���������Խ������������͵����ݶ�ԭ����ӡ��

�ֽڴ�ӡ����PrintStream
���캯�����Խ��յĲ������ͣ�
1.file����	File
2.�ַ���·�� String
3.�ֽ������ OutputStream

�ֽڴ�ӡ����PrintWriter
���캯�����Խ��յĲ������ͣ�
1.file����	File
2.�ַ���·�� String
3.�ֽ������ OutputStream
4.�ַ������ Writer

�ַ���ӡ����PrintWriter
 */
import java.io.*;
public class PrintStreamDemo {

	public static void main(String[] args)throws IOException {
		//��ȡ��������
		BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
		//System.out-->����̨�����new FileWriter()-->��װ���������true-->�Զ�ˢ��
		PrintWriter out = new PrintWriter(new FileWriter("E:\\Test\\IO\\print.txt"),true);	
		
		String line = null;
		
		while((line=bufr.readLine())!=null)
		{
			if("over".equals(line))
				break;
			out.println(line.toUpperCase());
		}
		
		out.close();
		bufr.close();
		
		
	}

}
