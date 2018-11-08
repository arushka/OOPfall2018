public class First{



	public static void main(String[] args) {
		King k = new King(0, 0);
		Rook rook = new Rook(2, 4);
		Bishop bishop = new Bishop(3, 4);
		Queen q = new Queen(3, 4);
		Knight kn = new Knight(4, 5);
		Pawn p = new Pawn(2, 5);



		if(k.isLegalMove(1,0)){
			System.out.println("ok");
		}else System.out.println("not ok");

		if(rook.isLegalMove(6, 7)){
			System.out.println("ok");
		} else System.out.println("not ok");

		if(bishop.isLegalMove(5, 5)){
			System.out.println("ok");
		} else System.out.println("not ok");

		if(q.isLegalMove(2, 5)){
			System.out.println("ok");
		} else System.out.println("not ok");

		if(kn.isLegalMove(1 , 4)){
			System.out.println("ok");
		} else System.out.println("not ok");
		
		if(p.isLegalMove(2,6)){
			System.out.println("ok");
		} else System.out.println("not ok");
	}
}