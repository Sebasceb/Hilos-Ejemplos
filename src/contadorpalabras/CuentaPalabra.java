/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contadorpalabras;

import java.util.Objects;

/**
 *
 * @author Gladys
 */
public class CuentaPalabra {
    private String palabra;
    private int cuenta;

    public CuentaPalabra(String palabra, int cuenta) {
        this.palabra = palabra;
        this.cuenta = cuenta;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.palabra);
        return hash;
    }
/*
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj != null) && getClass() == obj.getClass()) {
            
            CuentaPalabra other = (CuentaPalabra) obj;
            if (Objects.equals(this.palabra, other.palabra)) {
                return true;
            }
        }
        return false;
    }
*/

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CuentaPalabra other = (CuentaPalabra) obj;
        if (!Objects.equals(this.palabra, other.palabra)) {
            return false;
        }
        return true;
    }
    
    public String getPalabra() {
        return palabra;
    }

    public int getCuenta() {
        return cuenta;
    }
    
    public void incrementarCuenta(){//para incrementar la cuenta de esa palabra
        cuenta++;
    }
}
