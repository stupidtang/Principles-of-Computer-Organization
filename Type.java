package kechengsheji;
import java.util.*;

public class Type{
	Menu menu = new Menu();			//创建指令类型选择的对象
	int j=0;
	int k=20;
	int l=0;
	
	int getType(){					//获取指令类型编号
		return menu.getI();
	}
	
	int getZhiling(){				//获取指令
		
		switch(menu.getType()){
		case 1:
		j=0;
		break;
		case 2:System.out.println("请选择指令：");
		System.out.println("1、ADD	2、SUB	3、AND	4、OR	5、EOR");
		Scanner zhiling = new Scanner(System.in);
		j = zhiling.nextInt();
		if(j!=1&&j!=2&&j!=3&&j!=4&&j!=5){
			System.out.println(" 输入错误！");
			System.exit(-1);
		}
		break;
		case 3:System.out.println("请选择指令：");
		System.out.println("1、COM	2、NEG	3、INC	4、DEC	5、SL	6、SR");
		Scanner zhiling2 = new Scanner(System.in);
		j = zhiling2.nextInt();
		if(j!=1&&j!=2&&j!=3&&j!=4&&j!=5&&j!=6){
			System.out.println(" 输入错误！");
			System.exit(-1);
		}
		j +=5;
		break;
		case 4:System.out.println("请选择指令：");
		System.out.println("1、JMP	2、RST");
		Scanner zhiling3 = new Scanner(System.in);
		j = zhiling3.nextInt();
		if(j!=1&&j!=2){
			System.out.println(" 输入错误！");
			System.exit(-1);
		}
		j +=11;
		break;
		case 5:
		j=14;
		break;
		}
		return j;
	}
	
	int getSource(){				//获取源取址方式
		
		switch(menu.getI()){
		case 1:
		case 2:
		System.out.println("请选择源操作数寻址方式：");
		System.out.println("1、R0	2、（R0)		3、-（R0）	4、I/R（R0)+	5、@（R0）+	6、X(R0)");
		Scanner stream = new Scanner(System.in);
		k = stream.nextInt();
		if(k!=1&&k!=2&&k!=3&&k!=4&&k!=5&&k!=6){
			System.out.println(" 输入错误！");
			System.exit(-1);
		}
		break;
		case 4:System.out.println("请选择寻址方式：");
		System.out.println("1、SKP	2、R0	3、（R0)		4、I/R（R0)+	5、X(PC)		6、!PC	7、PC");
		Scanner stream2 = new Scanner(System.in);
		k = stream2.nextInt();
		if(k!=1&&k!=2&&k!=3&&k!=4&&k!=5&&k!=6&&k!=7){
			System.out.println(" 输入错误！");
			System.exit(-1);
		}
		if(k==1||k==2||k==3){
			k=k-1;
		}
		if(k==5){
			k=k+2;
		}
		if(k==6){
			k=k-7;
		}
		if(k==7){
			k=k-9;
		}
		break;
		case 5:System.out.println("请选择源操作数寻址方式：");
		System.out.println("1、R0	2、（R0)		3、I/R（R0)+		4、!PC	5、PC");
		Scanner stream3 = new Scanner(System.in);
		k = stream3.nextInt();
		if(k!=1&&k!=2&&k!=3&&k!=4&&k!=5){
			System.out.println(" 输入错误！");
			System.exit(-1);
		}
		if(k==3){
			k=k+1;
		}
		else if(k==4){
			k=k-5;
		}
		else if(k==5){
			k=k-7;
		}
		break;
		}
		return k;
	}
	
	int getDestination(){				//获取目的数取址方式
		
		switch(menu.getI()){
		case 1:
		case 2:
		case 3:System.out.println("请选择目的操作数寻址方式：");
		System.out.println("1、R1	2、（R1)		3、-（R1）	4、I/R（R1)+	5、@（R1）+	6、X(R1)");
		Scanner stream = new Scanner(System.in);
		l = stream.nextInt();
		if(l!=1&&l!=2&&l!=3&&l!=4&&l!=5&&l!=6){
			System.out.println(" 输入错误！");
			System.exit(-1);
		}
		break;
		}
		return l;
	}
	
