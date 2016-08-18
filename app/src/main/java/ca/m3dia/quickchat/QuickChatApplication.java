package ca.m3dia.quickchat;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by umarbhutta on 2015-10-05.
 */
public class QuickChatApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.enableLocalDatastore(this);
        Parse.initialize(this, "HGQBWtk4j7lFVSOdOrSpB3b6cRk0osSuNjFJBIKI", "vVdfiAXNtZMfJNBd7TGeWaO9kglOQfPxUZ6Mh7IN");

    }
}
