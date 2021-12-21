package co.com.sofka.administracion.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Material implements ValueObject<String> {
    private final String value;

    public Material(String nombre) {
        this.value = Objects.requireNonNull(nombre);
        if (nombre.isBlank()){
            throw new IllegalArgumentException("El nombre del material no puede estar vacio");
        }
    }

    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Material material = (Material) o;
        return Objects.equals(value, material.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
