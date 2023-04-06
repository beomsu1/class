package chapter11;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class SmartPhone implements Comparable<SmartPhone> {

	private String name;
	private String phoneNumber;

	public SmartPhone(String name, String phoneNumber) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "SmartPhone [name=" + name + ", phoneNumber=" + phoneNumber + "]";
	}

	@Override
	public int hashCode() {
		// 010-1716-1764 -> (0 1 2 3 4 5 6 7 8 9) 10가지
		return this.phoneNumber.charAt(phoneNumber.length() - 1 % 5); // 0 1 2 3 4
	}

	@Override
	public boolean equals(Object obj) {

		boolean result = false;

		if (obj != null && obj instanceof SmartPhone) {
			SmartPhone sp = (SmartPhone) obj;
			result = phoneNumber.equals(sp.getPhoneNumber());
		}

		return result;
	}

	@Override
	public int compareTo(SmartPhone o) {
		return name.compareTo(o.getName()); // *-1을 하면 내림차순으로 정렬
	}

	public static void main(String[] args) {

		Set<SmartPhone> phones = new HashSet<>();

		phones.add(new SmartPhone("손흥민", "010-1467-8743"));
		phones.add(new SmartPhone("박지성", "010-3474-2198"));
		phones.add(new SmartPhone("차범근", "010-2467-8743"));

//		for(SmartPhone sp : phones) {
//			System.out.println(sp);
//		}
		phones.stream().sorted().forEach(System.out::println);
		phones.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

	}

}
