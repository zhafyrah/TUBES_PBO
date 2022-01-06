package com.cheese_menu.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.cheese_menu.game.SonicGame;

public class SonicLauncher {
    public static void main (String[] args)
    {
        SonicGame myProgram = new SonicGame();
        LwjglApplication launcher = new LwjglApplication(myProgram );
    }
}
