package datos;

import java.time.LocalDate;

public class Pedido {
	
	private long idPedido;
	private LocalDate fechaPedido;
	private UnidadVenta unidadVenta;
	private Plato plato;
	private long cantidadPlato;
	
	public Pedido(){}
	
	public Pedido(LocalDate fechaPedido, UnidadVenta unidadVenta, Plato plato, long cantidadPlato) {
		super();
		this.fechaPedido = fechaPedido;
		this.unidadVenta = unidadVenta;
		this.plato = plato;
		this.cantidadPlato = cantidadPlato;
	}

	public long getIdPedido() {
		return idPedido;
	}

	protected void setIdPedido(long idPedido) {
		this.idPedido = idPedido;
	}

	public LocalDate getFechaPedido() {
		return fechaPedido;
	}

	public void setFechaPedido(LocalDate fechaPedido) {
		this.fechaPedido = fechaPedido;
	}

	public UnidadVenta getUnidadVenta() {
		return unidadVenta;
	}

	public void setUnidadVenta(UnidadVenta unidadVenta) {
		this.unidadVenta = unidadVenta;
	}

	public Plato getPlato() {
		return plato;
	}

	public void setPlato(Plato plato) {
		this.plato = plato;
	}

	public long getCantidadPlato() {
		return cantidadPlato;
	}

	public void setCantidadPlato(long cantidadPlato) {
		this.cantidadPlato = cantidadPlato;
	}

	@Override
	public String toString() {
		return "Pedido [idPedido=" + idPedido + ", fechaPedido=" + fechaPedido 
			+ ", unidadVenta=" + unidadVenta + ", plato=" + plato + ", cantidadPlato=" + cantidadPlato + "]";
		
	}
	
}
