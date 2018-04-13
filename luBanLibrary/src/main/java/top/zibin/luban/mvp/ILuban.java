package top.zibin.luban.mvp;

import android.content.Context;

import java.util.List;

/**
 * <p>describe：
 * <p>    note：
 * <p> @author：zwp on 2018/3/16 0016 mail：1101558280@qq.com web: http://www.zwping.win </p>
 */
public interface ILuban {
    void compress(Context context, List<String> list, LubanImpl.OnLubansCompressListener listener);

    void compress(Context context, String path, LubanImpl.OnLubanCompressListener listener);
}
