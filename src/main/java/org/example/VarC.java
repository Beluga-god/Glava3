package org.example;

import java.util.ArrayList;
import java.util.List;

public class VarC {
    public static class Fraction {
        private Complex numerator;
        private Complex denominator;

        public Fraction(Complex numerator, Complex denominator) {
            this.numerator = numerator;
            this.denominator = denominator;
        }

        @Override
        public String toString() {
            return numerator + " / " + denominator;
        }

        public void add(Fraction other) {
            this.numerator = this.numerator.add(other.numerator);
            this.denominator = this.denominator.add(other.denominator);
        }
    }

    public static class Complex {
        private double real;
        private double imaginary;

        public Complex(double real, double imaginary) {
            this.real = real;
            this.imaginary = imaginary;
        }

        public Complex add(Complex other) {
            return new Complex(this.real + other.real, this.imaginary + other.imaginary);
        }

        @Override
        public String toString() {
            return real + " + " + imaginary + "i";
        }
    }

    public static void modifyEvenIndexedFractions(List<Fraction> fractions) {
        for (int i = 0; i < fractions.size() - 1; i += 2) {
            fractions.get(i).add(fractions.get(i + 1));
        }
    }
}
