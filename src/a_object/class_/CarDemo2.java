package a_object.class_;

public class CarDemo2 {

	public static void main(String[] args) {

		//��������
		/*
		new Car().num = 5;
		new Car().color = "blue";
		new Car().run();
		
		Car c = new Car();
		c.run();
		c.num = 4;
		new Car().run();
		*/
		
		//��������ʹ�÷�ʽһ�����Զ���ķ���ֻ����һ��ʱ��������������������ɣ�����д�Ƚϼ򻯡�
		//�����һ��������ж����Ա���ã�������������������֡�
		//��������ʹ�÷�ʽ�������Խ�����������Ϊʵ�ʲ������д��ݡ�
		Car c = new Car();
		show(c);
	//	show(new Car());

	}
	//�����������䳧�����������и�װ�������ĳ����ĳɺڳ���������̥
	public static void show(Car c)
	{
		c.num = 3;
		c.color = "black";
		c.run();
	}

}
