import  java.lang.Math;
public class RollDoubles{
	public static void main (String args[]){
		int  f1=0;
		int  f2=0;
		int   f3=0;
		int  f4=0;
		int  f5=0;
		int  f6=0;
		int  d1,d2;
		for(int roll=1;roll<=10000;roll++){
			d1=(int)(Math.random()*6)+1;
			d2=(int)(Math.random()*6)+1;
			if(d1==d2){
				switch(d1){
					case  1:  f1++;
					                 break;
					case  2:  f2++;
					                 break;
					case  3:  f3++;
					                 break;
					case  4:  f4++;
					                 break;
					case  5:  f5++;
					                 break;
					case  6:  f6++;
					                 break;
				}
			}
		}
		System.out.println("Doubles\tFrequency");
		System.out.printf("1\t%d\n2\t%d\n3\t%d\n4\t%d\n5\t%d\n6\t%d\n",f1,f2,f3,f4,f5,f6);
	}
}
