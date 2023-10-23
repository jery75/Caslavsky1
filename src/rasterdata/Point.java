package rasterdata;

public class Point {
    private int X, Y;

    public Point(int x, int y) {
        X = x;
        Y = y;

    }//získaní souřadnic

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    ;

    //nastavení souřadnic
    public void setX(int x) {
        X = x  ;
    }

    public void setY(int y) {
        Y = y;
    }
}
