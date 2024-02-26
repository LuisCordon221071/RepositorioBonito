public class Admin extends Usuario {

	@Override
	public void printMenu() {
		System.out.println("Bienvenido");
		System.out.println("Seleccione su opcion");
		System.out.println("1. Crear curso");
        System.out.println("2. Crear docente");
        System.out.println("3. Crear estudiante");
        System.out.println("4. Asignar docente a curso");
        System.out.println("5. Asignar estudiante a curso");
        System.out.println("6. Asignar pago a docente");
		System.out.println("7. Resumen de notas");
        System.out.println("8. Resumen de pagos");
	}
}
