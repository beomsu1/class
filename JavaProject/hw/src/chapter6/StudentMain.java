package chapter6;

public class StudentMain {

	public static void main(String[] args) {

		Student[] students = new Student[10];
		students[0] = new Student("son01", 100, 40, 40);
		students[1] = new Student("son02", 50, 50, 30);
		students[2] = new Student("son03", 60, 60, 20);
		students[3] = new Student("son04", 70, 70, 90);
		students[4] = new Student("son05", 80, 80, 80);
		students[5] = new Student("son06", 90, 90, 70);
		students[6] = new Student("son07", 100, 40, 60);
		students[7] = new Student("son08", 90, 50, 50);
		students[8] = new Student("son09", 80, 60, 40);
		students[9] = new Student("son10", 70, 70, 30);

		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}

	}
}