package ejercicio5;

import java.util.Date;

public class Tienda {
    private String nombre;
    private String direccion;
    private Integer telefono;
    private TipoProducto tipoProducto;
    private Date fechaExpiracion;
    private String nombreFabricante;
    private Integer cantidadInventario;
    private Float precioUnitario;

    public Tienda(String nombre, String direccion, Integer telefono, TipoProducto tipoProducto, Date fechaExpiracion, String nombreFabricante, Integer cantidadInventario, Float precioUnitario) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.tipoProducto = tipoProducto;
        this.fechaExpiracion = fechaExpiracion;
        this.nombreFabricante = nombreFabricante;
        this.cantidadInventario = cantidadInventario;
        this.precioUnitario = precioUnitario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public TipoProducto getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(TipoProducto tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public Date getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(Date fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public String getNombreFabricante() {
        return nombreFabricante;
    }

    public void setNombreFabricante(String nombreFabricante) {
        this.nombreFabricante = nombreFabricante;
    }

    public Integer getCantidadInventario() {
        return cantidadInventario;
    }

    public void setCantidadInventario(Integer cantidadInventario) {
        this.cantidadInventario = cantidadInventario;
    }

    public Float getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Float precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
}
