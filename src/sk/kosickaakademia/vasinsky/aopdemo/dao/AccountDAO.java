package sk.kosickaakademia.vasinsky.aopdemo.dao;


import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

    public void AddAccount(){
        System.out.println(getClass()+ ":ADDING AN ACCOUNT... ");
    }
}
