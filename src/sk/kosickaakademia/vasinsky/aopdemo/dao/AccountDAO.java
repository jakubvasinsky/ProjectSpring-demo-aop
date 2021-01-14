package sk.kosickaakademia.vasinsky.aopdemo.dao;


import org.springframework.stereotype.Component;
import sk.kosickaakademia.vasinsky.aopdemo.Account;

@Component
public class AccountDAO {

    public void AddAccount(Account theAccount, boolean vipFlag){
        System.out.println(getClass()+ ": ADDING AN ACCOUNT... ");
    }

    public boolean doWork(){
        System.out.println(" DOING WORK: WRITING CODE...");
    return true;
    }

}
