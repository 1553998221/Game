package com.edu.qdu.game;

public abstract class Player {
	
	//��������
	private String PlayerName;//�������
	private int winningTimes;//��ʤ����
	//���巽��
	public abstract String inputName(String name);//��������
	public abstract int myFist(int num);//��ȭ
	//��װ
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
