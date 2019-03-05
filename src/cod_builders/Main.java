/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cod_builders;

/**
 *
 * @author Samuel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Pizza miPizzaHawaiana= new PizzaBuilder(3,4).setgrPinha(4).setTipoAceite("Oliva").setgrQueso(9).setTipoQueso("Gouda").createPizza(); //creamos el objeto con el nombre de la pizza que queremos y le damos los 2 parametros obligatorios
        System.out.println(miPizzaHawaiana);  // Con los setter que creamos en PizzaBuilder añadiendo con puntos al constructor y al final el metodo de crear la pizza ya tenemos la pizza que queremos
    } //Hay que añadir el to Strig para hacer eso
    
}
