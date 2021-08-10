package BaiThi;

public class MainProduct {
	public static void main(String[] args) {
		Product p[] = new Product[5];
		
		System.out.println("Nhập thông tin các sản phẩm");
		for (int i = 0; i < p.length; i++) {
			p[i] = new Product();
			p[i].add();
		}
		System.out.println("===========================");
		System.out.println("Danh sách các sản phẩm");
		for (int i = 0; i < p.length; i++) {
			p[i].print();
			p[i].getRealPrice();
		}
		
		//sắp xếp
		for (int i = 0; i < p.length-1; i++) {
			for (int j = i+1; j < p.length; j++) {
				if(p[i].getFinal() > p[j].getFinal()) {
					Product temp = p[i];
					p[i] = p[j];
					p[j] = temp;
				}
			}
		}
		System.out.println("===========================");
		System.out.println("Danh sách sau khi sắp xếp giá thực tăng dần");
		// in kết quả sau khi sắp xếp
		for (int i = 0; i < p.length; i++) {
			p[i].print();
			p[i].getRealPrice();
		}
	}
}
