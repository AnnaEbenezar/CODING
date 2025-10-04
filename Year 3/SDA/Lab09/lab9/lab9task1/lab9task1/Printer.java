import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class Printer extends JComponent {

    private static Printer printer;

    public static Printer getPrinter() {
        if (printer == null) {
            printer = new Printer();
        }
        return printer;
    }

    private List<Arc> arcs;
    private List<Line> lines;
    private List<Polygon> polygons;

    private JFrame frame;

    private Printer() {
        super();

        frame = new JFrame("Printer");
        frame.setSize(400, 400);
        frame.setLocation(500, 0);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this);

        arcs = new LinkedList<Arc>();
        lines = new LinkedList<Line>();
        polygons = new LinkedList<Polygon>(); // Initialize the list for polygons

        frame.setVisible(true);
    }

    public synchronized void drawLine(int x1, int y1, int x2, int y2) {
        lines.add(new Line(x1, y1, x2, y2));
        repaint();
    }

    public synchronized void drawCircle(int x, int y, int r) {
        arcs.add(new Arc(x, y, r));
        repaint();
    }

    public synchronized void drawPolygon(int[] xPoints, int[] yPoints, int nPoints) {
        // Create a new Polygon object and add it to the list
        polygons.add(new Polygon(xPoints, yPoints, nPoints));
        repaint();
    }

    public synchronized void paint(Graphics g) {
        g.setColor(Color.red);
        for (Line line : lines) {
            g.drawLine(line.x1, line.y1, line.x2, line.y2);
        }

        for (Arc arc : arcs) {
            g.drawArc(arc.x, arc.y, arc.r * 2, arc.r * 2, 0, 360);
        }

        for (Polygon polygon : polygons) {
            g.drawPolygon(polygon);
        }
    }

    private static class Arc {
        int x, y, r;

        Arc(int x, int y, int r) {
            this.x = x;
            this.y = y;
            this.r = r;
        }
    }

    private static class Line {
        int x1, y1, x2, y2;

        Line(int x1, int y1, int x2, int y2) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }
    }
}
