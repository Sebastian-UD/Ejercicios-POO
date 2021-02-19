public class Dado{
	private int caras[];

	public Dado(){
		
	}

	public Dado(int caras[]){
		this.caras=caras;
	}

	public void setDado(int[] array){
		this.caras=array;
	}

	public int[] getDado(){
		return this.caras;
	}

	public int lanzamiento(){
		int num = (int)(Math.random()*6);

		return this.caras[num];
	}
}