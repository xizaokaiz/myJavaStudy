package g_IO.pipedStream;
/*
管道流
 */
import java.io.*;

//创建读取线程
class Read implements Runnable
{
	//读取管道流
	private PipedInputStream in;
	Read(PipedInputStream in)
	{
		this.in = in;
	}
	//复写run方法
	public void run()
	{
		try
		{
			//建立一个字节数组存数据
			byte[] buf = new byte[1024];
			
			System.out.println("读取前，没有数据就阻塞");
			
			//数据读入
			int len = in.read(buf);
			
			System.out.println("读到数据，阻塞结束");
			
			//将字节数组转成字符串。
			String s = new String(buf,0,len);
			
			System.out.println(s);
			
			in.close();
		}
		catch(IOException e)
		{
			throw new RuntimeException("管道读取流失败");
		}
	}
}

//创建输出线程
class Write implements Runnable
{
	//输出管道流
	private PipedOutputStream out;
	Write(PipedOutputStream out)
	{
		this.out = out;
	}
	public void run()
	{
		try
		{
			//线程停止6秒后写入
			System.out.println("开始写入数据，等待6秒后");
			Thread.sleep(6000);
			//将要输出的内容转成字节并写入管道
			out.write("peped is coming".getBytes());
			out.close();
		}
		catch(Exception e)
		{
			throw new RuntimeException("管道输出流失败");
		}
	}
}
public class PipedStreamDemo
{

	public static void main(String[] args) throws IOException
	{
		PipedInputStream in = new PipedInputStream();
		PipedOutputStream out = new PipedOutputStream();
		//将管道输入流和输出流连接起来
		in.connect(out);
		
		//建立管道
		Read r = new Read(in);
		Write w = new Write(out);
		//建立线程
		new Thread(r).start();
		new Thread(w).start();
		
	}

}




