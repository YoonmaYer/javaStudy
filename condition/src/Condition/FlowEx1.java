package Condition;

public class FlowEx1 {
    public static void main(String[] args) {
        int x = 0;
        System.out.println("x=0 일 때, 참인 것은?");
        if(x==0){
            System.out.println("x==0");
        }
        if(x!=0){
            System.out.println("x!=0");
        }
        if(!(x==0)){
            System.out.println("!(x==0)");
        }
        if(!(x!=0)){
            System.out.println("!(x!=0)");
        }

        x= 1;
        System.out.println("x=1 일 때, 참인 것은?");
        if(x==0){
            System.out.println("x==0");
        }
        if(x!=0){
            System.out.println("x!=0");
        }
        if(!(x==0)){
            System.out.println("!(x==0)");
        }
        if(!(x!=0)){
            System.out.println("!(x!=0)");
        }
    }
}
