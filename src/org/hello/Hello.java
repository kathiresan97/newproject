package org.hello;

public class Hello {
	private void helloMethod() {
		// TODO Auto-generated method stub
System.out.println("hello");
	}
	public static void main(String[] args) {
		Hello h=new Hello();
		h.helloMethod();
		int a=10;
		int b=29;
		System.out.println(a+b);
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i==j) {
					System.out.print(" ");
				}else if (i>j) {
					System.out.print("*");
				}
				
			}
			System.out.println(" ");
		}
		
	}

}
