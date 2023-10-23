package line;


import rasterdata.Point;
import rasterdata.RasterBI;

import java.awt.image.Raster;

public class Liner implements Line {
    public static Liner createLiner() {
        return new Liner();
    }
/**

 */
    @Override
    public RasterBI drawLine(RasterBI rasterBI, Point Z, Point K,int c) {
drawLine(rasterBI, Z, K,c);
return rasterBI;

    }
}