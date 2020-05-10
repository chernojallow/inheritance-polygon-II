package com.galvanize.geometric;

public class Polygon {

    int sideLengths[];
    int numSides;

    public Polygon(){};

    public Polygon(int sideLength[]) {
        this.sideLengths = sideLength;
        numSides = sideLength.length;
    }

    public int perimeter(){
        //compute perimeter
        int sum = 0;
        for(int i = 0; i <sideLengths.length; i++){
            sum+=sideLengths[i];
        }
        return sum;
    }

   public  class Triangle extends Polygon {

        public Triangle(int [] length){
            super(length);
            numSides = 3;
        }

        public Triangle(){
            this(new int[3]);
        }

        public double area(){
            double a = perimeter()/2;

            // Herons formula
            return Math.sqrt(a*(a- sideLengths[0])*(a- sideLengths[1])*(a - sideLengths[2]));
        }

       public class Rectangle extends Polygon {

            public double area(){
            return sideLengths[0] * sideLengths[1];

              }
          }

       public class Square extends Rectangle {
           @Override
           public double area() {
               return sideLengths[0] * sideLengths[0];
           }
       }

       public class Equilateral extends Polygon {
            public double area(){
                return (Math.sqrt(3)/4)*(sideLengths[1] *sideLengths[1]);

            }
        }

        public class Scalene extends  Polygon {

            public double area() {
            int p = perimeter();

            //Area = square root [s (s - a) (s - b) (s - c)]
          return Math.sqrt(p*(p-sideLengths[1])*(p- sideLengths[1])*(p - sideLengths[2]));
            }

           }

       }

}