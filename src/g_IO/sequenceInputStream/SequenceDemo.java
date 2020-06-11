package g_IO.sequenceInputStream;
/*
��������
�ϲ������
 */
import java.util.*;
import java.io.*;
public class SequenceDemo {

	public static void main(String[] args)throws IOException {
		//���ϣ�����-->ָ���ļ���
		Vector<FileInputStream> v = new Vector<FileInputStream>();
		//��Ӷ���-->�ļ���
		v.add(new FileInputStream("E:\\Test\\IO\\1.txt"));
		v.add(new FileInputStream("E:\\Test\\IO\\2.txt"));
		v.add(new FileInputStream("E:\\Test\\IO\\3.txt"));
		//�������е�Ԫ��װ��
		Enumeration<FileInputStream> en = v.elements();
		//�ϲ�������
		SequenceInputStream sis = new SequenceInputStream(en);
		//Ŀ��
		FileOutputStream fos = new FileOutputStream("E:\\Test\\IO\\4.txt");
		
		byte[] buf = new byte[1024];
		
		int len = 0;
		while((len=sis.read(buf))!=-1)
		{
			//��0���ֽڿ�ʼ��lenд�뵽buf������fos��
			fos.write(buf,0,len);
		}
		
		fos.close();
		sis.close();
		
		
		
		

	}

}
