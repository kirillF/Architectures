package com.example.myapplication.dagger.dagger;

import com.example.myapplication.dagger.Gearbox;

/**
 * Created by k.filimonov on 21/12/2016.
 */

public class MockGearboxModule extends GearboxModule {

    @Override
    Gearbox providesGearbox() {
        return new MockGearbox();
    }
}
