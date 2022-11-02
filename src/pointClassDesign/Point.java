package pointClassDesign;
/*
(1) Implemente um construtor para que seja possivel criar uma instancia de Point da seguinte forma: Point p = new Point(10, 10);
(2) Verifique questao de "data hiding" para assegurar um encapsulamento onde os fields nao sejam visiveis fora do modulo/classe Point
(3) Existe um contrato [invariante de classe] que exige que as coordenadas representadas pela classe Point sejam positivas e menores ou iguais a 400, ou seja, (x >=0 && x <= 400) && (y >=0 && y <= 400). Assegure para que a classe mantenha essa integridade ao ser manipulada por qualquer codigo cliente.
(4) Sobrescrever o metodo equals [herdado de Object] para que a classe possa ter um criterio de comparacao e ser usada tranquilamento em estrutura de dados como ArrayList.
(5) Sobrescrever o metodo toString para que retorne uma representacao em String do estado [fields x e y] do objeto Point

OBS1: Ao finalizar essa task, voces devem marcar essa tarefa como concluida e submeter a sua versao da classe Point final.
OBS2: Pode submeter um arquivo .txt ou .java com o codigo da classe ou apenas o texto da mesma [como comentario privado].
 */

public class Point {

	// TODO 2: Data hiding, encapsulamento
	private int x = 0, y = 0;

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void moveBy(int dx, int dy) {
		setX(getX() + dx);
		setY(getY() + dy);
	}

	// TODO 1: Construtor para point [Point p = new Point();]
	Point(int x, int y) {
		validaPoint(this.x, this.y);
		this.x = x;
		this.y = y;
	}
	// TODO 5: Sobrescrever o metodo toString
	@Override
	public String toString() {

		return "Valor point X: " + this.getX() + ", Valor point Y: " + this.getY();
	}
	
	//TODO 4: Sobrescrever o metodo equals
	@Override
	public boolean equals(Object obj) {
	    if (obj instanceof Point) {
	      return true;
	    }else {
	      return false;
	    }
	  }
	//TODO 3: (x >=0 && x <= 400) && (y >=0 && y <= 400)
	private boolean validaPoint(int x, int y) {
		if ((x >= 0 && x <= 400) && (y >= 0 && y <= 400)) {
			return true;
		} else {
			return false;
		}
    }

}