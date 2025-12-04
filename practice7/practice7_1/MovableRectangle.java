package practice7.practice7_1;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(MovablePoint topLeft, MovablePoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    public boolean SpeedTest() {
        return topLeft.getXSpeed() == bottomRight.getXSpeed() &&
                topLeft.getYSpeed() == bottomRight.getYSpeed() &&
                topLeft.SpeedTest() && bottomRight.SpeedTest();
    }

    @Override
    public String toString() {
        return "MovableRectangle[topLeft=" + topLeft.toString() +
                ", bottomRight=" + bottomRight.toString() + "]";
    }

    public MovablePoint getTopLeft() { return topLeft; }
    public MovablePoint getBottomRight() { return bottomRight; }

}