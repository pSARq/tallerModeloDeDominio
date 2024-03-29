package co.com.sofka.administracion.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Binoculares implements ValueObject<Binoculares.Properties> {

    private final int alcanceVision;
    private final int tamanoCm;
    private final int pesoKg;

    public Binoculares(int alcanceVision, int tamanoCm, int pesoKg){
        this.alcanceVision = Objects.requireNonNull(alcanceVision);
        this.tamanoCm = Objects.requireNonNull(tamanoCm);
        this.pesoKg = Objects.requireNonNull(pesoKg);
        if (isValoresIgualOMenorQue0()){
            throw new IllegalArgumentException("Las caracteristicas deben ser mayor a 0");
        }
    }

    private boolean isValoresIgualOMenorQue0() {
        return this.alcanceVision <= 0 || this.tamanoCm <= 0 || this.pesoKg <= 0;
    }

    public interface Properties{
        int alcanceVision();
        int tamanoCm();
        int pesoKg();
    }

    public Properties value(){
        return new Properties() {
            @Override
            public int alcanceVision() {
                return alcanceVision;
            }

            @Override
            public int tamanoCm() {
                return tamanoCm;
            }

            @Override
            public int pesoKg() {
                return pesoKg;
            }
        };
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Binoculares that = (Binoculares) o;
        return alcanceVision == that.alcanceVision && tamanoCm == that.tamanoCm && pesoKg == that.pesoKg;
    }

    @Override
    public int hashCode() {
        return Objects.hash(alcanceVision, tamanoCm, pesoKg);
    }
}
