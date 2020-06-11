package a_object.class_;

public class PersonDemo {

	public static void main(String[] args) 
	{
	
		Person p = new Person();
		//p.age = -20;
		p.setAge(20);
		p.speak();
		

	}
}
	/*
	 * private:˽�У�Ȩ�����η��������������еĳ�Ա����Ա��������Ա��������
	 * ˽��ֻ�ڱ�������Ч��
	 * ��age˽�л��Ժ������⼴ʹ�����˶���Ҳ����ֱ�ӷ��ʡ�
	 * ������Ӧ�������䣬����Ҫ��Person���ṩ��Ӧ����age����ʽ��
	 * 
	 * ע�⣺˽�н����Ƿ�װ��һ�ֱ�����ʽ��
	 * 
	 * ֮���Զ����ṩ���ʷ�ʽ��������Ϊ�����ڷ��ʷ�ʽ�м����߼��жϵ���䡣
	 * �Է��ʵ����ݽ��в�������ߴ��뽡׳�ԡ�
	 */
	class Person
	{
		private int age;
		
		public void setAge(int a)
		{	
			if(a>0 && a<130)
			{
				age = a;
				speak();
			}
			else
				System.out.println("feifa age");
		}
		public int getAge()
		{
			return age;
		}
		
		void speak()
		{
			System.out.println("age="+age);
		}
	}
	


