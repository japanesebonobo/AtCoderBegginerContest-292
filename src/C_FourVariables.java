import java.util.*;

public class C_FourVariables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();
        long ans = 0;

        long f[] = new long[N+1];
        for (int i = 1; i < f.length; i++) {
            f[i] = 0;
        }

        for (int a = 1; a < N+1; a++) {
            for (int b = 1; a*b<=N; b++) {
                f[a*b]++;
            }
        }

        for (int x = 1; x < f.length; x++) {
            ans+=f[x]*f[N-x];
        }

        System.out.println(ans);
    }
}