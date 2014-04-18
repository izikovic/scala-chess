/**
 *
 */
package hr.zika.schess

/**
 * @author Zika
 *
 */
package object model {
	type Movement = (Board, Square, Int) => List[Square]
}