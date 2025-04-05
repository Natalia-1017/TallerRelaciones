package com.example.Relaciones.Model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class VariedadPlantas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String descripcion;

    @OneToMany(mappedBy = "variedad", cascade = CascadeType.ALL)
    private List<Planta> plantas;

    @ManyToMany
    @JoinTable(
            name = "variedad_fertilizacion",
            joinColumns = @JoinColumn(name = "variedad_id"),
            inverseJoinColumns = @JoinColumn(name = "fertilizacion_id")
    )
    private List<Fertilizaciones> fertilizaciones;

    public VariedadPlantas() {}

    public VariedadPlantas(Long id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Planta> getPlantas() {
        return plantas;
    }

    public void setPlantas(List<Planta> plantas) {
        this.plantas = plantas;
    }

    public List<Fertilizaciones> getFertilizaciones() {
        return fertilizaciones;
    }

    public void setFertilizaciones(List<Fertilizaciones> fertilizaciones) {
        this.fertilizaciones = fertilizaciones;
    }

    @Override
    public String toString() {
        return "VariedadPlantas{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", plantas=" + plantas +
                ", fertilizaciones=" + fertilizaciones +
                '}';
    }
}
