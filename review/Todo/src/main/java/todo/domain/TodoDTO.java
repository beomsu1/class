package todo.domain;

public class TodoDTO {

	private int tno;
	private String todo;
	private String duedate;
	private String finished;
	
	public TodoDTO() {
		
	}
	
	public TodoDTO(int tno, String todo, String duedate, String finished) {
		this.tno = tno;
		this.todo = todo;
		this.duedate = duedate;
		this.finished = finished;
	}

	public int getTno() {
		return tno;
	}

	public void setTno(int tno) {
		this.tno = tno;
	}

	public String getTodo() {
		return todo;
	}

	public void setTodo(String todo) {
		this.todo = todo;
	}

	public String getDuedate() {
		return duedate;
	}

	public void setDuedate(String duedate) {
		this.duedate = duedate;
	}

	public String getFinished() {
		return finished;
	}

	public void setFinished(String finished) {
		this.finished = finished;
	}

	@Override
	public String toString() {
		return "TodoDTO [tno=" + tno + ", todo=" + todo + ", duedate=" + duedate + ", finished=" + finished + "]";
	}
	
}
