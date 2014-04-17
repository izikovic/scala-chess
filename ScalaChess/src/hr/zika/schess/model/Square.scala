/**
 *
 */
package hr.zika.schess.model

/**
 * @author Zika
 *
 */

trait SquareColor
case object Dark extends SquareColor
case object Light extends SquareColor

case class Square(val x: Int, val y: Int) {
	def up = Square(x + 1, y)
	def down = Square(x - 1, y)
	def left = Square(x, y - 1)
	def right = Square(x, y + 1)
}

object Square {
	implicit def symbol2Square(symbol: Symbol): Square = {
		symbol match {
			case 'A1 => Square(0, 0)
			case 'A2 => Square(0, 1)
			case 'A3 => Square(0, 2)
			case 'A4 => Square(0, 3)
			case 'A5 => Square(0, 4)
			case 'A6 => Square(0, 5)
			case 'A7 => Square(0, 6)
			case 'A8 => Square(0, 7)

			case 'B1 => Square(1, 0)
			case 'B2 => Square(1, 1)
			case 'B3 => Square(1, 2)
			case 'B4 => Square(1, 3)
			case 'B5 => Square(1, 4)
			case 'B6 => Square(1, 5)
			case 'B7 => Square(1, 6)
			case 'B8 => Square(1, 7)

			case 'C1 => Square(2, 0)
			case 'C2 => Square(2, 1)
			case 'C3 => Square(2, 2)
			case 'C4 => Square(2, 3)
			case 'C5 => Square(2, 4)
			case 'C6 => Square(2, 5)
			case 'C7 => Square(2, 6)
			case 'C8 => Square(2, 7)

			case 'D1 => Square(3, 0)
			case 'D2 => Square(3, 1)
			case 'D3 => Square(3, 2)
			case 'D4 => Square(3, 3)
			case 'D5 => Square(3, 4)
			case 'D6 => Square(3, 5)
			case 'D7 => Square(3, 6)
			case 'D8 => Square(3, 7)

			case 'E1 => Square(4, 0)
			case 'E2 => Square(4, 1)
			case 'E3 => Square(4, 2)
			case 'E4 => Square(4, 3)
			case 'E5 => Square(4, 4)
			case 'E6 => Square(4, 5)
			case 'E7 => Square(4, 6)
			case 'E8 => Square(4, 7)

			case 'F1 => Square(5, 0)
			case 'F2 => Square(5, 1)
			case 'F3 => Square(5, 2)
			case 'F4 => Square(5, 3)
			case 'F5 => Square(5, 4)
			case 'F6 => Square(5, 5)
			case 'F7 => Square(5, 6)
			case 'F8 => Square(5, 7)

			case 'G1 => Square(6, 0)
			case 'G2 => Square(6, 1)
			case 'G3 => Square(6, 2)
			case 'G4 => Square(6, 3)
			case 'G5 => Square(6, 4)
			case 'G6 => Square(6, 5)
			case 'G7 => Square(6, 6)
			case 'G8 => Square(6, 7)

			case 'H1 => Square(7, 0)
			case 'H2 => Square(7, 1)
			case 'H3 => Square(7, 2)
			case 'H4 => Square(7, 3)
			case 'H5 => Square(7, 4)
			case 'H6 => Square(7, 5)
			case 'H7 => Square(7, 6)
			case 'H8 => Square(7, 7)
		}
	}
}