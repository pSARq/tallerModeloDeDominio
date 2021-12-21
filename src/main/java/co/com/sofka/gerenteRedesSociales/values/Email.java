package co.com.sofka.gerenteRedesSociales.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Email implements ValueObject<String> {

    private final String direccionCorreo;

    public Email(String direccionCorreo) {
        this.direccionCorreo = Objects.requireNonNull(validarCorreo(direccionCorreo));
    }

    private String validarCorreo(String direccionCorreo){
        if (direccionCorreo.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")){
            return direccionCorreo;
        }
        throw new IllegalArgumentException("La dirección de correo no es valida");
    }

    public String value() {
        return direccionCorreo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Email email = (Email) o;
        return Objects.equals(direccionCorreo, email.direccionCorreo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(direccionCorreo);
    }
}
