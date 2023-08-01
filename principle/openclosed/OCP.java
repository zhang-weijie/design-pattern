package com.atguigu.principle.openclosed;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public class OCP{
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawCircle(new Circle());
        graphicEditor.drawTriangle(new Triangle());
    }
}

class GraphicEditor {
    //draw shapes of different types according to the received specified type
    public void drawShape(Shape s) {
        if (s.m_type == 1)
            drawRectangle(s);
        else if (s.m_type == 2)
            drawCircle(s);
        //add new conditional branch to follow the newly added class Triangle
        //==> against the open-closed principle, because modification from the user side isn't recommended
        else
            drawTriangle(s);
    }

    public void drawRectangle(Shape r) {
        System.out.println("draw a rectangle");
    }

    public void drawCircle(Shape r) {
        System.out.println("draw a circle");
    }

    //add new method drawTriangle to follow the newly added class Triangle
    //==> against the open-closed principle, because modification from the user side isn't recommended
    public void drawTriangle(Shape r){
        System.out.println("draw a triangle");
    }
}

class Shape {
    int m_type;
}

class Rectangle extends Shape {
    Rectangle() {
        super.m_type = 1;
    }
}

class Circle extends Shape {
    Circle() {
        super.m_type = 2;
    }
}

//add new class Triangle
class Triangle extends Shape {
    Triangle() {
        super.m_type = 3;
    }
}