	int getI(){						//获取指令类型数字编号
		return menu.getI();
	}
	
	int getJ(){						//获取指令数字编号
		return j;
	}
	
	int getK(){						//获取源数取址方式
		return k;
	}
	
	int getL(){						//获取目的数取址方式
		return l;
	}
	
	void FT(int a){					//所有指令的FT周期输出
		switch(a){
		case 1:
		case 2:	
			System.out.print("FT	M->IR\t\tEMAR,R,SIR\n\tPC+1->PC\tPC->A,A+1,DM,CPPC\n\t\t\t");		
			break;
		case 3:	
			if(getL()==1){
				System.out.print("FT	M->IR\t\tEMAR,R,SIR\n\tPC+1->PC\tPC->A,A+1,DM,CPPC\n\t\t\t");
			}
			else{
				System.out.print("FT	M->IR\t\tEMAR,R,SIR\n\tPC+1->PC\tPC->A,A+1,DM,CPPC\n\t\t\t");
			}
		break;
		case 4:	System.out.println("FT	M->IR\t\tEMAR,R,SIR\n\tPC+1->PC\tPC->A,A+1,DM,CPPC\n\t\t\t1->ET,CPFT,CPST,CPDT,CPET,CPT");
		break;
		case 5:
			if(getK()==1||getK()==-1||getK()==-2){
				System.out.println("FT	M->IR\t\tEMAR,R,SIR\n\tPC+1->PC\tPC->A,A+1,DM,CPPC\n\t\t\t1->ET,CPFT,CPST,CPDT,CPET,CPT");
			}
			else{
				System.out.println("FT	M->IR\t\tEMAR,R,SIR\n\tPC+1->PC\tPC->A,A+1,DM,CPPC\n\t\t\t1->ST,CPFT,CPST,CPDT,CPET,CPT");
			}
			break;
		}
	}
	
	void ST(){						//MOV和双操作数指令的ST周期输出
		switch(getK()){
		case 1:
		break;
		case 2:System.out.print("1->ST,CPFT,CPST,CPDT,CPET,CPT\nST0	R0->MAR\t\tR0->A,A,DM,CPMAR,T+1,CPT\nST1\tM->MDR->C\tEMAR,R,SMDR,MDR->B,B,DM,CPC\n\t\t\t");
		break;
		case 3:System.out.print("1->ST,CPFT,CPST,CPDT,CPET,CPT\nST0	R0-1->R0,MAR\tR0->A,A-1,DM,CPR0,CPMAR,T+1,CPT\nST1\tM->MDR->C\tEMAR,R,SMDR,MDR->B,B,DM,CPC\n\t\t\t");	
		break;
		case 4:System.out.print("1->ST,CPFT,CPST,CPDT,CPET,CPT\nST0	R0->MAR\t\tR0->A,A,DM,CPMAR,T+1,CPT\nST1\tM->MDR->C\tEMAR,R,SMDR,MDR->B,B,DM,CPC,T+1,CPT\nST2\tR0+1->R0\tR0->A,A+1,DM,CPR0\n\t\t\t");
		break;
		case 5:System.out.print("1->ST,CPFT,CPST,CPDT,CPET,CPT\nST0	R0->MAR\t\tR0->A,A,DM,CPMAR,T+1,CPT\nST1\tM->MDR->C\tEMAR,R,SMDR,MDR->B,B,DM,CPC,T+1,CPT\nST2\tR0+1->R0\tR0->A,A+1,DM,CPR0,T+1,CPT\nST3\tC->MAR\t\tC->B,B,DM,CPMAR,T+1,CPT\nST4\tM->MDR->C\tEMAR,R,SMDR,MDR->A,A,DM,CPC\n\t\t\t");
		break;
		case 6:System.out.print("1->ST,CPFT,CPST,CPDT,CPET,CPT\nST0	PC->MAR\t\tPC->A,A,DM,CPMAR,T+1,CPT\nST1\tM->MDR->C\tEMAR,R,SMDR,MDR->B,B,DM,CPC,T+1,CPT\nST2\tPC+1->PC\tPC->A,A+1,DM,CPPC,T+1,CPT\nST3\tC+R0->MAR\tR0->A,C->B,A+B,DM,CPMAR,T+1,CPT\nST4\tM->MDR->C\tEMAR,R,SMDR,MDR->B,B,DM,CPC\n\t\t\t");
		break;
		}
	}
	
