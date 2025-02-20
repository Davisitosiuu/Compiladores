/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package directorio;
import java.io.File;
import java.util.Scanner;

/**
 *
 * @author rivas
 */
public class Directorio {
    public static void main(String[] args) {
        File directorio = new File("C:\\Users\\rivas\\OneDrive\\Desktop\\COMPILADORES\\AYIYI");
        if(!directorio.exists()){
            if(directorio.mkdir()){
                System.out.println("Directorio creado");
            }else {
                System.out.println("Error mi fafa");
            }
        }else{
            System.out.println("El directorio ya existe");
        }       
    }
}
