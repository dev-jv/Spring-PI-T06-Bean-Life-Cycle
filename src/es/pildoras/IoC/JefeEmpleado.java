package es.pildoras.IoC;

public class JefeEmpleado implements Empleados{

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestionar las cuestiones relativas a los empleados";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe creado por el Jefe: " + informeNuevo.getInforme();
	}
	
	public Informes informeNuevo;
	
	public JefeEmpleado(Informes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}
}
