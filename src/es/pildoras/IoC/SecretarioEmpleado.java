package es.pildoras.IoC;

public class SecretarioEmpleado implements Empleados {
	
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
		return "Gestionar la agenda de los jefes";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Este es el informe presentado por el Secretario: " + informeNuevo.getInforme();
	}

	private String email;
	
	private String nombreEmpresa;
	
	public Informes informeNuevo;
	
	public void setInformeNuevo(Informes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}
}

 