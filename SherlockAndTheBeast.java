public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        
        for (int k = 0; k < T; k++) {
            int digitsCount = scan.nextInt();            
            
            boolean has = false;
            for (int digit5 = digitsCount; digit5 >= 0; digit5--) {
                int digit3 = digitsCount - digit5;
                
                if (digit5 % 3 == 0 && digit3 % 5 == 0) {
                    has = true;
                    
                    for (int i = 0; i < digit5; i++) {
                        System.out.print(5);
                    }
                    for (int i = 0; i < digit3; i++) {
                        System.out.print(3);
                    }
                    System.out.println();
                    break;
                }
            }
            if (!has) {
                System.out.println(-1);
            }
        }
        scan.close();
    }
}
