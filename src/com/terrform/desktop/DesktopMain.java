package com.terrform.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.terraform.main.Terraform;

public class DesktopMain {
	public static void main(String[] args) {
		new LwjglApplication(new Terraform(), "Terraform", 480, 320, false);
	}

}
