package kechengsheji;

public class Test {					//程序入口
	public static void main(String args[]){
		Type type = new Type();
		type.getZhiling();
		type.getSource();
		type.getDestination();
		
		System.out.println("你输入的指令为：");
		type.output();
		type.output3();
		type.output2();
		System.out.println("指令流程与微命令序列如下：");
		type.FT(type.getType());
		
		type.out(type.getJ());
	}
}
