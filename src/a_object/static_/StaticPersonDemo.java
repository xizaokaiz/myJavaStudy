package a_object.static_;

class Person4
{
	private String name;
	private int age;
	private static String country = "cn";
	Person4(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	
	{
		System.out.println(name+".."+age);//��������
	}
	
	public void setName(String name)
	{
		this.name = name;//this:˭���ã��͸�˭��ֵ
	}
	
	public void speak()
	{
		System.out.println(this.name+"..."+this.name);
	}
	
	public static void showCountry()
	{
		System.out.println("country="+country);
		method();//ʡ������ Person.method()	
		
	}
	public static void method()
	{
		System.out.println("method run");
	}
	

}




public class StaticPersonDemo 
{

	public static void main(String[] args) 
	{
		Person4 p = new Person4("zhangsan",20);
		p.setName("lisi");
		p.speak();
		p.showCountry();
		
		/* Person4 p = new Person4("zhangsan",20);
		      �þ仰������ʲô���飿
		 * 1����ΪNew�õ� Person.class�����Ի����ҵ�Person.class�ļ������ص��ڴ��С�
		 * 2����ִ�и����е�static����飬����еĻ�����Person.class����г�ʼ��
		 * 3���ڶ��ڴ��п��ٿռ䣬�����ڴ��ַ��
		 * 4���ڶ��ڴ��н���������������ԣ�������Ĭ�ϳ�ʼ����
		 * 5�������Խ�����ʾ��ʼ����
		 * 6���Զ�����й��������ʼ����
		 * 7���Զ�����ж�Ӧ�Ĺ��캯����ʼ����
		 * 8�����ڴ��ַ����ջ�ڴ��е�P������
		 */
	}

}
