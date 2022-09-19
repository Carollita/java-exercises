package br.com.letscode.java;

public class ConditionalStructures {
    public static void main(String[] args) throws Exception {
        // A = 80-100
        // B = 70-79
        // C = 60-69
        // D = 0-59

        int percentageGrade = 80;
        String letterGrade;

        if (percentageGrade >= 80) {
            letterGrade = "A";
        } 
        else if (percentageGrade < 80 && percentageGrade >= 70) {
            letterGrade = "B";
        } 
        else if (percentageGrade < 70 && percentageGrade >= 60) {
            letterGrade = "C";
        }
        else if (percentageGrade < 60 && percentageGrade >= 0) {
            letterGrade = "D";
        }
        else {
            letterGrade = "";
        }

        switch (letterGrade) {
            case "A":
            case "B":
                System.out.println("APROVADO(A)!");
                break;
            case "C":
            case "D":
                System.out.println("REPROVADO(A)!");
                break;
            default:
                System.out.println("Graduação inválida.");
        }
    }
} 