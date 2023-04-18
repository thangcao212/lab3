

	
import java.util.Scanner;
public class Diem {
	public int x,y;
	
	public Diem(int x, int y) {
		
		this.x = x;
		this.y = y;
	}
	Diem()
	{
	Scanner s= new Scanner(System.in);
	System.out.println("Nhap toa do diem: ");
	x=s.nextInt();
	y=s.nextInt();
	}
	public void InDiem()
	{
	System.out.println("(" + this.x + ", " + this.y+")");
	}
	//public double tinhKC(Diem d) {
		//return Math.sqrt((x - d.x)*(x-d.x) +(y-d.y)*(y-d.y));
	//}
	public static void main(String[] args)
	{
	Diem A=new Diem();
	A.InDiem();
	}
	}


