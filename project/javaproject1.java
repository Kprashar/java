import java.util.*;
import java.io.*;
interface Insurance 
{
	void CIP();
	void HIP();
	void LIP();
	}
class Option implements Insurance{
	public void CIP(){
		class CPI{
			
			void option2_1(){
				try{
System.out.println("=======================================================================================================================================");
				System.out.println("\n\n");				
				File obj2_1= new File("f1.txt");
				obj2_1.createNewFile();
				Scanner sc =new Scanner(obj2_1);
				while(sc.hasNext()){
					String s=sc.nextLine();
					System.out.println(s);
				}
				}
				catch(IOException e){
					e.printStackTrace();
					}
System.out.println("=======================================================================================================================================");
		System.out.println("\n\n");
			char j;
			System.out.println("Do You like This Info(y/n)");
			Scanner sk=new Scanner(System.in);
			j=sk.next().charAt(0);
			if (j=='y'){
			System.out.println("I am glad about this"); }
			else{System.out.println("I will try hard next time");}
			}
			
			void option2_2(){
				try{
System.out.println("=======================================================================================================================================");
System.out.println("\n\n");
				File obj2_2= new File("f2.txt");
				obj2_2.createNewFile();
				Scanner sc =new Scanner(obj2_2);
				while(sc.hasNext()){
					String s=sc.nextLine();
					System.out.println(s);
				}
				}
				catch(IOException e){
					e.printStackTrace();
					}
System.out.println("=======================================================================================================================================");
	System.out.println("\n\n");
			char j;
			System.out.println("Do You like This Info(y/n)");
			Scanner sk=new Scanner(System.in);
			j=sk.next().charAt(0);
			if (j=='y'){
			System.out.println("I am glad about this"); }
			else{System.out.println("I will try hard next time");}
		}
			void option2_3(){
				try{
				System.out.println("=======================================================================================================================================");
System.out.println("\n\n");
				File obj2_3= new File("f3.txt");
				obj2_3.createNewFile();
				Scanner sc =new Scanner(obj2_3);
				while(sc.hasNext()){
					String s=sc.nextLine();
					System.out.println(s);
				}
				}
				catch(IOException e){
					e.printStackTrace();
					}
System.out.println("=======================================================================================================================================");
System.out.println("\n\n");
			char j;
			System.out.println("Do You like This Info(y/n)");
			Scanner sk=new Scanner(System.in);
			j=sk.next().charAt(0);
			if (j=='y'){
			System.out.println("I am glad about this"); }
			else{System.out.println("I will try hard next time");}
}

		}
		CPI c=new CPI();
		Scanner sc=new Scanner(System.in);
		boolean n=true;
		int m;
		
		try {while(n==true){
System.out.println("=======================================================================================================================================");
System.out.println("\n\n");
			System.out.println("\n\n");			
			System.out.println("Press 1 to view info about Auto Liability Insurance");
			System.out.println("Press 2 to veiw info about Uninsured Motorist Coverage");
			System.out.println("Press 3 to veiw info about Comprehensive Insurance");
			System.out.println("Press 4 for Back");
			System.out.println("\n\n");
System.out.println("=======================================================================================================================================");
System.out.println("\n\n");
			m=sc.nextInt();
			System.out.println("\n\n");			
			switch(m){
				case 1:
					c.option2_1();
				break;
				case 2:
					c.option2_2();
				break;	
				case 3:
					c.option2_3();
				break;
				case 4:
					n=false;
				break;
				default:
					System.out.println("invaid values");
			}
		}}
		catch(Exception e){
			System.out.println(e);}
	}
	public void HIP(){
		class HPI{
			
			void option3_1(){
				try{
System.out.println("=======================================================================================================================================");
System.out.println("\n\n");
				File obj3_1= new File("f4.txt");
				obj3_1.createNewFile();
				Scanner sc =new Scanner(obj3_1);
				while(sc.hasNext()){
					String s=sc.nextLine();
					System.out.println(s);
				}}
				catch(IOException e){
					e.printStackTrace();
					}
System.out.println("=======================================================================================================================================");
System.out.println("\n\n");
			char j;
			System.out.println("Do You like This Info(y/n)");
			Scanner sk=new Scanner(System.in);
			j=sk.next().charAt(0);
			if (j=='y'){
			System.out.println("I am glad about this"); }
			else{System.out.println("I will try hard next time");}
}
			void option3_2(){
				try{	
System.out.println("=======================================================================================================================================");
System.out.println("\n\n");			
				File obj3_2= new File("f5.txt");
				obj3_2.createNewFile();
				Scanner sc =new Scanner(obj3_2);
				while(sc.hasNext()){
					String s=sc.nextLine();
					System.out.println(s);
				}}
				catch(IOException e){
					e.printStackTrace();
					}
System.out.println("=======================================================================================================================================");
System.out.println("\n\n");
			char j;
			System.out.println("Do You like This Info(y/n)");
			Scanner sk=new Scanner(System.in);
			j=sk.next().charAt(0);
			if (j=='y'){
			System.out.println("I am glad about this"); }
			else{System.out.println("I will try hard next time");}
}
			void option3_3(){
				try{
System.out.println("=======================================================================================================================================");
System.out.println("\n\n");
				File obj3_3= new File("f6.txt");
				obj3_3.createNewFile();
				Scanner sc =new Scanner(obj3_3);
				while(sc.hasNext()){
					String s=sc.nextLine();
					System.out.println(s);
				}
				}
				catch(IOException e){
					e.printStackTrace();
					}
System.out.println("=======================================================================================================================================");
System.out.println("\n\n");
			char j;
			System.out.println("Do You like This Info(y/n)");
			Scanner sk=new Scanner(System.in);
			j=sk.next().charAt(0);
			if (j=='y'){
			System.out.println("I am glad about this"); }
			else{System.out.println("I will try hard next time");}
}
			
			
		}
		HPI h=new HPI();
		Scanner sc=new Scanner(System.in);
		boolean n=true;
		int m;

		try{while(n==true){
System.out.println("=======================================================================================================================================");
System.out.println("\n\n");
			System.out.println("Press 1 to view info about Super Top-Up Policy");
			System.out.println("Press 2 to view info about Group Health Insurance Plan");
			System.out.println("Press 3 to view info about Senior Citizen Health Insurance");
			System.out.println("Press 4 for Back");
System.out.println("=======================================================================================================================================");
System.out.println("\n\n");
			m=sc.nextInt();
			switch(m){
				case 1:
					h.option3_1();
				break;
				case 2:
					h.option3_2();
				break;	
				case 3:
					h.option3_3();
				break;
				case 4:
					n=false;
				break;
				default:
					System.out.println("invaid values");
			}}
		}catch(Exception e){
			System.out.println(e);}
	}
	public void LIP(){
		class LPI{
			void option4_1(){
				try{
System.out.println("=======================================================================================================================================");
System.out.println("\n\n");
				File obj4_1= new File("f7.txt");
				obj4_1.createNewFile();
				Scanner sc =new Scanner(obj4_1);
				while(sc.hasNext()){
					String s=sc.nextLine();
					System.out.println(s);
				}
				}
				catch(IOException e){
					e.printStackTrace();
					}
System.out.println("=======================================================================================================================================");	
System.out.println("\n\n");		
			char j;
			System.out.println("Do You like This Info(y/n)");
			Scanner sk=new Scanner(System.in);
			j=sk.next().charAt(0);
			if (j=='y'){
			System.out.println("I am glad about this"); }
			else{System.out.println("I will try hard next time");}
}
			void option4_2(){
				try{
System.out.println("=======================================================================================================================================");
System.out.println("\n\n");
				File obj4_2= new File("f8.txt");
				obj4_2.createNewFile();
				Scanner sc =new Scanner(obj4_2);
				while(sc.hasNext()){
					String s=sc.nextLine();
					System.out.println(s);
				}
}
				catch(IOException e){
					e.printStackTrace();
					}
System.out.println("=======================================================================================================================================");
System.out.println("\n\n");
			char j;
			System.out.println("Do You like This Info(y/n)");
			Scanner sk=new Scanner(System.in);
			j=sk.next().charAt(0);
			if (j=='y'){
			System.out.println("I am glad about this"); }
			else{System.out.println("I will try hard next time");}
}
			void option4_3(){
				try{
System.out.println("=======================================================================================================================================");
System.out.println("\n\n");
				File obj4_3= new File("f9.txt");
				obj4_3.createNewFile();
				Scanner sc =new Scanner(obj4_3);
				while(sc.hasNext()){
					String s=sc.nextLine();
					System.out.println(s);
				}
				}
				catch(IOException e){
					e.printStackTrace();
					}
System.out.println("=======================================================================================================================================");
System.out.println("\n\n");		
char j;
			System.out.println("Do You like This Info(y/n)");
			Scanner sk=new Scanner(System.in);
			j=sk.next().charAt(0);
			if (j=='y'){
			System.out.println("I am glad about this"); }
			else{System.out.println("I will try hard next time");}
	}
		}
		LPI l=new LPI();
		Scanner sc=new Scanner(System.in);
		boolean n=true;
		int m;

	try{	while(n==true){
System.out.println("=======================================================================================================================================");
System.out.println("\n\n");
			System.out.println("Press 1 to view info about Term Insurance");
			System.out.println("Press 2 to  view info about Money back policies");
			System.out.println("Press 3 to  view info about Whole Life Insurance");
			System.out.println("Press 4 for Back");
System.out.println("=======================================================================================================================================");
	System.out.println("\n\n");
		m=sc.nextInt();
			switch(m){
				case 1:
					l.option4_1();
				break;
				case 2:
					l.option4_2();
				break;	
				case 3:
					l.option4_3();
				break;
				case 4:
					n=false;
				break;
				default:
					System.out.println("invaid values");
			}
		}}catch(Exception e){
			System.out.println(e);}
	}


	public static void main(String st[])throws IOException{
		boolean n=true;
		int m;
		Scanner sc=new Scanner(System.in);
		Insurance o=new Option();
		
		
		
		 try{while(n==true){
System.out.println("=======================================================================================================================================");
System.out.println("\n\n");			
			System.out.println("Press 1 to view all Car Insurance Policies ");
			System.out.println("Press 2 to view all Health Insurance Policies ");
			System.out.println("Press 3 to view all Life Insurance Policies ");
			System.out.println("Press 4 for exit");
System.out.println("=======================================================================================================================================");
System.out.println("\n\n");
			m=sc.nextInt();
			switch(m){
				case 1:
					o.CIP();
				break;
				case 2:
					o.HIP();
				break;	
				case 3:
					o.LIP();
				break;
				case 4:
					n=false;
				break;
				default:
					System.out.println("invaid values");
			}
		
		


		}}catch(Exception e){
			System.out.println(e);}
	
	}


}

