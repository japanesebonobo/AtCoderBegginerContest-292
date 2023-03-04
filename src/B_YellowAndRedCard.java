import java.util.*;

public class B_YellowAndRedCard  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        int N = scanner.nextInt();
        int Q = scanner.nextInt();

        int P[] = new int[N+1];
        for (int i = 1; i < N+1; i++) {
            P[i] = 0;
        }

        for (int i = 0; i < Q; i++) {
            int c = scanner.nextInt();
            int x = scanner.nextInt();
            if (c==1) {
                P[x]++; 
            } else if (c==2) {
                P[x] =+ 2;
            } else {
                if (P[x] >= 2) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }
        scanner.close();
    }
}

