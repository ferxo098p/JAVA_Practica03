import java.util.Date;

public class Persona{
	private String Nombre;
	private String AppellidoPaterno;
	private String ApellidoMaterno;
	private Date fecha;

	public String getNombre(){
		return Nombre;
	}

	public void setNombre(String nombre){
		this.Nombre=nombre;
	}

	public String getApellidoPaterno(){
		return AppellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno){
		this.AppellidoPaterno=apellidoPaterno;
	}

	public String getApellidoMaterno(){
		return ApellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno){
		this.ApellidoMaterno=apellidoMaterno;
	}

	public Date getFecha(){
		return fecha;
	}

	public void setFecha(Date lafecha){
		this.fecha = lafecha;
	}
}
