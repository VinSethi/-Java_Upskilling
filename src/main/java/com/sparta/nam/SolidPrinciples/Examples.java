//package com.sparta.nam.SolidPrinciples;
//
//public class Examples {
//    // S- Single Responsibility principle
//    // Bad Example
//    class Report {
//        public String generateReport() {
//            return "Report content";
//        }
//
//        public void saveToFile(String content) {
//            // file handling logic
//        }
//        // Report is currently Generating and Saving= 2 Responsibilites. Fix= Seperate into two different classes
//    }
//
//    // O= Open/Close principle
//    class AreaCalculator {
//        public double calculate(Object shape) {
//            if (shape instanceof Circle) {
//                Circle c = (Circle) shape;
//                return Math.PI * c.radius * c.radius;
//            } else if (shape instanceof Rectangle) {
//                Rectangle r = (Rectangle) shape;
//                return r.length * r.width;
//            }
//            return 0;
//        }
//
//        // Problem= Every time we add a new shape, we must modify this class. Fix= Create an interface Shape, then create a new class for each shape that implements the interface shape. That was we do not have to touch the AreaCalculator class.
//    }
//
//    // L- Liskov Substitution principle
//    class Bird {
//        void fly() { System.out.println("Flying..."); }
//    }
//
//    class Ostrich extends Bird {
//        @Override
//        void fly() { throw new UnsupportedOperationException("Ostriches can't fly!"); }
//    }
//    //Problem= Ostritch class violates the LSP as it breaks the behaviour expectations. Fix= Implement an eat method in the bird() class. Only use the eat() method and not Override the fly() method in the Ostritch class. i.e Don't use
//    // a method that doesn't meet behaviour expectations.
//
//
//    //I- Interface Segregation Principle
//    interface Machine {
//        void print();
//        void scan();
//        void fax();
//    }
//
//    class Printer implements Machine {
//        public void print() { System.out.println("Printing..."); }
//        public void scan() { /* Not supported */ }
//        public void fax() { /* Not supported */ }
//    }
//    // Problem= Printer is forced to implement unused methods. Fix= Get rid of methods that are of no use for that class.
//
//    // D- Dependency Inversion Principle
//    class MySQLDatabase {
//        void connect() { System.out.println("Connecting to MySQL"); }
//    }
//
//    class UserService {
//        private MySQLDatabase db = new MySQLDatabase(); // tightly coupled
//        void process() { db.connect(); }
//    }
//    // Problem= If we want to switch to PostgresDatabase, we must modify UserService. Fix= Create an interface Database, then each class implements Database, e.g. class MySQLDatabase implements Database.
//    // UserService now depends on Database abstraction, not a specific implementation.
//    // We can inject any database (MySQL, Postgres, etc.) via constructor
//
//
//
//}
