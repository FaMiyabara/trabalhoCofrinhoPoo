package trabalho;

import java.util.Objects;

public class Real extends Moeda {
	
    public Real(double valor) {
        super(valor);
    }
    @Override
    public void info() {
        System.out.println("Real: "+valor);

    }
    int valorReal;

   
    @Override
    public double converter() {
    	return this.valor;

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
		Real other = (Real) obj;
		return valorReal == other.valorReal;
	}
    



}

