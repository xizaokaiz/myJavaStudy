package g_IO;
/*
ϵͳ��Ϣ
 */
import java.util.*;
import java.io.*;

public class SystemInfo {

	public static void main(String[] args) throws IOException
	{
		//����һ�������ȡ��ǰ�������Ϣ
		Properties prop =  System.getProperties();
		//���������Ϣ���뵽�ı��ļ���
		prop.list(new PrintStream("E:\\Test\\IO\\sysinfo.txt"));
		

	}

}
