import java.util.Scanner;
public class Atm{
	static void atm(){
		double deposite,withdrawal,balance=0;
		Scanner my_inp=new Scanner(System.in);
		boolean s=true;

		while(s){
			Scanner input=new Scanner(System.in);

			System.out.println("\n\n[1]Deposit          [2]withdrawal");
		    System.out.println("[3]Balance          [4]Exit\n");
		    System.out.println("Enter your choice : ");
		    String i=input.nextLine();

		    switch(i){
		    case "1":
		    	System.out.println("Enter your Amount :");
		    	deposite=input.nextDouble();
		    	balance=balance+deposite;
		    	System.out.println("You deposite Amount is "+ deposite);
		    	System.out.println("Your Available Balance is "+balance);
		    	break;

            case"2":
            	System.out.println("Enter your withdrawal Amount : ");
            	withdrawal=input.nextDouble();
            	
            	if(balance>=withdrawal){
            		balance=balance-withdrawal;
                	System.out.println("Your withdrawal amount is "+ withdrawal);
                    System.out.println("Your Available Balance is "+balance);
            	}
            	else{
            		System.out.println("!!!Not enough money!!!");
            	}

                break;
            case"3":
            	System.out.println("Your balance is:"+balance);
            	break;
            case"4":
            	System.out.println("Good Bye....!");
            	s=false;
            	break;
            

		    }
		}

	}
	public static void main(String[]args){

		Scanner my_num=new Scanner(System.in);
		boolean j=true;
		while(j){
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		    System.out.println("           Bank of Ceylon");
		    System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		    System.out.println("[1] Enter ATM Card      [2]Exit\n");
		    System.out.print("Enter [1] or [2] : ");
		    String k;
		    k = my_num.nextLine();
            if(k.equals("1")){
            	int u=3;
            	while(u>0){
            	System.out.println("Enter your pin");
        	    String l;
        	    l=my_num.nextLine();
        	    if(l.equals("1234")){

        		  atm();
        		}
        	    else{
        		  System.out.println("\nWrong pin\n");
        		  --u;
        		  System.out.println(u+" More left");
        		}
        		} 

        	}
        	else{
        		j=false;
        	}
        }
    }
}   