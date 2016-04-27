package com.edu.qdu.game;

public abstract class Player {
	
	//定义属性
	private String PlayerName;//玩家姓名
	private int winningTimes;//获胜次数
	//定义方法
	public abstract String inputName(String name);//输入姓名
	public abstract int myFist(int num);//出拳
	//封装
	public String getPlayerName() {
		return PlayerName;
	}
	public void setPlayerName(String playerName) {
		PlayerName = playerName;
	}
	public int getWinningTimes() {
		return winningTimes;
	}
	public void setWinningTimes(int winningTimes) {
		this.winningTimes = winningTimes;
	}
	
}
