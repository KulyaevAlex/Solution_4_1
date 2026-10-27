package org.example;

public class Student {
    private String name;
    private int age;
    private double averageScore;
    private String group;

    public Student(String name, int age, double averageScore, String group) {
        this.name = name;
        this.age = age;
        this.averageScore = averageScore;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * метод выводящий всю информацию о студенте
     */
    public void printInfo() {
        System.out.println("Имя: " + getName());
        System.out.println("Возраст: " + getAge());
        System.out.println("Средний балл: " + getAverageScore());
        System.out.println("Группа: " + getGroup());
    }

    /**
     * Метод, возвращающий информацию, является ли студент отличником (балл >= 4.5)
     *
     * @param student - Объект Студент
     * @return - true, если студент - отличник
     */
    public boolean isExcellent(Student student) {
        return student.getAverageScore() > 4.5;
    }

    /**
     * Метод проверки минимального возраста
     *
     * @param minimumAge - Минимальный возраст студента
     * @return - true если возраст не меньше минимального
     */
    public boolean canGraduate(int minimumAge) {
        return getAge() >= minimumAge;
    }
}
