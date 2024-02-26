public class Auditor extends Usuario {

	@Override
	public void printMenu() {
		System.out.println("Bienvenido");
		System.out.println("Seleccione su opcion");
		System.out.println("1. Revisar notas");
        System.out.println("2. Revisar cuotas");
        System.out.println("3. Revisar pagos");
	}
}
