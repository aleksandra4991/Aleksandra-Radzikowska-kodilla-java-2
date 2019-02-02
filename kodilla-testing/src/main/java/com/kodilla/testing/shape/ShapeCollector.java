package com.kodilla.testing.shape;

import java.util.ArrayList;


    public class ShapeCollector {


        private ArrayList<Shape> shapes=new ArrayList<Shape>();

        public ArrayList<Shape> getShapes() {
            return shapes;
        }



        public void addShape(Shape shape){
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

        public ArrayList<Shape> showFigures(ArrayList<Shape>shapes) {
            return shapes;
        }
    }


