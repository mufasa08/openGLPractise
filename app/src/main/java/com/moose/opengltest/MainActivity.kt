package com.moose.opengltest

import android.content.Context
import android.opengl.GLSurfaceView
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        val mGLView: GLSurfaceView =MyGLSurfaceView(this);
        setContentView(mGLView);
        super.onCreate(savedInstanceState)
    }
}

internal class MyGLSurfaceView(context: Context) : GLSurfaceView(context) {

    private val mRenderer: MyGLRenderer

    init {

        // Create an OpenGL ES 2.0 context
        setEGLContextClientVersion(2)

        mRenderer = MyGLRenderer()

        // Set the Renderer for drawing on the GLSurfaceView
        setRenderer(mRenderer)
    }
}
