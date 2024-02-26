import java.util.HashMap;

public class Login {

	HashMap<String, String> usuarios;
	
	public Login() {
		usuarios = new HashMap<String, String>();
		usuarios.put("cor221071@uvg.edu.gt", "a");
        usuarios.put("doc@uvg.edu.gt", "b");
        usuarios.put("einstein_adm@uvg.edu.gt", "c");
        usuarios.put("newton_aud@uvg.edu.gt", "d" );
	}
	
	public boolean Acceso(String usuario, String contraseña) {
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
	}
}
