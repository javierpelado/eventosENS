package eventosens

class Pareja {

	String nombreMarido
	String nombreMujer
	String email
	String direccion
	String ciudad
	String provincia
	Integer numeroDeHijos

	static belongsTo = [equipo:Equipo]
	static hasMany = [registros:Registro]

	static constraints = {
      	equipo()
		nombreMarido(maxSize:50,blank:false)
		nombreMujer(maxSize:50,blank:false)
      	direccion()
      	ciudad()
      	provincia()
      	email(email:true)
	}

	String toString() {
		"${this.nombreMarido} y ${this.nombreMujer}, ${this.equipo}"
	}

}
