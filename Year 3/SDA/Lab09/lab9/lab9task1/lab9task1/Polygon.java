public class Polygon extends Shape {
  private int[] xPoints;
  private int[] yPoints;
  private int nPoints;

  public Polygon(int[] xPoints, int[] yPoints, int nPoints) {
      super(0, 0); // Assuming you don't need x, y for Polygon itself
      this.xPoints = xPoints;
      this.yPoints = yPoints;
      this.nPoints = nPoints;
  }
  
  @Override
  public void draw() {
      draw.drawPolygon(xPoints, yPoints, nPoints);
  }
}
