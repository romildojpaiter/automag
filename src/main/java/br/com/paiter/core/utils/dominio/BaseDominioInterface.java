package br.com.paiter.core.utils.dominio;

public interface BaseDominioInterface<T> {
	
	public abstract String toString();
	public abstract String getLongDesc();
	public abstract Integer getOrdinal();
	public abstract String getName();
	public abstract String getDesc();
	public abstract Integer getSize();
	public abstract boolean isValido(int cdItemDominio);
	public abstract T valueOf(int ord);	

}
