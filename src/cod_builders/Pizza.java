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
public class Pizza {
    private float grHarina,mlAgua,grSal,mlAceite,grTomate,grQueso,grPinha;
    private String tipoAceite,tipoQueso;

    public Pizza(float grHarina, float mlAgua, float grSal, float mlAceite, float grTomate, float grQueso, float grPinha, String tipoAceite, String tipoQueso) {
        this.grHarina = grHarina;
        this.mlAgua = mlAgua;
        this.grSal = grSal;
        this.mlAceite = mlAceite;
        this.grTomate = grTomate;
        this.grQueso = grQueso;
        this.grPinha = grPinha;
        this.tipoAceite = tipoAceite;
        this.tipoQueso = tipoQueso;
    }

    public float getGrHarina() {
        return grHarina;
    }

    public void setGrHarina(float grHarina) {
        this.grHarina = grHarina;
    }

    public float getMlAgua() {
        return mlAgua;
    }

    public void setMlAgua(float mlAgua) {
        this.mlAgua = mlAgua;
    }

    public float getGrSal() {
        return grSal;
    }

    public void setGrSal(float grSal) {
        this.grSal = grSal;
    }

    public float getMlAceite() {
        return mlAceite;
    }

    public void setMlAceite(float mlAceite) {
        this.mlAceite = mlAceite;
    }

    public float getGrTomate() {
        return grTomate;
    }

    public void setGrTomate(float grTomate) {
        this.grTomate = grTomate;
    }

    public float getGrQueso() {
        return grQueso;
    }

    public void setGrQueso(float grQueso) {
        this.grQueso = grQueso;
    }

    public float getGrPinha() {
        return grPinha;
    }

    public void setGrPinha(float grPinha) {
        this.grPinha = grPinha;
    }

    public String getTipoAceite() {
        return tipoAceite;
    }

    public void setTipoAceite(String tipoAceite) {
        this.tipoAceite = tipoAceite;
    }

    public String getTipoQueso() {
        return tipoQueso;
    }

    public void setTipoQueso(String tipoQueso) {
        this.tipoQueso = tipoQueso;
    }

    @Override
    public String toString() {
        return "Pizza=" + "grHarina=" + grHarina + ", mlAgua=" + mlAgua + ", grSal=" + grSal + ", mlAceite=" + mlAceite + ", grTomate=" + grTomate + ", grQueso=" + grQueso + ", grPinha=" + grPinha + ", tipoAceite=" + tipoAceite + ", tipoQueso=" + tipoQueso;
    }
    
    
}
