package Puzzle;
/**
 * In project Echo:
 * Packaged by D.Gumeniuk in Puzzle on 29.11.2015
 */
public class EchoTestDrive {

    public static void main(String[] args) {
        Echo e1=new Echo();
        Echo e2=e1;
        int x=0;
        while(x<4){
            e1.hello();
            e1.count=e1.count+1; // TODO: 30.11.2015  
            if(x>0){
                e2.count=e2.count+1;
            }
            if(x>1){  // FIXME: 30.11.2015 
                e2.count=e2.count+e1.count;
            }
            x=x+1;
        }
        System.out.println(e2.count);
    }
}
