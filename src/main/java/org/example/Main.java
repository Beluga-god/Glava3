package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Пример VarA
        List<VarA.Abiturient> abiturients = new ArrayList<>();
        abiturients.add(new VarA.Abiturient(1, "Иванов", "Данил", "Викторович", "Улан-удэ", "1234567890", new int[]{5, 4, 5}));
        abiturients.add(new VarA.Abiturient(2, "Тулаев", "Каспер", "Петрович", "Иркутск", "0987654321", new int[]{2, 2, 3}));

        System.out.println("Абитуриенты с неудовлетворительными оценками:");
        VarA.printAbiturientsWithCondition(abiturients, "unsatisfactory", 0);

        System.out.println("\nАбитуриенты с общей суммой баллов выше 10:");
        VarA.printAbiturientsWithCondition(abiturients, "above", 10);

        // Пример VarB
        List<VarB.Polynomial> polynomials = new ArrayList<>();
        polynomials.add(new VarB.Polynomial(new int[]{1, 2, 3}));
        polynomials.add(new VarB.Polynomial(new int[]{0, 1, 4}));

        System.out.println("\nСумма полиномов:");
        System.out.println(VarB.sumOfPolynomials(polynomials));

        // Пример VarC
        List<VarC.Fraction> fractions = new ArrayList<>();
        fractions.add(new VarC.Fraction(new VarC.Complex(1, 1), new VarC.Complex(2, 0)));
        fractions.add(new VarC.Fraction(new VarC.Complex(2, 2), new VarC.Complex(3, 0)));

        System.out.println("\nДо изменения дробей:");
        for (VarC.Fraction fraction : fractions) {
            System.out.println(fraction);
        }

        VarC.modifyEvenIndexedFractions(fractions);

        System.out.println("\nПосле изменения дробей:");
        for (VarC.Fraction fraction : fractions) {
            System.out.println(fraction);
        }
    }
}
