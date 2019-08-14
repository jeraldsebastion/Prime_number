import java.util.Scanner;

public class primenumber {
    public static void main(String args[]){
        int i,num;
        System.out.println("Enter the value");
        Scanner in=new Scanner(System.in);
        num=in.nextInt();
        boolean prime=true;
        for(i=2;i<num/2;i++) {
            if (num % i == 0) {
                prime = false;
                break;
            }
        }
            if(prime){
                System.out.println("is prime number");
            }
            else {
                System.out.println("not prime number");
            }
        }
    }

