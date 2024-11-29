package org.example;

import java.util.ArrayList;
import java.util.List;

public class VarB {
    public static class Polynomial {
        private int[] coefficients;

        public Polynomial(int[] coefficients) {
            this.coefficients = coefficients;
        }

        public Polynomial add(Polynomial other) {
            int maxDegree = Math.max(this.coefficients.length, other.coefficients.length);
            int[] result = new int[maxDegree];
            for (int i = 0; i < maxDegree; i++) {
                int thisCoeff = i < this.coefficients.length ? this.coefficients[i] : 0;
                int otherCoeff = i < other.coefficients.length ? other.coefficients[i] : 0;
                result[i] = thisCoeff + otherCoeff;
            }
            return new Polynomial(result);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (int i = coefficients.length - 1; i >= 0; i--) {
                if (coefficients[i] != 0) {
                    sb.append(coefficients[i]).append("x^").append(i).append(" + ");
                }
            }
            return sb.length() > 3 ? sb.substring(0, sb.length() - 3) : "0";
        }
    }

    public static Polynomial sumOfPolynomials(List<Polynomial> polynomials) {
        Polynomial result = new Polynomial(new int[0]);
        for (Polynomial poly : polynomials) {
            result = result.add(poly);
        }
        return result;
    }
}
