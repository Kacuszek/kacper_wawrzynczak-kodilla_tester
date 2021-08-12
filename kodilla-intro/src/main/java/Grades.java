public class Grades {
    private int[] grades;
    private int size;
    private int value;
    public Grades() {
        this.grades = new int[10];
        this.size = 0;
        this.value = value;
    }
    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }
    public void getTheNewestValue() {
        int theNewestValue = grades[size - 1];
            return theNewestValue;
    }
    public double averageGrades() {
         int result = 0;
        for(int i = 0; i < grades.length; i++) {
           result = result + grades[i];
        }
        return result / grades.length;
    }
}
