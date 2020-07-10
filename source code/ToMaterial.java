import java.util.*;

public class ToMaterial {
    String name;
	String name2;
	String type;
	int point;
	boolean rare;
	boolean notexist;
	public static void main(String[] args) {}
	
	public static String[] ToMaterial(String Type, int Point, boolean withOutRare, boolean same234) {
		String[] name = new String[290];
		String[] name2 = new String[290];
		String[] type = new String[290];
		int[] point = new int[290];
		boolean[] rare = new boolean[290];
		boolean[] notexist = new boolean[290];

		ToMaterial i1 = new ToMaterial();
		i1.name = "クラボのみ";
		i1.type = "ほのお";
		i1.point = 1;
		
		ToMaterial i2 = new ToMaterial();
		i2.name = "カゴのみ";
		i2.type = "みず";
		i2.point = 1;
		
		ToMaterial i3 = new ToMaterial();
		i3.name = "モモンのみ";
		i3.type = "でんき";
		i3.point = 1;
		
		ToMaterial i4 = new ToMaterial();
		i4.name = "チーゴのみ";
		i4.type = "くさ";
		i4.point = 1;
		
		ToMaterial i5 = new ToMaterial();
		i5.name = "ナナシのみ";
		i5.type = "こおり";
		i5.point = 1;
		
		ToMaterial i6 = new ToMaterial();
		i6.name = "ヒメリのみ";
		i6.type = "かくとう";
		i6.point = 1;
		
		ToMaterial i7 = new ToMaterial();
		i7.name = "オレンのみ";
		i7.type = "どく";
		i7.point = 1;
		
		ToMaterial i8 = new ToMaterial();
		i8.name = "キーのみ";
		i8.type = "じめん";
		i8.point = 1;
		
		ToMaterial i9 = new ToMaterial();
		i9.name = "ラムのみ";
		i9.type = "ひこう";
		i9.point = 1;
		
		ToMaterial i10 = new ToMaterial();
		i10.name = "オボンのみ";
		i10.type = "エスパー";
		i10.point = 1;
		
		ToMaterial i11 = new ToMaterial();
		i11.name = "フィラのみ";
		i11.type = "ほのお";
		i11.point = 2;
		
		ToMaterial i12 = new ToMaterial();
		i12.name = "ウイのみ";
		i12.type = "いわ";
		i12.point = 2;
		
		ToMaterial i13= new ToMaterial();
		i13.name = "マゴのみ";
		i13.type = "ゴースト";
		i13.point = 2;
		
		ToMaterial i14= new ToMaterial();
		i14.name = "バンジのみ";
		i14.type = "ドラゴン";
		i14.point = 2;
		
		ToMaterial i15= new ToMaterial();
		i15.name = "イアのみ";
		i15.type = "あく";
		i15.point = 2;
		
		ToMaterial i16= new ToMaterial();
		i16.name = "ザロクのみ";
		i16.type = "こおり";
		i16.point = 3;
		
		ToMaterial i17= new ToMaterial();
		i17.name = "ネコブのみ";
		i17.type = "かくとう";
		i17.point = 3;
		
		ToMaterial i18= new ToMaterial();
		i18.name = "タポルのみ";
		i18.type = "どく";
		i18.point = 3;
		
		ToMaterial i19= new ToMaterial();
		i19.name = "ロメのみ";
		i19.type = "じめん";
		i19.point = 3;
		
		ToMaterial i20= new ToMaterial();
		i20.name = "ウブのみ";
		i20.type = "ひこう";
		i20.point = 3;
		
		ToMaterial i21= new ToMaterial();
		i21.name = "マトマのみ";
		i21.type = "エスパー";
		i21.point = 3;
		
		ToMaterial i22= new ToMaterial();
		i22.name = "オッカのみ";
		i22.type = "ほのお";
		i22.point = 2;
		
		ToMaterial i23= new ToMaterial();
		i23.name = "イトケのみ";
		i23.type = "みず";
		i23.point = 2;
		
		ToMaterial i24= new ToMaterial();
		i24.name = "ソクノのみ";
		i24.type = "でんき";
		i24.point = 2;
		
		ToMaterial i25= new ToMaterial();
		i25.name = "リンドのみ";
		i25.type = "くさ";
		i25.point = 2;
		
		ToMaterial i26= new ToMaterial();
		i26.name = "ヤチェのみ";
		i26.type = "こおり";
		i26.point = 2;
		
		ToMaterial i27= new ToMaterial();
		i27.name = "ヨプのみ";
		i27.type = "かくとう";
		i27.point = 2;
		
		ToMaterial i28= new ToMaterial();
		i28.name = "ビアーのみ";
		i28.type = "どく";
		i28.point = 2;
		
		ToMaterial i29= new ToMaterial();
		i29.name = "シュカのみ";
		i29.type = "じめん";
		i29.point = 2;
		
		ToMaterial i30= new ToMaterial();
		i30.name = "バコウのみ";
		i30.type = "ひこう";
		i30.point = 2;
		
		ToMaterial i31= new ToMaterial();
		i31.name = "ウタンのみ";
		i31.type = "エスパー";
		i31.point = 2;
		
		ToMaterial i32= new ToMaterial();
		i32.name = "タンガのみ";
		i32.type = "むし";
		i32.point = 2;
		
		ToMaterial i33= new ToMaterial();
		i33.name = "ヨロギのみ";
		i33.type = "いわ";
		i33.point = 2;
		
		ToMaterial i34= new ToMaterial();
		i34.name = "カシブのみ";
		i34.type = "ゴースト";
		i34.point = 2;
		
		ToMaterial i35= new ToMaterial();
		i35.name = "ハバンのみ";
		i35.type = "";
		i35.point = 2;
		
		ToMaterial i36= new ToMaterial();
		i36.name = "ナモのみ";
		i36.type = "あく";
		i36.point = 2;
		
		ToMaterial i37= new ToMaterial();
		i37.name = "リリバのみ";
		i37.type = "はがね";
		i37.point = 2;
		
		ToMaterial i38= new ToMaterial();
		i38.name = "ロゼルのみ";
		i38.type = "フェアリー";
		i38.point = 2;
		
		ToMaterial i39= new ToMaterial();
		i39.name = "ホズのみ";
		i39.type = "ノーマル";
		i39.point = 2;
		
		ToMaterial i40= new ToMaterial();
		i40.name = "チイラのみ";
		i40.type = "くさ";
		i40.point = 6;
		
		ToMaterial i41= new ToMaterial();
		i41.name = "リュガのみ";
		i41.type = "こおり";
		i41.point = 6;
		
		ToMaterial i42= new ToMaterial();
		i42.name = "カムラのみ";
		i42.type = "かくとう";
		i42.point = 6;
		
		ToMaterial i43= new ToMaterial();
		i43.name = "ヤタピのみ";
		i43.type = "どく";
		i43.point = 6;
		
		ToMaterial i44= new ToMaterial();
		i44.name = "ズアのみ";
		i44.type = "じめん";
		i44.point = 6;
		
		ToMaterial i45= new ToMaterial();
		i45.name = "サンのみ";
		i45.type = "ひこう";
		i45.point = 5;
		
		ToMaterial i46= new ToMaterial();
		i46.name = "スターのみ";
		i46.type = "エスパー";
		i46.point = 5;
		
		ToMaterial i47= new ToMaterial();
		i47.name = "アッキのみ";
		i47.type = "フェアリー";
		i47.point = 3;
		
		ToMaterial i48= new ToMaterial();
		i48.name = "タラプのみ";
		i48.type = "あく";
		i48.point = 3;
		
		ToMaterial i49= new ToMaterial();
		i49.name = "ナゾのみ"; //未実装
		i49.type = "むし";
		i49.point = 5;
		i49.notexist = true;
		
		ToMaterial i50= new ToMaterial();
		i50.name = "ミクルのみ"; //未実装
		i50.type = "いわ";
		i50.point = 5;
		i50.notexist = true;
		
		ToMaterial i51= new ToMaterial();
		i51.name = "イバンのみ"; //未実装
		i51.type = "ゴースト"; 
		i51.point = 4;
		i51.notexist = true;
		
		ToMaterial i52= new ToMaterial();
		i52.name = "ジャポのみ"; //未実装
		i52.type = "ドラゴン";
		i52.point = 3;
		i52.notexist = true;
		
		ToMaterial i53= new ToMaterial();
		i53.name = "レンブのみ"; //未実装
		i53.type = "あく";
		i53.point = 3;
		i53.notexist = true;
		
		ToMaterial i54= new ToMaterial();
		i54.name = "むしよけスプレー";
		i54.type = "どく";
		i54.point = 1;
		
		ToMaterial i55= new ToMaterial();
		i55.name = "シルバースプレー";
		i55.type = "どく";
		i55.point = 1;
		
		ToMaterial i56= new ToMaterial();
		i56.name = "ゴールドスプレー";
		i56.type = "どく";
		i56.point = 1;
		
		ToMaterial i57= new ToMaterial();
		i57.name = "ふしぎなアメ";
		i57.type = "エスパー";
		i57.point = 20;
		
		ToMaterial i58= new ToMaterial();
		i58.name = "けいけんアメXS";
		i58.type = "エスパー";
		i58.point = 1;
		
		ToMaterial i59= new ToMaterial();
		i59.name = "けいけんアメS";
		i59.type = "エスパー";
		i59.point = 2;
		
		ToMaterial i60= new ToMaterial();
		i60.name = "けいけんアメM";
		i60.type = "エスパー";
		i60.point = 3;
		
		ToMaterial i61= new ToMaterial();
		i61.name = "けいけんアメL";
		i61.type = "エスパー";
		i61.point = 4;
		
		ToMaterial i62= new ToMaterial();
		i62.name = "けいけんアメXL";
		i62.type = "エスパー";
		i62.point = 5;
		
		ToMaterial i63= new ToMaterial();
		i63.name = "ダイマックスアメ";
		i63.type = "ドラゴン";
		i63.point = 3;
		
		ToMaterial i64= new ToMaterial();
		i64.name = "ポイントアップ";
		i64.type = "ノーマル";
		i64.point = 19;
		
		ToMaterial i65= new ToMaterial();
		i65.name = "ポイントマックス";
		i65.type = "ノーマル";
		i65.point = 20;
		
		ToMaterial i66= new ToMaterial();
		i66.name = "マックスアップ";
		i66.type = "かくとう";
		i66.point = 2;
		
		ToMaterial i67= new ToMaterial();
		i67.name = "タウリン";
		i67.type = "かくとう";
		i67.point = 2;
		
		ToMaterial i68= new ToMaterial();
		i68.name = "ブロムヘキシン";
		i68.type = "かくとう";
		i68.point = 2;
		
		ToMaterial i69= new ToMaterial();
		i69.name = "インドメタシン";
		i69.type = "";
		i69.point = 2;
		
		ToMaterial i70= new ToMaterial();
		i70.name = "リゾチウム";
		i70.type = "かくとう";
		i70.point = 2;
		
		ToMaterial i71= new ToMaterial();
		i71.name = "キトサン";
		i71.type = "かくとう";
		i71.point = 2;
		
		ToMaterial i72= new ToMaterial();
		i72.name = "たいりょくのハネ";
		i72.type = "ひこう";
		i72.point = 3;
		
		ToMaterial i73= new ToMaterial();
		i73.name = "きんりょくのハネ";
		i73.type = "ひこう";
		i73.point = 3;
		
		ToMaterial i74= new ToMaterial();
		i74.name = "ていこうのハネ";
		i74.type = "ひこう";
		i74.point = 3;
		
		ToMaterial i75= new ToMaterial();
		i75.name = "ちりょくのハネ";
		i75.type = "ひこう";
		i75.point = 3;
		
		ToMaterial i76= new ToMaterial();
		i76.name = "せいしんのハネ";
		i76.type = "ひこう";
		i76.point = 3;
		
		ToMaterial i77= new ToMaterial();
		i77.name = "しゅんぱつのハネ";
		i77.type = "ひこう";
		i77.point = 3;
		
		ToMaterial i78= new ToMaterial();
		i78.name = "とくせいカプセル";
		i78.type = "ノーマル";
		i78.point = 20;
		
		ToMaterial i79= new ToMaterial();
		i79.name = "さみしがりミント";
		i79.type = "くさ";
		i79.point = 8;
		
		ToMaterial i80= new ToMaterial();
		i80.name = "いじっぱりミント";
		i80.type = "くさ";
		i80.point = 8;
		
		ToMaterial i81= new ToMaterial();
		i81.name = "やんちゃミント";
		i81.type = "くさ";
		i81.point = 8;
		
		ToMaterial i82= new ToMaterial();
		i82.name = "ゆうかんミント";
		i82.type = "くさ";
		i82.point = 8;
		
		ToMaterial i83= new ToMaterial();
		i83.name = "すぶといミント";
		i83.type = "くさ";
		i83.point = 8;
		
		ToMaterial i84= new ToMaterial();
		i84.name = "わんぱくミント";
		i84.type = "くさ";
		i84.point = 8;
		
		ToMaterial i85= new ToMaterial();
		i85.name = "のうてんきミント";
		i85.type = "くさ";
		i85.point = 8;
		
		ToMaterial i86= new ToMaterial();
		i86.name = "のんきミント";
		i86.type = "くさ";
		i86.point = 8;
		
		ToMaterial i87= new ToMaterial();
		i87.name = "ひかえめミント";
		i87.type = "くさ";
		i87.point = 8;
		
		ToMaterial i88= new ToMaterial();
		i88.name = "おっとりミント";
		i88.type = "くさ";
		i88.point = 8;
		
		ToMaterial i89= new ToMaterial();
		i89.name = "うっかりやミント";
		i89.type = "くさ";
		i89.point = 8;
		
		ToMaterial i90= new ToMaterial();
		i90.name = "れいせいミント";
		i90.type = "くさ";
		i90.point = 8;
		
		ToMaterial i91= new ToMaterial();
		i91.name = "おだやかミント";
		i91.type = "くさ";
		i91.point = 8;
		
		ToMaterial i92= new ToMaterial();
		i92.name = "おとなしいミント";
		i92.type = "くさ";
		i92.point = 8;
		
		ToMaterial i93= new ToMaterial();
		i93.name = "しんちょうミント";
		i93.type = "くさ";
		i93.point = 8;
		
		ToMaterial i94= new ToMaterial();
		i94.name = "なまいきミント";
		i94.type = "くさ";
		i94.point = 8;
		
		ToMaterial i95= new ToMaterial();
		i95.name = "おくびょうミント";
		i95.type = "くさ";
		i95.point = 8;
		
		ToMaterial i96= new ToMaterial();
		i96.name = "せっかちミント";
		i96.type = "くさ";
		i96.point = 8;
		
		ToMaterial i97= new ToMaterial();
		i97.name = "ようきミント";
		i97.type = "くさ";
		i97.point = 8;
		
		ToMaterial i98= new ToMaterial();
		i98.name = "むじゃきミント";
		i98.type = "くさ";
		i98.point = 8;
		
		ToMaterial i99= new ToMaterial();
		i99.name = "まじめミント";
		i99.type = "くさ";
		i99.point = 8;
		
		ToMaterial i100= new ToMaterial();
		i100.name = "たいようのいし";
		i100.type = "ほのお";
		i100.point = 3;
		
		ToMaterial i101= new ToMaterial();
		i101.name = "つきのいし";
		i101.type = "フェアリー";
		i101.point = 3;
		
		ToMaterial i102= new ToMaterial();
		i102.name = "ほのおのいし";
		i102.type = "ほのお";
		i102.point = 3;
		
		ToMaterial i103= new ToMaterial();
		i103.name = "かみなりのいし";
		i103.type = "でんき";
		i103.point = 3;
		
		ToMaterial i104= new ToMaterial();
		i104.name = "みずのいし";
		i104.type = "みず";
		i104.point = 3;
		
		ToMaterial i105= new ToMaterial();
		i105.name = "リーフのいし";
		i105.type = "くさ";
		i105.point = 3;
		
		ToMaterial i106= new ToMaterial();
		i106.name = "ひかりのいし";
		i106.type = "フェアリー";
		i106.point = 3;
		
		ToMaterial i107= new ToMaterial();
		i107.name = "やみのいし";
		i107.type = "ゴースト";
		i107.point = 3;
		
		ToMaterial i108= new ToMaterial();
		i108.name = "めざめいし";
		i108.type = "エスパー";
		i108.point = 3;
		
		ToMaterial i109= new ToMaterial();
		i109.name = "まんまるいし";
		i109.type = "いわ";
		i109.point = 6;
		
		ToMaterial i110= new ToMaterial();
		i110.name = "こおりのいし";
		i110.type = "こおり";
		i110.point = 3;
		
		ToMaterial i111= new ToMaterial();
		i111.name = "あまーいりんご";
		i111.type = "くさ";
		i111.point = 15;
		
		ToMaterial i112= new ToMaterial();
		i112.name = "すっぱいりんご";
		i112.type = "くさ";
		i112.point = 15;
		
		ToMaterial i113= new ToMaterial();
		i113.name = "われたポット";
		i113.type = "じめん";
		i113.point = 15;
		
		ToMaterial i114= new ToMaterial();
		i114.name = "かけたポット";
		i114.type = "じめん";
		i114.point = 20;
		
		ToMaterial i115= new ToMaterial();
		i115.name = "プロテクター";
		i115.type = "いわ";
		i115.point = 12;
		
		ToMaterial i116= new ToMaterial();
		i116.name = "れいかいのぬの";
		i116.type = "ゴースト";
		i116.point = 16;
		
		ToMaterial i117= new ToMaterial();
		i117.name = "きれいなウロコ";
		i117.type = "みず";
		i117.point = 13;
		
		ToMaterial i118= new ToMaterial();
		i118.name = "ホイップホップ";
		i118.type = "フェアリー";
		i118.point = 13;
		
		ToMaterial i119= new ToMaterial();
		i119.name = "においぶくろ";
		i119.type = "フェアリー";
		i119.point = 10;
		
		ToMaterial i120= new ToMaterial();
		i120.name = "くちたけん";
		i120.type = "はがね";
		i120.point = 1;
		
		ToMaterial i121= new ToMaterial();
		i121.name = "くちたたて";
		i121.type = "はがね";
		i121.point = 1;
		
		ToMaterial i122= new ToMaterial();
		i122.name = "いちごアメざいく";
		i122.type = "フェアリー";
		i122.point = 15;
		
		ToMaterial i123= new ToMaterial();
		i123.name = "ハートアメざいく";
		i123.type = "フェアリー";
		i123.point = 15;
		
		ToMaterial i124= new ToMaterial();
		i124.name = "ベリーアメざいく";
		i124.type = "フェアリー";
		i124.point = 15;
		
		ToMaterial i125= new ToMaterial();
		i125.name = "よつばアメざいく";
		i125.type = "フェアリー";
		i125.point = 15;
		
		ToMaterial i126= new ToMaterial();
		i126.name = "おはなアメざいく";
		i126.type = "フェアリー";
		i126.point = 15;
		
		ToMaterial i127= new ToMaterial();
		i127.name = "スターアメざいく";
		i127.type = "フェアリー";
		i127.point = 15;
		
		ToMaterial i128= new ToMaterial();
		i128.name = "リボンアメざいく";
		i128.type = "フェアリー";
		i128.point = 15;
		
		ToMaterial i129= new ToMaterial();
		i129.name = "ファイトメモリ";
		i129.type = "かくとう";
		i129.point = 20;
		i129.rare = true;
		
		ToMaterial i130= new ToMaterial();
		i130.name = "フライングメモリ";
		i130.type = "ひこう";
		i130.point = 20;
		i130.rare = true;
		
		ToMaterial i131= new ToMaterial();
		i131.name = "ポイズンメモリ";
		i131.type = "どく";
		i131.point = 20;
		i131.rare = true;
		
		ToMaterial i132= new ToMaterial();
		i132.name = "グラウンドメモリ";
		i132.type = "じめん";
		i132.point = 20;
		i132.rare = true;
		
		ToMaterial i133= new ToMaterial();
		i133.name = "ロックメモリ";
		i133.type = "いわ";
		i133.point = 20;
		i133.rare = true;
		
		ToMaterial i134= new ToMaterial();
		i134.name = "バグメモリ";
		i134.type = "むし";
		i134.point = 20;
		i134.rare = true;
		
		ToMaterial i135= new ToMaterial();
		i135.name = "ゴーストメモリ";
		i135.type = "ゴースト";
		i135.point = 20;
		i135.rare = true;
		
		ToMaterial i136= new ToMaterial();
		i136.name = "スチールメモリ";
		i136.type = "はがね";
		i136.point = 20;
		i136.rare = true;
		
		ToMaterial i137= new ToMaterial();
		i137.name = "ファイヤーメモリ";
		i137.type = "ほのお";
		i137.point = 20;
		i137.rare = true;
		
		ToMaterial i138= new ToMaterial();
		i138.name = "ウオーターメモリ";
		i138.type = "みず";
		i138.point = 20;
		i138.rare = true;
		
		ToMaterial i139= new ToMaterial();
		i139.name = "グラスメモリ";
		i139.type = "くさ";
		i139.point = 20;
		i139.rare = true;
		
		ToMaterial i140= new ToMaterial();
		i140.name = "エレクトロメモリ";
		i140.type = "でんき";
		i140.point = 20;
		i140.rare = true;
		
		ToMaterial i141= new ToMaterial();
		i141.name = "サイキックメモリ";
		i141.type = "エスパー";
		i141.point = 20;
		i141.rare = true;
		
		ToMaterial i142= new ToMaterial();
		i142.name = "アイスメモリ";
		i142.type = "こおり";
		i142.point = 20;
		i142.rare = true;
		
		ToMaterial i143= new ToMaterial();
		i143.name = "ドラゴンメモリ";
		i143.type = "ドラゴン";
		i143.point = 20;
		i143.rare = true;
		
		ToMaterial i144= new ToMaterial();
		i144.name = "ダークメモリ";
		i144.type = "あく";
		i144.point = 20;
		i144.rare = true;
		
		ToMaterial i145= new ToMaterial();
		i145.name = "フェアリーメモリ";
		i145.type = "フェアリー";
		i145.point = 20;
		i145.rare = true;
		
		ToMaterial i146= new ToMaterial();
		i146.name = "ひかりのこな";
		i146.type = "フェアリー";
		i146.point = 7;
		
		ToMaterial i147= new ToMaterial();
		i147.name = "しろいハーブ";
		i147.type = "くさ";
		i147.point = 7;
		
		ToMaterial i148= new ToMaterial();
		i148.name = "きょうせいギプス";
		i148.type = "かくとう";
		i148.point = 13;
		
		ToMaterial i149= new ToMaterial();
		i149.name = "せんせいのツメ";
		i149.type = "ノーマル";
		i149.point = 8;
		
		ToMaterial i150= new ToMaterial();
		i150.name = "やすらぎのすず";
		i150.type = "はがね";
		i150.point = 7;
		i150.rare = true;
		
		ToMaterial i151= new ToMaterial();
		i151.name = "メンタルハーブ";
		i151.type = "くさ";
		i151.point = 7;
		
		ToMaterial i152= new ToMaterial();
		i152.name = "こだわりハチマキ";
		i152.type = "かくとう";
		i152.point = 10;
		
		ToMaterial i153= new ToMaterial();
		i153.name = "おうじゃのしるし";
		i153.type = "はがね";
		i153.point = 16;
		
		ToMaterial i154= new ToMaterial();
		i154.name = "ぎんのこな";
		i154.type = "くさ";
		i154.point = 5;
		
		ToMaterial i155= new ToMaterial();
		i155.name = "おまもりこばん";
		i155.type = "ノーマル";
		i155.point = 16;
		
		ToMaterial i156= new ToMaterial();
		i156.name = "きよめのおふだ";
		i156.type = "ゴースト";
		i156.point = 12;
		
		ToMaterial i157= new ToMaterial();
		i157.name = "けむりだま";
		i157.type = "どく";
		i157.point = 12;
		
		ToMaterial i158= new ToMaterial();
		i158.name = "かわらずのいし";
		i158.type = "いわ";
		i158.point = 10;
		
		ToMaterial i159= new ToMaterial();
		i159.name = "きあいのハチマキ";
		i159.type = "かくとう";
		i159.point = 6;
		
		ToMaterial i160= new ToMaterial();
		i160.name = "しあわせタマゴ";
		i160.type = "ノーマル";
		i160.point = 10;
		
		ToMaterial i161= new ToMaterial();
		i161.name = "ピントレンズ";
		i161.type = "あく";
		i161.point = 6;
		
		ToMaterial i162= new ToMaterial();
		i162.name = "メタルコート";
		i162.type = "はがね";
		i162.point = 12;
		
		ToMaterial i163= new ToMaterial();
		i163.name = "たべのこし";
		i163.type = "くさ";
		i163.point = 11;
		
		ToMaterial i164= new ToMaterial();
		i164.name = "でんきだま";
		i164.type = "でんき";
		i164.point = 10;
		
		ToMaterial i165= new ToMaterial();
		i165.name = "やわらかいすな";
		i165.type = "じめん";
		i165.point = 10;
		
		ToMaterial i166= new ToMaterial();
		i166.name = "かたいいし";
		i166.type = "いわ";
		i166.point = 7;
		
		ToMaterial i167= new ToMaterial();
		i167.name = "きせきのタネ";
		i167.type = "くさ";
		i167.point = 7;
		
		ToMaterial i168= new ToMaterial();
		i168.name = "くろいメガネ";
		i168.type = "あく";
		i168.point = 7;
		
		ToMaterial i169= new ToMaterial();
		i169.name = "くろおび";
		i169.type = "かくとう";
		i169.point = 7;
		
		ToMaterial i170= new ToMaterial();
		i170.name = "じしゃく";
		i170.type = "でんき";
		i170.point = 10;
		
		ToMaterial i171= new ToMaterial();
		i171.name = "しんぴのしずく";
		i171.type = "みず";
		i171.point = 5;
		
		ToMaterial i172= new ToMaterial();
		i172.name = "するどいくちばし";
		i172.type = "ひこう";
		i172.point = 5;
		
		ToMaterial i173= new ToMaterial();
		i173.name = "どくバリ";
		i173.type = "どく";
		i173.point = 16;
		
		ToMaterial i174= new ToMaterial();
		i174.name = "とけないこおり";
		i174.type = "こおり";
		i174.point = 7;
		
		ToMaterial i175= new ToMaterial();
		i175.name = "まがったスプーン";
		i175.type = "エスパー";
		i175.point = 9;
		
		ToMaterial i176= new ToMaterial();
		i176.name = "のろいのおふだ";
		i176.type = "ゴースト";
		i176.point = 13;
		
		ToMaterial i177= new ToMaterial();
		i177.name = "もくたん";
		i177.type = "ほのお";
		i177.point =16 ;
		
		ToMaterial i178= new ToMaterial();
		i178.name = "りゅうのキバ";
		i178.type = "ドラゴン";
		i178.point = 9;
		
		ToMaterial i179= new ToMaterial();
		i179.name = "シルクのスカーフ";
		i179.type = "ノーマル";
		i179.point = 11;
		
		ToMaterial i180= new ToMaterial();
		i180.name = "かいがらのすず";
		i180.type = "みず";
		i180.point = 7;
		
		ToMaterial i181= new ToMaterial();
		i181.name = "うしおのおこう";
		i181.type = "みず";
		i181.point = 1;
		
		ToMaterial i182= new ToMaterial();
		i182.name = "のんきのおこう";
		i182.type = "エスパー";
		i182.point = 1;
		
		ToMaterial i183= new ToMaterial();
		i183.name = "メタルパウダー";
		i183.type = "はがね";
		i183.point = 7;
		
		ToMaterial i184= new ToMaterial();
		i184.name = "ながねぎ";
		i184.type = "くさ";
		i184.point = 9;
		
		ToMaterial i185= new ToMaterial();
		i185.name = "こうかくレンズ";
		i185.type = "あく";
		i185.point = 11;
		
		ToMaterial i186= new ToMaterial();
		i186.name = "ちからのハチマキ";
		i186.type = "かくとう";
		i186.point = 7;
		
		ToMaterial i187= new ToMaterial();
		i187.name = "ものしりメガネ";
		i187.type = "エスパー";
		i187.point = 4;
		i187.rare = true;
		
		ToMaterial i188= new ToMaterial();
		i188.name = "たつじんのおび";
		i188.type = "かくとう";
		i188.point = 16;
		
		ToMaterial i189= new ToMaterial();
		i189.name = "ひかりのねんど";
		i189.type = "エスパー";
		i189.point = 10;
		
		ToMaterial i190= new ToMaterial();
		i190.name = "いのちのたま";
		i190.type = "ドラゴン";
		i190.point = 10;
		
		ToMaterial i191= new ToMaterial();
		i191.name = "パワフルハーブ";
		i191.type = "くさ";
		i191.point = 5;
		
		ToMaterial i192= new ToMaterial();
		i192.name = "どくどくだま";
		i192.type = "どく";
		i192.point = 7;
		
		ToMaterial i193= new ToMaterial();
		i193.name = "かえんだま";
		i193.type = "ほのお";
		i193.point = 7;
		
		ToMaterial i194= new ToMaterial();
		i194.name = "スピードパウダー";
		i194.type = "ノーマル";
		i194.point = 14;
		
		ToMaterial i195= new ToMaterial();
		i195.name = "きあいのタスキ";
		i195.type = "かくとう";
		i195.point = 6;
		
		ToMaterial i196= new ToMaterial();
		i196.name = "メトロノーム";
		i196.type = "はがね";
		i196.point = 11;
		
		ToMaterial i197= new ToMaterial();
		i197.name = "フォーカスレンズ";
		i197.type = "あく";
		i197.point = 12;
		i140.rare = true;
		
		ToMaterial i198= new ToMaterial();
		i198.name = "くろいてっきゅう";
		i198.type = "はがね";
		i198.point = 8;
		
		ToMaterial i199= new ToMaterial();
		i199.name = "こうこうのしっぽ";
		i199.type = "いわ";
		i199.point = 5;
		
		ToMaterial i200= new ToMaterial();
		i200.name = "あかいいと";
		i200.type = "エスパー";
		i200.point = 14;
		
		ToMaterial i201= new ToMaterial();
		i201.name = "くろいヘドロ";
		i201.type = "どく";
		i201.point = 5;
		
		ToMaterial i202= new ToMaterial();
		i202.name = "つめたいいわ";
		i202.type = "こおり";
		i202.point = 6;
		
		ToMaterial i203= new ToMaterial();
		i203.name = "さらさらいわ";
		i203.type = "いわ";
		i203.point = 6;
		
		ToMaterial i204= new ToMaterial();
		i204.name = "あついいわ";
		i204.type = "ほのお";
		i204.point = 6;
		
		ToMaterial i205= new ToMaterial();
		i205.name = "しめったいわ";
		i205.type = "みず";
		i205.point = 6;
		
		ToMaterial i206= new ToMaterial();
		i206.name = "ねばりのかぎづめ";
		i206.type = "むし";
		i206.point = 13;
		
		ToMaterial i207= new ToMaterial();
		i207.name = "こだわりスカーフ";
		i207.type = "ノーマル";
		i207.point = 10;
		
		ToMaterial i208= new ToMaterial();
		i208.name = "くっつきバリ";
		i208.type = "くさ";
		i208.point = 5;
		
		ToMaterial i209= new ToMaterial();
		i209.name = "パワーリスト";
		i209.type = "かくとう";
		i209.point = 10;
		
		ToMaterial i210= new ToMaterial();
		i210.name = "パワーベルト";
		i210.type = "かくとう";
		i210.point = 10;
		
		ToMaterial i211= new ToMaterial();
		i211.name = "パワーレンズ";
		i211.type = "エスパー";
		i211.point = 10;
		
		ToMaterial i212= new ToMaterial();
		i212.name = "パワーバンド";
		i212.type = "かくとう";
		i212.point = 10;
		
		ToMaterial i213= new ToMaterial();
		i213.name = "パワーアンクル";
		i213.type = "かくとう";
		i213.point = 10;
		
		ToMaterial i214= new ToMaterial();
		i214.name = "パワーウエイト";
		i214.type = "かくとう";
		i214.point = 10;
		
		ToMaterial i215= new ToMaterial();
		i215.name = "きれいなぬけがら";
		i215.type = "むし";
		i215.point = 5;
		
		ToMaterial i216= new ToMaterial();
		i216.name = "おおきなねっこ";
		i216.type = "くさ";
		i216.point = 4;
		i216.rare = true;
		
		ToMaterial i217= new ToMaterial();
		i217.name = "こだわりメガネ";
		i217.type = "エスパー";
		i217.point = 10;
		
		ToMaterial i218= new ToMaterial();
		i218.name = "あやしいおこう";
		i218.type = "ゴースト";
		i218.point = 1;
		
		ToMaterial i219= new ToMaterial();
		i219.name = "がんせきおこう";
		i219.type = "いわ";
		i219.point = 1;
		
		ToMaterial i220= new ToMaterial();
		i220.name = "まんぷくおこう";
		i220.type = "ノーマル";
		i220.point = 1;
		
		ToMaterial i221= new ToMaterial();
		i221.name = "さざなみのおこう";
		i221.type = "みず";
		i221.point = 1;
		
		ToMaterial i222= new ToMaterial();
		i222.name = "おはなのおこう";
		i222.type = "くさ";
		i222.point = 1;
		
		ToMaterial i223= new ToMaterial();
		i223.name = "こううんのおこう";
		i223.type = "ノーマル";
		i223.point = 1;
		
		ToMaterial i224= new ToMaterial();
		i224.name = "きよめのおこう";
		i224.type = "エスパー";
		i224.point = 1;
		
		ToMaterial i225= new ToMaterial();
		i225.name = "するどいツメ";
		i225.type = "あく";
		i225.point = 13;
		
		ToMaterial i226= new ToMaterial();
		i226.name = "しんかのきせき";
		i226.type = "ドラゴン";
		i226.point = 16;
		
		ToMaterial i227= new ToMaterial();
		i227.name = "かるいし";
		i227.type = "いわ";
		i227.point = 4;
		
		ToMaterial i228= new ToMaterial();
		i228.name = "ゴツゴツメット";
		i228.type = "いわ";
		i228.point = 13;
		
		ToMaterial i229= new ToMaterial();
		i229.name = "ふうせん";
		i229.type = "ひこう";
		i229.point = 10;
		
		ToMaterial i230= new ToMaterial();
		i230.name = "レッドカード";
		i230.type = "ほのお";
		i230.point = 8;
		
		ToMaterial i231= new ToMaterial();
		i231.name = "ねらいのまと";
		i231.type = "あく";
		i231.point = 7;
		
		ToMaterial i232= new ToMaterial();
		i232.name = "しめつけバンド";
		i232.type = "あく";
		i232.point = 4;
		
		ToMaterial i233= new ToMaterial();
		i233.name = "きゅうこん";
		i233.type = "くさ";
		i233.point = 4;
		
		ToMaterial i234= new ToMaterial();
		i234.name = "じゅうでんち";
		i234.type = "でんき";
		i234.point = 7;
		
		ToMaterial i235= new ToMaterial();
		i235.name = "だっしゅつボタン";
		i235.type = "はがね";
		i235.point = 8;
		
		ToMaterial i236= new ToMaterial();
		i236.name = "ノーマルジュエル";
		i236.type = "ノーマル";
		i236.point = 4;
		
		ToMaterial i237= new ToMaterial();
		i237.name = "じゃくてんほけん";
		i237.type = "あく";
		i237.point = 15;
		
		ToMaterial i238= new ToMaterial();
		i238.name = "とつげきチョッキ";
		i238.type = "はがね";
		i238.point = 10;
		
		ToMaterial i239= new ToMaterial();
		i239.name = "せいれいプレート";
		i239.type = "フェアリー";
		i239.point = 1;
		i239.rare = true;
		
		ToMaterial i240= new ToMaterial();
		i240.name = "ひかりごけ";
		i240.type = "くさ";
		i240.point = 4;
		
		ToMaterial i241= new ToMaterial();
		i241.name = "ゆきだま";
		i241.type = "こおり";
		i241.point = 4;
		
		ToMaterial i242= new ToMaterial();
		i242.name = "ぼうじんゴーグル";
		i242.type = "ノーマル";
		i242.point = 5;
		i242.rare = true;
		
		ToMaterial i243= new ToMaterial();
		i243.name = "ビビリだま";
		i243.type = "ゴースト";
		i243.point = 6;
		
		ToMaterial i244= new ToMaterial();
		i244.name = "グランドコート";
		i244.type = "じめん";
		i244.point = 6;
		
		ToMaterial i245= new ToMaterial();
		i245.name = "ぼうごパット";
		i245.type = "かくとう";
		i245.point = 6;
		
		ToMaterial i246= new ToMaterial();
		i246.name = "エレキシード";
		i246.type = "でんき";
		i246.point = 4;
		
		ToMaterial i247= new ToMaterial();
		i247.name = "サイコシード";
		i247.type = "エスパー";
		i247.point = 4;
		
		ToMaterial i248= new ToMaterial();
		i248.name = "ミストシード";
		i248.type = "フェアリー";
		i248.point = 4;
		
		ToMaterial i249= new ToMaterial();
		i249.name = "グラスシード";
		i249.type = "くさ";
		i249.point = 4;
		
		ToMaterial i250= new ToMaterial();
		i250.name = "のどスプレー";
		i250.type = "みず";
		i250.point = 6;
		
		ToMaterial i251= new ToMaterial();
		i251.name = "だっしゅつパック";
		i251.type = "はがね";
		i251.point = 8;
		
		ToMaterial i252= new ToMaterial();
		i252.name = "あつぞこブーツ";
		i252.type = "じめん";
		i252.point = 8;
		i252.rare = true;
		
		ToMaterial i253= new ToMaterial();
		i253.name = "からぶりほけん";
		i253.type = "あく";
		i253.point = 12;
		
		ToMaterial i254= new ToMaterial();
		i254.name = "ルームサービス";
		i254.type = "エスパー";
		i254.point = 12;
		
		ToMaterial i255= new ToMaterial();
		i255.name = "ばんのうがさ";
		i255.type = "ひこう";
		i255.point = 10;
		
		ToMaterial i256= new ToMaterial();
		i256.name = "りゅうのウロコ";
		i256.type = "ドラゴン";
		i256.point = 9;
		
		ToMaterial i257= new ToMaterial();
		i257.name = "アップグレード";
		i257.type = "ノーマル";
		i257.point = 15;
		
		ToMaterial i258= new ToMaterial();
		i258.name = "ふといホネ";
		i258.type = "じめん";
		i258.point = 9;
		
		ToMaterial i259= new ToMaterial();
		i259.name = "あやしいパッチ";
		i259.type = "あく";
		i259.point = 16;
		
		ToMaterial i260= new ToMaterial();
		i260.name = "ガラナツのえだ";
		i260.type = "くさ";
		i260.point = 1;
		
		ToMaterial i261= new ToMaterial();
		i261.name = "ガラナツブレス";
		i261.type = "どく";
		i261.point = 9;
		
		ToMaterial i262= new ToMaterial();
		i262.name = "ヨロイこうせき";
		i262.type = "かくとう";
		i262.point = 14;
		
		ToMaterial i263= new ToMaterial();
		i263.name = "あかぼんぐり";
		i263.type = "ほのお";
		i263.point = 0;
		
		ToMaterial i264= new ToMaterial();
		i264.name = "あおぼんぐり";
		i264.type = "みず";
		i264.point = 0;
		
		ToMaterial i265= new ToMaterial();
		i265.name = "きぼんぐり";
		i265.type = "でんき";
		i265.point = 0;
		
		ToMaterial i266= new ToMaterial();
		i266.name = "みどぼんぐり";
		i266.type = "くさ";
		i266.point = 0;
		
		ToMaterial i267= new ToMaterial();
		i267.name = "ももぼんぐり";
		i267.type = "フェアリー";
		i267.point = 0;
		
		ToMaterial i268= new ToMaterial();
		i268.name = "しろぼんぐり";
		i268.type = "ノーマル";
		i268.point = 0;
		
		ToMaterial i269= new ToMaterial();
		i269.name = "くろぼんぐり";
		i269.type = "あく";
		i269.point = 0;
		
		ToMaterial i270= new ToMaterial();
		i270.name = "ねがいのかたまり";
		i270.type = "どく";
		i270.point = 14;
		
		ToMaterial i271= new ToMaterial();
		i271.name = "ぎんのおうかん";
		i271.type = "はがね";
		i271.point = 20;
		
		ToMaterial i272= new ToMaterial();
		i272.name = "きんのおうかん";
		i272.type = "はがね";
		i272.point = 20;
		
		ToMaterial i273= new ToMaterial();
		i273.name = "きんのたま";
		i273.type = "じめん";
		i273.point = 8;
		
		ToMaterial i274= new ToMaterial();
		i274.name = "でかいきんのたま";
		i274.type = "じめん";
		i274.point = 19;
		
		ToMaterial i275= new ToMaterial();
		i275.name = "ちいさいキノコ";
		i275.type = "くさ";
		i275.point = 1;
		
		ToMaterial i276= new ToMaterial();
		i276.name = "おおきなキノコ";
		i276.type = "くさ";
		i276.point = 7;
		
		ToMaterial i277= new ToMaterial();
		i277.name = "かおるキノコ";
		i277.type = "くさ";
		i277.point = 12;
		
		ToMaterial i278= new ToMaterial();
		i278.name = "ほしのすな";
		i278.type = "じめん";
		i278.point = 4;
		
		ToMaterial i279= new ToMaterial();
		i279.name = "ほしのかけら";
		i279.type = "いわ";
		i279.point = 10;
		
		ToMaterial i280= new ToMaterial();
		i280.name = "しんじゅ";
		i280.type = "みず";
		i280.point = 3;
		
		ToMaterial i281= new ToMaterial();
		i281.name = "おおきなしんじゅ";
		i281.type = "みず";
		i281.point = 7;
		
		ToMaterial i282= new ToMaterial();
		i282.name = "おだんごしんじゅ";
		i282.type = "みず";
		i282.point = 15;
		
		ToMaterial i283= new ToMaterial();
		i283.name = "あまいミツ";
		i283.type = "むし";
		i283.point = 1;
		
		ToMaterial i284= new ToMaterial();
		i284.name = "きれいなハネ";
		i284.type = "ひこう";
		i284.point = 3;
		
		ToMaterial i285= new ToMaterial();
		i285.name = "すいせいのかけら";
		i285.type = "こおり";
		i285.point = 17;
		
		ToMaterial i286= new ToMaterial();
		i286.name = "きちょうなホネ";
		i286.type = "じめん";
		i286.point = 6;
		
		ToMaterial i287= new ToMaterial();
		i287.name = "カセキのトリ";
		i287.type = "でんき";
		i287.point = 5;
		
		ToMaterial i288= new ToMaterial();
		i288.name = "カセキのリュウ";
		i288.type = "ドラゴン";
		i288.point = 5;
		
		ToMaterial i289= new ToMaterial();
		i289.name = "カセキのサカナ";
		i289.type = "みず";
		i289.point = 5;
		
		ToMaterial i290= new ToMaterial();
		i290.name = "カセキのクビナガ";
		i290.type = "こおり";
		i290.point = 5;
		
		name[0] = i1.name;
		name2[0] = i1.name2;
		type[0] = i1.type;
		point[0] = i1.point;
		rare[0] = i1.rare;
		notexist[0] = i1.notexist;
		
		name[1] = i2.name;
		name2[1] = i2.name2;
		type[1] = i2.type;
		point[1] = i2.point;
		rare[1] = i2.rare;
		notexist[1] = i2.notexist;
		
		name[2] = i3.name;
		name2[2] = i3.name2;
		type[2] = i3.type;
		point[2] = i3.point;
		rare[2] = i3.rare;
		notexist[2] = i3.notexist;
		
		name[3] = i4.name;
		name2[3] = i4.name2;
		type[3] = i4.type;
		point[3] = i4.point;
		rare[3] = i4.rare;
		notexist[3] = i4.notexist;
		
		name[4] = i5.name;
		name2[4] = i5.name2;
		type[4] = i5.type;
		point[4] = i5.point;
		rare[4] = i5.rare;
		notexist[4] = i5.notexist;
		
		name[5] = i6.name;
		name2[5] = i6.name2;
		type[5] = i6.type;
		point[5] = i6.point;
		rare[5] = i6.rare;
		notexist[5] = i6.notexist;
		
		name[6] = i7.name;
		name2[6] = i7.name2;
		type[6] = i7.type;
		point[6] = i7.point;
		rare[6] = i7.rare;
		notexist[6] = i7.notexist;
		
		name[7] = i8.name;
		name2[7] = i8.name2;
		type[7] = i8.type;
		point[7] = i8.point;
		rare[7] = i8.rare;
		notexist[7] = i8.notexist;
		
		name[8] = i9.name;
		name2[8] = i9.name2;
		type[8] = i9.type;
		point[8] = i9.point;
		rare[8] = i9.rare;
		notexist[8] = i9.notexist;
		
		name[9] = i10.name;
		name2[9] = i10.name2;
		type[9] = i10.type;
		point[9] = i10.point;
		rare[9] = i10.rare;
		notexist[9] = i10.notexist;
		
		name[10] = i11.name;
		name2[10] = i11.name2;
		type[10] = i11.type;
		point[10] = i11.point;
		rare[10] = i11.rare;
		notexist[10] = i11.notexist;
		
		name[11] = i12.name;
		name2[11] = i12.name2;
		type[11] = i12.type;
		point[11] = i12.point;
		rare[11] = i12.rare;
		notexist[11] = i12.notexist;
		
		name[12] = i13.name;
		name2[12] = i13.name2;
		type[12] = i13.type;
		point[12] = i13.point;
		rare[12] = i13.rare;
		notexist[12] = i13.notexist;
		
		name[13] = i14.name;
		name2[13] = i14.name2;
		type[13] = i14.type;
		point[13] = i14.point;
		rare[13] = i14.rare;
		notexist[13] = i14.notexist;
		
		name[14] = i15.name;
		name2[14] = i15.name2;
		type[14] = i15.type;
		point[14] = i15.point;
		rare[14] = i15.rare;
		notexist[14] = i15.notexist;
		
		name[15] = i16.name;
		name2[15] = i16.name2;
		type[15] = i16.type;
		point[15] = i16.point;
		rare[15] = i16.rare;
		notexist[15] = i16.notexist;
		
		name[16] = i17.name;
		name2[16] = i17.name2;
		type[16] = i17.type;
		point[16] = i17.point;
		rare[16] = i16.rare;
		notexist[16] = i16.notexist;
		
		name[17] = i18.name;
		name2[17] = i18.name2;
		type[17] = i18.type;
		point[17] = i18.point;
		rare[17] = i18.rare;
		notexist[17] = i18.notexist;
		
		name[18] = i19.name;
		name2[18] = i19.name2;
		type[18] = i19.type;
		point[18] = i19.point;
		rare[18] = i18.rare;
		notexist[18] = i18.notexist;
		
		name[19] = i20.name;
		name2[19] = i20.name2;
		type[19] = i20.type;
		point[19] = i20.point;
		rare[19] = i20.rare;
		notexist[19] = i20.notexist;
		
		name[20] = i21.name;
		name2[20] = i21.name2;
		type[20] = i21.type;
		point[20] = i21.point;
		rare[20] = i21.rare;
		notexist[20] = i21.notexist;
		
		name[21] = i22.name;
		name2[21] = i22.name2;
		type[21] = i22.type;
		point[21] = i22.point;
		rare[21] = i22.rare;
		notexist[21] = i22.notexist;
		
		name[22] = i23.name;
		name2[22] = i23.name2;
		type[22] = i23.type;
		point[22] = i23.point;
		rare[22] = i22.rare;
		notexist[22] = i22.notexist;
		
		name[23] = i24.name;
		name2[23] = i24.name2;
		type[23] = i24.type;
		point[23] = i24.point;
		rare[23] = i24.rare;
		notexist[23] = i24.notexist;
		
		name[24] = i25.name;
		name2[24] = i25.name2;
		type[24] = i25.type;
		point[24] = i25.point;
		rare[24] = i25.rare;
		notexist[24] = i25.notexist;
		
		name[25] = i26.name;
		name2[25] = i26.name2;
		type[25] = i26.type;
		point[25] = i26.point;
		rare[25] = i26.rare;
		notexist[25] = i26.notexist;
		
		name[26] = i27.name;
		name2[26] = i27.name2;
		type[26] = i27.type;
		point[26] = i27.point;
		rare[26] = i27.rare;
		notexist[26] = i27.notexist;
		
		name[27] = i28.name;
		name2[27] = i28.name2;
		type[27] = i28.type;
		point[27] = i28.point;
		rare[27] = i28.rare;
		notexist[27] = i28.notexist;
		
		name[28] = i29.name;
		name2[28] = i29.name2;
		type[28] = i29.type;
		point[28] = i29.point;
		rare[28] = i28.rare;
		notexist[28] = i28.notexist;
		
		name[29] = i30.name;
		name2[29] = i30.name2;
		type[29] = i30.type;
		point[29] = i30.point;
		rare[29] = i29.rare;
		notexist[29] = i29.notexist;
		
		name[30] = i31.name;
		name2[30] = i31.name2;
		type[30] = i31.type;
		point[30] = i31.point;
		rare[30] = i31.rare;
		notexist[30] = i31.notexist;
		
		name[31] = i32.name;
		name2[31] = i32.name2;
		type[31] = i32.type;
		point[31] = i32.point;
		rare[31] = i32.rare;
		notexist[31] = i32.notexist;
		
		name[32] = i33.name;
		name2[32] = i33.name2;
		type[32] = i33.type;
		point[32] = i33.point;
		rare[32] = i33.rare;
		notexist[32] = i33.notexist;
		
		name[33] = i34.name;
		name2[33] = i34.name2;
		type[33] = i34.type;
		point[33] = i34.point;
		rare[33] = i34.rare;
		notexist[33] = i34.notexist;
		
		name[34] = i35.name;
		name2[34] = i35.name2;
		type[34] = i35.type;
		point[34] = i35.point;
		rare[34] = i35.rare;
		notexist[34] = i35.notexist;
		
		name[35] = i36.name;
		name2[35] = i36.name2;
		type[35] = i36.type;
		point[35] = i36.point;
		rare[35] = i36.rare;
		notexist[35] = i36.notexist;
		
		name[36] = i37.name;
		name2[36] = i37.name2;
		type[36] = i37.type;
		point[36] = i37.point;
		rare[36] = i37.rare;
		notexist[36] = i37.notexist;
		
		name[37] = i38.name;
		name2[37] = i38.name2;
		type[37] = i38.type;
		point[37] = i38.point;
		rare[37] = i38.rare;
		notexist[37] = i38.notexist;
		
		name[38] = i39.name;
		name2[38] = i39.name2;
		type[38] = i39.type;
		point[38] = i39.point;
		
		name[39] = i40.name;
		name2[39] = i40.name2;
		type[39] = i40.type;
		point[39] = i40.point;
		rare[39] = i40.rare;
		notexist[39] = i40.notexist;
		
		name[40] = i41.name;
		name2[40] = i41.name2;
		type[40] = i41.type;
		point[40] = i41.point;
		rare[40] = i41.rare;
		notexist[40] = i41.notexist;
		
		name[41] = i42.name;
		name2[41] = i42.name2;
		type[41] = i42.type;
		point[41] = i42.point;
		rare[41] = i42.rare;
		notexist[41] = i42.notexist;
		
		
		name[42] = i43.name;
		name2[42] = i43.name2;
		type[42] = i43.type;
		point[42] = i43.point;
		rare[42] = i43.rare;
		notexist[42] = i43.notexist;
		
		name[43] = i44.name;
		name2[43] = i44.name2;
		type[43] = i44.type;
		point[43] = i44.point;
		rare[43] = i44.rare;
		notexist[43] = i44.notexist;

		name[44] = i45.name;
		name2[44] = i45.name2;
		type[44] = i45.type;
		point[44] = i45.point;
		rare[44] = i45.rare;
		notexist[44] = i45.notexist;
		
		name[45] = i46.name;
		name2[45] = i46.name2;
		type[45] = i46.type;
		point[45] = i46.point;
		rare[45] = i46.rare;
		notexist[45] = i46.notexist;
		
		name[46] = i47.name;
		name2[46] = i47.name2;
		type[46] = i47.type;
		point[46] = i47.point;
		rare[46] = i47.rare;
		notexist[46] = i47.notexist;
		
		name[47] = i48.name;
		name2[47] = i48.name2;
		type[47] = i48.type;
		point[47] = i48.point;
		rare[47] = i48.rare;
		notexist[47] = i48.notexist;
		
		name[48] = i49.name;
		name2[48] = i49.name2;
		type[48] = i49.type;
		point[48] = i49.point;
		rare[48] = i49.rare;
		notexist[48] = i49.notexist;
		
		name[49] = i50.name;
		name2[49] = i50.name2;
		type[49] = i50.type;
		point[49] = i50.point;
		rare[49] = i50.rare;
		notexist[49] = i50.notexist;
		
		name[50] = i51.name;
		name2[50] = i51.name2;
		type[50] = i51.type;
		point[50] = i51.point;
		rare[50] = i51.rare;
		notexist[50] = i51.notexist;
		
		name[51] = i52.name;
		name2[51] = i52.name2;
		type[51] = i52.type;
		point[51] = i52.point;
		rare[51] = i52.rare;
		notexist[51] = i52.notexist;
		
		name[52] = i53.name;
		name2[52] = i53.name2;
		type[52] = i53.type;
		point[52] = i53.point;
		rare[52] = i53.rare;
		notexist[52] = i53.notexist;
		
		name[53] = i54.name;
		name2[53] = i54.name2;
		type[53] = i54.type;
		point[53] = i54.point;
		rare[53] = i54.rare;
		notexist[53] = i54.notexist;
		
		name[54] = i55.name;
		name2[54] = i55.name2;
		type[54] = i55.type;
		point[54] = i55.point;
		rare[54] = i55.rare;
		notexist[54] = i55.notexist;
		
		name[55] = i56.name;
		name2[55] = i56.name2;
		type[55] = i56.type;
		point[55] = i56.point;
		rare[55] = i56.rare;
		notexist[55] = i56.notexist;
		
		name[56] = i57.name;
		name2[56] = i57.name2;
		type[56] = i57.type;
		point[56] = i57.point;
		rare[56] = i57.rare;
		notexist[56] = i57.notexist;

		name[57] = i58.name;
		name2[57] = i58.name2;
		type[57] = i58.type;
		point[57] = i58.point;
		rare[57] = i58.rare;
		notexist[57] = i58.notexist;
		
		name[58] = i59.name;
		name2[58] = i59.name2;
		type[58] = i59.type;
		point[58] = i59.point;
		rare[58] = i59.rare;
		notexist[58] = i59.notexist;

		name[59] = i60.name;
		name2[59] = i60.name2;
		type[59] = i60.type;
		point[59] = i60.point;
		rare[59] = i60.rare;
		notexist[59] = i60.notexist;

		name[60] = i61.name;
		name2[60] = i61.name2;
		type[60] = i61.type;
		point[60] = i61.point;
		rare[60] = i61.rare;
		notexist[60] = i61.notexist;
		
		name[61] = i62.name;
		name2[61] = i62.name2;
		type[61] = i62.type;
		point[61] = i62.point;
		rare[61] = i62.rare;
		notexist[61] = i62.notexist;
		
		name[62] = i63.name;
		name2[62] = i63.name2;
		type[62] = i63.type;
		point[62] = i63.point;
		rare[62] = i63.rare;
		notexist[62] = i63.notexist;
		
		name[63] = i64.name;
		name2[63] = i64.name2;
		type[63] = i64.type;
		point[63] = i64.point;
		rare[63] = i64.rare;
		notexist[63] = i64.notexist;
		
		name[64] = i65.name;
		name2[64] = i65.name2;
		type[64] = i65.type;
		point[64] = i65.point;
		rare[64] = i65.rare;
		notexist[64] = i65.notexist;
		
		name[65] = i66.name;
		name2[65] = i66.name2;
		type[65] = i66.type;
		point[65] = i66.point;
		rare[65] = i66.rare;
		notexist[65] = i66.notexist;
		
		name[66] = i67.name;
		name2[66] = i67.name2;
		type[66] = i67.type;
		point[66] = i67.point;
		rare[66] = i67.rare;
		notexist[66] = i67.notexist;
		
		name[67] = i68.name;
		name2[67] = i68.name2;
		type[67] = i68.type;
		point[67] = i68.point;
		rare[67] = i68.rare;
		notexist[67] = i68.notexist;		
		
		name[68] = i69.name;
		name2[68] = i69.name2;
		type[68] = i69.type;
		point[68] = i69.point;
		rare[68] = i69.rare;
		notexist[68] = i69.notexist;
		
		name[69] = i70.name;
		name2[69] = i70.name2;
		type[69] = i70.type;
		point[69] = i70.point;
		rare[69] = i70.rare;
		notexist[69] = i70.notexist;
		
		name[70] = i71.name;
		name2[70] = i71.name2;
		type[70] = i71.type;
		point[70] = i71.point;
		rare[70] = i71.rare;
		notexist[70] = i71.notexist;
		
		name[71] = i72.name;
		name2[71] = i72.name2;
		type[71] = i72.type;
		point[71] = i72.point;
		rare[71] = i72.rare;
		notexist[71] = i72.notexist;
		
		name[72] = i73.name;
		name2[72] = i73.name2;
		type[72] = i73.type;
		point[72] = i73.point;
		rare[72] = i73.rare;
		notexist[72] = i73.notexist;
		
		name[73] = i74.name;
		name2[73] = i74.name2;
		type[73] = i74.type;
		point[73] = i74.point;
		rare[73] = i74.rare;
		notexist[73] = i74.notexist;
		
		name[74] = i75.name;
		name2[74] = i75.name2;
		type[74] = i75.type;
		point[74] = i75.point;
		rare[74] = i75.rare;
		notexist[74] = i75.notexist;
		
		name[75] = i76.name;
		name2[75] = i76.name2;
		type[75] = i76.type;
		point[75] = i76.point;
		rare[75] = i76.rare;
		notexist[75] = i76.notexist;
		
		name[76] = i77.name;
		name2[76] = i77.name2;
		type[76] = i77.type;
		point[76] = i77.point;
		rare[76] = i77.rare;
		notexist[76] = i77.notexist;
		
		name[77] = i78.name;
		name2[77] = i78.name2;
		type[77] = i78.type;
		point[77] = i78.point;
		rare[77] = i78.rare;
		notexist[77] = i78.notexist;
		
		name[78] = i79.name;
		name2[78] = i79.name2;
		type[78] = i79.type;
		point[78] = i79.point;
		rare[78] = i79.rare;
		notexist[78] = i79.notexist;
		
		name[79] = i80.name;
		name2[79] = i80.name2;
		type[79] = i80.type;
		point[79] = i80.point;
		rare[79] = i80.rare;
		notexist[79] = i80.notexist;
		
		name[80] = i81.name;
		name2[80] = i81.name2;
		type[80] = i81.type;
		point[80] = i81.point;
		rare[80] = i81.rare;
		notexist[80] = i81.notexist;
		
		name[81] = i82.name;
		name2[81] = i82.name2;
		type[81] = i82.type;
		point[81] = i82.point;
		rare[81] = i82.rare;
		notexist[81] = i82.notexist;
		
		name[82] = i83.name;
		name2[82] = i83.name2;
		type[82] = i83.type;
		point[82] = i83.point;
		rare[82] = i83.rare;
		notexist[82] = i83.notexist;
		
		name[83] = i84.name;
		name2[83] = i84.name2;
		type[83] = i84.type;
		point[83] = i84.point;
		rare[83] = i84.rare;
		notexist[83] = i84.notexist;
		
		name[84] = i85.name;
		name2[84] = i85.name2;
		type[84] = i85.type;
		point[84] = i85.point;
		rare[84] = i85.rare;
		notexist[84] = i85.notexist;
		
		name[85] = i86.name;
		name2[85] = i86.name2;
		type[85] = i86.type;
		point[85] = i86.point;
		rare[85] = i86.rare;
		notexist[85] = i86.notexist;
		
		name[86] = i87.name;
		name2[86] = i87.name2;
		type[86] = i87.type;
		point[86] = i87.point;
		rare[86] = i87.rare;
		notexist[86] = i87.notexist;
		
		name[87] = i88.name;
		name2[87] = i88.name2;
		type[87] = i88.type;
		point[87] = i88.point;
		rare[87] = i88.rare;
		notexist[87] = i88.notexist;
		
		name[88] = i89.name;
		name2[88] = i89.name2;
		type[88] = i89.type;
		point[88] = i89.point;
		rare[88] = i89.rare;
		notexist[88] = i89.notexist;
		
		name[89] = i90.name;
		name2[89] = i90.name2;
		type[89] = i90.type;
		point[89] = i90.point;
		rare[89] = i90.rare;
		notexist[89] = i90.notexist;
		
		name[90] = i91.name;
		name2[90] = i91.name2;
		type[90] = i91.type;
		point[90] = i91.point;
		rare[90] = i91.rare;
		notexist[90] = i91.notexist;
		
		name[91] = i92.name;
		name2[91] = i92.name2;
		type[91] = i92.type;
		point[91] = i92.point;
		rare[91] = i92.rare;
		notexist[91] = i92.notexist;
		
		name[92] = i93.name;
		name2[92] = i93.name2;
		type[92] = i93.type;
		point[92] = i93.point;
		rare[92] = i93.rare;
		notexist[92] = i93.notexist;
		
		name[93] = i94.name;
		name2[93] = i94.name2;
		type[93] = i94.type;
		point[93] = i94.point;
		rare[93] = i94.rare;
		notexist[93] = i94.notexist;
		
		name[94] = i95.name;
		name2[94] = i95.name2;
		type[94] = i95.type;
		point[94] = i95.point;
		rare[94] = i95.rare;
		notexist[94] = i95.notexist;
		
		name[95] = i96.name;
		name2[95] = i96.name2;
		type[95] = i96.type;
		point[95] = i96.point;
		rare[95] = i96.rare;
		notexist[95] = i96.notexist;
		
		name[96] = i97.name;
		name2[96] = i97.name2;
		type[96] = i97.type;
		point[96] = i97.point;
		rare[96] = i97.rare;
		notexist[96] = i97.notexist;
		
		name[97] = i98.name;
		name2[97] = i98.name2;
		type[97] = i98.type;
		point[97] = i98.point;
		rare[97] = i98.rare;
		notexist[97] = i98.notexist;
		
		name[98] = i99.name;
		name2[98] = i99.name2;
		type[98] = i99.type;
		point[98] = i99.point;
		rare[98] = i99.rare;
		notexist[98] = i99.notexist;
		
		name[99] = i100.name;
		name2[99] = i100.name2;
		type[99] = i100.type;
		point[99] = i100.point;
		rare[99] = i100.rare;
		notexist[99] = i100.notexist;
		
		name[100] = i101.name;
		name2[100] = i101.name2;
		type[100] = i101.type;
		point[100] = i101.point;
		rare[100] = i101.rare;
		notexist[100] = i101.notexist;
		
		name[101] = i102.name;
		name2[101] = i102.name2;
		type[101] = i102.type;
		point[101] = i102.point;
		rare[101] = i102.rare;
		notexist[101] = i102.notexist;
		
		name[102] = i103.name;
		name2[102] = i103.name2;
		type[102] = i103.type;
		point[102] = i103.point;
		rare[102] = i103.rare;
		notexist[102] = i103.notexist;
		
		name[103] = i104.name;
		name2[103] = i104.name2;
		type[103] = i104.type;
		point[103] = i104.point;
		rare[103] = i104.rare;
		notexist[103] = i104.notexist;
		
		name[104] = i105.name;
		name2[104] = i105.name2;
		type[104] = i105.type;
		point[104] = i105.point;
		rare[104] = i105.rare;
		notexist[104] = i105.notexist;
		
		name[105] = i106.name;
		name2[105] = i106.name2;
		type[105] = i106.type;
		point[105] = i106.point;
		rare[105] = i106.rare;
		notexist[105] = i106.notexist;
		
		name[106] = i107.name;
		name2[106] = i107.name2;
		type[106] = i107.type;
		point[106] = i107.point;
		rare[106] = i107.rare;
		notexist[106] = i107.notexist;
		
		name[107] = i108.name;
		name2[107] = i108.name2;
		type[107] = i108.type;
		point[107] = i108.point;
		rare[107] = i108.rare;
		notexist[107] = i108.notexist;

		name[108] = i109.name;
		name2[108] = i109.name2;
		type[108] = i109.type;
		point[108] = i109.point;
		rare[108] = i109.rare;
		notexist[108] = i109.notexist;
		
		name[109] = i110.name;
		name2[109] = i110.name2;
		type[109] = i110.type;
		point[109] = i110.point;
		rare[109] = i110.rare;
		notexist[109] = i110.notexist;
		
		name[110] = i111.name;
		name2[110] = i111.name2;
		type[110] = i111.type;
		point[110] = i111.point;
		rare[110] = i111.rare;
		notexist[110] = i111.notexist;
		
		name[111] = i112.name;
		name2[111] = i112.name2;
		type[111] = i112.type;
		point[111] = i112.point;
		rare[111] = i112.rare;
		notexist[111] = i112.notexist;
		
		name[112] = i113.name;
		name2[112] = i113.name2;
		type[112] = i113.type;
		point[112] = i113.point;
		rare[112] = i113.rare;
		notexist[112] = i113.notexist;
		
		name[113] = i114.name;
		name2[113] = i114.name2;
		type[113] = i114.type;
		point[113] = i114.point;
		rare[113] = i114.rare;
		notexist[113] = i114.notexist;
		
		name[114] = i115.name;
		name2[114] = i115.name2;
		type[114] = i115.type;
		point[114] = i115.point;
		rare[114] = i115.rare;
		notexist[114] = i115.notexist;
		
		name[115] = i116.name;
		name2[115] = i116.name2;
		type[115] = i116.type;
		point[115] = i116.point;
		rare[115] = i116.rare;
		notexist[115] = i116.notexist;
		
		name[116] = i117.name;
		name2[116] = i117.name2;
		type[116] = i117.type;
		point[116] = i117.point;
		rare[116] = i117.rare;
		notexist[116] = i117.notexist;		
		
		name[117] = i118.name;
		name2[117] = i118.name2;
		type[117] = i118.type;
		point[117] = i118.point;
		rare[117] = i118.rare;
		notexist[117] = i118.notexist;
		
		name[118] = i119.name;
		name2[118] = i119.name2;
		type[118] = i119.type;
		point[118] = i119.point;
		rare[118] = i119.rare;
		notexist[118] = i119.notexist;
		
		name[119] = i120.name;
		name2[119] = i120.name2;
		type[119] = i120.type;
		point[119] = i120.point;
		rare[119] = i120.rare;
		notexist[119] = i120.notexist;
		
		name[120] = i121.name;
		name2[120] = i121.name2;
		type[120] = i121.type;
		point[120] = i121.point;
		rare[120] = i121.rare;
		notexist[120] = i121.notexist;
		
		name[121] = i122.name;
		name2[121] = i122.name2;
		type[121] = i122.type;
		point[121] = i122.point;
		rare[121] = i122.rare;
		notexist[121] = i122.notexist;
		
		name[122] = i123.name;
		name2[122] = i123.name2;
		type[122] = i123.type;
		point[122] = i123.point;
		rare[122] = i123.rare;
		notexist[122] = i123.notexist;
		
		name[123] = i124.name;
		name2[123] = i124.name2;
		type[123] = i124.type;
		point[123] = i124.point;
		rare[123] = i124.rare;
		notexist[123] = i124.notexist;
		
		name[124] = i125.name;
		name2[124] = i125.name2;
		type[124] = i125.type;
		point[124] = i125.point;
		rare[124] = i125.rare;
		notexist[124] = i125.notexist;
		
		name[125] = i126.name;
		name2[125] = i126.name2;
		type[125] = i126.type;
		point[125] = i126.point;
		rare[125] = i126.rare;
		notexist[125] = i126.notexist;
		
		name[126] = i127.name;
		name2[126] = i127.name2;
		type[126] = i127.type;
		point[126] = i127.point;
		rare[126] = i127.rare;
		notexist[126] = i127.notexist;
		
		name[127] = i128.name;
		name2[127] = i128.name2;
		type[127] = i128.type;
		point[127] = i128.point;
		rare[127] = i128.rare;
		notexist[127] = i128.notexist;
		
		name[128] = i129.name;
		name2[128] = i129.name2;
		type[128] = i129.type;
		point[128] = i129.point;
		rare[128] = i129.rare;
		notexist[128] = i129.notexist;
		
		name[129] = i130.name;
		name2[129] = i130.name2;
		type[129] = i130.type;
		point[129] = i130.point;
		rare[129] = i130.rare;
		notexist[129] = i130.notexist;
		
		name[130] = i131.name;
		name2[130] = i131.name2;
		type[130] = i131.type;
		point[130] = i131.point;
		rare[130] = i131.rare;
		notexist[130] = i131.notexist;
		
		name[131] = i132.name;
		name2[131] = i132.name2;
		type[131] = i132.type;
		point[131] = i132.point;
		rare[131] = i132.rare;
		notexist[131] = i132.notexist;
		
		name[132] = i133.name;
		name2[132] = i133.name2;
		type[132] = i133.type;
		point[132] = i133.point;
		rare[132] = i133.rare;
		notexist[132] = i133.notexist;
		
		name[133] = i134.name;
		name2[133] = i134.name2;
		type[133] = i134.type;
		point[133] = i134.point;
		rare[133] = i134.rare;
		notexist[133] = i134.notexist;
		
		name[134] = i135.name;
		name2[134] = i135.name2;
		type[134] = i135.type;
		point[134] = i135.point;
		rare[134] = i135.rare;
		notexist[134] = i135.notexist;
		
		name[135] = i136.name;
		name2[135] = i136.name2;
		type[135] = i136.type;
		point[135] = i136.point;
		rare[135] = i136.rare;
		notexist[135] = i136.notexist;
		
		name[136] = i137.name;
		name2[136] = i137.name2;
		type[136] = i137.type;
		point[136] = i137.point;
		rare[136] = i137.rare;
		notexist[136] = i137.notexist;
		
		name[137] = i138.name;
		name2[137] = i138.name2;
		type[137] = i138.type;
		point[137] = i138.point;
		rare[137] = i138.rare;
		notexist[137] = i138.notexist;
		
		name[138] = i139.name;
		name2[138] = i139.name2;
		type[138] = i139.type;
		point[138] = i139.point;
		rare[138] = i139.rare;
		notexist[138] = i139.notexist;
		
		name[139] = i140.name;
		name2[139] = i140.name2;
		type[139] = i140.type;
		point[139] = i140.point;
		rare[139] = i140.rare;
		notexist[139] = i140.notexist;
		
		name[140] = i141.name;
		name2[140] = i141.name2;
		type[140] = i141.type;
		point[140] = i141.point;
		rare[140] = i141.rare;
		notexist[140] = i141.notexist;
		
		name[141] = i142.name;
		name2[141] = i142.name2;
		type[141] = i142.type;
		point[141] = i142.point;
		rare[141] = i142.rare;
		notexist[141] = i142.notexist;
		
		name[142] = i143.name;
		name2[142] = i143.name2;
		type[142] = i143.type;
		point[142] = i143.point;
		rare[142] = i143.rare;
		notexist[142] = i143.notexist;
		
		name[143] = i144.name;
		name2[143] = i144.name2;
		type[143] = i144.type;
		point[143] = i144.point;
		rare[143] = i144.rare;
		notexist[143] = i144.notexist;		
		
		name[144] = i145.name;
		name2[144] = i145.name2;
		type[144] = i145.type;
		point[144] = i145.point;
		rare[144] = i145.rare;
		notexist[144] = i145.notexist;
		
		name[145] = i146.name;
		name2[145] = i146.name2;
		type[145] = i146.type;
		point[145] = i146.point;
		rare[145] = i146.rare;
		notexist[145] = i146.notexist;
		
		name[146] = i147.name;
		name2[146] = i147.name2;
		type[146] = i147.type;
		point[146] = i147.point;
		rare[146] = i147.rare;
		notexist[146] = i147.notexist;
		
		name[147] = i148.name;
		name2[147] = i148.name2;
		type[147] = i148.type;
		point[147] = i148.point;
		rare[147] = i148.rare;
		notexist[147] = i148.notexist;
		
		name[148] = i149.name;
		name2[148] = i149.name2;
		type[148] = i149.type;
		point[148] = i149.point;
		rare[148] = i149.rare;
		notexist[148] = i149.notexist;
		
		name[149] = i150.name;
		name2[149] = i150.name2;
		type[149] = i150.type;
		point[149] = i150.point;
		rare[149] = i150.rare;
		notexist[149] = i150.notexist;
		
		name[150] = i151.name;
		name2[150] = i151.name2;
		type[150] = i151.type;
		point[150] = i151.point;
		rare[150] = i151.rare;
		notexist[150] = i151.notexist;
		
		name[151] = i152.name;
		name2[151] = i152.name2;
		type[151] = i152.type;
		point[151] = i152.point;
		rare[151] = i152.rare;
		notexist[151] = i152.notexist;
		
		name[152] = i153.name;
		name2[152] = i153.name2;
		type[152] = i153.type;
		point[152] = i153.point;
		rare[152] = i153.rare;
		notexist[152] = i153.notexist;
		
		name[153] = i154.name;
		name2[153] = i154.name2;
		type[153] = i154.type;
		point[153] = i154.point;
		rare[153] = i154.rare;
		notexist[153] = i154.notexist;
		
		name[154] = i155.name;
		name2[154] = i155.name2;
		type[154] = i155.type;
		point[154] = i155.point;
		rare[154] = i155.rare;
		notexist[154] = i155.notexist;
		
		name[155] = i156.name;
		name2[155] = i156.name2;
		type[155] = i156.type;
		point[155] = i156.point;
		rare[155] = i156.rare;
		notexist[155] = i156.notexist;
		
		name[156] = i157.name;
		name2[156] = i157.name2;
		type[156] = i157.type;
		point[156] = i157.point;
		rare[156] = i157.rare;
		notexist[156] = i157.notexist;
		
		name[157] = i158.name;
		name2[157] = i158.name2;
		type[157] = i158.type;
		point[157] = i158.point;
		rare[157] = i158.rare;
		notexist[157] = i158.notexist;
		
		name[158] = i159.name;
		name2[158] = i159.name2;
		type[158] = i159.type;
		point[158] = i159.point;
		rare[158] = i159.rare;
		notexist[158] = i159.notexist;		
		
		name[159] = i160.name;
		name2[159] = i160.name2;
		type[159] = i160.type;
		point[159] = i160.point;
		rare[159] = i160.rare;
		notexist[159] = i160.notexist;
		
		name[160] = i161.name;
		name2[160] = i161.name2;
		type[160] = i161.type;
		point[160] = i161.point;
		rare[160] = i161.rare;
		notexist[160] = i161.notexist;
		
		name[161] = i162.name;
		name2[161] = i162.name2;
		type[161] = i162.type;
		point[161] = i162.point;
		rare[161] = i162.rare;
		notexist[161] = i162.notexist;
		
		name[162] = i163.name;
		name2[162] = i163.name2;
		type[162] = i163.type;
		point[162] = i163.point;
		rare[162] = i163.rare;
		notexist[162] = i163.notexist;
		
		name[163] = i164.name;
		name2[163] = i164.name2;
		type[163] = i164.type;
		point[163] = i164.point;
		rare[163] = i164.rare;
		notexist[163] = i164.notexist;
		
		name[164] = i165.name;
		name2[164] = i165.name2;
		type[164] = i165.type;
		point[164] = i165.point;
		rare[164] = i165.rare;
		notexist[164] = i165.notexist;
		
		name[165] = i166.name;
		name2[165] = i166.name2;
		type[165] = i166.type;
		point[165] = i166.point;
		rare[165] = i166.rare;
		notexist[165] = i166.notexist;
		
		name[166] = i167.name;
		name2[166] = i167.name2;
		type[166] = i167.type;
		point[166] = i167.point;
		rare[166] = i167.rare;
		notexist[166] = i167.notexist;
		
		name[167] = i168.name;
		name2[167] = i168.name2;
		type[167] = i168.type;
		point[167] = i168.point;
		rare[167] = i168.rare;
		notexist[167] = i168.notexist;
		
		name[168] = i169.name;
		name2[168] = i169.name2;
		type[168] = i169.type;
		point[168] = i169.point;
		rare[168] = i169.rare;
		notexist[168] = i169.notexist;
		
		name[169] = i170.name;
		name2[169] = i170.name2;
		type[169] = i170.type;
		point[169] = i170.point;
		rare[169] = i170.rare;
		notexist[169] = i170.notexist;
		
		name[170] = i171.name;
		name2[170] = i171.name2;
		type[170] = i171.type;
		point[170] = i171.point;
		rare[170] = i171.rare;
		notexist[170] = i171.notexist;
		
		name[171] = i172.name;
		name2[171] = i172.name2;
		type[171] = i172.type;
		point[171] = i172.point;
		rare[171] = i172.rare;
		notexist[171] = i172.notexist;
		
		name[172] = i173.name;
		name2[172] = i173.name2;
		type[172] = i173.type;
		point[172] = i173.point;
		rare[172] = i173.rare;
		notexist[172] = i173.notexist;
		
		name[173] = i174.name;
		name2[173] = i174.name2;
		type[173] = i174.type;
		point[173] = i174.point;
		rare[173] = i174.rare;
		notexist[173] = i174.notexist;
		
		name[174] = i175.name;
		name2[174] = i175.name2;
		type[174] = i175.type;
		point[174] = i175.point;
		rare[174] = i175.rare;
		notexist[174] = i175.notexist;		
		
		name[175] = i176.name;
		name2[175] = i176.name2;
		type[175] = i176.type;
		point[175] = i176.point;
		rare[175] = i176.rare;
		notexist[175] = i176.notexist;
		
		name[176] = i177.name;
		name2[176] = i177.name2;
		type[176] = i177.type;
		point[176] = i177.point;
		rare[176] = i177.rare;
		notexist[176] = i177.notexist;
		
		name[177] = i178.name;
		name2[177] = i178.name2;
		type[177] = i178.type;
		point[177] = i178.point;
		rare[177] = i178.rare;
		notexist[177] = i178.notexist;
		
		name[178] = i179.name;
		name2[178] = i179.name2;
		type[178] = i179.type;
		point[178] = i179.point;
		rare[178] = i179.rare;
		notexist[178] = i179.notexist;
		
		name[179] = i180.name;
		name2[179] = i180.name2;
		type[179] = i180.type;
		point[179] = i180.point;
		rare[179] = i180.rare;
		notexist[179] = i180.notexist;
		
		name[180] = i181.name;
		name2[180] = i181.name2;
		type[180] = i181.type;
		point[180] = i181.point;
		rare[180] = i181.rare;
		notexist[180] = i181.notexist;
		
		name[181] = i182.name;
		name2[181] = i182.name2;
		type[181] = i182.type;
		point[181] = i182.point;
		rare[181] = i182.rare;
		notexist[181] = i182.notexist;
		
		name[182] = i183.name;
		name2[182] = i183.name2;
		type[182] = i183.type;
		point[182] = i183.point;
		rare[182] = i183.rare;
		notexist[182] = i183.notexist;
		
		name[183] = i184.name;
		name2[183] = i184.name2;
		type[183] = i184.type;
		point[183] = i184.point;
		rare[183] = i184.rare;
		notexist[183] = i184.notexist;
		
		name[184] = i185.name;
		name2[184] = i185.name2;
		type[184] = i185.type;
		point[184] = i185.point;
		rare[184] = i185.rare;
		notexist[184] = i185.notexist;		
		
		name[185] = i186.name;
		name2[185] = i186.name2;
		type[185] = i186.type;
		point[185] = i186.point;
		rare[185] = i186.rare;
		notexist[185] = i186.notexist;
		
		name[186] = i187.name;
		name2[186] = i187.name2;
		type[186] = i187.type;
		point[186] = i187.point;
		rare[186] = i187.rare;
		notexist[186] = i187.notexist;
		
		name[187] = i188.name;
		name2[187] = i188.name2;
		type[187] = i188.type;
		point[187] = i188.point;
		rare[187] = i188.rare;
		notexist[187] = i188.notexist;
		
		name[188] = i189.name;
		name2[188] = i189.name2;
		type[188] = i189.type;
		point[188] = i189.point;
		rare[188] = i189.rare;
		notexist[188] = i189.notexist;
		
		name[189] = i190.name;
		name2[189] = i190.name2;
		type[189] = i190.type;
		point[189] = i190.point;
		rare[189] = i190.rare;
		notexist[189] = i190.notexist;
		
		name[190] = i191.name;
		name2[190] = i191.name2;
		type[190] = i191.type;
		point[190] = i191.point;
		rare[190] = i191.rare;
		notexist[190] = i191.notexist;
		
		name[191] = i192.name;
		name2[191] = i192.name2;
		type[191] = i192.type;
		point[191] = i192.point;
		rare[191] = i192.rare;
		notexist[191] = i192.notexist;
		
		name[192] = i193.name;
		name2[192] = i193.name2;
		type[192] = i193.type;
		point[192] = i193.point;
		rare[192] = i193.rare;
		notexist[192] = i193.notexist;
		
		name[193] = i194.name;
		name2[193] = i194.name2;
		type[193] = i194.type;
		point[193] = i194.point;
		rare[193] = i194.rare;
		notexist[193] = i194.notexist;		
		
		name[194] = i195.name;
		name2[194] = i195.name2;
		type[194] = i195.type;
		point[194] = i195.point;
		rare[194] = i195.rare;
		notexist[194] = i195.notexist;
		
		name[195] = i196.name;
		name2[195] = i196.name2;
		type[195] = i196.type;
		point[195] = i196.point;
		rare[195] = i196.rare;
		notexist[195] = i196.notexist;
		
		name[196] = i197.name;
		name2[196] = i197.name2;
		type[196] = i197.type;
		point[196] = i197.point;
		rare[196] = i197.rare;
		notexist[196] = i197.notexist;
		
		name[197] = i198.name;
		name2[197] = i198.name2;
		type[197] = i198.type;
		point[197] = i198.point;
		rare[197] = i198.rare;
		notexist[197] = i198.notexist;
		
		name[198] = i199.name;
		name2[198] = i199.name2;
		type[198] = i199.type;
		point[198] = i199.point;
		rare[198] = i199.rare;
		notexist[198] = i199.notexist;
		
		name[199] = i200.name;
		name2[199] = i200.name2;
		type[199] = i200.type;
		point[199] = i200.point;
		rare[199] = i200.rare;
		notexist[199] = i200.notexist;
		
		name[200] = i201.name;
		name2[200] = i201.name2;
		type[200] = i201.type;
		point[200] = i201.point;
		rare[200] = i201.rare;
		notexist[200] = i201.notexist;
		
		name[201] = i202.name;
		name2[201] = i202.name2;
		type[201] = i202.type;
		point[201] = i202.point;
		rare[201] = i202.rare;
		notexist[201] = i202.notexist;
		
		name[202] = i203.name;
		name2[202] = i203.name2;
		type[202] = i203.type;
		point[202] = i203.point;
		rare[202] = i203.rare;
		notexist[202] = i203.notexist;
		
		name[203] = i204.name;
		name2[203] = i204.name2;
		type[203] = i204.type;
		point[203] = i204.point;
		rare[203] = i204.rare;
		notexist[203] = i204.notexist;
		
		name[204] = i205.name;
		name2[204] = i205.name2;
		type[204] = i205.type;
		point[204] = i205.point;
		rare[204] = i205.rare;
		notexist[204] = i205.notexist;		
		
		name[205] = i206.name;
		name2[205] = i206.name2;
		type[205] = i206.type;
		point[205] = i206.point;
		rare[205] = i206.rare;
		notexist[205] = i206.notexist;
		
		name[206] = i207.name;
		name2[206] = i207.name2;
		type[206] = i207.type;
		point[206] = i207.point;
		rare[206] = i207.rare;
		notexist[206] = i207.notexist;
		
		name[207] = i208.name;
		name2[207] = i208.name2;
		type[207] = i208.type;
		point[207] = i208.point;
		rare[207] = i208.rare;
		notexist[207] = i208.notexist;
		
		name[208] = i209.name;
		name2[208] = i209.name2;
		type[208] = i209.type;
		point[208] = i209.point;
		rare[208] = i209.rare;
		notexist[208] = i209.notexist;
		
		name[209] = i210.name;
		name2[209] = i210.name2;
		type[209] = i210.type;
		point[209] = i210.point;
		rare[209] = i210.rare;
		notexist[209] = i210.notexist;
		
		name[210] = i211.name;
		name2[210] = i211.name2;
		type[210] = i211.type;
		point[210] = i211.point;
		rare[210] = i211.rare;
		notexist[210] = i211.notexist;
		
		name[211] = i212.name;
		name2[211] = i212.name2;
		type[211] = i212.type;
		point[211] = i212.point;
		rare[211] = i212.rare;
		notexist[211] = i212.notexist;
		
		name[212] = i213.name;
		name2[212] = i213.name2;
		type[212] = i213.type;
		point[212] = i213.point;
		rare[212] = i213.rare;
		notexist[212] = i213.notexist;
		
		name[213] = i214.name;
		name2[213] = i214.name2;
		type[213] = i214.type;
		point[213] = i214.point;
		rare[213] = i214.rare;
		notexist[213] = i214.notexist;
		
		name[214] = i215.name;
		name2[214] = i215.name2;
		type[214] = i215.type;
		point[214] = i215.point;
		rare[214] = i215.rare;
		notexist[214] = i215.notexist;
		
		name[215] = i216.name;
		name2[215] = i216.name2;
		type[215] = i216.type;
		point[215] = i216.point;
		rare[215] = i216.rare;
		notexist[215] = i216.notexist;
		
		name[216] = i217.name;
		name2[216] = i217.name2;
		type[216] = i217.type;
		point[216] = i217.point;
		rare[216] = i217.rare;
		notexist[216] = i217.notexist;
		
		name[217] = i218.name;
		name2[217] = i218.name2;
		type[217] = i218.type;
		point[217] = i218.point;
		rare[217] = i218.rare;
		notexist[217] = i218.notexist;
		
		name[218] = i219.name;
		name2[218] = i219.name2;
		type[218] = i219.type;
		point[218] = i219.point;
		rare[218] = i219.rare;
		notexist[218] = i219.notexist;
		
		name[219] = i220.name;
		name2[219] = i220.name2;
		type[219] = i220.type;
		point[219] = i220.point;
		rare[219] = i220.rare;
		notexist[219] = i220.notexist;
		
		name[220] = i221.name;
		name2[220] = i221.name2;
		type[220] = i221.type;
		point[220] = i221.point;
		rare[220] = i221.rare;
		notexist[220] = i221.notexist;
		
		name[221] = i222.name;
		name2[221] = i222.name2;
		type[221] = i222.type;
		point[221] = i222.point;
		rare[221] = i222.rare;
		notexist[221] = i222.notexist;
		
		name[222] = i223.name;
		name2[222] = i223.name2;
		type[222] = i223.type;
		point[222] = i223.point;
		rare[222] = i223.rare;
		notexist[222] = i223.notexist;		
		
		name[223] = i224.name;
		name2[223] = i224.name2;
		type[223] = i224.type;
		point[223] = i224.point;
		rare[223] = i224.rare;
		notexist[223] = i224.notexist;
		
		name[224] = i225.name;
		name2[224] = i225.name2;
		type[224] = i225.type;
		point[224] = i225.point;
		rare[224] = i225.rare;
		notexist[224] = i225.notexist;
		
		name[225] = i226.name;
		name2[225] = i226.name2;
		type[225] = i226.type;
		point[225] = i226.point;
		rare[225] = i226.rare;
		notexist[225] = i226.notexist;
		
		name[226] = i227.name;
		name2[226] = i227.name2;
		type[226] = i227.type;
		point[226] = i227.point;
		rare[226] = i227.rare;
		notexist[226] = i227.notexist;
		
		name[227] = i228.name;
		name2[227] = i228.name2;
		type[227] = i228.type;
		point[227] = i228.point;
		rare[227] = i228.rare;
		notexist[227] = i228.notexist;
		
		name[228] = i229.name;
		name2[228] = i229.name2;
		type[228] = i229.type;
		point[228] = i229.point;
		rare[228] = i229.rare;
		notexist[228] = i229.notexist;
		
		name[229] = i230.name;
		name2[229] = i230.name2;
		type[229] = i230.type;
		point[229] = i230.point;
		rare[229] = i230.rare;
		notexist[229] = i230.notexist;
		
		name[230] = i231.name;
		name2[230] = i231.name2;
		type[230] = i231.type;
		point[230] = i231.point;
		rare[230] = i231.rare;
		notexist[230] = i231.notexist;
		
		name[231] = i232.name;
		name2[231] = i232.name2;
		type[231] = i232.type;
		point[231] = i232.point;
		rare[231] = i232.rare;
		notexist[231] = i232.notexist;
		
		name[232] = i233.name;
		name2[232] = i233.name2;
		type[232] = i233.type;
		point[232] = i233.point;
		rare[232] = i233.rare;
		notexist[232] = i233.notexist;
		
		name[233] = i234.name;
		name2[233] = i234.name2;
		type[233] = i234.type;
		point[233] = i234.point;
		rare[233] = i234.rare;
		notexist[233] = i234.notexist;
		
		name[234] = i235.name;
		name2[234] = i235.name2;
		type[234] = i235.type;
		point[234] = i235.point;
		rare[234] = i235.rare;
		notexist[234] = i235.notexist;
		
		name[235] = i236.name;
		name2[235] = i236.name2;
		type[235] = i236.type;
		point[235] = i236.point;
		rare[235] = i236.rare;
		notexist[235] = i236.notexist;
		
		name[236] = i237.name;
		name2[236] = i237.name2;
		type[236] = i237.type;
		point[236] = i237.point;
		rare[236] = i237.rare;
		notexist[236] = i237.notexist;
		
		name[237] = i238.name;
		name2[237] = i238.name2;
		type[237] = i238.type;
		point[237] = i238.point;
		rare[237] = i238.rare;
		notexist[237] = i238.notexist;
		
		name[238] = i239.name;
		name2[238] = i239.name2;
		type[238] = i239.type;
		point[238] = i239.point;
		rare[238] = i239.rare;
		notexist[238] = i239.notexist;
		
		name[239] = i240.name;
		name2[239] = i240.name2;
		type[239] = i240.type;
		point[239] = i240.point;
		rare[239] = i240.rare;
		notexist[239] = i240.notexist;
		
		name[240] = i241.name;
		name2[240] = i241.name2;
		type[240] = i241.type;
		point[240] = i241.point;
		rare[240] = i241.rare;
		notexist[240] = i241.notexist;
		
		name[241] = i242.name;
		name2[241] = i242.name2;
		type[241] = i242.type;
		point[241] = i242.point;
		rare[241] = i242.rare;
		notexist[241] = i242.notexist;
		
		name[242] = i243.name;
		name2[242] = i243.name2;
		type[242] = i243.type;
		point[242] = i243.point;
		rare[242] = i243.rare;
		notexist[242] = i243.notexist;
		
		name[243] = i244.name;
		name2[243] = i244.name2;
		type[243] = i244.type;
		point[243] = i244.point;
		rare[243] = i244.rare;
		notexist[243] = i244.notexist;
		
		name[244] = i245.name;
		name2[244] = i245.name2;
		type[244] = i245.type;
		point[244] = i245.point;
		rare[244] = i245.rare;
		notexist[244] = i245.notexist;
		
		name[245] = i246.name;
		name2[245] = i246.name2;
		type[245] = i246.type;
		point[245] = i246.point;
		rare[245] = i246.rare;
		notexist[245] = i246.notexist;
		
		name[246] = i247.name;
		name2[246] = i247.name2;
		type[246] = i247.type;
		point[246] = i247.point;
		rare[246] = i247.rare;
		notexist[246] = i247.notexist;
		
		name[247] = i248.name;
		name2[247] = i248.name2;
		type[247] = i248.type;
		point[247] = i248.point;
		rare[247] = i248.rare;
		notexist[247] = i248.notexist;
		
		name[248] = i249.name;
		name2[248] = i249.name2;
		type[248] = i249.type;
		point[248] = i249.point;
		rare[248] = i249.rare;
		notexist[248] = i249.notexist;
		
		name[249] = i250.name;
		name2[249] = i250.name2;
		type[249] = i250.type;
		point[249] = i250.point;
		rare[249] = i250.rare;
		notexist[249] = i250.notexist;
		
		name[250] = i251.name;
		name2[250] = i251.name2;
		type[250] = i251.type;
		point[250] = i251.point;
		rare[250] = i251.rare;
		notexist[250] = i251.notexist;		
		
		name[251] = i252.name;
		name2[251] = i252.name2;
		type[251] = i252.type;
		point[251] = i252.point;
		rare[251] = i252.rare;
		notexist[251] = i252.notexist;
		
		name[252] = i253.name;
		name2[252] = i253.name2;
		type[252] = i253.type;
		point[252] = i253.point;
		rare[252] = i253.rare;
		notexist[252] = i253.notexist;
		
		name[253] = i254.name;
		name2[253] = i254.name2;
		type[253] = i254.type;
		point[253] = i254.point;
		rare[253] = i254.rare;
		notexist[253] = i254.notexist;
		
		name[254] = i255.name;
		name2[254] = i255.name2;
		type[254] = i255.type;
		point[254] = i255.point;
		rare[254] = i255.rare;
		
		name[255] = i256.name;
		name2[255] = i256.name2;
		type[255] = i256.type;
		point[255] = i256.point;
		rare[255] = i256.rare;
		notexist[255] = i256.notexist;
		
		name[256] = i257.name;
		name2[256] = i257.name2;
		type[256] = i257.type;
		point[256] = i257.point;
		rare[256] = i257.rare;
		notexist[256] = i257.notexist;
		
		name[257] = i258.name;
		name2[257] = i258.name2;
		type[257] = i258.type;
		point[257] = i258.point;
		rare[257] = i258.rare;
		notexist[257] = i258.notexist;
		
		name[258] = i259.name;
		name2[258] = i259.name2;
		type[258] = i259.type;
		point[258] = i259.point;
		rare[258] = i259.rare;
		notexist[258] = i259.notexist;
		
		name[259] = i260.name;
		name2[259] = i260.name2;
		type[259] = i260.type;
		point[259] = i260.point;
		rare[259] = i260.rare;
		notexist[259] = i260.notexist;
		
		name[260] = i261.name;
		name2[260] = i261.name2;
		type[260] = i261.type;
		point[260] = i261.point;
		rare[260] = i261.rare;
		notexist[260] = i261.notexist;
		
		name[261] = i262.name;
		name2[261] = i262.name2;
		type[261] = i262.type;
		point[261] = i262.point;
		rare[261] = i262.rare;
		notexist[261] = i262.notexist;
		
		name[262] = i263.name;
		name2[262] = i263.name2;
		type[262] = i263.type;
		point[262] = i263.point;
		rare[262] = i263.rare;
		notexist[262] = i263.notexist;
		
		name[263] = i264.name;
		name2[263] = i264.name2;
		type[263] = i264.type;
		point[263] = i264.point;
		rare[263] = i264.rare;
		notexist[263] = i264.notexist;
		
		name[264] = i265.name;
		name2[264] = i265.name2;
		type[264] = i265.type;
		point[264] = i265.point;
		rare[264] = i265.rare;
		notexist[264] = i265.notexist;
		
		name[265] = i266.name;
		name2[265] = i266.name2;
		type[265] = i266.type;
		point[265] = i266.point;
		rare[265] = i266.rare;
		notexist[265] = i266.notexist;		
		
		name[266] = i267.name;
		name2[266] = i267.name2;
		type[266] = i267.type;
		point[266] = i267.point;
		rare[266] = i267.rare;
		notexist[266] = i267.notexist;
		
		name[267] = i268.name;
		name2[267] = i268.name2;
		type[267] = i268.type;
		point[267] = i268.point;
		rare[267] = i268.rare;
		notexist[267] = i268.notexist;
		
		name[268] = i269.name;
		name2[268] = i269.name2;
		type[268] = i269.type;
		point[268] = i269.point;
		rare[268] = i269.rare;
		notexist[268] = i269.notexist;
		
		name[269] = i270.name;
		name2[269] = i270.name2;
		type[269] = i270.type;
		point[269] = i270.point;
		rare[269] = i270.rare;
		notexist[269] = i270.notexist;
		
		name[270] = i271.name;
		name2[270] = i271.name2;
		type[270] = i271.type;
		point[270] = i271.point;
		rare[270] = i271.rare;
		notexist[270] = i271.notexist;
		
		name[271] = i272.name;
		name2[271] = i272.name2;
		type[271] = i272.type;
		point[271] = i272.point;
		rare[271] = i272.rare;
		notexist[271] = i272.notexist;
		
		name[272] = i273.name;
		name2[272] = i273.name2;
		type[272] = i273.type;
		point[272] = i273.point;
		rare[272] = i273.rare;
		notexist[272] = i273.notexist;
		
		name[273] = i274.name;
		name2[273] = i274.name2;
		type[273] = i274.type;
		point[273] = i274.point;
		rare[273] = i274.rare;
		notexist[273] = i274.notexist;
		
		name[274] = i275.name;
		name2[274] = i275.name2;
		type[274] = i275.type;
		point[274] = i275.point;
		rare[274] = i275.rare;
		notexist[274] = i275.notexist;
		
		name[275] = i276.name;
		name2[275] = i276.name2;
		type[275] = i276.type;
		point[275] = i276.point;
		rare[275] = i276.rare;
		notexist[275] = i276.notexist;
		
		name[276] = i277.name;
		name2[276] = i277.name2;
		type[276] = i277.type;
		point[276] = i277.point;
		rare[276] = i277.rare;
		notexist[276] = i277.notexist;
		
		name[277] = i278.name;
		name2[277] = i278.name2;
		type[277] = i278.type;
		point[277] = i278.point;
		rare[277] = i278.rare;
		notexist[277] = i278.notexist;
		
		name[278] = i279.name;
		name2[278] = i279.name2;
		type[278] = i279.type;
		point[278] = i279.point;
		rare[278] = i279.rare;
		notexist[278] = i279.notexist;
		
		name[279] = i280.name;
		name2[279] = i280.name2;
		type[279] = i280.type;
		point[279] = i280.point;
		rare[279] = i280.rare;
		notexist[279] = i280.notexist;
		
		name[280] = i281.name;
		name2[280] = i281.name2;
		type[280] = i281.type;
		point[280] = i281.point;
		rare[280] = i281.rare;
		notexist[280] = i281.notexist;
		
		name[281] = i282.name;
		name2[281] = i282.name2;
		type[281] = i282.type;
		point[281] = i282.point;
		rare[281] = i282.rare;
		notexist[281] = i282.notexist;
		
		name[282] = i283.name;
		name2[282] = i283.name2;
		type[282] = i283.type;
		point[282] = i283.point;
		rare[282] = i283.rare;
		notexist[282] = i283.notexist;
		
		name[283] = i284.name;
		name2[283] = i284.name2;
		type[283] = i284.type;
		point[283] = i284.point;
		rare[283] = i284.rare;
		notexist[283] = i284.notexist;
		
		name[284] = i285.name;
		name2[284] = i285.name2;
		type[284] = i285.type;
		point[284] = i285.point;
		rare[284] = i285.rare;
		notexist[284] = i285.notexist;		
		
		name[285] = i286.name;
		name2[285] = i286.name2;
		type[285] = i286.type;
		point[285] = i286.point;
		rare[285] = i286.rare;
		notexist[285] = i286.notexist;
		
		name[286] = i287.name;
		name2[286] = i287.name2;
		type[286] = i287.type;
		point[286] = i287.point;
		rare[286] = i287.rare;
		notexist[286] = i287.notexist;
		
		name[287] = i288.name;
		name2[287] = i288.name2;
		type[287] = i288.type;
		point[287] = i288.point;
		rare[287] = i288.rare;
		notexist[287] = i288.notexist;
		
		name[288] = i289.name;
		name2[288] = i289.name2;
		type[288] = i289.type;
		point[288] = i289.point;
		rare[288] = i289.rare;
		notexist[288] = i289.notexist;
		
		name[289] = i290.name;
		name2[289] = i290.name2;
		type[289] = i290.type;
		point[289] = i290.point;
		rare[289] = i290.rare;
		notexist[289] = i290.notexist;

		int maxPoint = 0;
		if(Point == 1)
		maxPoint = 10;
		else if(Point == 11)
		maxPoint = 15;
		else if(Point == 16)
		maxPoint = 20;
		else if(Point == 21)
		maxPoint = 25;
		else if(Point == 26)
		maxPoint = 30;
		else if(Point == 31)
		maxPoint = 35;
		else if(Point == 36)
		maxPoint = 40;
		else if(Point == 41)
		maxPoint = 45;
		else if(Point == 46)
		maxPoint = 50;
		else if(Point == 51)
		maxPoint = 55;
		else if(Point == 56)
		maxPoint = 60;
		else if(Point == 61)
		maxPoint = 65;
		else if(Point == 66)
		maxPoint = 70;
		else if(Point == 71)
		maxPoint = 75;
		else if(Point == 76)
		maxPoint = 80;

		Random r = new Random();
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		while(true){
			num1 = r.nextInt(289);
			num2 = r.nextInt(289);
			num3 = r.nextInt(289);
			num4 = r.nextInt(289);
			String[] ans = new String[4];
			if(withOutRare == true && same234 == false){
			if((Type.equals(type[num1])) && ((point[num1] + point[num2] + point[num3] + point[num4]) > Point)
			 && ((point[num1] + point[num2] + point[num3] + point[num4]) <= maxPoint) && !(rare[num1]) && !(rare[num2]) &&
			 !(rare[num3]) && !(rare[num4]) && !(notexist[num1]) && !(notexist[num2]) &&!(notexist[num3]) && !(notexist[num4])) {
				ans[0] = name[num1];
				ans[1] = name[num2];
				ans[2] = name[num3];
				ans[3] = name[num4];
				return ans;
			 }
			}
			else if(withOutRare == false && same234 == false){
				if((Type.equals(type[num1])) && ((point[num1] + point[num2] + point[num3] + point[num4]) > Point)
			 && ((point[num1] + point[num2] + point[num3] + point[num4]) <= maxPoint) && !(notexist[num1]) && !(notexist[num2]) &&
			 !(notexist[num3]) && !(notexist[num4])) {
				ans[0] = name[num1];
				ans[1] = name[num2];
				ans[2] = name[num3];
				ans[3] = name[num4];
				return ans;
			 }
			}
			else if(withOutRare == true && same234 == true){
				if((Type.equals(type[num1])) && ((point[num1] + (point[num2] * 3)) > Point)
			 && ((point[num1] + (point[num2] * 3)) <= maxPoint) && !(rare[num1]) && !(rare[num2]) 
			 && !(notexist[num1]) && !(notexist[num2])) {
				ans[0] = name[num1];
				ans[1] = name[num2];
				return ans;
			 }
			}
			else if(withOutRare == false && same234 == true){
				if((Type.equals(type[num1])) && ((point[num1] + (point[num2] * 3)) > Point)
			 && ((point[num1] + (point[num2] * 3)) <= maxPoint) && !(notexist[num1]) && !(notexist[num2])) {
				ans[0] = name[num1];
				ans[1] = name[num2];
				return ans;
			 }
			}
		}
	}

