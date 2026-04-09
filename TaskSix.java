import java.util.Scanner;
public class TaskSix{
public static void main(String[] args){

    Scanner inputCollector = new Scanner(System.in);
    System.out.print("Enter integer: ");
    int number = inputCollector.nextInt();

    int sum = 0;
    for (int counter = 1 ; counter <= number; counter++){
    sum = counter + sum;
    System.out.println(counter);
    
    }
    System.out.println("Sum is: "+ sum);
}
}



//    int counter = 1;
//    int sum = 1;

//for(int counter = 1; counter <= number; counter++){
//    while (counter <= number){
//    System.out.println(counter);
//    sum = sum + counter;
//    ++counter;
//    }
//    System.out.printf("Sum is %d%n",sum);
//}   
//    
//    }
//
//

