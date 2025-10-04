import java.awt.Graphics;
import java.awt.Polygon;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.event.MouseInputAdapter;
import java.awt.event.MouseEvent;

public class Monitor extends JComponent {

    private static Monitor monitor;
    private List<Arc> arcs;
    private List<Line> lines;
    private List<Polygon> polygons;
    private JFrame frame;

    public static Monitor getMonitor() {
        if (monitor == null) {
            monitor = new Monitor();
        }
        return monitor;
    }

    private Monitor() {
        super();
        frame = new JFrame("Monitor");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this);

        arcs = new LinkedList<>();
        lines = new LinkedList<>();
        polygons = new LinkedList<>();

        addMouseMotionListener(new MouseInputAdapter() {
            public void mouseMoved(MouseEvent e) {
                System.out.println("Mouse moved: (" + e.getX() +
                        ", " + e.getY() +
                        ")");
            }
        });

        addMouseListener(new MouseInputAdapter() {
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse clicked at: (" + e.getX() +
                        ", " + e.getY() +
                        ")");
            }

            public void mouseEntered(MouseEvent e) {
                System.out.println("Mouse entered at: (" + e.getX() +
                        ", " + e.getY() +
                        ")");
            }

            public void mouseExited(MouseEvent e) {
                System.out.println("Mouse left at: (" + e.getX() +
                        ", " + e.getY() +
                        ")");
            }
        });

        frame.setVisible(true);
    }

    public synchronized void draw_a_line(int x1, int y1, int x2, int y2) {
        lines.add(new Line(x1, y1, x2, y2));
        repaint();
    }

    public synchronized void draw_a_circle(int x, int y, int r) {
        arcs.add(new Arc(x, y, r));
        repaint();
    }

    public synchronized void draw_a_polygon(int[] xPoints, int[] yPoints, int nPoints) {
        polygons.add(new Polygon(xPoints, yPoints, nPoints));
        repaint();
    }

    @Override
    protected synchronized void paintComponent(Graphics g) {
        super.paintComponent(g);
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

    public static void main(String[] args) {
        Monitor.getMonitor().draw_a_circle(50, 50, 30);
        Monitor.getMonitor().draw_a_line(100, 100, 200, 200);
        Monitor.getMonitor().draw_a_polygon(new int[]{250, 300, 350}, new int[]{100, 50, 100}, 3);
    }
}
