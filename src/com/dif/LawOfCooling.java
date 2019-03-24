package com.dif;

class LawOfCooling {
    //to solve newton's law of cooling equations with constant temperature medium
    //formula=dT/dt=K[M(t)-T(t)] where K is a constant M is medium T is temperature of a body
    //  k is K, m is M, t is T, h is euler's method's h
    //enter your time in seconds
    static double calculator(double k, double m,
                             double t, double h, int time) {
        if (time < 0.1) return t;
        else {
            double T = h * k * (m - t);
            return calculator(k, m, t + T, h, time - (int) (h * 60));
        }
    }
}
