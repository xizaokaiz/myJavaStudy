package g_IO.�ַ�����;
/*
 ��ϰ��
�����ѧ����ÿ��ѧ����3�ſεĳɼ���
�Ӽ��������������ݣ��������������ſγɼ�����
����ĸ�ʽ���磺zhangsan,30,40,60������ܳɼ���
����ѧ������Ϣ�ͼ�������ܷ����ߵ�˳�����ڴ����ļ�"stud.txt"�С�

1������ѧ������
2������һ�����Բ���ѧ������Ĺ����ࡣ

˼�룺
1��ͨ����ȡ����¼��һ�����ݣ��������������е���Ϣȡ����װ��ѧ������
2����Ϊѧ�������кܶ࣬��ô����Ҫ�洢ʹ�õ����ϡ���ΪҪ��ѧ�����ܷ�����
	����ʹ��TreeSet��
3�������ϵ���Ϣд�뵽һ���ļ��С�
 */
import java.io.*;
import java.util.*;

//ѧ����
class Student implements Comparable<Student>
{
	private String name;
	private int ma,cn,en;
	private int sum;
	public Student(String name,int ma,int cn,int en)
	{
		this.name = name;
		this.ma = ma;
		this.cn = cn;
		this.en = en;
		sum = ma + cn + en;
	}
	
	//��дcompareTo����
	public int compareTo(Student s)
	{
		//�Ƚ��ܷ�����С
		int num = new Integer(this.sum).compareTo(new Integer(s.sum));
		
		//������ͬ���ٱȽ�����
		if(num==0)
			return this.name.compareTo(s.name);
		
		return num;
	}
	
	public String getName()
	{
		return name;
	}
	public int getSum()
	{
		return sum;
	}
	
	//��дhashCode����
	public int hashCode()
	{
		return name.hashCode()+sum*34;
	}
	
	public boolean equlas(Object obj)
	{
		if(!(obj instanceof Student))
			throw new ClassCastException("���ͳ���");
		
		Student s = (Student)obj;
		
		//�Ƚϣ��������ܷ�����ͬʱ
		return this.name.equals(s.name) && this.sum==sum;		
	}
	
	//��дtoString����
	public String toString()
	{
		return "student:["+name+","+ma+","+cn+","+en+"]";	
				
	}
}

//������
class StudentInfoTool
{
	//�����Ƚ����ķ���
	public static Set<Student> getStudents()throws IOException
	{
		return getStudents(null);
	}
	
	//���Ƚ����ķ���
	//��̬����������һ��set����
	public static Set<Student> getStudents(Comparator<Student> cmp)throws IOException
	{
		//��ȡ����¼��
		BufferedReader bufr = 
				new BufferedReader(new InputStreamReader(System.in));
		//��������
		Set<Student> stus = null;
		//�ж��Ƿ�ʹ�ñȽ���
		if(cmp==null)
			stus = new TreeSet<Student>();
		else
			stus = new TreeSet<Student>(cmp);
		
		String line = null;
		while((line=bufr.readLine())!=null)
		{
			if("over".equals(line))
				break;
			//�з�����
			String[] info = line.split(",");
			
			//�����ݷ�װ��ѧ������
			Student stu = new Student(info[0],Integer.parseInt(info[1]),
					Integer.parseInt(info[2]),Integer.parseInt(info[3]));
			//���뼯��
			stus.add(stu);
		}
		bufr.close();
		
		return stus;
	}
	
	//д��
	public static void writeToFile(Set<Student> stus)throws IOException
	{
		//�ļ�д��
		BufferedWriter bufr = 
				new BufferedWriter(new FileWriter("E:\\Test\\IO\\studentInfo.txt"));
		
		//����д��
		for(Student stu :stus)
		{
			bufr.write(stu.toString()+"\t");
			bufr.write(stu.getSum()+"");
			bufr.newLine();
			bufr.flush();
		}
		bufr.close();
	}
	
	
	
}

public class StudentInfoTest 
{

	public static void main(String[] args) throws IOException
	{
		//��ת�Ƚ���
		Comparator<Student> cmp = Collections.reverseOrder();
		
		Set<Student> stus = StudentInfoTool.getStudents(cmp);
		
		StudentInfoTool.writeToFile(stus);
		

	}

}















