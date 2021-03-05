public class Funct{
    public static void print2(){
        System.out.println("iam print 2 !!!");
    }
    public static void print(int a,int b){
        System.out.println("hello world!!!");
        print2();

    }


    public static void main(String []args){
            System.out.println("this is the first statement!!");
            print(2,3);
            print(4,5);
            System.out.println("this is the end statement!!");
    }
}