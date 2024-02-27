import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Login {

	HashMap<String, String> usuarios;
	
	/*public Login() {
		usuarios = new HashMap<String, String>();
		usuarios.put("cor221071@uvg.edu.gt", "a");
        usuarios.put("doc@uvg.edu.gt", "b");
        usuarios.put("einstein_adm@uvg.edu.gt", "c");
        usuarios.put("newton_aud@uvg.edu.gt", "d" );
	}*/

    public Login() {
        usuarios = new HashMap<>();
        cargarUsuariosDesdeArchivo("docentes.txt");
        cargarUsuariosDesdeArchivo("estudiantes.txt");
		cargarUsuariosDesdeArchivo("AdminAuditor.txt");
    }

    private void cargarUsuariosDesdeArchivo(String archivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                String nombreUsuario = partes[0].trim();
                String contraseña = partes[1].trim();
                usuarios.put(nombreUsuario, contraseña);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean Acceso(String usuario, String contraseña) {
        String wardContraseña = usuarios.get(usuario);
        return wardContraseña != null && wardContraseña.equals(contraseña);
    }
	
	/*public boolean Acceso(String usuario, String contraseña) {
		String wardContraseña = usuarios.get(usuario);
		if (wardContraseña != null) {
			if (wardContraseña.equals(contraseña)) {
				return true;
			} else {
				return false;
			}
			
		} else {
			return false;
		}
	}*/
}
