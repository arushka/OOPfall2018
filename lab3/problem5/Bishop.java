

public class Bishop extends Piece{

	public Bishop(int x, int y){
		super(x, y);
	}

	public boolean isLegalMove(int _x, int _y){
		
		if(super.isLegalMove(_x, _y) && (super.absDouble(x - _x) == super.absDouble(y - _y))) return true;
		else return false;

	}


}