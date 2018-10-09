
public class CreateAccount {
	
	int accountId;
    String accountantName;
    String IFSCcode;

   public CreateAccount(int accountId,String accountantName,String IFSCcode){
    this.accountId = accountId;
    this.accountantName = accountantName;
    this.IFSCcode = IFSCcode;
   }

    /*//adding deposit money with the balance 
    public double despositMoney() throws MiniumAmountDeposit{
double Currentbalance = 0.00;
        Scanner scn = new Scanner(System.in);
        System.out.println("please enter the deposit amount");
        double Depositamount = scn.nextDouble();
        Currentbalance += Depositamount ;
        System.out.println("your currentbalance="+Currentbalance);

        return Currentbalance;
    }*/

    //withdrawl money  and set daily withdrawl limit
    public void WithdrawMoney() throws InsufficientBalException, MiniumAmountDeposit{

double Currentbalance = 0.00;
        Scanner deposit = new Scanner(System.in);
        System.out.println("please enter the deposit amount");
        double Depositamount = deposit.nextDouble();
        Currentbalance += Depositamount ;
        System.out.println("your currentbalance="+Currentbalance);

        /*double Currentbalanace = despositMoney();*/

        //setDaily Withdrawl limit
           final double setDailyLimit = 2500.00;     

            Scanner withDraw = new Scanner(System.in);
            System.out.println("please enter the withdraw amount");
            double WithdrawMoney =withDraw.nextDouble();


        if(Currentbalance < WithdrawMoney)
            System.out.println("you have less amount : your current balance is="+Currentbalance);

        else if (WithdrawMoney > setDailyLimit)
            System.out.println("you have entered amount exceed than daily limit : your dailyLimit="+setDailyLimit);

        else 
            Currentbalance -= WithdrawMoney;
            System.out.println("your current balance is="+Currentbalance);

    }


    /*public void setWithdrawlLimit()throws exceedLimit{
        Scanner scn = new Scanner(System.in);
        System.out.println("please enter the withdraw amount");
           double  enterAmount = scn.nextDouble();
        double DailysetLimit = 2500;

        if(enterAmount>DailysetLimit)
            System.out.println("you have exceed daily limit : your dailyLimit"+DailysetLimit);


    }*/

    public String toString(){

        return "accountid="+this.accountid + "accountantname="+this.accountantname + "IFSCcode="+this.IFSCcode;
    }



    public static void main(String[] args){
        CreateAccount account = new CreateAccount(1234455533,"samy","ICIC09");
        System.out.println("you have created account : " +account);
    /*  
        try {
            account.despositMoney();
        } catch (MiniumAmountDeposit e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }*/

        try {
            account.WithdrawMoney();
        } catch (InsufficientBalException | MiniumAmountDeposit e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        /*try {
            account.setWithdrawlLimit();
        } catch (exceedLimit e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

*/      
    }

}
