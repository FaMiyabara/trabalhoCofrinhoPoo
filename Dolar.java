package trabalho;

import java.util.Objects;

public class Dolar extends Moeda {

    public Dolar(double valor) {
        super(valor);
    }

    @Override
    public void info() {
        System.out.println("Dolar: " + valor);
    }
    int valorReal;
    @Override
    public double converter() {
    	return this.valor*4.99;//cotação do dia
  
    
    	
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(valorReal);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dolar other = (Dolar) obj;
		return valorReal == other.valorReal;
	}
    
}
