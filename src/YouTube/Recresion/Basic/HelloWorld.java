package Recresion.Basic;

public class HelloWorld {
    public static void main(String[] args) {
        message();
    }

    public  static  void message(){
        System.out.println("Hello World");
        message1();
    }

    public static  void message1(){
        System.out.println("Hello World");
        message2();
    }
    public static  void message2(){
        System.out.println("Hello World");
        message3();
    }
    public static  void message3(){
        System.out.println("Hello World");
        message4();
    }
    public static  void message4(){
        System.out.println("Hello World");
        message5();
    }
    public static  void message5(){
        System.out.println("Hello World");
    }

    public static void recursivemessage(int n) {
        if(n==0){
            return;
        }else{
            System.out.println("Hello World");
            recursivemessage(n-1);
        }

    }
}
