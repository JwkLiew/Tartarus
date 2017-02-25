package com.kelvin.tartarus;

//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.andengine.engine.Engine;
import org.andengine.engine.LimitedFPSEngine;
import org.andengine.engine.camera.Camera;
import org.andengine.engine.options.EngineOptions;
import org.andengine.engine.options.ScreenOrientation;
import org.andengine.engine.options.WakeLockOptions;
import org.andengine.engine.options.resolutionpolicy.FillResolutionPolicy;
import org.andengine.engine.options.resolutionpolicy.IResolutionPolicy;
import org.andengine.entity.scene.Scene;
import org.andengine.ui.activity.BaseGameActivity;
import org.andengine.util.debug.Debug;

import java.io.IOException;

public class MainActivity extends BaseGameActivity {

        public void onCreateResources(OnCreateResourcesCallback pOnCreateResourcesCallback) throws IOException
        {
            pOnCreateResourcesCallback.onCreateResourcesFinished();
        }
        public void onCreateScene(OnCreateSceneCallback pOnCreateSceneCallback) throws IOException
        {

        }
        public Engine onCreateEngine(EngineOptions pEngineOptions)
        {
            return new LimitedFPSEngine(pEngineOptions, 60);
        }
        public EngineOptions onCreateEngineOptions()
        {
            Camera camera = new Camera(0, 0, 480, 800);
            IResolutionPolicy resolutionPolicy = new FillResolutionPolicy();
            EngineOptions engineOptions = new EngineOptions(true, ScreenOrientation.PORTRAIT_FIXED, resolutionPolicy, camera);
            engineOptions.getAudioOptions().setNeedsMusic(true).setNeedsSound(true)
            ;
            engineOptions.setWakeLockOptions(WakeLockOptions.SCREEN_ON);
            Debug.i("Engine configured");
            return engineOptions;
        }
        public void onPopulateScene(Scene pScene, OnPopulateSceneCallback pOnPopulateSceneCallback) throws IOException
        {

        }
}
