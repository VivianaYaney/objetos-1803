/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imc;

/**
 *
 * @author Viviana
 */
public class Imc {
  private Usuario usuario;
    public float masa(){
        // Este metodo tiene lógica
        float resultado= (usuario.getPeso()/(usuario.getAltura()*usuario.getAltura()));
        return resultado;
    }

      public Usuario getUsuario(){
          return usuario;
}

    public void setUsuario(Usuario usuario) {
        this.usuario= usuario;
    }
    
}
