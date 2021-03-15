/*******************************************************************************

 * 2021, All rights reserved.
 *******************************************************************************/
package problema1;

// Start of user code (user defined imports)

// End of user code


public class calzado {
	public calzado(int clave, String material, String troquel, int canProdxDia, String colores) {
		super();
		this.clave = clave;
		this.material = material;
		this.troquel = troquel;
		this.canProdxDia = canProdxDia;
		this.colores = colores;
	}

	/**
	 * Description of the property clave.
	 */
	public int clave = 0;

	/**
	 * Description of the property material.
	 */
	public String material = "";

	/**
	 * Description of the property troquel.
	 */
	public String troquel = "";

	/**
	 * Description of the property canProdxDia.
	 */
	public int canProdxDia = 0;

	/**
	 * Description of the property colores.
	 */
	public String colores = "";

	// Start of user code (user defined attributes for calzado)

	// End of user code

	/**
	 * The constructor.
	 */
	public calzado() {
		// Start of user code constructor for calzado)
		super();
		// End of user code
	}

	/**
	 * Description of the method costoxLote.
	 * @param costoxUnidad 
	 */
	public float costoxLote(double costoxUnidad) {
		return (float)(this.canProdxDia*costoxUnidad);
		
	}

	
	public int getClave() {
		return this.clave;
	}

	/**
	 * Sets a value to attribute clave. 
	 * @param newClave 
	 */
	public void setClave(int newClave) {
		this.clave = newClave;
	}

	/**
	 * Returns material.
	 * @return material 
	 */
	public String getMaterial() {
		return this.material;
	}

	/**
	 * Sets a value to attribute material. 
	 * @param newMaterial 
	 */
	public void setMaterial(String newMaterial) {
		this.material = newMaterial;
	}

	/**
	 * Returns troquel.
	 * @return troquel 
	 */
	public String getTroquel() {
		return this.troquel;
	}

	/**
	 * Sets a value to attribute troquel. 
	 * @param newTroquel 
	 */
	public void setTroquel(String newTroquel) {
		this.troquel = newTroquel;
	}

	/**
	 * Returns canProdxDia.
	 * @return canProdxDia 
	 */
	public int getCanProdxDia() {
		return this.canProdxDia;
	}

	/**
	 * Sets a value to attribute canProdxDia. 
	 * @param newCanProdxDia 
	 */
	public void setCanProdxDia(int newCanProdxDia) {
		this.canProdxDia = newCanProdxDia;
	}

	/**
	 * Returns colores.
	 * @return colores 
	 */
	public String getColores() {
		return this.colores;
	}

	/**
	 * Sets a value to attribute colores. 
	 * @param newColores 
	 */
	public void setColores(String newColores) {
		this.colores = newColores;
	}

	@Override
	public String toString() {
		return "calzado [clave=" + clave + ", material=" + material + ", troquel=" + troquel + ", canProdxDia="
				+ canProdxDia + ", colores=" + colores + "]";
	}

}
