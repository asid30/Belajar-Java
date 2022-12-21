package dirumah.project1;


import java.util.Scanner;

public class Project4 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Pilih menu: \n1. Looping\n2. Percabangan\n3. Ternary Operator\nJawab:");
        int kondisi = scan.nextInt();
        //looping
        if (kondisi == 1){
            System.out.println("Masukan Nilai: ");
            int nilai2 = scan.nextInt();
            
//            //for loop
//            for(int i=0;i<nilai2;i++){
//                System.out.println(i);
//            }
            
//            //while loop
//            int i=0;
//            while(i<nilai2){
//                System.out.println(i);
//                i++;
//            }
            
            //do while
            int i=0;
            do{
                System.out.println(i);
                i++;
            }while(i<nilai2);
        }
        //percabangan
        else if (kondisi == 2){
            while(true){
                System.out.println("Masukan Nilai: ");
                int nilai = scan.nextInt();

                String hurufMutu;
                char kondisiHuruf;
                
                if(nilai>100){
                    System.out.println("Nilai tidak boleh melebihi 100");
                    break;
                }
                
                if(nilai%10==0){
                    System.out.println("Bilangan ini adalah kelipatan 10");
//                    continue;
                }
                
                if(nilai>=76){
                    hurufMutu = "A+";kondisiHuruf='a';
                }
                else if (nilai>= 71){
                    hurufMutu = "B+";kondisiHuruf='b';
                }
                else if (nilai>= 66){
                    hurufMutu = "B";kondisiHuruf='c';
                }
                else if (nilai>= 61){
                    hurufMutu = "C+";kondisiHuruf='d';
                }
                else if (nilai>= 56){
                    hurufMutu = "C";kondisiHuruf='e';
                }
                else if (nilai>= 50){
                    hurufMutu = "D";kondisiHuruf='f';
                }
                else{
                    hurufMutu = "E";kondisiHuruf='g';
                }

                System.out.println("Nilai anda = "+ hurufMutu);

                switch (kondisiHuruf){
                    case 'a': System.out.println("Sangat Baik!");break;
                    case 'b': System.out.println("Cukup Baik!");break;
                    case 'c': System.out.println("Cukup!");break;
                    case 'd': System.out.println("Kurang!");break;
                    case 'e': System.out.println("Sangat Kurang!");break;
                    case 'f': System.out.println("Belajar Lagi!");break;
                    case 'g': System.out.println("Astafirullah!");break;
                    
                    default: System.out.println("Huruf tidak valid");break;
                }
            }
        }
        //ternary operator
        else if(kondisi == 3){
            boolean ternary = false;
            
            String pilihan = (ternary) ? "Vidya" : "Abdillah";
            System.out.println(pilihan);
        }
        
        else {
            System.out.println("Pilihan salah!");
        }
    } 
}
