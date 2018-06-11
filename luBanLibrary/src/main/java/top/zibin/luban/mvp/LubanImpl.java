package top.zibin.luban.mvp;

import android.content.Context;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import top.zibin.luban.Luban;
import top.zibin.luban.OnCompressListener;

/**
 * <p>describe：
 * <p>    note：
 * <p> @author：zwp on 2018/3/16 0016 mail：1101558280@qq.com web: http://www.zwping.win </p>
 */
public class LubanImpl implements ILuban {

    private static LubanImpl model;

    private LubanImpl() {
    }

    public static LubanImpl getInstance() {
        if (model == null) {
            model = new LubanImpl();
        }
        return model;
    }

    @Override
    public void compress(Context context, final List<String> list, final OnLubansCompressListener listener) {
        final List<String> data = new ArrayList<>();
        Luban.with(context)
                .load(list)
                .setCompressListener(new OnCompressListener() {
                    @Override
                    public void onStart() {

                    }

                    @Override
                    public void onSuccess(File file) {
                        data.add(file.getAbsolutePath());
                        if (list.size() == data.size()) {
                            listener.onCompressSuccess(data);
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        e.printStackTrace();
                        listener.onCompressError();
                    }
                }).launch();
    }

    @Override
    public void compress(Context context, String path, final OnLubanCompressListener listener) {
        Luban.with(context).load(path).setCompressListener(new OnCompressListener() {
            @Override
            public void onStart() {

            }

            @Override
            public void onSuccess(File file) {
                listener.onCompressSuccess(file.getPath());
            }

            @Override
            public void onError(Throwable e) {
                e.printStackTrace();
                listener.onCompressError();
            }
        }).launch();
    }


    /*** 批量压缩 ***/
    public interface OnLubansCompressListener {
        void onCompressSuccess(List<String> path);

        void onCompressError();
    }

    /*** 单个压缩 ***/
    public interface OnLubanCompressListener {
        void onCompressSuccess(String path);

        void onCompressError();
    }
}
