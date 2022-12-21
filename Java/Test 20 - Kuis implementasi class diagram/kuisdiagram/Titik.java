/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dirumah.kuisdiagram;

/**
 *
 * @author Asid
 */
class Titik {
    public int x;
    public int y;

    public Titik(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public double distance(Titik o){
        double jumlah1 = o.getX() - this.x;
        double jumlah2 = o.getY() - this.y;
        double a = Math.pow(jumlah1, 2);
        double b = Math.pow(jumlah2, 2);
        double jumlah = a+b;
        return Math.sqrt(jumlah);
    }
    
}