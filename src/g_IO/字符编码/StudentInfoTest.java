package g_IO.字符编码;
/*
 练习：
有五个学生，每个学生有3门课的成绩，
从键盘输入以上数据（包括姓名，三门课成绩），
输入的格式：如：zhangsan,30,40,60计算出总成绩。
并把学生的信息和计算出的总分数高低顺序存放在磁盘文件"stud.txt"中。

1，描述学生对象。
2，定义一个可以操作学生对象的工具类。

思想：
1，通过获取键盘录入一行数据，并将改行数据中的信息取出封装成学生对象。
2，因为学生对象有很多，那么久需要存储使用到集合。因为要对学生的总分排序，
	所以使用TreeSet。
3，将集合的信息写入到一个文件中。
 */
import java.io.*;
import java.util.*;

//学生类
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
	
	//复写compareTo方法
	public int compareTo(Student s)
	{
		//比较总分数大小
		int num = new Integer(this.sum).compareTo(new Integer(s.sum));
		
		//分数相同，再比较姓名
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
	
	//复写hashCode方法
	public int hashCode()
	{
		return name.hashCode()+sum*34;
	}
	
	public boolean equlas(Object obj)
	{
		if(!(obj instanceof Student))
			throw new ClassCastException("类型出错");
		
		Student s = (Student)obj;
		
		//比较：姓名与总分数相同时
		return this.name.equals(s.name) && this.sum==sum;		
	}
	
	//复写toString方法
	public String toString()
	{
		return "student:["+name+","+ma+","+cn+","+en+"]";	
				
	}
}

//工具类
class StudentInfoTool
{
	//不带比较器的方法
	public static Set<Student> getStudents()throws IOException
	{
		return getStudents(null);
	}
	
	//带比较器的方法
	//静态方法，返回一个set集合
	public static Set<Student> getStudents(Comparator<Student> cmp)throws IOException
	{
		//读取键盘录入
		BufferedReader bufr = 
				new BufferedReader(new InputStreamReader(System.in));
		//建立集合
		Set<Student> stus = null;
		//判断是否使用比较器
		if(cmp==null)
			stus = new TreeSet<Student>();
		else
			stus = new TreeSet<Student>(cmp);
		
		String line = null;
		while((line=bufr.readLine())!=null)
		{
			if("over".equals(line))
				break;
			//切分数据
			String[] info = line.split(",");
			
			//将数据封装成学生对象
			Student stu = new Student(info[0],Integer.parseInt(info[1]),
					Integer.parseInt(info[2]),Integer.parseInt(info[3]));
			//存入集合
			stus.add(stu);
		}
		bufr.close();
		
		return stus;
	}
	
	//写入
	public static void writeToFile(Set<Student> stus)throws IOException
	{
		//文件写入
		BufferedWriter bufr = 
				new BufferedWriter(new FileWriter("E:\\Test\\IO\\studentInfo.txt"));
		
		//遍历写入
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
		//反转比较器
		Comparator<Student> cmp = Collections.reverseOrder();
		
		Set<Student> stus = StudentInfoTool.getStudents(cmp);
		
		StudentInfoTool.writeToFile(stus);
		

	}

}















