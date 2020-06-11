package h_netProgramming.tcp;
/*
�ͻ��˲�����½
�ͻ��˶�����û�������Ч�顣

������û����ڣ��ڷ������ʾxxx���ѵ�¼��
���ڿͻ�����ʾxxx����ӭ���١�

������û����ڣ��ڷ������ʾxxx�����Ե�½��
���ڿͻ�����ʾxxx�����û������ڡ�

����½���Ρ�
 */
import java.io.*;
import java.net.*;
class LoginClient 
{

	public static void main(String[] args) throws Exception
	{
		Socket s = new Socket("192.168.137.1",10008);
		
		//��ȡ����¼��
		BufferedReader bufr = 
				new BufferedReader(new InputStreamReader(System.in));
		
		//Ŀ��
		PrintWriter out = new PrintWriter(s.getOutputStream(),true);
		
		//��ȡ��
		BufferedReader bufIn = 
				new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		for(int x=0;x<3;x++)
		{
			//��ȡһ��
			String line = bufr.readLine();
			//����ȡ����
			if(line==null)
				break;
			//�ͻ��˴�ӡ
			out.print(line);
			
			//��ȡ����˷�����Ϣ
			String info = bufIn.readLine();
			System.out.println("info:"+info);
			//����ȡ���ѵ�¼��Ϣ
			if(info.contains("��ӭ"))
				break;
		}
		
		bufr.close();
		s.close();
		

	}

}

class UserThread implements Runnable
{
	private Socket s;
	UserThread(Socket s)
	{
		this.s = s;
	}
	public void run()
	{
		String ip = s.getInetAddress().getHostAddress();
		System.out.println(ip+"....connected");
		try
		{
			//����Ч��
			for(int x=0;x<3;x++)
			{
				//��ȡ��
				BufferedReader bufIn = new BufferedReader(new InputStreamReader(s.getInputStream()));
				//��ȡ�û���
				String name = bufIn.readLine();
				if(name==null)
					break;
				
				PrintWriter out = new PrintWriter(s.getOutputStream(),true);
				
				//��ȡ�û�����
				BufferedReader bufr = new BufferedReader(new FileReader("E:\\demo_student_work\\src\\h_netProgramming\\user.txt"));
				String line = null;
				//���
				boolean flag = false;
				while((line=bufr.readLine())!=null)
				{
					if(line.equals(name))
					{
						flag = true;
						break;
					}
				}
				if(flag)
				{
					System.out.println(name+",�ѵ�¼");
					out.println(name+"��ӭ����");
					break;
				}
				else
				{
					System.out.println(name+"���Ե�½");
					out.println(name+"���û���������");
				}
			}
			s.close();
			
		}
		catch(Exception e)
		{
			throw new RuntimeException(ip+"Ч��ʧ��");		
		}
	}
}

class LoginServer
{

	public static void main(String[] args) throws Exception
	{
		ServerSocket ss = new ServerSocket(10008);
		
		while(true)
		{
			Socket s = ss.accept();
			//�����߳�
			new Thread(new UserThread(s)).start();
		}

	}

}






