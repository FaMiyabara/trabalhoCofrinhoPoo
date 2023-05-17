package trabalho;

import java.util.Objects;

public class Euro extends Moeda {
	
    public Euro(double valor) {
        super(valor);
    }

    @Override
    public void info() {
        System.out.println("Euro: "+valor);

    }
    int valorReal;

    @Override
    public double converter() {
    	return this.valor*5.49;//cotação do dia
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
		Euro other = (Euro) obj;
		return valorReal == other.valorReal;
	}
    
}
