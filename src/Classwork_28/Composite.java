package Classwork_28;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Composite {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JFrame Example");
        frame.setSize(640, 480);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.getContentPane().setBackground(Color.BLACK);
        Container container = new Container();
        frame.add(container);
        frame.setVisible(true);

        Shape rect1 = new Rect(100,100,Color.GREEN);
        Shape rect2 = new Rect(200,100,Color.ORANGE);
        Group group1 = new Group(0,0,Color.BLACK);

        Shape rect3 = new Rect(300,100,Color.GREEN);
        Shape rect4 = new Rect(400,100,Color.ORANGE);
        Group group2 = new Group(0,0,Color.BLACK);

        group1.add(rect1);
        group1.add(rect2);
        group2.add(rect3);
        group2.add(rect4);

        Group group3 = new Group(0,0,Color.BLACK);
        group3.add(group1);
        group3.add(group2);

        container.add(group3);
    }
}

interface ShapeProcessor {
    public void paint(Graphics graphics);
}

abstract class Shape implements ShapeProcessor {
    public int x;
    public int y;
    public Color color;
    public Shape(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }
    @Override
    public void paint(Graphics graphics){
        graphics.setColor(color);
    }

}

class Rect extends Shape {
    public Rect(int x, int y, Color color) {
        super(x, y, color);
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.fillRect(x, y, 20, 20);
    }

    public void make() {
        int count = (int)Math.round(Math.random()*5+1);
        for (int i = 0; i<count; i++) {
            int xOffset = (int)Math.round(Math.random()*100-50);
            int yOffset = (int)Math.round(Math.random()*100-50);
            Rect rect = new Rect(x+xOffset,y+yOffset,
                    Color.BLUE
            );
        }
    }
}

class Group extends Shape {
    private final List<Shape> shapes = new ArrayList<>();

    public Group(int x, int y, Color color) {
        super(x, y, color);
    }

    @Override
    public void paint(Graphics graphics) {
        shapes.forEach((shape) -> {
            shape.paint(graphics);
        });
    }

    public void add(Shape shape){
        shapes.add(shape);
    }
}

class Container extends JPanel {
    private final List<Shape> shapes = new ArrayList<>();

    public void add(Shape shape){
        shapes.add(shape);
    }

    @Override
    public void paintComponent(Graphics graphics) {
        setBackground(
                Color.BLACK
        );
        super.paintComponent(graphics);
        shapes.forEach((shape) -> {
            shape.paint(graphics);
        });
    }
}
