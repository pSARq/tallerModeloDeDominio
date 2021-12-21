package co.com.sofka.gerenteRedesSociales.values;


import co.com.sofka.domain.generic.ValueObject;

import java.util.Arrays;
import java.util.Objects;
import java.util.Properties;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Identificacion implements ValueObject<Identificacion.Properties> {

    private final String nombre;
    private final String numeroIdentificacion;
    private final String tipoSangre;

    public Identificacion(String nombre, String numeroIdentificacion, String tipoSangre) {
        this.nombre = validarNombre(nombre);
        this.numeroIdentificacion = validarNumeroIdentificacion(numeroIdentificacion);
        this.tipoSangre = tipoSangre;
    }

    private String validarNombre(String nombre){
        if (nombre.isBlank()){
            throw new IllegalArgumentException("El nombre no puede estar vacio");
        }
        return nombre;
    }

    private String validarNumeroIdentificacion(String numeroIdentificacion){
        if (numeroIdentificacion.length() != 10){
            throw new IllegalArgumentException("El numero de la identificacion debe contener 10 digitos");
        }
        return numeroIdentificacion;
    }

    private String validarTipoSangre(String tipoSangre){
        if (isTipoSangreCorrecto(tipoSangre)){
            return tipoSangre;
        }
        throw new IllegalArgumentException("El tipo de sangre es incorrecto");
    }

    private boolean isTipoSangreCorrecto(String tipoSangre){
        String[] listaTiposSangre = new String[]{"A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-"};

        for (String tipo:listaTiposSangre) {
            if (tipo.equals(tipoSangre)){
                return true;
            }
        }
        return false;
    }

    public interface Properties{
        String nombre();
        String numeroIdentificacion();
        String tipoSangre();
    }

    public Properties value(){
        return new Properties() {
            @Override
            public String nombre() {
                return nombre;
            }

            @Override
            public String numeroIdentificacion() {
                return numeroIdentificacion;
            }

            @Override
            public String tipoSangre() {
                return tipoSangre;
            }
        };
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Identificacion that = (Identificacion) o;
        return Objects.equals(nombre, that.nombre) && Objects.equals(numeroIdentificacion, that.numeroIdentificacion) && Objects.equals(tipoSangre, that.tipoSangre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, numeroIdentificacion, tipoSangre);
    }
}
