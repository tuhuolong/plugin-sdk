
package app.lib.plugin.sdk;

import android.content.Context;
import android.os.Bundle;

/**
 * Created by chenhao on 16/12/24.
 */

public interface IMessageReceiver {

    /**
     * ApiLevel:1
     */
    public static final int MSG_LAUNCH = 1;

    /**
     * 所有插件必须实现该接口 ApiLevel:1
     */
    public boolean handleMessage(Context context, PluginLoadedInfo xmPluginPackage, int msgType,
            Bundle param);
}
