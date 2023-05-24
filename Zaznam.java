/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dwstudio.zaverecny;

/**
 *
 * @author alojy
 */
public class Zaznam {
    
        public String jmeno;
        public String prijmeni;
        public int vek;
        public String telefon;

        public Zaznam(String jmeno, String prijmeni, int vek, String telefon)
        {
            this.jmeno = jmeno;
            this.prijmeni = prijmeni;
            this.vek = vek;
            this.telefon = telefon;
        }

    @Override
    public String toString() {
        return jmeno + " "  +prijmeni + ", má" + vek + " let a tel.: " + telefon;
    }
}

