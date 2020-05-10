package com.galvanize.geometric;

public class Polygon {

    int sideLengths[] = new int[100];
    int numSides = 0;

    public Polygon() {
    }

    public Polygon(int sideLength[]) {
        this.sideLengths = sideLength;
        numSides = sideLength.length;
      }

    public int perimeter() {
        //compute perimeter
        int sum = 0;
        for (int i = 0; i < sideLengths.length; i++) {
            sum += sideLengths[i];
        }
        return sum;
    }


//    public static void main (String [] args){
//
//        Polygon polygon = new Polygon();
//        System.out.println(polygon.perimeter());
//
//        int s [] = new int[20];
//        Triangle  triangle = new Triangle(s) ;
//           System.out.println(triangle.area());
//     }
}


     class Triangle extends Polygon {

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
            return Math.sqrt(a*(a- sideLengths[2])*(a- sideLengths[3])*(a - sideLengths[5]));
        }

        class Rectangle extends Polygon {

            public double area(){
            return sideLengths[0] * sideLengths[1];

              }
          }

        class Square extends Rectangle {
           @Override
           public double area() {
               return sideLengths[0] * sideLengths[0];
           }
       }

        class Equilateral extends Polygon {
            public double area(){
                return (Math.sqrt(3)/4)*(sideLengths[1] *sideLengths[1]);

            }
        }

         class Scalene extends  Polygon {

            public double area() {
            int p = perimeter();

            //Area = square root [s (s - a) (s - b) (s - c)]
            return Math.sqrt(p*(p-sideLengths[1])*(p- sideLengths[1])*(p - sideLengths[2]));
              }

           }

       }




