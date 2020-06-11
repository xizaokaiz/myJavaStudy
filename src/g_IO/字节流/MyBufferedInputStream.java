package g_IO.字节流;

import java.io.*;
/*
自定义复制

思想：从数组中抓一批数据存入缓冲区读出，当缓冲区读完，再抓一批数据存入缓冲区读出。
1.定义数组。
2.定义指针。
3.定义计数器。
 */

/*
出现的问题：
因为读取的文件是二进制的，可能存在连续的8个1=-1，
将byte型提升了一个Int类型，也还是-1，原因是因为在8个1前面补的是1导致的。
那么只要在前面补0，即可以保留原字节数据不变，又可以避免-1的出现。
即将它与255做与运算：
 11111111 11111111 11111111 11111111
&00000000 00000000 00000000 11111111
------------------------------------
 00000000 00000000 00000000 11111111
 
用int型返回：避免了-1的发生。
write方法：强转，将前面的0砍掉，将最低8位写入。
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
	//一次读一个字节，从缓冲区(字节数组)获取。
	public int myRead()throws IOException
	{
		//通过in对象读取硬盘上数据，并存储buf中。
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