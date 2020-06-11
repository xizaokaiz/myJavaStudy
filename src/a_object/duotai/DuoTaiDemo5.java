package a_object.duotai;

/*
需求：
电脑运行实例，
电脑运行基于主板。
 */
/*
class MainBoard
{
	public void run()
	{
		System.out.println("mainboard run");
	}
	public void useNetCard(NetCard c)
	{
		c.open();
		c.close();
	}
}
class NetCard
{
	public void open()
	{
		System.out.println("netcard open");
	}
	public void close()
	{
		System.out.println("netcard close");
	}
}
*/

//卡槽
interface PCI 
{
	public void open();
	public void close();
}

//主板
class MainBoard 
{
	public void run()
	{
		System.out.println("MainBoard run");
	}
	public void usePCI(PCI p)//PCI P = new NetCard();//接口型引用指向自己的子类对象。
	{
		if(p!=null)
		{
			p.open();
			p.close();
		}
	}
}

//网卡
class NetCard implements PCI 
{
	public void open()
	{
		System.out.println("netcard open");
	}
	public void close()
	{
		System.out.println("netcard close");
	}
}

//声卡
class SoundCard implements PCI 
{
	public void open()
	{
		System.out.println("SoundCard open");
	}
	public void close()
	{
		System.out.println("SoundCard close");
	}
}


public class DuoTaiDemo5 
{

	public static void main(String[] args) 
	{		
		MainBoard mb = new MainBoard();
		mb.run();
		mb.usePCI(null);
		mb.usePCI(new NetCard());
		mb.usePCI(new SoundCard());
		
//		mb.run();
//		mb.useNetCard(new NetCard());
	}

}
