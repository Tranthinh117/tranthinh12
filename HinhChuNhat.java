package Tuan1;



public class HinhChuNhat {
	//khoi tao chieu dai
	public double chieuDai;
	public double chieuRong;
	// dong goi
	public void setChieuDai(double cd) throws Exception {
		if (cd>0) {
			this.chieuDai=cd;
			
			
		} else throw new Exception("chieu dai lon hon 0");
	}
	public double getChieuDai() {
		return this.chieuDai;
	}
	public void setChieuRong(double cr) throws Exception {
		if (cr>0) {
			this.chieuRong=cr;
			
			
		} else throw new Exception("chieu dai lon hon 0");
	}
	public double getChieuRong() {
		return this.chieuRong;
	}
	// tao constructor
	public HinhChuNhat(double cd, double cr) {
		this.chieuDai=cd;
		this.chieuRong=cr;
		
	}
	public HinhChuNhat() {
		
	}
	// tinhchuvi
	public double getChuVi() {
		return (getChieuDai()+getChieuRong())*2;
		
	}
	// tinh dientich
	public double getDienTich() {
		return getChieuDai()*getChieuRong();
	}
	
	
	

	

	

	public static void main(String[] args) throws Exception {
		HinhChuNhat h1= new HinhChuNhat();
	
		h1.setChieuDai(10);
		h1.setChieuRong(5);
	
		System.out.println("chieu dai ban da nhap"+h1.chieuDai);
		System.out.println("chieu rong ban da nhap"+h1.chieuRong);
		
	
		//chuvi
		System.out.println("Chu vi hinh chu nhat la"+h1.getChuVi());
	
		//dien tich
		System.out.println("Dien tich hinh chu nhat la"+h1.getDienTich());
		
		

	}

}
