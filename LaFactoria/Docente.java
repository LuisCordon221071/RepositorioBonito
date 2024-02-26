public class Docente extends Usuario {

	@Override
	public void printMenu() {
		System.out.println("Bienvenido Profesor");
		System.out.println("Seleccione su opcion");
		System.out.println("1. Ingresar notas");
		System.out.println("2. Cobrar pago");
        System.out.println("3. Historial de pagos");
	}

}