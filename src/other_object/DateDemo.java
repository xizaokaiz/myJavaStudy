package other_object;

import java.util.*;
import java.text.*;

 /*
 data��
  */
public class DateDemo 
{

	public static void main(String[] args) 
	{
		Date d = new Date();
		System.out.println(d);//��ӡ��ʱ�俴������ϣ����Щ��ʽ��
		
		//��ģʽ��װ��SimpleDateformat�����С�
		SimpleDateFormat sdf = new SimpleDateFormat("y��M��d�� E h:m:s");
		//����format������ģʽ��ʽ��ָ��Date����
		String time = sdf.format(d);
		
		System.out.println("time="+time);
		

	}

}
