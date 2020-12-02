package com;

public class GeometricBodyController {
    public GeometricBody getBiggestVolume(GeometricBody[] x){
        int biggestVolumeIdx = 0;
        for(int i=1; i<x.length; i++){
            if (x[i].getVolume() > x[i-1].getVolume())
                biggestVolumeIdx = i;
        }
        return x[biggestVolumeIdx];
    }

    public GeometricBody getBiggestSurface(GeometricBody[] x){
        int getBiggestSurfaceIdx = 0;
        for(int i=1; i<x.length; i++){
            if (x[i].getSurface() > x[i-1].getSurface())
                getBiggestSurfaceIdx = i;
        }
        return x[getBiggestSurfaceIdx];
    }
}
