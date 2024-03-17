/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Luis Sazo
 */
public class Empleado extends Persona{
    
    private String codigo_empleado;
    private String puesto;
    
    public Empleado(){
        
    }
    public Empleado(String codigo_empleado, String puesto, String nombres, String apellidos, String direccion, String fechaDeNacimiento, String numeroDeTelefono){
        super(nombres, apellidos, direccion, fechaDeNacimiento, numeroDeTelefono);
        this.codigo_empleado = codigo_empleado;
        this.puesto = puesto;
    }

    public String getCodigo_empleado() {
        return codigo_empleado;
    }

    public void setCodigo_empleado(String codigo_empleado) {
        this.codigo_empleado = codigo_empleado;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    
    
}
