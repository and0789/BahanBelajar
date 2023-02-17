package org.itc.exercise08;

import java.util.ArrayList;
import java.util.Scanner;

public class AplikasiNilaiVersi2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // get number of students and subjects
        System.out.print("Inputkan jumlah siswa: ");
        int numStudents = input.nextInt();
        System.out.print("Inputkan jumlah mata pelajaran: ");
        int numSubjects = input.nextInt();

        // create array to store subject names
        ArrayList<String> subjects = new ArrayList<String>();
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Input mata pelajaran ke " + i + ": ");
            String subject = input.next();
            subjects.add(subject);
        }

        // create array to store student data and scores
        ArrayList<ArrayList<Object>> students = new ArrayList<ArrayList<Object>>();
        for (int i = 1; i <= numStudents; i++) {
            ArrayList<Object> student = new ArrayList<Object>();
            System.out.print("Input nama siswa ke " + i + ": ");
            String name = input.next();
            student.add(name);
            for (String subject : subjects) {
                System.out.print("Input nilai " + subject + ": ");
                int score = input.nextInt();
                student.add(score);
            }
            students.add(student);
        }

        // add column for average and index
        for (ArrayList<Object> student : students) {
            int total = 0;
            for (int i = 1; i < student.size(); i++) {
                total += (int) student.get(i);
            }
            double average = total / (double) numSubjects;
            student.add(average);
            String index;
            if (average >= 80) {
                index = "A";
            } else if (average >= 70) {
                index = "B";
            } else if (average >= 60) {
                index = "C";
            } else {
                index = "D";
            }
            student.add(index);
        }

        // add column for status
        for (ArrayList<Object> student : students) {
            String status;
            if ((double) student.get(student.size() - 2) >= 80) {
                status = "Lulus dengan Pujian";
            } else {
                status = "Lulus";
            }
            student.add(status);
        }

        // print table header
        System.out.print("No | Nama Siswa");
        for (String subject : subjects) {
            System.out.print(" | " + subject);
        }
        System.out.println(" | Rata-rata | Index | Keterangan");

        // print student data and scores
        for (int i = 0; i < students.size(); i++) {
            ArrayList<Object> student = students.get(i);
            System.out.print((i + 1) + " | " + student.get(0));
            for (int j = 1; j < numSubjects + 1; j++) {
                System.out.print(" | " + student.get(j));
            }
            System.out.printf(" | %.2f | %s | %s\n", (double) student.get(student.size() - 3),
                    student.get(student.size() - 2), student.get(student.size() - 1));
        }
    }
}
