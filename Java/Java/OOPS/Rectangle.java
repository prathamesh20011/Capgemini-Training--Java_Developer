

// public class InterfaceShape implements Shape  {
    
    

    // public class Circle implements Shape{

    //     private double radius;

    //     Circle(double radius){
    //         this.radius = radius;
    //     }

    //     public double getArea(){
    //         double area = 3.14 * radius * radius;
    //         return area;
    //     }
    // }

    public class Rectangle implements Shape{

        private int length;
        private int breadth;

        Rectangle(int length, int breadth){
            this.length = length;
            this.breadth = breadth;
        }

        public double getArea(){
            return length * breadth;
        }
    }
// }


