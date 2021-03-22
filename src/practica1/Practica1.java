/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CURACAO
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        File archivo;
        FileWriter escribir;
        PrintWriter linea;
        
        FileReader leer;
        BufferedReader almacenamiento;
        
        String cadena, nombreAur = "";

        String correo = "", nombreDis = "", visible = "", estado="";
        String correoTable = "", nombreTable = "", visibleTable = "", estadoTable="";
        String correoWatch = "", nombreWatch = "", visibleWatch = "", estadoWatch="";
        String correoPhone = "", nombrePhone = "", visiblePhone ="", estadoPhone="";

        
        int registros=1;
        int numeroPhone;
        int numeroDis;
        int op1;
        int crearDis;
        int auric;
        int op2, administrarDis, accionesDis, AD;

        System.out.println("1 - Crear dispositivo");
        System.out.println("2 - Administrar dispositivo");
        System.out.println("3 - Acciones con dispositivos");
        System.out.println("4 - Acciones externas de dispositivos");
        System.out.println("5 - Cargas masivas");
        System.out.println("6 - Logs");
        System.out.println("Seleccione la opción a ejecutar: ");
        op1 = in.nextInt();

        switch (op1) {
            case 1:
                System.out.println("Crear Dispositivos");
                System.out.println("------------------");
                System.out.println("1- Computadora portátil");
                System.out.println("2- Tablet");
                System.out.println("3- SmartWatch");
                System.out.println("4- Smartphone");
                System.out.println("5- Auriculares inalámbricos");
                System.out.println("Selelccione tipo de dispositivo a crear: ");
                crearDis = in.nextInt();
                switch (crearDis) {
                    case 1:
                        System.out.println("Computadora Portatil");
                        archivo = new File("nombredis.txt");
                        if (!archivo.exists()) {
                            try {
                                archivo.createNewFile();
                                
                                 System.out.println("");
                                correo = in.nextLine();
                                
                                
                                System.out.println("Ingrese el correo: ");
                                correo = in.nextLine();

                                System.out.println("Ingrese nombre del dispositivo: ");
                                nombreDis = in.nextLine();

                                System.out.println("Visible: ");
                                visible = in.nextLine();
                                
                                
                                
                                
                                 System.out.println("Estado, Encendido - Apagado: ");
                                estado = in.nextLine();

                                escribir = new FileWriter(archivo, true);
                                linea = new PrintWriter(escribir);

                                linea.println(correo);
                                linea.println(nombreDis);
                                linea.println(visible);
                                linea.println(estado);
                                
                                 System.out.println("Correo electrónico:" + correo);
                                System.out.println("Nombre del dispositivo:" + nombreDis);
                                System.out.println("Visible para la conexión:" + visible);
                                System.out.println("Estado:" + estado);
                                
                                System.out.println("Nota: El Dispositivo será encendido por defecto");
                                
                                

                                linea.close();
                                escribir.close();

                            } catch (IOException ex) {
                                Logger.getLogger(Practica1.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        } else {

                            try {
                                
                                
                                System.out.println("");
                                correo = in.nextLine();
                                
                                
                                System.out.println("Ingrese el correo: ");
                                correo = in.nextLine();

                                System.out.println("Ingrese nombre del dispositivo: ");
                                nombreDis = in.nextLine();

                                System.out.println("Visible: ");
                                visible = in.nextLine();
                                
                                 
                                
                                 System.out.println("Estado, Encendido - Apagado: ");
                                estado = in.nextLine();
                                
                                

                                escribir = new FileWriter(archivo, true);
                                linea = new PrintWriter(escribir);

                                linea.println(correo);
                                linea.println(nombreDis);
                                linea.println(visible);
                                linea.println(estado);
                                
                                System.out.println("Correo electrónico:" + correo);
                                System.out.println("Nombre del dispositivo:" + nombreDis);
                                System.out.println("Visible para la conexión:" + visible);
                                System.out.println("Estado:" + estado);
                                
                                System.out.println("Nota: El Dispositivo será encendido por defecto");
                                

                                linea.close();
                                escribir.close();

                            } catch (IOException ex) {
                                Logger.getLogger(Practica1.class.getName()).log(Level.SEVERE, null, ex);
                            }

                        }

                        break;
                        
                        
                  
                        
                        
                        
                        
                   case 2:
                        System.out.println("Tablet");
                        archivo = new File("nombredis.txt");
                        if (!archivo.exists()) {
                            try {
                                archivo.createNewFile();
                                
                                 System.out.println("");
                                correoTable = in.nextLine();
                                
                                
                                System.out.println("Ingrese el correo: ");
                                correoTable = in.nextLine();

                                System.out.println("Ingrese nombre del dispositivo: ");
                                nombreTable = in.nextLine();

                                System.out.println("Visible: ");
                                visibleTable = in.nextLine();
                                
                                System.out.println("Estado, Encendido - Apagado: ");
                                estadoTable = in.nextLine();

                                escribir = new FileWriter(archivo, true);
                                linea = new PrintWriter(escribir);

                                linea.println(correoTable);
                                linea.println(nombreTable);
                                linea.println(visibleTable);
                                linea.println(estadoTable);
                                
                                
                                System.out.println("Correo electrónico:" + correoTable);
                                System.out.println("Nombre del dispositivo:" + nombreTable);
                                System.out.println("Visible para la conexión:" + visibleTable);
                                  System.out.println("Estado:" + estadoTable);
                                
                                System.out.println("Nota: El Dispositivo será encendido por defecto");
                                

                                linea.close();
                                escribir.close();

                            } catch (IOException ex) {
                                Logger.getLogger(Practica1.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        } else {

                            try {
                                
                                
                                System.out.println("");
                                correoTable = in.nextLine();
                                
                                
                                System.out.println("Ingrese el correo: ");
                                correoTable = in.nextLine();

                                System.out.println("Ingrese nombre del dispositivo: ");
                                nombreTable = in.nextLine();

                                System.out.println("Visible: ");
                                visibleTable = in.nextLine();
                                
                                System.out.println("Estado, Encendido - Apagado: ");
                                estadoTable = in.nextLine();

                                escribir = new FileWriter(archivo, true);
                                linea = new PrintWriter(escribir);

                                linea.println(correoTable);
                                linea.println(nombreTable);
                                linea.println(visibleTable);
                                linea.println(estadoTable);
                                
                                System.out.println("Correo electrónico:" + correoTable);
                                System.out.println("Nombre del dispositivo:" + nombreTable);
                                System.out.println("Visible para la conexión:" + visibleTable);
                                  System.out.println("Estado:" + estadoTable);
                                
                                System.out.println("Nota: El Dispositivo será encendido por defecto");
                                

                                linea.close();
                                escribir.close();

                            } catch (IOException ex) {
                                Logger.getLogger(Practica1.class.getName()).log(Level.SEVERE, null, ex);
                            }

                        }

                        break;
                        
                        
                        
                        
                   case 3:
                        System.out.println("SmartWatch");
                        archivo = new File("nombredis.txt");
                        if (!archivo.exists()) {
                            try {
                                archivo.createNewFile();
                                
                                 System.out.println("");
                                correoWatch = in.nextLine();
                                
                                
                                System.out.println("Ingrese el correo: ");
                                correoWatch = in.nextLine();

                                System.out.println("Ingrese nombre del dispositivo: ");
                                nombreWatch = in.nextLine();

                                System.out.println("Visible: ");
                                visibleWatch = in.nextLine();
                                
                                System.out.println("Estado, Encendido - Apagado: ");
                                estadoWatch = in.nextLine();

                                escribir = new FileWriter(archivo, true);
                                linea = new PrintWriter(escribir);

                                linea.println(correoWatch);
                                linea.println(nombreWatch);
                                linea.println(visibleWatch);
                                linea.println(estadoWatch);
                                
                                
                                System.out.println("Correo electrónico:" + correoWatch);
                                System.out.println("Nombre del dispositivo:" + nombreWatch);
                                System.out.println("Visible para la conexión:" + visibleWatch);
                                  System.out.println("Estado:" + estadoWatch);
                                
                                System.out.println("Nota: El Dispositivo será encendido por defecto");
                                

                                linea.close();
                                escribir.close();

                            } catch (IOException ex) {
                                Logger.getLogger(Practica1.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        } else {

                            try {
                                
                                
                                System.out.println("");
                                correoWatch = in.nextLine();
                                
                                
                                System.out.println("Ingrese el correo: ");
                                correoWatch = in.nextLine();

                                System.out.println("Ingrese nombre del dispositivo: ");
                                nombreWatch = in.nextLine();

                                System.out.println("Visible: ");
                                visibleWatch = in.nextLine();
                                
                                System.out.println("Estado, Encendido - Apagado: ");
                                estadoWatch = in.nextLine();

                                escribir = new FileWriter(archivo, true);
                                linea = new PrintWriter(escribir);

                                linea.println(correoWatch);
                                linea.println(nombreWatch);
                                linea.println(visibleWatch);
                                linea.println(estadoWatch);
                                
                                System.out.println("Correo electrónico:" + correoWatch);
                                System.out.println("Nombre del dispositivo:" + nombreWatch);
                                System.out.println("Visible para la conexión:" + visibleWatch);
                                  System.out.println("Estado:" + estadoWatch);
                                
                                System.out.println("Nota: El Dispositivo será encendido por defecto");
                                

                                linea.close();
                                escribir.close();

                            } catch (IOException ex) {
                                Logger.getLogger(Practica1.class.getName()).log(Level.SEVERE, null, ex);
                            }

                        }

                        break;
                        
                        
                        
                        case 4:
                        System.out.println("Smartphone");
                        archivo = new File("nombredis.txt");
                        if (!archivo.exists()) {
                            try {
                                archivo.createNewFile();
                                
                                 System.out.println("");
                                correoPhone = in.nextLine();
                                
                                
                                System.out.println("Ingrese el correo: ");
                                correoPhone = in.nextLine();

                                System.out.println("Ingrese nombre del dispositivo: ");
                                nombrePhone = in.nextLine();
                                
                                System.out.println("Ingrese el número de Smartphone");
                                numeroPhone = in.nextInt();

                                 System.out.println(" ");
                                visiblePhone = in.nextLine();
                                
                                System.out.println("Visible: ");
                                visiblePhone = in.nextLine();
                                
                                System.out.println("Estado, Encendido - Apagado: ");
                                estadoPhone = in.nextLine();

                                escribir = new FileWriter(archivo, true);
                                linea = new PrintWriter(escribir);

                                linea.println(correoPhone);
                                linea.println(nombrePhone);
                                linea.println(numeroPhone);
                                linea.println(visiblePhone);
                                linea.println(estadoPhone);
                                
                                
                                System.out.println("Correo electrónico:" + correoPhone);
                                System.out.println("Nombre del dispositivo:" + nombrePhone);
                                System.out.println("El numero de Smartphone es: " + numeroPhone);
                                System.out.println("Visible para la conexión:" + visiblePhone);
                                  System.out.println("Estado:" + estadoPhone);
                                
                                System.out.println("Nota: El Dispositivo será encendido por defecto");
                                

                                linea.close();
                                escribir.close();

                            } catch (IOException ex) {
                                Logger.getLogger(Practica1.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        } else {

                            try {
                                
                                
                                 System.out.println("");
                                correoPhone = in.nextLine();
                                
                                
                                System.out.println("Ingrese el correo: ");
                                correoPhone = in.nextLine();

                                System.out.println("Ingrese nombre del dispositivo: ");
                                nombrePhone = in.nextLine();
                                
                                
                                System.out.println("Ingrese el número de Smartphone");
                                numeroPhone = in.nextInt();
                                
                                 System.out.println(" ");
                                visiblePhone = in.nextLine();
                                

                                System.out.println("Visible: ");
                                visiblePhone = in.nextLine();
                                
                                System.out.println("Estado, Encendido - Apagado: ");
                                estadoPhone = in.nextLine();

                                escribir = new FileWriter(archivo, true);
                                linea = new PrintWriter(escribir);

                                linea.println(correoPhone);
                                linea.println(nombrePhone);
                                linea.println(numeroPhone);
                                linea.println(visiblePhone);
                                linea.println(estadoPhone);
                                
                                
                                System.out.println("Correo electrónico:" + correoPhone);
                                System.out.println("Nombre del dispositivo:" + nombrePhone);
                                System.out.println("El numero de Smartphone es: " + numeroPhone);
                                System.out.println("Visible para la conexión:" + visiblePhone);
                                  System.out.println("Estado:" + estadoPhone);
                                
                                System.out.println("Nota: El Dispositivo será encendido por defecto");
                                

                                linea.close();
                                escribir.close();

                            } catch (IOException ex) {
                                Logger.getLogger(Practica1.class.getName()).log(Level.SEVERE, null, ex);
                            }

                        }

                        break;
                        
                        
                        
                         case 5:
                        System.out.println("Creación de nuevo Auriculares");
                        
                        archivo = new File("nombredis.txt");
        {
            try {
                leer = new FileReader(archivo);
                almacenamiento = new BufferedReader(leer);
                cadena="";
                while(cadena!=null){
                    try {
                       
                        cadena=almacenamiento.readLine();
                        nombreDis = cadena;
                       
                        cadena=almacenamiento.readLine();
                        nombreTable = cadena;
                        
                        cadena=almacenamiento.readLine();
                        nombreWatch = cadena;
                       
                        cadena=almacenamiento.readLine();
                        nombrePhone = cadena;
                        
                        
                        if(cadena!=null){
                          
                            System.out.println("Nombre:" + nombreWatch);
                            
                            System.out.println("Mostrando datos de registro" + registros);
                            registros++;
                        }
                        
                      
                      
                        
                    } catch (IOException ex) {
                        Logger.getLogger(Practica1.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }
                
                  
                        System.out.println("Seleccione el registro del nombre del dispositivo a enlazar a los Auriculares: ");
                        auric = in.nextInt();
                        
                        
                         System.out.println("Conectado! ");
                         
                try {
                    almacenamiento.close();
                    leer.close();
                } catch (IOException ex) {
                    Logger.getLogger(Practica1.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Practica1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                        


                        break;
                        
                }
                
                
                
                
                

                break;
                
                
              

                
                
                
                 
        
        
            case 2:   
                
                 System.out.println("Administrar Dispositivos");
                System.out.println("------------------");
                System.out.println("1- Computadora portátil");
                System.out.println("2- Tablet");
                System.out.println("3- SmartWatch");
                System.out.println("4- Smartphone");
                System.out.println("5- Auriculares inalámbricos");
                System.out.println("Selelccione tipo de dispositivo a administrar: ");
                administrarDis = in.nextInt();
                
                switch(administrarDis) {
                    case 1:
                        
                        System.out.println("Computadora portatil");
                        
                        archivo = new File("nombredis.txt");
        {
            try {
                leer = new FileReader(archivo);
                almacenamiento = new BufferedReader(leer);
                cadena="";
             
                
                while(cadena!=null){
                    try {
                       
                        cadena=almacenamiento.readLine();
                        correo = cadena;
                       
                        
                        cadena=almacenamiento.readLine();
                        nombreDis = cadena;
                       
                        cadena=almacenamiento.readLine();
                        visible = cadena;
                        
                        cadena=almacenamiento.readLine();
                        estado = cadena;
                        
                        
                        if(cadena!=null){
                          System.out.println(visible);
                            System.out.println(correo);
                             
                            
                           
                        }
                        
                      
                      
                        
                    } catch (IOException ex) {
                        Logger.getLogger(Practica1.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }
                
                  
                        System.out.println("Seleccione el registro del nombre del dispositivo para Administrar ");
                        auric = in.nextInt();
                        
                        
                         System.out.println("Exitoso");
                         
                try {
                    almacenamiento.close();
                    leer.close();
                } catch (IOException ex) {
                    Logger.getLogger(Practica1.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Practica1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                        
                            
                    
                     break;  
                     
                     
                     
                     
                      case 2:
                        
                        System.out.println("Tablet");
                        
                        archivo = new File("nombredis.txt");
        {
            try {
                leer = new FileReader(archivo);
                almacenamiento = new BufferedReader(leer);
                cadena="";
             
                
                while(cadena!=null){
                    try {
                       
                        cadena=almacenamiento.readLine();
                        correo = cadena;
                       
                        
                        cadena=almacenamiento.readLine();
                        nombreDis = cadena;
                       
                        cadena=almacenamiento.readLine();
                        visible = cadena;
                        
                        cadena=almacenamiento.readLine();
                        estado = cadena;
                        
                        
                        if(cadena!=null){
                          System.out.println(visible);
                            System.out.println(correo);
                             
                            
                           
                        }
                        
                      
                      
                        
                    } catch (IOException ex) {
                        Logger.getLogger(Practica1.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }
                
                  
                        System.out.println("Seleccione el registro del nombre del dispositivo para Administrar ");
                        auric = in.nextInt();
                        
                        
                         System.out.println("Exitoso");
                         
                try {
                    almacenamiento.close();
                    leer.close();
                } catch (IOException ex) {
                    Logger.getLogger(Practica1.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Practica1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                        
                            
                    
                     break;   
                     
                     
                     
                     
                       case 3:
                        
                        System.out.println("SmartWatch");
                        
                        archivo = new File("nombredis.txt");
        {
            try {
                leer = new FileReader(archivo);
                almacenamiento = new BufferedReader(leer);
                cadena="";
             
                
                while(cadena!=null){
                    try {
                       
                        cadena=almacenamiento.readLine();
                        correo = cadena;
                       
                        
                        cadena=almacenamiento.readLine();
                        nombreDis = cadena;
                       
                        cadena=almacenamiento.readLine();
                        visible = cadena;
                        
                        cadena=almacenamiento.readLine();
                        estado = cadena;
                        
                        
                        if(cadena!=null){
                          System.out.println(visible);
                            System.out.println(correo);
                             
                            
                           
                        }
                        
                      
                      
                        
                    } catch (IOException ex) {
                        Logger.getLogger(Practica1.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }
                
                  
                        System.out.println("Seleccione el registro del nombre del dispositivo para Administrar ");
                        auric = in.nextInt();
                        
                        
                         System.out.println("Exitoso");
                         
                try {
                    almacenamiento.close();
                    leer.close();
                } catch (IOException ex) {
                    Logger.getLogger(Practica1.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Practica1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                        
                            
                    
                     break;  
                      
                     
                     
                       case 4:
                        
                        System.out.println("Smartphone");
                        
                        archivo = new File("nombredis.txt");
        {
            try {
                leer = new FileReader(archivo);
                almacenamiento = new BufferedReader(leer);
                cadena="";
             
                
                while(cadena!=null){
                    try {
                       
                        cadena=almacenamiento.readLine();
                        correo = cadena;
                       
                        
                        cadena=almacenamiento.readLine();
                        nombreDis = cadena;
                       
                        cadena=almacenamiento.readLine();
                        visible = cadena;
                        
                        cadena=almacenamiento.readLine();
                        estado = cadena;
                        
                        
                        if(cadena!=null){
                          System.out.println(visible);
                            System.out.println(correo);
                             
                            
                           
                        }
                        
                      
                      
                        
                    } catch (IOException ex) {
                        Logger.getLogger(Practica1.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }
                
                  
                        System.out.println("Seleccione el registro del nombre del dispositivo para Administrar ");
                        auric = in.nextInt();
                        
                        
                         System.out.println("Exitoso");
                         
                try {
                    almacenamiento.close();
                    leer.close();
                } catch (IOException ex) {
                    Logger.getLogger(Practica1.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Practica1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                        
                            
                    
                     break;  
                }
                
                
         
       
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                 case 3:   
                
                 System.out.println("Acciones con Dispositivos");
                System.out.println("------------------");
                System.out.println("1- Computadora portátil");
                System.out.println("2- Tablet");
                System.out.println("3- SmartWatch");
                System.out.println("4- Smartphone");
                System.out.println("5- Auriculares inalámbricos");
                System.out.println("Selelccione tipo de dispositivo a administrar: ");
                accionesDis = in.nextInt();
                
                switch(accionesDis) {
                    case 1:
                        
                        System.out.println("Computadora portatil");
                        
                        
                         System.out.println("Tomar fotografía");
                         System.out.println("Copiar Texto");
                         System.out.println("Pegar texto");
                         System.out.println("Tomar Compartir Documentos");
                         System.out.println("Reproducir música");
                         System.out.println("Selelccione las Acciones de Dispositivos: ");
                         AD = in.nextInt();
                         
                         
                         if(AD == 1){
                             System.out.println("Foto tomada");
                         } if(AD ==2){
                        System.out.println("Copiar texto");
                    }
                        if(AD ==3){
                        System.out.println("Pegar Texto");
                    }
                            
                    if(AD ==4){
                        System.out.println("Compartir Documentos");
                    }
                    
                     if(AD ==4){
                        System.out.println("Reproducir Musica");
                    }
                     break;  
                     
                     
                     
                     
                      case 2:
                        
                        System.out.println("Tablet");
                        
              
                        
                        
                         System.out.println("Tomar fotografía");
                         System.out.println("Copiar Texto");
                         System.out.println("Pegar texto");
                         System.out.println("Tomar Compartir Documentos");
                         System.out.println("Reproducir música");
                         System.out.println("Selelccione las Acciones de Dispositivos: ");
                         AD = in.nextInt();
                         
                         
                         if(AD == 1){
                             System.out.println("Foto tomada");
                         } if(AD ==2){
                        System.out.println("Copiar texto");
                    }
                        if(AD ==3){
                        System.out.println("Pegar Texto");
                    }
                            
                    if(AD ==4){
                        System.out.println("Compartir Documentos");
                    }
                    
                     if(AD ==4){
                        System.out.println("Reproducir Musica");
                    }
                        
                            
                    
                     break;   
                     
                     
                     
                     
                       case 3:
                        
                      System.out.println("Smartwatch");
                        
              
                        
                        
                         System.out.println("Tomar fotografía");
                         System.out.println("Copiar Texto");
                         System.out.println("Reproducir música");
                         System.out.println("Selelccione las Acciones de Dispositivos: ");
                         AD = in.nextInt();
                         
                         
                         if(AD == 1){
                             System.out.println("Foto tomada");
                         } if(AD ==2){
                        System.out.println("Copiar texto");
                    }
                      
                    
                     if(AD ==4){
                        System.out.println("Reproducir Musica");
                    }
                        
                            
                    
                     break;  
                      
                     
                     
                       case 4:
                        
                     System.out.println("Tomar fotografía");
                         System.out.println("Copiar Texto");
                         System.out.println("Pegar texto");
                         System.out.println("Tomar Compartir Documentos");
                         System.out.println("Reproducir música");
                         System.out.println("Selelccione las Acciones de Dispositivos: ");
                         AD = in.nextInt();
                         
                         
                         if(AD == 1){
                             System.out.println("Foto tomada");
                         } if(AD ==2){
                        System.out.println("Copiar texto");
                    }
                        if(AD ==3){
                        System.out.println("Pegar Texto");
                    }
                            
                    if(AD ==4){
                        System.out.println("Compartir Documentos");
                    }
                    
                     if(AD ==4){
                        System.out.println("Reproducir Musica");
                    }
                        
                            
                    
                     break;  
                }
                
                
            break;    
                
                    default:
                System.out.println("la opción no existe");
                break;
       
        }

        // TODO code application logic here
    }

}
