import java.util.Scanner;

public class Main{
    Scanner scan = new Scanner(System.in);

    public int getInput(){
        System.out.print("Enter input");
        int data = scan.nextInt();
        scan.nextLine();
        return data;
    }

    public static void main(String[] args){
       Student Kenny = new Student("Kenny Wijaya", "2802538630", 18);

       System.out.println(Kenny.name + " " + Kenny.id + " " + Kenny.age);

       Kenny.sayHello("Wilep");

       static int data = getInput();
       System.out.println(data);
    }
}