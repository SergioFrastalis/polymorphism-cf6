package gr.aueb.cf.ch15.homework;

public class Point {
        private double x;

        public Point() {}

        public Point(double x) {
            this.x =x ;

        }

        public double getX() {
            return x;
        }

        public void setX(double x) {
            this.x = x;
        }

        @Override
        public String toString() {
            return "Point{" +
                    "x=" + x +
                    '}';
        }

        public void movePlus10() {
            for (int i = 1; i <= 10; i++) {
                movePlus10();
            }
        }

        protected void movePlusOne() {
            x++;
        }

        protected void printTypeOf() {
            System.out.println(this.getClass().getSimpleName());
        }

        private void reset() {
            x = 0;
        }

        public double getDistanceFromOrigin(){
            return Math.abs(x);
        }



}
