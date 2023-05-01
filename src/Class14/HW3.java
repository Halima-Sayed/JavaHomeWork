package Class14;

public class HW3 {
    //Write a method to return whether given number is prime or not?

   boolean isPrime(int num) {
       int count=0;
       boolean prime=false;
       for (int i = 1; i <=num; i++) {
           if (num%i==0)
               count++;
       }
       if (count==2){
           prime=true;
        }
       return prime;
    }
    public static void main(String[] args) {
       HW3 obj=new HW3();
       int a=17;
       boolean ans=obj.isPrime(a);
        System.out.println(ans);

    }
}
