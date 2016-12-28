
package com.chenhao.lib.plugin.sdk;

import android.app.Application;
import android.content.Context;

/**
 * Created by chenhao on 16/12/24.
 */
public abstract class PluginApi {

    private static PluginApi sInstance = null;

    protected PluginApi() {
        sInstance = this;
    }

    public static PluginApi getInstance() {
        return sInstance;
    }

    /**
     * ApiLevel:1
     */
    public abstract int getApiLevel();

    /**
     * ApiLevel:1
     */
    public abstract Application getApplication();

    /**
     * ApiLevel:1
     */
    public abstract Context getAppContext();

}
