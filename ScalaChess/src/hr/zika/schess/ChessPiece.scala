/**
 *
 */
package hr.zika.schess

/**
 * @author Zika
 *
 */
abstract class ChessPiece(val color: String)
case class King(color: String) extends ChessPiece(color)
case class Rook(color: String) extends ChessPiece(color)
case class Bishop(color: String) extends ChessPiece(color)
case class Queen(color: String) extends ChessPiece(color)
case class Knight(color: String) extends ChessPiece(color)
case class Pawn(color: String) extends ChessPiece(color)
