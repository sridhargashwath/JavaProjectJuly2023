package day07;

public class Program02 {

	public static void main(String[] args) {
		
			  int a=100;
			  int b=20;
			  double c=10.2;
			  double d=20.3;
			  
			  System.out.println(a>b);
			  System.out.println(a<=c);
			  System.out.println(a==b);
			  System.out.println(a!=d);
			  
			  
			  System.out.println(a>b  && a>c);//true
			  System.out.println(b>a  && b>c);//false
			  
			  System.out.println(a>b  || a>c);//true
			  System.out.println(b>a  || b>c);//true
			  
			  System.out.println(!(a>b  && a>c));//false
			  System.out.println(!(b>a  && b>c));//true
			  
			  
			
		}

	}