	void ST2(){						//转子指令的ST周期输出
		switch(getK()){
		case 2:System.out.println("ST0\tR0->MAR\t\tR0->A,A,DM,CPMAR,T+1,CPT\nST1\tM->MDR->C\tEMAR,R,SMDR,MDR->B,B,DM,CPC\n\t\t\t1->ET,CPFT,CPST,CPDT,CPET,CPT");
		break;
		case 4:System.out.println("ST0\tR0->MAR\t\tR0->A,A,DM,CPMAR,T+1,CPT\nST1\tM->MDR->C\tEMAR,R,SMDR,MDR->B,B,DM,CPC,T+1,CPT\nST2\tR0+1->R0\tR0->B,B,DM,CPR0\n\t\t\t1->ET,CPFT,CPST,CPDT,CPET,CPT");
		}
	}
	
	
	void DT(){					//MOV指令的DT周期输出
		switch(getL()){
		case 1:
		break;
		case 2:System.out.print("1->DT,CPFT,CPST,CPDT,CPET,CPT\nDT0	R1->MAR\t\tR1->A,A,DM,CPMAR\n\t\t\t");
		break;
		case 3:System.out.print("1->DT,CPFT,CPST,CPDT,CPET,CPT\nDT0	R1-1->R1,MAR\tR1->A,A-1,DM,CPR1,CPMAR\n\t\t\t");	
		break;
		case 4:System.out.print("1->DT,CPFT,CPST,CPDT,CPET,CPT\nDT0	R1->MAR\t\tR1->A,A,DM,CPMAR,T+1,CPT\nDT1\tR1+1->R1\tR1->A,A+1,DM,CPR1\n\t\t\t");
		break;
		case 5:System.out.print("1->DT,CPFT,CPST,CPDT,CPET,CPT\nDT0	R1->MAR\t\tR1->A,A,DM,CPMAR,T+1,CPT\nDT1\tR1+1->R1\tR1->1,A+1,DM,CPR1,T+1,CPT\nDT2\tM->MDR->MAR\tEMAR,R,SMDR,MDR->B,B,DM,CPD,D->B,B,DM,CPMAR\n\t\t\t");
		break;
		case 6:System.out.print("1->DT,CPFT,CPST,CPDT,CPET,CPT\nDT0	PC->MAR\t\tPC->A,A,DM,CPMART+1,CPT\nDT1\tPC+1->PC\tPC->A,A+1,DM,CPPC,T+1,CPT\nDT2\tM->MDR->D\tEMAR,R,SMDR,MDR->B,B,DM,CPD,T+1,CPT\nDT3\tD+R1->MAR\tR1->A,D->B,A+B,DM,CPMAR\n\t\t\t");
		break;
		}
	}
	
