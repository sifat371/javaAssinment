public class Boat {
  double x;
  double y;
  double direction;

  public Boat(double x, double y, double direction) {
    this.x = x;
    this.y = y;
    this.direction = direction;
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }

  public double getDirection() {
    return direction;
  }

  public void move(double distance) {
    x += distance * Math.cos(direction);
    y += distance * Math.sin(direction);
  }

  public void turn(double angle) {
    direction += angle;
  }
}
