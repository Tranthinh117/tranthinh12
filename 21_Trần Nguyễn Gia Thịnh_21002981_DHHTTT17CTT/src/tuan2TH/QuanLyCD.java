package tuan2TH;


import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Calendar;

import java.util.Locale;



public class QuanLyCD {
	private String maCD;
	private String tuaCD;
	private Calendar ngayBH;
	private int soBH;
	private double dongia;
	public String getMaCD() {
		return maCD;
	}
	public void setMaCD(String ma) throws Exception {
		if (ma!="") {
			this.maCD = ma;
			
		} else throw new Exception ("loi ma");
}
	
	public String getTuaCD() {
		return tuaCD;
	}
	public void setTuaCD(String tua) throws Exception {
		if (tua!="") {
			this.tuaCD = tua;
			
		} else throw new Exception("loitua");
		
		}

		
	public Calendar getNgayBH() {
		return ngayBH;
	}
	public void setNgayBH(Calendar ngayBH)throws Exception {
		 if (ngayBH!=null) {
			 this.ngayBH =ngayBH;
		} else throw new Exception("loi ngay");
		
		}
	public int getSoBH() {
		return soBH;
	}
	public void setSoBH(int soBH) throws Exception{
		if (soBH>0) {
			this.soBH = soBH;
		} else throw new Exception("SoBH phai lon hon 0");
		
	}

	public double getDongia() {
		return dongia;
	}
	public void setDongia(double dongia) throws Exception {
		if (dongia>=0) {
			this.dongia = dongia;
		} else throw new Exception("loi don gia"); 

	}
	public QuanLyCD()
	{
		this.maCD="00000000";
		this.tuaCD="xxxxxxxx";
		this.ngayBH=null;
		this.dongia=1500;
		this.soBH=0;
	}
	public  QuanLyCD(String ma, String tua, Calendar ngayBH, double dongia, int soBH) throws Exception
	{
		if (ma!="") {
			this.maCD=ma;
		} else throw new Exception("loi ma");
		if (tua!="") {
			this.tuaCD=tua;
		} else throw new Exception("loi tua");
		if (ngayBH!=null) {
			this.ngayBH=ngayBH;
		} else throw new Exception("loi ngay");
		if (dongia>=0) {
			this.dongia=dongia;
		} else throw new Exception("loi so"); {
			if (soBH>=0) {
				this.soBH=soBH;
			} else throw new Exception("loi soBH");

			}		

		}
		
	
	
	public double gettinhtien()
	{
		return  getDongia()*getSoBH();
	
	}
	public void tieude() {
		System.out.println("kiem tra ket qua");
		for (int i=0;i<70;i++);
			System.out.printf("-");
		System.out.println();
		System.out.printf("|%-10s|%-10s|%-14s|%-10s|%-10s|%-12s|\n","maCD","tuaCD","ngay ban hanh","dongia","so bai hat","tong tien");
		for (int i=0;i<70;i++);
			System.out.printf("-");
		System.out.println();
		
	}
	Locale lc =new Locale("vi","vn");
	DateFormat df= DateFormat.getDateInstance(1, lc);
	NumberFormat sf = NumberFormat.getCurrencyInstance(lc);
	@SuppressWarnings("static-access")
	public String toString () {
	String s="";
	return s+=s.format("|%-10s|%-10s|%-14s|%-10s|%-10s|%-12s|",getMaCD(),getTuaCD(),df.format(getNgayBH().getTime()),sf.format(getDongia()),
			getSoBH(),sf.format(gettinhtien()));
	}
}
	
