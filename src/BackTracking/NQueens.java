package BackTracking;
import java.util.*;

public class NQueens {

    public static List<List<String>> nQueen(int n) {
        boolean[][] board = new boolean[n][n];
        List<List<String>> ans = new ArrayList<>();
        nQueenSol(board, 0, 0, ans);
        return ans;
    }

    public static void nQueenSol(boolean[][] board, int r, int c, List<List<String>> ans) {
        if (r == board.length) {
            ArrayList<String> currList = new ArrayList<>();
            for (int i = 0; i < board.length; i++) {
                String currString = "";
                for (int j = 0; j < board.length; j++) {
                    if (board[i][j]) currString += 'Q';
                    else currString += '.';
                }
                currList.add(currString);
            }
            ans.add(currList);
            return;
        }
        if (canQueenBePlaced(board, r, c)) {
            board[r][c] = true;
            nQueenSol(board, r + 1, 0, ans);
            board[r][c] = false;
        }
        if (c + 1 < board.length) nQueenSol(board, r, c + 1, ans);
    }

    public static boolean canQueenBePlaced(boolean[][] board, int r, int c) {
        //to move up - r-1
        // to move up-right = r-1,c+1
        //to move up-left = r-1,c-1
        int nr = r;
        int nc = c;
        while (nr >= 0) {
            if (board[nr][nc]) return false;
            nr--;
        }
        nr = r;
        while (nr >= 0 && nc >= 0) {
            if (board[nr][nc]) return false;
            nr--;
            nc--;
        }
        nr = r;
        nc = c;
        while (nr >= 0 && nc < board[0].length) {
            if (board[nr][nc]) return false;
            nr--;
            nc++;
        }
        return true;
    }
    public static void main(String[] args) {

        System.out.println(nQueen(4));

    }
}
