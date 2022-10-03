package com.mycompany.raicescuadraticas;

import java.util.Scanner;
import java.text.DecimalFormat;

public class base {
	double a;
	double b;
	double c;
	double raiz1 =0;
	double	raiz2=0;
	Scanner lectura = new Scanner (System.in);
/*
 * comprovador de numeros
 * */
public boolean comprobar_num(String a) {
	try {
		Double.parseDouble(a);
		return true;}
	catch(NumberFormatException nfe){
		System.out.println("Dato erroneo ingresar un numero permitido");
		return false;}
}
public void constructor(){
	String cadena;
	do{
	do {
		System.out.println("Ingresar valor 1 (el valor debe ser diferente de 0)");
		cadena=lectura.next();
	}while(!comprobar_num(cadena));}
	while(Double.parseDouble(cadena)==0);
	 a = Double.parseDouble(cadena);
		do {
			System.out.println("Ingresar valor 2");
			cadena=lectura.next();
		}while(!comprobar_num(cadena));
	 b = Double.parseDouble(cadena);
		do {
			System.out.println("Ingresar valor 3");
			cadena=lectura.next();
		}while(!comprobar_num(cadena));
	 c = Double.parseDouble(cadena);
	}




public double discriminante(double a1,double b1,double c1) {
	double r;
	r= ((Math.pow(b1,2))-(4*a1*c1));
	return r;	
}

public void raices(double a1,double b1,double c1) {
	double disc= discriminante(a1, b1, c1);
	if(disc<0){
		raiz1=(b1+Math.sqrt(disc*-1))/(2*a);
		raiz2=(b1-Math.sqrt(disc*-1))/(2*a);
	}else{
		raiz1=(b1+Math.sqrt(disc))/(2*a);
		raiz2=(b1-Math.sqrt(disc))/(2*a);
	}
		
}

public void resultado(double a1,double b1,double c1) {
	double disc= discriminante(a1, b1, c1);
	DecimalFormat decimal=new DecimalFormat ("#.####");
	if(disc<0){
		System.out.println("x1="+decimal.format(raiz1)+" i  	x2="+decimal.format(raiz2)+" i");
	}else{
		System.out.println("x1="+decimal.format(raiz1)+"  	x2="+decimal.format(raiz2));
	}
}



}