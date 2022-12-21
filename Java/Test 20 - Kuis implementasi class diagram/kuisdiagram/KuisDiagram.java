package dirumah.kuisdiagram;

import java.time.LocalDate;
import java.time.Month;

public class KuisDiagram {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2003, Month.JUNE, 5);
        PersonInterface s = new Student("2007051001","Manajemen Informatika","Andi",date);
        
        s.menulis();
    }
}
