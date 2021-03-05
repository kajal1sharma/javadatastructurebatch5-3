public class recursion {
    //whenever a function is called whole code =>call stack
    //local variable are accessible within that function, they will have their values 
    //in accordance with the value passed
    static void print(int n){
        if(n==0){
            return;
        }
        else{
            
            System.out.println("number is ::  "+n);
            print(n-1);
            return;
        }
    }
  public static void main(String []args){
      print(3);
  }  
}
