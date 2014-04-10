/**
 *
 */
package hr.zika.schess

/**
 * @author Zika
 *
 */
class Board {
	private val board = Array.fill(8)(Array.fill(8)(new Square(None)))
	private var player = 0
	
	def reset() = {
		player = 0
		board foreach (_ foreach (_ := None))
		
		val blackKing = new King
		val whiteKing = new King
		
		val blackQueen = new Queen
		val whiteQueen = new Queen
		
		val blackBishop1 = new Bishop
		val blackBishop2 = new Bishop
		val whiteBishop1 = new Bishop
		val whiteBishop2 = new Bishop
		
		val blackKnight1 = new Knight
		val blackKnight2 = new Knight
		val whiteKnight1 = new Knight
		val whiteKnight2 = new Knight
		
		val blackRook1 = new Rook
		val blackRook2 = new Rook
		val whiteRook1 = new Rook
		val whiteRook2 = new Rook
		
		val blackPawn1 = new Pawn
		val blackPawn2 = new Pawn
		val blackPawn3 = new Pawn
		val blackPawn4 = new Pawn
		val blackPawn5 = new Pawn
		val blackPawn6 = new Pawn
		val blackPawn7 = new Pawn
		val blackPawn8 = new Pawn
		val whitePawn1 = new Pawn
		val whitePawn2 = new Pawn
		val whitePawn3 = new Pawn
		val whitePawn4 = new Pawn
		val whitePawn5 = new Pawn
		val whitePawn6 = new Pawn
		val whitePawn7 = new Pawn
		val whitePawn8 = new Pawn
		
		
	}
}