import java.util.*;
public class Main
{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    Random random=new Random();
    int min = 1,max = 100,guess,chance=0,score=10;
    int num =random.nextInt(1,100);
    System.out.println("                  Guess A Number From 1 to 100");
    System.out.println();
    System.out.print("Enter a Number : ");
    guess=sc.nextInt();
    if(num==guess)
    {
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.println("                                 !!!  Hurray You Won  !!!");
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.print("Your Score Is : " + score);
        System.exit(0);
    
    }
    else
    {  
        
        while(chance<=10)
        {
        if(guess==num)
        {
            System.out.println("-----------------------------------------------------------------------------------------------------");
            System.out.println("                                 !!!  Hurray You Won  !!!");
            System.out.println("-----------------------------------------------------------------------------------------------------");
            System.out.print("Your Score Is : " + score);
            System.exit(0);
        }
        else if(guess<num)
        {
            System.out.println();
            System.out.println("Your Guess Is Too Low .");
        }
        else
        {
            System.out.println();
            System.out.println("Your Guess is Too High.");
        }
            System.out.println("Try Again With Different Number");
            System.out.println();
            System.out.print("Enter a Number : ");
            guess=sc.nextInt();
            System.out.println();
            chance++;
        if(chance==11)
        {
            System.out.println("No More Guesses !!! Better Luck Next Time");
            System.out.println("The Number Is : " + num);
            System.exit(0);
        }
        score--;
        }
    }
}
}