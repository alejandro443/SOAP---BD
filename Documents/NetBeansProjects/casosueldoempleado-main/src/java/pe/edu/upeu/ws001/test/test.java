package pe.edu.upeu.ws001.test;

import pe.edu.upeu.ws001.config.Conexion;

/**
 *
 * @author J05K4
 */
public class test {
    public static void main(String[] args) {
        if(Conexion.getConex()!=null){
            System.out.println("Conectado");
        }else{
            System.out.println("No conectado");
        }

    }
    
}
