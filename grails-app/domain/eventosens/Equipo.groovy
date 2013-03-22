package eventosens

class Equipo {

	Integer numero
	static belongsTo = [sector:Sector]
	static hasMany = [parejas:Pareja]

    static constraints = {
    	sector()
    	numero()
    	parejas()
    }

    String toString() {
		"Equipo ${this.numero} : Sector ${this.sector}"
	}

}
