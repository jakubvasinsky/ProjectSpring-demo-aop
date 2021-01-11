package sk.kosickaakademia.vasinsky.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sk.kosickaakademia.vasinsky.aopdemo.dao.AccountDAO;

public class MainDemoApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DemoConfig.class);

        AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);

        theAccountDAO.AddAccount();

        System.out.println("\n calling it again \n");
        theAccountDAO.AddAccount();

        context.close();

    }

}