	void DT2(){				//单、双操作数指令的DT周期输出
		switch(getL()){
		case 1:
		break;
		case 2:System.out.print("1->DT,CPFT,CPST,CPDT,CPET,CPT\nDT0	R1->MAR\t\tR1->A,A,DM,CPMAR,T+1,CPT\nDT1\tM->MDR->D\tEMAR,R,SMDR,MDR->B,B,DM,CPD\n\t\t\t");
		break;
		case 3:System.out.print("1->DT,CPFT,CPST,CPDT,CPET,CPT\nDT0	R1-1->R1,MAR\tR1->A,A-1,DM,CPR1,CPMAR,T+1,CPT\nDT1\tM->MDR->D\tEMAR,R,SMDR,MDR->B,B,DM,CPD\n\t\t\t");	
		break;
		case 4:System.out.print("1->DT,CPFT,CPST,CPDT,CPET,CPT\nDT0	R1->MAR\t\tR1->A,A,DM,CPMAR,T+1,CPT\nDT1\tM->MDR->D\tEMAR,R,SMDR,MDR->B,B,DM,CPD,T+1,CPT\nDT2\tR1+1->R1\tR1->A,A+1,DM,CPR1\n\t\t\t");
		break;
		case 5:System.out.print("1->DT,CPFT,CPST,CPDT,CPET,CPT\nDT0	R1->MAR\t\tR1->A,A,DM,CPMAR,T+1,CPT\nDT1\tM->MDR->D\tEMAR,R,SMDR,MDR->B,B,DM,CPD,T+1,CPT\nDT2\tR1+1->R1\tR1->A,A+1,DM,CPR1,T+1,CPT\nDT3\tD->MAR\t\tD->B,B,DM,CPMAR,T+1,CPT\nDT4\tM->MDR->MAR\tEMAR,R,SMDR,MDR->A,A,DM,CPD\n\t\t\t");
		break;
		case 6:System.out.print("1->DT,CPFT,CPST,CPDT,CPET,CPT\nDT0	PC->MAR\t\tPC->A,A,DM,CPMAR,T+1,CPT\nDT1\tM->MDR->D\tEMAR,R,SMDR,MDR->B,B,DM,CPD,T+1,CPT\nDT2\tPC+1->PC\tPC->A,A+1,DM,CPPC,T+1,CPT\nDT3\tD+R1->MAR\tR1->A,D->B,A+B,DM,CPMAR,T+1,CPT\nDT4\tM->MDR->D\tEMAR,R,SMDR,MDR->B,B,DM,CPD\n\t\t\t");
		break;
		}
	}
	
	void ET(int a,int b){			//MOV指令的ET周期输出
		if(a==1&&b==1){
			System.out.println("1->ET,CPFT,CPST,CPDT,CPET,CPT\nET0\tR0->R1\t\tR0->A,A,DM,CPR1,T+1,CPT\nET1\tPC->MAR\t\tPC->A,A,DM,CPMAR");
		}
		else if(a==1&&b!=1){
			System.out.println("1->ET,CPFT,CPST,CPDT,CPET,CPT\nET0\tR0->MDR\t\tR0->A,A,DM,SMDR,T+1,CPT\nET1\tMDR->M\t\tEMAR,W,T+1,CPT\nET2\tPC->MAR\t\tPC->A,A,DM,CPMAR");
		}
		else if(a!=1&&b==1){
			System.out.println("1->ET,CPFT,CPST,CPDT,CPET,CPT\nET0\tC->R1\t\tC->A,A,DM,CPR1,T+1,CPT\nET1\tPC->MAR\t\tPC->A,A,DM,CPMAR");
		}
		else{
			System.out.println("1->ET,CPFT,CPST,CPDT,CPET,CPT\nET0\tC->MDR\t\tC->A,A,DM,SMDR,T+1,CPT\nET1\tMDR->M\t\tEMAR,W,T+1,CPT\nET2\tPC->MAR\t\tPC->A,A,DM,CPMAR");
		}
	}
	
