import java.util.*;

public class Coins {
    public static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;

        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                dp[i] = Math.min(dp[i], dp[i - coin] + 1);
            }
        }

        return dp[amount] > amount ? -1 : dp[amount];
    }

    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int[] array = new int[n];
        for(int i=0;i<n;i++)
        {
            array[i]= scanner.nextInt();
        }
        int amount= scanner.nextInt();
        System.out.println(coinChange(array,amount));
    }
}
