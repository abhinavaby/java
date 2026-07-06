public class break_and_continue {
    public static void main(String[] args){
        System.out.println("prints from 1 to 8 and skips 3");
        for(int i=1;i<=10;i++){
           if(i==3){
               continue;

           }
            System.out.println(i);
           if(i==8){
               break;
           }
        }

    }
}
