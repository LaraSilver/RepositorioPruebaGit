package recepcionObjDvd;


public class Alumno {
	protected String nombre = "", apellido = "";
	static int notamedia = 0;
	private static int numalumno = 0;

	
	Alumno() {// el por defecto
		this.nombre = "Noomi";
		this.apellido = "Rapace";
		numalumno++;
	}
	Alumno(String n, String a) {
		this.nombre = n;
		this.apellido = a;
		numalumno++;
	}
	Alumno(Alumno alumno) {// es el copia
		this.nombre = alumno.getnombre();
		this.apellido = alumno.getapellido();
		numalumno++;
	}
	protected String getnombre() {
		return nombre;
	}
	protected String getapellido() {
		return apellido;
	}
	protected void setnombre(String nombre) {
		this.nombre = nombre;
	}
	protected void setapellido(String apellido) {
		this.apellido = apellido;
	}
	protected int getnumalumno() {
		return numalumno;
	}
	protected static void incrementar() {
		notamedia++;
	}
	protected int resultado() {
		incrementar();
		this.incrementar();
		return notamedia;
	}
}