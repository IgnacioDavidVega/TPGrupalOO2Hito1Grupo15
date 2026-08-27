package datos;

import java.time.LocalDate;

public class Pedido {
	
	private long idPedido;
	private LocalDate fechaPedido;
	private Festival festival;
	private UnidadVenta unidadVenta;
	private Plato plato;
	private long cantidadPlato;
	
	public Pedido(){}
	
	public Pedido(LocalDate fechaPedido, Festival festival, UnidadVenta unidadVenta, Plato plato, long cantidadPlato) {
		super();
		this.fechaPedido = fechaPedido;
		this.festival = festival;
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

	public Festival getFestival() {
		return festival;
	}

	public void setFestival(Festival festival) {
		this.festival = festival;
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
		return "Pedido [idPedido=" + idPedido + ", fechaPedido=" + fechaPedido + ", festival=" + festival
				+ ", unidadVenta=" + unidadVenta + ", plato=" + plato + ", cantidadPlato=" + cantidadPlato + "]";
	}
	
}
