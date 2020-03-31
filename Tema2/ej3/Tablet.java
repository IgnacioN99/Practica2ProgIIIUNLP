package ej3;

public class Tablet {
		private String Marca,SO,modelo;
		private double costo;
		private float pulgadas;
		public Tablet() {
			
		}
		public String getMarca() {
			return Marca;
		}
		public void setMarca(String marca) {
			Marca = marca;
		}
		public String getSO() {
			return SO;
		}
		public void setSO(String sO) {
			SO = sO;
		}
		public String getModelo() {
			return modelo;
		}
		public void setModelo(String modelo) {
			this.modelo = modelo;
		}
		public double getCosto() {
			return costo;
		}
		public void setCosto(double costo) {
			this.costo = costo;
		}
		public float getPulgadas() {
			return pulgadas;
		}
		public void setPulgadas(float pulgadas) {
			this.pulgadas = pulgadas;
		}
		public String devolverDatos() {
			return "Tablet de marca: "+getMarca()+ 
					"\nS.O.: "+getSO()+
					"\n Modelo: "+getModelo()+
					"\nPulgadas: " + getPulgadas()
					+"\nCosto $"+getCosto();
		}
		
}
