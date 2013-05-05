package com.terraform.map;

import com.badlogic.gdx.graphics.Texture;

public class MapTile {
	
	private Texture texture;
	
	public MapTile() {}

	public Texture getTexture() {
		return this.texture;
	}

	public void setTexture(Texture texture) {
		this.texture = texture;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((texture == null) ? 0 : texture.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MapTile other = (MapTile) obj;
		if (texture == null) {
			if (other.texture != null)
				return false;
		} else if (!texture.equals(other.texture))
			return false;
		return true;
	}
	
	

}