	void ET2(int a,int b,int c){		//双操作数指令的ET周期输出
		if(a==1&&b==1&&c==1){
			System.out.println("1->ET,CPFT,CPST,CPDT,CPET,CPT\nET0\tR0+R1->R1\tR0->A,R1->B,A+B,DM,CPR1,T+1,CPT\nET1\tPC->MAR\t\tPC->A,A,DM,CPMAR");
		}
		else if(a==1&&b==1&&c!=1){
			System.out.println("1->ET,CPFT,CPST,CPDT,CPET,CPT\nET0\tR0+D->MDR\tR0->A,D->B,A+B,DM,CPMDR,T+1,CPT\nET1\tMDR->M\t\tEMAR,W,T+1,CPT\nET2\tPC->MAR\t\tPC->A,A,DM,CPMAR");
		}
		else if(a==1&&b!=1&&c==1){
			System.out.println("1->ET,CPFT,CPST,CPDT,CPET,CPT\nET0\tC+R1->R1\tC->A,R1->B,A+B,DM,CPR1,T+1,CPT\nET1\tPC->MAR\t\tPC->A,A,DM,CPMAR");
		}
		else if(a==1&&b!=1&&c!=1){
			System.out.println("1->ET,CPFT,CPST,CPDT,CPET,CPT\nET0\tC+D->MDR\tC->A,D->B,A+B,DM,CPMDR,T+1,CPT\nET1\tMDR->M\t\tEMAR,W,T+1,CPT\nET2\tPC->MAR\t\tPC->A,A,DM,CPMAR");
		}
		else if(a==2&&b==1&&c==1){
			System.out.println("1->ET,CPFT,CPST,CPDT,CPET,CPT\nET0\tR0-R1->R1\tR0->A,R1->B,A-B,DM,CPR1,T+1,CPT\nET1\tPC->MAR\t\tPC->A,A,DM,CPMAR");
		}
		else if(a==2&&b==1&&c!=1){
			System.out.println("1->ET,CPFT,CPST,CPDT,CPET,CPT\nET0\tC-R1->R1\tC->A,R1->B,A-B,DM,CPR1,T+1,CPT\nET1\tPC->MAR\t\tPC->A,A,DM,CPMAR");
		}
		else if(a==2&&b!=1&&c==1){
			System.out.println("1->ET,CPFT,CPST,CPDT,CPET,CPT\nET0\tC-R1->R1\tC->A,R1->B,A-B,DM,CPR1,T+1,CPT\nET1\tPC->MAR\t\tPC->A,A,DM,CPMAR");
		}
		else if(a==2&&b!=1&&c!=1){
			System.out.println("1->ET,CPFT,CPST,CPDT,CPET,CPT\nET0\tC-D->MDR\tC->A,D->B,A-B,DM,CPMDR,T+1,CPT\nET1\tMDR->M\t\tEMAR,W,T+1,CPT\nET2\tPC->MAR\t\tPC->A,A,DM,CPMAR");
		}
		else if(a==3&&b==1&&c==1){
			System.out.println("1->ET,CPFT,CPST,CPDT,CPET,CPT\nET0\tR0&R1->R1\tR0->A,R1->B,A&B,DM,CPR1,T+1,CPT\nET1\tPC->MAR\t\tPC->A,A,DM,CPMAR");
		}
		else if(a==3&&b==1&&c!=1){
			System.out.println("1->ET,CPFT,CPST,CPDT,CPET,CPT\nET0\tR0&D->MDR\tR0->A,D->B,A&B,DM,CPMDR,T+1,CPT\nET1\tMDR->M\t\tEMAR,W,T+1,CPT\nET2\tPC->MAR\t\tPC->A,A,DM,CPMAR");
		}
		else if(a==3&&b!=1&&c==1){
			System.out.println("1->ET,CPFT,CPST,CPDT,CPET,CPT\nET0\tC&R1->R1\tC->A,R1->B,A&B,DM,CPR1,T+1,CPT\nET1\tPC->MAR\t\tPC->A,A,DM,CPMAR");
		}
		else if(a==3&&b!=1&&c!=1){
			System.out.println("1->ET,CPFT,CPST,CPDT,CPET,CPT\nET0\tC&D->MDR\tC->A,D->B,A&B,DM,CPMDR,T+1,CPT\nET1\tMDR->M\t\tEMAR,W,T+1,CPT\nET2\tPC->MAR\t\tPC->A,A,DM,CPMAR");
		}
		else if(a==4&&b==1&&c==1){
			System.out.println("1->ET,CPFT,CPST,CPDT,CPET,CPT\nET0\tR0|R1->R1\tR0->A,R1->B,A|B,DM,CPR1,T+1,CPT\nET1\tPC->MAR\t\tPC->A,A,DM,CPMAR");
		}
		else if(a==4&&b==1&&c!=1){
			System.out.println("1->ET,CPFT,CPST,CPDT,CPET,CPT\nET0\tR0|D->MDR\tR0->A,D->B,A|B,DM,CPMDR,T+1,CPT\nET1\tMDR->M\t\tEMAR,W,T+1,CPT\nET2\tPC->MAR\t\tPC->A,A,DM,CPMAR");
		}
		else if(a==4&&b!=1&&c==1){
			System.out.println("1->ET,CPFT,CPST,CPDT,CPET,CPT\nET0\tC|R1->R1\tC->A,R1->B,A|B,DM,CPR1,T+1,CPT\nET1\tPC->MAR\t\tPC->A,A,DM,CPMAR");
		}
		else if(a==4&&b!=1&&c!=1){
			System.out.println("1->ET,CPFT,CPST,CPDT,CPET,CPT\nET0\tC|D->MDR\tC->A,D->B,A|B,DM,CPMDR,T+1,CPT\nET1\tMDR->M\t\tEMAR,W,T+1,CPT\nET2\tPC->MAR\t\tPC->A,A,DM,CPMAR");
		}
		else if(a==5&&b==1&&c==1){
			System.out.println("1->ET,CPFT,CPST,CPDT,CPET,CPT\nET0\tR0 EOR R1->R1\tR0->A,R1->B,A EOR B,DM,CPR1,T+1,CPT\nET1\tPC->MAR\t\tPC->A,A,DM,CPMAR");
		}
		else if(a==5&&b==1&&c!=1){
			System.out.println("1->ET,CPFT,CPST,CPDT,CPET,CPT\nET0\tR0 EOR D->MDR\tR0->A,D->B,A EOR B,DM,CPMDR,T+1,CPT\nET1\tMDR->M\t\tEMAR,W,T+1,CPT\nET2\tPC->MAR\t\tPC->A,A,DM,CPMAR");
		}
		else if(a==5&&b!=1&&c==1){
			System.out.println("1->ET,CPFT,CPST,CPDT,CPET,CPT\nET0\tC EOR R1->R1\tC->A,R1->B,A EOR B,DM,CPR1,T+1,CPT\nET1\tPC->MAR\t\tPC->A,A,DM,CPMAR");
		}
		else if(a==5&&b!=1&&c!=1){
			System.out.println("1->ET,CPFT,CPST,CPDT,CPET,CPT\nET0\tC EOR D->MDR\tC->A,D->B,A EOR B,DM,CPMDR,T+1,CPT\nET1\tMDR->M\t\tEMAR,W,T+1,CPT\nET2\tPC->MAR\t\tPC->A,A,DM,CPMAR");
		}
	}
	
