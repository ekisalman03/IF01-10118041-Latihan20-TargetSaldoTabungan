/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118041.latihan20.targetsaldotabungan;
import java.text.DecimalFormat;
/*
 * NAMA              : Eki salman sya'bani
 * KELAS             : IF-01
 * NIM               : 10118041
 * DESKRIPSI PROGRAM : Program yang dapat menampilkan saldo perbulan  
 */

public class IF0110118041Latihan20TargetSaldoTabungan {


   /**

     * @param args the command line arguments

     */

    public static void main(String[] args) {

        int i, saldo;

        DecimalFormat satuan = new DecimalFormat();

        i = 1;
        saldo = 3500000;
        while (i < 10) {
            saldo += (0.08 * saldo);
            System.out.println("Saldo di bulan ke-" + i + " Rp." + satuan.format(saldo));
            i++;

            if (saldo >= 6000000) {

                break;
            }

        }
    }
}
