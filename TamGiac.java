

import java.util.Objects;
import java.util.Scanner;
public class TamGiac {
	private Diem A,B,C;
	
	
	
	TamGiac()
	{
	A= new Diem();
	B= new Diem();
	C= new Diem();
	}
	public void InTamGiac()
	{
	System.out.println("Toa do 3 dinh cua tam gia la: ");
	System.out.print("A"); A.InDiem(); 
	System.out.print("B"); B.InDiem();
	System.out.print("C"); C.InDiem();
	}
	
	
	public void kiemtra() {
	double AB,AC,BC;
		AB = Math.sqrt(Math.pow((this.B.x - this.A.x), 2) + Math.pow((this.B.y - this.A.y), 2));
		AC = Math.sqrt(Math.pow((this.C.x - this.A.x), 2) + Math.pow((this.C.y - this.A.y), 2));
		BC = Math.sqrt(Math.pow((this.C.x - this.B.x), 2) + Math.pow((this.C.y - this.B.y), 2));
		System.out.println("AB = " +AB + ";AC = " + AC + ";BC  = " + BC);
		
		if((AB+AC)>BC && (AB+BC)>AC && (AB+BC)>AC && AB > 0 && AC >0 && BC >0) {
			System.out.println("3 diem la 3 dinh cua tam giac ");
		}else {
			System.out.println("khong phai 3 dinh cua tam giac");
		}
	}
	
	public double tinhchuvi() {
		double AB,AC,BC;
		AB = Math.sqrt(Math.pow((this.B.x - this.A.x), 2) + Math.pow((this.B.y - this.A.y), 2));
		AC = Math.sqrt(Math.pow((this.C.x - this.A.x), 2) + Math.pow((this.C.y - this.A.y), 2));
		BC = Math.sqrt(Math.pow((this.C.x - this.B.x), 2) + Math.pow((this.C.y - this.B.y), 2));
		return AB+BC+AC;
	}
	public double tinhdientich() {
		double AB,AC,BC;
		AB = Math.sqrt(Math.pow((this.B.x - this.A.x), 2) + Math.pow((this.B.y - this.A.y), 2));
		AC = Math.sqrt(Math.pow((this.C.x - this.A.x), 2) + Math.pow((this.C.y - this.A.y), 2));
		BC = Math.sqrt(Math.pow((this.C.x - this.B.x), 2) + Math.pow((this.C.y - this.B.y), 2));
		double p=(AB+BC+AC)/2;
		return Math.sqrt(p*(p-AB)*(p-AC) *(p-BC));
	}
	
	public static void main(String[] args)
	{
	System.out.println("Nhap 3 dinh cua tam giac: ");
	TamGiac T=new TamGiac();
	T.InTamGiac();
	T.kiemtra();
	System.out.println("chu vi = " +T.tinhchuvi());
	System.out.println( "dien tich = " +T.tinhdientich());
	}
	
	
}


