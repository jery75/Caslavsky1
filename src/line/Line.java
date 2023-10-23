package line;

import rasterdata.Point;
import rasterdata.RasterBI;

public interface Line {
    RasterBI drawLine(RasterBI rasterBI, Point Z, Point K,int c);
}
