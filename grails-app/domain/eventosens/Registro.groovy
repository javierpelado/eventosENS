package eventosens

class Registro {

	Date dateCreated

	static belongsTo = [evento:Evento,pareja:Pareja]

	static constraints = {
		evento()
		pareja()
	} 

	String toString() {
		"${this.pareja}"
	}
}
