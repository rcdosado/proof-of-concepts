/**
 * 
 */
package oop;

/**
 * @author m1k3y
 *
 */
public abstract class Pokemon {

	private String name;
	private Moves moves;
	private int experience;
	private int life;
	private int damage;
	private int speed;
	
	
	public Pokemon() {
		this.experience = 0;
		this.life = 1;
		this.damage = 1;
		this.speed = 1;
	}
	public Pokemon(int experience, int life, int damage, int speed){
		this.experience = experience;
		this.life = life;
		this.damage = damage;
		this.speed = speed;
	}
	/**
	 * @return the life
	 */
	public int getLife() {
		return life;
	}
	/**
	 * @param life the life to set
	 */
	public void setLife(int life) {
		this.life = life;
	}
	/**
	 * @return the damage
	 */
	public int getDamage() {
		return damage;
	}
	/**
	 * @param damage the damage to set
	 */
	public void setDamage(int damage) {
		this.damage = damage;
	}
	/**
	 * @return the speed
	 */
	public int getSpeed() {
		return speed;
	}
	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the moves
	 */
	public Moves getMoves() {
		return moves;
	}
	/**
	 * @param moves the moves to set
	 */
	public void setMoves(Moves moves) {
		this.moves = moves;
	}
	
	public void addMove(String move){
		this.moves.add(move);
	}
	/**
	 * @return the experience
	 */
	public int getExperience() {
		return experience;
	}
	/**
	 * @param experience the experience to set
	 */
	public void setExperience(int experience) {
		this.experience = experience;
	}
	
	public abstract void evolve();

}
