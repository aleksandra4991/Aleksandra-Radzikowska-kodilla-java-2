package com.kodilla.testing.shape;

import java.util.ArrayList;


    public class ShapeCollector {

        private Shape shape;
        private ArrayList<Shape> shapes=new ArrayList<Shape>();

        public ArrayList<Shape> getShapes() {
            return shapes;
        }

        public ShapeCollector(Shape shape) {
            this.shape = shape;
        }

        public void addShape(Shape shape){
            Shape triangle1=new Triangle(8,5);
            ShapeCollector shapeCollector = new ShapeCollector(triangle1);
            shapes.add(triangle1);
        }

        public int getShapesQuantity(){
            return shapes.size();
        }

        public boolean removeShape(Shape shape){
            boolean result = false;
            Shape triangle1=new Triangle(8,5);
            if(shapes.contains(triangle1)){
                shapes.remove(triangle1);
                result = true;
            }
            return result;
        }

        public Shape getShape(int n){
            Shape triangle = null;
            if(n>=0&&n<shapes.size()){
                triangle = shapes.get(n);
            }
            return triangle;


        }

        public ArrayList<Shape> showFigures(ArrayList<Shape>shapes){
            return shapes;
        }

    }


