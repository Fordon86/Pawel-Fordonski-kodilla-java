package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {

    @Test
    public void addFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        shapeCollector.addFigure(new Circle());
        //Then
        Assert.assertTrue("Circle".equals(shapeCollector.showFigures()));
        //When
        shapeCollector.addFigure(new Circle());
        //Then
        Assert.assertTrue("CircleCircle".equals(shapeCollector.showFigures()));
        //When
        shapeCollector.addFigure(new Square());
        //Then
        Assert.assertTrue("CircleCircleSquare".equals(shapeCollector.showFigures()));
    }

    @Test
    public void removeFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle();
        Square square = new Square();
        Triangle triangle = new Triangle();
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);
        //When
        shapeCollector.removeFigure(circle);
        //Then
        Assert.assertTrue("SquareTriangle".equals(shapeCollector.showFigures()));
        //When
        shapeCollector.removeFigure(triangle);
        //Then
        Assert.assertTrue("Square".equals(shapeCollector.showFigures()));
    }

    @Test
    public void getFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(new Circle());
        shapeCollector.addFigure(new Square());
        shapeCollector.addFigure(new Triangle());
        //When
        Shape shape = shapeCollector.getFigure(1);
        //Then
        Assert.assertTrue("Square".equals(shape.getShapeName()));
        //When
        shape = shapeCollector.getFigure(2);
        //Then
        Assert.assertTrue("Triangle".equals(shape.getShapeName()));
    }

}

