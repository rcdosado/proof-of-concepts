/**
 * 
 */
package oop;

import java.util.ArrayList;

/**
 * @author m1k3y
 *
 */
public class Pokedex {

	private ArrayList<Pokemon> capturedPokemons;

	/**
	 * @return the capturedPokemons
	 */
	public ArrayList<Pokemon> getCapturedPokemons() {
		return capturedPokemons;
	}
	public Pokemon getPokemonByName(String name){
		
		ArrayList<Pokemon> pokemons = this.getCapturedPokemons();
		
		if( pokemons.contains(name)){
			int i = pokemons.indexOf(name);
			return pokemons.get(i);
		}
		return null;		
	}

	/**
	 * @return the pokemonCounts
	 */
	public int getPokemonCount() {
		return capturedPokemons.size();
	}

	
	public void addPokemon(Pokemon pokemon){
		if( pokemon == null) return;
		this.capturedPokemons.add(pokemon);
	}
	public void releasePokemon(String name){
		System.out.println("Releasing "+name);		
	}
	
	public void displayPokemons(){
		if( this.capturedPokemons.isEmpty()){
			return;
		}		
	
		this.capturedPokemons.forEach((pm)->{			
			System.out.println("Name : "+pm.getName()+ " Experience:  "+pm.getExperience()+" Damage: "+pm.getDamage());
		});		
	}	

}
