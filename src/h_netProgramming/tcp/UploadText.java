package h_netProgramming.tcp;

import java.io.*;
import java.net.*;

class TextClient 
{

	public static void main(String[] args) throws IOException
	{
		//����socket����
		Socket s = new Socket("192.168.137.1",10006);
		
		//Դ
		BufferedReader bufr = 
				new BufferedReader(new FileReader("E:\\Test\\net\\TCP\\IPDemo.java"));
		
		//Ŀ��,��ӡ
		PrintWriter out = new PrintWriter(s.getOutputStream(),true);
		
		//ʱ���
//		long time = System.currentTimeMillis();
//		out.println(time);
		
		String line = null;
		while((line=bufr.readLine())!=null)
		{
			out.println(line);
		}
		
		//�رտͻ��˵���������൱�ڸ�������һ���������
		s.shutdownOutput();
		
		//����������
//		out.println("over");
		
		//������
		BufferedReader bufIn = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		//��ȡһ��
		String str = bufIn.readLine();
		System.out.println(str);
		
		bufr.close();
		
		s.close();

	}

}

class TextServer 
{

	public static void main(String[] args) throws Exception
	{
		//�����
		ServerSocket ss = new ServerSocket(10006);
		
		//��ȡ�ͻ��˶���
		Socket s = ss.accept();
		String ip = s.getInetAddress().getHostAddress();
		System.out.println(ip+"...connected");
		
		//������
		BufferedReader bufIn = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		//Ŀ��
		PrintWriter out = new PrintWriter(new FileWriter("E:\\Test\\net\\TCP\\server.txt"),true);
		
		String line = null;
		
		while((line=bufIn.readLine())!=null)
		{
			//�жϽ������
//			if("over".equals(line))
//				break;

			out.print(line);
		}
		
		//��ӡ��ʾ
		PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
		pw.println("�ϴ��ɹ�");
		
		out.close();
		s.close();
		ss.close();

	}

}









