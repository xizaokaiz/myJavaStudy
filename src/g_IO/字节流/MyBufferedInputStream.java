package g_IO.�ֽ���;

import java.io.*;
/*
�Զ��帴��

˼�룺��������ץһ�����ݴ��뻺���������������������꣬��ץһ�����ݴ��뻺����������
1.�������顣
2.����ָ�롣
3.�����������
 */

/*
���ֵ����⣺
��Ϊ��ȡ���ļ��Ƕ����Ƶģ����ܴ���������8��1=-1��
��byte��������һ��Int���ͣ�Ҳ����-1��ԭ������Ϊ��8��1ǰ�油����1���µġ�
��ôֻҪ��ǰ�油0�������Ա���ԭ�ֽ����ݲ��䣬�ֿ��Ա���-1�ĳ��֡�
��������255�������㣺
 11111111 11111111 11111111 11111111
&00000000 00000000 00000000 11111111
------------------------------------
 00000000 00000000 00000000 11111111
 
��int�ͷ��أ�������-1�ķ�����
write������ǿת����ǰ���0�����������8λд�롣
 */
class MyBufferedInputStream
{
	private InputStream in;
	private byte[] buf = new byte[1024*4];
	private int pos = 0 ,count = 0;
	MyBufferedInputStream(InputStream in)
	{
		this.in = in;
	}
	//һ�ζ�һ���ֽڣ��ӻ�����(�ֽ�����)��ȡ��
	public int myRead()throws IOException
	{
		//ͨ��in�����ȡӲ�������ݣ����洢buf�С�
		if(count==0)
		{
			count = in.read(buf);
			if(count<0)
				return -1;
			pos = 0;
			byte b = buf[pos];
			count--;
			pos++;
			return b&255;
		}
		else if(count>0)
		{
			byte b = buf[pos];
			count--;
			pos++;
			return b&0xff;
		}
		return -1;
	}
	public void myClose()throws IOException
	{
		in.close();
	}
}