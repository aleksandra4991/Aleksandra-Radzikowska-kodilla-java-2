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
            ShapeCollector shapeCollector=new ShapeCollector(shape);
            shapes.add(shape);
        }

        public int getShapesQuantity(){
            return shapes.size();
        }

        public boolean removeShape(Shape shape){
            boolean result = false;
            if(shapes.contains(shape)){
                shapes.remove(shape);
                result = true;
            }
            return result;
        }

        public Shape getShape(int n){
            Shape shape = null;
            if(n>=0&&n<shapes.size()){
                shape = shapes.get(n);
            }
            return shape;
        }

        public Shape showFigures(ArrayList<Shape>shapes) {
            for (int i = 0; i < shapes.size(); i++) {
            }
            return shape;
        }
    }


