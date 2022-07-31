package ru.synergy;

//ПСЕВДОКОД
/*
class ИмяКласса {
    типПоля1 имяПоля1; //имяПеременной1
    типПоля2 имяПоля2; //имяПеременной2

    типРезультата1 имяМетода1(параметрыМетода1) {
        //телоМетода1
    }

    типРезультата2 имяМетода2(параметрыМетода2) {
        //телоМетода2
    }
}*/
public class Rect {
    public Rect rect;
    public String nameOfRect;
    public boolean getArea;
    double width;
    double height;

    public double getArea() {
        return width*height;
    }

    void maignify(double koeff){
        width *= koeff;
        height *= koeff;
    }

    @Override
    public String toString() {
        return "Rect{" +
                "nameOfRect='" + nameOfRect + '\'' +
                ", width=" + width +
                ", height=" + height +
                '}';
    }

}

