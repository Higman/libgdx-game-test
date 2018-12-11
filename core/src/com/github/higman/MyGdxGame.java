package com.github.higman;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MyGdxGame extends ApplicationAdapter {
    SpriteBatch sp;
    Texture tx;

    @Override
    public void create() {
        sp = new SpriteBatch();
        tx = new Texture("badlogic.jpg");
    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(1f, 0f, 0f, 1f);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        sp.begin();
        sp.draw(tx, 0f, 0f);
        sp.end();
    }

    @Override
    public void dispose() {
        sp.dispose();
        tx.dispose();
    }
}
