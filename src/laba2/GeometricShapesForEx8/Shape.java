package laba2.GeometricShapesForEx8;

public abstract class Shape {

        protected String name;

        protected Shape(String namer) {
            this.name  = name;
        }


        public String getName() {
            return name;
        }


        public abstract double area();

        public abstract double perimeter();

    }
