package com.example.Relaciones.Model;


import jakarta.persistence.*;

@Entity
public class ControlRiego {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tipoRiego;
    private String frecuencia;

    @OneToOne(mappedBy = "controlRiego", cascade = CascadeType.ALL)
    private CosechaCultivo cosechaCultivo;


    public ControlRiego() {}

    public ControlRiego(Long id, String tipoRiego, String frecuencia, CosechaCultivo cosechaCultivo) {
        this.id = id;
        this.tipoRiego = tipoRiego;
        this.frecuencia = frecuencia;
        this.cosechaCultivo = cosechaCultivo;
    }


    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTipoRiego() { return tipoRiego; }
    public void setTipoRiego(String tipoRiego) { this.tipoRiego = tipoRiego; }

    public String getFrecuencia() { return frecuencia; }
    public void setFrecuencia(String frecuencia) { this.frecuencia = frecuencia; }

    public CosechaCultivo getCosechaCultivo() { return cosechaCultivo; }
    public void setCosechaCultivo(CosechaCultivo cosechaCultivo) { this.cosechaCultivo = cosechaCultivo; }


    @Override
    public String toString() {
        return "ControlRiego{id=" + id + ", tipoRiego='" + tipoRiego + "', frecuencia='" + frecuencia + "'}";
    }
}
