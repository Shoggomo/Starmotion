package com.starproductions.starmotion.starmotion.GameObjects;

interface EnemyShip {
    void calcShootingInterval();

    void onDeath();

    void updateSpeed();

    void updateShooting();
}
