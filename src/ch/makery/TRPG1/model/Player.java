package ch.makery.TRPG1.model;

import java.util.ArrayList;
	//https://blog.naver.com/slrkanjsepdi/90160270727
public class Player {
	
	ArrayList inventory = new ArrayList();
	/*
	int[] inven = new int[50];
	int[] nofitem = new int[100];
	boolean[] itemexist = new boolean[50];
	int itemcursor = 0;
	*/
	String currentStage;
	int mhp;
	int hp;
	int mmp;
	int mp;
	int lv;
	int xp;	// ���� ����ġ
	int nxp;// �ʿ����ġ
	
	int stp;//��������Ʈ
	int str; //�ٷ�-���ݷ�
	int inte;//����-�������ݷ�
	int wis;//����-�������
	int agi;//��ø-ȸ��
	
	/*
	public Player(String currentStage,int mhp,int hp,int mmp,int mp, int lv, int xp, int nxp, int str,int inte, int wis,int agi,int[] inven,boolean[] itemexist) {
		this.itemexist = itemexist;
		this.inven = inven;
		this.currentStage = currentStage;
		this.mhp = mhp;
		this.hp = hp;
		this.mmp = mmp;
		this.mp = mp;
		this.lv = lv;
		this.xp = xp;
		this.nxp = nxp;
		this.str = str;
		this.inte = inte;
		this.wis = wis;
		this.agi = agi;	
	}
	*/
	
	public int atkDamage() {
		int totalDamage = 0;
		
		return totalDamage;
	}
	/*
	public Player(ArrayList inventory, int[] inven, int[] nofitem, boolean[] itemexist, int itemcursor,
			String currentStage, int mhp, int hp, int mmp, int mp, int lv, int xp, int nxp, int stp, int str, int inte,
			int wis, int agi) {
		super();
		this.inventory = inventory;
		this.inven = inven;
		this.nofitem = nofitem;
		this.itemexist = itemexist;
		this.itemcursor = itemcursor;
		this.currentStage = currentStage;
		this.mhp = mhp;
		this.hp = hp;
		this.mmp = mmp;
		this.mp = mp;
		this.lv = lv;
		this.xp = xp;
		this.nxp = nxp;
		this.stp = stp;
		this.str = str;
		this.inte = inte;
		this.wis = wis;
		this.agi = agi;
	}
	*/
	public Player() {
		
	}
	public Player(String currentStage, int mhp, int hp, int mmp, int mp, int lv, int xp, int nxp, int stp, int str, int inte,
			int wis, int agi) {
		super();
		this.currentStage = currentStage;
		this.mhp = mhp;
		this.hp = hp;
		this.mmp = mmp;
		this.mp = mp;
		this.lv = lv;
		this.xp = xp;
		this.nxp = nxp;
		this.stp = stp;
		this.str = str;
		this.inte = inte;
		this.wis = wis;
		this.agi = agi;
	}
	
	public void raiseStr() {
		if(stp>0) {
			stp--;
			str++;
		}
		
	}
	
	public void raiseInte() {
		if(stp>0) {
			stp--;
			inte++;
		}
	}
	
	public void raiseWis() {
		if(stp>0) {
			stp--;
			wis++;
		}
		
	}
	public void raiseAgi() {
		if(stp>0) {
			stp--;
			agi++;
		}
	}
	/*
	public void drinkPot() {
		//���������� ���ٸ��Ƿ� ���� �̱���
	}
	*/
	
	/*
	public void addItem(int itemNo, int noItem) {
		inven[itemcursor] = itemNo;
		nofitem[itemcursor] = noItem;
	}
	*/
	
}
