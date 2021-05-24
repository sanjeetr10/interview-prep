package dp.impl;

public class RegularExpressionMatching {

    public boolean match(String s, String p) {

        boolean[][] dp = new boolean[p.length() + 1][s.length() + 1];

        for (int r = 0; r < dp.length; r++) {
            for (int c = 0; c < dp[0].length; c++) {

                if (r == 0 && c == 0) {
                    dp[r][c] = true;
                } else if (r == 0) {
                    dp[r][c] = false;
                } else if (c == 0) {
                    char pc = p.charAt(r - 1);

                    if (pc == '*') {
                        dp[r][c] = dp[r-2][c];
                    } else {
                        dp[r][c] = false;
                    }
                } else {

                    char sc = s.charAt(c-1);
                    char pc = p.charAt(r-1);

                    if(pc != '*'){
                        if(pc=='.' || (pc==sc)){
                            dp[r][c] = dp[r-1][c-1];
                        } else{
                            dp[r][c] = false;
                        }
                    } else {
                        char plc = p.charAt(r-2);

                        if(plc=='.' || (plc == sc)){
                            dp[r][c] = dp[r-2][c] || dp[r][c-1];
                        } else{
                            dp[r][c] = dp[r-2][c];
                        }
                    }
                }
            }
        }

        return dp[p.length()][s.length()];
    }
}
