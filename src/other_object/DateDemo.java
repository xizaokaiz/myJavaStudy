package other_object;

import java.util.*;
import java.text.*;

 /*
 data类
  */
public class DateDemo 
{

	public static void main(String[] args) 
	{
		Date d = new Date();
		System.out.println(d);//打印的时间看不懂，希望有些格式。
		
		//将模式封装到SimpleDateformat对象中。
		SimpleDateFormat sdf = new SimpleDateFormat("y年M月d日 E h:m:s");
		//调用format方法让模式格式化指定Date对象。
		String time = sdf.format(d);
		
		System.out.println("time="+time);
		

	}

}
