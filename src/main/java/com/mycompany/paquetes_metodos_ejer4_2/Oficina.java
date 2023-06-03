
package com.mycompany.paquetes_metodos_ejer4_2;

public class Oficina extends Local {
    protected static double valorArea = 3500000;
    protected boolean esGobierno;

public Oficina(int identificadorInmobiliario, int área, String
        dirección, tipo tipoLocal, boolean esGobierno) {
    super(identificadorInmobiliario, área, dirección, tipoLocal);
    this.esGobierno = esGobierno;
}
void imprimir() {
    super.imprimir(); // Invoca al método imprimir de la clase padre
    System.out.println("Es oficina gubernamental = " + esGobierno);
    System.out.println();
}
}
