package Hello;

import java.util.Scanner;

public class Hello 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String fellow = "World";
        System.out.printf("Hello %s\n", fellow);

        while(!fellow.equals("exit"))
        {
            System.out.printf("Introduce yourself: ");
            fellow = s.nextLine();
            if(!fellow.equals("exit")) System.out.printf("Hello %s\n", fellow);
        }
            s.close();
    }
}
