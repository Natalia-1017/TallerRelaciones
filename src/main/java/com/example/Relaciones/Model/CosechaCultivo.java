package com.example.Relaciones.Model;


import jakarta.persistence.*;

@Entity
public class CosechaCultivo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fecha;
    private Double cantidad;

    @OneToOne
    @JoinColumn(name = "control_riego_id")
    private ControlRiego controlRiego;


    public CosechaCultivo() {}


    public CosechaCultivo(Long id, String fecha, Double cantidad, ControlRiego controlRiego) {
        this.id = id;
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.controlRiego = controlRiego;
    }


    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }

    public Double getCantidad() { return cantidad; }
    public void setCantidad(Double cantidad) { this.cantidad = cantidad; }

    public ControlRiego getControlRiego() { return controlRiego; }
    public void setControlRiego(ControlRiego controlRiego) { this.controlRiego = controlRiego; }


    @Override
    public String toString() {
        return "CosechaCultivo{id=" + id + ", fecha='" + fecha + "', cantidad=" + cantidad + "}";
    }
}
