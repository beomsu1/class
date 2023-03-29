package chapter06.Q06;

public class Student {

	private String name;
	private int koreanScore;
	private int englishScore;
	private int mathScore;
	
	public Student(String name, int koreanScore, int englishScore, int mathScore) {
		this.name = name;
		this.koreanScore = koreanScore;
		this.englishScore = englishScore;
		this.mathScore = mathScore;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKoreanScore() {
		return koreanScore;
	}

	public void setKoreanScore(int koreanScore) {
		this.koreanScore = koreanScore;
	}

	public int getEnglishScore() {
		return englishScore;
	}

	public void setEnglishScore(int englishScore) {
		this.englishScore = englishScore;
	}

	public int getMathScore() {
		return mathScore;
	}

	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", koreanScore=" + koreanScore + ", englishScore=" + englishScore
				+ ", mathScore=" + mathScore + "]";
	}
	
	//총합 메소드
	
	public int sum() {
		int totalSum = koreanScore + englishScore + mathScore;
		
		return totalSum;
	}
	
	//평균 메소드

	public float avg() {
		float totalAvg =(float)(koreanScore + englishScore + mathScore /3);
		
		return totalAvg;
	}
}
