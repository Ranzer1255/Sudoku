package engine;

public class Loc {

	private int x,y;
	
	public Loc(int x, int y){
		this.x = x; this.y = y;
	}
	
	
	public int getX() {return x;}
	
	public int getY() {return y;}
	
	public boolean equals(Loc l){ 
		return (this.getX()==l.getX()&&this.getY()==l.getY());
	}
}
