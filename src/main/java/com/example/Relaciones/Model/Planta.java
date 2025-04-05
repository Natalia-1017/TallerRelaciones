package com.example.Relaciones.Model;


import jakarta.persistence.*;

@Entity
public class Planta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String codigo;

    @ManyToOne
    @JoinColumn(name = "variedad_id")
    private VariedadPlantas variedad;


    public Planta() {}


    public Planta(Long id, String codigo, VariedadPlantas variedad) {
        this.id = id;
        this.codigo = codigo;
        this.variedad = variedad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public VariedadPlantas getVariedad() {
        return variedad;
    }

    public void setVariedad(VariedadPlantas variedad) {
        this.variedad = variedad;
    }


    @Override
    public String toString() {
        return "Planta{" +
                "id=" + id +
                ", codigo='" + codigo + '\'' +
                ", variedad=" + (variedad != null ? variedad.getNombre() : "null") +
                '}';
    }
}
