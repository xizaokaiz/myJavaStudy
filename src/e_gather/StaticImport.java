package e_gather;

/*
StaticImport ��̬����

����������ʱ����Ҫָ������İ�����
����������ʱ����Ҫָ���߱������Ķ�������ࡣ
 */
import java.util.*;
import static java.util.Arrays.*;//�������Arrays������е����о�̬��Ա��

/*
packa/Demo.class
packb/Demo.class

import packa.*;
import packb.*;
new packa.Demo()
 */

import static java.lang.System.*;//������System�������о�̬��Ա��

public class StaticImport extends Object
{

	public static void main(String[] args) 
	{
		out.println("haha");
		int[] arr = {3,1,5};
		
		sort(arr);
		int index = binarySearch(arr,1);
		System.out.println(Arrays.toString(arr));
		System.out.println("index="+index);

	}

}
