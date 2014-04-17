/**
 *
 */
package hr.zika.schess.model

/**
 * @author Zika
 *
 */
class Player(val name: String, val color: Color)

object Player {
	def apply(name: String, color: Color): Player = new Player(name, color)
}