package View;

import Control.Account;

import java.util.ArrayList;

public class View {
    public static void showLeaderboard() {
        ArrayList<String> usernames = new ArrayList<>();
        ArrayList<Integer> wins = new ArrayList<>();
        for (int i = 0; i < Account.getNumberOfAccounts(); i++) {
            usernames.add(Account.getUsernameByIndex(i));
            wins.add(Account.getWinsByIndex(i));
        }
        for (int i = 0; i < wins.size(); i++) {
            for (int j = 0; j < wins.size() - 1; j++) {
                if (wins.get(j) < wins.get(j + 1)) {
                    String string = usernames.get(j);
                    usernames.set(j, usernames.get(j + 1));
                    usernames.set(j + 1, string);
                    int flag = wins.get(j);
                    wins.set(j, wins.get(j + 1));
                    wins.set(j + 1, flag);
                }
            }
        }
        for (int i = 0; i < wins.size(); i++) {
            System.out.println("UserName : " + usernames.get(i) + "- Wins : " + wins.get(i));
        }
    }
}
