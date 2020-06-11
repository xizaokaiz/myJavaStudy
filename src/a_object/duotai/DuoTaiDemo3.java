package a_object.duotai;

/*
������ѧ����
	ѧϰ��˯����
�߼���ѧ����
	ѧϰ��˯����
	
���Խ�������������г�ȡ��
 */

abstract class Student
{
	public abstract void study();
	public void sleep()
	{
		System.out.println("����˯");
	}
}

class DoStudent
{
	public void doSome(Student stu)
	{
		stu.study();
		stu.sleep();
	}
}

class BaseStudent extends Student
{
	public void study()
	{
		System.out.println("base study");
	}
	public void sleep()
	{
		System.out.println("����˯");
	}
}

class AdvStudent extends Student
{
	public void study()
	{
		System.out.println("adv study");
	}
}




public class DuoTaiDemo3 
{

	public static void main(String[] args) 
	{
		DoStudent ds = new DoStudent();
		ds.doSome(new BaseStudent());
		ds.doSome(new AdvStudent());
		
	}
	

}
