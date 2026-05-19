public class StudentTracker {
    String name;
    int[] scores;

    StudentTracker(String name, int[] scores) {
        this.name = name;
        this.scores = scores;

    }

    double average() {
        int sum = 0;
        for (int score : scores) {
            sum = sum + score;
        }
        return sum / 5;
    }

    double gpa() {
        if (average() >= 90) {
            
        return 4.0; }
        else if (average() >= 80) {
            return 3.0;
        }
        else if (average() >= 70) {
            return 2.0;
        }
        else {return 1.0;}
    }
      String grade() {
        if (average() >= 90) {
            return "A";
        }
        else if (average() >= 80) {
            return "B";
        }
        else if (average() >= 70) {
            return "C";
        }
        else if (average() >= 60) {
            return "D";
        }
        else {return "F";}

      }
      public void showReport() {
        System.out.println(name);
        System.out.println(average());
        System.out.println(gpa());
        System.out.println(grade());
      }
        

}
