
public class BankAccount {
	/*
	 * Bank account has:
	 * -Account holder name
	 * -Account no
	 * - Account Bal
	 */
	
    private String accountHolderName;
    private int accountNo;
    private int accountBal;
    
    /*
     * Account will need name and number at the time of creation
     * Balance can be added after creating account.
     * 
     */
    
     public BankAccount(String name,int no)
     {
    	 accountHolderName=name;
    	 accountNo=no;
     
     }
     

	public void setAccountNo(int no) 
	{
		accountNo =no;
	}


	public void Deposite(int amount)
     {
    	accountBal=accountBal+amount; 
     }
     
     public void Withdraw(int amount)
     {
    	accountBal=accountBal-amount; 
     }
     
     public String toString()
     {
    	 //A/c name= Vanitanatkar,A/c Number:123456,A/c Balance:500
    	 
    	 String str = "A/C Holder name:"+accountHolderName+", A/c No:"+accountNo+", A/c Bal:"+accountBal;
    	 return str;
     }
}
