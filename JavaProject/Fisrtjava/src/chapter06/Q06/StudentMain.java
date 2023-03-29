package chapter06.Q06;

public class StudentMain {

	public static void main(String[] args) {

		
		Student[] student = new Student[10];
		
		student[0] = new Student("조현우" , 70 , 80 , 90);
		student[1] = new Student("이기제" , 90 , 100 ,95);
		student[2] = new Student("김민재" , 80 , 50 ,70);
		student[3] = new Student("김영권" , 85 , 75 ,65);
		student[4] = new Student("황인범" , 100 , 100 ,100);
		student[5] = new Student("정우영" , 80 , 77 ,85);
		student[6] = new Student("이강인" , 80 , 87 ,90);
		student[7] = new Student("이재성" , 70 , 88 ,64);
		student[8] = new Student("손흥민" , 70 , 74 ,80);
		student[9] = new Student("황의조" , 37 , 50 ,55);
		
		for (int i = 0 ; i<student.length; i++) {
			System.out.println(student[i]);
		}
			
	}

}
