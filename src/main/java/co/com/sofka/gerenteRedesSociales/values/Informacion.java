package co.com.sofka.gerenteRedesSociales.values;

import co.com.sofka.domain.generic.ValueObject;

import javax.xml.validation.Validator;
import java.util.Objects;

public class Informacion implements ValueObject<Informacion.Properties> {

    private final String nombreCompletoCliente;
    private final Email emailCliente;
    private final NumeroCelular numeroCelular;
    private final Identificacion identificacion;

    public Informacion(String nombreCompletoCliente, Email emailCliente, NumeroCelular numeroCelular, Identificacion identificacion) {
        this.nombreCompletoCliente = Objects.requireNonNull(validarNombre(nombreCompletoCliente));
        this.emailCliente = Objects.requireNonNull(emailCliente);
        this.numeroCelular = Objects.requireNonNull(numeroCelular);
        this.identificacion = Objects.requireNonNull(identificacion);
    }

    private String validarNombre(String nombreCompletoCliente){
        if (nombreCompletoCliente.isBlank()){
            throw new IllegalArgumentException("El nombre completo no puede estar vacio");
        }
        return nombreCompletoCliente;
    }

    public interface Properties{
        String nombreCompletoCliente();
        Email emailCliente();
        NumeroCelular numeroCelular();
        Identificacion identificacion();
    }

    public Properties value(){
        return new Properties() {
            @Override
            public String nombreCompletoCliente() {
                return nombreCompletoCliente;
            }

            @Override
            public Email emailCliente() {
                return emailCliente;
            }

            @Override
            public NumeroCelular numeroCelular() {
                return numeroCelular;
            }

            @Override
            public Identificacion identificacion() {
                return identificacion;
            }
        };
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Informacion that = (Informacion) o;
        return Objects.equals(nombreCompletoCliente, that.nombreCompletoCliente) && Objects.equals(emailCliente, that.emailCliente) && Objects.equals(numeroCelular, that.numeroCelular) && Objects.equals(identificacion, that.identificacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombreCompletoCliente, emailCliente, numeroCelular, identificacion);
    }
}
