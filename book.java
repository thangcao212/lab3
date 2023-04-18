

	import java.util.Scanner;
	public class book {
	private String ma, ten, tg, loai, nxb;
	private int sotrang, tap, gia;
	
	public book(String ma, String ten, String tg, String loai, String nxb, int sotrang, int tap, int gia) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.tg = tg;
		this.loai = loai;
		this.nxb = nxb;
		this.sotrang = sotrang;
		this.tap = tap;
		this.gia = gia;
	}
	
	public void INSACH()
	{
	System.out.println("Ten sach: " + this.ten + "; Ma sach: " + this.ma+ "; Tac gia: " + this.tg+ "; Loai sach: " + this.loai + "; NXB: " + this.nxb + ";so trang : " +this.sotrang + "; so tap : "+ this.tap + ";gia tien : " + this.gia);
   }
	public static void main(String[] args)
	{
	String ma, ten, tg, loai, nxb;
	int sotrang,tap,gia;
	Scanner s= new Scanner(System.in);
	System.out.println("Nhap Ma sach, ten sach, tac gia, loai sach, NXB,so trang ,so tap ,gia tien : ");
	ma = s.nextLine(); 
	ten = s.nextLine(); 
	tg = s.nextLine(); 
	loai = s.nextLine(); 
	nxb = s.nextLine(); 
	sotrang=s.nextInt();
	tap=s.nextInt();
	gia=s.nextInt();
	
	book sach=new book(ma, ten, tg, loai, nxb, sotrang, tap, gia);
	sach.INSACH();
	}
	}


