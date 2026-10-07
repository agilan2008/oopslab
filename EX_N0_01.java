import java.util.Scanner;
class electricitybill {
int consumerno;
String consumername;
int previousreading ,currentreading , units;
String type;
double bill=0;
void getData(){
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter consumer number:");
	consumerno=sc.nextInt();
	sc.nextLine();
	System.out.println("Enter consumer name:");
	consumername=sc.nextLine();
	System.out.println("Enter previous month reading:");
	previousreading=sc.nextInt();
	System.out.println("Enter current month reading:");
	currentreading=sc.nextInt();
	sc.nextLine();
	units=currentreading - previousreading;
	System.out.println("Enter connection type(domestic/commercial):");
	
	type=sc.nextLine();
}
void calculatebill() {
	if(type.equalsIgnoreCase("domestic")){
		if(units<=100)
			bill=units *1.5;
		else if(units<=200)
			bill=(100*1.5)+((units -100)*3);
		else if(units<=500)
			bill=(100*1.5)+(100*3)+((units-200)*4.5);
		else
			bill=((100*1.5)+100*3)+(300*4.5)+((units-500)*7);
		}
	else if(type.equalsIgnoreCase("commercial")){
		if(units<=100)
			bill=units*2.5;
		else if(units<=200)
			bill=(100*2.5)+((units-100)*5);
		else if(units<=500)
			bill=(100*2.5)+(100+5)+((units-200)*6.5);
		else
			bill=((100*2.5)+100*5)+(300*6.5)+((units-500)*9);
		}
	}
void display(){
	System.out.println("\n_______electricity bill______");
	System.out.println("consumer no:"+consumerno);
	System.out.println("consumer name:"+consumername);
	System.out.println("connection type:"+type);
	System.out.println("units consumed:"+units);
	System.out.println("bill amount:"+bill);
	}
public static void main(String[] args){
	electricitybill obj=new electricitybill();
	obj.getData();
	obj.calculatebill();
	obj.display();
	}
	}
