package kechengsheji;
import java.util.*;

public class Menu {
	int i;
	int getType(){			//用于选择指令类型
		System.out.println("请选择指令类型：");
		System.out.println("1 、MOV指令	2、双操作数指令	3、单操作数指令	4、转移指令/返回指令	5、转子指令");
		Scanner type = new Scanner(System.in);
		i = type.nextInt();
		if(i!=1&&i!=2&&i!=3&&i!=4&&i!=5){
			System.out.println(" 输入错误！");
			System.exit(-1);
		}
		return i;
	}
	
	int getI(){				//获取指令类型数字编号
		return i;
	}
	

}
