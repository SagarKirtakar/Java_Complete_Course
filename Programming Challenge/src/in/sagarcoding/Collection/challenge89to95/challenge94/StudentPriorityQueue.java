package in.sagarcoding.Collection.challenge89to95.challenge94;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

class StudentPriorityQueue {

    public static void main(String[] args) {

        PriorityQueue<Student> queue = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getGrade() -  o2.getGrade();
            }
        });

        queue.offer(new Student("Sagar", 'A'));
        queue.offer(new Student("Magan", 'D'));
        queue.offer(new Student("Juned", 'B'));
        queue.offer(new Student("Anil", 'A'));
        queue.offer(new Student("Kunal", 'C'));

        System.out.printf("Queue is %s", queue);
        System.out.printf("Got %s\n", queue.poll());
        System.out.printf("Got %s\n", queue.poll());
        System.out.printf("Got %s\n", queue.poll());
        System.out.printf("Got %s\n", queue.poll());
        System.out.printf("Got %s\n", queue.poll());
    }


    private static class Student {

        private final String name;
        private final char grade;

        public Student(String name, char grade) {
            this.name = name;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public char getGrade() {
            return grade;
        }

        @Override
        public String toString() {
            return name + ": " + grade;
        }
    }

}
