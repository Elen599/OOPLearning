package ru.synergy.constructorTest;

public class Main {

    public static void main(String[] args) {
        Fraction fr = new Fraction(1, 2);
        fr.add1ToNumerator().add1ToNumerator().add1ToNumerator().add1ToNumerator();

        Person oleg = new Person ();
    }
}

class Fraction {
    private int numerator; // числитель
    private int denominator; // знаменатель

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            System.out.println("Denominator can't be zero);
            ;return;
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction add1ToNumerator() {
        this.numerator++;
        return this;
    }

    public Fraction getObjectCurrent() {
        return this;
    }

    class Person {
        private String firstName;
        private String lastName;
        private char gender; //  m - male,  f -female

        public Person(){
            this(" ", " ", "+");
        }

        public Person (String lastName){
            this(lastName, "", "+");
        }

        public Person (String lastName, String firstName, char gender){
            this(lastName, firstName);
            this.gender = gender;

        }
        public Person(String lastName, String firstName){
            this.firstName = firstName;
            this.lastName = lastName;
        }


    }


}