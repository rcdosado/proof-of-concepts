/**
 * 
 */
package oop;

import java.util.ArrayList;

/**
 * @author m1k3y
 *
 */
public class PokemonTrainer {
	private String name;
	private Pokedex pokedex;
	private ArrayList<PokeBall> pokeballs;
	
	
	public PokemonTrainer(String name)
	{
		this.name = name;
		this.pokeballs = new ArrayList<PokeBall>();
		this.pokeballs.add(new PokeBall());
		this.pokeballs.add(new PokeBall());
		this.pokeballs.add(new PokeBall());
		this.pokedex = new Pokedex();	
		
	}
	/**
	 * @return the pokeballs
	 */
	public ArrayList<PokeBall> getPokeballs() {
		return pokeballs;
	}
	/**
	 * @param pokeballs the pokeballs to set
	 */
	public void setPokeballs(ArrayList<PokeBall> pokeballs) {
		this.pokeballs = pokeballs;
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
	 * @return the pokedex
	 */
	public Pokedex getPokedex() {
		return pokedex;
	}
	/**
	 * @param pokedex the pokedex to set
	 */
	public void setPokedex(Pokedex pokedex) {
		this.pokedex = pokedex;
	}
	
	public void throwPokeBall(Pokemon wildPokemon){
		PokeBall ball = this.getPokeballs().get(0);
		
		if( ball.canCapture(wildPokemon)){
			this.pokedex.addPokemon(wildPokemon);
		}		
	}
	

	

}
