package oop;

public class PokeBall {
	
	private Pokemon capturedPokemon;
	private int power; 
		
	/**
	 * @return the power
	 */
	public int getPower() {
		return power;
	}
	/**
	 * @param power the power to set
	 */
	public void setPower(int power) {
		this.power = power;
	}
	/**
	 * @return the capturedPokemon
	 */
	public Pokemon getCapturedPokemon() {
		return capturedPokemon;
	}
	/**
	 * @param capturedPokemon the capturedPokemon to set
	 */
	public boolean store(Pokemon capturedPokemon) {
		this.capturedPokemon = capturedPokemon;
		return true;
	}
	
	public boolean containingPokemon() {
		return capturedPokemon!=null;
	}

	public void releasePokemon(){
		this.capturedPokemon = null;
	}	
	public boolean canCapture(Pokemon pokemonToCapture) {
		return this.getPower() > pokemonToCapture.getLife();			
	}

}
