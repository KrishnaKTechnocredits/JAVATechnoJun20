package prashantCJune20;

import java.util.Scanner;

public class BankManagement_Scannar {
	
	static int totalcredCount;
	static int totaldebCount;
	static int indvidualcredCountICICI,indvidualdebcountICICI,indvidualdebcountSBI,indvidualcredCountSBI,indvidualcredCountHDFC,indvidualdebcountHDFC,indvidualcredCountBOM,indvidualdebcountBOM;
	static int ICICIIntialbalance = 1000;
	static int SBIIntialbalance = 500;
	static int HDFCIntialbalance=300;
	static int BOMIntialbalance=1000;
	String bank;

	 void bankName(String name,int amount,String operation){

		bank=name;
		switch(name){		
		case  "ICICI":
		switch (operation){
		case "Credit":
		case "credit":
			
		if(amount>0){
			ICICIIntialbalance = ICICIIntialbalance + amount;
			totalcredCount++;
			indvidualcredCountICICI++;
			break;
		}
		else {
			System.out.println("Please enter amount more than 0");
		}
		break;
		
		case "Debit":
		case "debit":
			if(amount>0){
				ICICIIntialbalance = ICICIIntialbalance - amount;
				totaldebCount++;
				indvidualdebcountICICI++;
				break;
			}
			else {
				System.out.println("Insufficent banance");
			}
			break;
		}
		break;
		case "SBI":
			switch (operation){
			case "Credit":
			case "credit":
				
			if(amount>0){
				SBIIntialbalance = SBIIntialbalance + amount;
			//	System.out.println("Your SBI current balance is  "+SBIIntialbalance);
				totalcredCount++;
				indvidualcredCountSBI++;
				break;
			}
			else {
				System.out.println("Please enter amount more than 0");
			}
			break;
			
			case "Debit":
			case "debit":
				if(amount>0){
					SBIIntialbalance = SBIIntialbalance - amount;
					totaldebCount++;
					indvidualdebcountSBI++;
					break;
				}
				else {
					System.out.println("Insufficent banance");
				}
				break;
			}
			break;
		case "HDFC":
			switch (operation){
			case "Credit":
				
			if(amount>0){
				HDFCIntialbalance = HDFCIntialbalance + amount;
				totalcredCount++;
				indvidualcredCountHDFC++;
				break;
			}
			else {
				System.out.println("Please enter amount more than 0");
			}
			break;
			
			case "Debit":
			case "debit":
				if(amount>0){
					HDFCIntialbalance = HDFCIntialbalance - amount;
					totaldebCount++;
					indvidualdebcountHDFC++;
					break;
				}
				else {
					System.out.println("Insufficent banance");
				}
				break;
			}
			break;
		case "BOM":
			switch (operation){
			case "Credit":
			case "credit":
				
			if(amount>0){
				BOMIntialbalance = BOMIntialbalance + amount;
				totalcredCount++;
				indvidualcredCountBOM++;
				break;
			}
			else {
				System.out.println("Please enter amount more than 0");
			}
			break;
			
			case "Debit":
			case "debit":
				if(amount>0){
					BOMIntialbalance = BOMIntialbalance - amount;
					totaldebCount++;
					indvidualdebcountBOM++;
					break;
				}
				else {
					System.out.println("Insufficent banance");
				}
				break;
			}
			break;
	
	
	}
 }
		
		void totalcreditAnddebit(){
			System.out.println("Total credit transations "+totalcredCount);
			System.out.println("Total debit transations "+totaldebCount);
		}
				
				
		void bankindividualCreditcount(){
		System.out.println("ICIC Credit tranctions "+indvidualcredCountICICI+
							"  SBI credit tranctions "+indvidualcredCountSBI+
							"  HDFC credit tranctions "+indvidualcredCountHDFC+
							"  BOM credit tranctions "+indvidualcredCountBOM);
		}
		void bankindividualDebitcount(){
			System.out.println("ICIC Debit tranctions "+indvidualdebcountICICI+
								"  SBI Debit tranctions "+indvidualdebcountSBI+
								"HDFC Debit tranctions "+indvidualdebcountHDFC+
								"BOM Debit tranctions "+indvidualdebcountICICI);
			}
		void totalamountinbanks(){
			int bankbalance = ICICIIntialbalance + SBIIntialbalance+HDFCIntialbalance+BOMIntialbalance;
			System.out.println("Your total bank balance is "+bankbalance);
		}
		
		
		static boolean message(){
			if (totalcredCount>totaldebCount)
				return true;
			else
				return false;
		}
		
		public static void main(String[] args)
		{
			String choice;

			BankManagement_Scannar Bankscannar =new BankManagement_Scannar();
			Scanner scanner = new Scanner(System.in);
			do {
			System.out.println ("Please enter your Bank Name  ?");
			System.out.println ("(ICCI/HDFC/SBI/BOB) : ");
			String bankName =scanner.next();

			System.out.println ("Operation Type Credit/Debit");
			System.out.println ("Type of Operation :");
			String operation =scanner.next();

			System.out.println ("Enter the Amount :");
			int amount =scanner.nextInt();
			Bankscannar.bankName(bankName,amount,operation);

			System.out.println ("Do you wish to continue?Yes/No");
			choice=scanner.next();
			}while(choice.equals("Yes"));
			
			
			BankManagement bankmanagement = new BankManagement();
			bankmanagement.bankName("ICICI", "Credit", 500);
			bankmanagement.bankName("ICICI", "Credit", 500);
			bankmanagement.bankName("ICICI", "Credit", 500);
			bankmanagement.bankName("ICICI", "Debit", 500);
			bankmanagement.bankName("HDFC", "Debit", 100);
			bankmanagement.bankName("ICICI", "Credit", 500);
			bankmanagement.bankName("SBI", "Debit", 100);
			bankmanagement.bankName("BOM", "Debit", 500);
			bankmanagement.bankName("BOM", "Credit", 500);
			bankmanagement.bankindividualCreditcount();
			bankmanagement.bankindividualDebitcount();
			bankmanagement.totalcreditAnddebit();
			bankmanagement.totalamountinbanks();
			if(message())System.out.println("*I appreciate your money management skill*");
			else System.out.println("*Please spend money wisely*");
				
		}
		
		


}
