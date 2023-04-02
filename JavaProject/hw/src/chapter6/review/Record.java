package chapter6.review;

public class Record {

	int korScore;
	int engScore;
	int mathScore;
	
	public Record(int korScore, int engScore, int mathScore) {
		super();
		this.korScore = korScore;
		this.engScore = engScore;
		this.mathScore = mathScore;
	}
	
	public float avg(){
		return korScore + engScore + mathScore / 3f;
	}

	@Override
	public String toString() {
		return "성적 [국어점수=" + korScore + ", 영어점수=" + engScore + ", 수학점수=" + mathScore + ", 평균=" + avg() + "]";
	}
	
	public static void main(String[] args) {
		
		Record[] record = new Record[10];
		record[0] = new Record(100,90,80);
		record[1] = new Record(100,90,80);
		record[2] = new Record(100,90,80);
		record[3] = new Record(100,90,80);
		record[4] = new Record(100,90,80);
		record[5] = new Record(100,90,80);
		record[6] = new Record(100,90,80);
		record[7] = new Record(100,90,80);
		record[8] = new Record(100,90,80);
		record[9] = new Record(100,90,80);
		
		for(int i=0 ; i<record.length; i++) {
			System.out.println(record[i]);
		}
		
	}
	
}
