package App;

public class POO_Carrera {
	private String Nom_Car;
	private double Tim1;
	private double Tim2;
	private double Tim3;
	private double Total;
	private double Promedio;

	public POO_Carrera(String Nom_Car, double Tim1, double Tim2, double Tim3,double Total, double Promedio) {
		this.Nom_Car = Nom_Car;
		this.Tim1 = Tim1;
		this.Tim2 = Tim2;
		this.Tim3 = Tim3;
		this.Total = Total;
		this.Promedio = Promedio;
	}

	public double getTotal() {
		return Total;
	}

	public void setTotal(double total) {
		Total = total;
	}

	public String getNom_Car() {
		return Nom_Car;
	}

	public void setNom_Car(String nom_Car) {
		Nom_Car = nom_Car;
	}

	public double getTim1() {
		return Tim1;
	}

	public void setTim1(double tim1) {
		Tim1 = tim1;
	}

	public double getTim2() {
		return Tim2;
	}

	public void setTim2(double tim2) {
		Tim2 = tim2;
	}

	public double getTim3() {
		return Tim3;
	}

	public void setTim3(double tim3) {
		Tim3 = tim3;
	}

	public double getPromedio() {
		return Promedio;
	}

	public void setPromedio(double promedio) {
		Promedio = promedio;
	}

}
