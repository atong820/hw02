import java.util.Scanner;

public class selftest {

public static void main(String[] args) {
// TODO Auto-generated method stub
/*6. 試寫一程式, 讓使用者輸入兩次密碼 (四位整數), 
* 並驗證使用者兩次輸入的密碼是否符合, 輸入三次不正確即顯示錯誤的訊息。(原第八題)
*/

//外圈
outsideloop:for(int j=1 ;j<=3;j++) { 
//內圈
insideloop:for(int i=1;i<=3;i++) {

System.out.print("STEP1:請輸入四位整數密碼:\n");
Scanner wrt = new Scanner(System.in);
int setpass1=wrt.nextInt();

//
if ( setpass1 < 0 || setpass1 > 9999 ){
System.out.println("密碼限制為四位整數;輸入格式錯誤\n");
break ;
}

System.out.print("STEP2:請輸入四位整數密碼:\n");
Scanner wrti = new Scanner(System.in);
int setpass2=wrti.nextInt();

if ( setpass2 < 0 || setpass2 > 9999 ){
System.out.println("密碼限制為四位整數;輸入格式錯誤\n");
break;
}

 

/* 
//if 001
if (i==3) {
System.out.println("EROR");
break outsideloop;
}
//if 002 
if ( setpass1 < 0 || setpass1 > 9999 ){
System.out.println("密碼限制為四位整數;輸入格式錯誤\n");
}
//if 003
if ( setpass2 < 0 || setpass2 > 9999 ){
System.out.println("密碼限制為四位整數;輸入格式錯誤\n");
}

*/

//else if 001
else if (setpass1==setpass2){
System.out.print("密碼正確");
break outsideloop;
} 
//else if 002
else if (setpass1 !=setpass2){
System.out.print("請確認密碼一致性\n");

//else if 002中的if 001
if (j==3) {
System.out.println("EROR");
break outsideloop;
}
}

 


//內圈
}
//外圈
}


}
}
