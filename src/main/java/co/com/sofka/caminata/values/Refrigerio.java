package co.com.sofka.caminata.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Refrigerio implements ValueObject<Refrigerio.Properties> {
    private final String nombreRefrigerio;
    private final String nombreBebida;

    public Refrigerio(String nombreRefrigerio, String nombreBebida) {
        this.nombreRefrigerio = Objects.requireNonNull(nombreRefrigerio);
        this.nombreBebida = Objects.requireNonNull(nombreBebida);
        if (nombreRefrigerio.isBlank()){
            throw new IllegalArgumentException("El nombre del refrigerio no puede estar vacio");
        }

        if (nombreBebida.isBlank()){
            throw new IllegalArgumentException("El nombre de la bebida no puede estar vacio");
        }
    }

    public interface Properties {
        String nombreRefrigerio();
        String nombreBebida();
    }

    @Override
    public Properties value(){
        return new Properties(){

            @Override
            public String nombreRefrigerio() {
                return nombreRefrigerio;
            }

            @Override
            public String nombreBebida(){
                return nombreBebida;
            }
        };
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Refrigerio that = (Refrigerio) o;
        return Objects.equals(nombreRefrigerio, that.nombreRefrigerio) && Objects.equals(nombreBebida, that.nombreBebida);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombreRefrigerio, nombreBebida);
    }
}
