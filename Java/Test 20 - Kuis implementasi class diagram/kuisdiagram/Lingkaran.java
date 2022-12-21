/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dirumah.kuisdiagram;

/**
 *
 * @author Asid
 */
class Lingkaran {
    public double radius;
    Titik titikPusat;

    public Lingkaran(double radius, Titik titikPusat) {
        this.radius = radius;
        this.titikPusat = titikPusat;
    }

    public Titik getTitikPusat() {
        return titikPusat;
    }

    public void setTitikPusat(Titik titikPusat) {
        this.titikPusat = titikPusat;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double luas(){
        return Math.PI*this.radius*this.radius;
    }
    
    public double keliling(){
        return 2*Math.PI*this.radius;
    }
}
