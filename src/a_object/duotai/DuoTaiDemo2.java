package a_object.duotai;

public class DuoTaiDemo2 
{

	public static void main(String[] args) 
	{
		//Animal a = new Cat();//��������������ת�͡�
		//a.eat();
		
		//�����Ҫ����è�����з�������β�����
		//ǿ�ƽ���������ã�ת����������ͣ�����ת�͡�
		//Cat c = (Cat)a;
		//c.catchMouse();
		
		//ǧ��Ҫ���������Ĳ��������������ת����������
		//������ת�����Ǹ���Ӧ��ָ�����Լ����������ʱ����Ӧ�ÿ��Ա�������Ҳ���Ա�ת����
		//��̬��ʼ���ն���������������ű仯��
//		Animal a = new Animal();
//		Cat c = (Cat)a;
		

		function(new Dog());
		function(new Cat());
		function(new Pig());
		
		
	}
	public static void function(Animal a)
	{
		a.eat();
		if(a instanceof Cat)
		{
			Cat c = (Cat)a;
			c.catchMouse();
		}
		else if(a instanceof Dog)
		{
			Dog c = (Dog)a;
			c.kanJia();
		}
		else if(a instanceof Pig)
		{
			Pig p = (Pig)a;
			p.gongDi();
		}
		
		
	}
}
