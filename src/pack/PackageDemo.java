package pack;

/*
�ܽ᣺
	�����֮����з��ʣ������ʵİ��е����Լ����еĳ�Ա����Ҫpublic���Ρ�
	
	��ͬ���е��������ֱ�ӷ��ʸ����б�protectedȨ�����εĳ�Ա��
	
�����֮�����ʹ�õ�Ȩ��ֻ�����֣�public protected

			public protected default private
ͬһ������	  OK      OK        OK     OK
ͬһ������	  OK      OK        OK     
����			  OK      OK             
��ͬ����		  OK      
 */
/*
Ϊ�˼���������д��ʹ��һ���ؼ��֣�import
import ������ǰ��е���
���飬����дͨ��� * ����Ҫ�õ����е��ĸ��࣬�͵����ĸ��ࡣctrl+shift+o

���鶨�������Ҫ�ظ�������ʹ��url����ɶ��壬url��Ψһ�ġ�
Ps:www.itcast.cn
	package cn.itcast.demo
	package cn.itcast.test

 */
import packa.DemoA;
import packa.DemoB;
public class PackageDemo
{

	public static void main(String[] args) 
	{
		DemoA A = new DemoA();
		A.getA();
		DemoB B = new DemoB();
		B.show();
		

	}

}
