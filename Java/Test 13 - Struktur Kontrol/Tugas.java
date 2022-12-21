import java.util.Scanner;
public class Tugas{
 public static void main(String[] args){
  Scanner input = new Scanner (System.in);
  System.out.print("Masukan password = ");
  long password = input.nextInt();
  if(password==2117051001){
   System.out.println();
   System.out.println("Nama  : Abdilah Asyidiqi\nNPM   : 2117051001\nKelas : D");

   int a=1;
   int b=2;

   System.out.println();
   System.out.println("1. If Statement:");
   if(a>0){
    System.out.println("Satu lebih besar dari nol");
   }
   System.out.println();
   
   System.out.println("2. If-else statement:");
   if(a<0){
    System.out.println("Satu lebih besar dari nol");
   }else{
    System.out.println("Satu tidak lebih besar dari nol");
   }
   System.out.println();
   
   System.out.println("3. If-else if-else Statement:");
   if(a<0){
    System.out.println("Satu lebih besar dari nol");
   }else if(a==1){
    System.out.println("Satu setara dengan satu");
   }else{
    System.out.println("Satu tidak setara dengan satu");
   }
   System.out.println();

   System.out.println("4. Nested-if:");
   if(a>0){
    System.out.println("Satu lebih besar dari nol");
    if(a==1){
     System.out.println("Satu setara dengan satu");
    }
   }else{
    System.out.println("Satu tidak lebih besar dari nol");
   }
   System.out.println();

   System.out.println("5. Switch case:");
   switch(b){
   case 1:
    System.out.println("b setara dengan satu");
    break;
   case 2:
    System.out.println("b setara dengan dua");
    break;
   default:
    System.out.println("b tidak setara dengan angka manapun");
   }
   System.out.println();
 
   System.out.println("6. For loop:");
   for(int i=0;i<=5;i++){
    System.out.print(i+" ");
   }
   System.out.println();
   System.out.println();
 
   System.out.println("7. While loop:");
   int j=0;
   while(j<=6){
    System.out.print(j+" ");
    j++;
   }
   System.out.println();
   System.out.println();
 
   System.out.println("8. Do-while loop:");
   int k=0;
   do{
    System.out.print(k+" ");
    k++;
   }while(k<=7);
   System.out.println();
   System.out.println();
 
   System.out.println("9. Branching-break:");
   int m=0;
   while(m<=20){
    System.out.print(m+" ");
    if(m==8){
     break;
    }
    m++;
   }
   System.out.println();
   System.out.println();
   
   System.out.println("10. Branching-continue (continue if i==5):");
   for (int i=0;i<=9;i++) {
    if(i==5){
     continue;
    }
    System.out.print(i+" ");
    }
   System.out.println();
   System.out.println();
  }else{
   System.out.println("Password Salah!");
  }
 }
}