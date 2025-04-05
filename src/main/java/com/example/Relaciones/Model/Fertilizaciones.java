package com.example.Relaciones.Model;


import jakarta.persistence.*;

@Entity
public class Fertilizaciones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tipoFertilizante;
    private String fechaAplicacion;

    @ManyToOne
    @JoinColumn(name = "variedad_id")
    private VariedadPlantas variedad;


    public Fertilizaciones() {}


    public Fertilizaciones(Long id, String tipoFertilizante, String fechaAplicacion, VariedadPlantas variedad) {
        this.id = id;
        this.tipoFertilizante = tipoFertilizante;
        this.fechaAplicacion = fechaAplicacion;
        this.variedad = variedad;
    }


    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTipoFertilizante() { return tipoFertilizante; }
    public void setTipoFertilizante(String tipoFertilizante) { this.tipoFertilizante = tipoFertilizante; }

    public String getFechaAplicacion() { return fechaAplicacion; }
    public void setFechaAplicacion(String fechaAplicacion) { this.fechaAplicacion = fechaAplicacion; }

    public VariedadPlantas getVariedad() { return variedad; }
    public void setVariedad(VariedadPlantas variedad) { this.variedad = variedad; }


    @Override
    public String toString() {
        return "Fertilizaciones{id=" + id + ", tipoFertilizante='" + tipoFertilizante + "', fechaAplicacion='" + fechaAplicacion + "'}";
    }
}
