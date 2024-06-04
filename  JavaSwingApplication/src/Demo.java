import javax.swing.*;
import java.awt.*;
class Calculator extends JFrame{
	JButton bt0;
	JButton bt1;
	JButton bt2;
	JButton bt3;
	JButton bt4;
	JButton bt5;
	JButton bt6;
	JButton bt7;
	JButton bt8;
	JButton bt9;
	JButton btAdd;
	JButton btMul;
	JButton btDiv;
	JButton btSub;
	JButton btDot;
	JButton btEquals;
	
	Calculator(){
		setSize(400,300);
		setTitle("Calculator");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		
		setLayout(new GridLayout(4,4));
		
		bt7=new JButton("7");
		bt7.setFont(new Font("",1,20));
		add(bt7);
		
		bt8=new JButton("8");
		bt8.setFont(new Font("",1,20));
		add(bt8);
		
		bt9=new JButton("9");
		bt9.setFont(new Font("",1,20));
		add(bt9);
		
		btMul=new JButton("*");
		btMul.setFont(new Font("",1,20));
		add(btMul);
		
		
		bt4=new JButton("4");
		bt4.setFont(new Font("",1,20));
		add(bt4);
		
		bt5=new JButton("5");
		bt5.setFont(new Font("",1,20));
		add(bt5);
		
		bt6=new JButton("6");
		bt6.setFont(new Font("",1,20));
		add(bt6);
		
		btDiv=new JButton("/");
		btDiv.setFont(new Font("",1,20));
		add(btDiv);
		
		bt1=new JButton("1");
		bt1.setFont(new Font("",1,20));
		add(bt1);
		
		bt2=new JButton("2");
		bt2.setFont(new Font("",1,20));
		add(bt2);
		
		bt3=new JButton("3");
		bt3.setFont(new Font("",1,20));
		add(bt3);
		
		btAdd=new JButton("+");
		btAdd.setFont(new Font("",1,20));
		add(btAdd);
		
		bt0=new JButton("0");
		bt0.setFont(new Font("",1,20));
		add(bt0);
		
		btDot=new JButton(".");
		btDot.setFont(new Font("",1,20));
		add(btDot);
		
		btEquals=new JButton("=");
		btEquals.setFont(new Font("",1,20));
		add(btEquals);
		
		btSub=new JButton("-");
		btSub.setFont(new Font("",1,20));
		add(btSub);
		
		pack();
		
	}
}
class Demo{
	public static void main(String args[]){
		new Calculator().setVisible(true);
	
	}
}
