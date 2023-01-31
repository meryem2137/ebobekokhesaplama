import java.util.Scanner;

public class ebobekokhesaplama{


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1;
        int n2;
        System.out.print("ilk sayıyı giriniz: ");
        n1=input.nextInt();
        System.out.print("ikinci sayıyı giriniz: ");
        n2=input.nextInt();
        int k=n1;if(n1<n2){
        while(k>=1){
            if((n1%k==0)&&(n2%k==0)){
                int ebob=k;
                System.out.println("ebob: "+ebob);
                break;
            }k--;





        }
        int j=n2;
        while(j<=(n1*n2)){
            if((j%n1==0)&&(j%n2==0)){
                int ekok=j;
                System.out.print("ekok: "+ekok);
                break;

            }j++;





        }}
        else {
             k=n2;
            while(k>=1){
                if((n1%k==0)&&(n2%k==0)){
                    int ebob=k;
                    System.out.println("ebob: "+ebob);
                    break;
                }k--;





            }
            int j=n1;
            while(j<=(n1*n2)){
                if((j%n1==0)&&(j%n2==0)){
                    int ekok=j;
                    System.out.print("ekok: "+ekok);
                    break;

                }j++;





            }}


        }























        }




















//www.patika.dev



































































