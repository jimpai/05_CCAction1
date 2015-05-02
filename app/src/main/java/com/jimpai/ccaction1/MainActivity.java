package com.jimpai.ccaction1;

import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import org.cocos2d.layers.CCScene;
import org.cocos2d.nodes.CCDirector;
import org.cocos2d.opengl.CCGLSurfaceView;


public class MainActivity extends Activity {

    private CCGLSurfaceView view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        view = new CCGLSurfaceView(this);
        CCDirector director = CCDirector.sharedDirector();

        setContentView(view);
        director.attachInView(view);
        director.setDisplayFPS(true);
        director.setAnimationInterval(1/30);
        CCScene scene = CCScene.node();
        GameLayer gamerlayer = new GameLayer();
        scene.addChild(gamerlayer);

        director.runWithScene(scene);
    }

}
