package eventosens

class Sector {

	String nombre

	static hasMany = [equipos:Equipo]	

    static constraints = {
    	nombre()
    	equipos()
    }

    String toString() {
		"${this.nombre}"
	}

}
