package a_object;
/*
final:���ա���Ϊһ�����η���
1���������Σ��࣬����������
2����final���ε��಻���Ա��̳С�Ϊ�˱��ⱻ�̳У������ิд���ܡ�
3����final���εķ��������Ա���д��
4����final���εı���ʱһ������ֻ�ܸ�ֵһ�Σ��ȿ������γ�Ա�������ֿ������ξֲ�������
	������������ʱ��һЩ���ݵĳ���ֵ�ǹ̶��ģ���ô��ʱΪ����ǿ�Ķ��ԣ�������Щֵ������֣��������Ķ���
	�����ֵ����Ҫ�ı䣬���Լ���final���Σ���Ϊ��������������д�淶������ĸ����д������ɶ��������ɣ�
	���ʼ�ͨ��_���ӡ�
5���ڲ��ඨ�������еľֲ�λ����ʱ��ֻ�ܷ��ʸþֲ���final���εľֲ�������

 */



class Demo
{
	final int x = 3;
	public static final double PI = 3.14;
	final void show1()
	{
		
	}
	void show2()
	{
		final int y = 4;
		System.out.println(3.14);
	}
}
class SubDemo extends Demo
{
	//void show1(){}
}
public class FinalDemo 
{

	public static void main(String[] args) 
	{
		

	}

}
