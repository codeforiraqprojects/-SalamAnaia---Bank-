package account1;

public class Bank {
			int acc_no;  
			String name;  
			float amount;  
			
			//deposit method  
			void deposit(float amt){  
			amount=amount+amt;  
			System.out.println(amt+" deposited");  
			}  
			//withdraw method  
			void withdraw(float amt){  
			if(amount<amt){  
			System.out.println("Insufficient Balance");  
			}else{  
			amount=amount-amt;  
			System.out.println(amt+" withdrawn");  
			}  
			}  

		    //method to check the balance of the account  
			void checkBalance(){System.out.println("Balance is: "+amount);}  
			//method to display the values of an object  
			void display(){System.out.println(acc_no+" "+name+" "+amount);}  
	} 
