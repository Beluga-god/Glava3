package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class VarA {
    public static class Abiturient {
        private int id;
        private String lastName;
        private String firstName;
        private String middleName;
        private String address;
        private String phone;
        private int[] grades;

        public Abiturient(int id, String lastName, String firstName, String middleName, String address, String phone, int[] grades) {
            this.id = id;
            this.lastName = lastName;
            this.firstName = firstName;
            this.middleName = middleName;
            this.address = address;
            this.phone = phone;
            this.grades = grades;
        }

        public int getTotalScore() {
            int sum = 0;
            for (int grade : grades) {
                sum += grade;
            }
            return sum;
        }

        public boolean hasUnsatisfactoryGrades() {
            for (int grade : grades) {
                if (grade < 3) return true;
            }
            return false;
        }

        @Override
        public String toString() {
            return "Абитуриент{" +
                    "id=" + id +
                    ", Фамилия='" + lastName + '\'' +
                    ", Имя='" + firstName + '\'' +
                    ", Отчество='" + middleName + '\'' +
                    ", Адрес='" + address + '\'' +
                    ", Телефон='" + phone + '\'' +
                    ", Общий балл=" + getTotalScore() +
                    '}';
        }
    }

    public static List<Abiturient> getTopAbiturients(List<Abiturient> abiturients, int n) {
        return abiturients.stream()
                .sorted(Comparator.comparingInt(Abiturient::getTotalScore).reversed())
                .limit(n)
                .toList();
    }

    public static void printAbiturientsWithCondition(List<Abiturient> abiturients, String condition, int threshold) {
        switch (condition) {
            case "unsatisfactory" -> abiturients.stream()
                    .filter(Abiturient::hasUnsatisfactoryGrades)
                    .forEach(System.out::println);
            case "above" -> abiturients.stream()
                    .filter(a -> a.getTotalScore() > threshold)
                    .forEach(System.out::println);
            default -> System.out.println("Некорректное условие.");
        }
    }
}
