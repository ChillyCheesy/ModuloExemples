package com.chillycheesy.helloworld;

import com.chillycheesy.modulo.modules.Module;

/**
 * Hello World Module main class.
 *
 * @author chillycheesy, Vulcainos
 */
public class HelloWorldModule extends Module {

    /**
     * On HelloWorldModule is loaded.
     */
    @Override
    protected void onLoad() {
        info("HelloWorld Module is loaded");
    }

    /**
     * On HelloWorldModule is started.
     */
    @Override
    protected void onStart() {
        info("HelloWorld Module is started");
    }

    /**
     * On HelloWorldModule is stopped.
     */
    @Override
    protected void onStop() {
        info("HelloWorld Module is stopped");
    }
}
