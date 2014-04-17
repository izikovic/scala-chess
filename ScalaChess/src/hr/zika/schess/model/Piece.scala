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

case class Piece(role: Role, color: Color) {
	def isOppositeTo(piece: Piece) = piece match { case Piece(_, c) => if (c != color) true else false }
}
