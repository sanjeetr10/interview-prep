package dp.impl;

public class LongestPalindromicString {

    public String longestPalindrome(String s) {
        return find(s, s.length());
    }

    private String find(String str, int n) {

        int[][] dp = new int[n][n];
        int max = 0, maxs = 0, maxe = 0;

        //fill diagonal
        for (int i = 0; i < n; i++) {
            dp[i][i] = 1;
        }

        //fill length 2
        for (int i = 0; i < n - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                dp[i][i + 1] = 1;
                max = 2;
                maxs = i;
                maxe = i + 1;
            }
        }

        //fill length >2
        // dp[i][j] = 1, if s[i]=s[j] and dp[i+1][j-1]=1
        for (int l = 2; l < n; l++) {
            for (int s = 0; s < n - l; s++) {
                if (str.charAt(s) == str.charAt(s + l) &&
                        dp[s + 1][s + l - 1] == 1) {
                    dp[s][s + l] = 1;

                    if (l + 1 > max) {
                        max = l + 1;
                        maxs = s;
                        maxe = s + l;
                    }
                }
            }
        }

        return str.substring(maxs, maxe + 1);

    }

    public void printDp(int[][] dp) {
        int r = dp.length;
        int c = dp[0].length;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.printf("%2d", dp[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
