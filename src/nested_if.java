public class nested_if {
    public static void main(String[] args) {
        int a = 50;
        int b = 40;
        int c = 30;
        int greater=0;

        if(a>b){
            if(a>c){
                greater = a;

            }
            else {
                greater = c;
            }

        }
        else if(b>c){
            greater = b;
        }
        else{
            greater = c;
        }
        System.out.println("greater = "+ greater);
    }
}
