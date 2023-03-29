package chapter5;

import java.util.Scanner;

public class Contact {

	private String name;
	private String phoneNumber;
	private String email;
	private String address;
	private String birthday;
	private String group;
	
	
	public Contact(String name, String phoneNumber, String email, String address, String birthday, String group) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.address = address;
		this.birthday = birthday;
		this.group = group;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}
	
	public void printSimpleInfo() {
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phoneNumber);
	}
	public void printInfo() {
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phoneNumber);
		System.out.println("이메일 : " + email);
		System.out.println("주소 : " + address);
		System.out.println("생일 : " + birthday);
		System.out.println("그룹 : " + group);
	}
	/*
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("정보를 입력하세요 :");
		
		System.out.println("이름 : " );
		String name = in.nextLine();
		
		System.out.println("전화번호 : " );
		String phoneNumber = in.nextLine();
		
		System.out.println("이메일 : " );
		String email = in.nextLine();
		
		System.out.println("주소 : " );
		String address = in.nextLine();
		
		System.out.println("생일 : " );
		String birthday = in.nextLine();
		
		System.out.println("그룹 : " );
		String group = in.nextLine();
		
		Contact c = new Contact(name, phoneNumber, email, address, birthday, group);
		
		c.printSimpleInfo();
		System.out.println();
		c.printInfo();
		
	} */
}
