package com.edu.qdu.game;

import java.util.Scanner;

public class Judge {
	//��������
	private int total;
	private Person person;
	private Computer computer;
	//���巽��
	public void startGame(){
		System.out.println("\t\t*******************");
		System.out.println("\t\t**    ��ȭ��Ϸ         **");
		System.out.println("\t\t*******************");
		System.out.println();
		System.out.println("��Ϸ����1������1��ʯͷ3����");
	}
	public String askName(String myName){
		return myName;
	}
	public void playGame(int fist){
		
	}
	public void finalResult(){
		
	}
	//��װ
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public Computer getComputer() {
		return computer;
	}
	public void setComputer(Computer computer) {
		this.computer = computer;
	}
	
	public static void main(String[] args) {
		String myName;
		Scanner input = new Scanner(System.in);
		Judge game = new Judge();
		game.startGame();
		System.out.println("��ѡ��Է���ɫ��1������   2����Ȩ   3���ܲ٣���");
		int sel = input.nextInt();
		switch (sel) {
		case 1:
			
			break;
		case 2:
			
			break;
		case 3:
			
			break;

		default:
			break;
		}
		System.out.println("���������������");
		String name = input.next();
		game.person.inputName(name);
		System.out.println(name+"vs");
	}
}
