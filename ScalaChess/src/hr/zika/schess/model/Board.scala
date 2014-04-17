/**
 *
 */
package hr.zika.schess.model

/**
 * @author Zika
 *
 */
class Board(private val board: Map[Square, Option[Piece]]) {
	def placePiece(square: Square, piece: Piece) = Board(board - square + (square -> Some(piece)))
	def removePiece(square: Square, piece: Piece) = Board(board - square + (square -> None))
	def isPieceAt(square: Square) = board(square) match { case Some(_) => true case None => false }
	def squareExists(square: Square) = board.keySet contains square
	def apply(square: Square): Option[Piece] = board(square)
}

object Board {
	def apply(board: Map[Square, Option[Piece]]) = new Board(board)
	def apply() = {
		val board: Map[Square, Option[Piece]] = {
			Map(
				('A1, None),
				('A2, None),
				('A3, None),
				('A4, None),
				('A5, None),
				('A6, None),
				('A7, None),
				('A8, None),

				('B1, None),
				('B2, None),
				('B3, None),
				('B4, None),
				('B5, None),
				('B6, None),
				('B7, None),
				('B8, None),

				('C1, None),
				('C2, None),
				('C3, None),
				('C4, None),
				('C5, None),
				('C6, None),
				('C7, None),
				('C8, None),

				('D1, None),
				('D2, None),
				('D3, None),
				('D4, None),
				('D5, None),
				('D6, None),
				('D7, None),
				('D8, None),

				('E1, None),
				('E2, None),
				('E3, None),
				('E4, None),
				('E5, None),
				('E6, None),
				('E7, None),
				('E8, None),

				('F1, None),
				('F2, None),
				('F3, None),
				('F4, None),
				('F5, None),
				('F6, None),
				('F7, None),
				('F8, None),

				('G1, None),
				('G2, None),
				('G3, None),
				('G4, None),
				('G5, None),
				('G6, None),
				('G7, None),
				('G8, None),

				('H1, None),
				('H2, None),
				('H3, None),
				('H4, None),
				('H5, None),
				('H6, None),
				('H7, None),
				('H8, None)
			)
		}
		new Board(board)
	}
}