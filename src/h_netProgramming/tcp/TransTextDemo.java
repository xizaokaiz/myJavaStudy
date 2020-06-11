package h_netProgramming.tcp;
import java.io.*;
import java.net.*;
/*
tcp��ϰ
���󣺽���һ���ı�ת����������
�ͻ��˸�����˷����ı�������˻Ὣ�ı�ת�ɴ�д�ڷ��ظ��ͻ��ˡ�
���ҿͻ��˿��Բ��ϵĽ����ı�ת�������ͻ�������overʱ��ת���ͽ�����

������
	�ͻ��ˣ�
	��Ȼ�ǲ����豸�ϵ����ݣ���ô�ÿ���ʹ��io������������io�Ĳ���������˼����
	Դ������¼�롣
	Ŀ�ģ������豸�������������
	���Ҳ��������ı����ݡ�����ѡ���ַ�����
	
���裺
1����������
2����ȡ����¼�롣
3�������ݷ�������ˡ�
4����ȡ����˷��صĴ�д���ݡ�
5������������Դ��

�����ı����ݿ���ʹ���ַ������в�����ͬʱ���Ч�ʣ����뻺�塣
 */

/*
�����ӳ��ֵ����⣺
���󣺿ͻ��˺ͷ���˶���Ī���ĵȴ�������Ϊʲô�أ�
��Ϊ�ͻ��˺ͷ���˶�������ʽ��������Щ����û�ж���������ǣ��ͻ�һֱ�ȣ����������˶��ڵȴ���
 */
class TransClient
{

	public static void main(String[] args) throws Exception
	{
		//�����ͻ���
		Socket s = new Socket("192.168.137.1",10005);
		
		//Դ,�����ȡ�������ݵ�������
		BufferedReader bufr = 
				new BufferedReader(new InputStreamReader(System.in));
		
		//����Ŀ�ģ�������д�뵽socket����������������
//		BufferedWriter bufOut = 
//				new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		//����������
		PrintWriter out = new PrintWriter(s.getOutputStream(),true);
		
		//����һ��socket��ȡ������ȡ���������صĴ�д��Ϣ��
		BufferedReader bufIn = 
				new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		String line = null;
		while((line=bufr.readLine())!=null)
		{
			if("over".equals(line))
				break;
			
//			//����
//			bufOut.write(line);
//			//һ�н������
//			bufOut.newLine();
//			bufOut.flush();
			
			//�Զ�ˢ��
			out.println(line);
			
			//��ӡ
			String str = bufIn.readLine();
			System.out.println("server:"+str);
		}
		
		bufr.close();
		s.close();
		
	}

}

/*
����ˣ�
Դ��socket��ȡ��
Ŀ�ģ�socket�����
�����ı���װ�Ρ�
 */
class TransServer
{

	public static void main(String[] args) throws Exception
	{
		//���������
		ServerSocket ss = new ServerSocket(10005);
		
		//��ȡ�ͻ��˶���
		Socket s = ss.accept();
		String ip = s.getInetAddress().getHostAddress();
		System.out.println(ip+"...connected");
		
		//��ȡsocket��ȡ���е����ݡ�
		BufferedReader bufIn = 
				new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		//Ŀ��,socket�����������д����д�뵽socket������������͸��ͻ��ˡ�
//		BufferedWriter bufOut = 
//				new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		//����������
		PrintWriter out = new PrintWriter(s.getOutputStream(),true);
		
		String line = null;
		while((line=bufIn.readLine())!=null)
		{
			System.out.println(line);
			
			//תΪ��д������
//			bufOut.write(line.toUpperCase());
			//һ�н������
//			bufOut.newLine();
//			bufOut.flush();
			
			//�Զ�ˢ��
			out.println(line.toUpperCase());
		}
		
		s.close();
		ss.close();
	}

}











