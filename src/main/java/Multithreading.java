

public class Multithreading {

    public static void main(String[] args) {
        Brother b = new Brother();
        b.start();
        Sister s  = new Sister();

        s.start();
    }
}


class Brother extends Thread{
   public void run(){
        for(int i=0 ; i < 100 ;i++){
            System.out.println("withdraw 500");
        }
   }

}

class Sister extends Thread{
    public void run(){
        for(int i=0 ; i <100 ; i++){
        System.out.println("withdraw 800");}
    }

}

