package chapter06;

public class Student {
	
	private String name;
	private int korScore;
	private int engScore;
	private int mathScore;
	
	public Student(String name, int korScore, int engScore, int mathScore) {
		super();
		this.name = name;
		this.korScore = korScore;
		this.engScore = engScore;
		this.mathScore = mathScore;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKorScore() {
		return korScore;
	}

	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}

	public int getEngScore() {
		return engScore;
	}

	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}

	public int getMathScore() {
		return mathScore;
	}

	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}

	@Override
	public String toString() {
//		return "시험성적 [name=" + name + ", korScore=" + korScore + ", engScore=" + engScore + ", mathScore="
//				+ mathScore + ", 합계=" + sum() + ", 평균=" + avg() + "]";
		return result();
	}
	
	private int sum() {
		return korScore + engScore + mathScore;
	}
	
	private float avg() {
		return sum()/3f;
	}
	
	private String result() {
		return name+"\t"+korScore+"\t"+engScore+"\t"+mathScore+"\t"+sum()+"\t"+avg();

	}
	
}
