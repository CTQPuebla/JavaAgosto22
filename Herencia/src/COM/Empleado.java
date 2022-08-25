package COM;

public class Empleado extends Persona {
	
	
	int idEmpleado;
	String nss;
	double salario;
	
	
	
	
	public Empleado() {
		
		
	}


	public Empleado(String nombre, int edad, String sexo, String nacionalidad, int idEmpleado, String nss,
			double salario) {
		super(nombre, edad, sexo, nacionalidad);
		this.idEmpleado = idEmpleado;
		this.nss = nss;
		this.salario = salario;
	}


	public int getIdEmpleado() {
		return idEmpleado;
	}


	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}


	public String getNss() {
		return nss;
	}


	public void setNss(String nss) {
		this.nss = nss;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


	@Override
	public String toString() {
		return "Empleado [idEmpleado=" + idEmpleado + ", nss=" + nss + ", salario=" + salario + "]";
	}
	
	public  void trabajar(String herramienta) {
		System.out.println("Trabajando con herramienta:"+herramienta);
		
	}

	
	
}
