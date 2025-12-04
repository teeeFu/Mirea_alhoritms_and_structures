package practice7.practice7_1;

public class MovablePoint implements Movable {
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public int getX() { return x; }
    public int getY() { return y; }
    public int getXSpeed() { return xSpeed; }
    public int getYSpeed() { return ySpeed; }

    @Override
    public void moveUp() {
        y++;
    }

    @Override
    public void moveDown() {
        y--;
    }

    @Override
    public void moveLeft() {
        x--;
    }

    @Override
    public void moveRight() {
        x++;
    }

    public boolean SpeedTest() {
        return xSpeed == ySpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint[x=" + x + ", y=" + y +
                ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + "]";
    }



}