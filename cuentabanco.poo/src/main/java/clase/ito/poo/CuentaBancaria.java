/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package clase.ito.poo;

import java.time.LocalDate;

public class CuentaBancaria {
	public CuentaBancaria(long numCuenta, String nomCliente, float saldo, LocalDate fechaApertura) {
		super();
		this.numCuenta = numCuenta;
		this.nomCliente = nomCliente;
		Saldo = saldo;
		FechaApertura = fechaApertura;
	}

	
	public long numCuenta = 0L;

	/**
	 * Description of the property nomCliente.
	 */
	public String nomCliente = "";

	/**
	 * Description of the property Saldo.
	 */
	public float Saldo = 0F;

	/**
	 * Description of the property FechaApertura.
	 */
	public java.time.LocalDate FechaApertura = null;

	/**
	 * Description of the property FechaActualizacion.
	 */
	public java.time.LocalDate FechaActualizacion = null;

	// Start of user code (user defined attributes for CuentaBancaria)

	// End of user code

	/**
	 * The constructor.
	 */
	public CuentaBancaria() {
		// Start of user code constructor for CuentaBancaria)
		super();
		// End of user code
	}

	/**
	 * Description of the method deposito.
	 * @param cantidad 
	 */
	public boolean deposito(float cantidad) {
		boolean deposito=false;
		if(this.FechaApertura!=null){
			deposito=true;
			this.Saldo=Saldo+cantidad;
			this.FechaActualizacion=LocalDate.of(2021, 3, 28);
		}
		return deposito;
	}

	/**
	 * Description of the method retiro.
	 * @param cantidad 
	 */
	public boolean retiro(float cantidad) {
		boolean retiro=false;
		if(cantidad<this.Saldo) {
			this.Saldo=Saldo-cantidad;
			this.FechaActualizacion=LocalDate.of(2021,3,28);
			retiro=true;
		}
		
		return retiro;
	}

	// Start of user code (user defined methods for CuentaBancaria)

	// End of user code
	/**
	 * Returns numCuenta.
	 * @return numCuenta 
	 */
	public long getNumCuenta() {
		return this.numCuenta;
	}

	/**
	 * Sets a value to attribute numCuenta. 
	 * @param newNumCuenta 
	 */
	public void setNumCuenta(long newNumCuenta) {
		this.numCuenta = newNumCuenta;
	}

	/**
	 * Returns nomCliente.
	 * @return nomCliente 
	 */
	public String getNomCliente() {
		return this.nomCliente;
	}

	/**
	 * Sets a value to attribute nomCliente. 
	 * @param newNomCliente 
	 */
	public void setNomCliente(String newNomCliente) {
		this.nomCliente = newNomCliente;
	}

	/**
	 * Returns Saldo.
	 * @return Saldo 
	 */
	public float getSaldo() {
		return this.Saldo;
	}

	/**
	 * Sets a value to attribute Saldo. 
	 * @param newSaldo 
	 */
	public void setSaldo(float newSaldo) {
		this.Saldo = newSaldo;
	}

	/**
	 * Returns FechaApertura.
	 * @return FechaApertura 
	 */
	public java.time.LocalDate getFechaApertura() {
		return this.FechaApertura;
	}

	/**
	 * Sets a value to attribute FechaApertura. 
	 * @param newFechaApertura 
	 */
	public void setFechaApertura(java.time.LocalDate newFechaApertura) {
		this.FechaApertura = newFechaApertura;
	}

	/**
	 * Returns FechaActualizacion.
	 * @return FechaActualizacion 
	 */
	public java.time.LocalDate getFechaActualizacion() {
		return this.FechaActualizacion;
	}

	/**
	 * Sets a value to attribute FechaActualizacion. 
	 * @param newFechaActualizacion 
	 */
	public void setFechaActualizacion(java.time.LocalDate newFechaActualizacion) {
		this.FechaActualizacion = newFechaActualizacion;
	}

	@Override
	public String toString() {
		return "CuentaBancaria [numCuenta=" + numCuenta + ", nomCliente=" + nomCliente + ", Saldo=" + Saldo
				+ ", FechaApertura=" + FechaApertura + ", FechaActualizacion=" + FechaActualizacion + "]";
	}

}
