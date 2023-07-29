package App;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Inicio_POO {
    public static void main(String[] args) {
        int Num_Car, i = 0;
        double Tim1, Tim2, Tim3, Total, Conv, Promedio;
        String Nom_Car;
        Scanner Entrada = new Scanner(System.in);
        List<POO_Carrera> promediosCarros = new ArrayList<>();

        System.out.println("Bienvenido al calculador de la velocidad promedio");
        System.out.println("Datos: ");
        System.out.println("Pista de carrera es de 30km ");
        System.out.println("Numero de vueltas son 3");
        System.out.println(" ");
        System.out.println("Ingrese la cantidad de carros que compitieron");
        Num_Car = Entrada.nextInt();
        Entrada.nextLine();

        if (Num_Car > 0) {
            while (i < Num_Car) {

                System.out.println("Ingrese numero de carro");
                Nom_Car = Entrada.nextLine();
                System.out.println("El tiempo es en minutos y se ingresa (2.00)");
                System.out.println(" ");
                System.out.println("Ingrese el tiempo de la primera vuelta");
                Tim1 = Entrada.nextDouble();
                System.out.println("Ingrese el tiempo de la segunda vuelta");
                Tim2 = Entrada.nextDouble();
                System.out.println("Ingrese el tiempo de la tercera vuelta");
                Tim3 = Entrada.nextDouble();
                System.out.println("--------------------");
                Total = Tim1 + Tim2 + Tim3;
                Conv = 90 / Total;
                Promedio = Conv * 60;

                POO_Carrera Datos = new POO_Carrera(Nom_Car, Tim1, Tim2, Tim3, Total, Promedio);
                promediosCarros.add(Datos);

                i++;
                Entrada.nextLine(); 
            }
        }

       
        System.out.println("\nResultados:");
        for (POO_Carrera carro : promediosCarros) {
            System.out.println("Carro: " + carro.getNom_Car());
            System.out.println("Promedio de velocidad: " + carro.getPromedio() + " km/h");
            System.out.println("--------------------");
        }
    }
}