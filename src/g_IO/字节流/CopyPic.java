package g_IO.字节流;

/*
复制一个图片。
思路：
1.用字节读取流对象和图片关联。
2.用字节写入流对象创建一个图片文件，用于存储获取到的图片数据。
3.通过循环读写，完成数据的存储。
4.关闭资源。
 */
import java.io.*;
public class CopyPic 
{

	public static void main(String[] args) 
	{
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try
		{	//建立关联
			fis = new FileInputStream("D:\\5.png");
			fos = new FileOutputStream("D:\\6.png");
			//定义缓冲区
			byte[] buf = new byte[1024];
			int len = 0;
			//缓冲区读出
			while((len=fis.read(buf))!=-1)
			{
				//写入
				fos.write(buf,0,len);
			}
			
		}
		catch(IOException e)
		{
			throw new RuntimeException("复制文件失败");
		}
		finally
		{
			try
			{
				if(fis!=null)
					fis.close();
			}
			catch(IOException e)
			{
				throw new RuntimeException("读取文件失败");
			}
			try
			{
				if(fos!=null)
					fos.close();
			}
			catch(IOException e)
			{
				throw new RuntimeException("写入文件失败");
			}
			
		}
		

	}

}
