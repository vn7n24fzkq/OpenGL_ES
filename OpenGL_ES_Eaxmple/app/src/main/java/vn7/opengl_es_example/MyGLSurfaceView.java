package vn7.opengl_es_example;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.view.MotionEvent;

/**
 * Created by casper on 2017/10/29.
 */

public class MyGLSurfaceView extends GLSurfaceView {

    MyRenderer mRenderer;
    public MyGLSurfaceView(Context context) {
        super(context);
        mRenderer = new MyRenderer();
        setRenderer(mRenderer);
    }
    public boolean onTouchEvent(final MotionEvent event) {
        queueEvent(new Runnable(){
            public void run() {
                mRenderer.setColor(event.getX() / getWidth(),
                        event.getY() / getHeight(), 1.0f);
            }});
        return true;
    }

}
