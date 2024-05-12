package com.project.seminario.Events;

public class User {

    private int registration;
    private String course;
    private String password;
    private String name;
    private String email;

    public User(int registration, String course, String password, String name, String email) {
        this.registration = registration;
        this.course = course;
        this.password = password;
        this.name = name;
        this.email = email;
    }

    public int getMatricula() {
        return registration;
    }

    public void setMatricula(int matricula) {
        this.registration = matricula;
    }

    public String getCurso() {
        return course;
    }

    public void setCurso(String curso) {
        this.course = curso;
    }

    public String getSenha() {
        return password;
    }

    public void setSenha(String senha) {
        this.password = senha;
    }

    public String getNome() {
        return name;
    }

    public void setNome(String nome) {
        this.name = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
