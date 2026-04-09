public class TaskTwo{
public static void main(String[] args){

    int counter = 1;
    int product = 1;

    while (counter <= 10){
    System.out.println(counter);
    product = product * counter;
    ++counter;
    }
    System.out.printf("Product is %d%n",product);
    
    }
}




//write a program that uses a while loop to compute the product of integers from 1 to 10
