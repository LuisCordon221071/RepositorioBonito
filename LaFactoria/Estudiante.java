public class Estudiante extends Usuario {

	@Override
	public void printMenu() {
		System.out.println("Bienvenido Alumno");
		System.out.println("Seleccione su opcion");
		System.out.println("1. Consultar nota");
		System.out.println("2. Realizar pago");
        System.out.println("3. Consultar pagos");
	}

	
}
