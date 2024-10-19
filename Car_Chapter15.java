package kadai_015;

public class Car_Chapter15 {
	
	//	フィールド（内部データ）
	private int gear = 1;		// 1速から5速のギアを表す(初期値：1)	
	private int speed = 10;		// ギアチェンジ後の速度を表す（初期値：10）	

	// コンストラクタ（初期化処理）		※材料：米、水
	public Car_Chapter15(int gear, int speed) {			//	セットが必須！！　フィールドで設定しているため本来は記載不要！！
		this.gear 		= gear;	
		this.speed 		= speed;
	}
	
	// メソット	
	public void gearChange(int afterGear) {						//	質問1　	int のあとはafterGear？
		System.out.println("ギアは" + gear + "から" + afterGear + "に切り替えました。"); //	質問2-2　2-1の結果によって記載補法が変わる
			//　this.gear = afterGear;が前にないためエラーになる可能性あり？		
		this.gear = afterGear;							//	質問2-1　ギア1からギア3に切り替え方法
		this.speed = switch(this.gear){					//	質問3	1だったら10lmなのでif文またはswitch文の記載であっておりますか
			case 1 -> 10;
			case 2 -> 20;
			case 3 -> 30;
			case 4 -> 40;
			case 5 -> 50;
			default -> 10;
		};
}
	public void run() {
		System.out.println("速度は時速" + speed + "kmです");
	}
}



