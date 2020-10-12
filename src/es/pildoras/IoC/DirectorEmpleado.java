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
	
	public void metodoInicial() { // Método init. Ejecutar tareas antes de que el bean esté disponible
		System.out.println("Dentro del método init. Aquí irían las tareas a ejecutar" + ". Antes de que el bean esté listo");
	}
	
	public void metodoFinal() { // Método destroy. Ejecutar tareas después de que el bean haya sido utilizado 
		System.out.println("Dentro del método destroy. Aquí irían las tareas a ejecutar" + ". Después de utilizar el bean");
	}
		
	private String email;
	
	private String nombreEmpresa;

	public Informes informeNuevo;
	
	public DirectorEmpleado(Informes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}
}


