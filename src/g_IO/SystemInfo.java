package g_IO;
/*
系统信息
 */
import java.util.*;
import java.io.*;

public class SystemInfo {

	public static void main(String[] args) throws IOException
	{
		//创建一个对象获取当前虚拟机信息
		Properties prop =  System.getProperties();
		//将虚拟机信息导入到文本文件中
		prop.list(new PrintStream("E:\\Test\\IO\\sysinfo.txt"));
		

	}

}
