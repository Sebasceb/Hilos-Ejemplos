/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contadorpalabras;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gladys
 */
public class ContadorPalabras {
     //lista con los nombres de los archivos a procesar
 	List<String> files = Arrays.asList("src/archivos/file1.txt",
                                           "src/archivos/file2.txt",
                                           "src/archivos/file3.txt");
	
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ContadorPalabras c = new ContadorPalabras();
        c.contarPalabras();
    }
   public void contarPalabras(){
       for(String ruta:files){
           LeeArchivo or =new LeeArchivo(ruta);//creo el objeto de tipo runnable
           Thread th = new Thread(or);
           th.start();
           
       }
   }
    
    class LeeArchivo implements Runnable{
        String rutaArchivo;
        ArrayList<CuentaPalabra> cuentaPalabras;
        LeeArchivo(String rutaArchivo){
            System.out.println(rutaArchivo);
            this.rutaArchivo=rutaArchivo;
            cuentaPalabras = new ArrayList<CuentaPalabra>();
        }
        @Override
        public void run() {
            BufferedReader reader;
            try {
                reader = new BufferedReader(new FileReader(rutaArchivo));
                System.out.println("Leyendo archivo"+rutaArchivo);
                String line;
                while ((line = reader.readLine()) != null)
                {
                    System.out.println("procesando archivo:" + rutaArchivo);
                  String palabras[] = line.split(" "); 
                  for (String palabra: palabras){
                      //ir incrementando la cuenta de la palabra
                      boolean encontrado = false;
                      /*for(int i=0;i<cuentaPalabras.size() && !encontrado;i++){
                          CuentaPalabra op = cuentaPalabras.get(i);
                          if (palabra.equals(op.getPalabra())){
                              op.incrementarCuenta();
                              encontrado = true;
                          }
                      }
                      if (!encontrado){
                          CuentaPalabra oc = new CuentaPalabra(palabra,1);
                          cuentaPalabras.add(oc);
                      }*/
                      
                      CuentaPalabra oc = new CuentaPalabra(palabra,1);
                      if (cuentaPalabras.contains(oc)){
                          int ind = cuentaPalabras.indexOf(oc);
                          CuentaPalabra ocr = cuentaPalabras.get(ind);
                          ocr.incrementarCuenta();
                          //cuentaPalabras.get(ind).incrementarCuenta();
                      }else{
                          cuentaPalabras.add(oc);
                      }
                      
                  }

                }
                 reader.close();
            } catch (FileNotFoundException ex) {
                System.out.println("Archivo no encontrado==");
                exit(1);
            }
            catch (IOException ex) {
                System.out.println("Error de procesamiento");
                ex.printStackTrace();
                exit(1);
            }
            //crear el archivo de reporte

            String nombreArchivoSalida = "src/reporte/reporte" +rutaArchivo.split("/")[2];
            try {
                FileWriter fw = new FileWriter(nombreArchivoSalida);
                BufferedWriter bw = new BufferedWriter(fw);



                for(CuentaPalabra oc : cuentaPalabras) {

                    bw.write( oc.getPalabra()+ "," + oc.getCuenta()+"\n");
                    
                    System.out.println(oc.getPalabra() + " => " + oc.getCuenta());
                 }

                bw.close();
                fw.close();
             }catch (IOException ex) {
                System.out.println("Error al escribir archivo");
                ex.printStackTrace();
                exit(1);
            }

        }
        
    }
}