	void ET3(int a,int b){						//单操作数指令的ET周期输出
		if(a==6&&b==1){
			System.out.println("1->ET,CPFT,CPST,CPDT,CPET,CPT\nET0\tCOM(R1)->R1\tR1->A,COM(A),DM,CPR1,T+1,CPT\nET1\tPC->MAR\t\tPC->A,A,DM,CPMAR");
		}
		else if(a==6&&b!=1){
			System.out.println("1->ET,CPFT,CPST,CPDT,CPET,CPT\nET0\tCOM(R1)->MDR\tD->A,COM(A),DM,CPMDR,T+1,CPT\nET1\tMDR->M\t\tEMAR,W,T+1,CPT\nET2\tPC->MAR\t\tPC->A,A,DM,CPMAR");
		}
		else if(a==7&&b==1){
			System.out.println("1->ET,CPFT,CPST,CPDT,CPET,CPT\nET0\tNEG(R1)->R1\tR1->A,NEG(A),DM,CPR1,T+1,CPT\nET1\tPC->MAR\t\tPC->A,A,DM,CPMAR");
		}
		else if(a==7&&b!=1){
			System.out.println("1->ET,CPFT,CPST,CPDT,CPET,CPT\nET0\tNEG(R1)->MDR\tD->A,NEG(A),DM,CPMDR,T+1,CPT\nET1\tMDR->M\t\tEMAR,W,T+1,CPT\nET2\tPC->MAR\t\tPC->A,A,DM,CPMAR");
		}
		else if(a==8&&b==1){
			System.out.println("1->ET,CPFT,CPST,CPDT,CPET,CPT\nET0\tR1+1->R1\tR1->A,A+1,DM,CPR1,T+1,CPT\nET1\tPC->MAR\t\tPC->A,A,DM,CPMAR");
		}
		else if(a==8&&b!=1){
			System.out.println("1->ET,CPFT,CPST,CPDT,CPET,CPT\nET0\tR1+1->MDR\tD->A,A+1,DM,CPMDR,T+1,CPT\nET1\tMDR->M\t\tEMAR,W,T+1,CPT\nET2\tPC->MAR\t\tPC->A,A,DM,CPMAR");
		}
		else if(a==9&&b==1){
			System.out.println("1->ET,CPFT,CPST,CPDT,CPET,CPT\nET0\tR1-1->R1\tR1->A,A-1,DM,CPR1,T+1,CPT\nET1\tPC->MAR\t\tPC->A,A,DM,CPMAR");
		}
		else if(a==9&&b!=1){
			System.out.println("1->ET,CPFT,CPST,CPDT,CPET,CPT\nET0\tR1-1->MDR\tD->A,A-1,DM,CPMDR,T+1,CPT\nET1\tMDR->M\t\tEMAR,W,T+1,CPT\nET2\tPC->MAR\t\tPC->A,A,DM,CPMAR");
		}
		else if(a==10&&b==1){
			System.out.println("1->ET,CPFT,CPST,CPDT,CPET,CPT\nET0\tR1<<->R1\tR1->A,A,A<<1,CPR1,T+1,CPT\nET1\tPC->MAR\t\tPC->A,A,DM,CPMAR");
		}
		else if(a==10&&b!=1){
			System.out.println("1->ET,CPFT,CPST,CPDT,CPET,CPT\nET0\tR1<<->MDR\tD->A,A,A<<1,CPMDR,T+1,CPT\nET1\tMDR->M\t\tEMAR,W,T+1,CPT\nET2\tPC->MAR\t\tPC->A,A,DM,CPMAR");
		}
		else if(a==11&&b==1){
			System.out.println("1->ET,CPFT,CPST,CPDT,CPET,CPT\nET0\tR1>>->R1\tR1->A,A,A>>1,CPR1,T+1,CPT\nET1\tPC->MAR\t\tPC->A,A,DM,CPMAR");
		}
		else if(a==11&&b!=1){
			System.out.println("1->ET,CPFT,CPST,CPDT,CPET,CPT\nET0\tR1>>->MDR\tD->A,A,A>>1,CPMDR,T+1,CPT\nET1\tMDR->M\t\tEMAR,W,T+1,CPT\nET2\tPC->MAR\t\tPC->A,A,DM,CPMAR");
		}
	}
	
