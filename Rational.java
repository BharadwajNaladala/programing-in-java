import   java.util.*;
public  class   Rational{
	private  int  numerator;
	private  int  denominator;
	public  Rational(int  numerator,  int  denominator){
		if(denominator==0){
			throw  new  RuntimeException("Denominator  is  Zero");
		}
		int  g=gcd(numerator,  denominator);
		if(g==1){
			System.out.println("No  Common  Division  for  Numerator  and  Denominator");
			this.numerator=numerator;
			this.denominator=denominator;
		}
		else{
			this.numerator=numerator/g;
			this.denominator=denominator/g;
		}
	}
	public  String   toString(){
		return  "("+numerator+"/"+denominator+")" ;
	}
	private  static  int  gcd(int  m,  int  n){
		if(0==n){
			return  m;
		}
		else{
			return  gcd(n, m%n);
		}
	}
	public  static   void  main(String  args[]){
		Scanner  sc=new  Scanner(System.in);
		System.out.println("Enter  Numerator  :  ");
		int  numerator=sc.nextInt();
		System.out.println("Enter  Denominator");
		int   denominator=sc.nextInt();
		Rational  rational=new  Rational(numerator,  denominator);
		System.out.println("Efficient   Representation  for  the  rational  number : "+rational);
	}
}
