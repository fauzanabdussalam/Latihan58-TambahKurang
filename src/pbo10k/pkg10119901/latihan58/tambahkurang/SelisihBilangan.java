/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119901.latihan58.tambahkurang;

/**
 *
 * @author User
 */
public class SelisihBilangan extends Bilangan
{
    public void tampilSelisih()
    {
        System.out.println("Hasil Selisih \t\t" + super.getX() + " - " + super.getY() + " = " + (super.getX() - super.getY()));
    }
}
