import java.util.Scanner;

public class Sistema {
	public static void main(String[] args) {
		
Usuario UsuarioLog;
		Login myLogin = new Login();
		UsuarioIns factory = new UsuarioIns();
		Scanner in = new Scanner(System.in);
		
		System.out.println("Bienvenido al sistema");
		System.out.println("Ingrese su usuario (correo electronico)");
		String usuario = in.nextLine();
		System.out.println("Ingrese su contraseña");
		String contraseña = in.nextLine();
		
		if (myLogin.Acceso(usuario, contraseña)) {
			UsuarioLog = factory.getInstance(usuario);
			UsuarioLog.printMenu();
		} else {
			System.out.println("Usuario o contraseña incorrectos");
		}
		
	}

}