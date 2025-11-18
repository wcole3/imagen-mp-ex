package com.example;

import org.eclipse.imagen.ImageN;

public class Main {
    static void main() {
        // rename module-info.java to module-info.unjava to observe successful ImageN init
        IO.println("Example ImageN initialization issue");
        IO.println(ImageN.getBuildVersion());
    }
}
