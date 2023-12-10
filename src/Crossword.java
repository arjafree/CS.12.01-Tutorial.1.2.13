public class Crossword {



    private Square[][] puzzle;

    public Crossword(boolean[][] blackSquares)
    {
        puzzle = new Square[blackSquares.length][blackSquares[1].length];
        int num = 0;
        for(int r = 0; r< puzzle.length; r++){
            for(int c =0; c<puzzle[r].length; c++){
                Boolean isBlack = false;
                if(blackSquares[r][c]){
                    isBlack=true;
                }
                if(toBeLabeled(r,c,blackSquares)){
                    num=num+1;
                    Square square = new Square(isBlack, num);
                    puzzle[r][c] = square;

                }
                if(!toBeLabeled(r,c,blackSquares)){
                    Square square = new Square(isBlack, 0);
                    puzzle[r][c] = square;
                }

            }
        }

        // To be implemented.

    }
    //A square is labeled with a positive number if and only if The square is white and
    // The square does not have a white square immediately above it, or it does not
    // have a white square immediately to its left, or both.

    private boolean toBeLabeled(int r, int c, boolean[][] blackSquares)
    {
        if(!blackSquares[r][c]){
            if(c==0||r==0){
                return true;
            }
            if(!blackSquares[r][c]&&blackSquares[r][c-1]){
                return true;
            }
            if(!blackSquares[r][c]&&blackSquares[r-1][c]){
                return true;
            }

        }

        return false;

    }

    public Square[][] getPuzzle() {
        return puzzle;
    }
}
