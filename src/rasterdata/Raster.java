package rasterdata;

import java.awt.*;
import java.util.Optional;

public interface Raster {
    int getWidth();


    int getHeight();


    Optional<Integer> getColor(int c, int r);


    /*void*/ boolean /*Raster*/ setColor(int color, int c, int r);

    /**
     * Sets all the pixels to hold the provided color
     * @param backgroundColor color value to be used when setting pixels
     */
    void clear(int backgroundColor);

    /**
     * Draws this raster onto the given Graphics
     * @param g Graphics to be used to drawing
     */
    void present(Graphics g);


}
