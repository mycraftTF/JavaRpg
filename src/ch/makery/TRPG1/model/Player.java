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
	int xp;	// 현재 경험치
	int nxp;// 필요경험치
	
	int stp;//스텟포인트
	int str; //근력-공격력
	int inte;//지력-마법공격력
	int wis;//지력-마법방어
	int agi;//민첩-회피
	
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
		//포션종류맏 ㅏ다르므로 아직 미구현
	}
	*/
	
	/*
	public void addItem(int itemNo, int noItem) {
		inven[itemcursor] = itemNo;
		nofitem[itemcursor] = noItem;
	}
	*/
	
}
