package com.edu.qdu.game;

import java.util.Scanner;

public class Judge {
	//定义属性
	private int total;
	private Person person;
	private Computer computer;
	//定义方法
	public void startGame(){
		System.out.println("\t\t*******************");
		System.out.println("\t\t**    猜拳游戏         **");
		System.out.println("\t\t*******************");
		System.out.println();
		System.out.println("游戏规则：1、剪刀1、石头3、布");
	}
	public String askName(String myName){
		return myName;
	}
	public void playGame(int fist){
		
	}
	public void finalResult(){
		
	}
	//封装
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
		System.out.println("请选择对方角色（1、刘备   2、孙权   3、曹操）：");
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
		System.out.println("请输入你的姓名：");
		String name = input.next();
		game.person.inputName(name);
		System.out.println(name+"vs");
	}
}
