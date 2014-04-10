/**
 *
 */
package hr.zika.schess

/**
 * @author Zika
 *
 */
class Square(var piece: Option[ChessPiece]) {
	def :=(p: Option[ChessPiece]) = piece = p
}