	void ET4(int a,int b){						//转移、返回指令的ET周期输出
		if((a==12||a==13)&&(b==0||b==-2)){
			System.out.println("ET0\tPC+1->PC,MAR\tPC->A,A+1,DM,CPPC,CPMAR");
		}
		else if((a==12||a==13)&&b==1){
			System.out.println("ET0\tR0->PC,MAR\tR0->A,A,DM,CPPC,CPMAR");
		}
		else if((a==12||a==13)&&b==2){
			System.out.println("ET0\tR0->MAR\t\tR0->A,A,DM,CPMAR,T+1,CPT\nET1\tM->MDR->PC,MAR\tEMAR,R,SMDR,MDR->B,B,DM,CPPC,CPMAR");
		}
		else if((a==12||a==13)&&b==4){
			System.out.println("ET0\tR0->MAR\t\tR0->A,A,DM,CPMAR,T+1,CPT\nET1\tM->MDR->PC,MAR\tEMAR,R,SMDR,MDR->B,B,DM,CPPC,CPMAR\nET2\tR0+1->R0\tR0->A,A,DM,CPR0");
		}
		else if ((a==12||a==13)&&b==7){
			System.out.println("ET0\tPC->MAR\t\tPC->A,A,DM,CPMAR,T+1,CPT\nET1\tM->MDR->C\tEMAR,R,SMDR,MDR->B,B,DM,CPC,T+1,CPT\nET2\tPC+C->PC,MAR\tPC->A,C->B,A+B,DM,CPPC,CPMAR");
		}
		else if((a==12||a==13)&&b==-1){
			System.out.println("ET0\tPC->MAR\t\tPC->A,A,DM,CPMAR");
		}
	}
	
