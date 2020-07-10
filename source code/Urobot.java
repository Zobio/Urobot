import java.util.*;
import java.io.*;
import java.nio.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.*;

public class Urobot extends JFrame implements ActionListener{
	JCheckBox mix; JCheckBox mate; JCheckBox ri; JCheckBox same234;
	JTextField mt1; JTextField mt2; JTextField mt3; JTextField mt4; JTextField mi;
	public static void main(String[] args) {
		Urobot frame = new Urobot("Urobot 1.1.1");
		frame.setVisible(true);
	}

	Urobot(String title){
		setTitle(title);
		setSize(500, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ImageIcon icon1 = new ImageIcon("Urobot.png");
		JLabel label1 = new JLabel("注意:名称は正しく入力してください");
		JLabel label2 = new JLabel("例 ×命の珠 ○いのちのたま");
		JLabel label3 = new JLabel(icon1);
		JButton button1 = new JButton("調べる");
		JButton button2 = new JButton("調べる");
	
		JPanel p = new JPanel();
		mix = new JCheckBox("材料→アイテム");
		mate = new JCheckBox("アイテム→材料 (ランダム)");
		ri = new JCheckBox("限定アイテムを除く");
		same234 = new JCheckBox("2,3,4番目を同じアイテムにする");
		mt1 = new JTextField(15);
		mt2 = new JTextField(15);
		mt3 = new JTextField(15);
		mt4 = new JTextField(15);
		mi = new JTextField(15);
	
		mix.setBounds(75, 15, 200, 20);
		mate.setBounds(285, 15, 200, 20);
		ri.setBounds(285, 40, 200, 20);
		same234.setBounds(285, 65, 200, 20);
		same234.setFont(new Font("Arial", Font.PLAIN, 11));
		mt1.setBounds(50, 60, 200, 20);
		mt2.setBounds(50, 90, 200, 20);
		mt3.setBounds(50, 120, 200, 20);
		mt4.setBounds(50, 150, 200, 20);
		mi.setBounds(280, 115, 200, 20);
		label1.setBounds(50, 200, 250, 20);
		label2.setBounds(50, 220, 200, 20);
		label3.setBounds(135, 100, 500, 200);
		button1.setBounds(100, 175, 100, 20);
		button2.setBounds(330, 85, 100, 20);

		p.setLayout(null);
		p.add(mix);
		p.add(mate);
		p.add(ri);
		p.add(same234);
		p.add(mt1);
		p.add(mt2);
		p.add(mt3);
		p.add(mt4);
		p.add(mi);
		p.add(label1);
		p.add(label2);
		p.add(label3);
		p.add(button1);
		p.add(button2);

		mix.addActionListener(this);
		mate.addActionListener(this);
		button1.addActionListener(this);
		button2.addActionListener(this);
	
		Container contentPane = getContentPane();
		contentPane.add(p, BorderLayout.CENTER);
	  }

	  public void actionPerformed(ActionEvent e){
		if(mix.isSelected() && mate.isSelected()) {
			JOptionPane.showMessageDialog(this, "どちらか1つにチェックを入れてください");
		}
		if(mix.isSelected() && !mate.isSelected()) {
			String mate1 = mt1.getText();
			String mate2 = mt2.getText();
			String mate3 = mt3.getText();
			String mate4 = mt4.getText();
			calcMate(mate1, mate2, mate3, mate4);
		}
		if(!mix.isSelected() && mate.isSelected() && !ri.isSelected() && !same234.isSelected()) {
			String mixed = mi.getText();
			calcMixed(mixed, false, false);
		}
		if(!mix.isSelected() && mate.isSelected() && ri.isSelected() && !same234.isSelected()) {
			String mixed = mi.getText();
			calcMixed(mixed, true, false);
		}
		if(!mix.isSelected() && mate.isSelected() && !ri.isSelected() && same234.isSelected()) {
			String mixed = mi.getText();
			calcMixed(mixed, false, true);
		}
		if(!mix.isSelected() && mate.isSelected() && ri.isSelected() && same234.isSelected()) {
			String mixed = mi.getText();
			calcMixed(mixed, true, true);
		}
	  }

	  public void calcMate(String mate1, String mate2, String mate3, String mate4) {
		  try{
			MixedItem mixeditem = new MixedItem();
		if(!mate1.equals("") && !mate2.equals("") && !mate3.equals("") && !mate4.equals("")){
			if(((mate1.equals("あかぼんぐり"))|| (mate1.equals("あおぼんぐり")) || (mate1.equals("きぼんぐり")) || (mate1.equals("みどぼんぐり")) || 
			(mate1.equals("ももぼんぐり")) || (mate1.equals("しろぼんぐり")) || (mate1.equals("くろぼんぐり"))) && 
			((mate2.equals("あかぼんぐり"))|| (mate2.equals("あおぼんぐり")) || (mate2.equals("きぼんぐり")) || (mate2.equals("みどぼんぐり")) || 
			(mate2.equals("ももぼんぐり")) || (mate2.equals("しろぼんぐり")) || (mate2.equals("くろぼんぐり"))) &&
			((mate3.equals("あかぼんぐり"))|| (mate3.equals("あおぼんぐり")) || (mate3.equals("きぼんぐり")) || (mate3.equals("みどぼんぐり")) || 
			(mate3.equals("ももぼんぐり")) || (mate3.equals("しろぼんぐり")) || (mate3.equals("くろぼんぐり"))) &&
			((mate4.equals("あかぼんぐり"))|| (mate4.equals("あおぼんぐり")) || (mate4.equals("きぼんぐり")) || (mate4.equals("みどぼんぐり")) || 
			(mate4.equals("ももぼんぐり")) || (mate4.equals("しろぼんぐり")) || (mate4.equals("くろぼんぐり")))){
			mixeditem = MixedItem.MixedBall(mate1.trim(), mate2.trim(), mate3.trim(), mate4.trim());
			}
			else if((mate1.equals("きんのたま")) && (mate3.equals("きんのたま")) && (mate4.equals("きんのたま"))){
				mixeditem.name = "でかいきんのたま";
				mixeditem.name2 = "";
			}
			else if((mate1.equals("ちいさなキノコ")) && (mate3.equals("ちいさなキノコ")) && (mate4.equals("ちいさなキノコ"))){
				mixeditem.name = "おおきなキノコ";
				mixeditem.name2 = "";
			}
			else if((mate1.equals("おおきなキノコ")) && (mate3.equals("おおきなキノコ")) && (mate4.equals("おおきなキノコ"))){
				mixeditem.name = "かおるキノコ";
				mixeditem.name2 = "";
			}
			else if((mate1.equals("ほしのすな")) && (mate3.equals("ほしのすな")) && (mate4.equals("ほしのすな"))){
				mixeditem.name = "ほしのかけら";
				mixeditem.name2 = "";
			}
			else if((mate1.equals("ほしのかけら")) && (mate3.equals("ほしのかけら")) && (mate4.equals("ほしのかけら"))){
				mixeditem.name = "すいせいのかけら";
				mixeditem.name2 = "";
			}
			else if((mate1.equals("しんじゅ")) && (mate3.equals("しんじゅ")) && (mate4.equals("しんじゅ"))){
				mixeditem.name = "おおきなしんじゅ";
				mixeditem.name2 = "";
			}
			else if((mate1.equals("おおきなしんじゅ")) && (mate3.equals("おおきなしんじゅ")) && (mate4.equals("おおきなしんじゅ"))){
				mixeditem.name = "おだんごしんじゅ";
				mixeditem.name2 = "";
			}
			else if((mate1.equals("ぎんのおうかん")) && (mate3.equals("ぎんのおうかん")) && (mate4.equals("ぎんのおうかん"))){
				mixeditem.name = "きんのおうかん";
				mixeditem.name2 = "";
			}
			else if((mate1.equals("ふしぎなアメ")) && (mate3.equals("ふしぎなアメ")) && (mate4.equals("ふしぎなアメ"))){
				mixeditem.name = "とくせいカプセル";
				mixeditem.name2 = "";
			}
			else if((mate1.equals("ヨロイこうせき")) && (mate3.equals("ヨロイこうせき")) && (mate4.equals("ヨロイこうせき"))){
				mixeditem.name = "ポイントアップ";
				mixeditem.name2 = "";
			}else{
			Items mixed = Items.Items(mate1.trim(), mate2.trim(), mate3.trim(), mate4.trim());
			mixeditem = MixedItem.MixedItem(mixed.type, mixed.point);
			}
			if(mixeditem.name2.equals(""))
			JOptionPane.showMessageDialog(this, mixeditem.name);
			else if(!mixeditem.name2.equals(""))
			JOptionPane.showMessageDialog(this, mixeditem.name + "(" + mixeditem.name2 + ")");
		}
	}catch(NullPointerException e) {
		JOptionPane.showMessageDialog(this, "アイテム名が正しく入力されていません。");
	}
	  }

	  public void calcMixed(String mixed, boolean withOutRare, boolean same234) {
		  try{
		  ToMaterial materials = new ToMaterial();
			if(mixed.equals("モンスターボール") || mixed.equals("スーパーボール")){
				JOptionPane.showMessageDialog(this, "ぼんぐり4個(25.0%)");
			}
			else if(mixed.equals("ハイパーボール")){
				JOptionPane.showMessageDialog(this, "あかぼんぐり\nきぼんぐり\nみどぼんぐり\nももぼんぐり\nしろぼんぐり\n(入れた数に応じて確率上昇 最大25%)");
			}
			else if(mixed.equals("ダイブボール")){
				JOptionPane.showMessageDialog(this, "あおぼんぐり\n(入れた数に応じて確率上昇 最大25%)");
			}
			else if(mixed.equals("ダークボール")){
				JOptionPane.showMessageDialog(this, "くろぼんぐり\n(入れた数に応じて確率上昇 最大25%)");
			}
			else if(mixed.equals("ネットボール")){
				JOptionPane.showMessageDialog(this, "あおぼんぐり\n(入れた数に応じて確率上昇 最大25%)");
			}
			else if(mixed.equals("クイックボール")){
				JOptionPane.showMessageDialog(this, "きぼんぐり\n(入れた数に応じて確率上昇 最大25%)");
			}
			else if(mixed.equals("ネストボール")){
				JOptionPane.showMessageDialog(this, "みどぼんぐり\n(入れた数に応じて確率上昇 最大25%)");
			}
			else if(mixed.equals("ヒールボール")){
				JOptionPane.showMessageDialog(this, "ももぼんぐり\n(入れた数に応じて確率上昇 最大25%)");
			}
			else if(mixed.equals("プレミアボール")){
				JOptionPane.showMessageDialog(this, "しろぼんぐり\n(入れた数に応じて確率上昇 最大25%)");
			}
			else if(mixed.equals("ゴージャスボール")){
				JOptionPane.showMessageDialog(this, "くろぼんぐり\n(入れた数に応じて確率上昇 最大25%)");
			}
			else if(mixed.equals("レベルボール")){
				JOptionPane.showMessageDialog(this, "あかぼんぐり\n(入れた数に応じて確率上昇 最大26%)");
			}
			else if(mixed.equals("ルアーボール")){
				JOptionPane.showMessageDialog(this, "あおぼんぐり\n(入れた数に応じて確率上昇 最大1%)");
			}
			else if(mixed.equals("ムーンボール")){
				JOptionPane.showMessageDialog(this, "きぼんぐり\nももぼんぐり\n(入れた数に応じて確率上昇 最大1%)");
			}
			else if(mixed.equals("フレンドボール")){
				JOptionPane.showMessageDialog(this, "みどんぐり\n(入れた数に応じて確率上昇 最大1%)");
			}
			else if(mixed.equals("スピードボール")){
				JOptionPane.showMessageDialog(this, "しろんぐり\n(入れた数に応じて確率上昇 最大1%)");
			}
			else if(mixed.equals("ヘビーボール")){
				JOptionPane.showMessageDialog(this, "くろんぐり\n(入れた数に応じて確率上昇 最大1%)");
			}
			else if(mixed.equals("サファリボール") || mixed.equals("コンペボール")){
				JOptionPane.showMessageDialog(this, "ぼんぐり4個(0.1%)");
			}
			else if(mixed.equals("でかいきんのたま")){
				String[] ans = new String[4];
				ans[0] = "きんのたま"; ans[1] = "自由"; ans[2] = "きんのたま"; ans[3] = "きんのたま";
				JOptionPane.showMessageDialog(this, "[固定レシピ]"  + "\n" + ans[0] + "\n" + ans[1] + "\n" + ans[2] + "\n" + ans[3]);
			}
			else if(mixed.equals("おおきなキノコ")){
				String[] mate = new String[4];
				mate[0] = "ちいさなキノコ"; mate[1] = "自由"; mate[2] = "ちいさなキノコ"; mate[3] = "ちいさなキノコ";
				materials = ToMaterial.getInfo(mixed);
				String[] ans = ToMaterial.ToMaterial(materials.type, materials.point, withOutRare, same234);
				JOptionPane.showMessageDialog(this, "[固定レシピ]"  + "\n" + mate[0] + "\n" + mate[1] + "\n" + mate[2] + "\n" + mate[3] + "\n" + 
				"[ランダムレシピ]"  + "\n" + ans[0] + "\n" + ans[1] + "\n" + ans[2] + "\n" + ans[3]);
			}
			else if(mixed.equals("かおるキノコ")){
				String[] mate = new String[4];
				mate[0] = "おおきなキノコ"; mate[1] = "自由"; mate[2] = "おおきなキノコ"; mate[3] = "おおきなキノコ";
				materials = ToMaterial.getInfo(mixed);
				String[] ans = ToMaterial.ToMaterial(materials.type, materials.point, withOutRare, same234);
				JOptionPane.showMessageDialog(this, "[固定レシピ]"  + "\n" + mate[0] + "\n" + mate[1] + "\n" + mate[2] + "\n" + mate[3] + "\n" + 
				"[ランダムレシピ]"  + "\n" + ans[0] + "\n" + ans[1] + "\n" + ans[2] + "\n" + ans[3]);
			}
			else if(mixed.equals("ほしのかけら")){
				String[] mate = new String[4];
				mate[0] = "ほしのすな"; mate[1] = "自由"; mate[2] = "ほしのすな"; mate[3] = "ほしのすな";
				materials = ToMaterial.getInfo(mixed);
				String[] ans = ToMaterial.ToMaterial(materials.type, materials.point, withOutRare, same234);
				JOptionPane.showMessageDialog(this, "[固定レシピ]"  + "\n" + mate[0] + "\n" + mate[1] + "\n" + mate[2] + "\n" + mate[3] + "\n" + 
				"[ランダムレシピ]"  + "\n" + ans[0] + "\n" + ans[1] + "\n" + ans[2] + "\n" + ans[3]);
			}
			else if(mixed.equals("すいせいのかけら")){
				String[] mate = new String[4];
				mate[0] = "ほしのかけら"; mate[1] = "自由"; mate[2] = "ほしのかけら"; mate[3] = "ほしのかけら";
				materials = ToMaterial.getInfo(mixed);
				String[] ans = ToMaterial.ToMaterial(materials.type, materials.point, withOutRare, same234);
				JOptionPane.showMessageDialog(this, "[固定レシピ]"  + "\n" + mate[0] + "\n" + mate[1] + "\n" + mate[2] + "\n" + mate[3] + "\n" + 
				"[ランダムレシピ]"  + "\n" + ans[0] + "\n" + ans[1] + "\n" + ans[2] + "\n" + ans[3]);
			}
			else if(mixed.equals("おおきなしんじゅ")){
				String[] ans = new String[4];
				ans[0] = "しんじゅ"; ans[1] = "自由"; ans[2] = "しんじゅ"; ans[3] = "しんじゅ";
				JOptionPane.showMessageDialog(this, "[固定レシピ]"  + "\n" + ans[0] + "\n" + ans[1] + "\n" + ans[2] + "\n" + ans[3]);
			}
			else if(mixed.equals("おだんごしんじゅ")){
				String[] mate = new String[4];
				mate[0] = "おおきなしんじゅ"; mate[1] = "自由"; mate[2] = "おおきなしんじゅ"; mate[3] = "おおきなしんじゅ";
				materials = ToMaterial.getInfo(mixed);
				String[] ans = ToMaterial.ToMaterial(materials.type, materials.point, withOutRare, same234);
				JOptionPane.showMessageDialog(this, "[固定レシピ]"  + "\n" + mate[0] + "\n" + mate[1] + "\n" + mate[2] + "\n" + mate[3] + "\n" + 
				"[ランダムレシピ]"  + "\n" + ans[0] + "\n" + ans[1] + "\n" + ans[2] + "\n" + ans[3]);
			}
			else if(mixed.equals("きんのおうかん")){
				String[] ans = new String[4];
				ans[0] = "ぎんのおうかん"; ans[1] = "自由"; ans[2] = "ぎんのおうかん"; ans[3] = "ぎんのおうかん";
				JOptionPane.showMessageDialog(this, "[固定レシピ]"  + "\n" + ans[0] + "\n" + ans[1] + "\n" + ans[2] + "\n" + ans[3]);
			}
			else if(mixed.equals("とくせいカプセル")){
				String[] ans = new String[4];
				ans[0] = "ふしぎなアメ"; ans[1] = "自由"; ans[2] = "ふしぎなアメ"; ans[3] = "ふしぎなアメ";
				JOptionPane.showMessageDialog(this, "[固定レシピ]"  + "\n" + ans[0] + "\n" + ans[1] + "\n" + ans[2] + "\n" + ans[3]);
			}
			else if(mixed.equals("ポイントアップ")){
				String[] mate = new String[4];
				mate[0] = "ヨロイこうせき"; mate[1] = "自由"; mate[2] = "ヨロイこうせき"; mate[3] = "ヨロイこうせき";
				materials = ToMaterial.getInfo(mixed);
				String[] ans = ToMaterial.ToMaterial(materials.type, materials.point, withOutRare, same234);
				JOptionPane.showMessageDialog(this, "[固定レシピ]"  + "\n" + mate[0] + "\n" + mate[1] + "\n" + mate[2] + "\n" + mate[3] + "\n" + 
				"[ランダムレシピ]"  + "\n" + ans[0] + "\n" + ans[1] + "\n" + ans[2] + "\n" + ans[3]);
			}
			
			else if(!mixed.equals("") && !same234 == true){
				materials = ToMaterial.getInfo(mixed);
				String[] ans = ToMaterial.ToMaterial(materials.type, materials.point, withOutRare, same234);
				JOptionPane.showMessageDialog(this, ans[0] + "\n" + ans[1] + "\n" + ans[2] + "\n" + ans[3]);
			}

			else if(!mixed.equals("") && same234 == true){
				materials = ToMaterial.getInfo(mixed);
				String[] ans = ToMaterial.ToMaterial(materials.type, materials.point, withOutRare, same234);
				JOptionPane.showMessageDialog(this, ans[0] + "\n" + ans[1] + "\n" + ans[1] + "\n" + ans[1] + "\n");
			}
		}catch(NullPointerException e) {
			JOptionPane.showMessageDialog(this, "アイテム名が正しく入力されていません。\n(合成で出てこないアイテムを指定している可能性があります。)");
			}
	  	}

	}