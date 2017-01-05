
package app.lib.plugin.sdk;

import android.content.res.AssetManager;
import android.content.res.Resources;

import dalvik.system.DexClassLoader;

/**
 * Created by chenhao on 16/12/24.
 */

public class PluginLoadedInfo {

    private String mPackagePath;

    // public PackageRawInfo packageRawInfo;
    private DexClassLoader mClassLoader;

    private AssetManager mAssetManager;

    private Resources mResources;

    private IMessageReceiver mMessageReceiver;

    public PluginLoadedInfo(String path, DexClassLoader loader, AssetManager assetManager,
            Resources resources, IMessageReceiver messageReceiver) {
        this.mPackagePath = path;
        // this.packageRawInfo = packageRawInfo;
        this.mClassLoader = loader;
        this.mAssetManager = assetManager;
        this.mResources = resources;
        this.mMessageReceiver = messageReceiver;
    }

    public synchronized String getPackagePath() {
        return mPackagePath;
    }

    public synchronized DexClassLoader getClassLoader() {
        return mClassLoader;
    }

    public synchronized AssetManager getAssetManager() {
        return mAssetManager;
    }

    public synchronized Resources getResources() {
        return mResources;
    }

    public synchronized IMessageReceiver getMessageReceiver() {
        return mMessageReceiver;
    }

}
