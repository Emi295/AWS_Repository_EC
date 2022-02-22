package com.api.apirestSpringboot.entity;

import javax.persistence.*;
import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
@Table (name = "users")
@Data
@NoArgsConstructor
//@RequiredArgsConstructor
public class User implements Serializable {

    private static final long serialVersionUID= 9069060843698080433L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50)
    private String name;
    private String surname;

    @Column(nullable = false,length = 50,unique = true)
    private String email;
    private Boolean estado;

    private String imagenPath;
    private String cedPath;

    @Transient
    private String cedUrl;

    @Transient
    private String imagenUrl;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public String getImagenPath() {
        return imagenPath;
    }

    public void setImagenPath(String imagenPath) {
        this.imagenPath = imagenPath;
    }

    public String getCedPath() {
        return cedPath;
    }

    public void setCedPath(String cedPath) {
        this.cedPath = cedPath;
    }

    public String getCedUrl() {
        return cedUrl;
    }

    public void setCedUrl(String cedUrl) {
        this.cedUrl = cedUrl;
    }

    public String getImagenUrl() {
        return imagenUrl;
    }

    public void setImagenUrl(String imagenUrl) {
        this.imagenUrl = imagenUrl;
    }
}
