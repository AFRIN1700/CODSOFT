import java.util.*;
public class Hello {
    public static void main(String Args[])
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("                   WELCOME TO GRADE CALCULATOR APP");
    System.out.println();
    System.out.print("Enter Total No Of Subject : ");
    int subject = sc.nextInt();
    System.out.println();
    int total=0;
    int mark[]=new int[subject];
    System.out.println("                   Enter The Subject Marks");
    System.out.println();
    for(int i=0;i<subject;i++)
    {
        System.out.print("Enter Subject "+ (i+1) + "  Mark : ");
        mark[i]=sc.nextInt();
        total+=mark[i];
        System.out.println();
    }
    System.out.println("----------------------------");
    System.out.println("Your Total Mark is   : "+ total);
    float average = total/subject;
    System.out.println("Your Average Mark is : " + average);
    if(average>=90)
    {
        System.out.println("Your Grade is        : A");
    }
    else if(average >=80)
    {
        System.out.println("Your Grade is        : B");
    }
    else if(average >=70)
    {
        System.out.println("Your Grade is        : C");
    }
    else if(average >=60)
    {
        System.out.println("Your Grade is        : D");
    }
    else 
    {
        System.out.println("Your Grade is        : E");
    }
    System.out.println("----------------------------");
    }
}
