package digitale_stadt.cyclecity_android;

import android.app.Application;
import android.content.Context;

/**
 * Created by 4guetsch on 01.03.2016.
 */
public class AppContextProvider extends Application{

    public static Context appContext;

    @Override
    public void onCreate(){
        super.onCreate();
        appContext= getApplicationContext();
    }


    public static Context getAppContext(){
        return appContext;
    }
}
