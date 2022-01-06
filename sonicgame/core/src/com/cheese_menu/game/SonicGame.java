package com.cheese_menu.game;

import com.badlogic.gdx.Game;

public class SonicGame extends Game
{
    public void create()
    {
        SonicMenu cm = new SonicMenu(this);
        setScreen( cm );

    }
}
