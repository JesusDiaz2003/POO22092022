/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.herencia;


public class EstudianteDeportistaArtista extends Persona implements Deportista,Artista{
    
    private String carrera;
    private String numeroCuenta;
    private String disciplinaDeportiva;
    private String generoArtistico;

    public EstudianteDeportistaArtista() {
    }

    public EstudianteDeportistaArtista(String carrera, String numeroCuenta, String disciplinaDeportiva, String generoArtistico) {
        this.carrera = carrera;
        this.numeroCuenta = numeroCuenta;
        this.disciplinaDeportiva = disciplinaDeportiva;
        this.generoArtistico = generoArtistico;
    }

    public String getGeneroArtistico() {
        return generoArtistico;
    }

    public void setGeneroArtistico(String generoArtistico) {
        this.generoArtistico = generoArtistico;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getDisciplinaDeportiva() {
        return disciplinaDeportiva;
    }

    public void setDisciplinaDeportiva(String disciplinaDeportiva) {
        this.disciplinaDeportiva = disciplinaDeportiva;
    }


    @Override
    public void entrenar() {
        System.out.println(this.nombre+"esta entrenando"+this.disciplinaDeportiva);
    }

    @Override
    public void jugar() {
        System.out.println(this.nombre + "esta jugando" + this.disciplinaDeportiva);

    }

    @Override
    public void ensayar() {
        System.out.println(this.nombre + " esta ensayando/practicando" + this.generoArtistico);

    }

    @Override
    public void presentar() {
        System.out.println(this.nombre + "esta presentando su obra de " + this.generoArtistico);

    }

    
    
}
