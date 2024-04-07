public class Main {
    public static void main(String[] args) {

    }

    public static void average() {
        Student st = new Student();
        st.grades = new double[]{2, 2.5, 3, 3.5, 4, 4.5, 5};
        double srednia = 0;
        double ocena = 0;

        for (int i = 0; i < st.grades.length; i++) {
            srednia += st.grades[i];
        }
        srednia /= st.grades.length;

        if (srednia < 2) {
            ocena = 2;
        } else if (srednia < 2.5) {
            ocena = 2.5;
        } else if (srednia < 3) {
            ocena = 3;
        } else if (srednia < 3.5) {
            ocena = 3.5;
        } else if (srednia < 4) {
            ocena = 4;
        } else if (srednia < 4.5) {
            ocena = 4.5;
        } else {
            ocena = 5;
        }
    }
}


