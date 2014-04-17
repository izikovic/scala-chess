/**
 *
 */
package hr.zika.schess.model

/**
 * @author Zika
 *
 */
class StandardRules extends Variant {
	def pieces: List[Piece] = Nil
	def numberOfPlayers = 2

	val moveUp: (Board, Square, Int) => List[Square] = move(_.up)(_: Board)(_: Square, _: Int)

	val moveDown: (Board, Square, Int) => List[Square] = move(_.down)(_: Board)(_: Square, _: Int)

	val moveLeft: (Board, Square, Int) => List[Square] = move(_.left)(_: Board)(_: Square, _: Int)

	val moveRight: (Board, Square, Int) => List[Square] = move(_.right)(_: Board)(_: Square, _: Int)

	def move(direction: Square => Square)(board: Board)(start: Square, maxMoves: Int = 8): List[Square] = {
		if (maxMoves == 0 || !(board squareExists start)) Nil
		else if (board isPieceAt start) start :: Nil
		else start :: move(direction)(board)(direction(start), maxMoves - 1)
	}

	def posibleMoves(board: Board, piece: Piece, start: Square): List[Square] = {
		piece match {
			case Piece(Rook, color) => (moveUp(board, start, 8) ::: moveDown(board, start, 8) ::: moveLeft(board, start, 8) ::: moveRight(board, start, 8)).distinct
			case _ => Nil
		}
	}
}

