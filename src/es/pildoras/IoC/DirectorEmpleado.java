package es.pildoras.IoC;

public class DirectorEmpleado implements Empleados {
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestionar la plantilla de la empresa";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Este es el presentado por el Director: " + informeNuevo.getInforme();
	}
	
	public void metodoInicial() { // M�todo init. Ejecutar tareas antes de que el bean est� disponible
		System.out.println("Dentro del m�todo init. Aqu� ir�an las tareas a ejecutar" + ". Antes de que el bean est� listo");
	}
	
	public void metodoFinal() { // M�todo destroy. Ejecutar tareas despu�s de que el bean haya sido utilizado 
		System.out.println("Dentro del m�todo destroy. Aqu� ir�an las tareas a ejecutar" + ". Despu�s de utilizar el bean");
	}
		
	private String email;
	
	private String nombreEmpresa;

	public Informes informeNuevo;
	
	public DirectorEmpleado(Informes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}
}


