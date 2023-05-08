package prep.pack;

public class StaircasePatternPrinter {

    public static void main(String[] args) {
        rightAligned(6);
        System.out.println();
        leftAligned(6);
    }

    private static void rightAligned(int n){
        int c = n-1;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j ++){
                if(j < c){
                    System.out.print(" ");
                }
                else{
                    System.out.print("#");
                }
            }
            System.out.println();
            c--;
        }
    }

    private static void leftAligned(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j ++){
                if(i>=j){
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }
}