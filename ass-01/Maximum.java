public class Maximum {
    void max(int a, int b){
        if(a > b){
            System.out.println("Max is: "+a);
        }
        else{
            System.out.println("Max is: "+b);
        }
    }
    void max(int a, int b, int c){
        if(a > b){
            System.out.println("Max is: "+a);
        }
        else if(b > c){
            System.out.println("Max is: "+b);
        }
        else{
            System.out.println("Max is: "+c);
        }
    }
    void max(double a, double b){
        if(a > b){
            System.out.println("Max is: "+a);
        }
        else{
            System.out.println("Max is: "+b);
        }
    }
    public static void main(String[] args){
        Maximum m1 = new Maximum();
        m1.max(10,5);
        m1.max(30,20,10);
        m1.max(20.5,10.5);
    }
}
