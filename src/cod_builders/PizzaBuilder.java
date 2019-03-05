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
public class PizzaBuilder {
    private float grHarina,mlAgua,grSal,mlAceite,grTomate,grQueso,grPinha;
    private String tipoAceite,tipoQueso;
    
    public PizzaBuilder(float grHarina,float mlAgua){
    this.grHarina =grHarina;
    this.mlAgua= mlAgua;
    }
    public PizzaBuilder setgrSal(float grSal){ //el return this es para meterle un setter al constructor
    this.grSal=grSal;
    return this;
    }
    public PizzaBuilder setmlAgua(float mlAgua){
    this.mlAgua=mlAgua;
    return this;
    }
    public PizzaBuilder setgrHaria(float grHarina){ //el return this es para meterle un setter al constructor
    this.grHarina=grHarina;
    return this;
    }
    public PizzaBuilder setmlAceite(float mlAceite){ //el return this es para meterle un setter al constructor
    this.mlAceite=mlAceite;
    return this;
    }
    
    public PizzaBuilder setgrTomate(float grTomate){ //el return this es para meterle un setter al constructor
    this.grTomate=grTomate;
    return this;
    }
    public PizzaBuilder setgrQueso(float grQueso){ //el return this es para meterle un setter al constructor
    this.grQueso=grQueso;
    return this;
    }
    public PizzaBuilder setgrPinha(float grPinha){ //el return this es para meterle un setter al constructor
    this.grPinha=grPinha;
    return this;
    }
    public PizzaBuilder setTipoAceite(String tipoAceite){ //el return this es para meterle un setter al constructor
    this.tipoAceite=tipoAceite;
    return this;
}
    public PizzaBuilder setTipoQueso(String tipoQueso){ //el return this es para meterle un setter al constructor
    this.tipoQueso=tipoQueso;
    return this;
}
    public Pizza createPizza(){
    return new Pizza(this.grHarina,this.mlAgua,this.grSal,this.mlAceite,this.grTomate,this.grQueso,this.grPinha,this.tipoAceite,this.tipoQueso);
    }
}
