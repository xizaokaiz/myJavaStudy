package a_object.extends_;
/*
�Ӹ�����ֺ����Ա���ص㣺

���еĳ�Ա��
1������
2������
3�����캯��

1������
��������г��ַ�˽�е�ͬ����Ա����ʱ��
����Ҫ���ʱ����еı�������this
����Ҫ���ʸ����е�ͬ����������super��

super��ʹ�ú�this��ʹ�ü���һ�¡�
this������Ǳ����������á�
super������Ǹ����������á�
 */

class Fu
{
	int num = 4;
}

class Zi extends Fu
{
	//int num = 5;
	void show()
	{
		System.out.println(this.num);
	}
}

public class ExtendsDemo2 {

	public static void main(String[] args) {
		Zi z = new Zi();
		z.show();
	}

}
