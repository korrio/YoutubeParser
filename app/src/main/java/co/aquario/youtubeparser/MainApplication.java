package co.aquario.youtubeparser;

import android.app.Application;

import com.squareup.okhttp.OkHttpClient;

/**
 * Created by Mac on 9/29/15.
 */
public class MainApplication extends Application {

    private static OkHttpClient sHttpClient;

    public static OkHttpClient getHttpClient() {
        if (sHttpClient == null) {
            sHttpClient = new OkHttpClient();

            //int cacheSize = 10 * 1024 * 1024;
            //File cacheLocation = new File(PrefUtils.get(PopcornApplication.getAppContext(), Prefs.STORAGE_LOCATION, StorageUtils.getIdealCacheDirectory(PopcornApplication.getAppContext()).toString()));
            //cacheLocation.mkdirs();
//            com.squareup.okhttp.Cache cache = null;
//            try {
//                cache = new com.squareup.okhttp.Cache(cacheLocation, cacheSize);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
            //sHttpClient.setCache(cache);
           // sHttpClient.networkInterceptors().add(new StethoInterceptor());
        }
        return sHttpClient;
    }

}
