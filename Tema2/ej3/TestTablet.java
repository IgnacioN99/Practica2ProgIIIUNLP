package ej3;

public class TestTablet {

	public static void main(String[] args) {
			Tablet t[]=new Tablet[2];
			Tablet t1=new Tablet();
			t1.setCosto(40000);
			t1.setMarca("Alcatel");
			t1.setModelo("algun modelo rancio de esa marca de mierda");
			t1.setPulgadas(15);
			t1.setSO("WINDOWS PHONE");
			t[0]=t1;
			Tablet t2=new Tablet();
			t2=t1;
			t[1]=t2;
			for (Tablet tablet : t) {
				System.out.println(tablet.devolverDatos()+"\n");
			}

	}

}
