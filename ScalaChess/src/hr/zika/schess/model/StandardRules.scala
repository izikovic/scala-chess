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

	val moveUp: Movement = move(_.up)(_: Board)(_: Square, _: Int)

	val moveDown: Movement = move(_.down)(_: Board)(_: Square, _: Int)

	val moveLeft: Movement = move(_.left)(_: Board)(_: Square, _: Int)

	val moveRight: Movement = move(_.right)(_: Board)(_: Square, _: Int)

	val moveUpRight: Movement = move(_.up.right)(_: Board)(_: Square, _: Int)

	val moveDownRight: Movement = move(_.down.right)(_: Board)(_: Square, _: Int)

	val moveUpLeft: Movement = move(_.up.left)(_: Board)(_: Square, _: Int)

	val moveDownLeft: Movement = move(_.down.right)(_: Board)(_: Square, _: Int)

	def move(direction: Square => Square)(board: Board)(start: Square, maxMoves: Int = 8): List[Square] = {
		if (maxMoves == 0 || !(board squareExists start)) Nil
		else if (board isPieceAt start) start :: Nil
		else start :: move(direction)(board)(direction(start), maxMoves - 1)
	}
	
	
	
	class WhiteRook extends Piece(White) {
		def move: Movement = moveUp
	} 
	

}

