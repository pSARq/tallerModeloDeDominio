package co.com.sofka.caminata.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class RegaloSorpresa implements ValueObject<String> {

    private final String value;

    public RegaloSorpresa(String nombre) {
        this.value = Objects.requireNonNull(nombre);
        if (nombre.isBlank()){
            throw new IllegalArgumentException("El nombre del regalo sorpresa no puede estar vacio");
        }
    }

    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RegaloSorpresa that = (RegaloSorpresa) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
