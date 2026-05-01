import java.util.Scanner;
public class string2 {
    public static void main(String[] args)
    {
        System.out.println("Enter a message: ");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        todolist x = new todolist();
        x.todo(a);
}
}
class todolist{
    void todo(String b)
    {

    
    if(b.isBlank()){
        System.out.println("Task not entered");
        return;
    }
    else
        System.out.println("Your task: "+b);
        System.out.println("Thank you for entering the message");
    }

}