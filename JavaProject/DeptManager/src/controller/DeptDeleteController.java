package controller;

import java.util.List;

import dao.DeptDao;
import domian.Dept;
import main.DeptManagerMain;
import service.DeptDeleteService;
import service.DeptListService;

public class DeptDeleteController implements Controller{

	DeptListService listService;
	DeptDeleteService deleteService;

	// 싱글톤 시작
	private DeptDeleteController() {
		this.listService = DeptListService.getInstance();
		this.deleteService = DeptDeleteService.getInstance();
	}

	private static DeptDeleteController controller = new DeptDeleteController();
	
	public static DeptDeleteController getInstance() {
		return controller;
	}
	// 싱글톤 끝
	
	public void process() {

		// 1. 사용자로부터 삭제할 부서번호를 받는다.
		// 부서의 전체 리스트를 출력하고 번호 입력 요청
		int deptno = getDeptno();
		
		// 2. 부서번호를 Service에 전달해서 삭제요청 -> 삭제 결과 반환 ( 0 or 1 )
		int result = deleteService.deleteDept(deptno);
		
		// 3. 삭제 후 결과 데이터에 따라 결과 화면 생성
		printData(result);
	
	}

	private void printData(int result) {
		if(result > 0) {
			System.out.println("삭제되었습니다.\n");
		} else {
			System.out.println("삭제할 대상 부서가 존재하지 않습니다.\n");
		}
	}
	
	
	private int getDeptno() {
		int deptno = 0;

		System.out.println("부서 정보 삭제가 진행됩니다.");

		// 전체 리스트 출력
		List<Dept> list = listService.getDeptList();
		for (Dept d : list) {
			System.out.println(d);

		}
		
		System.out.println("삭제하고자 하는 부서번호를 입력해주세요.>>");
		deptno = Integer.parseInt(DeptManagerMain.sc.nextLine());
		
		return deptno;
		
		
	}
	
	public static void main(String[] args) {
		DeptDeleteController controller = new DeptDeleteController();
		
		int deptno = controller.getDeptno();
		System.out.println("결과 : " + deptno);
	}
}
