package eventosens

class Evento {

	String nombre
	Date fecha
	String ciudad
	String provincia

	static hasMany = [registros:Registro]

	String toString() {
		return "${this.nombre}(${fecha.format('dd/MM/yyyy')}) : ${this.ciudad}, ${this.provincia}"
	}

	static constraints = {
		nombre(maxLength:50,blank:false)
		fecha(validator: {return (it > new Date())})
      	ciudad()
      	provincia()
      	registros()
	}

}
