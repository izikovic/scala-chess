/**
 *
 */
package hr.zika.schess.model

/**
 * @author Zika
 *
 */
class GameState(val players: Vector[Player], val round: Int = 0)(implicit val variant: Variant) {
	private val taken: List[Piece] = Nil
	private val log: List[Move] = Nil
}