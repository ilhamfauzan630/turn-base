public class Map {
    //create field map move point
    private int x, y;
    //create constructor
    public Map(int x, int y) {
        this.x = x;
        this.y = y;
    }
    //create getter
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    //create setter
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    //create method move
    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }
    //create method print map
    public void printMap() {
        System.out.println("your position is " + x + " " + y);
    }
}
