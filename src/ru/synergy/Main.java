package ru.synergy;

public class Main {

    public static void main(String[] args) {

        Rect rect = new Rect();
        rect.height =10;
        rect.width = 15;
        rect.nameOfRect = "In rect";

        Rect rect1 = new Rect();
        rect1.height = 5;
        rect1.width = 25;
        rect1.nameOfRect = "In rect1";

        Rect rect2 = new Rect();
        rect2.height =1;
        rect2.width = 2;
        rect2.nameOfRect = "In rect2";


//        System.out.println(rect == rect1);
//        System.out.println(rect1);
//        rect1 = rect;

//        System.out.println(rect.getArea());
//        System.out.println(rect1.getArea());
//        System.out.println(rect2.getArea());
//
//        rect2.maignify(1.5);
//        System.out.println(rect2.getArea());
        
//        Point point1 = new Point();
//        Point point2 = new Point();
//
//        point1.input();
//        System.out.println(point1);
//
//        point2.input();
//        System.out.println(point2);
//
//        System.out.println(point1.getDistance(point2));
//
//        System.out.println("Start moving the point1");
//        point1.move( 100,  120);
//        System.out.println(point1);
//
//
//        System.out.println(point1.getDistance(point2));


        Double number = Double.valueOf(10.0);
        double numverCopy = number.doubleValue();
        number.toString();
        String a = "156";
        Integer integer = Integer.parseInt(a);



    }


}
