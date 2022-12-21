/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dirumah.kuisdiagram;

import java.time.LocalDate;

/**
 *
 * @author Asid
 */
class Student extends Person{
    public String npm;
    public String programStudi;

    public Student(String npm, String programStudi, String name, LocalDate dateOfBirth) {
        this.npm = npm;
        this.programStudi = programStudi;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getProgramStudi() {
        return programStudi;
    }

    public void setProgramStudi(String programStudi) {
        this.programStudi = programStudi;
    }
    
    @Override
    public void menulis(){
        System.out.println("Menulis Tugas Akhir");
    }
}