    public static ToMaterial getInfo(String Name){
		ToMaterial materials = new ToMaterial();
		
		ToMaterial exce = new ToMaterial();
		exce.name = "エラー";
		
		ToMaterial m1 = new ToMaterial();
		m1.name = "わざレコード85";
		m1.name2 = "ふるいたてる";
		m1.type = "ノーマル";
		m1.point = 1;
		
		ToMaterial m2 = new ToMaterial();
		m2.name = "わざレコード14";
		m2.name2 = "ゆびをふる";
		m2.type = "ノーマル";
		m2.point = 11;
		
		ToMaterial m3 = new ToMaterial();
		m3.name = "わざレコード26";
		m3.name2 = "こらえる";
		m3.type = "ノーマル";
		m3.point = 16;
		
		ToMaterial m4 = new ToMaterial();
		m4.name = "わざレコード13";
		m4.name2 = "きあいだめ";
		m4.type = "ノーマル";
		m4.point = 21;
		
		ToMaterial m5 = new ToMaterial();
		m5.name = "わざレコード27";
		m5.name2 = "ねごと";
		m5.type = "ノーマル";
		m5.point = 26;
		
		ToMaterial m6 = new ToMaterial();
		m6.name = "わざレコード35";
		m6.name2 = "さわぐ";
		m6.type = "ノーマル";
		m6.point = 31;
		
		ToMaterial m7 = new ToMaterial();
		m7.name = "わざレコード01";
		m7.name2 = "のしかかり";
		m7.type = "ノーマル";
		m7.point = 36;
		
		ToMaterial m8 = new ToMaterial();
		m8.name = "わざレコード19";
		m8.name2 = "トライアタック";
		m8.type = "ノーマル";
		m8.point = 41;
		
		ToMaterial m9 = new ToMaterial();
		m9.name = "わざレコード29";
		m9.name2 = "バトンタッチ";
		m9.type = "ノーマル";
		m9.point = 46;
		
		ToMaterial m10 = new ToMaterial();
		m10.name = "わざレコード30";
		m10.name2 = "アンコール";
		m10.type = "ノーマル";
		m10.point = 51;
		
		ToMaterial m11 = new ToMaterial();
		m11.name = "わざレコード20";
		m11.name2 = "みがわり";
		m11.type = "ノーマル";
		m11.point = 56;
		
		ToMaterial m12 = new ToMaterial();
		m12.name = "わざレコード00";
		m12.name2 = "つるぎのまい";
		m12.type = "ノーマル";
		m12.point = 61;
		
		ToMaterial m13 = new ToMaterial();
		m13.name = "わざレコード42";
		m13.name2 = "ハイパーボイス";
		m13.type = "ノーマル";
		m13.point = 66;
		
		ToMaterial m14 = new ToMaterial();
		m14.name = "ぎんのおうかん";
		m14.name2 = "";
		m14.type = "ノーマル";
		m14.point = 71;
		
		ToMaterial m15 = new ToMaterial();
		m15.name = "ポイントアップ";
		m15.name2 = "";
		m15.type = "ノーマル";
		m15.point = 76;
		
		ToMaterial m16 = new ToMaterial();
		m16.name = "わざレコード88";
		m16.name2 = "ヒートスタンプ";
		m16.type = "ほのお";
		m16.point = 1;
		
		ToMaterial m17 = new ToMaterial();
		m17.name = "かえんだま";
		m17.name2 = "";
		m17.type = "ほのお";
		m17.point = 11;
		
		ToMaterial m18 = new ToMaterial();
		m18.name = "わざレコード41";
		m18.name2 = "ブレイズキック";
		m18.type = "ほのお";
		m18.point = 16;
		
		ToMaterial m19 = new ToMaterial();
		m19.name = "ねがいのかたまり";
		m19.name2 = "";
		m19.type = "ほのお";
		m19.point = 21;
		
		ToMaterial m20 = new ToMaterial();
		m20.name = "わざレコード02";
		m20.name2 = "かえんほうしゃ";
		m20.type = "ほのお";
		m20.point = 26;
		
		ToMaterial m21 = new ToMaterial();
		m21.name = "かおるキノコ";
		m21.name2 = "";
		m21.type = "ほのお";
		m21.point = 31;
		
		ToMaterial m22 = new ToMaterial();
		m22.name = "わざレコード36";
		m22.name2 = "ねっぷう";
		m22.type = "ほのお";
		m22.point = 36;
		
		ToMaterial m23 = new ToMaterial();
		m23.name = "レッドカード";
		m23.name2 = "";
		m23.type = "ほのお";
		m23.point = 41;
		
		ToMaterial m24 = new ToMaterial();
		m24.name = "わざレコード15";
		m24.name2 = "だいもんじ";
		m24.type = "ほのお";
		m24.point = 46;
		
		ToMaterial m25 = new ToMaterial();
		m25.name = "もくたん";
		m25.name2 = "";
		m25.type = "ほのお";
		m25.point = 51;
		
		ToMaterial m26 = new ToMaterial();
		m26.name = "わざレコード55";
		m26.name2 = "フレアドライブ";
		m26.type = "ほのお";
		m26.point = 56;
		
		ToMaterial m27 = new ToMaterial();
		m27.name = "わざレコード43";
		m27.name2 = "オーバーヒート";
		m27.type = "ほのお";
		m27.point = 61;
		
		ToMaterial m28 = new ToMaterial();
		m28.name = "ふしぎなアメ";
		m28.name2 = "";
		m28.type = "ほのお";
		m28.point = 66;
		
		ToMaterial m29 = new ToMaterial();
		m29.name = "ぎんのおうかん";
		m29.name2 = "";
		m29.type = "ほのお";
		m29.point = 71;
		
		ToMaterial m30 = new ToMaterial();
		m30.name = "ポイントアップ";
		m30.name2 = "";
		m30.type = "ほのお";
		m30.point = 76;
		
		ToMaterial m31 = new ToMaterial();
		m31.name = "うしおのおこう";
		m31.name2 = "";
		m31.type = "みず";
		m31.point = 1;
		
		ToMaterial m32 = new ToMaterial();
		m32.name = "わざレコード04";
		m32.name2 = "なみのり";
		m32.type = "みず";
		m32.point = 11;
		
		ToMaterial m33 = new ToMaterial();
		m33.name = "かいがらのすず";
		m33.name2 = "";
		m33.type = "みず";
		m33.point = 16;
		
		ToMaterial m34 = new ToMaterial();
		m34.name = "ねがいのかたまり";
		m34.name2 = "";
		m34.type = "みず";
		m34.point = 21;
		
		ToMaterial m35 = new ToMaterial();
		m35.name = "わざレコード16";
		m35.name2 = "たきのぼり";
		m35.type = "みず";
		m35.point = 26;
		
		ToMaterial m36 = new ToMaterial();
		m36.name = "わざレコード98";
		m36.name2 = "アクアブレイク";
		m36.type = "みず";
		m36.point = 31;
		
		ToMaterial m37 = new ToMaterial();
		m37.name = "きれいなウロコ";
		m37.name2 = "";
		m37.type = "みず";
		m37.point = 36;
		
		ToMaterial m38 = new ToMaterial();
		m38.name = "しんぴのしずく";
		m38.name2 = "";
		m38.type = "みず";
		m38.point = 41;
		
		ToMaterial m39 = new ToMaterial();
		m39.name = "おだんごしんじゅ";
		m39.name2 = "";
		m39.type = "みず";
		m39.point = 46;
		
		ToMaterial m40 = new ToMaterial();
		m40.name = "わざレコード45";
		m40.name2 = "だくりゅう";
		m40.type = "みず";
		m40.point = 51;
		
		ToMaterial m41 = new ToMaterial();
		m41.name = "わざレコード84";
		m41.name2 = "ねっとう";
		m41.type = "みず";
		m41.point = 56;
		
		ToMaterial m42 = new ToMaterial();
		m42.name = "わざレコード03";
		m42.name2 = "ハイドロポンプ";
		m42.type = "みず";
		m42.point = 61;
		
		ToMaterial m43 = new ToMaterial();
		m43.name = "ふしぎなアメ";
		m43.name2 = "";
		m43.type = "みず";
		m43.point = 66;
		
		ToMaterial m44 = new ToMaterial();
		m44.name = "ぎんのおうかん";
		m44.name2 = "";
		m44.type = "みず";
		m44.point = 71;
		
		ToMaterial m45 = new ToMaterial();
		m45.name = "ポイントアップ";
		m45.name2 = "";
		m45.type = "みず";
		m45.point = 76; 

		ToMaterial m46 = new ToMaterial();
		m46.name = "エレキシード";
		m46.name2 = "";
		m46.type = "でんき";
		m46.point = 1;
		
		ToMaterial m47 = new ToMaterial();
		m47.name = "わざレコード80";
		m47.name2 = "エレキボール";
		m47.type = "でんき";
		m47.point = 11;
		
		ToMaterial m48 = new ToMaterial();
		m48.name = "じゅうでんち";
		m48.name2 = "";
		m48.type = "でんき";
		m48.point = 16;
		
		ToMaterial m49 = new ToMaterial();
		m49.name = "ねがいのかたまり";
		m49.name2 = "";
		m49.type = "でんき";
		m49.point = 21;
		
		ToMaterial m50 = new ToMaterial();
		m50.name = "じしゃく";
		m50.name2 = "";
		m50.type = "でんき";
		m50.point = 26;
		
		ToMaterial m51 = new ToMaterial();
		m51.name = "わざレコード86";
		m51.name2 = "ワイルドボルト";
		m51.type = "でんき";
		m51.point = 31;
		
		ToMaterial m52 = new ToMaterial();
		m52.name = "アップグレード";
		m52.name2 = "";
		m52.type = "でんき";
		m52.point = 36;
		
		ToMaterial m53 = new ToMaterial();
		m53.name = "でんきだま";
		m53.name2 = "";
		m53.type = "でんき";
		m53.point = 41;
		
		ToMaterial m54 = new ToMaterial();
		m54.name = "おだんごしんじゅ";
		m54.name2 = "";
		m54.type = "でんき";
		m54.point = 46;
		
		ToMaterial m55 = new ToMaterial();
		m55.name = "あやしいパッチ";
		m55.name2 = "";
		m55.type = "でんき";
		m55.point = 51;
		
		ToMaterial m56 = new ToMaterial();
		m56.name = "わざレコード08";
		m56.name2 = "10まんボルト";
		m56.type = "でんき";
		m56.point = 56;
		
		ToMaterial m57 = new ToMaterial();
		m57.name = "わざレコード09";
		m57.name2 = "かみなり";
		m57.type = "でんき";
		m57.point = 61;
		
		ToMaterial m58 = new ToMaterial();
		m58.name = "ふしぎなアメ";
		m58.name2 = "";
		m58.type = "でんき";
		m58.point = 66;
		
		ToMaterial m59 = new ToMaterial();
		m59.name = "ぎんのおうかん";
		m59.name2 = "";
		m59.type = "でんき";
		m59.point = 71;
		
		ToMaterial m60 = new ToMaterial();
		m60.name = "ポイントアップ";
		m60.name2 = "";
		m60.type = "でんき";
		m60.point = 76;

		ToMaterial m61 = new ToMaterial();
		m61.name = "グラスシード";
		m61.name2 = "";
		m61.type = "くさ";
		m61.point = 1;
		
		ToMaterial m62 = new ToMaterial();
		m62.name = "わざレコード59";
		m62.name2 = "タネばくだん";
		m62.type = "くさ";
		m62.point = 11;
		
		ToMaterial m63 = new ToMaterial();
		m63.name = "しろいハーブ";
		m63.name2 = "";
		m63.type = "くさ";
		m63.point = 16;
		
		ToMaterial m64 = new ToMaterial();
		m64.name = "ねがいのかたまり";
		m64.name2 = "";
		m64.type = "くさ";
		m64.point = 21;
		
		ToMaterial m65 = new ToMaterial();
		m65.name = "わざレコード77";
		m65.name2 = "くさむすび";
		m65.type = "くさ";
		m65.point = 26;
		
		ToMaterial m66 = new ToMaterial();
		m66.name = "わざレコード50";
		m66.name2 = "リーフブレード";
		m66.type = "くさ";
		m66.point = 31;
		
		ToMaterial m67 = new ToMaterial();
		m67.name = "わざレコード65";
		m67.name2 = "エナジーボール";
		m67.type = "くさ";
		m67.point = 36;
		
		ToMaterial m68 = new ToMaterial();
		m68.name = "きゅうこん";
		m68.name2 = "";
		m68.type = "くさ";
		m68.point = 41;
		
		ToMaterial m69 = new ToMaterial();
		m69.name = "おだんごしんじゅ";
		m69.name2 = "";
		m69.type = "くさ";
		m69.point = 46;
		
		ToMaterial m70 = new ToMaterial();
		m70.name = "わざレコード72";
		m70.name2 = "パワーウィップ";
		m70.type = "くさ";
		m70.point = 51;
		
		ToMaterial m71 = new ToMaterial();
		m71.name = "すいせいのかけら";
		m71.name2 = "";
		m71.type = "くさ";
		m71.point = 56;
		
		ToMaterial m72 = new ToMaterial();
		m72.name = "わざレコード71";
		m72.name2 = "リーフストーム";
		m72.type = "くさ";
		m72.point = 61;
		
		ToMaterial m73 = new ToMaterial();
		m73.name = "ふしぎなアメ";
		m73.name2 = "";
		m73.type = "くさ";
		m73.point = 66;
		
		ToMaterial m74 = new ToMaterial();
		m74.name = "ぎんのおうかん";
		m74.name2 = "";
		m74.type = "くさ";
		m74.point = 71;
		
		ToMaterial m75 = new ToMaterial();
		m75.name = "ポイントアップ";
		m75.name2 = "";
		m75.type = "くさ";
		m75.point = 76;

		ToMaterial m76 = new ToMaterial();
		m76.name = "ゆきだま";
		m76.name2 = "";
		m76.type = "こおり";
		m76.point = 1;
		
		ToMaterial m77 = new ToMaterial();
		m77.name = "つめたいいわ";
		m77.name2 = "";
		m77.type = "こおり";
		m77.point = 11;
		
		ToMaterial m78 = new ToMaterial();
		m78.name = "とけないこおり";
		m78.name2 = "";
		m78.type = "こおり";
		m78.point = 16;
		
		ToMaterial m79 = new ToMaterial();
		m79.name = "ねがいのかたまり";
		m79.name2 = "";
		m79.type = "こおり";
		m79.point = 21;
		
		ToMaterial m80 = new ToMaterial();
		m80.name = "ほしのかけら";
		m80.name2 = "";
		m80.type = "こおり";
		m80.point = 26;
		
		ToMaterial m81 = new ToMaterial();
		m81.name = "かおるキノコ";
		m81.name2 = "";
		m81.type = "こおり";
		m81.point = 31;
		
		ToMaterial m82 = new ToMaterial();
		m82.name = "するどいツメ";
		m82.name2 = "";
		m82.type = "こおり";
		m82.point = 36;
		
		ToMaterial m83 = new ToMaterial();
		m83.name = "ゆきだま";
		m83.name2 = "";
		m83.type = "こおり";
		m83.point = 41;
		
		ToMaterial m84 = new ToMaterial();
		m84.name = "おだんごしんじゅ";
		m84.name2 = "";
		m84.type = "こおり";
		m84.point = 46;
		
		ToMaterial m85 = new ToMaterial();
		m85.name = "わざレコード05";
		m85.name2 = "れいとうビーム";
		m85.type = "こおり";
		m85.point = 51;
		
		ToMaterial m86 = new ToMaterial();
		m86.name = "すいせいのかけら";
		m86.name2 = "";
		m86.type = "こおり";
		m86.point = 56;
		
		ToMaterial m87 = new ToMaterial();
		m87.name = "わざレコード06";
		m87.name2 = "ふぶき";
		m87.type = "こおり";
		m87.point = 61;
		
		ToMaterial m88 = new ToMaterial();
		m88.name = "ふしぎなアメ";
		m88.name2 = "";
		m88.type = "こおり";
		m88.point = 66;
		
		ToMaterial m89 = new ToMaterial();
		m89.name = "ぎんのおうかん";
		m89.name2 = "";
		m89.type = "こおり";
		m89.point = 71;
		
		ToMaterial m90 = new ToMaterial();
		m90.name = "ポイントアップ";
		m90.name2 = "";
		m90.type = "こおり";
		m90.point = 76; 

		ToMaterial m91 = new ToMaterial();
		m91.name = "わざレコード07";
		m91.name2 = "けたぐり";
		m91.type = "かくとう";
		m91.point = 1;
		
		ToMaterial m92 = new ToMaterial();
		m92.name = "わざレコード56";
		m92.name2 = "はどうだん";
		m92.type = "かくとう";
		m92.point = 11;
		
		ToMaterial m93 = new ToMaterial();
		m93.name = "ちからのハチマキ";
		m93.name2 = "";
		m93.type = "かくとう";
		m93.point = 16;
		
		ToMaterial m94 = new ToMaterial();
		m94.name = "ねがいのかたまり";
		m94.name2 = "";
		m94.type = "かくとう";
		m94.point = 21;
		
		ToMaterial m95 = new ToMaterial();
		m95.name = "わざレコード48";
		m95.name2 = "ビルドアップ";
		m95.type = "かくとう";
		m95.point = 26;
		
		ToMaterial m96 = new ToMaterial();
		m96.name = "わざレコード21";
		m96.name2 = "きしかいせい";
		m96.type = "かくとう";
		m96.point = 31;
		
		ToMaterial m97 = new ToMaterial();
		m97.name = "きょうせいギプス";
		m97.name2 = "";
		m97.type = "かくとう";
		m97.point = 36;
		
		ToMaterial m98 = new ToMaterial();
		m98.name = "わざレコード99";
		m98.name2 = "ボディプレス";
		m98.type = "かくとう";
		m98.point = 41;
		
		ToMaterial m99 = new ToMaterial();
		m99.name = "たつじんのおび";
		m99.name2 = "";
		m99.type = "かくとう";
		m99.point = 46;
		
		ToMaterial m100 = new ToMaterial();
		m100.name = "わざレコード64";
		m100.name2 = "きあいだま";
		m100.type = "かくとう";
		m100.point = 51;
		
		ToMaterial m101 = new ToMaterial();
		m101.name = "わざレコード39";
		m101.name2 = "ばかぢから";
		m101.type = "かくとう";
		m101.point = 56;
		
		ToMaterial m102 = new ToMaterial();
		m102.name = "わざレコード53";
		m102.name2 = "インファイト";
		m102.type = "かくとう";
		m102.point = 61;
		
		ToMaterial m103 = new ToMaterial();
		m103.name = "ふしぎなアメ";
		m103.name2 = "";
		m103.type = "かくとう";
		m103.point = 66;
		
		ToMaterial m104 = new ToMaterial();
		m104.name = "ぎんのおうかん";
		m104.name2 = "";
		m104.type = "かくとう";
		m104.point = 71;
		
		ToMaterial m105 = new ToMaterial();
		m105.name = "ポイントアップ";
		m105.name2 = "";
		m105.type = "かくとう";
		m105.point = 76; 

		ToMaterial m106 = new ToMaterial();
		m106.name = "くろいヘドロ";
		m106.name2 = "";
		m106.type = "どく";
		m106.point = 1;
		
		ToMaterial m107 = new ToMaterial();
		m107.name = "どくどくだま";
		m107.name2 = "";
		m107.type = "どく";
		m107.point = 11;
		
		ToMaterial m108 = new ToMaterial();
		m108.name = "わざレコード91";
		m108.name2 = "ベノムトラップ";
		m108.type = "どく";
		m108.point = 16;
		
		ToMaterial m109 = new ToMaterial();
		m109.name = "ねがいのかたまり";
		m109.name2 = "";
		m109.type = "どく";
		m109.point = 21;
		
		ToMaterial m110 = new ToMaterial();
		m110.name = "わざレコード54";
		m110.name2 = "どくびし";
		m110.type = "どく";
		m110.point = 26;
		
		ToMaterial m111 = new ToMaterial();
		m111.name = "けむりだま";
		m111.name2 = "";
		m111.type = "どく";
		m111.point = 31;
		
		ToMaterial m112 = new ToMaterial();
		m112.name = "わざレコード57";
		m112.name2 = "どくづき";
		m112.type = "どく";
		m112.point = 36;
		
		ToMaterial m113 = new ToMaterial();
		m113.name = "スピードパウダー";
		m113.name2 = "";
		m113.type = "どく";
		m113.point = 41;
		
		ToMaterial m114 = new ToMaterial();
		m114.name = "どくバリ";
		m114.name2 = "";
		m114.type = "どく";
		m114.point = 46;
		
		ToMaterial m115 = new ToMaterial();
		m115.name = "わざレコード22";
		m115.name2 = "ヘドロばくだん";
		m115.type = "どく";
		m115.point = 51;
		
		ToMaterial m116 = new ToMaterial();
		m116.name = "わざレコード78";
		m116.name2 = "ヘドロウェーブ";
		m116.type = "どく";
		m116.point = 56;
		
		ToMaterial m117 = new ToMaterial();
		m117.name = "わざレコード73";
		m117.name2 = "ダストシュート";
		m117.type = "どく";
		m117.point = 61;
		
		ToMaterial m118 = new ToMaterial();
		m118.name = "ふしぎなアメ";
		m118.name2 = "";
		m118.type = "どく";
		m118.point = 66;
		
		ToMaterial m119 = new ToMaterial();
		m119.name = "ぎんのおうかん";
		m119.name2 = "";
		m119.type = "どく";
		m119.point = 71;
		
		ToMaterial m120 = new ToMaterial();
		m120.name = "ポイントアップ";
		m120.name2 = "";
		m120.type = "どく";
		m120.point = 76;

		ToMaterial m121 = new ToMaterial();
		m121.name = "ほしのすな";
		m121.name2 = "";
		m121.type = "じめん";
		m121.point = 1;
		
		ToMaterial m122 = new ToMaterial();
		m122.name = "わざレコード23";
		m122.name2 = "まきびし";
		m122.type = "じめん";
		m122.point = 11;
		
		ToMaterial m123 = new ToMaterial();
		m123.name = "おおきなキノコ";
		m123.name2 = "";
		m123.type = "じめん";
		m123.point = 16;
		
		ToMaterial m124 = new ToMaterial();
		m124.name = "ねがいのかたまり";
		m124.name2 = "";
		m124.type = "じめん";
		m124.point = 21;
		
		ToMaterial m125 = new ToMaterial();
		m125.name = "ひかりのねんど";
		m125.name2 = "";
		m125.type = "じめん";
		m125.point = 26;
		
		ToMaterial m126 = new ToMaterial();
		m126.name = "わざレコード87";
		m126.name2 = "ドリルライナー";
		m126.type = "じめん";
		m126.point = 31;
		
		ToMaterial m127 = new ToMaterial();
		m127.name = "わざレコード67";
		m127.name2 = "だいちのちから";
		m127.type = "じめん";
		m127.point = 36;
		
		ToMaterial m128 = new ToMaterial();
		m128.name = "グランドコート";
		m128.name2 = "";
		m128.type = "じめん";
		m128.point = 41;
		
		ToMaterial m129 = new ToMaterial();
		m129.name = "おだんごしんじゅ";
		m129.name2 = "";
		m129.type = "じめん";
		m129.point = 46;
		
		ToMaterial m130 = new ToMaterial();
		m130.name = "わざレコード94";
		m130.name2 = "10まんばりき";
		m130.type = "じめん";
		m130.point = 51;
		
		ToMaterial m131 = new ToMaterial();
		m131.name = "すいせいのかけら";
		m131.name2 = "";
		m131.type = "じめん";
		m131.point = 56;
		
		ToMaterial m132 = new ToMaterial();
		m132.name = "わざレコード10";
		m132.name2 = "じしん";
		m132.type = "じめん";
		m132.point = 61;
		
		ToMaterial m133 = new ToMaterial();
		m133.name = "ふしぎなアメ";
		m133.name2 = "";
		m133.type = "じめん";
		m133.point = 66;
		
		ToMaterial m134 = new ToMaterial();
		m134.name = "ぎんのおうかん";
		m134.name2 = "";
		m134.type = "じめん";
		m134.point = 71;
		
		ToMaterial m135 = new ToMaterial();
		m135.name = "ポイントアップ";
		m135.name2 = "";
		m135.type = "じめん";
		m135.point = 76; 

		ToMaterial m136 = new ToMaterial();
		m136.name = "きれいなハネ";
		m136.name2 = "";
		m136.type = "ひこう";
		m136.point = 1;
		
		ToMaterial m137 = new ToMaterial();
		m137.name = "するどいくちばし";
		m137.name2 = "";
		m137.type = "ひこう";
		m137.point = 11;
		
		ToMaterial m138 = new ToMaterial();
		m138.name = "おおきなキノコ";
		m138.name2 = "";
		m138.type = "ひこう";
		m138.point = 16;
		
		ToMaterial m139 = new ToMaterial();
		m139.name = "ねがいのかたまり";
		m139.name2 = "";
		m139.type = "ひこう";
		m139.point = 21;
		
		ToMaterial m140 = new ToMaterial();
		m140.name = "ふうせん";
		m140.name2 = "";
		m140.type = "ひこう";
		m140.point = 26;
		
		ToMaterial m141 = new ToMaterial();
		m141.name = "からぶりほけん";
		m141.name2 = "";
		m141.type = "ひこう";
		m141.point = 31;
		
		ToMaterial m142 = new ToMaterial();
		m142.name = "ねばりのかぎづめ";
		m142.name2 = "";
		m142.type = "ひこう";
		m142.point = 36;
		
		ToMaterial m143 = new ToMaterial();
		m143.name = "ふうせん";
		m143.name2 = "";
		m143.type = "ひこう";
		m143.point = 41;
		
		ToMaterial m144 = new ToMaterial();
		m144.name = "じゃくてんほけん";
		m144.name2 = "";
		m144.type = "ひこう";
		m144.point = 46;
		
		ToMaterial m145 = new ToMaterial();
		m145.name = "わざレコード89";
		m145.name2 = "ぼうふう";
		m145.type = "ひこう";
		m145.point = 51;
		
		ToMaterial m146 = new ToMaterial();
		m146.name = "すいせいのかけら";
		m146.name2 = "";
		m146.type = "ひこう";
		m146.point = 56;
		
		ToMaterial m147 = new ToMaterial();
		m147.name = "わざレコード66";
		m147.name2 = "ブレイブバード";
		m147.type = "ひこう";
		m147.point = 61;
		
		ToMaterial m148 = new ToMaterial();
		m148.name = "ふしぎなアメ";
		m148.name2 = "";
		m148.type = "ひこう";
		m148.point = 66;
		
		ToMaterial m149 = new ToMaterial();
		m149.name = "ぎんのおうかん";
		m149.name2 = "";
		m149.type = "ひこう";
		m149.point = 71;
		
		ToMaterial m150 = new ToMaterial();
		m150.name = "ポイントアップ";
		m150.name2 = "";
		m150.type = "ひこう";
		m150.point = 76;

		ToMaterial m151 = new ToMaterial();
		m151.name = "わざレコード12";
		m151.name2 = "こうそくいどう";
		m151.type = "エスパー";
		m151.point = 1;
		
		ToMaterial m152 = new ToMaterial();
		m152.name = "わざレコード34";
		m152.name2 = "みらいよち";
		m152.type = "エスパー";
		m152.point = 11;
		
		ToMaterial m153 = new ToMaterial();
		m153.name = "わざレコード40";
		m153.name2 = "スキルスワップ";
		m153.type = "エスパー";
		m153.point = 16;
		
		ToMaterial m154 = new ToMaterial();
		m154.name = "わざレコード82";
		m154.name2 = "アシストパワー";
		m154.type = "エスパー";
		m154.point = 21;
		
		ToMaterial m155 = new ToMaterial();
		m155.name = "わざレコード44";
		m155.name2 = "コスモパワー";
		m155.type = "エスパー";
		m155.point = 26;
		
		ToMaterial m156 = new ToMaterial();
		m156.name = "わざレコード83";
		m156.name2 = "サイドチェンジ";
		m156.type = "エスパー";
		m156.point = 31;
		
		ToMaterial m157 = new ToMaterial();
		m157.name = "わざレコード25";
		m157.name2 = "サイコショック";
		m157.type = "エスパー";
		m157.point = 36;
		
		ToMaterial m158 = new ToMaterial();
		m158.name = "わざレコード69";
		m158.name2 = "しねんのずつき";
		m158.type = "エスパー";
		m158.point = 41;
		
		ToMaterial m159 = new ToMaterial();
		m159.name = "わざレコード17";
		m159.name2 = "ドわすれ";
		m159.type = "エスパー";
		m159.point = 46;
		
		ToMaterial m160 = new ToMaterial();
		m160.name = "わざレコード38";
		m160.name2 = "トリック";
		m160.type = "エスパー";
		m160.point = 51;
		
		ToMaterial m161 = new ToMaterial();
		m161.name = "わざレコード49";
		m161.name2 = "めいそう";
		m161.type = "エスパー";
		m161.point = 56;
		
		ToMaterial m162 = new ToMaterial();
		m162.name = "わざレコード97";
		m162.name2 = "サイコファング";
		m162.type = "エスパー";
		m162.point = 61;
		
		ToMaterial m163 = new ToMaterial();
		m163.name = "わざレコード11";
		m163.name2 = "サイコキネシス";
		m163.type = "エスパー";
		m163.point = 66;
		
		ToMaterial m164 = new ToMaterial();
		m164.name = "ぎんのおうかん";
		m164.name2 = "";
		m164.type = "エスパー";
		m164.point = 71;
		
		ToMaterial m165 = new ToMaterial();
		m165.name = "ポイントアップ";
		m165.name2 = "";
		m165.type = "エスパー";
		m165.point = 76; 

		ToMaterial m166 = new ToMaterial();
		m166.name = "わざレコード60";
		m166.name2 = "シザークロス";
		m166.type = "むし";
		m166.point = 1;
		
		ToMaterial m167 = new ToMaterial();
		m167.name = "わざレコード18";
		m167.name2 = "きゅうけつ";
		m167.type = "むし";
		m167.point = 11;
		
		ToMaterial m168 = new ToMaterial();
		m168.name = "ひかりのこな";
		m168.name2 = "";
		m168.type = "むし";
		m168.point = 16;
		
		ToMaterial m169 = new ToMaterial();
		m169.name = "ねがいのかたまり";
		m169.name2 = "";
		m169.type = "むし";
		m169.point = 21;
		
		ToMaterial m170 = new ToMaterial();
		m170.name = "ぎんのこな";
		m170.name2 = "";
		m170.type = "むし";
		m170.point = 26;
		
		ToMaterial m171 = new ToMaterial();
		m171.name = "かおるキノコ";
		m171.name2 = "";
		m171.type = "むし";
		m171.point = 31;
		
		ToMaterial m172 = new ToMaterial();
		m172.name = "わざレコード61";
		m172.name2 = "むしのさざめき";
		m172.type = "むし";
		m172.point = 36;
		
		ToMaterial m173 = new ToMaterial();
		m173.name = "きれいなぬけがら";
		m173.name2 = "";
		m173.type = "むし";
		m173.point = 41;
		
		ToMaterial m174 = new ToMaterial();
		m174.name = "おだんごしんじゅ";
		m174.name2 = "";
		m174.type = "むし";
		m174.point = 46;
		
		ToMaterial m175 = new ToMaterial();
		m175.name = "わざレコード96";
		m175.name2 = "かふんだんご";
		m175.type = "むし";
		m175.point = 51;
		
		ToMaterial m176 = new ToMaterial();
		m176.name = "すいせいのかけら";
		m176.name2 = "";
		m176.type = "むし";
		m176.point = 56;
		
		ToMaterial m177 = new ToMaterial();
		m177.name = "わざレコード28";
		m177.name2 = "メガホーン";
		m177.type = "むし";
		m177.point = 61;
		
		ToMaterial m178 = new ToMaterial();
		m178.name = "ふしぎなアメ";
		m178.name2 = "";
		m178.type = "むし";
		m178.point = 66;
		
		ToMaterial m179 = new ToMaterial();
		m179.name = "ぎんのおうかん";
		m179.name2 = "";
		m179.type = "むし";
		m179.point = 71;
		
		ToMaterial m180 = new ToMaterial();
		m180.name = "ポイントアップ";
		m180.name2 = "";
		m180.type = "むし";
		m180.point = 76;

		ToMaterial m181 = new ToMaterial();
		m181.name = "かるいし";
		m181.name2 = "";
		m181.type = "いわ";
		m181.point = 1;
		
		ToMaterial m182 = new ToMaterial();
		m182.name = "まんまるいし";
		m182.name2 = "";
		m182.type = "いわ";
		m182.point = 11;
		
		ToMaterial m183 = new ToMaterial();
		m183.name = "かたいいし";
		m183.name2 = "";
		m183.type = "いわ";
		m183.point = 16;
		
		ToMaterial m184 = new ToMaterial();
		m184.name = "ねがいのかたまり";
		m184.name2 = "";
		m184.type = "いわ";
		m184.point = 21;
		
		ToMaterial m185 = new ToMaterial();
		m185.name = "かわらずのいし";
		m185.name2 = "";
		m185.type = "いわ";
		m185.point = 26;
		
		ToMaterial m186 = new ToMaterial();
		m186.name = "プロテクター";
		m186.name2 = "";
		m186.type = "いわ";
		m186.point = 31;
		
		ToMaterial m187 = new ToMaterial();
		m187.name = "ゴツゴツメット";
		m187.name2 = "";
		m187.type = "いわ";
		m187.point = 36;
		
		ToMaterial m188 = new ToMaterial();
		m188.name = "わざレコード63";
		m188.name2 = "パワージェム";
		m188.type = "いわ";
		m188.point = 41;
		
		ToMaterial m189 = new ToMaterial();
		m189.name = "ねがいのかたまり";
		m189.name2 = "";
		m189.type = "いわ";
		m189.point = 46;
		
		ToMaterial m190 = new ToMaterial();
		m190.name = "しんかのきせき";
		m190.name2 = "";
		m190.type = "いわ";
		m190.point = 51;
		
		ToMaterial m191 = new ToMaterial();
		m191.name = "わざレコード76";
		m191.name2 = "ステルスロック";
		m191.type = "いわ";
		m191.point = 56;
		
		ToMaterial m192 = new ToMaterial();
		m192.name = "わざレコード75";
		m192.name2 = "ストーンエッジ";
		m192.type = "いわ";
		m192.point = 61;
		
		ToMaterial m193 = new ToMaterial();
		m193.name = "ふしぎなアメ";
		m193.name2 = "";
		m193.type = "いわ";
		m193.point = 66;
		
		ToMaterial m194 = new ToMaterial();
		m194.name = "ぎんのおうかん";
		m194.name2 = "";
		m194.type = "いわ";
		m194.point = 71;
		
		ToMaterial m195 = new ToMaterial();
		m195.name = "ポイントアップ";
		m195.name2 = "";
		m195.type = "いわ";
		m195.point = 76;

		ToMaterial m196 = new ToMaterial();
		m196.name = "あやしいおこう";
		m196.name2 = "";
		m196.type = "ゴースト";
		m196.point = 1;
		
		ToMaterial m197 = new ToMaterial();
		m197.name = "ビビリだま";
		m197.name2 = "";
		m197.type = "ゴースト";
		m197.point = 11;
		
		ToMaterial m198 = new ToMaterial();
		m198.name = "ねらいのまと";
		m198.name2 = "";
		m198.type = "ゴースト";
		m198.point = 16;
		
		ToMaterial m199 = new ToMaterial();
		m199.name = "ねがいのかたまり";
		m199.name2 = "";
		m199.type = "ゴースト";
		m199.point = 21;
		
		ToMaterial m200 = new ToMaterial();
		m200.name = "ほしのかけら";
		m200.name2 = "";
		m200.type = "ゴースト";
		m200.point = 26;
		
		ToMaterial m201 = new ToMaterial();
		m201.name = "かおるキノコ";
		m201.name2 = "";
		m201.type = "ゴースト";
		m201.point = 31;
		
		ToMaterial m202 = new ToMaterial();
		m202.name = "きよめのおふだ";
		m202.name2 = "";
		m202.type = "ゴースト";
		m202.point = 36;
		
		ToMaterial m203 = new ToMaterial();
		m203.name = "のろいのおふだ";
		m203.name2 = "";
		m203.type = "ゴースト";
		m203.point = 41;
		
		ToMaterial m204 = new ToMaterial();
		m204.name = "われたポット";
		m204.name2 = "";
		m204.type = "ゴースト";
		m204.point = 46;
		
		ToMaterial m205 = new ToMaterial();
		m205.name = "れいかいのぬの";
		m205.name2 = "";
		m205.type = "ゴースト";
		m205.point = 51;
		
		ToMaterial m206 = new ToMaterial();
		m206.name = "すいせいのかけら";
		m206.name2 = "";
		m206.type = "ゴースト";
		m206.point = 56;
		
		ToMaterial m207 = new ToMaterial();
		m207.name = "わざレコード33";
		m207.name2 = "シャドーボール";
		m207.type = "ゴースト";
		m207.point = 61;
		
		ToMaterial m208 = new ToMaterial();
		m208.name = "ふしぎなアメ";
		m208.name2 = "";
		m208.type = "ゴースト";
		m208.point = 66;
		
		ToMaterial m209 = new ToMaterial();
		m209.name = "ぎんのおうかん";
		m209.name2 = "";
		m209.type = "ゴースト";
		m209.point = 71;
		
		ToMaterial m210 = new ToMaterial();
		m210.name = "ポイントアップ";
		m210.name2 = "";
		m210.type = "ゴースト";
		m210.point = 76;

		ToMaterial m211 = new ToMaterial();
		m211.name = "わざレコード47";
		m211.name2 = "ドラゴンクロー";
		m211.type = "ドラゴン";
		m211.point = 1;
		
		ToMaterial m212 = new ToMaterial();
		m212.name = "りゅうのキバ";
		m212.name2 = "";
		m212.type = "ドラゴン";
		m212.point = 11;
		
		ToMaterial m213 = new ToMaterial();
		m213.name = "おおきなキノコ";
		m213.name2 = "";
		m213.type = "ドラゴン";
		m213.point = 16;
		
		ToMaterial m214 = new ToMaterial();
		m214.name = "ねがいのかたまり";
		m214.name2 = "";
		m214.type = "ドラゴン";
		m214.point = 21;
		
		ToMaterial m215 = new ToMaterial();
		m215.name = "ほしのかけら";
		m215.name2 = "";
		m215.type = "ドラゴン";
		m215.point = 26;
		
		ToMaterial m216 = new ToMaterial();
		m216.name = "かおるキノコ";
		m216.name2 = "";
		m216.type = "ドラゴン";
		m216.point = 31;
		
		ToMaterial m217 = new ToMaterial();
		m217.name = "りゅうのウロコ";
		m217.name2 = "";
		m217.type = "ドラゴン";
		m217.point = 36;
		
		ToMaterial m218 = new ToMaterial();
		m218.name = "いのちのたま";
		m218.name2 = "";
		m218.type = "ドラゴン";
		m218.point = 41;
		
		ToMaterial m219 = new ToMaterial();
		m219.name = "わざレコード62";
		m219.name2 = "りゅうのはどう";
		m219.type = "ドラゴン";
		m219.point = 46;
		
		ToMaterial m220 = new ToMaterial();
		m220.name = "おうじゃのしるし";
		m220.name2 = "";
		m220.type = "ドラゴン";
		m220.point = 51;
		
		ToMaterial m221 = new ToMaterial();
		m221.name = "わざレコード51";
		m221.name2 = "りゅうのまい";
		m221.type = "ドラゴン";
		m221.point = 56;
		
		ToMaterial m222 = new ToMaterial();
		m222.name = "わざレコード24";
		m222.name2 = "げきりん";
		m222.type = "ドラゴン";
		m222.point = 61;
		
		ToMaterial m223 = new ToMaterial();
		m223.name = "ふしぎなアメ";
		m223.name2 = "";
		m223.type = "ドラゴン";
		m223.point = 66;
		
		ToMaterial m224 = new ToMaterial();
		m224.name = "ぎんのおうかん";
		m224.name2 = "";
		m224.type = "ドラゴン";
		m224.point = 71;
		
		ToMaterial m225 = new ToMaterial();
		m225.name = "ポイントアップ";
		m225.name2 = "";
		m225.type = "ドラゴン";
		m225.point = 76;

		ToMaterial m226 = new ToMaterial();
		m226.name = "わざレコード37";
		m226.name2 = "ちょうはつ";
		m226.type = "あく";
		m226.point = 1;
		
		ToMaterial m227 = new ToMaterial();
		m227.name = "こうかくレンズ";
		m227.name2 = "";
		m227.type = "あく";
		m227.point = 11;
		
		ToMaterial m228 = new ToMaterial();
		m228.name = "わざレコード68";
		m228.name2 = "わるだくみ";
		m228.type = "あく";
		m228.point = 16;
		
		ToMaterial m229 = new ToMaterial();
		m229.name = "ねがいのかたまり";
		m229.name2 = "";
		m229.type = "あく";
		m229.point = 21;
		
		ToMaterial m230 = new ToMaterial();
		m230.name = "ほしのかけら";
		m230.name2 = "";
		m230.type = "あく";
		m230.point = 26;
		
		ToMaterial m231 = new ToMaterial();
		m231.name = "かおるキノコ";
		m231.name2 = "";
		m231.type = "あく";
		m231.point = 31;
		
		ToMaterial m232 = new ToMaterial();
		m232.name = "わざレコード81";
		m232.name2 = "イカサマ";
		m232.type = "あく";
		m232.point = 36;
		
		ToMaterial m233 = new ToMaterial();
		m233.name = "ピントレンズ";
		m233.name2 = "";
		m233.type = "あく";
		m233.point = 41;
		
		ToMaterial m234 = new ToMaterial();
		m234.name = "わざレコード95";
		m234.name2 = "じごくづき";
		m234.type = "あく";
		m234.point = 46;
		
		ToMaterial m235 = new ToMaterial();
		m235.name = "わざレコード58";
		m235.name2 = "あくのはどう";
		m235.type = "あく";
		m235.point = 51;
		
		ToMaterial m236 = new ToMaterial();
		m236.name = "わざレコード32";
		m236.name2 = "かみくだく";
		m236.type = "あく";
		m236.point = 56;
		
		ToMaterial m237 = new ToMaterial();
		m237.name = "わざレコード";
		m237.name2 = "DDラリアット";
		m237.type = "あく";
		m237.point = 61;
		
		ToMaterial m238 = new ToMaterial();
		m238.name = "ふしぎなアメ";
		m238.name2 = "";
		m238.type = "あく";
		m238.point = 66;
		
		ToMaterial m239 = new ToMaterial();
		m239.name = "ぎんのおうかん";
		m239.name2 = "";
		m239.type = "あく";
		m239.point = 71;
		
		ToMaterial m240 = new ToMaterial();
		m240.name = "ポイントアップ";
		m240.name2 = "";
		m240.type = "あく";
		m240.point = 76;
	
		ToMaterial m241 = new ToMaterial();
		m241.name = "わざレコード31";
		m241.name2 = "アイアンテール";
		m241.type = "はがね";
		m241.point = 1;
		
		ToMaterial m242 = new ToMaterial();
		m242.name = "わざレコード46";
		m242.name2 = "てっぺき";
		m242.type = "はがね";
		m242.point = 11;
		
		ToMaterial m243 = new ToMaterial();
		m243.name = "メタルパウダー";
		m243.name2 = "";
		m243.type = "はがね";
		m243.point = 16;
		
		ToMaterial m244 = new ToMaterial();
		m244.name = "ねがいのかたまり";
		m244.name2 = "";
		m244.type = "はがね";
		m244.point = 21;
		
		ToMaterial m245 = new ToMaterial();
		m245.name = "ばんのうがさ";
		m245.name2 = "";
		m245.type = "はがね";
		m245.point = 26;
		
		ToMaterial m246 = new ToMaterial();
		m246.name = "メタルコート";
		m246.name2 = "";
		m246.type = "はがね";
		m246.point = 31;
		
		ToMaterial m247 = new ToMaterial();
		m247.name = "わざレコード52";
		m247.name2 = "";
		m247.type = "はがね";
		m247.point = 36;
		
		ToMaterial m248 = new ToMaterial();
		m248.name = "とつげきチョッキ";
		m248.name2 = "";
		m248.type = "はがね";
		m248.point = 41;
		
		ToMaterial m249 = new ToMaterial();
		m249.name = "わざレコード79";
		m249.name2 = "ヘビーボンバー";
		m249.type = "はがね";
		m249.point = 46;
		
		ToMaterial m250 = new ToMaterial();
		m250.name = "おまもりこばん";
		m250.name2 = "";
		m250.type = "はがね";
		m250.point = 51;
		
		ToMaterial m251 = new ToMaterial();
		m251.name = "わざレコード70";
		m251.name2 = "ラスターカノン";
		m251.type = "はがね";
		m251.point = 56;
		
		ToMaterial m252 = new ToMaterial();
		m252.name = "わざレコード74";
		m252.name2 = "アイアンヘッド";
		m252.type = "はがね";
		m252.point = 61;
		
		ToMaterial m253 = new ToMaterial();
		m253.name = "ふしぎなアメ";
		m253.name2 = "";
		m253.type = "はがね";
		m253.point = 66;
		
		ToMaterial m254 = new ToMaterial();
		m254.name = "ぎんのおうかん";
		m254.name2 = "";
		m254.type = "はがね";
		m254.point = 71;
		
		ToMaterial m255 = new ToMaterial();
		m255.name = "ポイントアップ";
		m255.name2 = "";
		m255.type = "はがね";
		m255.point = 76;
	
		ToMaterial m256 = new ToMaterial();
		m256.name = "ほしのすな";
		m256.name2 = "";
		m256.type = "フェアリー";
		m256.point = 1;
		
		ToMaterial m257 = new ToMaterial();
		m257.name = "ミストシード";
		m257.name2 = "";
		m257.type = "フェアリー";
		m257.point = 11;
		
		ToMaterial m258 = new ToMaterial();
		m258.name = "おおきなキノコ";
		m258.name2 = "";
		m258.type = "フェアリー";
		m258.point = 16;
		
		ToMaterial m259 = new ToMaterial();
		m259.name = "ねがいのかたまり";
		m259.name2 = "";
		m259.type = "フェアリー";
		m259.point = 21;
		
		ToMaterial m260 = new ToMaterial();
		m260.name = "においぶくろ";
		m260.name2 = "";
		m260.type = "フェアリー";
		m260.point = 26;
		
		ToMaterial m261 = new ToMaterial();
		m261.name = "ルームサービス";
		m261.name2 = "";
		m261.type = "フェアリー";
		m261.point = 31;
		
		ToMaterial m262 = new ToMaterial();
		m262.name = "ホイップポップ";
		m262.name2 = "";
		m262.type = "フェアリー";
		m262.point = 36;
		
		ToMaterial m263 = new ToMaterial();
		m263.name = "あかいいと";
		m263.name2 = "";
		m263.type = "フェアリー";
		m263.point = 41;
		
		ToMaterial m264 = new ToMaterial();
		m264.name = "いちごアメざいく(2/3) スターアメざいく(1/6) リボンアメざいく(1/6)";
		m264.name2 = "";
		m264.type = "フェアリー";
		m264.point = 46;
		
		ToMaterial m265 = new ToMaterial();
		m265.name = "わざレコード92";
		m265.name2 = "マジカルシャイン";
		m265.type = "フェアリー";
		m265.point = 51;
		
		ToMaterial m266 = new ToMaterial();
		m266.name = "いちごアメざいく(1/3) ハートアメざいく(1/6) ベリーアメざいく(1/6) \n よつばアメざいく(1/6) おはなアメざいく(1/6)";
		m266.name2 = "";
		m266.type = "フェアリー";
		m266.point = 56;
		
		ToMaterial m267 = new ToMaterial();
		m267.name = "わざレコード90";
		m267.name2 = "じゃれつく";
		m267.type = "フェアリー";
		m267.point = 61;
		
		ToMaterial m268 = new ToMaterial();
		m268.name = "ふしぎなアメ";
		m268.name2 = "";
		m268.type = "フェアリー";
		m268.point = 66;
		
		ToMaterial m269 = new ToMaterial();
		m269.name = "ぎんのおうかん";
		m269.name2 = "";
		m269.type = "フェアリー";
		m269.point = 71;
		
		ToMaterial m270 = new ToMaterial();
		m270.name = "ポイントアップ";
		m270.name2 = "";
		m270.type = "フェアリー";
		m270.point = 76; 

		if((m1.name.equals(Name)) || (m1.name2.equals(Name))){
			materials.type = m1.type;
			materials.point = m1.point;
			return materials;
			}
			
		if((m2.name.equals(Name)) || (m2.name2.equals(Name))){
			materials.type = m2.type;
			materials.point = m2.point;
			return materials;
			}
			
		if((m3.name.equals(Name)) || (m3.name2.equals(Name))){
			materials.type = m3.type;
			materials.point = m3.point;
			return materials;
			}
			
		if((m4.name.equals(Name)) || (m4.name2.equals(Name))){
			materials.type = m4.type;
			materials.point = m4.point;
			return materials;
			}
			
		if((m5.name.equals(Name)) || (m5.name2.equals(Name))){
			materials.type = m5.type;
			materials.point = m5.point;
			return materials;
			}
			
		if((m6.name.equals(Name)) || (m6.name2.equals(Name))){
			materials.type = m6.type;
			materials.point = m6.point;
			return materials;
			}
			
		if((m7.name.equals(Name)) || (m7.name2.equals(Name))){
			materials.type = m7.type;
			materials.point = m7.point;
			return materials;
			}
			
		if((m8.name.equals(Name)) || (m8.name2.equals(Name))){
			materials.type = m8.type;
			materials.point = m8.point;
			return materials;
			}
			
		if((m9.name.equals(Name)) || (m9.name2.equals(Name))){
			materials.type = m9.type;
			materials.point = m9.point;
			return materials;
			}
			
		if((m10.name.equals(Name)) || (m10.name2.equals(Name))){
			materials.type = m10.type;
			materials.point = m10.point;
			return materials;
			}
			
		if((m11.name.equals(Name)) || (m11.name2.equals(Name))){
			materials.type = m11.type;
			materials.point = m11.point;
			return materials;
			}
			
		if((m12.name.equals(Name)) || (m12.name2.equals(Name))){
			materials.type = m12.type;
			materials.point = m12.point;
			return materials;
			}
			
		if((m13.name.equals(Name)) || (m13.name2.equals(Name))){
			materials.type = m13.type;
			materials.point = m13.point;
			return materials;
			}
			
		if((m14.name.equals(Name)) || (m14.name2.equals(Name))){
			materials.type = m14.type;
			materials.point = m14.point;
			return materials;
			}
			
		if((m15.name.equals(Name)) || (m15.name2.equals(Name))){
			materials.type = m15.type;
			materials.point = m15.point;
			return materials;
			}
			
		if((m16.name.equals(Name)) || (m16.name2.equals(Name))){
			materials.type = m16.type;
			materials.point = m16.point;
			return materials;
			}
			
		if((m17.name.equals(Name)) || (m17.name2.equals(Name))){
			materials.type = m17.type;
			materials.point = m17.point;
			return materials;
			}
			
		if((m18.name.equals(Name)) || (m18.name2.equals(Name))){
			materials.type = m18.type;
			materials.point = m18.point;
			return materials;
			}
			
		if((m19.name.equals(Name)) || (m19.name2.equals(Name))){
			materials.type = m19.type;
			materials.point = m19.point;
			return materials;
			}
			
		if((m20.name.equals(Name)) || (m20.name2.equals(Name))){
			materials.type = m20.type;
			materials.point = m20.point;
			return materials;
			}
			
		if((m21.name.equals(Name)) || (m21.name2.equals(Name))){
			materials.type = m21.type;
			materials.point = m21.point;
			return materials;
			}
			
		if((m22.name.equals(Name)) || (m22.name2.equals(Name))){
			materials.type = m22.type;
			materials.point = m22.point;
			return materials;
			}
			
		if((m23.name.equals(Name)) || (m23.name2.equals(Name))){
			materials.type = m23.type;
			materials.point = m23.point;
			return materials;
			}
			
		if((m24.name.equals(Name)) || (m24.name2.equals(Name))){
			materials.type = m24.type;
			materials.point = m24.point;
			return materials;
			}
			
		if((m25.name.equals(Name)) || (m25.name2.equals(Name))){
			materials.type = m25.type;
			materials.point = m25.point;
			return materials;
			}
			
		if((m26.name.equals(Name)) || (m26.name2.equals(Name))){
			materials.type = m26.type;
			materials.point = m26.point;
			return materials;
			}
			
		if((m27.name.equals(Name)) || (m27.name2.equals(Name))){
			materials.type = m27.type;
			materials.point = m27.point;
			return materials;
			}
			
			if((m28.name.equals(Name)) || (m28.name2.equals(Name))){
			materials.type = m28.type;
			materials.point = m28.point;
			return materials;
			}
			
			if((m29.name.equals(Name)) || (m29.name2.equals(Name))){
			materials.type = m29.type;
			materials.point = m29.point;
			return materials;
			}
			
			if((m30.name.equals(Name)) || (m30.name2.equals(Name))){
			materials.type = m30.type;
			materials.point = m30.point;
			return materials;
			}
			
			if((m31.name.equals(Name)) || (m31.name2.equals(Name))){
			materials.type = m31.type;
			materials.point = m31.point;
			return materials;
			}
			
			if((m32.name.equals(Name)) || (m32.name2.equals(Name))){
			materials.type = m32.type;
			materials.point = m32.point;
			return materials;
			}
			
			if((m33.name.equals(Name)) || (m33.name2.equals(Name))){
			materials.type = m33.type;
			materials.point = m33.point;
			return materials;
			}
			
			if((m34.name.equals(Name)) || (m34.name2.equals(Name))){
			materials.type = m34.type;
			materials.point = m34.point;
			return materials;
			}
			
			if((m35.name.equals(Name)) || (m35.name2.equals(Name))){
			materials.type = m35.type;
			materials.point = m35.point;
			return materials;
			}
			
			if((m36.name.equals(Name)) || (m36.name2.equals(Name))){
			materials.type = m36.type;
			materials.point = m36.point;
			return materials;
			}
			
			if((m37.name.equals(Name)) || (m37.name2.equals(Name))){
			materials.type = m37.type;
			materials.point = m37.point;
			return materials;
			}
			
			if((m38.name.equals(Name)) || (m38.name2.equals(Name))){
			materials.type = m38.type;
			materials.point = m38.point;
			return materials;
			}
			
			if((m39.name.equals(Name)) || (m39.name2.equals(Name))){
			materials.type = m39.type;
			materials.point = m39.point;
			return materials;
			}
			
			if((m40.name.equals(Name)) || (m40.name2.equals(Name))){
			materials.type = m40.type;
			materials.point = m40.point;
			return materials;
			}
			
			if((m41.name.equals(Name)) || (m41.name2.equals(Name))){
			materials.type = m41.type;
			materials.point = m41.point;
			return materials;
			}
			
			if((m42.name.equals(Name)) || (m42.name2.equals(Name))){
			materials.type = m42.type;
			materials.point = m42.point;
			return materials;
			}
			
			if((m43.name.equals(Name)) || (m43.name2.equals(Name))){
			materials.type = m43.type;
			materials.point = m43.point;
			return materials;
			}
			
			if((m44.name.equals(Name)) || (m44.name2.equals(Name))){
			materials.type = m44.type;
			materials.point = m44.point;
			return materials;
			}
			
			if((m45.name.equals(Name)) || (m45.name2.equals(Name))){
			materials.type = m45.type;
			materials.point = m45.point;
			return materials;
			}
			
			if((m46.name.equals(Name)) || (m46.name2.equals(Name))){
			materials.type = m46.type;
			materials.point = m46.point;
			return materials;
			}
			
			if((m47.name.equals(Name)) || (m47.name2.equals(Name))){
			materials.type = m47.type;
			materials.point = m47.point;
			return materials;
			}
			
			if((m48.name.equals(Name)) || (m48.name2.equals(Name))){
			materials.type = m48.type;
			materials.point = m48.point;
			return materials;
			}
			
			if((m49.name.equals(Name)) || (m49.name2.equals(Name))){
			materials.type = m49.type;
			materials.point = m49.point;
			return materials;
			}
			
			if((m50.name.equals(Name)) || (m50.name2.equals(Name))){
			materials.type = m50.type;
			materials.point = m50.point;
			return materials;
			}
			
			if((m51.name.equals(Name)) || (m51.name2.equals(Name))){
			materials.type = m51.type;
			materials.point = m51.point;
			return materials;
			}
			
			if((m52.name.equals(Name)) || (m52.name2.equals(Name))){
			materials.type = m52.type;
			materials.point = m52.point;
			return materials;
			}
			
			if((m53.name.equals(Name)) || (m53.name2.equals(Name))){
			materials.type = m53.type;
			materials.point = m53.point;
			return materials;
			}
			
			if((m54.name.equals(Name)) || (m54.name2.equals(Name))){
			materials.type = m54.type;
			materials.point = m54.point;
			return materials;
			}
			
			if((m55.name.equals(Name)) || (m55.name2.equals(Name))){
			materials.type = m55.type;
			materials.point = m55.point;
			return materials;
			}
			
			if((m56.name.equals(Name)) || (m56.name2.equals(Name))){
			materials.type = m56.type;
			materials.point = m56.point;
			return materials;
			}
			
			if((m57.name.equals(Name)) || (m57.name2.equals(Name))){
			materials.type = m57.type;
			materials.point = m57.point;
			return materials;
			}
			
			if((m58.name.equals(Name)) || (m58.name2.equals(Name))){
			materials.type = m58.type;
			materials.point = m58.point;
			return materials;
			}
			
			if((m59.name.equals(Name)) || (m59.name2.equals(Name))){
			materials.type = m59.type;
			materials.point = m59.point;
			return materials;
			}
			
			if((m60.name.equals(Name)) || (m60.name2.equals(Name))){
			materials.type = m60.type;
			materials.point = m60.point;
			return materials;
			}
			
			if((m61.name.equals(Name)) || (m61.name2.equals(Name))){
			materials.type = m61.type;
			materials.point = m61.point;
			return materials;
			}
			
			if((m62.name.equals(Name)) || (m62.name2.equals(Name))){
			materials.type = m62.type;
			materials.point = m62.point;
			return materials;
			}
			
			if((m63.name.equals(Name)) || (m63.name2.equals(Name))){
			materials.type = m63.type;
			materials.point = m63.point;
			return materials;
			}
			
			if((m64.name.equals(Name)) || (m64.name2.equals(Name))){
			materials.type = m64.type;
			materials.point = m64.point;
			return materials;
			}
			
			if((m65.name.equals(Name)) || (m65.name2.equals(Name))){
			materials.type = m65.type;
			materials.point = m65.point;
			return materials;
			}
			
			if((m66.name.equals(Name)) || (m66.name2.equals(Name))){
			materials.type = m66.type;
			materials.point = m66.point;
			return materials;
			}
			
			if((m67.name.equals(Name)) || (m67.name2.equals(Name))){
			materials.type = m67.type;
			materials.point = m67.point;
			return materials;
			}
			
			if((m68.name.equals(Name)) || (m68.name2.equals(Name))){
			materials.type = m68.type;
			materials.point = m68.point;
			return materials;
			}
			
			if((m69.name.equals(Name)) || (m69.name2.equals(Name))){
			materials.type = m69.type;
			materials.point = m69.point;
			return materials;
			}
			
			if((m70.name.equals(Name)) || (m70.name2.equals(Name))){
			materials.type = m70.type;
			materials.point = m70.point;
			return materials;
			}
			
			if((m71.name.equals(Name)) || (m71.name2.equals(Name))){
			materials.type = m71.type;
			materials.point = m71.point;
			return materials;
			}
			
			if((m72.name.equals(Name)) || (m72.name2.equals(Name))){
			materials.type = m72.type;
			materials.point = m72.point;
			return materials;
			}
			
			if((m73.name.equals(Name)) || (m73.name2.equals(Name))){
			materials.type = m73.type;
			materials.point = m73.point;
			return materials;
			}
			
			if((m74.name.equals(Name)) || (m74.name2.equals(Name))){
			materials.type = m74.type;
			materials.point = m74.point;
			return materials;
			}
			
			if((m75.name.equals(Name)) || (m75.name2.equals(Name))){
			materials.type = m75.type;
			materials.point = m75.point;
			return materials;
			}
			
			if((m76.name.equals(Name)) || (m76.name2.equals(Name))){
			materials.type = m76.type;
			materials.point = m76.point;
			return materials;
			}
			
			if((m77.name.equals(Name)) || (m77.name2.equals(Name))){
			materials.type = m77.type;
			materials.point = m77.point;
			return materials;
			}
			
			if((m78.name.equals(Name)) || (m78.name2.equals(Name))){
			materials.type = m78.type;
			materials.point = m78.point;
			return materials;
			}
			
			if((m79.name.equals(Name)) || (m79.name2.equals(Name))){
			materials.type = m79.type;
			materials.point = m79.point;
			return materials;
			}
			
			if((m80.name.equals(Name)) || (m80.name2.equals(Name))){
			materials.type = m80.type;
			materials.point = m80.point;
			return materials;
			}
			
			if((m81.name.equals(Name)) || (m81.name2.equals(Name))){
			materials.type = m81.type;
			materials.point = m81.point;
			return materials;
			}
			
			if((m82.name.equals(Name)) || (m82.name2.equals(Name))){
			materials.type = m82.type;
			materials.point = m82.point;
			return materials;
			}
			
			if((m83.name.equals(Name)) || (m83.name2.equals(Name))){
			materials.type = m83.type;
			materials.point = m83.point;
			return materials;
			}
			
			if((m84.name.equals(Name)) || (m84.name2.equals(Name))){
			materials.type = m84.type;
			materials.point = m84.point;
			return materials;
			}
			
			if((m85.name.equals(Name)) || (m85.name2.equals(Name))){
			materials.type = m85.type;
			materials.point = m85.point;
			return materials;
			}
			
			if((m86.name.equals(Name)) || (m86.name2.equals(Name))){
			materials.type = m86.type;
			materials.point = m86.point;
			return materials;
			}
			
			if((m87.name.equals(Name)) || (m87.name2.equals(Name))){
			materials.type = m87.type;
			materials.point = m87.point;
			return materials;
			}
			
			if((m88.name.equals(Name)) || (m88.name2.equals(Name))){
			materials.type = m88.type;
			materials.point = m88.point;
			return materials;
			}
			
			if((m89.name.equals(Name)) || (m89.name2.equals(Name))){
			materials.type = m89.type;
			materials.point = m89.point;
			return materials;
			}
			
			if((m90.name.equals(Name)) || (m90.name2.equals(Name))){
			materials.type = m90.type;
			materials.point = m90.point;
			return materials;
			}
			
			if((m91.name.equals(Name)) || (m91.name2.equals(Name))){
			materials.type = m91.type;
			materials.point = m91.point;
			return materials;
			}
			
			if((m92.name.equals(Name)) || (m92.name2.equals(Name))){
			materials.type = m92.type;
			materials.point = m92.point;
			return materials;
			}
			
			if((m93.name.equals(Name)) || (m93.name2.equals(Name))){
			materials.type = m93.type;
			materials.point = m93.point;
			return materials;
			}
			
			if((m94.name.equals(Name)) || (m94.name2.equals(Name))){
			materials.type = m94.type;
			materials.point = m94.point;
			return materials;
			}
			
			if((m95.name.equals(Name)) || (m95.name2.equals(Name))){
			materials.type = m95.type;
			materials.point = m95.point;
			return materials;
			}
			
			if((m96.name.equals(Name)) || (m96.name2.equals(Name))){
			materials.type = m96.type;
			materials.point = m96.point;
			return materials;
			}
			
			if((m97.name.equals(Name)) || (m97.name2.equals(Name))){
			materials.type = m97.type;
			materials.point = m97.point;
			return materials;
			}
			
			if((m98.name.equals(Name)) || (m98.name2.equals(Name))){
			materials.type = m98.type;
			materials.point = m98.point;
			return materials;
			}
			
			if((m99.name.equals(Name)) || (m99.name2.equals(Name))){
			materials.type = m99.type;
			materials.point = m99.point;
			return materials;
			}
			
			if((m100.name.equals(Name)) || (m100.name2.equals(Name))){
			materials.type = m100.type;
			materials.point = m100.point;
			return materials;
			}
			
			if((m101.name.equals(Name)) || (m101.name2.equals(Name))){
			materials.type = m101.type;
			materials.point = m101.point;
			return materials;
			}
			
			if((m102.name.equals(Name)) || (m102.name2.equals(Name))){
			materials.type = m102.type;
			materials.point = m102.point;
			return materials;
			}
			
			if((m103.name.equals(Name)) || (m103.name2.equals(Name))){
			materials.type = m103.type;
			materials.point = m103.point;
			return materials;
			}
			
			if((m104.name.equals(Name)) || (m104.name2.equals(Name))){
			materials.type = m104.type;
			materials.point = m104.point;
			return materials;
			}
			
			if((m105.name.equals(Name)) || (m105.name2.equals(Name))){
			materials.type = m105.type;
			materials.point = m105.point;
			return materials;
			}
			
			if((m106.name.equals(Name)) || (m106.name2.equals(Name))){
			materials.type = m106.type;
			materials.point = m106.point;
			return materials;
			}
			
			if((m107.name.equals(Name)) || (m107.name2.equals(Name))){
			materials.type = m107.type;
			materials.point = m107.point;
			return materials;
			}
			
			if((m108.name.equals(Name)) || (m108.name2.equals(Name))){
			materials.type = m108.type;
			materials.point = m108.point;
			return materials;
			}
			
			if((m109.name.equals(Name)) || (m109.name2.equals(Name))){
			materials.type = m109.type;
			materials.point = m109.point;
			return materials;
			}
			
			if((m110.name.equals(Name)) || (m110.name2.equals(Name))){
			materials.type = m110.type;
			materials.point = m110.point;
			return materials;
			}
			
			if((m111.name.equals(Name)) || (m111.name2.equals(Name))){
			materials.type = m111.type;
			materials.point = m111.point;
			return materials;
			}
			
			if((m112.name.equals(Name)) || (m112.name2.equals(Name))){
			materials.type = m112.type;
			materials.point = m112.point;
			return materials;
			}
			
			if((m113.name.equals(Name)) || (m113.name2.equals(Name))){
			materials.type = m113.type;
			materials.point = m113.point;
			return materials;
			}
			
			if((m114.name.equals(Name)) || (m114.name2.equals(Name))){
			materials.type = m114.type;
			materials.point = m114.point;
			return materials;
			}
			
			if((m115.name.equals(Name)) || (m115.name2.equals(Name))){
			materials.type = m115.type;
			materials.point = m115.point;
			return materials;
			}
			
			if((m116.name.equals(Name)) || (m116.name2.equals(Name))){
			materials.type = m116.type;
			materials.point = m116.point;
			return materials;
			}
			
			if((m117.name.equals(Name)) || (m117.name2.equals(Name))){
			materials.type = m117.type;
			materials.point = m117.point;
			return materials;
			}
			
			if((m118.name.equals(Name)) || (m118.name2.equals(Name))){
			materials.type = m118.type;
			materials.point = m118.point;
			return materials;
			}
			
			if((m119.name.equals(Name)) || (m119.name2.equals(Name))){
			materials.type = m119.type;
			materials.point = m119.point;
			return materials;
			}
			
			if((m120.name.equals(Name)) || (m120.name2.equals(Name))){
			materials.type = m120.type;
			materials.point = m120.point;
			return materials;
			}
			
			if((m121.name.equals(Name)) || (m121.name2.equals(Name))){
			materials.type = m121.type;
			materials.point = m121.point;
			return materials;
			}
			
			if((m122.name.equals(Name)) || (m122.name2.equals(Name))){
			materials.type = m122.type;
			materials.point = m122.point;
			return materials;
			}
			
			if((m123.name.equals(Name)) || (m123.name2.equals(Name))){
			materials.type = m123.type;
			materials.point = m123.point;
			return materials;
			}
			
			if((m124.name.equals(Name)) || (m124.name2.equals(Name))){
			materials.type = m124.type;
			materials.point = m124.point;
			return materials;
			}
			
			if((m125.name.equals(Name)) || (m125.name2.equals(Name))){
			materials.type = m125.type;
			materials.point = m125.point;
			return materials;
			}
			
			if((m126.name.equals(Name)) || (m126.name2.equals(Name))){
			materials.type = m126.type;
			materials.point = m126.point;
			return materials;
			}
			
			if((m127.name.equals(Name)) || (m127.name2.equals(Name))){
			materials.type = m127.type;
			materials.point = m127.point;
			return materials;
			}
			
			if((m128.name.equals(Name)) || (m128.name2.equals(Name))){
			materials.type = m128.type;
			materials.point = m128.point;
			return materials;
			}
			
			if((m129.name.equals(Name)) || (m129.name2.equals(Name))){
			materials.type = m129.type;
			materials.point = m129.point;
			return materials;
			}
			
			if((m130.name.equals(Name)) || (m130.name2.equals(Name))){
			materials.type = m130.type;
			materials.point = m130.point;
			return materials;
			}
			
			if((m131.name.equals(Name)) || (m131.name2.equals(Name))){
			materials.type = m131.type;
			materials.point = m131.point;
			return materials;
			}
			
			if((m132.name.equals(Name)) || (m132.name2.equals(Name))){
			materials.type = m132.type;
			materials.point = m132.point;
			return materials;
			}
			
			if((m133.name.equals(Name)) || (m133.name2.equals(Name))){
			materials.type = m133.type;
			materials.point = m133.point;
			return materials;
			}
			
			if((m134.name.equals(Name)) || (m134.name2.equals(Name))){
			materials.type = m134.type;
			materials.point = m134.point;
			return materials;
			}
			
			if((m135.name.equals(Name)) || (m135.name2.equals(Name))){
			materials.type = m135.type;
			materials.point = m135.point;
			return materials;
			}
			
			if((m136.name.equals(Name)) || (m136.name2.equals(Name))){
			materials.type = m136.type;
			materials.point = m136.point;
			return materials;
			}
			
			if((m137.name.equals(Name)) || (m137.name2.equals(Name))){
			materials.type = m137.type;
			materials.point = m137.point;
			return materials;
			}
			
			if((m138.name.equals(Name)) || (m138.name2.equals(Name))){
			materials.type = m138.type;
			materials.point = m138.point;
			return materials;
			}
			
			if((m139.name.equals(Name)) || (m139.name2.equals(Name))){
			materials.type = m139.type;
			materials.point = m139.point;
			return materials;
			}
			
			if((m140.name.equals(Name)) || (m140.name2.equals(Name))){
			materials.type = m140.type;
			materials.point = m140.point;
			return materials;
			}
			
			if((m141.name.equals(Name)) || (m141.name2.equals(Name))){
			materials.type = m141.type;
			materials.point = m141.point;
			return materials;
			}
			
			if((m142.name.equals(Name)) || (m142.name2.equals(Name))){
			materials.type = m142.type;
			materials.point = m142.point;
			return materials;
			}
			
			if((m143.name.equals(Name)) || (m143.name2.equals(Name))){
			materials.type = m143.type;
			materials.point = m143.point;
			return materials;
			}
			
			if((m144.name.equals(Name)) || (m144.name2.equals(Name))){
			materials.type = m144.type;
			materials.point = m144.point;
			return materials;
			}
			
			if((m145.name.equals(Name)) || (m145.name2.equals(Name))){
			materials.type = m145.type;
			materials.point = m145.point;
			return materials;
			}
			
			if((m146.name.equals(Name)) || (m146.name2.equals(Name))){
			materials.type = m146.type;
			materials.point = m146.point;
			return materials;
			}
			
			if((m147.name.equals(Name)) || (m147.name2.equals(Name))){
			materials.type = m147.type;
			materials.point = m147.point;
			return materials;
			}
			
			if((m148.name.equals(Name)) || (m148.name2.equals(Name))){
			materials.type = m148.type;
			materials.point = m148.point;
			return materials;
			}
			
			if((m149.name.equals(Name)) || (m149.name2.equals(Name))){
			materials.type = m149.type;
			materials.point = m149.point;
			return materials;
			}
			
			if((m150.name.equals(Name)) || (m150.name2.equals(Name))){
			materials.type = m150.type;
			materials.point = m150.point;
			return materials;
			}
			
			if((m151.name.equals(Name)) || (m151.name2.equals(Name))){
			materials.type = m151.type;
			materials.point = m151.point;
			return materials;
			}
			
			if((m152.name.equals(Name)) || (m152.name2.equals(Name))){
			materials.type = m152.type;
			materials.point = m152.point;
			return materials;
			}
			
			if((m153.name.equals(Name)) || (m153.name2.equals(Name))){
			materials.type = m153.type;
			materials.point = m153.point;
			return materials;
			}
			
			if((m154.name.equals(Name)) || (m154.name2.equals(Name))){
			materials.type = m154.type;
			materials.point = m154.point;
			return materials;
			}
			
			if((m155.name.equals(Name)) || (m155.name2.equals(Name))){
			materials.type = m155.type;
			materials.point = m155.point;
			return materials;
			}
			
			if((m156.name.equals(Name)) || (m156.name2.equals(Name))){
			materials.type = m156.type;
			materials.point = m156.point;
			return materials;
			}
			
			if((m157.name.equals(Name)) || (m157.name2.equals(Name))){
			materials.type = m157.type;
			materials.point = m157.point;
			return materials;
			}
			
			if((m158.name.equals(Name)) || (m158.name2.equals(Name))){
			materials.type = m158.type;
			materials.point = m158.point;
			return materials;
			}
			
			if((m159.name.equals(Name)) || (m159.name2.equals(Name))){
			materials.type = m159.type;
			materials.point = m159.point;
			return materials;
			}
			
			if((m160.name.equals(Name)) || (m160.name2.equals(Name))){
			materials.type = m160.type;
			materials.point = m160.point;
			return materials;
			}
			
			if((m161.name.equals(Name)) || (m161.name2.equals(Name))){
			materials.type = m161.type;
			materials.point = m161.point;
			return materials;
			}
			
			if((m162.name.equals(Name)) || (m162.name2.equals(Name))){
			materials.type = m162.type;
			materials.point = m162.point;
			return materials;
			}
			
			if((m163.name.equals(Name)) || (m163.name2.equals(Name))){
			materials.type = m163.type;
			materials.point = m163.point;
			return materials;
			}
			
			if((m164.name.equals(Name)) || (m164.name2.equals(Name))){
			materials.type = m164.type;
			materials.point = m164.point;
			return materials;
			}
			
			if((m165.name.equals(Name)) || (m165.name2.equals(Name))){
			materials.type = m165.type;
			materials.point = m165.point;
			return materials;
			}
			
			if((m166.name.equals(Name)) || (m166.name2.equals(Name))){
			materials.type = m166.type;
			materials.point = m166.point;
			return materials;
			}
			
			if((m167.name.equals(Name)) || (m167.name2.equals(Name))){
			materials.type = m167.type;
			materials.point = m167.point;
			return materials;
			}
			
			if((m168.name.equals(Name)) || (m168.name2.equals(Name))){
			materials.type = m168.type;
			materials.point = m168.point;
			return materials;
			}
			
			if((m169.name.equals(Name)) || (m169.name2.equals(Name))){
			materials.type = m169.type;
			materials.point = m169.point;
			return materials;
			}
			
			if((m170.name.equals(Name)) || (m170.name2.equals(Name))){
			materials.type = m170.type;
			materials.point = m170.point;
			return materials;
			}
			
			if((m171.name.equals(Name)) || (m171.name2.equals(Name))){
			materials.type = m171.type;
			materials.point = m171.point;
			return materials;
			}
			
			if((m172.name.equals(Name)) || (m172.name2.equals(Name))){
			materials.type = m172.type;
			materials.point = m172.point;
			return materials;
			}
			
			if((m173.name.equals(Name)) || (m173.name2.equals(Name))){
			materials.type = m173.type;
			materials.point = m173.point;
			return materials;
			}
			
			if((m174.name.equals(Name)) || (m174.name2.equals(Name))){
			materials.type = m174.type;
			materials.point = m174.point;
			return materials;
			}
			
			if((m175.name.equals(Name)) || (m175.name2.equals(Name))){
			materials.type = m175.type;
			materials.point = m175.point;
			return materials;
			}
			
			if((m176.name.equals(Name)) || (m176.name2.equals(Name))){
			materials.type = m176.type;
			materials.point = m176.point;
			return materials;
			}
			
			if((m177.name.equals(Name)) || (m177.name2.equals(Name))){
			materials.type = m177.type;
			materials.point = m177.point;
			return materials;
			}
			
			if((m178.name.equals(Name)) || (m178.name2.equals(Name))){
			materials.type = m178.type;
			materials.point = m178.point;
			return materials;
			}
			
			if((m179.name.equals(Name)) || (m179.name2.equals(Name))){
			materials.type = m179.type;
			materials.point = m179.point;
			return materials;
			}
			
			if((m180.name.equals(Name)) || (m180.name2.equals(Name))){
			materials.type = m180.type;
			materials.point = m180.point;
			return materials;
			}
			
			if((m181.name.equals(Name)) || (m181.name2.equals(Name))){
			materials.type = m181.type;
			materials.point = m181.point;
			return materials;
			}
			
			if((m182.name.equals(Name)) || (m182.name2.equals(Name))){
			materials.type = m182.type;
			materials.point = m182.point;
			return materials;
			}
			
			if((m183.name.equals(Name)) || (m183.name2.equals(Name))){
			materials.type = m183.type;
			materials.point = m183.point;
			return materials;
			}
			
			if((m184.name.equals(Name)) || (m184.name2.equals(Name))){
			materials.type = m184.type;
			materials.point = m184.point;
			return materials;
			}
			
			if((m185.name.equals(Name)) || (m185.name2.equals(Name))){
			materials.type = m185.type;
			materials.point = m185.point;
			return materials;
			}
			
			if((m186.name.equals(Name)) || (m186.name2.equals(Name))){
			materials.type = m186.type;
			materials.point = m186.point;
			return materials;
			}
			
			if((m187.name.equals(Name)) || (m187.name2.equals(Name))){
			materials.type = m187.type;
			materials.point = m187.point;
			return materials;
			}
			
			if((m188.name.equals(Name)) || (m188.name2.equals(Name))){
			materials.type = m188.type;
			materials.point = m188.point;
			return materials;
			}
			
			if((m189.name.equals(Name)) || (m189.name2.equals(Name))){
			materials.type = m189.type;
			materials.point = m189.point;
			return materials;
			}
			
			if((m190.name.equals(Name)) || (m190.name2.equals(Name))){
			materials.type = m190.type;
			materials.point = m190.point;
			return materials;
			}
			
			if((m191.name.equals(Name)) || (m191.name2.equals(Name))){
			materials.type = m191.type;
			materials.point = m191.point;
			return materials;
			}
			
			if((m192.name.equals(Name)) || (m192.name2.equals(Name))){
			materials.type = m192.type;
			materials.point = m192.point;
			return materials;
			}
			
			if((m193.name.equals(Name)) || (m193.name2.equals(Name))){
			materials.type = m193.type;
			materials.point = m193.point;
			return materials;
			}
			
			if((m194.name.equals(Name)) || (m194.name2.equals(Name))){
			materials.type = m194.type;
			materials.point = m194.point;
			return materials;
			}
			
			if((m195.name.equals(Name)) || (m195.name2.equals(Name))){
			materials.type = m195.type;
			materials.point = m195.point;
			return materials;
			}
			
			if((m196.name.equals(Name)) || (m196.name2.equals(Name))){
			materials.type = m196.type;
			materials.point = m196.point;
			return materials;
			}
			
			if((m197.name.equals(Name)) || (m197.name2.equals(Name))){
			materials.type = m197.type;
			materials.point = m197.point;
			return materials;
			}
			
			if((m198.name.equals(Name)) || (m198.name2.equals(Name))){
			materials.type = m198.type;
			materials.point = m198.point;
			return materials;
			}
			
			if((m199.name.equals(Name)) || (m199.name2.equals(Name))){
			materials.type = m199.type;
			materials.point = m199.point;
			return materials;
			}
			
			if((m200.name.equals(Name)) || (m200.name2.equals(Name))){
			materials.type = m200.type;
			materials.point = m200.point;
			return materials;
			}
			
			if((m201.name.equals(Name)) || (m201.name2.equals(Name))){
			materials.type = m201.type;
			materials.point = m201.point;
			return materials;
			}
			
			if((m202.name.equals(Name)) || (m202.name2.equals(Name))){
			materials.type = m202.type;
			materials.point = m202.point;
			return materials;
			}
			
			if((m203.name.equals(Name)) || (m203.name2.equals(Name))){
			materials.type = m203.type;
			materials.point = m203.point;
			return materials;
			}
			
			if((m204.name.equals(Name)) || (m204.name2.equals(Name))){
			materials.type = m204.type;
			materials.point = m204.point;
			return materials;
			}
			
			if((m205.name.equals(Name)) || (m205.name2.equals(Name))){
			materials.type = m205.type;
			materials.point = m205.point;
			return materials;
			}
			
			if((m206.name.equals(Name)) || (m206.name2.equals(Name))){
			materials.type = m206.type;
			materials.point = m206.point;
			return materials;
			}
			
			if((m207.name.equals(Name)) || (m207.name2.equals(Name))){
			materials.type = m207.type;
			materials.point = m207.point;
			return materials;
			}
			
			if((m208.name.equals(Name)) || (m208.name2.equals(Name))){
			materials.type = m208.type;
			materials.point = m208.point;
			return materials;
			}
			
			if((m209.name.equals(Name)) || (m209.name2.equals(Name))){
			materials.type = m209.type;
			materials.point = m209.point;
			return materials;
			}
			
			if((m210.name.equals(Name)) || (m210.name2.equals(Name))){
			materials.type = m210.type;
			materials.point = m210.point;
			return materials;
			}
			
			if((m211.name.equals(Name)) || (m211.name2.equals(Name))){
			materials.type = m211.type;
			materials.point = m211.point;
			return materials;
			}
			
			if((m212.name.equals(Name)) || (m212.name2.equals(Name))){
			materials.type = m212.type;
			materials.point = m212.point;
			return materials;
			}
			
			if((m213.name.equals(Name)) || (m213.name2.equals(Name))){
			materials.type = m213.type;
			materials.point = m213.point;
			return materials;
			}
			
			if((m214.name.equals(Name)) || (m214.name2.equals(Name))){
			materials.type = m214.type;
			materials.point = m214.point;
			return materials;
			}
			
			if((m215.name.equals(Name)) || (m215.name2.equals(Name))){
			materials.type = m215.type;
			materials.point = m215.point;
			return materials;
			}
			
			if((m216.name.equals(Name)) || (m216.name2.equals(Name))){
			materials.type = m216.type;
			materials.point = m216.point;
			return materials;
			}
			
			if((m217.name.equals(Name)) || (m217.name2.equals(Name))){
			materials.type = m217.type;
			materials.point = m217.point;
			return materials;
			}
			
			if((m218.name.equals(Name)) || (m218.name2.equals(Name))){
			materials.type = m218.type;
			materials.point = m218.point;
			return materials;
			}
			
			if((m219.name.equals(Name)) || (m219.name2.equals(Name))){
			materials.type = m219.type;
			materials.point = m219.point;
			return materials;
			}
			
			if((m220.name.equals(Name)) || (m220.name2.equals(Name))){
			materials.type = m220.type;
			materials.point = m220.point;
			return materials;
			}
			
			if((m221.name.equals(Name)) || (m221.name2.equals(Name))){
			materials.type = m221.type;
			materials.point = m221.point;
			return materials;
			}
			
			if((m222.name.equals(Name)) || (m222.name2.equals(Name))){
			materials.type = m222.type;
			materials.point = m222.point;
			return materials;
			}
			
			if((m223.name.equals(Name)) || (m223.name2.equals(Name))){
			materials.type = m223.type;
			materials.point = m223.point;
			return materials;
			}
			
			if((m224.name.equals(Name)) || (m224.name2.equals(Name))){
			materials.type = m224.type;
			materials.point = m224.point;
			return materials;
			}
			
			if((m225.name.equals(Name)) || (m225.name2.equals(Name))){
			materials.type = m225.type;
			materials.point = m225.point;
			return materials;
			}
			
			if((m226.name.equals(Name)) || (m226.name2.equals(Name))){
			materials.type = m226.type;
			materials.point = m226.point;
			return materials;
			}
			
			if((m227.name.equals(Name)) || (m227.name2.equals(Name))){
			materials.type = m227.type;
			materials.point = m227.point;
			return materials;
			}
			
			if((m228.name.equals(Name)) || (m228.name2.equals(Name))){
			materials.type = m228.type;
			materials.point = m228.point;
			return materials;
			}
			
			if((m229.name.equals(Name)) || (m229.name2.equals(Name))){
			materials.type = m229.type;
			materials.point = m229.point;
			return materials;
			}
			
			if((m230.name.equals(Name)) || (m230.name2.equals(Name))){
			materials.type = m230.type;
			materials.point = m230.point;
			return materials;
			}
			
			if((m231.name.equals(Name)) || (m231.name2.equals(Name))){
			materials.type = m231.type;
			materials.point = m231.point;
			return materials;
			}
			
			if((m232.name.equals(Name)) || (m232.name2.equals(Name))){
			materials.type = m232.type;
			materials.point = m232.point;
			return materials;
			}
			
			if((m233.name.equals(Name)) || (m233.name2.equals(Name))){
			materials.type = m233.type;
			materials.point = m233.point;
			return materials;
			}
			
			if((m234.name.equals(Name)) || (m234.name2.equals(Name))){
			materials.type = m234.type;
			materials.point = m234.point;
			return materials;
			}
			
			if((m235.name.equals(Name)) || (m235.name2.equals(Name))){
			materials.type = m235.type;
			materials.point = m235.point;
			return materials;
			}
			
			if((m236.name.equals(Name)) || (m236.name2.equals(Name))){
			materials.type = m236.type;
			materials.point = m236.point;
			return materials;
			}
			
			if((m237.name.equals(Name)) || (m237.name2.equals(Name))){
			materials.type = m237.type;
			materials.point = m237.point;
			return materials;
			}
			
			if((m238.name.equals(Name)) || (m238.name2.equals(Name))){
			materials.type = m238.type;
			materials.point = m238.point;
			return materials;
			}
			
			if((m239.name.equals(Name)) || (m239.name2.equals(Name))){
			materials.type = m239.type;
			materials.point = m239.point;
			return materials;
			}
			
			if((m240.name.equals(Name)) || (m240.name2.equals(Name))){
			materials.type = m240.type;
			materials.point = m240.point;
			return materials;
			}
			
			if((m241.name.equals(Name)) || (m241.name2.equals(Name))){
			materials.type = m241.type;
			materials.point = m241.point;
			return materials;
			}
			
			if((m242.name.equals(Name)) || (m242.name2.equals(Name))){
			materials.type = m242.type;
			materials.point = m242.point;
			return materials;
			}
			
			if((m243.name.equals(Name)) || (m243.name2.equals(Name))){
			materials.type = m243.type;
			materials.point = m243.point;
			return materials;
			}
			
			if((m244.name.equals(Name)) || (m244.name2.equals(Name))){
			materials.type = m244.type;
			materials.point = m244.point;
			return materials;
			}
			
			if((m245.name.equals(Name)) || (m245.name2.equals(Name))){
			materials.type = m245.type;
			materials.point = m245.point;
			return materials;
			}
			
			if((m246.name.equals(Name)) || (m246.name2.equals(Name))){
			materials.type = m246.type;
			materials.point = m246.point;
			return materials;
			}
			
			if((m247.name.equals(Name)) || (m247.name2.equals(Name))){
			materials.type = m247.type;
			materials.point = m247.point;
			return materials;
			}
			
			if((m248.name.equals(Name)) || (m248.name2.equals(Name))){
			materials.type = m248.type;
			materials.point = m248.point;
			return materials;
			}
			
			if((m249.name.equals(Name)) || (m249.name2.equals(Name))){
			materials.type = m249.type;
			materials.point = m249.point;
			return materials;
			}
			
			if((m250.name.equals(Name)) || (m250.name2.equals(Name))){
			materials.type = m250.type;
			materials.point = m250.point;
			return materials;
			}
			
			if((m251.name.equals(Name)) || (m251.name2.equals(Name))){
			materials.type = m251.type;
			materials.point = m251.point;
			return materials;
			}
			
			if((m252.name.equals(Name)) || (m252.name2.equals(Name))){
			materials.type = m252.type;
			materials.point = m252.point;
			return materials;
			}
			
			if((m253.name.equals(Name)) || (m253.name2.equals(Name))){
			materials.type = m253.type;
			materials.point = m253.point;
			return materials;
			}
			
			if((m254.name.equals(Name)) || (m254.name2.equals(Name))){
			materials.type = m254.type;
			materials.point = m254.point;
			return materials;
			}
			
			if((m255.name.equals(Name)) || (m255.name2.equals(Name))){
			materials.type = m255.type;
			materials.point = m255.point;
			return materials;
			}
			
			if((m256.name.equals(Name)) || (m256.name2.equals(Name))){
			materials.type = m256.type;
			materials.point = m256.point;
			return materials;
			}
			
			if((m257.name.equals(Name)) || (m257.name2.equals(Name))){
			materials.type = m257.type;
			materials.point = m257.point;
			return materials;
			}
			
			if((m258.name.equals(Name)) || (m258.name2.equals(Name))){
			materials.type = m258.type;
			materials.point = m258.point;
			return materials;
			}
			
			if((m259.name.equals(Name)) || (m259.name2.equals(Name))){
			materials.type = m259.type;
			materials.point = m259.point;
			return materials;
			}
			
			if((m260.name.equals(Name)) || (m260.name2.equals(Name))){
			materials.type = m260.type;
			materials.point = m260.point;
			return materials;
			}
			
			if((m261.name.equals(Name)) || (m261.name2.equals(Name))){
			materials.type = m261.type;
			materials.point = m261.point;
			return materials;
			}
			
			if((m262.name.equals(Name)) || (m262.name2.equals(Name))){
			materials.type = m262.type;
			materials.point = m262.point;
			return materials;
			}
			
			if((m263.name.equals(Name)) || (m263.name2.equals(Name))){
			materials.type = m263.type;
			materials.point = m263.point;
			return materials;
			}
			
			if((m264.name.equals(Name)) || (m264.name2.equals(Name))){
			materials.type = m264.type;
			materials.point = m264.point;
			return materials;
			}
			
			if((m265.name.equals(Name)) || (m265.name2.equals(Name))){
			materials.type = m265.type;
			materials.point = m265.point;
			return materials;
			}
			
			if((m266.name.equals(Name)) || (m266.name2.equals(Name))){
			materials.type = m266.type;
			materials.point = m266.point;
			return materials;
			}
			
			if((m267.name.equals(Name)) || (m267.name2.equals(Name))){
			materials.type = m267.type;
			materials.point = m267.point;
			return materials;
			}
			
			if((m268.name.equals(Name)) || (m268.name2.equals(Name))){
			materials.type = m268.type;
			materials.point = m268.point;
			return materials;
			}
			
			if((m269.name.equals(Name)) || (m269.name2.equals(Name))){
			materials.type = m269.type;
			materials.point = m269.point;
			return materials;
			}
			
			if((m270.name.equals(Name)) || (m270.name2.equals(Name))){
			materials.type = m270.type;
			materials.point = m270.point;
			return materials;
			}
		
		return materials;
    }
}