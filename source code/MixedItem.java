public class MixedItem {
	String name;
	String name2;
	String type;
	int point; //タイプとポイントからどれが生成されるか算出
	boolean rare;
	boolean exist;
	public static void main(String[] args) {}
	public static MixedItem MixedItem(String Type, int Point){

		MixedItem exce = new MixedItem();
		exce.name = "エラー";

		MixedItem m1 = new MixedItem();
		m1.name = "わざレコード85";
		m1.name2 = "ふるいたてる";
		m1.type = "ノーマル";
		m1.point = 1;
		
		MixedItem m2 = new MixedItem();
		m2.name = "わざレコード14";
		m2.name2 = "ゆびをふる";
		m2.type = "ノーマル";
		m2.point = 11;
		
		MixedItem m3 = new MixedItem();
		m3.name = "わざレコード26";
		m3.name2 = "こらえる";
		m3.type = "ノーマル";
		m3.point = 16;
		
		MixedItem m4 = new MixedItem();
		m4.name = "わざレコード13";
		m3.name2 = "きあいだめ";
		m4.type = "ノーマル";
		m4.point = 21;
		
		MixedItem m5 = new MixedItem();
		m5.name = "わざレコード27";
		m3.name2 = "ねごと";
		m5.type = "ノーマル";
		m5.point = 26;
		
		MixedItem m6 = new MixedItem();
		m6.name = "わざレコード35";
		m3.name2 = "さわぐ";
		m6.type = "ノーマル";
		m6.point = 31;
		
		MixedItem m7 = new MixedItem();
		m7.name = "わざレコード01";
		m3.name2 = "のしかかり";
		m7.type = "ノーマル";
		m7.point = 36;
		
		MixedItem m8 = new MixedItem();
		m8.name = "わざレコード19";
		m3.name2 = "トライアタック";
		m8.type = "ノーマル";
		m8.point = 41;
		
		MixedItem m9 = new MixedItem();
		m9.name = "わざレコード29";
		m3.name2 = "バトンタッチ";
		m9.type = "ノーマル";
		m9.point = 46;
		
		MixedItem m10 = new MixedItem();
		m10.name = "わざレコード30";
		m3.name2 = "アンコール";
		m10.type = "ノーマル";
		m10.point = 51;
		
		MixedItem m11 = new MixedItem();
		m11.name = "わざレコード20";
		m3.name2 = "みがわり";
		m11.type = "ノーマル";
		m11.point = 56;
		
		MixedItem m12 = new MixedItem();
		m12.name = "わざレコード00";
		m3.name2 = "つるぎのまい";
		m12.type = "ノーマル";
		m12.point = 61;
		
		MixedItem m13 = new MixedItem();
		m13.name = "わざレコード42";
		m3.name2 = "ハイパーボイス";
		m13.type = "ノーマル";
		m13.point = 66;
		
		MixedItem m14 = new MixedItem();
		m14.name = "ぎんのおうかん";
		m14.name2 = "";
		m14.type = "ノーマル";
		m14.point = 71;
		
		MixedItem m15 = new MixedItem();
		m15.name = "ポイントアップ";
		m15.name2 = "";
		m15.type = "ノーマル";
		m15.point = 76;

		if((Type.equals(m1.type)) && (m1.point <= Point) && (Point <= m2.point)) {
			return m1;
			}
			
		if((Type.equals(m2.type)) && (m2.point <= Point) && (Point <= m3.point)) {
			return m2;
			}
			
		if((Type.equals(m3.type)) && (m3.point <= Point) && (Point <= m4.point)) {
			return m3;
			}
			
		if((Type.equals(m4.type)) && (m4.point <= Point) && (Point <= m5.point)) {
			return m4;
			}
			
		if((Type.equals(m5.type)) && (m5.point <= Point) && (Point <= m6.point)) {
			return m5;
			}
			
		if((Type.equals(m6.type)) && (m6.point <= Point) && (Point <= m7.point)) {
			return m6;
			}
			
		if((Type.equals(m7.type)) && (m7.point <= Point) && (Point <= m8.point)) {
			return m7;
			}
			
		if((Type.equals(m8.type)) && (m8.point <= Point) && (Point <= m9.point)) {
			return m8;
			}
			
		if((Type.equals(m9.type)) && (m9.point <= Point) && (Point <= m10.point)) {
			return m9;
			}
			
		if((Type.equals(m10.type)) && (m10.point <= Point) && (Point <= m11.point)) {
			return m10;
			}
			
		if((Type.equals(m11.type)) && (m11.point <= Point) && (Point <= m12.point)) {
			return m11;
			}
			
		if((Type.equals(m12.type)) && (m12.point <= Point) && (Point <= m13.point)) {
			return m12;
			}
			
		if((Type.equals(m13.type)) && (m13.point <= Point) && (Point <= m14.point)) {
			return m13;
			}
			
		if((Type.equals(m14.type)) && (m14.point <= Point) && (Point <= m15.point)) {
			return m14;
			}
			
		if((Type.equals(m15.type)) && (m15.point <= Point)) {
			return m15;
			}
			
		MixedItem m16 = new MixedItem();
		m16.name = "わざレコード88";
		m16.name2 = "ヒートスタンプ";
		m16.type = "ほのお";
		m16.point = 1;
		
		MixedItem m17 = new MixedItem();
		m17.name = "かえんだま";
		m17.name2 = "";
		m17.type = "ほのお";
		m17.point = 11;
		
		MixedItem m18 = new MixedItem();
		m18.name = "わざレコード41";
		m18.name2 = "ブレイズキック";
		m18.type = "ほのお";
		m18.point = 16;
		
		MixedItem m19 = new MixedItem();
		m19.name = "ねがいのかたまり";
		m19.name2 = "";
		m19.type = "ほのお";
		m19.point = 21;
		
		MixedItem m20 = new MixedItem();
		m20.name = "わざレコード02";
		m20.name2 = "かえんほうしゃ";
		m20.type = "ほのお";
		m20.point = 26;
		
		MixedItem m21 = new MixedItem();
		m21.name = "かおるキノコ";
		m21.name2 = "";
		m21.type = "ほのお";
		m21.point = 31;
		
		MixedItem m22 = new MixedItem();
		m22.name = "わざレコード36";
		m22.name2 = "ねっぷう";
		m22.type = "ほのお";
		m22.point = 36;
		
		MixedItem m23 = new MixedItem();
		m23.name = "レッドカード";
		m23.name2 = "";
		m23.type = "ほのお";
		m23.point = 41;
		
		MixedItem m24 = new MixedItem();
		m24.name = "わざレコード15";
		m24.name2 = "だいもんじ";
		m24.type = "ほのお";
		m24.point = 46;
		
		MixedItem m25 = new MixedItem();
		m25.name = "もくたん";
		m25.name2 = "";
		m25.type = "ほのお";
		m25.point = 51;
		
		MixedItem m26 = new MixedItem();
		m26.name = "わざレコード55";
		m26.name2 = "フレアドライブ";
		m26.type = "ほのお";
		m26.point = 56;
		
		MixedItem m27 = new MixedItem();
		m27.name = "わざレコード43";
		m27.name2 = "オーバーヒート";
		m27.type = "ほのお";
		m27.point = 61;
		
		MixedItem m28 = new MixedItem();
		m28.name = "ふしぎなアメ";
		m28.name2 = "";
		m28.type = "ほのお";
		m28.point = 66;
		
		MixedItem m29 = new MixedItem();
		m29.name = "ぎんのおうかん";
		m29.name2 = "";
		m29.type = "ほのお";
		m29.point = 71;
		
		MixedItem m30 = new MixedItem();
		m30.name = "ポイントアップ";
		m30.name2 = "";
		m30.type = "ほのお";
		m30.point = 76;

		if((Type.equals(m16.type)) && (m16.point <= Point) && (Point <= m17.point)) {
				return m16;
				}
				
		if((Type.equals(m17.type)) && (m17.point <= Point) && (Point <= m18.point)) {
				return m17;
				}
				
		if((Type.equals(m18.type)) && (m18.point <= Point) && (Point <= m19.point)) {
				return m18;
				}
				
		if((Type.equals(m19.type)) && (m19.point <= Point) && (Point <= m20.point)) {
				return m19;
				}
				
		if((Type.equals(m20.type)) && (m20.point <= Point) && (Point <= m21.point)) {
				return m20;
				}
				
		if((Type.equals(m21.type)) && (m21.point <= Point) && (Point <= m22.point)) {
				return m21;
				}
				
		if((Type.equals(m22.type)) && (m22.point <= Point) && (Point <= m23.point)) {
				return m22;
				}
				
		if((Type.equals(m23.type)) && (m23.point <= Point) && (Point <= m24.point)) {
				return m23;
				}
				
		if((Type.equals(m24.type)) && (m24.point <= Point) && (Point <= m25.point)) {
				return m24;
				}
				
		if((Type.equals(m25.type)) && (m25.point <= Point) && (Point <= m26.point)) {
				return m25;
				}
				
		if((Type.equals(m26.type)) && (m26.point <= Point) && (Point <= m27.point)) {
				return m26;
				}
				
		if((Type.equals(m27.type)) && (m27.point <= Point) && (Point <= m28.point)) {
				return m27;
				}
				
		if((Type.equals(m28.type)) && (m28.point <= Point) && (Point <= m29.point)) {
				return m28;
				}
				
		if((Type.equals(m29.type)) && (m29.point <= Point) && (Point <= m30.point)) {
				return m29;
				}
				
		if((Type.equals(m30.type)) && (m30.point <= Point)) {
				return m30;
				}

		MixedItem m31 = new MixedItem();
		m31.name = "うしおのおこう";
		m31.name2 = "";
		m31.type = "みず";
		m31.point = 1;
				
		MixedItem m32 = new MixedItem();
		m32.name = "わざレコード04";
		m32.name2 = "なみのり";
		m32.type = "みず";
		m32.point = 11;
				
		MixedItem m33 = new MixedItem();
		m33.name = "かいがらのすず";
		m33.name2 = "";
		m33.type = "みず";
		m33.point = 16;
				
		MixedItem m34 = new MixedItem();
		m34.name = "ねがいのかたまり";
		m34.name2 = "";
		m34.type = "みず";
				m34.point = 21;
				
		MixedItem m35 = new MixedItem();
		m35.name = "わざレコード16";
		m35.name2 = "たきのぼり";
		m35.type = "みず";
		m35.point = 26;
				
		MixedItem m36 = new MixedItem();
		m36.name = "わざレコード98";
		m36.name2 = "アクアブレイク";
		m36.type = "みず";
		m36.point = 31;
				
		MixedItem m37 = new MixedItem();
		m37.name = "きれいなウロコ";
		m37.name2 = "";
		m37.type = "みず";
		m37.point = 36;
				
		MixedItem m38 = new MixedItem();
		m38.name = "しんぴのしずく";
		m38.name2 = "";
		m38.type = "みず";
		m38.point = 41;
				
		MixedItem m39 = new MixedItem();
		m39.name = "おだんごしんじゅ";
		m39.name2 = "";
		m39.type = "みず";
		m39.point = 46;
				
		MixedItem m40 = new MixedItem();
		m40.name = "わざレコード45";
		m40.name2 = "だくりゅう";
		m40.type = "みず";
		m40.point = 51;
				
		MixedItem m41 = new MixedItem();
		m41.name = "わざレコード84";
		m41.name2 = "ねっとう";
		m41.type = "みず";
		m41.point = 56;
				
		MixedItem m42 = new MixedItem();
		m42.name = "わざレコード03";
		m42.name2 = "ハイドロポンプ";
		m42.type = "みず";
		m42.point = 61;
				
		MixedItem m43 = new MixedItem();
		m43.name = "ふしぎなアメ";
		m43.name2 = "";
		m43.type = "みず";
		m43.point = 66;
				
		MixedItem m44 = new MixedItem();
		m44.name = "ぎんのおうかん";
		m44.name2 = "";
		m44.type = "みず";
		m44.point = 71;
				
		MixedItem m45 = new MixedItem();
		m45.name = "ポイントアップ";
		m45.name2 = "";
		m45.type = "みず";
		m45.point = 76;	

		if((Type.equals(m31.type)) && (m31.point <= Point) && (Point <= m32.point)) {
			return m31;
			}
			
		if((Type.equals(m32.type)) && (m32.point <= Point) && (Point <= m33.point)) {
			return m32;
			}
			
		if((Type.equals(m33.type)) && (m33.point <= Point) && (Point <= m34.point)) {
			return m33;
			}
			
		if((Type.equals(m34.type)) && (m34.point <= Point) && (Point <= m35.point)) {
			return m34;
			}
			
		if((Type.equals(m35.type)) && (m35.point <= Point) && (Point <= m36.point)) {
			return m35;
			}
			
		if((Type.equals(m36.type)) && (m36.point <= Point) && (Point <= m37.point)) {
			return m36;
			}
			
		if((Type.equals(m37.type)) && (m37.point <= Point) && (Point <= m38.point)) {
			return m37;
			}
			
		if((Type.equals(m38.type)) && (m38.point <= Point) && (Point <= m39.point)) {
			return m38;
			}
			
		if((Type.equals(m39.type)) && (m39.point <= Point) && (Point <= m40.point)) {
			return m39;
			}
			
		if((Type.equals(m40.type)) && (m40.point <= Point) && (Point <= m41.point)) {
			return m40;
			}
			
		if((Type.equals(m41.type)) && (m41.point <= Point) && (Point <= m42.point)) {
			return m41;
			}
			
		if((Type.equals(m42.type)) && (m42.point <= Point) && (Point <= m43.point)) {
			return m42;
			}
			
		if((Type.equals(m43.type)) && (m43.point <= Point) && (Point <= m44.point)) {
			return m43;
			}
			
		if((Type.equals(m44.type)) && (m44.point <= Point) && (Point <= m45.point)) {
			return m44;
			}
			
		if((Type.equals(m45.type)) && (m45.point <= Point)) {
			return m45;
			}

		MixedItem m46 = new MixedItem();
		m46.name = "エレキシード";
		m46.name2 = "";
		m46.type = "でんき";
		m46.point = 1;
		
		MixedItem m47 = new MixedItem();
		m47.name = "わざレコード80";
		m47.name2 = "エレキボール";
		m47.type = "でんき";
		m47.point = 11;
		
		MixedItem m48 = new MixedItem();
		m48.name = "じゅうでんち";
		m48.name2 = "";
		m48.type = "でんき";
		m48.point = 16;
		
		MixedItem m49 = new MixedItem();
		m49.name = "ねがいのかたまり";
		m49.name2 = "";
		m49.type = "でんき";
		m49.point = 21;
		
		MixedItem m50 = new MixedItem();
		m50.name = "じしゃく";
		m50.name2 = "";
		m50.type = "でんき";
		m50.point = 26;
		
		MixedItem m51 = new MixedItem();
		m51.name = "わざレコード86";
		m51.name2 = "ワイルドボルト";
		m51.type = "でんき";
		m51.point = 31;
		
		MixedItem m52 = new MixedItem();
		m52.name = "アップグレード";
		m52.name2 = "";
		m52.type = "でんき";
		m52.point = 36;
		
		MixedItem m53 = new MixedItem();
		m53.name = "でんきだま";
		m53.name2 = "";
		m53.type = "でんき";
		m53.point = 41;
		
		MixedItem m54 = new MixedItem();
		m54.name = "おだんごしんじゅ";
		m54.name2 = "";
		m54.type = "でんき";
		m54.point = 46;
		
		MixedItem m55 = new MixedItem();
		m55.name = "あやしいパッチ";
		m55.name2 = "";
		m55.type = "でんき";
		m55.point = 51;
		
		MixedItem m56 = new MixedItem();
		m56.name = "わざレコード08";
		m56.name2 = "10まんボルト";
		m56.type = "でんき";
		m56.point = 56;
		
		MixedItem m57 = new MixedItem();
		m57.name = "わざレコード09";
		m57.name2 = "かみなり";
		m57.type = "でんき";
		m57.point = 61;
		
		MixedItem m58 = new MixedItem();
		m58.name = "ふしぎなアメ";
		m58.name2 = "";
		m58.type = "でんき";
		m58.point = 66;
		
		MixedItem m59 = new MixedItem();
		m59.name = "ぎんのおうかん";
		m59.name2 = "";
		m59.type = "でんき";
		m59.point = 71;
		
		MixedItem m60 = new MixedItem();
		m60.name = "ポイントアップ";
		m60.name2 = "";
		m60.type = "でんき";
		m60.point = 76;

		if((Type.equals(m46.type)) && (m46.point <= Point) && (Point <= m47.point)) {
			return m46;
			}
			
		if((Type.equals(m47.type)) && (m47.point <= Point) && (Point <= m48.point)) {
			return m47;
			}
			
		if((Type.equals(m48.type)) && (m48.point <= Point) && (Point <= m49.point)) {
			return m48;
			}
			
		if((Type.equals(m49.type)) && (m49.point <= Point) && (Point <= m50.point)) {
			return m49;
			}
			
		if((Type.equals(m50.type)) && (m50.point <= Point) && (Point <= m51.point)) {
			return m50;
			}
			
		if((Type.equals(m51.type)) && (m51.point <= Point) && (Point <= m52.point)) {
			return m51;
			}
			
		if((Type.equals(m52.type)) && (m52.point <= Point) && (Point <= m53.point)) {
			return m52;
			}
			
		if((Type.equals(m53.type)) && (m53.point <= Point) && (Point <= m54.point)) {
			return m53;
			}
			
		if((Type.equals(m54.type)) && (m54.point <= Point) && (Point <= m55.point)) {
			return m54;
			}
			
		if((Type.equals(m55.type)) && (m55.point <= Point) && (Point <= m56.point)) {
			return m55;
			}
			
		if((Type.equals(m56.type)) && (m56.point <= Point) && (Point <= m57.point)) {
			return m56;
			}
			
		if((Type.equals(m57.type)) && (m57.point <= Point) && (Point <= m58.point)) {
			return m57;
			}
			
		if((Type.equals(m58.type)) && (m58.point <= Point) && (Point <= m59.point)) {
			return m58;
			}
			
		if((Type.equals(m59.type)) && (m59.point <= Point) && (Point <= m60.point)) {
			return m59;
			}
			
		if((Type.equals(m60.type)) && (m60.point <= Point)) {
			return m60;
			}

		MixedItem m61 = new MixedItem();
		m61.name = "グラスシード";
		m61.name2 = "";
		m61.type = "くさ";
		m61.point = 1;
		
		MixedItem m62 = new MixedItem();
		m62.name = "わざレコード59";
		m62.name2 = "タネばくだん";
		m62.type = "くさ";
		m62.point = 11;
		
		MixedItem m63 = new MixedItem();
		m63.name = "しろいハーブ";
		m63.name2 = "";
		m63.type = "くさ";
		m63.point = 16;
		
		MixedItem m64 = new MixedItem();
		m64.name = "ねがいのかたまり";
		m64.name2 = "";
		m64.type = "くさ";
		m64.point = 21;
		
		MixedItem m65 = new MixedItem();
		m65.name = "わざレコード77";
		m65.name2 = "くさむすび";
		m65.type = "くさ";
		m65.point = 26;
		
		MixedItem m66 = new MixedItem();
		m66.name = "わざレコード50";
		m66.name2 = "リーフブレード";
		m66.type = "くさ";
		m66.point = 31;
		
		MixedItem m67 = new MixedItem();
		m67.name = "わざレコード65";
		m67.name2 = "エナジーボール";
		m67.type = "くさ";
		m67.point = 36;
		
		MixedItem m68 = new MixedItem();
		m68.name = "きゅうこん";
		m68.name2 = "";
		m68.type = "くさ";
		m68.point = 41;
		
		MixedItem m69 = new MixedItem();
		m69.name = "おだんごしんじゅ";
		m69.name2 = "";
		m69.type = "くさ";
		m69.point = 46;
		
		MixedItem m70 = new MixedItem();
		m70.name = "わざレコード72";
		m70.name2 = "パワーウィップ";
		m70.type = "くさ";
		m70.point = 51;
		
		MixedItem m71 = new MixedItem();
		m71.name = "すいせいのかけら";
		m71.name2 = "";
		m71.type = "くさ";
		m71.point = 56;
		
		MixedItem m72 = new MixedItem();
		m72.name = "わざレコード71";
		m72.name2 = "リーフストーム";
		m72.type = "くさ";
		m72.point = 61;
		
		MixedItem m73 = new MixedItem();
		m73.name = "ふしぎなアメ";
		m73.name2 = "";
		m73.type = "くさ";
		m73.point = 66;
		
		MixedItem m74 = new MixedItem();
		m74.name = "ぎんのおうかん";
		m74.name2 = "";
		m74.type = "くさ";
		m74.point = 71;
		
		MixedItem m75 = new MixedItem();
		m75.name = "ポイントアップ";
		m75.name2 = "";
		m75.type = "くさ";
		m75.point = 76;

		if((Type.equals(m61.type)) && (m61.point <= Point) && (Point <= m62.point)) {
			return m61;
			}
			
		if((Type.equals(m62.type)) && (m62.point <= Point) && (Point <= m63.point)) {
			return m62;
			}
			
		if((Type.equals(m63.type)) && (m63.point <= Point) && (Point <= m64.point)) {
			return m63;
			}
			
		if((Type.equals(m64.type)) && (m64.point <= Point) && (Point <= m65.point)) {
			return m64;
			}
			
		if((Type.equals(m65.type)) && (m65.point <= Point) && (Point <= m66.point)) {
			return m65;
			}
			
		if((Type.equals(m66.type)) && (m66.point <= Point) && (Point <= m67.point)) {
			return m66;
			}
			
		if((Type.equals(m67.type)) && (m67.point <= Point) && (Point <= m68.point)) {
			return m67;
			}
			
		if((Type.equals(m68.type)) && (m68.point <= Point) && (Point <= m69.point)) {
			return m68;
			}
			
		if((Type.equals(m69.type)) && (m69.point <= Point) && (Point <= m70.point)) {
			return m69;
			}
			
		if((Type.equals(m70.type)) && (m70.point <= Point) && (Point <= m71.point)) {
			return m70;
			}
			
		if((Type.equals(m71.type)) && (m71.point <= Point) && (Point <= m72.point)) {
			return m71;
			}
			
		if((Type.equals(m72.type)) && (m72.point <= Point) && (Point <= m73.point)) {
			return m72;
			}
			
		if((Type.equals(m73.type)) && (m73.point <= Point) && (Point <= m74.point)) {
			return m73;
			}
			
		if((Type.equals(m74.type)) && (m74.point <= Point) && (Point <= m75.point)) {
			return m74;
			}
			
		if((Type.equals(m75.type)) && (m75.point <= Point)) {
			return m75;
			}		

		MixedItem m76 = new MixedItem();
		m76.name = "ゆきだま";
		m76.name2 = "";
		m76.type = "こおり";
		m76.point = 1;
		
		MixedItem m77 = new MixedItem();
		m77.name = "つめたいいわ";
		m77.name2 = "";
		m77.type = "こおり";
		m77.point = 11;
		
		MixedItem m78 = new MixedItem();
		m78.name = "とけないこおり";
		m78.name2 = "";
		m78.type = "こおり";
		m78.point = 16;
		
		MixedItem m79 = new MixedItem();
		m79.name = "ねがいのかたまり";
		m79.name2 = "";
		m79.type = "こおり";
		m79.point = 21;
		
		MixedItem m80 = new MixedItem();
		m80.name = "ほしのかけら";
		m80.name2 = "";
		m80.type = "こおり";
		m80.point = 26;
		
		MixedItem m81 = new MixedItem();
		m81.name = "かおるキノコ";
		m81.name2 = "";
		m81.type = "こおり";
		m81.point = 31;
		
		MixedItem m82 = new MixedItem();
		m82.name = "するどいツメ";
		m82.name2 = "";
		m82.type = "こおり";
		m82.point = 36;
		
		MixedItem m83 = new MixedItem();
		m83.name = "ゆきだま";
		m83.name2 = "";
		m83.type = "こおり";
		m83.point = 41;
		
		MixedItem m84 = new MixedItem();
		m84.name = "おだんごしんじゅ";
		m84.name2 = "";
		m84.type = "こおり";
		m84.point = 46;
		
		MixedItem m85 = new MixedItem();
		m85.name = "わざレコード05";
		m85.name2 = "れいとうビーム";
		m85.type = "こおり";
		m85.point = 51;
		
		MixedItem m86 = new MixedItem();
		m86.name = "すいせいのかけら";
		m86.name2 = "";
		m86.type = "こおり";
		m86.point = 56;
		
		MixedItem m87 = new MixedItem();
		m87.name = "わざレコード06";
		m87.name2 = "ふぶき";
		m87.type = "こおり";
		m87.point = 61;
		
		MixedItem m88 = new MixedItem();
		m88.name = "ふしぎなアメ";
		m88.name2 = "";
		m88.type = "こおり";
		m88.point = 66;
		
		MixedItem m89 = new MixedItem();
		m89.name = "ぎんのおうかん";
		m89.name2 = "";
		m89.type = "こおり";
		m89.point = 71;
		
		MixedItem m90 = new MixedItem();
		m90.name = "ポイントアップ";
		m90.name2 = "";
		m90.type = "こおり";
		m90.point = 76;	
	
		if((Type.equals(m76.type)) && (m76.point <= Point) && (Point <= m77.point)) {
			return m76;
			}
			
		if((Type.equals(m77.type)) && (m77.point <= Point) && (Point <= m78.point)) {
			return m77;
			}
			
		if((Type.equals(m78.type)) && (m78.point <= Point) && (Point <= m79.point)) {
			return m78;
			}
			
		if((Type.equals(m79.type)) && (m79.point <= Point) && (Point <= m80.point)) {
			return m79;
			}
			
		if((Type.equals(m80.type)) && (m80.point <= Point) && (Point <= m81.point)) {
			return m80;
			}
			
		if((Type.equals(m81.type)) && (m81.point <= Point) && (Point <= m82.point)) {
			return m81;
			}
			
		if((Type.equals(m82.type)) && (m82.point <= Point) && (Point <= m83.point)) {
			return m82;
			}
			
		if((Type.equals(m83.type)) && (m83.point <= Point) && (Point <= m84.point)) {
			return m83;
			}
			
		if((Type.equals(m84.type)) && (m84.point <= Point) && (Point <= m85.point)) {
			return m84;
			}
			
		if((Type.equals(m85.type)) && (m85.point <= Point) && (Point <= m86.point)) {
			return m85;
			}
			
		if((Type.equals(m86.type)) && (m86.point <= Point) && (Point <= m87.point)) {
			return m86;
			}
			
		if((Type.equals(m87.type)) && (m87.point <= Point) && (Point <= m88.point)) {
			return m87;
			}
			
		if((Type.equals(m88.type)) && (m88.point <= Point) && (Point <= m89.point)) {
			return m88;
			}
			
		if((Type.equals(m89.type)) && (m89.point <= Point) && (Point <= m90.point)) {
			return m89;
			}
			
		if((Type.equals(m90.type)) && (m90.point <= Point)) {
			return m90;
			}

		MixedItem m91 = new MixedItem();
		m91.name = "わざレコード07";
		m91.name2 = "けたぐり";
		m91.type = "かくとう";
		m91.point = 1;
		
		MixedItem m92 = new MixedItem();
		m92.name = "わざレコード56";
		m92.name2 = "はどうだん";
		m92.type = "かくとう";
		m92.point = 11;
		
		MixedItem m93 = new MixedItem();
		m93.name = "ちからのハチマキ";
		m93.name2 = "";
		m93.type = "かくとう";
		m93.point = 16;
		
		MixedItem m94 = new MixedItem();
		m94.name = "ねがいのかたまり";
		m94.name2 = "";
		m94.type = "かくとう";
		m94.point = 21;
		
		MixedItem m95 = new MixedItem();
		m95.name = "わざレコード48";
		m95.name2 = "ビルドアップ";
		m95.type = "かくとう";
		m95.point = 26;
		
		MixedItem m96 = new MixedItem();
		m96.name = "わざレコード21";
		m96.name2 = "きしかいせい";
		m96.type = "かくとう";
		m96.point = 31;
		
		MixedItem m97 = new MixedItem();
		m97.name = "きょうせいギプス";
		m97.name2 = "";
		m97.type = "かくとう";
		m97.point = 36;
		
		MixedItem m98 = new MixedItem();
		m98.name = "わざレコード99";
		m98.name2 = "ボディプレス";
		m98.type = "かくとう";
		m98.point = 41;
		
		MixedItem m99 = new MixedItem();
		m99.name = "たつじんのおび";
		m99.name2 = "";
		m99.type = "かくとう";
		m99.point = 46;
		
		MixedItem m100 = new MixedItem();
		m100.name = "わざレコード64";
		m100.name2 = "きあいだま";
		m100.type = "かくとう";
		m100.point = 51;
		
		MixedItem m101 = new MixedItem();
		m101.name = "わざレコード39";
		m101.name2 = "ばかぢから";
		m101.type = "かくとう";
		m101.point = 56;
		
		MixedItem m102 = new MixedItem();
		m102.name = "わざレコード53";
		m102.name2 = "インファイト";
		m102.type = "かくとう";
		m102.point = 61;
		
		MixedItem m103 = new MixedItem();
		m103.name = "ふしぎなアメ";
		m103.name2 = "";
		m103.type = "かくとう";
		m103.point = 66;
		
		MixedItem m104 = new MixedItem();
		m104.name = "ぎんのおうかん";
		m104.name2 = "";
		m104.type = "かくとう";
		m104.point = 71;
		
		MixedItem m105 = new MixedItem();
		m105.name = "ポイントアップ";
		m105.name2 = "";
		m105.type = "かくとう";
		m105.point = 76;	
	
		if((Type.equals(m91.type)) && (m91.point <= Point) && (Point <= m92.point)) {
			return m91;
			}
			
		if((Type.equals(m92.type)) && (m92.point <= Point) && (Point <= m93.point)) {
			return m92;
			}
			
		if((Type.equals(m93.type)) && (m93.point <= Point) && (Point <= m94.point)) {
			return m93;
			}
			
		if((Type.equals(m94.type)) && (m94.point <= Point) && (Point <= m95.point)) {
			return m94;
			}
			
		if((Type.equals(m95.type)) && (m95.point <= Point) && (Point <= m96.point)) {
			return m95;
			}
			
		if((Type.equals(m96.type)) && (m96.point <= Point) && (Point <= m97.point)) {
			return m96;
			}
			
		if((Type.equals(m97.type)) && (m97.point <= Point) && (Point <= m98.point)) {
			return m97;
			}
			
		if((Type.equals(m98.type)) && (m98.point <= Point) && (Point <= m99.point)) {
			return m98;
			}
			
		if((Type.equals(m99.type)) && (m99.point <= Point) && (Point <= m100.point)) {
			return m99;
			}
			
		if((Type.equals(m100.type)) && (m100.point <= Point) && (Point <= m101.point)) {
			return m100;
			}
			
		if((Type.equals(m101.type)) && (m101.point <= Point) && (Point <= m102.point)) {
			return m101;
			}
			
		if((Type.equals(m102.type)) && (m102.point <= Point) && (Point <= m103.point)) {
			return m102;
			}
			
		if((Type.equals(m103.type)) && (m103.point <= Point) && (Point <= m104.point)) {
			return m103;
			}
			
		if((Type.equals(m104.type)) && (m104.point <= Point) && (Point <= m105.point)) {
			return m104;
			}
			
		if((Type.equals(m105.type)) && (m105.point <= Point)) {
			return m105;
			}	

		MixedItem m106 = new MixedItem();
		m106.name = "くろいヘドロ";
		m106.name2 = "";
		m106.type = "どく";
		m106.point = 1;
		
		MixedItem m107 = new MixedItem();
		m107.name = "どくどくだま";
		m107.name2 = "";
		m107.type = "どく";
		m107.point = 11;
		
		MixedItem m108 = new MixedItem();
		m108.name = "わざレコード91";
		m108.name2 = "ベノムトラップ";
		m108.type = "どく";
		m108.point = 16;
		
		MixedItem m109 = new MixedItem();
		m109.name = "ねがいのかたまり";
		m109.name2 = "";
		m109.type = "どく";
		m109.point = 21;
		
		MixedItem m110 = new MixedItem();
		m110.name = "わざレコード54";
		m110.name2 = "どくびし";
		m110.type = "どく";
		m110.point = 26;
		
		MixedItem m111 = new MixedItem();
		m111.name = "けむりだま";
		m111.name2 = "";
		m111.type = "どく";
		m111.point = 31;
		
		MixedItem m112 = new MixedItem();
		m112.name = "わざレコード57";
		m112.name2 = "どくづき";
		m112.type = "どく";
		m112.point = 36;
		
		MixedItem m113 = new MixedItem();
		m113.name = "スピードパウダー";
		m113.name2 = "";
		m113.type = "どく";
		m113.point = 41;
		
		MixedItem m114 = new MixedItem();
		m114.name = "どくバリ";
		m114.name2 = "";
		m114.type = "どく";
		m114.point = 46;
		
		MixedItem m115 = new MixedItem();
		m115.name = "わざレコード22";
		m115.name2 = "ヘドロばくだん";
		m115.type = "どく";
		m115.point = 51;
		
		MixedItem m116 = new MixedItem();
		m116.name = "わざレコード78";
		m116.name2 = "ヘドロウェーブ";
		m116.type = "どく";
		m116.point = 56;
		
		MixedItem m117 = new MixedItem();
		m117.name = "わざレコード73";
		m117.name2 = "ダストシュート";
		m117.type = "どく";
		m117.point = 61;
		
		MixedItem m118 = new MixedItem();
		m118.name = "ふしぎなアメ";
		m118.name2 = "";
		m118.type = "どく";
		m118.point = 66;
		
		MixedItem m119 = new MixedItem();
		m119.name = "ぎんのおうかん";
		m119.name2 = "";
		m119.type = "どく";
		m119.point = 71;
		
		MixedItem m120 = new MixedItem();
		m120.name = "ポイントアップ";
		m120.name2 = "";
		m120.type = "どく";
		m120.point = 76;

		if((Type.equals(m106.type)) && (m106.point <= Point) && (Point <= m107.point)) {
			return m106;
			}
			
		if((Type.equals(m107.type)) && (m107.point <= Point) && (Point <= m108.point)) {
			return m107;
			}
			
		if((Type.equals(m108.type)) && (m108.point <= Point) && (Point <= m109.point)) {
			return m108;
			}
			
		if((Type.equals(m109.type)) && (m109.point <= Point) && (Point <= m110.point)) {
			return m109;
			}
			
		if((Type.equals(m110.type)) && (m110.point <= Point) && (Point <= m111.point)) {
			return m110;
			}
			
		if((Type.equals(m111.type)) && (m111.point <= Point) && (Point <= m112.point)) {
			return m111;
			}
			
		if((Type.equals(m112.type)) && (m112.point <= Point) && (Point <= m113.point)) {
			return m112;
			}
			
		if((Type.equals(m113.type)) && (m113.point <= Point) && (Point <= m114.point)) {
			return m113;
			}
			
		if((Type.equals(m114.type)) && (m114.point <= Point) && (Point <= m115.point)) {
			return m114;
			}
			
		if((Type.equals(m115.type)) && (m115.point <= Point) && (Point <= m116.point)) {
			return m115;
			}
			
		if((Type.equals(m116.type)) && (m116.point <= Point) && (Point <= m117.point)) {
			return m116;
			}
			
		if((Type.equals(m117.type)) && (m117.point <= Point) && (Point <= m118.point)) {
			return m117;
			}
			
		if((Type.equals(m118.type)) && (m118.point <= Point) && (Point <= m119.point)) {
			return m118;
			}
			
		if((Type.equals(m119.type)) && (m119.point <= Point) && (Point <= m120.point)) {
			return m119;
			}
			
		if((Type.equals(m120.type)) && (m120.point <= Point)) {
			return m120;
			}

		MixedItem m121 = new MixedItem();
		m121.name = "ほしのすな";
		m121.name2 = "";
		m121.type = "じめん";
		m121.point = 1;
		
		MixedItem m122 = new MixedItem();
		m122.name = "わざレコード23";
		m122.name2 = "まきびし";
		m122.type = "じめん";
		m122.point = 11;
		
		MixedItem m123 = new MixedItem();
		m123.name = "おおきなキノコ";
		m123.name2 = "";
		m123.type = "じめん";
		m123.point = 16;
		
		MixedItem m124 = new MixedItem();
		m124.name = "ねがいのかたまり";
		m124.name2 = "";
		m124.type = "じめん";
		m124.point = 21;
		
		MixedItem m125 = new MixedItem();
		m125.name = "ひかりのねんど";
		m125.name2 = "";
		m125.type = "じめん";
		m125.point = 26;
		
		MixedItem m126 = new MixedItem();
		m126.name = "わざレコード87";
		m126.name2 = "ドリルライナー";
		m126.type = "じめん";
		m126.point = 31;
		
		MixedItem m127 = new MixedItem();
		m127.name = "わざレコード67";
		m127.name2 = "だいちのちから";
		m127.type = "じめん";
		m127.point = 36;
		
		MixedItem m128 = new MixedItem();
		m128.name = "グランドコート";
		m128.name2 = "";
		m128.type = "じめん";
		m128.point = 41;
		
		MixedItem m129 = new MixedItem();
		m129.name = "おだんごしんじゅ";
		m129.name2 = "";
		m129.type = "じめん";
		m129.point = 46;
		
		MixedItem m130 = new MixedItem();
		m130.name = "わざレコード94";
		m130.name2 = "10まんばりき";
		m130.type = "じめん";
		m130.point = 51;
		
		MixedItem m131 = new MixedItem();
		m131.name = "すいせいのかけら";
		m131.name2 = "";
		m131.type = "じめん";
		m131.point = 56;
		
		MixedItem m132 = new MixedItem();
		m132.name = "わざレコード10";
		m132.name2 = "じしん";
		m132.type = "じめん";
		m132.point = 61;
		
		MixedItem m133 = new MixedItem();
		m133.name = "ふしぎなアメ";
		m133.name2 = "";
		m133.type = "じめん";
		m133.point = 66;
		
		MixedItem m134 = new MixedItem();
		m134.name = "ぎんのおうかん";
		m134.name2 = "";
		m134.type = "じめん";
		m134.point = 71;
		
		MixedItem m135 = new MixedItem();
		m135.name = "ポイントアップ";
		m135.name2 = "";
		m135.type = "じめん";
		m135.point = 76;	
		
		if((Type.equals(m121.type)) && (m121.point <= Point) && (Point <= m122.point)) {
			return m121;
			}
			
		if((Type.equals(m122.type)) && (m122.point <= Point) && (Point <= m123.point)) {
			return m122;
			}
			
		if((Type.equals(m123.type)) && (m123.point <= Point) && (Point <= m124.point)) {
			return m123;
			}
			
		if((Type.equals(m124.type)) && (m124.point <= Point) && (Point <= m125.point)) {
			return m124;
			}
			
		if((Type.equals(m125.type)) && (m125.point <= Point) && (Point <= m126.point)) {
			return m125;
			}
			
		if((Type.equals(m126.type)) && (m126.point <= Point) && (Point <= m127.point)) {
			return m126;
			}
			
		if((Type.equals(m127.type)) && (m127.point <= Point) && (Point <= m128.point)) {
			return m127;
			}
			
		if((Type.equals(m128.type)) && (m128.point <= Point) && (Point <= m129.point)) {
			return m128;
			}
			
		if((Type.equals(m129.type)) && (m129.point <= Point) && (Point <= m130.point)) {
			return m129;
			}
			
		if((Type.equals(m130.type)) && (m130.point <= Point) && (Point <= m131.point)) {
			return m130;
			}
			
		if((Type.equals(m131.type)) && (m131.point <= Point) && (Point <= m132.point)) {
			return m131;
			}
			
		if((Type.equals(m132.type)) && (m132.point <= Point) && (Point <= m133.point)) {
			return m132;
			}
			
		if((Type.equals(m133.type)) && (m133.point <= Point) && (Point <= m134.point)) {
			return m133;
			}
			
		if((Type.equals(m134.type)) && (m134.point <= Point) && (Point <= m135.point)) {
			return m134;
			}
			
		if((Type.equals(m135.type)) && (m135.point <= Point)) {
			return m135;
			}
	
		MixedItem m136 = new MixedItem();
		m136.name = "きれいなハネ";
		m136.name2 = "";
		m136.type = "ひこう";
		m136.point = 1;
		
		MixedItem m137 = new MixedItem();
		m137.name = "するどいくちばし";
		m137.name2 = "";
		m137.type = "ひこう";
		m137.point = 11;
		
		MixedItem m138 = new MixedItem();
		m138.name = "おおきなキノコ";
		m138.name2 = "";
		m138.type = "ひこう";
		m138.point = 16;
		
		MixedItem m139 = new MixedItem();
		m139.name = "ねがいのかたまり";
		m139.name2 = "";
		m139.type = "ひこう";
		m139.point = 21;
		
		MixedItem m140 = new MixedItem();
		m140.name = "ふうせん";
		m140.name2 = "";
		m140.type = "ひこう";
		m140.point = 26;
		
		MixedItem m141 = new MixedItem();
		m141.name = "からぶりほけん";
		m141.name2 = "";
		m141.type = "ひこう";
		m141.point = 31;
		
		MixedItem m142 = new MixedItem();
		m142.name = "ねばりのかぎづめ";
		m142.name2 = "";
		m142.type = "ひこう";
		m142.point = 36;
		
		MixedItem m143 = new MixedItem();
		m143.name = "ふうせん";
		m143.name2 = "";
		m143.type = "ひこう";
		m143.point = 41;
		
		MixedItem m144 = new MixedItem();
		m144.name = "じゃくてんほけん";
		m144.name2 = "";
		m144.type = "ひこう";
		m144.point = 46;
		
		MixedItem m145 = new MixedItem();
		m145.name = "わざレコード89";
		m145.name2 = "ぼうふう";
		m145.type = "ひこう";
		m145.point = 51;
		
		MixedItem m146 = new MixedItem();
		m146.name = "すいせいのかけら";
		m146.name2 = "";
		m146.type = "ひこう";
		m146.point = 56;
		
		MixedItem m147 = new MixedItem();
		m147.name = "わざレコード66";
		m147.name2 = "ブレイブバード";
		m147.type = "ひこう";
		m147.point = 61;
		
		MixedItem m148 = new MixedItem();
		m148.name = "ふしぎなアメ";
		m148.name2 = "";
		m148.type = "ひこう";
		m148.point = 66;
		
		MixedItem m149 = new MixedItem();
		m149.name = "ぎんのおうかん";
		m149.name2 = "";
		m149.type = "ひこう";
		m149.point = 71;
		
		MixedItem m150 = new MixedItem();
		m150.name = "ポイントアップ";
		m150.name2 = "";
		m150.type = "ひこう";
		m150.point = 76;

		if((Type.equals(m136.type)) && (m136.point <= Point) && (Point <= m137.point)) {
			return m136;
			}
			
		if((Type.equals(m137.type)) && (m137.point <= Point) && (Point <= m138.point)) {
			return m137;
			}
			
		if((Type.equals(m138.type)) && (m138.point <= Point) && (Point <= m139.point)) {
			return m138;
			}
			
		if((Type.equals(m139.type)) && (m139.point <= Point) && (Point <= m140.point)) {
			return m139;
			}
			
		if((Type.equals(m140.type)) && (m140.point <= Point) && (Point <= m141.point)) {
			return m140;
			}
			
		if((Type.equals(m141.type)) && (m141.point <= Point) && (Point <= m142.point)) {
			return m141;
			}
			
		if((Type.equals(m142.type)) && (m142.point <= Point) && (Point <= m143.point)) {
			return m142;
			}
			
		if((Type.equals(m143.type)) && (m143.point <= Point) && (Point <= m144.point)) {
			return m143;
			}
			
		if((Type.equals(m144.type)) && (m144.point <= Point) && (Point <= m145.point)) {
			return m144;
			}
			
		if((Type.equals(m145.type)) && (m145.point <= Point) && (Point <= m146.point)) {
			return m145;
			}
			
		if((Type.equals(m146.type)) && (m146.point <= Point) && (Point <= m147.point)) {
			return m146;
			}
			
		if((Type.equals(m147.type)) && (m147.point <= Point) && (Point <= m148.point)) {
			return m147;
			}
			
		if((Type.equals(m148.type)) && (m148.point <= Point) && (Point <= m149.point)) {
			return m148;
			}
			
		if((Type.equals(m149.type)) && (m149.point <= Point) && (Point <= m150.point)) {
			return m149;
			}
			
		if((Type.equals(m150.type)) && (m150.point <= Point)) {
			return m150;
			}

		MixedItem m151 = new MixedItem();
		m151.name = "わざレコード12";
		m151.name2 = "こうそくいどう";
		m151.type = "エスパー";
		m151.point = 1;
		
		MixedItem m152 = new MixedItem();
		m152.name = "わざレコード34";
		m152.name2 = "みらいよち";
		m152.type = "エスパー";
		m152.point = 11;
		
		MixedItem m153 = new MixedItem();
		m153.name = "わざレコード40";
		m153.name2 = "スキルスワップ";
		m153.type = "エスパー";
		m153.point = 16;
		
		MixedItem m154 = new MixedItem();
		m154.name = "わざレコード82";
		m154.name2 = "アシストパワー";
		m154.type = "エスパー";
		m154.point = 21;
		
		MixedItem m155 = new MixedItem();
		m155.name = "わざレコード44";
		m155.name2 = "コスモパワー";
		m155.type = "エスパー";
		m155.point = 26;
		
		MixedItem m156 = new MixedItem();
		m156.name = "わざレコード83";
		m156.name2 = "サイドチェンジ";
		m156.type = "エスパー";
		m156.point = 31;
		
		MixedItem m157 = new MixedItem();
		m157.name = "わざレコード25";
		m157.name2 = "サイコショック";
		m157.type = "エスパー";
		m157.point = 36;
		
		MixedItem m158 = new MixedItem();
		m158.name = "わざレコード69";
		m158.name2 = "しねんのずつき";
		m158.type = "エスパー";
		m158.point = 41;
		
		MixedItem m159 = new MixedItem();
		m159.name = "わざレコード17";
		m159.name2 = "ドわすれ";
		m159.type = "エスパー";
		m159.point = 46;
		
		MixedItem m160 = new MixedItem();
		m160.name = "わざレコード38";
		m160.name2 = "トリック";
		m160.type = "エスパー";
		m160.point = 51;
		
		MixedItem m161 = new MixedItem();
		m161.name = "わざレコード49";
		m161.name2 = "めいそう";
		m161.type = "エスパー";
		m161.point = 56;
		
		MixedItem m162 = new MixedItem();
		m162.name = "わざレコード97";
		m162.name2 = "サイコファング";
		m162.type = "エスパー";
		m162.point = 61;
		
		MixedItem m163 = new MixedItem();
		m163.name = "わざレコード11";
		m163.name2 = "サイコキネシス";
		m163.type = "エスパー";
		m163.point = 66;
		
		MixedItem m164 = new MixedItem();
		m164.name = "ぎんのおうかん";
		m164.name2 = "";
		m164.type = "エスパー";
		m164.point = 71;
		
		MixedItem m165 = new MixedItem();
		m165.name = "ポイントアップ";
		m165.name2 = "";
		m165.type = "エスパー";
		m165.point = 76;	

		if((Type.equals(m151.type)) && (m151.point <= Point) && (Point <= m152.point)) {
			return m151;
			}
			
		if((Type.equals(m152.type)) && (m152.point <= Point) && (Point <= m153.point)) {
			return m152;
			}
			
		if((Type.equals(m153.type)) && (m153.point <= Point) && (Point <= m154.point)) {
			return m153;
			}
			
		if((Type.equals(m154.type)) && (m154.point <= Point) && (Point <= m155.point)) {
			return m154;
			}
			
		if((Type.equals(m155.type)) && (m155.point <= Point) && (Point <= m156.point)) {
			return m155;
			}
			
		if((Type.equals(m156.type)) && (m156.point <= Point) && (Point <= m157.point)) {
			return m156;
			}
			
		if((Type.equals(m157.type)) && (m157.point <= Point) && (Point <= m158.point)) {
			return m157;
			}
			
		if((Type.equals(m158.type)) && (m158.point <= Point) && (Point <= m159.point)) {
			return m158;
			}
			
		if((Type.equals(m159.type)) && (m159.point <= Point) && (Point <= m160.point)) {
			return m159;
			}
			
		if((Type.equals(m160.type)) && (m160.point <= Point) && (Point <= m161.point)) {
			return m160;
			}
			
		if((Type.equals(m161.type)) && (m161.point <= Point) && (Point <= m162.point)) {
			return m161;
			}
			
		if((Type.equals(m162.type)) && (m162.point <= Point) && (Point <= m163.point)) {
			return m162;
			}
			
		if((Type.equals(m163.type)) && (m163.point <= Point) && (Point <= m164.point)) {
			return m163;
			}
			
		if((Type.equals(m164.type)) && (m164.point <= Point) && (Point <= m165.point)) {
			return m164;
			}
			
		if((Type.equals(m165.type)) && (m165.point <= Point)) {
			return m165;
			}

		MixedItem m166 = new MixedItem();
		m166.name = "わざレコード60";
		m166.name2 = "シザークロス";
		m166.type = "むし";
		m166.point = 1;
		
		MixedItem m167 = new MixedItem();
		m167.name = "わざレコード18";
		m167.name2 = "きゅうけつ";
		m167.type = "むし";
		m167.point = 11;
		
		MixedItem m168 = new MixedItem();
		m168.name = "ひかりのこな";
		m168.name2 = "";
		m168.type = "むし";
		m168.point = 16;
		
		MixedItem m169 = new MixedItem();
		m169.name = "ねがいのかたまり";
		m169.name2 = "";
		m169.type = "むし";
		m169.point = 21;
		
		MixedItem m170 = new MixedItem();
		m170.name = "ぎんのこな";
		m170.name2 = "";
		m170.type = "むし";
		m170.point = 26;
		
		MixedItem m171 = new MixedItem();
		m171.name = "かおるキノコ";
		m171.name2 = "";
		m171.type = "むし";
		m171.point = 31;
		
		MixedItem m172 = new MixedItem();
		m172.name = "わざレコード61";
		m172.name2 = "むしのさざめき";
		m172.type = "むし";
		m172.point = 36;
		
		MixedItem m173 = new MixedItem();
		m173.name = "きれいなぬけがら";
		m173.name2 = "";
		m173.type = "むし";
		m173.point = 41;
		
		MixedItem m174 = new MixedItem();
		m174.name = "おだんごしんじゅ";
		m174.name2 = "";
		m174.type = "むし";
		m174.point = 46;
		
		MixedItem m175 = new MixedItem();
		m175.name = "わざレコード96";
		m175.name2 = "かふんだんご";
		m175.type = "むし";
		m175.point = 51;
		
		MixedItem m176 = new MixedItem();
		m176.name = "すいせいのかけら";
		m176.name2 = "";
		m176.type = "むし";
		m176.point = 56;
		
		MixedItem m177 = new MixedItem();
		m177.name = "わざレコード28";
		m177.name2 = "メガホーン";
		m177.type = "むし";
		m177.point = 61;
		
		MixedItem m178 = new MixedItem();
		m178.name = "ふしぎなアメ";
		m178.name2 = "";
		m178.type = "むし";
		m178.point = 66;
		
		MixedItem m179 = new MixedItem();
		m179.name = "ぎんのおうかん";
		m179.name2 = "";
		m179.type = "むし";
		m179.point = 71;
		
		MixedItem m180 = new MixedItem();
		m180.name = "ポイントアップ";
		m180.name2 = "";
		m180.type = "むし";
		m180.point = 76;

		if((Type.equals(m166.type)) && (m166.point <= Point) && (Point <= m167.point)) {
			return m166;
			}
			
		if((Type.equals(m167.type)) && (m167.point <= Point) && (Point <= m168.point)) {
			return m167;
			}
			
		if((Type.equals(m168.type)) && (m168.point <= Point) && (Point <= m169.point)) {
			return m168;
			}
		
		if((Type.equals(m169.type)) && (m169.point <= Point) && (Point <= m170.point)) {
			return m169;
			}
			
		if((Type.equals(m170.type)) && (m170.point <= Point) && (Point <= m171.point)) {
			return m170;
			}
			
		if((Type.equals(m171.type)) && (m171.point <= Point) && (Point <= m172.point)) {
			return m171;
			}
			
		if((Type.equals(m172.type)) && (m172.point <= Point) && (Point <= m173.point)) {
			return m172;
			}
			
		if((Type.equals(m173.type)) && (m173.point <= Point) && (Point <= m174.point)) {
			return m173;
			}
			
		if((Type.equals(m174.type)) && (m174.point <= Point) && (Point <= m175.point)) {
			return m174;
			}
			
		if((Type.equals(m175.type)) && (m175.point <= Point) && (Point <= m176.point)) {
			return m175;
			}
			
		if((Type.equals(m176.type)) && (m176.point <= Point) && (Point <= m177.point)) {
			return m176;
			}
			
		if((Type.equals(m177.type)) && (m177.point <= Point) && (Point <= m178.point)) {
			return m177;
			}
			
		if((Type.equals(m178.type)) && (m178.point <= Point) && (Point <= m179.point)) {
			return m178;
			}
			
		if((Type.equals(m179.type)) && (m179.point <= Point) && (Point <= m180.point)) {
			return m179;
			}
			
		if((Type.equals(m180.type)) && (m180.point <= Point)) {
			return m180;
			}

		MixedItem m181 = new MixedItem();
		m181.name = "かるいし";
		m181.name2 = "";
		m181.type = "いわ";
		m181.point = 1;
			
		MixedItem m182 = new MixedItem();
		m182.name = "まんまるいし";
		m182.name2 = "";
		m182.type = "いわ";
		m182.point = 11;
		
		MixedItem m183 = new MixedItem();
		m183.name = "かたいいし";
		m183.name2 = "";
		m183.type = "いわ";
		m183.point = 16;
		
		MixedItem m184 = new MixedItem();
		m184.name = "ねがいのかたまり";
		m184.name2 = "";
		m184.type = "いわ";
		m184.point = 21;
		
		MixedItem m185 = new MixedItem();
		m185.name = "かわらずのいし";
		m185.name2 = "";
		m185.type = "いわ";
		m185.point = 26;
		
		MixedItem m186 = new MixedItem();
		m186.name = "プロテクター";
		m186.name2 = "";
		m186.type = "いわ";
		m186.point = 31;
		
		MixedItem m187 = new MixedItem();
		m187.name = "ゴツゴツメット";
		m187.name2 = "";
		m187.type = "いわ";
		m187.point = 36;
		
		MixedItem m188 = new MixedItem();
		m188.name = "わざレコード63";
		m188.name2 = "パワージェム";
		m188.type = "いわ";
		m188.point = 41;
		
		MixedItem m189 = new MixedItem();
		m189.name = "ねがいのかたまり";
		m189.name2 = "";
		m189.type = "いわ";
		m189.point = 46;
		
		MixedItem m190 = new MixedItem();
		m190.name = "しんかのきせき";
		m190.name2 = "";
		m190.type = "いわ";
		m190.point = 51;
		
		MixedItem m191 = new MixedItem();
		m191.name = "わざレコード76";
		m191.name2 = "ステルスロック";
		m191.type = "いわ";
		m191.point = 56;
		
		MixedItem m192 = new MixedItem();
		m192.name = "わざレコード75";
		m192.name2 = "ストーンエッジ";
		m192.type = "いわ";
		m192.point = 61;
		
		MixedItem m193 = new MixedItem();
		m193.name = "ふしぎなアメ";
		m193.name2 = "";
		m193.type = "いわ";
		m193.point = 66;
		
		MixedItem m194 = new MixedItem();
		m194.name = "ぎんのおうかん";
		m194.name2 = "";
		m194.type = "いわ";
		m194.point = 71;
		
		MixedItem m195 = new MixedItem();
		m195.name = "ポイントアップ";
		m195.name2 = "";
		m195.type = "いわ";
		m195.point = 76;

		if((Type.equals(m181.type)) && (m181.point <= Point) && (Point <= m182.point)) {
			return m181;
			}
			
		if((Type.equals(m182.type)) && (m182.point <= Point) && (Point <= m183.point)) {
			return m182;
			}
			
		if((Type.equals(m183.type)) && (m183.point <= Point) && (Point <= m184.point)) {
			return m183;
			}
			
		if((Type.equals(m184.type)) && (m184.point <= Point) && (Point <= m185.point)) {
			return m184;
			}
			
		if((Type.equals(m185.type)) && (m185.point <= Point) && (Point <= m186.point)) {
			return m185;
			}
			
		if((Type.equals(m186.type)) && (m186.point <= Point) && (Point <= m187.point)) {
			return m186;
			}
			
		if((Type.equals(m187.type)) && (m187.point <= Point) && (Point <= m188.point)) {
			return m187;
			}
			
		if((Type.equals(m188.type)) && (m188.point <= Point) && (Point <= m189.point)) {
			return m188;
			}
			
		if((Type.equals(m189.type)) && (m189.point <= Point) && (Point <= m190.point)) {
			return m189;
			}
			
		if((Type.equals(m190.type)) && (m190.point <= Point) && (Point <= m191.point)) {
			return m190;
			}
			
		if((Type.equals(m191.type)) && (m191.point <= Point) && (Point <= m192.point)) {
			return m191;
			}
			
		if((Type.equals(m192.type)) && (m192.point <= Point) && (Point <= m193.point)) {
			return m192;
			}
			
		if((Type.equals(m193.type)) && (m193.point <= Point) && (Point <= m194.point)) {
			return m193;
			}
			
		if((Type.equals(m194.type)) && (m194.point <= Point) && (Point <= m195.point)) {
			return m194;
			}
			
		if((Type.equals(m195.type)) && (m195.point <= Point)) {
			return m195;
			}

		MixedItem m196 = new MixedItem();
		m196.name = "あやしいおこう";
		m196.name2 = "";
		m196.type = "ゴースト";
		m196.point = 1;
		
		MixedItem m197 = new MixedItem();
		m197.name = "ビビリだま";
		m197.name2 = "";
		m197.type = "ゴースト";
		m197.point = 11;
		
		MixedItem m198 = new MixedItem();
		m198.name = "ねらいのまと";
		m198.name2 = "";
		m198.type = "ゴースト";
		m198.point = 16;
		
		MixedItem m199 = new MixedItem();
		m199.name = "ねがいのかたまり";
		m199.name2 = "";
		m199.type = "ゴースト";
		m199.point = 21;
		
		MixedItem m200 = new MixedItem();
		m200.name = "ほしのかけら";
		m200.name2 = "";
		m200.type = "ゴースト";
		m200.point = 26;
		
		MixedItem m201 = new MixedItem();
		m201.name = "かおるキノコ";
		m201.name2 = "";
		m201.type = "ゴースト";
		m201.point = 31;
		
		MixedItem m202 = new MixedItem();
		m202.name = "きよめのおふだ";
		m202.name2 = "";
		m202.type = "ゴースト";
		m202.point = 36;
		
		MixedItem m203 = new MixedItem();
		m203.name = "のろいのおふだ";
		m203.name2 = "";
		m203.type = "ゴースト";
		m203.point = 41;
		
		MixedItem m204 = new MixedItem();
		m204.name = "われたポット";
		m204.name2 = "";
		m204.type = "ゴースト";
		m204.point = 46;
		
		MixedItem m205 = new MixedItem();
		m205.name = "れいかいのぬの";
		m205.name2 = "";
		m205.type = "ゴースト";
		m205.point = 51;
		
		MixedItem m206 = new MixedItem();
		m206.name = "すいせいのかけら";
		m206.name2 = "";
		m206.type = "ゴースト";
		m206.point = 56;
		
		MixedItem m207 = new MixedItem();
		m207.name = "わざレコード33";
		m207.name2 = "シャドーボール";
		m207.type = "ゴースト";
		m207.point = 61;
		
		MixedItem m208 = new MixedItem();
		m208.name = "ふしぎなアメ";
		m208.name2 = "";
		m208.type = "ゴースト";
		m208.point = 66;
		
		MixedItem m209 = new MixedItem();
		m209.name = "ぎんのおうかん";
		m209.name2 = "";
		m209.type = "ゴースト";
		m209.point = 71;
		
		MixedItem m210 = new MixedItem();
		m210.name = "ポイントアップ";
		m210.name2 = "";
		m210.type = "ゴースト";
		m210.point = 76;

		if((Type.equals(m196.type)) && (m196.point <= Point) && (Point <= m197.point)) {
			return m196;
			}
			
		if((Type.equals(m197.type)) && (m197.point <= Point) && (Point <= m198.point)) {
			return m197;
			}
			
		if((Type.equals(m198.type)) && (m198.point <= Point) && (Point <= m199.point)) {
			return m198;
			}
			
		if((Type.equals(m199.type)) && (m199.point <= Point) && (Point <= m200.point)) {
			return m199;
			}
			
		if((Type.equals(m200.type)) && (m200.point <= Point) && (Point <= m201.point)) {
			return m200;
			}
			
		if((Type.equals(m201.type)) && (m201.point <= Point) && (Point <= m202.point)) {
			return m201;
			}
			
		if((Type.equals(m202.type)) && (m202.point <= Point) && (Point <= m203.point)) {
			return m202;
			}
			
		if((Type.equals(m203.type)) && (m203.point <= Point) && (Point <= m204.point)) {
			return m203;
			}
			
		if((Type.equals(m204.type)) && (m204.point <= Point) && (Point <= m205.point)) {
			return m204;
			}
			
		if((Type.equals(m205.type)) && (m205.point <= Point) && (Point <= m206.point)) {
			return m205;
			}
			
		if((Type.equals(m206.type)) && (m206.point <= Point) && (Point <= m207.point)) {
			return m206;
			}
			
		if((Type.equals(m207.type)) && (m207.point <= Point) && (Point <= m208.point)) {
			return m207;
			}
			
		if((Type.equals(m208.type)) && (m208.point <= Point) && (Point <= m209.point)) {
			return m208;
			}
			
		if((Type.equals(m209.type)) && (m209.point <= Point) && (Point <= m210.point)) {
			return m209;
			}
			
		if((Type.equals(m210.type)) && (m210.point <= Point)) {
			return m210;
			}

		MixedItem m211 = new MixedItem();
		m211.name = "わざレコード47";
		m211.name2 = "ドラゴンクロー";
		m211.type = "ドラゴン";
		m211.point = 1;
		
		MixedItem m212 = new MixedItem();
		m212.name = "りゅうのキバ";
		m212.name2 = "";
		m212.type = "ドラゴン";
		m212.point = 11;
		
		MixedItem m213 = new MixedItem();
		m213.name = "おおきなキノコ";
		m213.name2 = "";
		m213.type = "ドラゴン";
		m213.point = 16;
		
		MixedItem m214 = new MixedItem();
		m214.name = "ねがいのかたまり";
		m214.name2 = "";
		m214.type = "ドラゴン";
		m214.point = 21;
		
		MixedItem m215 = new MixedItem();
		m215.name = "ほしのかけら";
		m215.name2 = "";
		m215.type = "ドラゴン";
		m215.point = 26;
		
		MixedItem m216 = new MixedItem();
		m216.name = "かおるキノコ";
		m216.name2 = "";
		m216.type = "ドラゴン";
		m216.point = 31;
		
		MixedItem m217 = new MixedItem();
		m217.name = "りゅうのウロコ";
		m217.name2 = "";
		m217.type = "ドラゴン";
		m217.point = 36;
		
		MixedItem m218 = new MixedItem();
		m218.name = "いのちのたま";
		m218.name2 = "";
		m218.type = "ドラゴン";
		m218.point = 41;
		
		MixedItem m219 = new MixedItem();
		m219.name = "わざレコード62";
		m219.name2 = "りゅうのはどう";
		m219.type = "ドラゴン";
		m219.point = 46;
		
		MixedItem m220 = new MixedItem();
		m220.name = "おうじゃのしるし";
		m220.name2 = "";
		m220.type = "ドラゴン";
		m220.point = 51;
		
		MixedItem m221 = new MixedItem();
		m221.name = "わざレコード51";
		m221.name2 = "りゅうのまい";
		m221.type = "ドラゴン";
		m221.point = 56;
		
		MixedItem m222 = new MixedItem();
		m222.name = "わざレコード24";
		m222.name2 = "げきりん";
		m222.type = "ドラゴン";
		m222.point = 61;
		
		MixedItem m223 = new MixedItem();
		m223.name = "ふしぎなアメ";
		m223.name2 = "";
		m223.type = "ドラゴン";
		m223.point = 66;
		
		MixedItem m224 = new MixedItem();
		m224.name = "ぎんのおうかん";
		m224.name2 = "";
		m224.type = "ドラゴン";
		m224.point = 71;
		
		MixedItem m225 = new MixedItem();
		m225.name = "ポイントアップ";
		m225.name2 = "";
		m225.type = "ドラゴン";
		m225.point = 76;

		if((Type.equals(m211.type)) && (m211.point <= Point) && (Point <= m212.point)) {
			return m211;
			}
			
		if((Type.equals(m212.type)) && (m212.point <= Point) && (Point <= m213.point)) {
			return m212;
			}
			
		if((Type.equals(m213.type)) && (m213.point <= Point) && (Point <= m214.point)) {
			return m213;
			}
			
		if((Type.equals(m214.type)) && (m214.point <= Point) && (Point <= m215.point)) {
			return m214;
			}
			
		if((Type.equals(m215.type)) && (m215.point <= Point) && (Point <= m216.point)) {
			return m215;
			}
			
		if((Type.equals(m216.type)) && (m216.point <= Point) && (Point <= m217.point)) {
			return m216;
			}
			
		if((Type.equals(m217.type)) && (m217.point <= Point) && (Point <= m218.point)) {
			return m217;
			}
			
		if((Type.equals(m218.type)) && (m218.point <= Point) && (Point <= m219.point)) {
			return m218;
			}
			
		if((Type.equals(m219.type)) && (m219.point <= Point) && (Point <= m220.point)) {
			return m219;
			}
			
		if((Type.equals(m220.type)) && (m220.point <= Point) && (Point <= m221.point)) {
			return m220;
			}
			
		if((Type.equals(m221.type)) && (m221.point <= Point) && (Point <= m222.point)) {
			return m221;
			}
			
		if((Type.equals(m222.type)) && (m222.point <= Point) && (Point <= m223.point)) {
			return m222;
			}
			
		if((Type.equals(m223.type)) && (m223.point <= Point) && (Point <= m224.point)) {
			return m223;
			}
			
		if((Type.equals(m224.type)) && (m224.point <= Point) && (Point <= m225.point)) {
			return m224;
			}
			
		if((Type.equals(m225.type)) && (m225.point <= Point)) {
			return m225;
			}

		MixedItem m226 = new MixedItem();
		m226.name = "わざレコード37";
		m226.name2 = "ちょうはつ";
		m226.type = "あく";
		m226.point = 1;
		
		MixedItem m227 = new MixedItem();
		m227.name = "こうかくレンズ";
		m227.name2 = "";
		m227.type = "あく";
		m227.point = 11;
		
		MixedItem m228 = new MixedItem();
		m228.name = "わざレコード68";
		m228.name2 = "わるだくみ";
		m228.type = "あく";
		m228.point = 16;
		
		MixedItem m229 = new MixedItem();
		m229.name = "ねがいのかたまり";
		m229.name2 = "";
		m229.type = "あく";
		m229.point = 21;
		
		MixedItem m230 = new MixedItem();
		m230.name = "ほしのかけら";
		m230.name2 = "";
		m230.type = "あく";
		m230.point = 26;
		
		MixedItem m231 = new MixedItem();
		m231.name = "かおるキノコ";
		m231.name2 = "";
		m231.type = "あく";
		m231.point = 31;
		
		MixedItem m232 = new MixedItem();
		m232.name = "わざレコード81";
		m232.name2 = "イカサマ";
		m232.type = "あく";
		m232.point = 36;
		
		MixedItem m233 = new MixedItem();
		m233.name = "ピントレンズ";
		m233.name2 = "";
		m233.type = "あく";
		m233.point = 41;
		
		MixedItem m234 = new MixedItem();
		m234.name = "わざレコード95";
		m234.name2 = "じごくづき";
		m234.type = "あく";
		m234.point = 46;
		
		MixedItem m235 = new MixedItem();
		m235.name = "わざレコード58";
		m235.name2 = "あくのはどう";
		m235.type = "あく";
		m235.point = 51;
		
		MixedItem m236 = new MixedItem();
		m236.name = "わざレコード32";
		m236.name2 = "かみくだく";
		m236.type = "あく";
		m236.point = 56;
		
		MixedItem m237 = new MixedItem();
		m237.name = "わざレコード";
		m237.name2 = "DDラリアット";
		m237.type = "あく";
		m237.point = 61;
		
		MixedItem m238 = new MixedItem();
		m238.name = "ふしぎなアメ";
		m238.name2 = "";
		m238.type = "あく";
		m238.point = 66;
		
		MixedItem m239 = new MixedItem();
		m239.name = "ぎんのおうかん";
		m239.name2 = "";
		m239.type = "あく";
		m239.point = 71;
		
		MixedItem m240 = new MixedItem();
		m240.name = "ポイントアップ";
		m240.name2 = "";
		m240.type = "あく";
		m240.point = 76;

		if((Type.equals(m226.type)) && (m226.point <= Point) && (Point <= m227.point)) {
			return m226;
			}
			
		if((Type.equals(m227.type)) && (m227.point <= Point) && (Point <= m228.point)) {
			return m227;
			}
			
		if((Type.equals(m228.type)) && (m228.point <= Point) && (Point <= m229.point)) {
			return m228;
			}
			
		if((Type.equals(m229.type)) && (m229.point <= Point) && (Point <= m230.point)) {
			return m229;
			}
			
		if((Type.equals(m230.type)) && (m230.point <= Point) && (Point <= m231.point)) {
			return m230;
			}
			
		if((Type.equals(m231.type)) && (m231.point <= Point) && (Point <= m232.point)) {
			return m231;
			}
			
		if((Type.equals(m232.type)) && (m232.point <= Point) && (Point <= m233.point)) {
			return m232;
			}
			
		if((Type.equals(m233.type)) && (m233.point <= Point) && (Point <= m234.point)) {
			return m233;
			}
			
		if((Type.equals(m234.type)) && (m234.point <= Point) && (Point <= m235.point)) {
			return m234;
			}
			
		if((Type.equals(m235.type)) && (m235.point <= Point) && (Point <= m236.point)) {
			return m235;
			}
			
		if((Type.equals(m236.type)) && (m236.point <= Point) && (Point <= m237.point)) {
			return m236;
			}
			
		if((Type.equals(m237.type)) && (m237.point <= Point) && (Point <= m238.point)) {
			return m237;
			}
			
		if((Type.equals(m238.type)) && (m238.point <= Point) && (Point <= m239.point)) {
			return m238;
			}
			
		if((Type.equals(m239.type)) && (m239.point <= Point) && (Point <= m240.point)) {
			return m239;
			}
			
		if((Type.equals(m240.type)) && (m240.point <= Point)) {
			return m240;
			}

		MixedItem m241 = new MixedItem();
		m241.name = "わざレコード31";
		m241.name2 = "アイアンテール";
		m241.type = "はがね";
		m241.point = 1;
		
		MixedItem m242 = new MixedItem();
		m242.name = "わざレコード46";
		m242.name2 = "てっぺき";
		m242.type = "はがね";
		m242.point = 11;
		
		MixedItem m243 = new MixedItem();
		m243.name = "メタルパウダー";
		m243.name2 = "";
		m243.type = "はがね";
		m243.point = 16;
		
		MixedItem m244 = new MixedItem();
		m244.name = "ねがいのかたまり";
		m244.name2 = "";
		m244.type = "はがね";
		m244.point = 21;
		
		MixedItem m245 = new MixedItem();
		m245.name = "ばんのうがさ";
		m245.name2 = "";
		m245.type = "はがね";
		m245.point = 26;
		
		MixedItem m246 = new MixedItem();
		m246.name = "メタルコート";
		m246.name2 = "";
		m246.type = "はがね";
		m246.point = 31;
		
		MixedItem m247 = new MixedItem();
		m247.name = "わざレコード52";
		m247.name2 = "";
		m247.type = "はがね";
		m247.point = 36;
		
		MixedItem m248 = new MixedItem();
		m248.name = "とつげきチョッキ";
		m248.name2 = "";
		m248.type = "はがね";
		m248.point = 41;
		
		MixedItem m249 = new MixedItem();
		m249.name = "わざレコード79";
		m249.name2 = "ヘビーボンバー";
		m249.type = "はがね";
		m249.point = 46;
		
		MixedItem m250 = new MixedItem();
		m250.name = "おまもりこばん";
		m250.name2 = "";
		m250.type = "はがね";
		m250.point = 51;
		
		MixedItem m251 = new MixedItem();
		m251.name = "わざレコード70";
		m251.name2 = "ラスターカノン";
		m251.type = "はがね";
		m251.point = 56;
		
		MixedItem m252 = new MixedItem();
		m252.name = "わざレコード74";
		m252.name2 = "アイアンヘッド";
		m252.type = "はがね";
		m252.point = 61;
		
		MixedItem m253 = new MixedItem();
		m253.name = "ふしぎなアメ";
		m253.name2 = "";
		m253.type = "はがね";
		m253.point = 66;
		
		MixedItem m254 = new MixedItem();
		m254.name = "ぎんのおうかん";
		m254.name2 = "";
		m254.type = "はがね";
		m254.point = 71;
		
		MixedItem m255 = new MixedItem();
		m255.name = "ポイントアップ";
		m255.name2 = "";
		m255.type = "はがね";
		m255.point = 76;

		if((Type.equals(m241.type)) && (m241.point <= Point) && (Point <= m242.point)) {
			return m241;
			}
			
		if((Type.equals(m242.type)) && (m242.point <= Point) && (Point <= m243.point)) {
			return m242;
			}
			
		if((Type.equals(m243.type)) && (m243.point <= Point) && (Point <= m244.point)) {
			return m243;
			}
			
		if((Type.equals(m244.type)) && (m244.point <= Point) && (Point <= m245.point)) {
			return m244;
			}
			
		if((Type.equals(m245.type)) && (m245.point <= Point) && (Point <= m246.point)) {
			return m245;
			}
			
		if((Type.equals(m246.type)) && (m246.point <= Point) && (Point <= m247.point)) {
			return m246;
			}
			
		if((Type.equals(m247.type)) && (m247.point <= Point) && (Point <= m248.point)) {
			return m247;
			}
			
		if((Type.equals(m248.type)) && (m248.point <= Point) && (Point <= m249.point)) {
			return m248;
			}
			
		if((Type.equals(m249.type)) && (m249.point <= Point) && (Point <= m250.point)) {
			return m249;
			}
			
		if((Type.equals(m250.type)) && (m250.point <= Point) && (Point <= m251.point)) {
			return m250;
			}
			
		if((Type.equals(m251.type)) && (m251.point <= Point) && (Point <= m252.point)) {
			return m251;
			}
			
		if((Type.equals(m252.type)) && (m252.point <= Point) && (Point <= m253.point)) {
			return m252;
			}
			
		if((Type.equals(m253.type)) && (m253.point <= Point) && (Point <= m254.point)) {
			return m253;
			}
			
		if((Type.equals(m254.type)) && (m254.point <= Point) && (Point <= m255.point)) {
			return m254;
			}
			
		if((Type.equals(m255.type)) && (m255.point <= Point)) {
			return m255;
			}

		MixedItem m256 = new MixedItem();
		m256.name = "ほしのすな";
		m256.name2 = "";
		m256.type = "フェアリー";
		m256.point = 1;
		
		MixedItem m257 = new MixedItem();
		m257.name = "ミストシード";
		m257.name2 = "";
		m257.type = "フェアリー";
		m257.point = 11;
		
		MixedItem m258 = new MixedItem();
		m258.name = "おおきなキノコ";
		m258.name2 = "";
		m258.type = "フェアリー";
		m258.point = 16;
		
		MixedItem m259 = new MixedItem();
		m259.name = "ねがいのかたまり";
		m259.name2 = "";
		m259.type = "フェアリー";
		m259.point = 21;
		
		MixedItem m260 = new MixedItem();
		m260.name = "においぶくろ";
		m260.name2 = "";
		m260.type = "フェアリー";
		m260.point = 26;
		
		MixedItem m261 = new MixedItem();
		m261.name = "ルームサービス";
		m261.name2 = "";
		m261.type = "フェアリー";
		m261.point = 31;
		
		MixedItem m262 = new MixedItem();
		m262.name = "ホイップポップ";
		m262.name2 = "";
		m262.type = "フェアリー";
		m262.point = 36;
		
		MixedItem m263 = new MixedItem();
		m263.name = "あかいいと";
		m263.name2 = "";
		m263.type = "フェアリー";
		m263.point = 41;
		
		MixedItem m264 = new MixedItem();
		m264.name = "いちごアメざいく(2/3) スターアメざいく(1/6) リボンアメざいく(1/6)";
		m264.name2 = "";
		m264.type = "フェアリー";
		m264.point = 46;
		
		MixedItem m265 = new MixedItem();
		m265.name = "わざレコード92";
		m265.name2 = "マジカルシャイン";
		m265.type = "フェアリー";
		m265.point = 51;
		
		MixedItem m266 = new MixedItem();
		m266.name = "いちごアメざいく(1/3) ハートアメざいく(1/6) ベリーアメざいく(1/6) \n よつばアメざいく(1/6) おはなアメざいく(1/6)";
		m266.name2 = "";
		m266.type = "フェアリー";
		m266.point = 56;
		
		MixedItem m267 = new MixedItem();
		m267.name = "わざレコード90";
		m267.name2 = "じゃれつく";
		m267.type = "フェアリー";
		m267.point = 61;
		
		MixedItem m268 = new MixedItem();
		m268.name = "ふしぎなアメ";
		m268.name2 = "";
		m268.type = "フェアリー";
		m268.point = 66;
		
		MixedItem m269 = new MixedItem();
		m269.name = "ぎんのおうかん";
		m269.name2 = "";
		m269.type = "フェアリー";
		m269.point = 71;
		
		MixedItem m270 = new MixedItem();
		m270.name = "ポイントアップ";
		m270.name2 = "";
		m270.type = "フェアリー";
		m270.point = 76;	
		
		if((Type.equals(m256.type)) && (m256.point <= Point) && (Point <= m257.point)) {
			return m256;
			}
			
		if((Type.equals(m257.type)) && (m257.point <= Point) && (Point <= m258.point)) {
			return m257;
			}
			
		if((Type.equals(m258.type)) && (m258.point <= Point) && (Point <= m259.point)) {
			return m258;
			}
			
		if((Type.equals(m259.type)) && (m259.point <= Point) && (Point <= m260.point)) {
			return m259;
			}
			
		if((Type.equals(m260.type)) && (m260.point <= Point) && (Point <= m261.point)) {
			return m260;
			}
			
		if((Type.equals(m261.type)) && (m261.point <= Point) && (Point <= m262.point)) {
			return m261;
			}
			
		if((Type.equals(m262.type)) && (m262.point <= Point) && (Point <= m263.point)) {
			return m262;
			}
			
		if((Type.equals(m263.type)) && (m263.point <= Point) && (Point <= m264.point)) {
			return m263;
			}
			
		if((Type.equals(m264.type)) && (m264.point <= Point) && (Point <= m265.point)) {
			return m264;
			}
			
		if((Type.equals(m265.type)) && (m265.point <= Point) && (Point <= m266.point)) {
			return m265;
			}
			
		if((Type.equals(m266.type)) && (m266.point <= Point) && (Point <= m267.point)) {
			return m266;
			}
			
		if((Type.equals(m267.type)) && (m267.point <= Point) && (Point <= m268.point)) {
			return m267;
			}
			
		if((Type.equals(m268.type)) && (m268.point <= Point) && (Point <= m269.point)) {
			return m268;
			}
			
		if((Type.equals(m269.type)) && (m269.point <= Point) && (Point <= m270.point)) {
			return m269;
			}
			
		if((Type.equals(m270.type)) && (m270.point <= Point)) {
			return m270;
			}	

		
		if(Point == 0) {

		}


		exce.name2 = "";
		return exce;
	}

	public static MixedItem MixedBall(String ball1, String ball2, String ball3, String ball4){
		int redCount = 0;
		int blueCount = 0;
		int yellowCount = 0;
		int greenCount = 0;
		int pinkCount = 0;
		int whiteCount = 0;
		int blackCount = 0;
		if(ball1.equals("あかぼんぐり"))
		redCount++;
		if(ball1.equals("あおぼんぐり"))
		blueCount++;
		if(ball1.equals("きぼんぐり"))
		yellowCount++;
		if(ball1.equals("みどぼんぐり"))
		greenCount++;
		if(ball1.equals("ももぼんぐり"))
		pinkCount++;
		if(ball1.equals("しろぼんぐり"))
		whiteCount++;
		if(ball1.equals("くろぼんぐり"))
		blackCount++;

		if(ball2.equals("あかぼんぐり"))
		redCount++;
		if(ball2.equals("あおぼんぐり"))
		blueCount++;
		if(ball2.equals("きぼんぐり"))
		yellowCount++;
		if(ball2.equals("みどぼんぐり"))
		greenCount++;
		if(ball2.equals("ももぼんぐり"))
		pinkCount++;
		if(ball2.equals("しろぼんぐり"))
		whiteCount++;
		if(ball2.equals("くろぼんぐり"))
		blackCount++;

		if(ball3.equals("あかぼんぐり"))
		redCount++;
		if(ball3.equals("あおぼんぐり"))
		blueCount++;
		if(ball3.equals("きぼんぐり"))
		yellowCount++;
		if(ball3.equals("みどぼんぐり"))
		greenCount++;
		if(ball3.equals("ももぼんぐり"))
		pinkCount++;
		if(ball3.equals("しろぼんぐり"))
		whiteCount++;
		if(ball3.equals("くろぼんぐり"))
		blackCount++;

		if(ball4.equals("あかぼんぐり"))
		redCount++;
		if(ball4.equals("あおぼんぐり"))
		blueCount++;
		if(ball4.equals("きぼんぐり"))
		yellowCount++;
		if(ball4.equals("みどぼんぐり"))
		greenCount++;
		if(ball4.equals("ももぼんぐり"))
		pinkCount++;
		if(ball4.equals("しろぼんぐり"))
		whiteCount++;
		if(ball4.equals("くろぼんぐり"))
		blackCount++;
		double rand25 = 25.0;
		double rand1 = 1.0;

		StringBuffer rand = new StringBuffer();
		rand.append("モンスターボール(約25.0%)\nスーパーボール(約25.0%)\n");
		if(blackCount > 0)
		rand.append("ダークボール(約" + rand25 * blackCount / 4 + "%)\n");
		if(blueCount > 0)
		rand.append("ダイブボール(約" + rand25 * blueCount / 4 + "%)\n");
		MixedItem mixedball = new MixedItem();
		if(blackCount + blueCount < 4)
		rand.append("ハイパーボール(約" + (rand25 * (4 - blackCount - blueCount) / 4) + "%)\n");
		
		if(blueCount > 0)
		rand.append("ネットボール(約" + (rand25 * blueCount / 4) + "%)\n");
		if(yellowCount > 0)
		rand.append("クイックボール(約" + (rand25 * yellowCount / 4) + "%)\n");
		if(greenCount > 0)
		rand.append("ネストボール(約" + (rand25 * greenCount / 4) + "%)\n");
		if(pinkCount > 0)
		rand.append("ヒールボール(約" + (rand25 * pinkCount / 4) + "%)\n");
		if(whiteCount > 0)
		rand.append("プレミアボール(約" + (rand25 * whiteCount / 4) + "%)\n");
		if(blackCount > 0)
		rand.append("ゴージャスボール(約" + (rand25 * blackCount / 4) + "%)\n");

		if(redCount > 0)
		rand.append("レベルボール(約" + (26.0 * redCount / 4) + "%)\n");
		if(blueCount > 0)
		rand.append("ルアーボール(約" + (rand1 * blueCount / 4) + "%)\n");
		if((yellowCount > 0) || (pinkCount > 0))
		rand.append("ムーンボール(約" + (rand1 * (yellowCount + pinkCount) / 4) + "%)\n");
		if(greenCount > 0)
		rand.append("フレンドボール(約" + (rand1 * greenCount / 4) + "%)\n");
		if(whiteCount > 0)
		rand.append("スピードボール(約" + (rand1 * whiteCount / 4) + "%)\n");
		if(blackCount > 0)
		rand.append("ヘビーボール(約" + (rand1 * blackCount / 4) + "%)\n");

		rand.append("サファリボール(約0.1%)\nコンペボール(約0.1%)\n");

		mixedball.name = rand.toString();
		mixedball.name2 = "";
		return mixedball;
	}
}
	