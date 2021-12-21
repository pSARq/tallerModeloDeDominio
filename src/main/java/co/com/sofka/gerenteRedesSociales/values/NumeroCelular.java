package co.com.sofka.gerenteRedesSociales.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NumeroCelular implements ValueObject<String> {
    private final String numero;

    public NumeroCelular(String numero) {
        this.numero = Objects.requireNonNull(validarNumero(numero));
    }

    private String validarNumero(String numero){
        if (numero.length() != 10){
            throw new IllegalArgumentException("El número debe contener 10 digitos");
        }
        return numero;
    }

    public String value() {
        return numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NumeroCelular that = (NumeroCelular) o;
        return Objects.equals(numero, that.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero);
    }
}
