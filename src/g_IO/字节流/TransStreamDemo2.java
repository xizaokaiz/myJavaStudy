package g_IO.�ֽ���;

/*
����������-1 
1.Դ������¼�롣
	Ŀ�ģ�����̨��

2.������Ѽ���¼������ݴ洢��һ���ļ��С�
Դ�����̡�
Ŀ�ģ��ļ���

3.������Ҫ��һ���ļ������ݴ�ӡ�ڿ���̨�ϡ�
Դ���ļ���
Ŀ�ģ�����̨��

�������Ļ������ɣ�
��ʹ��ľ����������кܶ࣬��֪��������һ����

ͨ��������ȷ����ɣ�
1.��ȷԴ��Ŀ�ġ�
	Դ����������InputStream Reader
	Ŀ�ģ��������OutputStream Writer
2.��ȷ�����������Ƿ��Ǵ��ı���
	�ǣ��ַ�����
	���ǣ��ֽ�����
3.����ϵ��ȷ������ȷҪʹ���ĸ�����Ķ���
	ͨ���豸���������֣�
	Դ�豸���ڴ棬Ӳ�̣����̡�
	Ŀ���豸���ڴ棬Ӳ�̣�����̨��

����
1.��һ���ı��ļ��е����ݴ洢����һ���ļ��У������ļ���
	Դ����Ϊ��Դ������ʹ�ö�ȡ����InputStream Reader
	�ǲ��ǲ����ı��ļ���
	�ǣ���ʱ�Ϳ���ѡ��Reader��
	������ϵ����ȷ�ˡ�
	
	��������ȷҪʹ�ø���ϵ�е��ĸ�����
	��ȷ�豸��Ӳ���ϵ�һ���ļ���
	Reader��ϵ�п��Բ����ļ��Ķ����� FileReader
	
	�Ƿ���Ҫ���Ч�ʣ��ǣ�����Reader��ϵ�еĻ�������BufferedReader
	FileReader fr = new FileReader("a.txt");
	BufferedReader bufr = new BufferedReader(fr);
	
	Ŀ�ģ�OutputStream Writer
	�Ƿ��Ǵ��ı��ģ�
	�ǣ�Writer��
	�豸��Ӳ�̣�һ���ļ���
	Writer��ϵ�п��Բ����ļ��Ķ���FileWriter��
	�Ƿ���Ҫ���Ч�ʣ��ǣ�����Writer��ϵ�еĻ�������BufferedWriter
	
	FileWriter fw = new FileWriter("b.txt");
	BufferedWriter bufw = new BufferedWriter(fw);
*/

/*
��ϰ����һ��ͼƬ�ļ������ݴ洢����һ���ļ��������ļ���Ҫ�������ϸ�ʽ�Լ����������ȷ��
	Դ����ȡ����FileInputStream
	�ǲ��ǲ����ı��ļ�������
	
	��ȷ����
	��ȷ�豸��Ӳ���ϵ�һ���ļ���
	FileInputStream
	
	�Ƿ���Ҫ���Ч�ʣ��ǣ�BufferedInputStream
	
	FileInputStream fis = new FileInputStream("a.png");
	BufferedInputStream buis = new BufferedInputStream(fis);
	
	Ŀ�ģ�FileOutputStream
	�Ƿ��Ǵ��ı��ģ����ǡ�
	�豸��Ӳ�̣�һ���ļ���
	�Ƿ���Ҫ���Ч�ʣ��ǣ�BufferedOutputStream
	FileOutPutStream fops = new FileOutputStream("b.png");
	BufferedOutputStream buos = new BufferedOutputStream(fops);
----------------------------------------------------------------------------------
2.���󣺽�����¼������ݱ��浽һ���ļ��С�
	�����������Դ��Ŀ�Ķ����ڡ�
	��ô�ֱ������
				Դ��InputStream Reader
				�ǲ��Ǵ��ı����� Reader
				�豸�����̡���Ӧ�Ķ�����System.in.
				����ѡ��Reader��System.in��Ӧ�Ĳ����ֽ�����
				Ϊ�˲������̵��ı����ݷ��㡣ת���ַ��������ַ������������ġ�
				��Ȼ��ȷ��Reader����ô�ͽ�System.inת����Reader��
				�õ���Reader��ϵ��ת������InputStreamReader
				
				InputStreamReader isr = new InputStreamReader(System.in);
				
				��Ҫ���Ч������Ҫ��BufferedReader
				BufferedReader bufr = new BufferedReader(isr);
				
				Ŀ�ģ�outputStream Writer
				�Ƿ��Ǵ��ı����� Writer
				�豸��Ӳ�̣�һ���ļ���ʹ��FileWriter
				FileWriter fw = new FileWriter("c.txt");
				�Ƿ���Ҫ���Ч�ʣ���
				BufferedWriter bufw = new BufferedWriter(fw);
--------------------------------------------------------------------------------------------				
	��չ����Ҫ��¼������ݰ���ָ���ı����utf-8���������ݴ浽�ļ��С�
	
	Ŀ�ģ�outputStreamWriter
	�Ƿ��Ǵ��ı����� Writer
	�豸��Ӳ�̣�һ���ļ���ʹ��FileWriter
	FileWriter fw = new FileWriter("c.txt");
	
	����FileWriter��ʹ�õ�Ĭ�ϱ����GBK��
	���Ǵ洢ʱ����Ҫ����ָ�������utf-8����ָ���ı����ֻ��ת��������ָ����
	����Ҫʹ�õĶ�����OutputStreamWriter��
	����ת��������Ҫ����һ���ֽ�����������һ����Բ������ļ����ֽ��������FileOutputStream
	OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("d.txt"),"utf-8");
	
	�Ƿ���Ҫ���Ч�ʣ���
	BufferedWriter bufw = new BufferedWriter(osw);
	
	���Լ�ס��ת����ʲôʱ��ʹ�ã��ַ����ֽ�֮���������
	ͨ�����漰���ַ�����ת��ʱ����Ҫ�õ�ת������
--------------------------------------------------------------------------------------------
	Test����һ���ı����ݴ�ӡ�ڿ���̨�ϣ�Ҫ�������ϸ�ʽ�Լ����������ȷ��
 */

import java.io.*;

public class TransStreamDemo2 
{

	public static void main(String[] args)throws IOException 
	{
		//���·��䡰��׼��������--Դ
		//System.setIn(new FileInputStream("E:\\\\Test\\\\out3.txt"));
		//���·��䡰��׼�������--Ŀ��
		//System.setOut(new PrintStream("E:\\Test\\out33.txt"));
		//����¼�볣��д��
		BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
		//��ָ�������ʽʱ��ͨ����������������ݣ�ͨ���ֽڴ�С���Կ���
		//BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("E:\\Test\\out3.txt"),"utf-8"));
		//��ӡ�������������
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
