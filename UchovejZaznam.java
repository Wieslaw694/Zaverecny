/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dwstudio.zaverecny;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author alojy
 */
public class UchovejZaznam {
    public List<Zaznam> zaznamy = new ArrayList<>();
        
        public void pridejZaznam(String jmeno, String prijmeni, int vek, String telefon)
        {
            zaznamy.add(new Zaznam(jmeno, prijmeni, vek, telefon));
        }
}
