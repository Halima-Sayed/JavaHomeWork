package Class9HW;

public class uyf {
        public static void main(String[] args){
            for(int i =0 ;i<=3;i++){

                if(i==0 || i ==3){
                    for(int j =4;j>0;j--){
                        System.out.print("$");
                    }
                }
          else if(i==1 || i ==2){
                    for(int j =0;j<2;j++){
                        System.out.print("$"+"  ");
                    }
                }
                System.out.println();
            }
        }
    }
