package trabalho;

import java.util.Objects;

public abstract class Moeda {
    protected double  valor;

    Moeda(double valor) {
        this.valor = valor;
    }
    public abstract void  info();
    public  abstract double converter();
	@Override
	public int hashCode() {
		return Objects.hash(valor);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Moeda other = (Moeda) obj;
		return Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
	}
    

   
}