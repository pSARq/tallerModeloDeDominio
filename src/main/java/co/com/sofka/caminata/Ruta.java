package co.com.sofka.caminata;

import co.com.sofka.caminata.values.IdRuta;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Ruta extends Entity<IdRuta> {

    private IdRuta idRuta;
    private int duracion;
    private int distanciaTotal;
    private int capacidadCarga;
    private String dificultad;

    public Ruta(IdRuta entityId, IdRuta idRuta, int duracion, int distanciaTotal, int capacidadCarga, String dificultad) {
        super(entityId);
        this.idRuta = idRuta;
        this.duracion = validarDuracion(duracion);
        this.distanciaTotal = validarDistancia(distanciaTotal);
        this.capacidadCarga = validarCapacidadCarga(capacidadCarga);
        this.dificultad = validarDificultad(dificultad);
    }

    //metodos para validar que las entradas sean correctas

    private String validarDificultad(String dificultad){
        if (isDificultadRutaValida(dificultad)){
            return dificultad;
        }
        throw new IllegalArgumentException("Dificultad de ruta invalida");
    }

    private boolean isDificultadRutaValida(String dificultad) {
        return dificultad == "Alta" || dificultad == "Media" || dificultad == "Baja";
    }

    private boolean isMayorAcero(int valor){
        return valor > 0;
    }

    private int validarDistancia(int distanciaTotal){
        if (isMayorAcero(distanciaTotal)){
            return distanciaTotal;
        }
        throw new IllegalArgumentException("Distancia total debe ser mayor a 0");
    }

    private int validarCapacidadCarga(int capacidadCarga){
        if (isMayorAcero(capacidadCarga)){
            return capacidadCarga;
        }
        throw new IllegalArgumentException("La capacidad de carga debe ser mayor a 0");
    }

    private int validarDuracion(int duracion){
        if (isMayorAcero(duracion)){
            return duracion;
        }
        throw new IllegalArgumentException("La duración debe ser mayor de 0");
    }

    //Metodos para modificar valores

    public void modificarDuracion(int duracion){
        this.duracion = Objects.requireNonNull(validarDuracion(duracion));
    }

    public void modificarDistanciaTotal(int distanciaTotal){
        this.distanciaTotal = Objects.requireNonNull(validarDistancia(distanciaTotal));
    }

    public void modificarCapacidadCarga(int capacidadCarga){
        this.capacidadCarga = Objects.requireNonNull(validarCapacidadCarga(capacidadCarga));
    }

    public void modificarDificultadRuta(String dificultad){
        this.dificultad = Objects.requireNonNull(validarDificultad(dificultad));
    }

    //metodos para obtener valores

    public IdRuta getIdRuta() {
        return idRuta;
    }

    public int getDuracion() {
        return duracion;
    }

    public int getDistanciaTotal() {
        return distanciaTotal;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public String getDificultad() {
        return dificultad;
    }
}
