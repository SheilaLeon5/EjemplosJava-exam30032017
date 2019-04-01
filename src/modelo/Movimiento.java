package modelo;

public class Movimiento {
	String fechaHora;
	int idCuenta;
	float importe;
	char tipoMov;  // A | C
	

	
	// Constructores
	
	public Movimiento() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Movimiento(String fechaHora, int idCuenta, float importe, char tipoMov) {
		super();
		this.fechaHora = fechaHora;
		this.idCuenta = idCuenta;
		this.importe = importe;
		this.tipoMov = tipoMov;
	}
	


	public String getFechaHora() {
		return fechaHora;
	}
	public void setFechaHora(String fechaHora) {
		this.fechaHora = fechaHora;
	}
	public int getIdCuenta() {
		return idCuenta;
	}
	public void setIdCuenta(int idCuenta) {
		this.idCuenta = idCuenta;
	}
	public float getImporte() {
		return importe;
	}
	public void setImporte(float importe) {
		this.importe = importe;
	}
	public char getTipoMov() {
		return tipoMov;
	}
	public void setTipoMov(char tipoMov) {
		this.tipoMov = tipoMov;
	}
	
	
	
}
