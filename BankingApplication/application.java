package BankingApplication;

import java.util.Scanner;
class application
{   String name;int accno;int initialbal;static int ch;
    Scanner S=new Scanner(System.in);
    public void menu(){

        System.out.println("1.Create account");
        System.out.println("2.Deposit");
        System.out.println("3.Withdraw");
        System.out.println("4.Display details");
        System.out.println("5.Exit");
    }

    public void create(){
        System.out.println("Enter account holder name");
        name=S.nextLine();
        System.out.println("Enter account number");
        accno=S.nextInt();
        System.out.println("Enter initial balance");
        initialbal=S.nextInt();
        if(initialbal>=0){
            System.out.println("ACCOUNT CREATED SUCCESSFULLY");
            System.out.println("");}
        else
            System.out.println("balance ain't negative");

    }

    public void deposit(){
        System.out.println("Enter amount to deposit");
        int dep=S.nextInt();
        if(dep>0) {
            initialbal = initialbal + dep;
            System.out.println("Deposit success! New balance =" + initialbal);
            System.out.println("");
        }
        else
            System.out.println("deposit ain't negative");
    }

    public void withdraw(){
        System.out.println("Enter amount to withdraw");
        int draw= S.nextInt();
        if(draw<=initialbal) {
            initialbal = initialbal - draw;
            System.out.println("Withdraw success!  New balance =" + initialbal);
            System.out.println("");
        }
        else
            System.out.println("Insufficient balance :(");
    }

    public void details(){
        System.out.println("ACCOUNT DETAILS:");
        System.out.println("Account holder:"+name);
        System.out.println("Account no:"+accno);
        System.out.println("Account balance:"+initialbal);
        System.out.println("");
    }

    public static void main(String[] args) {
        application A= new application();
        Scanner S=new Scanner(System.in);

        while(true)
        {
            A.menu();
            ch=S.nextInt();

            if(ch !=5)
            {
                switch (ch) {
                    case 1:
                        A.create();
                        break;

                    case 2:
                        A.deposit();
                        break;

                    case 3:
                        A.withdraw();
                        break;

                    case 4:
                        A.details();
                        break;

                    default:
                        System.out.println("invalid choice");
                        break;
                }
            }
            else
                System.exit(0);
        }
    }
}