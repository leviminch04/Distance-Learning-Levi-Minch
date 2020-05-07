package Week4.FRQ2;

public class TokenPass {
    private int[] board;
    private int currentPlayer;
    public TokenPass(int playerCount)
    {
        board = new int[playerCount];
        for (int i = 0; i <= board.length; i++) {
            board[i] = (int) (Math.random()*10 + 1);
        }
        currentPlayer = (int) (Math.random() * playerCount);
    }

    public void distributeCurrentPlayerTokens()
    {
        int count = 1;
        int diff = board.length - currentPlayer;
        while(board[currentPlayer] >= 0)
        {
            board[currentPlayer + count]++;
            board[currentPlayer]--;
            count++;
            if(currentPlayer + count >= board.length - 1)
            {
                count = -diff;
            }
        }
    }

}
