package a_object;

/*
public static void main(String[] args)

����������һ������ĺ�������Ϊ�������ڣ����Ա�jvm���á�

�������Ķ��壺
public:�����Ÿú�������Ȩ��ʱ���ġ�
static������������������ļ��ؾ��Ѿ������ˡ�
void:������û�о���ķ���ֵ��
main:���ǹؼ��֣�������һ������ĵ��ʣ����Ա�jvmʶ��
(String[] arr):�����Ĳ���������������һ����ť���������е�Ԫ�����ַ������ַ������͵����顣

�������ǹ̶���ʽ�ģ�jvmʶ��

jvm�ڵ��ú���ʱ���������new String[0];

 */

public class MainDemo 
{

	public static void main(String[] args) //new String[]
	{
		String[] arr = {"hah","hehe","heihei","xixi","hiahia"};
		MainTest.mian(arr);
		

	}

}

class MainTest
{
	public static void mian(String[] args)
	{
		for(int x=0;x<args.length;x++)
			System.out.println(args[x]);
		
	}
}
