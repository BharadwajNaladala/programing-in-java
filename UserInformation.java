import  java.io.*;
import  java.util.*;
import  java.util.regex.*;
class  Info{
	private  String  user_name;
	private  String  mob_no;
	private  String  mail_id;
	public  Info(){
	}
	public  Info(String  user_name,  String  mob_no,  String   mail_id){
		this.user_name=user_name;
		this.mob_no=mob_no;
		this.mail_id=mail_id;
	}
	public   void  isvalidusername(){
		String  regex="[a-zA-Z]+";
		if(user_name.matches(regex)){
			System.out.println("valid  user  name");
		}
		else{
			System.out.println("invalid  user  name");
		}
	}
	public   void  isvalidnumber(){
		if(mob_no.matches("[789]{1}[0-9]{9}")){
			System.out.println("valid  mobile  number");
		}
		else{
			System.out.println("invalid  mobile  number");
		}
	}
	public   void  isvalidmailid(){
		String  regex="^[a-zA-Z0-9+_ . -]+@[a-zA-Z0-9.-]+$";
		boolean  result=mail_id.matches(regex);
		if(result){
			System.out.println("valid  gmail  id");
		}
		else{
			System.out.println("invalid  gmail  id");
		}
	}
}
public  class  UserInformation{
	public  static  void  main(String  args[]){
		Scanner  sc=new  Scanner(System.in);
		System.out.println("Enter  user  name : ");
		String  Username=sc.next();
		System.out.println("Enter  mobile  no : ");
		String  Mobno=sc.next();
		System.out.println("Enter   mail  id : ");
		String  Mailid=sc.next();
		Info  ob=new  Info(Username,Mobno,Mailid);
		ob.isvalidusername();
		ob.isvalidnumber();
		ob.isvalidmailid();
	}
}
