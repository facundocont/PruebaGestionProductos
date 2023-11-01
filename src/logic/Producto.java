/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

/**
 *
 * @author facun
 */
public class Producto {
    private int codigoProducto;
    private String marca;
    private String descripcion;
    private float costo;
    private int porc_ganancia;
    private float precio;

    public Producto(int codigoProducto, String marca, String descripcion, float costo, int porc_ganancia) {
        this.codigoProducto = codigoProducto;
        this.marca = marca;
        this.descripcion = descripcion;
        this.costo = costo;
        this.porc_ganancia = porc_ganancia;
        this.precio = costo + (costo * porc_ganancia / 100);
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public String getMarca() {
        return marca;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public float getCosto() {
        return costo;
    }

    public int getPorc_ganancia() {
        return porc_ganancia;
    }

    public float getPrecio() {
        return precio;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public void setPorc_ganancia(int porc_ganancia) {
        this.porc_ganancia = porc_ganancia;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigoProducto=" + codigoProducto + ", marca=" + marca + ", descripcion=" + descripcion + ", costo=" + costo + ", porcentaje ganancia=" + porc_ganancia + ", precio=" + precio + '}';
    }
    
    
    
}
