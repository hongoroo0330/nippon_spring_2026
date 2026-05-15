
public class StudentsGrades {
    static String letterGrade(int score) {
        if (score >= 90 && score <= 100) {
            return "A";

        } else if (score >= 80 && score < 90) {
            return "B";
        } else if (score >= 70 && score < 80) {
            return "C";
        } else if (score >= 60 && score < 70) {
            return "D";

        } else {
            return "F";
        }

    }

    static double classAverege(int[] scores) {
        int sum = 0;
        for (int score : scores) {
            sum = sum + score;
        }

        return (double) sum / scores.length;
    }

    static int topScore(int[] scores) {
        int max = scores[0];
        for (int score : scores) {
            if (score > max) {
                max = score;
            }

        }
        return max;
    }

    static int countPassing(int[] scores) {
        int count = 0;
        for (int score : scores) {
            if (score >= 60) {
                count++;
            }

        }
        return count;
    }

    static void printReport(int[] scores) {
        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "." + scores[i] + "→ " + letterGrade(scores[i]));
        }
    }

    public static void main(String[] args) {
        int[] scores = { 85, 92, 67, 78, 55 };
        System.out.println("===== Оюутны Дүн =====");

        printReport(scores);

        System.out.println(" Дундаж: " + classAverege(scores));
        System.out.println(" Хамгийн өндөр: " + topScore(scores));
        System.out.println(" Тэнцсэн: " + countPassing(scores));
        System.out.println("======================");

    }

}
