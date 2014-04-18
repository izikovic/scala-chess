/**
 *
 */
package hr.zika.schess.model

/**
 * @author Zika
 *
 */
trait Role
case object King extends Role
case object Rook extends Role
case object Bishop extends Role
case object Queen extends Role
case object Knight extends Role
case object Pawn extends Role

abstract class Piece(val color: Color) {
	def isOppositeTo(piece: Piece) = piece match { case Piece(c) => if (c != color) true else false }
	def move: Movement
}

object Piece {
	def unapply(p: Piece): Option[Color] = Some(p.color)
}
