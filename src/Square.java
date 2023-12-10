public class Square {
    boolean isBlack;
    int numm;
    public Square(boolean isBlack, int num)
    {
        this.isBlack = isBlack;
        numm= num;

    }

    public void setBlack(boolean black) {
        this.isBlack = black;
    }

    public void setNumm(int numm) {
        this.numm = numm;
    }
    public int getNum(){
        return numm;
    }

    public boolean isBlack() {
        if(isBlack){
            return true;
        }
        else{
            return false;
        }
    }
}