	void ET5(int a){						//转子指令的ET周期输出
		if(a==-1){
			System.out.println("ET0\tPC->MAR\t\tPC->A,A,DM,CPMAR");
		}
		if(a==-2){
			System.out.println("ET0\tPC+1->PC,MAR\tPC->A,A+1,DM,CPPC,CPMAR");
		}
		if(a==1){
			System.out.println("ET0\tSP-1->SP,MAR\tSP->A,A-1,DM,CPSP,CPMAR,T+1,CPT\nET1\tPC->MDR\t\tPC->A,A,DM,SMDR,T+1,CPT\nET2\tMDR->M\t\tEMAR,W,T+1,CPT\nET3\tR0->PC,MAR\tR0->B,B,DM,CPPC,CPMARA");
		}
		if(a==2||a==4){
			System.out.println("ET0\tSP-1->SP,MAR\tSP->A,A-1,DM,CPSP,CPMAR,T+1,CPT\nET1\tPC->MDR\t\tPC->A,A,DM,SMDR,T+1,CPT\nET2\tMDR->M\t\tEMAR,W,T+1,CPT\nET3\tC->PC,MAR\tC->B,B,DM,CPPC,CPMAR");
		}
	}
	
	void out(int c){				//工作周期输出
		switch(c){
		case 0:						//MOV类型指令流程
			ST();
			DT();
			ET(getK(),getL());
			break;
		
		case 1:						//双操作数指令流程
		case 2:
		case 3:
		case 4:
		case 5:
			ST();
			DT2();
			ET2(getJ(),getK(),getL());
			break;
		
		case 6:						//单操作数指令流程
		case 7:
		case 8:
		case 9:
		case 10:
		case 11:
			DT2();
			ET3(getJ(),getK());
			break;
		
		case 12:					//转移、返回指令流程
		case 13:
			ET4(getJ(),getK());
			break;
			
		case 14:					//转子指令流程
			ST2();
			ET5(getK());
			break;		
		}
	}
	
	void output(){					//输出具体指令
		switch(j){
		case 0:System.out.print("MOV	");
		break;
		case 1:System.out.print("ADD	");
		break;
		case 2:System.out.print("SUB	");
		break;
		case 3:System.out.print("AND	");
		break;
		case 4:System.out.print("OR	");
		break;
		case 5:System.out.print("EOR	");
		break;
		case 6:System.out.print("COM	");
		break;
		case 7:System.out.print("NEG	");
		break;
		case 8:System.out.print("INC	");
		break;
		case 9:System.out.print("DEC	");
		break;
		case 10:System.out.print("SL	");
		break;
		case 11:System.out.print("SR	");
		break;
		case 12:System.out.print("JMP	");
		break;
		case 13:System.out.print("RST	");
		break;
		case 14:System.out.print("JSR	");
		break;
		}
	}
	
	void output2(){						//输出源数取址方式
		switch(k){
		case 0:System.out.println("SKP");
		break;
		case 1:System.out.println("R0");
		break;
		case 2:System.out.println("(R0)");
		break;
		case 3:System.out.println("-(R0)");
		break;
		case 4:System.out.println("I/(R0)+");
		break;
		case 5:System.out.println("@(R0)+");
		break;
		case 6:System.out.println("X(R0)");
		break;
		case 7:System.out.println("X(PC)");
		break;
		case -1:System.out.println("!PC");
		break;
		case -2:System.out.println("PC");
		break;
		default:System.out.println();
		break;
		}
	}
	
	void output3(){				//输出目的数取址方式
		switch(l){
		case 1:System.out.print("R1	");
		break;
		case 2:System.out.print("(R1)	");
		break;
		case 3:System.out.print("-(R1)	");
		break;
		case 4:System.out.print("I/(R1)+	");
		break;
		case 5:System.out.print("@(R1)+	");
		break;
		case 6:System.out.print("X(R1)	");
		break;
		}
	}
}
