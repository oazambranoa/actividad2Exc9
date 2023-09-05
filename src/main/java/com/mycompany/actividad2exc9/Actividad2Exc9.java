/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad2exc9;

/**
 *
 * @author omarz
 */
/*Enunciado
    Ejercicio resuelto Nº 14
Una empresa con tres departamentos tiene establecido un plan de incentivos para sus
vendedores. Al final del período, a cada departamento se le pide el importe global de las
ventas. A los departamentos que excedan el 33% de las ventas totales se les adiciona al
salario de los vendedores un porcentaje equivalente al 20% del salario mensual. Las
nóminas de los tres departamentos son iguales. Si se tienen los siguientes datos:
• Ventas del departamento 1
• Ventas del departamento 2
• Ventas del departamento 3
• Salario de los vendedores de cada departamento 
Hacer un algoritmo que determine cuánto recibirán los vendedores de cada departamento
al finalizar el período.
*/

import java.util.Scanner;

public class Actividad2Exc9 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        double slsDp1, slsDp2, slsDp3, vendorsSalary, totalSales, fracSales, salDp1, salDp2, salDp3, salVnd;
        
        System.out.println("Ingrese las ventas del departamento 1: ");
        slsDp1 = scanner.nextDouble();
        
        System.out.println("Ingrese las ventas del departamento 2: ");
        slsDp2 = scanner.nextDouble();
        
        System.out.println("Ingrese las ventas del departamento 3: ");
        slsDp3 = scanner.nextDouble();
        
        System.out.println("Ingrese el salario de los vendedores: ");
        salVnd = scanner.nextDouble();
        
        totalSales = slsDp1 + slsDp2 + slsDp3;
        
        fracSales = 0.33 * totalSales;
        
        if (slsDp1 > fracSales){
            salDp1 = salVnd + 0.2 * salVnd;
        } else{
            salDp1 = salVnd;
        }
        
        if (slsDp2 > fracSales){
            salDp2 = salVnd + 0.2 * salVnd;
        } else{
            salDp2 = salVnd;
        }
        
        if (slsDp3 > fracSales){
            salDp3 = salVnd + 0.2 * salVnd;
        } else{
            salDp3 = salVnd;
        }
        
        System.out.println("El salario de del departamento 1 es: $" + salDp1 + ".  El salario del departamento 2 es : $" + salDp2 + ". El salario del departamento 3 es: $" + salDp3);
        
    }
}
